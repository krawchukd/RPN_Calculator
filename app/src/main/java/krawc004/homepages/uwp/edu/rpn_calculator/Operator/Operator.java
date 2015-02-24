package krawc004.homepages.uwp.edu.rpn_calculator.Operator;

import krawc004.homepages.uwp.edu.rpn_calculator.Operand;

/**
 * Created by David on 10/3/14.
 *
 * Synopsis: Operator is an abstract class that is meant to provide a template for the other operators
 *              such as +, -, *, /.
 *
 */
public abstract class Operator {

    /**
     * Evaluate: Must be overriden. Evaluates to operands and returns a new operand from the resulting
     *              evaluation.
     * @param first
     * @param second
     * @return
     */
    public abstract Operand evaluate(Operand first, Operand second);

    /**
     * toString: Each overriding class must implement and produce a string that represents the operand
     *              appropriately.
     * @return
     */
    public abstract String toString();

}
