package com.stijnjanssens.s4conversioninchestometers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private Button buttonConvert;
    private EditText editTextInches;
    private TextView textViewResult;
    private String inches;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();
        setupButtonClickListener();
    }

    private void findViews() {
        buttonConvert = findViewById(R.id.button_convert);
        editTextInches = findViewById(R.id.edit_text_inches);
        textViewResult = findViewById(R.id.textview_result);

    }

    private void setupButtonClickListener() {
        buttonConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inches = editTextInches.getText().toString();
                if (inches.isEmpty())
                    Toast.makeText(MainActivity.this, "please input the number of inches", Toast.LENGTH_LONG).show();
                else textViewResult.setText(inches + " inches = " + convertInches() + " meters");
            }
        });
    }

    private String convertInches() {
        DecimalFormat myFormat = new DecimalFormat("0.00");
        return myFormat.format(Double.parseDouble(editTextInches.getText().toString()) * 0.0254);
    }


}