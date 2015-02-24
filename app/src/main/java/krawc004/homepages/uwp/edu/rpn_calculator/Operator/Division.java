package krawc004.homepages.uwp.edu.rpn_calculator.Operator;

import krawc004.homepages.uwp.edu.rpn_calculator.Operand;

/**
 * Created by David on 10/4/14.
 *
 * Synopsis: The Division class provides an abstraction for the binary division operator. Overides all
 *              methods within the Operator class. The methods within this class use introspection to
 *              determine the correct evaluation path.
 */
public class Division extends Operator {

    /**
     * Evaluates: Takes two Operand parameters. Using introspection determines what type of number has
     *              been passed in returns the appropriate Operand value.
     * @param first
     * @param second
     * @return
     */
    public Operand evaluate(Operand first, Operand second)
    {
        if (first.getValue().doubleValue() != 0.0d)
            return new Operand((first.getValue().doubleValue() / second.getValue().doubleValue()));
        else
            return new Operand(0.0d);
    }

    public String toString()
    {
        return " / ";
    }
}
