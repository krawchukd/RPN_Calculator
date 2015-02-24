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


import android.app.Activity;
import android.view.View;
import android.widget.Button;

/**
 * Created by David on 10/3/14.
 *
 * Synopsis: The operand class is an abstract object that represents numerical values. Returning sensible
 *              defaults when called.
 *
 *           The Operand class is for convienience and future expantion. The class was convienient
 *              for practicing intospection and runtime binding.
 */
public class Operand {

    /**
     * Variable declarations.
     */
    private Integer intValue = null;
    private Float floatValue = null;
    private Double doubleValue = null;

    /**
     * Constuctor creates sensible default numberical values based on buttons passed from the
     *  view controller.
     * @param button
     */
    public Operand(Button button)
    {
        switch (button.getId())
        {
            case R.id.button_one:
                this.intValue = new Integer(1);
                break;
            case R.id.button_two:
                this.intValue = new Integer(2);
                break;
            case R.id.button_three:
                this.intValue = new Integer(3);
                break;
            case R.id.button_four:
                this.intValue = new Integer(4);
                break;
            case R.id.button_five:
                this.intValue = new Integer(5);
                break;
            case R.id.button_six:
                this.intValue = new Integer(6);
                break;
            case R.id.button_seven:
                this.intValue = new Integer(7);
                break;
            case R.id.button_eight:
                this.intValue = new Integer(8);
                break;
            case R.id.button_nine:
                this.intValue = new Integer(9);
                break;
        }
    }

    /**
     * Constructor.
     * @param doubleValue
     */
    public Operand(double doubleValue)
    {
        this.doubleValue = new Double(doubleValue);
    }

    /**
     * Constructor.
     * @param floatValue
     */
    public Operand(Float floatValue)
    {
        this.floatValue = new Float(floatValue);
    }

    /**
     * getValue: Returns a number sub-concrete class that was created from the constructor.
     *              Note: returned Numbers follow normal type converstion order.
     * @return
     */
    public Number getValue()
    {
        if (this.intValue != null)
            return this.intValue;
        else if (this.floatValue != null)
            return this.floatValue;
        else if (this.doubleValue != null)
            return this.doubleValue;
        else
            return null;
    }

    /**
     *
     * @return
     */
    public String toString()
    {
        return " " + getValue().toString() + " ";
    }
}
