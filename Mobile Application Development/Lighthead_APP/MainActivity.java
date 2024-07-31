package com.example.lighthead_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
//import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ConstraintLayout bgElement = findViewById(R.id.activity_main);
        bgElement.setBackgroundColor(Color.WHITE);

        buttonListenerMethod();
    }

    public void buttonListenerMethod() {
        Button button = findViewById(R.id.button);
        button.setOnClickListener(
                v -> {
                    ConstraintLayout bgElement = findViewById(R.id.activity_main);
                    int color = ((ColorDrawable) bgElement.getBackground()).getColor();

                    if (color == Color.RED) {
                        bgElement.setBackgroundColor(Color.BLUE);
                        button.setText(R.string.button_text_blue);
                    } else {
                        bgElement.setBackgroundColor(Color.RED);
                        button.setText(R.string.button_text_red);
                    }
                }
//                new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        ConstraintLayout bgElement = (ConstraintLayout) findViewById(R.id.activity_main);
//                        int color = ((ColorDrawable) bgElement.getBackground()).getColor();
//
//                        if (color == Color.RED) {
//                            bgElement.setBackgroundColor(Color.BLUE);
//                        } else {
//                            bgElement.setBackgroundColor(Color.RED);
//                        }
//                    }
//                }
        );
    }
}