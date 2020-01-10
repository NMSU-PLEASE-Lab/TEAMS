package teams;

import java.io.IOException;
import java.io.InputStream;
import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.lang.instrument.Instrumentation;
import java.security.ProtectionDomain;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.analysis.AnalyzerException;

public class LoaderAgent implements ClassFileTransformer {
	private static LoaderAgent AGENT = null;
	public static Aspect aspect = new Aspect();
	static ClassWriter cw;

	static long start, end;

	public static boolean isClassLoaded(final String className,
			ClassLoader loader) {
		if (AGENT == null) {
			throw new IllegalStateException("Agent not initialized");
		}
		if (loader == null || className == null) {
			throw new IllegalArgumentException();
		}
		while (loader != null) {
			if (AGENT.isLoaded(className, loader)) {
				return true;
			}
			loader = loader.getParent();
		}
		return false;
	}

	// public static AspectLanguageHandler aspectLoader = new
	// AspectLanguageHandler();
	/** Agent "main" equivalent */
	public static void premain(final String agentArguments,
			final Instrumentation instrumentation) {
		start = System.currentTimeMillis();
		// System.out.println("The path of the loaded aspect file: "+
		// agentArguments);
		aspect.parseGrammar(agentArguments);// .readAspect("extension/extractedAspects.aop");
		AGENT = new LoaderAgent();
		for (final Class<?> clazz : instrumentation.getAllLoadedClasses()) {
			AGENT.add(clazz);
		}
		instrumentation.addTransformer(AGENT);
		System.out
				.println("TEAMS started to monitor and anlysis the application...");
	}

	private final Map<ClassLoader, Set<String>> classMap = new WeakHashMap<ClassLoader, Set<String>>();
	private final AdviceEmbedder embedder = AdviceEmbedder.getInstance();

	private void add(final Class<?> clazz) {
		add(clazz.getClassLoader(), clazz.getName());
	}

	private void add(final ClassLoader loader, final String className) {
		synchronized (classMap) {
			// System.out.println("loaded: " + className);
			Set<String> set = classMap.get(loader);
			if (set == null) {
				set = new HashSet<String>();
				classMap.put(loader, set);
			}
			set.add(className);
		}
	}

	private boolean isLoaded(final String className, final ClassLoader loader) {
		synchronized (classMap) {
			final Set<String> set = classMap.get(loader);
			if (set == null) {
				return false;
			}
			return set.contains(className);
		}
	}

	@Override
	public byte[] transform(final ClassLoader loader, final String className,
			final Class<?> classBeingRedefined,
			final ProtectionDomain protectionDomain,
			final byte[] classfileBuffer) throws IllegalClassFormatException {
		add(loader, className);
		// System.out.println("Loaded:" + className);
		final int numbeerOfPCE = aspect.getPointcut().size();
		// System.out.println("Aspect Size:" + numbeerOfPCE);
		boolean flag = false;
		final ClassNode classNode = new ClassNode();
		ClassReader cr = null;
		final InputStream in = LoaderAgent.class.getResourceAsStream("/"
				+ className + ".class");
		try {
			cr = new ClassReader(in);
		} catch (final IOException e1) {
			// TODO Auto-generated catch block
			// e1.printStackTrace();
		}
		cr.accept(classNode, 0);
		for (int i = 0; i < numbeerOfPCE; i++) {
			if (aspect.getPointcut().get(i).getPC().interpret(className)/*
																		 * aspect
																		 * .
																		 * checkClassScope
																		 * (
																		 * className
																		 * )
																		 */) {
				flag = true;
				// System.out.println("Class Name:" + className);
				// System.out.println(i + "  Bye 2");
				try {
					// System.out.println(className+" is sended to inject advices");
					embedder.MarkAndEmbed(classNode, aspect, i);
					// System.out.println(className+" is modified");
					// return c;
					cw = new ClassWriter(ClassWriter.COMPUTE_MAXS
							| ClassWriter.COMPUTE_FRAMES);
					classNode.accept(cw);

				} catch (final AnalyzerException e) {
					// TODO Auto-generated catch block
					// e.printStackTrace();
				} catch (final IOException e) {
					// TODO Auto-generated catch block
					// e.printStackTrace();
					System.err
							.println("Skipping  " + className + "(" + e + ")");
				}
			} else {
				continue;
			}
		}
		if (flag) {

			return cw.toByteArray();
		} else {
			return classfileBuffer;
		}
	}
}
