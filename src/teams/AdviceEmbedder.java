package teams;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.analysis.AnalyzerException;

import extension.AdviceExecutionModelFactory;

public class AdviceEmbedder extends ClassLoader {
	// static ClassWriter cw;
	/*
	 * Singleton pattern
	 */
	private static AdviceEmbedder instance = new AdviceEmbedder();

	static int k = 0, m = 0;

	public static AdviceEmbedder getInstance() {
		return instance;
	}

	private AdviceEmbedder() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Class<?> loadClass( String name,  boolean resolve) {
		Class<?> clas;// = null;
		// get the class from VM if already exist.
		clas = findLoadedClass(name);
		if (resolve && (clas != null)) {
			resolveClass(clas);
		}
		// if (clas != null)
		return clas;
		// else return defineClass(name, cw.toByteArray()
		// ,0,cw.toByteArray().length);
	}

	/**
	 * @param classPath
	 * @param aspect
	 * @param pc
	 * @return byte[] for ClassWriter
	 * @throws IOException
	 * @throws AnalyzerException
	 */
	public void MarkAndEmbed( ClassNode classNode,  Aspect aspect,
			 int pc) throws IOException, AnalyzerException {
		// System.out.println(aspect.getAdvice().elementAt(0).getName());
		// System.out.println("Hi");
		/*
		 * InputStream in = AdviceEmbedder.class.getResourceAsStream("/" +
		 * classPath + ".class"); ClassNode classNode = new ClassNode();
		 * ClassReader cr = new ClassReader(in); cr.accept(classNode, 0);
		 */
		//System.out.println(classNode.name);
		// Let's move through all the methods
		 List<MethodNode> methods = classNode.methods;
		// System.out.println(methods.size());
		MethodNode methodNode;
		 Set<JoinPointShadow> shadows = new HashSet<JoinPointShadow>();// aspect.getPointCutExpr().elementAt(0).getPC().interpret(classNode);
		for (int j = 0; j < methods.size(); j++) {
			methodNode = methods.get(j);
			// System.out.println(methodNode.name);
			if (aspect.getPointcut().get(pc).getPC()
					.interpretWithincode(methodNode.name)) {
				shadows.addAll(aspect
						.getPointcut()
						.elementAt(pc)
						.getPC()
						.interpret(methodNode, aspect.getPointcut().get(pc), pc));
				// System.out.println("H"+shadows.size());
			}
			//System.out.println(shadows.size());
		}
		TEAMSAdviceExecutionModelFactory embedderFactory = new AdviceExecutionModelFactory();// =
																									// new
																									// PCDShadowMatcher();
		// System.out.println("PointCut   "+
		// aspect.getPointcut().get(pc).getName());
		 int numberOfAdvice = aspect.getAdvice().size();
		// System.out.println("# Advice  " + numberOfAdvice);
		// Vector<String> advices =
		// aspect.getAdvice().get(0).adviceInterprete();
		for (int i = 0; i < numberOfAdvice; i++) {
			boolean flag = false;
			 Vector<Argument> advicePointcutList = aspect.getAdvice()
					.get(i).getPointcutList();
			// System.out.println("Advice:" + advicePointcutList.size());
			// System.out.println("Advice  " +
			// aspect.getAdvice().elementAt(i).getName());
			for (int j = 0; j < advicePointcutList.size(); j++) {
				// System.out.println("Advice " + i + " , " + j + "  " +
				// pointcutList.get(j).getExpression());
				if (advicePointcutList.get(j).getExpression()
						.equals(aspect.getPointcut().get(pc).getName())) {
					/*
					 * System.out.println("** " +
					 * aspect.getPointcut().get(pc).getName() +
					 * advicePointcutList.get(j).getExpression());
					 */
					 AdviceExecutionModel embedder = embedderFactory
							.createEmbedder(aspect.getAdvice().get(i)
									.getAdviceExecutionModel()
									.adviceInterprete().get(0));
					embedder.embed(classNode, shadows, aspect.getPointcut()
							.get(pc).getName(), aspect.getName(), pc);
					flag = true;
					// break;
				}
			}
			if (flag) {
				break;
			}
		}
		//System.out.println("bye");
		/*
		 * cw = new ClassWriter(ClassWriter.COMPUTE_MAXS |
		 * ClassWriter.COMPUTE_FRAMES); classNode.accept(cw); return
		 * cw.toByteArray();
		 */

	}
}