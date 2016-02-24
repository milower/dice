package com.gjingonecq.milower.dice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView diceImageView;
    private Button BackButton, ForwardButton, DiceButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindwidget();
        dice1Controller();
        dice2Controller();
        dice3Controller();
        dice4Controller();
        dice5Controller();
        dice6Controller();
    }

    private void bindwidget() {
        diceImageView = (ImageView) findViewById(R.id.imageView);
        DiceButton = (Button) findViewById(R.id.button);
        ForwardButton = (Button) findViewById(R.id.button2);
        BackButton = (Button) findViewById(R.id.button3);
    }

    private void dice1Controller() {

    }

    private void dice2Controller() {

    }

    private void dice3Controller() {

    }

    private void dice4Controller() {

    }

    private void dice5Controller() {

    }

    private void dice6Controller() {

    }


}
