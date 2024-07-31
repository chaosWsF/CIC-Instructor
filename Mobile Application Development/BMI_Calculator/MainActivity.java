package com.example.bmi_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myButtonListenerMethod();
    }

    public void myButtonListenerMethod() {
        Button button = findViewById(R.id.button);
        button.setOnClickListener(
                v -> {
                    // load inputs
                    final EditText weightText = findViewById(R.id.weightValue);
                    String weightStr = weightText.getText().toString();
                    double weight = Double.parseDouble(weightStr);

                    final EditText heightText = findViewById(R.id.heightValue);
                    String heightStr = heightText.getText().toString();
                    double height = Double.parseDouble(heightStr);

                    // BMI calculation
                    double BMI = weight / (height * height);

                    // outputs
                    final EditText BMI_Val = findViewById(R.id.BMIValue);
                    BMI_Val.setText(String.format(Locale.CANADA, "%.2f", BMI));

                    String BMI_Cat;
                    if (BMI < 15)
                        BMI_Cat = "Very Severely Underweight";
                    else if (BMI < 16)
                        BMI_Cat = "Severely Underweight";
                    else if (BMI < 18.5)
                        BMI_Cat = "Underweight";
                    else if (BMI < 25)
                        BMI_Cat = "Normal";
                    else if (BMI < 30)
                        BMI_Cat = "Overweight";
                    else if (BMI < 35)
                        BMI_Cat = "Obese Class 1 - Moderately Obese";
                    else if (BMI < 40)
                        BMI_Cat = "Obese Class 2 - Severely Obese";
                    else
                        BMI_Cat = "Obese Class 3 - Very Severely Obese";

                    final TextView BMI_Category = findViewById(R.id.BMI_category);
                    BMI_Category.setText(BMI_Cat);
                }
        );
    }
}