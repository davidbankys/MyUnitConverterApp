package com.db.myunitconverterapp;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import java.io.File;
import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;


public class MainActivity extends AppCompatActivity {
EditText editText, editTextNumber2;
TextView textview1, textview2, textview3;
Spinner spinner;
Button btnConvert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);
        editText = findViewById(R.id.editText);
        editTextNumber2 = findViewById(R.id.editTextNumber2);
        editText = findViewById(R.id.editText);
        btnConvert = findViewById(R.id.btnConvert);


        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.unit_measure, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);


        Button btnConvert = (Button) findViewById(R.id.btnConvert);
        btnConvert.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String selectedValue = spinner.getSelectedItem().toString();

                if (selectedValue.equals("Kg/lbs")) {
                    int enteredValue = Integer.parseInt(editText.getText().toString());
                    double result = enteredValue* 2.2;
                    editTextNumber2.setText(String.valueOf(result));
//                   System.out.println("**********************");
//                   System.out.println("this is entered text" + enteredValue);
//                    System.out.println("//////////////////////////");
//                   System.out.println("This is result" + result);
//                    System.out.println("**********************");
                }
                if (selectedValue.equals("km/meter")) {
                    int enteredValue = Integer.parseInt(editText.getText().toString());
                    int result = enteredValue * 1000;
                    editTextNumber2.setText(String.valueOf(result));
                }

                if (selectedValue.equals("Cm/millimetre")) {
                    int enteredValue = Integer.parseInt(editText.getText().toString());
                    double result = enteredValue * 10;
                    editTextNumber2.setText(String.valueOf(result));
                }
                if (selectedValue.equals("Gram/ounce")) {
                    int enteredValue = Integer.parseInt(editText.getText().toString());
                    double result = enteredValue / 28.35;
                    editTextNumber2.setText(String.valueOf(result));
                }
                if (selectedValue.equals("Mile/yard")) {
                    int enteredValue = Integer.parseInt(editText.getText().toString());
                    double result = enteredValue * 1760;
                    editTextNumber2.setText(String.valueOf(result));
                }
                if (selectedValue.equals("Celsius/fahrenheit")) {
                    int enteredValue = Integer.parseInt(editText.getText().toString());
                    double result = enteredValue * 1.8 + 32;
                    editTextNumber2.setText(String.valueOf(result));
                }
            }
        });

    }


}
