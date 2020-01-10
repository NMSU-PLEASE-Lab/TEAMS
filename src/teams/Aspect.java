package teams;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;

public class Aspect {
	private Vector<AdviceExpression> advice = new Vector<AdviceExpression>();
	private String name;
	private Vector<PointcutExpression> pointcut = new Vector<PointcutExpression>();

	public void addAdvice(final AdviceExpression e) {
		advice.addElement(e);
	}

	/**
	 * add an element to pointCutExpr vector
	 */
	public void addPointcut(final PointcutExpression e) {
		pointcut.addElement(e);
	}

	public boolean checkClassScope(final String className) {
		/*
		 * Congiguration for execution of xalan
		 */
		/*
		 * if (className.startsWith("org/apache/xalan"))
		 */
		/*
		 * configuration for h2 execution
		 */
		/*
		 * if (className.startsWith("org/h2") && !
		 * className.startsWith("org/h2/engine/DbObject") &&
		 * !className.startsWith("org/h2/expression/FunctionCall") )
		 */
		/*
		 * configuration for h2 calls
		 */
		/*
		 * if (className.startsWith("org/h2") &&
		 * !className.startsWith("org/h2/expression/FunctionCall") &&
		 * !className.startsWith("org/server/web/DbStarter") &&
		 * !className.startsWith("org/h2/message/TraceWriterAdapter") &&
		 * !className.startsWith("org/h2/server/web/WebServlet") )
		 */

		/*
		 * The configurantion for call exp of xalan benchmark
		 * 
		 * if (className.startsWith("org/")&& !
		 * className.contains("org/objectweb/")&&
		 * !className.startsWith("org/dacapo/eclipse/BenchmarkRunner")&&
		 * !className.startsWith("org/dacapo/eclipse/Activator")&&
		 * !className.startsWith("org/xml/sax/helpers/XMLReaderFactory"))
		 */

		// loadedClass.add("org.objectweb..*);
		// for (int i = 0; i< aspect.pointCut.size(); i++)
		/* if (/* aspect.checkPath(className,0) && */// className
		/*
		 * .startsWith("org/h2") && !className.startsWith("org/objectweb") &&
		 * !className.startsWith("org/antlr") &&
		 * !className.startsWith("org/h2/index/Cursor")) { return true; } else {
		 * return false; }
		 */
		return true;
	}

	public boolean checkPath(final String classPath, final int i) {
		final boolean flag = false;
		// System.out.println(classPath+"  is checking");
		// for (int i = 0; i< this.pointCut.size(); i++)
		/*
		 * for (int j = 0; j <
		 * this.getPointCutExpr().elementAt(i).getPointcutprimitive().size() ;
		 * j++){
		 * //System.out.println(this.pointCut.elementAt(i).pointcutprimitive
		 * .elementAt(j).path); if
		 * (this.getPointCutExpr().elementAt(i).getPointcutprimitive
		 * ().elementAt(j).getName().equals("within")){ if
		 * (this.getPointCutExpr(
		 * ).elementAt(i).getPointcutprimitive().elementAt(
		 * j).getSingleLogicOperation()==null){
		 * //System.out.println(this.pointCut
		 * .elementAt(i).pointcutprimitive.elementAt(j).singleLogicOperation);
		 * if (classPath.startsWith(this.getPointCutExpr().elementAt(i).
		 * getPointcutprimitive().elementAt(j).getPath())){ flag = true;
		 * //System.out.println(classPath+"  is passed"); //break; }//else
		 * System.out.println(classPath+"  is failed"); } else if
		 * (this.getPointCutExpr
		 * ().elementAt(i).getPointcutprimitive().elementAt(
		 * j).getSingleLogicOperation().contains("!")){
		 * //System.out.println(this
		 * .pointCut.elementAt(i).pointcutprimitive[j].singleLogicOperation); if
		 * (classPath.startsWith(this.getPointCutExpr().elementAt(i).
		 * getPointcutprimitive().elementAt(j).getPath())){ flag = false;
		 * //System.out.println(classPath+"  is failed"); break; } } } }
		 */

		return flag;
	}

	public boolean compareMethod(final String methodName,
			final String pcpMethodName) {
		// if(pcpMethod.suffix == true)
		// System.out.println("00000000000000");
		/*
		 * if ((methodName.equals(pcpMethod.Name)) ||( (pcpMethod.prefix ==
		 * true) && methodName.endsWith(pcpMethod.Name)) ||( (pcpMethod.suffix
		 * == true) && methodName.startsWith(pcpMethod.Name)) ||(
		 * (pcpMethod.prefix == true) && (pcpMethod.suffix == true) &&
		 * methodName.contains(pcpMethod.Name))) { j++;
		 * //System.out.println("OK  "+j);
		 * 
		 * return true; } return false;
		 */
		return methodName.matches(pcpMethodName);
	}

	public Vector<AdviceExpression> getAdvice() {
		return advice;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the pointCutExpr
	 */
	public Vector<PointcutExpression> getPointcut() {
		return pointcut;
	}

	private String loadAspectFile(final String filePath)
			throws java.io.IOException {
		final byte[] buffer = new byte[(int) new File(filePath).length()];
		BufferedInputStream f = null;
		try {
			f = new BufferedInputStream(new FileInputStream(filePath));
			f.read(buffer);
		} finally {
			if (f != null) {
				try {
					f.close();
				} catch (final IOException ignored) {
				}
			}
		}
		return new String(buffer);
	}

	public void parseGrammar(final String agentArguments) {
		Aspect value = new Aspect();
		// filePath = args[1];
		// System.out.println("MyAspect....Start");

		ANTLRInputStream in;
		try {
			in = new ANTLRInputStream(
					loadAspectFile(agentArguments/* "../src/extension/testAspect" */));
			// System.out.println("MyAspect....ANTLRStringStream... Read the aspect file as input..OK");
			final TEAMSLexer lexer = new TEAMSLexer(in);
			// System.out.println("MyAspect....Creat a lexer object of the input..OK");
			final CommonTokenStream tokens = new CommonTokenStream(lexer);
			// System.out.println("MyAspect....tokens..OK");
			final TEAMSParser parser = new TEAMSParser(tokens);
			// System.out.println("MyAspect....Parse Tokens..OK");
			value = parser.eval().value;

		} catch (final IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (final RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// this = value;
		// System.out.println(value.aspectName);
		// writeInFile( args[1]+".aop", value);
		name = value.name;
		pointcut = value.pointcut;
		advice = value.advice;
		// System.out.println("MyAspect....Check it with the rules..OK");
		System.out
				.println("Aspect's elements for monitoring the applicantion are loaded...");
		// return value;
	}

	public void setAdvice(final Vector<AdviceExpression> value) {
		advice = value;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(final String name) {
		this.name = name;
	}

	/**
	 * @param pointcut
	 */
	public void setPointcut(final Vector<PointcutExpression> pointcut) {
		this.pointcut = pointcut;
	}

	public void writeInFile(final String filename, final String value) {
		try {
			// Create file
			final FileWriter fstream = new FileWriter("bin/" + filename);
			final BufferedWriter out = new BufferedWriter(fstream);
			out.write(value);
			// Close the output stream
			out.close();
		} catch (final Exception e) {// Catch exception if any
			System.err.println("Error: " + e.getMessage());
		}
	}
}
