/*
 *       Copyright 2015 David Krawchuk
 *
 *       Licensed under the Apache License, Version 2.0 (the "License");
 *       you may not use this file except in compliance with the License.
 *       You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *       Unless required by applicable law or agreed to in writing, software
 *       distributed under the License is distributed on an "AS IS" BASIS,
 *       WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *       See the License for the specific language governing permissions and
 *       limitations under the License.
*/

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
