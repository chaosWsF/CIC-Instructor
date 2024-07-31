package com.example.dice_roller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Locale;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myButtonListenerMethod();
    }

    public void myButtonListenerMethod() {
        Button button = findViewById(R.id.rollButton);
        button.setOnClickListener(
                v -> {
                    Random rand = new Random();
                    int rollNum = rand.nextInt(6) + 1;  // generate a random number between 1 and 6

                    TextView rollResult = findViewById(R.id.rollResult);
                    rollResult.setText(String.format(Locale.CANADA, "%1d", rollNum));

                    ImageView img = findViewById(R.id.diceImage);
                    switch (rollNum) {
                        case 1:
                            img.setImageResource(R.drawable.dice1);
                            break;
                        case 2:
                            img.setImageResource(R.drawable.dice2);
                            break;
                        case 3:
                            img.setImageResource(R.drawable.dice3);
                            break;
                        case 4:
                            img.setImageResource(R.drawable.dice4);
                            break;
                        case 5:
                            img.setImageResource(R.drawable.dice5);
                            break;
                        case 6:
                            img.setImageResource(R.drawable.dice6);
                            break;
                    }
                }
        );
    }
}