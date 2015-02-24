package krawc004.homepages.uwp.edu.rpn_calculator.Operator;

import krawc004.homepages.uwp.edu.rpn_calculator.Operand;

/**
 * Created by David on 10/4/14.
 *
 * Synopsis: The Multiplication class provides an abstraction for the binary multiplication operator. Overides all
 *              methods within the Operator class. The methods within this class use introspection to
 *              determine the correct evaluation path.
 */
public class Multiplication extends Operator {

    public Operand evaluate(Operand first, Operand second)
    {
        if (Integer.class.isInstance(first) && Integer.class.isInstance(second))
        {
            return new Operand(first.getValue().intValue() * second.getValue().intValue());
        }
        else
        {
            return new Operand((first.getValue().doubleValue() * second.getValue().doubleValue()));
        }
    }

    /**
     *
     * @return
     */
    public String toString()
    {
        return " * ";
    }
}
