package extension;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.LdcInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.analysis.Analyzer;
import org.objectweb.asm.tree.analysis.AnalyzerException;
import org.objectweb.asm.tree.analysis.BasicInterpreter;
import org.objectweb.asm.tree.analysis.BasicValue;
import org.objectweb.asm.tree.analysis.Frame;
import org.objectweb.asm.tree.analysis.Value;

import teams.Argument;
import teams.JoinPointInfoExp;
import teams.JoinPointShadow;
import teams.PCDShadowMatcher;

public class LoopShadowMatcher implements PCDShadowMatcher {
	private static HashMap<String, Integer> blockSrcDest = new HashMap<String, Integer>();

	private static int check_loop = 0;

	private static int loop_number = 0;
	private static ArrayList<Integer> loopStart = new ArrayList<Integer>();
	private static ArrayList<Integer> loopStart_nodup = new ArrayList<Integer>();
	private static HashMap<String, Integer> loopTrack = new HashMap<String, Integer>();

	public static int getCyclomaticComplexity(final String owner,
			final MethodNode mn) throws AnalyzerException {

		final Analyzer analyzer = new Analyzer(new BasicInterpreter()) {
			@Override
			protected void newControlFlowEdge(final int src, final int dst) {

				final Node<BasicValue> node = (Node<BasicValue>) getFrames()[src];
				blockSrcDest.put("" + src, dst);
				// System.out.println("src\t" + src + "\tdst\t" + dst);
				if (src > dst) {
					check_loop = 1;
					// loop_number++;
					System.out.println("Loop no\t" + loop_number);
					// number =(String) loop_number;
					loopTrack.put("" + src, dst);
					System.out.println("src\t" + src + "\tdst\t" + dst);

				}

				node.successors.add((Node<BasicValue>) getFrames()[dst]);

			}

			@Override
			protected Frame newFrame(final Frame src) {
				return new Node<BasicValue>(src);
			}

			@Override
			protected Node<BasicValue> newFrame(final int nLocals,
					final int nStack) {
				return new Node<BasicValue>(nLocals, nStack);
			}

		};
		analyzer.analyze(owner, mn);
		final Frame[] frames = analyzer.getFrames();
		int edges = 0;
		int nodes = 0;
		for (final Frame frame : frames) {
			if (frame != null) {
				edges += ((Node<BasicValue>) frame).successors.size();
				nodes += 1;
			}
		}
		return edges - nodes + 2;
	}

	private String number;

	@Override
	public void makeArgumentValue(final JoinPointShadow joinPointShadow,
			final MethodNode methodNode,

			final Vector<JoinPointInfoExp> joinPointinfoExpVect) {
		/*
		 * This method is used to produce the necessary general information and
		 * argument to be sued in advice execution model to generate dynamic
		 * information. It explained with an example of its implementation in
		 * next section.
		 */

		final InsnList dataInsnList = new InsnList();
		number = Integer.toString(loop_number);
		System.out.println("Number:" + number);
		// final GeneralJoinPointInfo generalJoinPointInfo = new
		// GeneralJoinPointInfo();
		// dataInsnList.add(generalJoinPointInfo.generate(methodNode,
		// joinPointinfoExpVect));
		for (int i = 0; i < joinPointinfoExpVect.size(); i++) {
			System.out.println("Inside the for loop");
			if (joinPointinfoExpVect.get(i).getType()
					.equalsIgnoreCase(joinPointShadow.getType())) {
				// !!!!~~~~~~~~~ control is not coming here!!-usha
				System.out.println("Inside the for-if loop");
				if (joinPointinfoExpVect.get(i).getName()
						.equalsIgnoreCase("number")) {
					// ~~~~~~~~~control is not coming here - usha
					System.out.println("Inside the for-if-if loop");
					dataInsnList.add(new LdcInsnNode(number));
					continue;
				}
			}
		}
		joinPointShadow.setDataInsnList(dataInsnList);
	}

	@Override
	public Set<JoinPointShadow> match(final MethodNode methodNode,
			final Argument argument,
			final Vector<JoinPointInfoExp> joinPointInfoExpVector, final int pc) {
		// Use a set to keep the matching areas as shadow.
		final HashSet<JoinPointShadow> resultShadows = new HashSet<JoinPointShadow>();
		JoinPointShadow currentShadow;
		// matching the loop argument with the current method
		if (methodNode.name.startsWith(argument.getExpression())) {

			methodNode.instructions.iterator();
			final String className = methodNode.name;
			try {
				getCyclomaticComplexity(className, methodNode);
			} catch (final AnalyzerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Vector<Integer> ends;
			if (check_loop == 1) {
				for (final String key : loopTrack.keySet()) {
					final Integer loop_start = loopTrack.get(key);
					loopStart.add(loop_start);
				}
			}
			Collections.sort(loopStart);

			if (check_loop == 1) {
				check_loop = 0;
				for (final Integer integer : loopStart) {
					loop_number++;
					currentShadow = new JoinPointShadow();
					// Set the shadow type
					currentShadow.setType("loop");
					// Set the shadow’s method node
					currentShadow.methodNode = methodNode;
					ends = new Vector<Integer>();
					final Integer loop_start = integer + 1;
					System.out.println("Loop Track dst:::" + loop_start);
					currentShadow.setInstructionStartNumber(loop_start);
					ends.add(loop_start);
					currentShadow.setInstructionEndNumber(ends);
					resultShadows.add(currentShadow);
					if (joinPointInfoExpVector.size() > 0) {
						makeArgumentValue(currentShadow, methodNode,
								joinPointInfoExpVector);

					}
				}
			}

		}
		System.out.println("Size of result shadows\t" + resultShadows.size());
		return resultShadows;

	}

}

class Node<V extends Value> extends Frame {
	/*
	 * Defines the Node class which extends Frame, which is being called in the
	 * function getCyclomaticComplexity
	 */
	Set<Node<V>> successors = new HashSet<Node<V>>();

	public Node(final Frame src) {
		super(src);
	}

	public Node(final int nLocals, final int nStack) {
		super(nLocals, nStack);
	}
}
