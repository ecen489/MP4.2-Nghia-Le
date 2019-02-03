package com.example.calcapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    float firstValue, secondValue;
    boolean add = false;
    boolean mult = false;
    boolean divide = false;
    boolean subtract = false;
    Calculator calculator = new Calculator();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickOne(View view) {
        TextView textview = (TextView) findViewById(R.id.text);
        textview.setText(textview.getText() + "1");
    }

    public void clickTwo(View view) {
        TextView textview = (TextView) findViewById(R.id.text);
        textview.setText(textview.getText() + "2");
    }

    public void clickThree(View view) {
        TextView textview = (TextView) findViewById(R.id.text);
        textview.setText(textview.getText() + "3");
    }

    public void clickFour(View view) {
        TextView textview = (TextView) findViewById(R.id.text);
        textview.setText(textview.getText() + "4");
    }

    public void clickFive(View view) {
        TextView textview = (TextView) findViewById(R.id.text);
        textview.setText(textview.getText() + "5");
    }

    public void clickSix(View view) {
        TextView textview = (TextView) findViewById(R.id.text);
        textview.setText(textview.getText() + "6");
    }

    public void clickSeven(View view) {
        TextView textview = (TextView) findViewById(R.id.text);
        textview.setText(textview.getText() + "7");
    }

    public void clickEight(View view) {
        TextView textview = (TextView) findViewById(R.id.text);
        textview.setText(textview.getText() + "8");
    }

    public void clickNine(View view) {
        TextView textview = (TextView) findViewById(R.id.text);
        textview.setText(textview.getText() + "9");
    }

    public void clickZero(View view) {
        TextView textview = (TextView) findViewById(R.id.text);
        textview.setText(textview.getText() + "0");
    }

    public void clickDot(View view) {
        TextView textview = (TextView) findViewById(R.id.text);
        // check to see if dot operator is already in text box
        if(!(textview.getText().toString().contains("."))){
            textview.setText(textview.getText() + ".");
        }
    }

    public void clickClear(View view) {
        TextView textview = (TextView) findViewById(R.id.text);
        // clear everything
        textview.setText("");
        add = false;
        subtract = false;
        mult = false;
        divide = false;
    }

    public void clickMult(View view) {
        TextView textview = (TextView) findViewById(R.id.text);

        String str = "";
        if(textview.getText().toString().equals(str)){
            firstValue = 0;
        }
        else{
            firstValue = Float.parseFloat(textview.getText().toString());
        }
        textview.setText("");
        mult = true;
    }

    public void clickDivide(View view) {
        TextView textview = (TextView) findViewById(R.id.text);

        String str = "";
        if(textview.getText().toString().equals(str)){
            firstValue = 0;
        }
        else{
            firstValue = Float.parseFloat(textview.getText().toString());
        }
        textview.setText("");
        divide = true;
    }

    public void clickPlus(View view) {
        TextView textview = (TextView) findViewById(R.id.text);

        String str = "";
        if(textview.getText().toString().equals(str)){
            firstValue = 0;
        }
        else{
            firstValue = Float.parseFloat(textview.getText().toString());
        }
        textview.setText("");
        add = true;
    }

    public void clickMinus(View view) {
        TextView textview = (TextView) findViewById(R.id.text);

        String str = "";
        if(textview.getText().toString().equals(str)){
            firstValue = 0;
        }
        else{
            firstValue = Float.parseFloat(textview.getText().toString());
        }
        textview.setText("");
        subtract = true;
    }

    public void clickEqual(View view) {
        TextView textview = (TextView) findViewById(R.id.text);
        secondValue = Float.parseFloat(textview.getText() + "");

        if (add == true) {
            textview.setText(calculator.addition(firstValue, secondValue) + "");
            add = false;
        }

        if (subtract == true) {
            textview.setText(calculator.subtraction(firstValue, secondValue) + "");
            subtract = false;
        }

        if (mult == true) {
            textview.setText(calculator.multiplication(firstValue, secondValue) + "");
            mult = false;
        }

        if (divide == true) {
            textview.setText(calculator.division(firstValue, secondValue) + "");
            divide = false;
        }
    }
}
