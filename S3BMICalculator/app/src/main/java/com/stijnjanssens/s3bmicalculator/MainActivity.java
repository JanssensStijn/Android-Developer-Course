package com.stijnjanssens.s3bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioButton maleButton, femaleButton;
    private EditText ageEditText, heightEditText, weightEditText;
    private Button calculatebutton;
    private TextView resultText;
    private double bmi;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //this gives a temporary pop-up
        //Toast.makeText(this, "this is an alert pop up", Toast.LENGTH_LONG).show();

        //definieren van het tekstvak in java
        //TextView resultText = findViewById(R.id.text_view_result);
        //om de text ervan aan te passen
        //resultText.setText("changed this text");

        findViews();
        setupButtonClickListener();

    }

    private void setupButtonClickListener() {
        calculatebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculateBmi();
            }
        });
    }

    private void calculateBmi() {
        int age = Integer.parseInt(ageEditText.getText().toString());
        int height = Integer.parseInt(heightEditText.getText().toString());
        int weight = Integer.parseInt(weightEditText.getText().toString());

        float heightInMeters = (float)height/100;

        bmi = Math.round(weight / Math.pow(heightInMeters,2) *10)/10.0;

        if(age <19) displayGuidance();
        else if(age < 70)displayBmi(18.5, 25,30);
        else displayBmi(22, 28,30);
    }

    private void displayBmi(double limitUnderweight, double limitHealty, int limitOverweight)
    {
        if(bmi<limitUnderweight) resultText.setText("BMI: " + bmi + " -- You are underweight!");
        else if(bmi<limitHealty) resultText.setText("BMI: " + bmi + " -- You are a healthy weight!");
        else if(bmi<limitOverweight) resultText.setText("BMI: " + bmi + " -- You are overweight!");
        else resultText.setText("BMI: " + bmi + " -- You are severe overweight!");
    }

    private void displayGuidance(){
        if(maleButton.isChecked()) resultText.setText("BMI: " + bmi + "-- As you are under 18, please consult with your doctor for the healthy range for boys");
            else if(femaleButton.isChecked()) resultText.setText("BMI: " + bmi + "-- As you are under 18, please consult with your doctor for the healthy range for girls");
                else resultText.setText("BMI: " + bmi + "-- As you are under 18, please consult with your doctor for the healthy range");
    }

    private void findViews() {
        maleButton = findViewById(R.id.radio_button_male);
        femaleButton = findViewById(R.id.radio_button_female);
        ageEditText = findViewById(R.id.edit_text_age);
        heightEditText = findViewById(R.id.edit_text_height);
        weightEditText = findViewById(R.id.edit_text_weight);
        calculatebutton = findViewById(R.id.button_calculate);
        resultText = findViewById(R.id.text_view_result);

    }

}