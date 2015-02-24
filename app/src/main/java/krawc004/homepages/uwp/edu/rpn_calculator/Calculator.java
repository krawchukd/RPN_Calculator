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

package krawc004.homepages.uwp.edu.rpn_calculator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import krawc004.homepages.uwp.edu.rpn_calculator.Operator.Addition;
import krawc004.homepages.uwp.edu.rpn_calculator.Operator.Operator;

/**
 * Created by David on 10/3/14.
 *
 * Synopsis: The calculator class is a member of the RPN_Calculator model. This class only contains
 *              a single class method who's sole purpose is to evaluate an equation given in
 *              reverse polish notation.
 *
 */
public class Calculator {

    /**
     * solveStack: Takes an arraylist as a parameter, with the expectation that the parameter contains
     *              only objects of type Operator and Operand. No error checking occurs!
     *
     *              An itterator list is created from the passed equation stack. This iterator is then
     *              stepped through and evaluated. During the evaluation process objects are removed from
     *              and added to the bottom of the list not the top.
     *
     *              A single Operand object is returned to the calling block.
     *
     * @param equationStack
     * @return
     */
    public static Operand solveStack(ArrayList equationStack)
    {
        Object obj = null;
        ListIterator listIterator = equationStack.listIterator();

        while(equationStack.size() > 1)
        {
            obj = listIterator.next();

            if(Operator.class.isInstance(obj))
            {
                listIterator.remove();

                Operand second = (Operand)listIterator.previous();
                listIterator.remove();

                Operand first = (Operand)listIterator.previous();
                listIterator.remove();

                listIterator.add(((Operator)obj).evaluate(first, second));

            }
        }
        return (Operand)equationStack.get(0);
    }

}
