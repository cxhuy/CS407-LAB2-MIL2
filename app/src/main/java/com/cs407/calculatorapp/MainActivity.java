package com.cs407.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add(View view) {
        EditText editTextNumber = (EditText) findViewById(R.id.editTextNumber);
        EditText editTextNumber2 = (EditText) findViewById(R.id.editTextNumber2);
        Float number = Float.parseFloat(editTextNumber.getText().toString());
        Float number2 = Float.parseFloat(editTextNumber2.getText().toString());
        goToActivity(String.valueOf(number + number2));
    }

    public void subtract(View view) {
        EditText editTextNumber = (EditText) findViewById(R.id.editTextNumber);
        EditText editTextNumber2 = (EditText) findViewById(R.id.editTextNumber2);
        Float number = Float.parseFloat(editTextNumber.getText().toString());
        Float number2 = Float.parseFloat(editTextNumber2.getText().toString());
        goToActivity(String.valueOf(number - number2));
    }

    public void multiply(View view) {
        EditText editTextNumber = (EditText) findViewById(R.id.editTextNumber);
        EditText editTextNumber2 = (EditText) findViewById(R.id.editTextNumber2);
        Float number = Float.parseFloat(editTextNumber.getText().toString());
        Float number2 = Float.parseFloat(editTextNumber2.getText().toString());
        goToActivity(String.valueOf(number * number2));
    }

    public void divide(View view) {
        EditText editTextNumber = (EditText) findViewById(R.id.editTextNumber);
        EditText editTextNumber2 = (EditText) findViewById(R.id.editTextNumber2);
        Float number = Float.parseFloat(editTextNumber.getText().toString());
        Float number2 = Float.parseFloat(editTextNumber2.getText().toString());
        if (number2 == 0) {
            goToActivity("Can't divide by 0");
        } else {
            goToActivity(String.valueOf(number / number2));
        }
    }

    public void goToActivity(String s) {
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("message", s);
        startActivity(intent);
    }
}