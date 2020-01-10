package teams;

import java.util.Set;
import java.util.Vector;

import org.objectweb.asm.tree.ClassNode;

public interface AdviceExecutionModel {
	public Vector<String> adviceInterprete();

	public void embed(ClassNode classNode, Set<JoinPointShadow> shadows,
			String PCEName, String aspectName, int pc);

   // JEC: todo maybe public String getName();
}
