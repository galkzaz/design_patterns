package me.study.designpatterns.behavioral.interpreter.gui.example01_eqaution_parser.interpreter.expressions;

/**
 *
 * @author Olaf Musch
 *
 * Design Patterns with Java
 *
 * An Introduction, Springer Vieweg
 *
 * chapter "Interpreter"
 */
public class PlusExpression extends NonTerminalExpression {

    /**
     * Constructor. Gets the two sub expressions
     *
     * @param left part
     * @param right part
     */
    public PlusExpression(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * Adds the two expressions
     *
     * @return the result
     */
    @Override
    public double calc() {
        return left.calc() + right.calc();
    }

    /**
     * Printout the expression
     *
     * @return text
     */
    @Override
    public String toString() {
        return "PlusExpression ( " + left + " " + right + " )";
    }
}
