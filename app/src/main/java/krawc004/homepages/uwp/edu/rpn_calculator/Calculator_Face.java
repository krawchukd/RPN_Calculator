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
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

import krawc004.homepages.uwp.edu.rpn_calculator.Operator.Addition;
import krawc004.homepages.uwp.edu.rpn_calculator.Operator.Division;
import krawc004.homepages.uwp.edu.rpn_calculator.Operator.Multiplication;
import krawc004.homepages.uwp.edu.rpn_calculator.Operator.Operator;
import krawc004.homepages.uwp.edu.rpn_calculator.Operator.Subtraction;


public class Calculator_Face extends Activity {

    private ArrayList equationStack = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator__face);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.calculator__face, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * Called when any button, considered an operand by standard mathematics, is pressed.
     * @param view
     */
    public void operandButtonPressed(View view)
    {
        // Cast the object to the appropriate type.
        Operand pressedOperand = new Operand((Button)view);
        this.equationStack.add(pressedOperand);

        // Append those values to the equation text view.
        TextView equationTextView = (TextView)findViewById(R.id.equation_editor);
        equationTextView.append(pressedOperand.toString());
    }

    /**
     * Called when any button, considered an operator by standard mathematics, is pressed.
     * @param view
     */
    public void operatorButtonPressed(View view)
    {
        TextView equationTextView = (TextView)findViewById(R.id.equation_editor);
        Operator operator;
        switch (view.getId())
        {
            case R.id.button_plus :
                operator = new Addition();
                this.equationStack.add(operator);
                equationTextView.append(operator.toString());
                break;
            case R.id.button_minus :
                operator = new Subtraction();
                this.equationStack.add(operator);
                equationTextView.append(operator.toString());
                break;
            case R.id.button_multiply :
                operator = new Multiplication();
                this.equationStack.add(operator);
                equationTextView.append(operator.toString());
                break;
            case R.id.button_divide :
                operator = new Division();
                this.equationStack.add(operator);
                equationTextView.append(operator.toString());
                break;
        }
    }

    public void solveButtonPressed(View view)
    {
        Operand operand = Calculator.solveStack(this.equationStack);

        TextView textView = (TextView)findViewById(R.id.input_output_label);
        textView.setText(operand.getValue().toString());

        TextView equationTextView = (TextView)findViewById(R.id.equation_editor);
        equationTextView.append(" = " + this.equationStack.get(0).toString());
    }

    /**
     * Called when the clear button is pressed. Clears and resets the following: the equation stack,
     *  value_output display, equation display.
     *
     * @param view
     */
    public void clearButtonPressed(View view)
    {
        // Clear the stack.
        this.equationStack.clear();

        // Clear the display.
        TextView resultTextView = (TextView)findViewById(R.id.input_output_label);
        resultTextView.setText("0");

        // Clear the equation editor.
        TextView equationTextView = (TextView)findViewById(R.id.equation_editor);
        equationTextView.setText("");
    }

}
