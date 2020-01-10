// Generated from TEAMS.g by ANTLR 4.2.2

package teams;
import java.util.Vector;
import extension.*;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TEAMSParser}.
 */
public interface TEAMSListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TEAMSParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(@NotNull TEAMSParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link TEAMSParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(@NotNull TEAMSParser.CallContext ctx);

	/**
	 * Enter a parse tree produced by {@link TEAMSParser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess(@NotNull TEAMSParser.FieldAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link TEAMSParser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess(@NotNull TEAMSParser.FieldAccessContext ctx);

	/**
	 * Enter a parse tree produced by {@link TEAMSParser#basicblock}.
	 * @param ctx the parse tree
	 */
	void enterBasicblock(@NotNull TEAMSParser.BasicblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TEAMSParser#basicblock}.
	 * @param ctx the parse tree
	 */
	void exitBasicblock(@NotNull TEAMSParser.BasicblockContext ctx);

	/**
	 * Enter a parse tree produced by {@link TEAMSParser#before}.
	 * @param ctx the parse tree
	 */
	void enterBefore(@NotNull TEAMSParser.BeforeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TEAMSParser#before}.
	 * @param ctx the parse tree
	 */
	void exitBefore(@NotNull TEAMSParser.BeforeContext ctx);

	/**
	 * Enter a parse tree produced by {@link TEAMSParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(@NotNull TEAMSParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TEAMSParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(@NotNull TEAMSParser.ArgsContext ctx);

	/**
	 * Enter a parse tree produced by {@link TEAMSParser#designator}.
	 * @param ctx the parse tree
	 */
	void enterDesignator(@NotNull TEAMSParser.DesignatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TEAMSParser#designator}.
	 * @param ctx the parse tree
	 */
	void exitDesignator(@NotNull TEAMSParser.DesignatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link TEAMSParser#pointcutExp}.
	 * @param ctx the parse tree
	 */
	void enterPointcutExp(@NotNull TEAMSParser.PointcutExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link TEAMSParser#pointcutExp}.
	 * @param ctx the parse tree
	 */
	void exitPointcutExp(@NotNull TEAMSParser.PointcutExpContext ctx);

	/**
	 * Enter a parse tree produced by {@link TEAMSParser#execution}.
	 * @param ctx the parse tree
	 */
	void enterExecution(@NotNull TEAMSParser.ExecutionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TEAMSParser#execution}.
	 * @param ctx the parse tree
	 */
	void exitExecution(@NotNull TEAMSParser.ExecutionContext ctx);

	/**
	 * Enter a parse tree produced by {@link TEAMSParser#after}.
	 * @param ctx the parse tree
	 */
	void enterAfter(@NotNull TEAMSParser.AfterContext ctx);
	/**
	 * Exit a parse tree produced by {@link TEAMSParser#after}.
	 * @param ctx the parse tree
	 */
	void exitAfter(@NotNull TEAMSParser.AfterContext ctx);

	/**
	 * Enter a parse tree produced by {@link TEAMSParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(@NotNull TEAMSParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link TEAMSParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(@NotNull TEAMSParser.ArgContext ctx);

	/**
	 * Enter a parse tree produced by {@link TEAMSParser#atomExp}.
	 * @param ctx the parse tree
	 */
	void enterAtomExp(@NotNull TEAMSParser.AtomExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link TEAMSParser#atomExp}.
	 * @param ctx the parse tree
	 */
	void exitAtomExp(@NotNull TEAMSParser.AtomExpContext ctx);

	/**
	 * Enter a parse tree produced by {@link TEAMSParser#yourDesignator}.
	 * @param ctx the parse tree
	 */
	void enterYourDesignator(@NotNull TEAMSParser.YourDesignatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TEAMSParser#yourDesignator}.
	 * @param ctx the parse tree
	 */
	void exitYourDesignator(@NotNull TEAMSParser.YourDesignatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link TEAMSParser#simpleArgument}.
	 * @param ctx the parse tree
	 */
	void enterSimpleArgument(@NotNull TEAMSParser.SimpleArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TEAMSParser#simpleArgument}.
	 * @param ctx the parse tree
	 */
	void exitSimpleArgument(@NotNull TEAMSParser.SimpleArgumentContext ctx);

	/**
	 * Enter a parse tree produced by {@link TEAMSParser#path}.
	 * @param ctx the parse tree
	 */
	void enterPath(@NotNull TEAMSParser.PathContext ctx);
	/**
	 * Exit a parse tree produced by {@link TEAMSParser#path}.
	 * @param ctx the parse tree
	 */
	void exitPath(@NotNull TEAMSParser.PathContext ctx);

	/**
	 * Enter a parse tree produced by {@link TEAMSParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(@NotNull TEAMSParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link TEAMSParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(@NotNull TEAMSParser.LoopContext ctx);

	/**
	 * Enter a parse tree produced by {@link TEAMSParser#myAspect}.
	 * @param ctx the parse tree
	 */
	void enterMyAspect(@NotNull TEAMSParser.MyAspectContext ctx);
	/**
	 * Exit a parse tree produced by {@link TEAMSParser#myAspect}.
	 * @param ctx the parse tree
	 */
	void exitMyAspect(@NotNull TEAMSParser.MyAspectContext ctx);

	/**
	 * Enter a parse tree produced by {@link TEAMSParser#adviceExp}.
	 * @param ctx the parse tree
	 */
	void enterAdviceExp(@NotNull TEAMSParser.AdviceExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link TEAMSParser#adviceExp}.
	 * @param ctx the parse tree
	 */
	void exitAdviceExp(@NotNull TEAMSParser.AdviceExpContext ctx);

	/**
	 * Enter a parse tree produced by {@link TEAMSParser#notPointcutExp}.
	 * @param ctx the parse tree
	 */
	void enterNotPointcutExp(@NotNull TEAMSParser.NotPointcutExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link TEAMSParser#notPointcutExp}.
	 * @param ctx the parse tree
	 */
	void exitNotPointcutExp(@NotNull TEAMSParser.NotPointcutExpContext ctx);

	/**
	 * Enter a parse tree produced by {@link TEAMSParser#adviceDefinition}.
	 * @param ctx the parse tree
	 */
	void enterAdviceDefinition(@NotNull TEAMSParser.AdviceDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TEAMSParser#adviceDefinition}.
	 * @param ctx the parse tree
	 */
	void exitAdviceDefinition(@NotNull TEAMSParser.AdviceDefinitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link TEAMSParser#withincode}.
	 * @param ctx the parse tree
	 */
	void enterWithincode(@NotNull TEAMSParser.WithincodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TEAMSParser#withincode}.
	 * @param ctx the parse tree
	 */
	void exitWithincode(@NotNull TEAMSParser.WithincodeContext ctx);

	/**
	 * Enter a parse tree produced by {@link TEAMSParser#pointcutDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPointcutDefinition(@NotNull TEAMSParser.PointcutDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TEAMSParser#pointcutDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPointcutDefinition(@NotNull TEAMSParser.PointcutDefinitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link TEAMSParser#eval}.
	 * @param ctx the parse tree
	 */
	void enterEval(@NotNull TEAMSParser.EvalContext ctx);
	/**
	 * Exit a parse tree produced by {@link TEAMSParser#eval}.
	 * @param ctx the parse tree
	 */
	void exitEval(@NotNull TEAMSParser.EvalContext ctx);

	/**
	 * Enter a parse tree produced by {@link TEAMSParser#aspect}.
	 * @param ctx the parse tree
	 */
	void enterAspect(@NotNull TEAMSParser.AspectContext ctx);
	/**
	 * Exit a parse tree produced by {@link TEAMSParser#aspect}.
	 * @param ctx the parse tree
	 */
	void exitAspect(@NotNull TEAMSParser.AspectContext ctx);

	/**
	 * Enter a parse tree produced by {@link TEAMSParser#pointcutExpReferences}.
	 * @param ctx the parse tree
	 */
	void enterPointcutExpReferences(@NotNull TEAMSParser.PointcutExpReferencesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TEAMSParser#pointcutExpReferences}.
	 * @param ctx the parse tree
	 */
	void exitPointcutExpReferences(@NotNull TEAMSParser.PointcutExpReferencesContext ctx);

	/**
	 * Enter a parse tree produced by {@link TEAMSParser#adviceExecutionModel}.
	 * @param ctx the parse tree
	 */
	void enterAdviceExecutionModel(@NotNull TEAMSParser.AdviceExecutionModelContext ctx);
	/**
	 * Exit a parse tree produced by {@link TEAMSParser#adviceExecutionModel}.
	 * @param ctx the parse tree
	 */
	void exitAdviceExecutionModel(@NotNull TEAMSParser.AdviceExecutionModelContext ctx);

	/**
	 * Enter a parse tree produced by {@link TEAMSParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(@NotNull TEAMSParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TEAMSParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(@NotNull TEAMSParser.PrimitiveTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link TEAMSParser#methodOrConstructorPattern}.
	 * @param ctx the parse tree
	 */
	void enterMethodOrConstructorPattern(@NotNull TEAMSParser.MethodOrConstructorPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link TEAMSParser#methodOrConstructorPattern}.
	 * @param ctx the parse tree
	 */
	void exitMethodOrConstructorPattern(@NotNull TEAMSParser.MethodOrConstructorPatternContext ctx);

	/**
	 * Enter a parse tree produced by {@link TEAMSParser#within}.
	 * @param ctx the parse tree
	 */
	void enterWithin(@NotNull TEAMSParser.WithinContext ctx);
	/**
	 * Exit a parse tree produced by {@link TEAMSParser#within}.
	 * @param ctx the parse tree
	 */
	void exitWithin(@NotNull TEAMSParser.WithinContext ctx);
}