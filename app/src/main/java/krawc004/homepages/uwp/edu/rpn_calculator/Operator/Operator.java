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
