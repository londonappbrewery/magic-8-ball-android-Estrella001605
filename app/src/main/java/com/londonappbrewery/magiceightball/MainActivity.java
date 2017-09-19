package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button myButton;

        myButton = (Button) findViewById(R.id.askButton);

        final ImageView ballDisaply = (ImageView) findViewById(R.id.image_8Ball);

        final int[] ballArray = {R.drawable.ball1, R.drawable.ball2,
        R.drawable.ball3, R.drawable.ball4, R.drawable.ball5};

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random randonNumberGenerator = new Random();

                int number = randonNumberGenerator.nextInt(5);

                ballDisaply.setImageResource(ballArray[number]);

            }
        });


    }
}
