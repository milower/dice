package com.gjingonecq.milower.dice;

import android.media.MediaPlayer;
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
    private int intdice =1;

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
        int[] intsSourceImage = new int[7];
        intsSourceImage[0]= 0;
        intsSourceImage[1]= R.drawable.die_face_1;
        intsSourceImage[2]= R.drawable.die_face_2;
        intsSourceImage[3]= R.drawable.die_face_3;
        intsSourceImage[4]= R.drawable.die_face_4;
        intsSourceImage[5]= R.drawable.die_face_5;
        intsSourceImage[6]= R.drawable.die_face_6;
        diceImageView.setImageResource(intsSourceImage[intdice]);
    }
    private void changePlay(int intdice){
        Log.d("test","ค่าที่รับได้ = " + intdice);
        int intSound = R.raw.dicethrow;
        switch (intdice){
            case 1:
                diceImageView.setImageResource(R.drawable.die_face_1);
                break;
            case 2:
                diceImageView.setImageResource(R.drawable.die_face_2);
                break;
            case 3:
                diceImageView.setImageResource(R.drawable.die_face_3);
                break;
            case 4:
                diceImageView.setImageResource(R.drawable.die_face_4);
                break;
            case 5:
                diceImageView.setImageResource(R.drawable.die_face_5);
                break;
            case 6:
                diceImageView.setImageResource(R.drawable.die_face_6);
                break;

        }
        MediaPlayer imageMediaPlayer = MediaPlayer.create(getBaseContext(), intSound);
        imageMediaPlayer.start();
    }

    private void Randomview() {
        intdice = 0;
        Random objRandom = new Random();
        intdice = objRandom.nextInt(6) +1;
        Log.d("Ran","intdice ==> "+intdice);

        diceImage(intdice);
    }

    private void ForwardController() {
        ForwardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intdice += 1;
                Randomview();
                changePlay(intdice);
            }
        });
    }

    private void DiceController() {
        DiceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Randomview();
                changePlay(intdice);
            }
        });
    }

    private void BackController() {
        BackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intdice -= 1;
                Randomview();
                changePlay(intdice);
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
