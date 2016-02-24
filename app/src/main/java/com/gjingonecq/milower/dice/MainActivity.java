package com.gjingonecq.milower.dice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView diceImageView;
    private Button BackButton, ForwardButton, DiceButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindwidget();
        BackController();
        ForwardController();
        DiceController();

    }

    private void diceImage(int intdice) {
        int[] intsSourceImage = new int[5];
        intsSourceImage[0]= R.drawable.die_face_1;
        intsSourceImage[1]= R.drawable.die_face_2;
        intsSourceImage[2]= R.drawable.die_face_3;
        intsSourceImage[3]= R.drawable.die_face_4;
        intsSourceImage[4]= R.drawable.die_face_5;
        intsSourceImage[5]= R.drawable.die_face_6;
        diceImageView.setImageResource(intsSourceImage[intdice]);
    }

    private void Randomview() {
        int intdice = 0;
        Random objRandom = new Random();
        intdice = objRandom.nextInt(5) +1;
        Log.d("Ran","intdice ==> "+intdice);

        diceImage(intdice);
    }

    private void ForwardController() {
        ForwardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    private void DiceController() {
        DiceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Randomview();
            }
        });
    }

    private void BackController() {
        BackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    private void bindwidget() {
        diceImageView = (ImageView) findViewById(R.id.imageView);
        DiceButton = (Button) findViewById(R.id.button);
        ForwardButton = (Button) findViewById(R.id.button2);
        BackButton = (Button) findViewById(R.id.button3);
    }




}
