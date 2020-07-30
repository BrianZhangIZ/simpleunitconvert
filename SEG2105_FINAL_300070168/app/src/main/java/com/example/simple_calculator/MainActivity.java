package com.example.simple_calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, button10, buttonC, buttonConvert;

    private Spinner fromSpinner;
    private Spinner toSpinner;
    private EditText inputValue;
    private conversionLength CL;


    EditText textDisplay;
    EditText resultDisplay;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonConvert = (Button) findViewById(R.id.buttonConvert);
        textDisplay = (EditText) findViewById(R.id.edt1);
        resultDisplay = (EditText) findViewById(R.id.edt2);

        fromSpinner = (Spinner)findViewById(R.id.from_spinner);
        toSpinner = (Spinner)findViewById(R.id.to_spinner);
        inputValue = (EditText)findViewById(R.id.edt1);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textDisplay.setText(textDisplay.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textDisplay.setText(textDisplay.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textDisplay.setText(textDisplay.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textDisplay.setText(textDisplay.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textDisplay.setText(textDisplay.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textDisplay.setText(textDisplay.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textDisplay.setText(textDisplay.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textDisplay.setText(textDisplay.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textDisplay.setText(textDisplay.getText() + "9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textDisplay.setText(textDisplay.getText() + "0");
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textDisplay.setText("");
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textDisplay.setText(textDisplay.getText() + ".");
            }
        });

        buttonConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String convertFromUnit = fromSpinner.getSelectedItem().toString();
                String convertToUnit = toSpinner.getSelectedItem().toString();
                CL = new conversionLength();

                double returnedConvertedResult = CL.convert(convertFromUnit, convertToUnit, Double.parseDouble(inputValue.getText().toString()));
                resultDisplay.setText(String.valueOf(String.format("%.2f", returnedConvertedResult)));
            }
        });


    }
}