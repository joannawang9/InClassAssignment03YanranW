package com.example.android.inclassassignment03_yanranw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    long digit;
    TextView displayName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayName = findViewById(R.id.digit_text_view);}


    private void display(View view){
        Button mrButton = (Button) view;

        if (mrButton.getText().equals("7")) {
            digit = Integer.parseInt(displayName.getText().toString() + "7");
            displayName.setText(String.valueOf(digit));
        }
        else if (mrButton.getText().equals("8")) {
            digit = Integer.parseInt(displayName.getText().toString() + "8");
            displayName.setText(String.valueOf(digit));
        }
        else if (mrButton.getText().equals("9")) {
            digit = Integer.parseInt(displayName.getText().toString() + "9");
            displayName.setText(String.valueOf(digit));
        }
        else if (mrButton.getText().equals("6")) {
            digit = Integer.parseInt(displayName.getText().toString() + "6");
            displayName.setText(String.valueOf(digit));
        }
        else if (mrButton.getText().equals("5")) {
            digit = Integer.parseInt(displayName.getText().toString() + "5");
            displayName.setText(String.valueOf(digit));
        }
        else if (mrButton.getText().equals("4")) {
            digit = Integer.parseInt(displayName.getText().toString() + "4");
            displayName.setText(String.valueOf(digit));
        }
        else if (mrButton.getText().equals("3")) {
            digit = Integer.parseInt(displayName.getText().toString() + "3");
            displayName.setText(String.valueOf(digit));
        }
        else if (mrButton.getText().equals("2")) {
            digit = Integer.parseInt(displayName.getText().toString() + "2");
            displayName.setText(String.valueOf(digit));
        }
        else if (mrButton.getText().equals("1")) {
            digit = Integer.parseInt(displayName.getText().toString() + "1");
            displayName.setText(String.valueOf(digit));
        }
        else if (mrButton.getText().equals("0")) {
            digit = Integer.parseInt(displayName.getText().toString() + "0");
            displayName.setText(String.valueOf(digit));
        }
        else if (mrButton.getText().equals("C")) {
            digit = 0;
            displayName.setText(String.valueOf(digit));
        }
        else {
            String a = displayName.getText().toString();
            int n = a.length();
            digit = Integer.parseInt(a.substring(0,n-1));
            displayName.setText(String.valueOf(digit));
        }



}}

