package teams;

import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

import org.objectweb.asm.tree.MethodNode;

import extension.PCDShadowMatcherFactory;

public class Designator implements PointCutExpressionInterface {
	// public static JoinPointShadow shadow;
	private Argument args;
	private Vector<JoinPointInfoExp> joinPointInfoExp = new Vector<JoinPointInfoExp>();
	private String name;
	// private PCPrimitiveMethod pcpMethod;
	private String singleLogicOperation = null;

	public Argument getArgument() {
		// TODO Auto-generated method stub
		return args;
	}

	/**
	 * @return the jPInfo
	 */
	/*
	 * public Vector<JoinPointInfoInterface> getJPInfo() { return
	 * joinPointInfoExp; }
	 */

	/*
	 * @Override public Vector<JoinPointInfoInterface> getRequiredDataList(
	 * String joinPointName) { // TODO Auto-generated method stub //
	 * Vector<JoinPointInfoInterface> temp = new
	 * Vector<JoinPointInfoInterface>(); if
	 * (joinPointName.toLowerCase().startsWith(getName().toLowerCase())) { //
	 * System.out.println("Yohooo"+this.getName().toLowerCase()); return
	 * getJPInfo(); } else { return null; } }
	 */

	/**
	 * @return the joinPointInfoExp
	 */
	public Vector<JoinPointInfoExp> getJoinPointInfoExp() {
		return joinPointInfoExp;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the pcpMethod
	 */
	/*
	 * public PCPrimitiveMethod getPcpMethod() { return pcpMethod; }
	 */
	/**
	 * @param pcpMethod
	 *            the pcpMethod to set
	 */
	/*
	 * public void setPcpMethod(PCPrimitiveMethod pcpMethod) { this.pcpMethod =
	 * pcpMethod; }
	 */
	/**
	 * @return the singleLogicOperation
	 */
	public String getSingleLogicOperation() {
		return singleLogicOperation;
	}

	@Override
	public Set<JoinPointShadow> interpret( MethodNode methodNode,
			 PointcutExpression PCE/*
										 * Map< String , Expression > variables
										 */,  int pc) {
		// TODO Auto-generated method stub
		Set<JoinPointShadow> temp = new HashSet<JoinPointShadow>();
		// JoinPointShadow shadow = new JoinPointShadow();
		// MyPCDShadowMatcherFactory Handler = new MyPCDShadowMatcherFactory();
		 TeamsPCDShadowMatcherFactory matcherFactory = new PCDShadowMatcherFactory();// =
		// new
		// PCDShadowMatcher();
		// System.out.println(getName());
		// if (!getName().equals("within")) {
		 PCDShadowMatcher matcher = matcherFactory
				.createMatcher(getName());
		 //System.out.println(matcher.getClass());
		 temp = matcher.match(methodNode, getArgument(), joinPointInfoExp, pc);
		// }
		// Iterator<JoinPointShadow> itr = temp.iterator();
		// System.out.println("Hi " + temp.size());
		// System.out.println(methodNode.name);
		/*
		 * JoinPointShadow example1 = new JoinPointShadow();
		 * while(itr.hasNext()) { //shadow.display(); example1 = itr.next();
		 * example1.display(); }
		 */

		return temp;
	}

	@Override
	public boolean interpret( String className) {
		// TODO Auto-generated method stub
		// String temp;
		/*
		 * if(this.getName().equals("basicblock"))
		 * System.out.println(this.getJPInfo().get(0).name);
		 */
		if (getName().equals("within")) {

			// System.out.println(this.getArgument().getExpression());
			// temp = this.getArgument().getExpression();
			// System.out.println(temp);
			/*
			 * CharSequence cs = className; Pattern p = Pattern.compile(temp);
			 * Matcher m = p.matcher(className); boolean b = m.matches();
			 */
			if (className.startsWith(getArgument().getExpression())/*
																	 * && !
																	 * className
																	 * .
																	 * startsWith
																	 * (
																	 * "org/objectweb"
																	 * ) && !
																	 * className
																	 * .
																	 * startsWith
																	 * (
																	 * "org/antlr"
																	 * )&& !
																	 * className
																	 * .
																	 * startsWith
																	 * (
																	 * "org/h2/index/Cursor"
																	 * )
																	 */) {
				// System.out.println(getArgument().getExpression());
				return true;
			}
			// className.matches(this.getArgument().getExpression()))
			else {
				return false;
			}
		} else {
			return true;
		}
	}

	@Override
	public boolean interpretWithincode( String methodName) {
		// TODO Auto-generated method stub
		// System.out.println(getName());
		if (getName().equals("withincode")) {
			// System.out.println("Expression for withincode: "+
			// getArgument().getExpression());
			if (methodName.startsWith(getArgument().getExpression())) {
				// System.out.println(methodName);
				return true;
			}
			// className.matches(this.getArgument().getExpression()))
			else {
				return false;
			}
		} else {
			return true;
		}
	}

	public void setArgument( Argument arg) {
		// TODO Auto-generated method stub
		args = arg;

	}

	/**
	 * @param joinPointInfoExp
	 *            the joinPointInfoExp to set
	 */
	public void setJoinPointInfoExp(
			 Vector<JoinPointInfoExp> joinPointInfoExp) {
		this.joinPointInfoExp = joinPointInfoExp;
	}

	/**
	 * @param jPInfo
	 *            the jPInfo to set
	 */
	/*
	 * public void setJPInfo( Vector<JoinPointInfoInterface> jPInfo) {
	 * joinPointInfoExp = jPInfo; }
	 */
	/**
	 * @param name
	 *            the name to set
	 */
	public void setName( String name) {
		this.name = name;
	}

	/**
	 * @param singleLogicOperation
	 *            the singleLogicOperation to set
	 */
	public void setSingleLogicOperation( String singleLogicOperation) {
		this.singleLogicOperation = singleLogicOperation;
	}
}
