package teams;

import java.util.Vector;

import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.MethodNode;

public class JoinPointShadow {
	private Vector<Argument> argumentValue = new Vector<Argument>();
	private String className;
	private InsnList dataInsnList = new InsnList();
	private Vector<Integer> instructionEndNumber = new Vector<Integer>();
	private int instructionStartNumber;
	public MethodNode methodNode;
	private String type;

	public Vector<Argument> getArgs() {
		return argumentValue;
	}

	public String getClassName() {
		return className;
	}

	/**
	 * @return the dataInsnList
	 */
	public InsnList getDataInsnList() {
		return dataInsnList;
	}

	public Vector getInstructionEndNumber() {
		return instructionEndNumber;
	}

	public int getInstructionStartNumber() {
		return instructionStartNumber;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @return the joinPointInfo
	 */

	public void setArgs(final Vector<Argument> args) {
		argumentValue = args;
	}

	public void setClassName(final String className) {
		this.className = className;
	}

	/**
	 * @param dataInsnList
	 *            the dataInsnList to set
	 */
	public void setDataInsnList(final InsnList dataInsnList) {
		this.dataInsnList = dataInsnList;
	}

	public void setInstructionEndNumber(final Vector instructionEndtNtmber) {
		instructionEndNumber = instructionEndtNtmber;
	}

	public void setInstructionStartNumber(final int instructionStartNtmber) {
		instructionStartNumber = instructionStartNtmber;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(final String type) {
		this.type = type;
	}
}
