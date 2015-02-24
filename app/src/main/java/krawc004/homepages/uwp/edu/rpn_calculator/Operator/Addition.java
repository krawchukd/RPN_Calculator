package krawc004.homepages.uwp.edu.rpn_calculator.Operator;

import krawc004.homepages.uwp.edu.rpn_calculator.Operand;
import krawc004.homepages.uwp.edu.rpn_calculator.Operator.Operator;

/**
 * Created by David on 10/4/14.
 *
 * Synopsis: The addition class provides an abstraction for the binary addition operator. Overides all
 *              methods within the Operator class. The methods within this class use introspection to
 *              determine the correct evaluation path.
 */


public class Addition extends Operator {

    /**
     * Evaluates: Takes two Operand parameters. Using introspection determines what type of number has
     *              been passed in returns the appropriate Operand value.
     * @param first
     * @param second
     * @return
     */
    public Operand evaluate(Operand first, Operand second)
    {
        if (Integer.class.isInstance(first) && Integer.class.isInstance(second))
        {
            return new Operand(first.getValue().intValue() + second.getValue().intValue());
        }
        else
        {
            return new Operand((first.getValue().doubleValue() + second.getValue().doubleValue()));
        }
    }

    /**
     *
     * @return
     */
    public String toString()
    {
        return " + ";
    }
}