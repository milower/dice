package com.gjingonecq.milower.dice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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
        BackController();
        ForwardController();
        DiceController();
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
