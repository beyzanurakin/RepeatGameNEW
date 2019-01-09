package com.example.nb.repeatgame;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class medium_level extends AppCompatActivity {

    Button b_new;
    Button button1, button2, button3,
            button4, button5, button6,
            button7, button8, button9,
            button10, button11, button12,
            button13, button14, button15, button16;



    List<Integer> buttons;

    int curLevel, curGuess;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medium_level);

        b_new = (Button) findViewById(R.id.b_new);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        button11 = (Button) findViewById(R.id.button11);
        button12 = (Button) findViewById(R.id.button12);
        button13 = (Button) findViewById(R.id.button13);
        button14 = (Button) findViewById(R.id.button14);
        button15 = (Button) findViewById(R.id.button15);
        button16 = (Button) findViewById(R.id.button16);

        button1.setTag(1);
        button2.setTag(2);
        button3.setTag(3);
        button4.setTag(4);
        button5.setTag(5);
        button6.setTag(6);
        button7.setTag(7);
        button8.setTag(8);
        button9.setTag(9);
        button10.setTag(10);
        button11.setTag(11);
        button12.setTag(12);
        button13.setTag(13);
        button14.setTag(14);
        button15.setTag(15);
        button16.setTag(16);

        disableButtons();


        buttons = new ArrayList<>();
        buttons.add(1);
        buttons.add(1);
        buttons.add(2);
        buttons.add(3);
        buttons.add(4);
        buttons.add(5);
        buttons.add(6);
        buttons.add(7);
        buttons.add(8);
        buttons.add(9);
        buttons.add(10);
        buttons.add(11);
        buttons.add(12);
        buttons.add(13);
        buttons.add(14);
        buttons.add(15);
        buttons.add(16);

        b_new.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b_new.setVisibility(View.INVISIBLE);
                curGuess = 0;
                curLevel = 1;
                generateButtons(curLevel);

            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonLogic(v);
                ((Button) v).setText("✔");

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonLogic(v);
                ((Button) v).setText("✔");

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonLogic(v);
                ((Button) v).setText("✔");

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonLogic(v);
                ((Button) v).setText("✔");

            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonLogic(v);
                ((Button) v).setText("✔");

            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonLogic(v);
                ((Button) v).setText("✔");

            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonLogic(v);
                ((Button) v).setText("✔");

            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonLogic(v);
                ((Button) v).setText("✔");

            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonLogic(v);
                ((Button) v).setText("✔");

            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonLogic(v);
                ((Button) v).setText("✔");

            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonLogic(v);
                ((Button) v).setText("✔");

            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonLogic(v);
                ((Button) v).setText("✔");

            }
        });
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonLogic(v);
                ((Button) v).setText("✔");

            }
        });
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonLogic(v);
                ((Button) v).setText("✔");

            }
        });
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonLogic(v);
                ((Button) v).setText("✔");

            }
        });
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonLogic(v);
                ((Button) v).setText("✔");

            }
        });
    }

    private void buttonLogic(View v){
        List<Integer> tempList = new ArrayList<>();
        for (Integer i = 0; i < curLevel; i++) {
            tempList.add(buttons.get(i));
        }

        if(tempList.contains(v.getTag())){
            curGuess++;
            checkWin();
        } else {
            lostGame();
        }
    }

    private void lostGame(){
        Intent intent = new Intent(this, medium_level.class);
        startActivity(intent);
    }

    private void checkWin(){
        if(curGuess == curLevel){
            disableButtons();
            if(curLevel == 12){
                Toast.makeText(this, "succes!", Toast.LENGTH_SHORT).show();
                b_new.setVisibility(View.VISIBLE);
            } else{
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        curGuess = 0;
                        curLevel++;
                        generateButtons(curLevel);

                    }
                }, 1000);

            }
        }
    }

    private void generateButtons(int number){
        button1.setText("");
        button2.setText("");
        button3.setText("");
        button4.setText("");
        button5.setText("");
        button6.setText("");
        button7.setText("");
        button8.setText("");
        button9.setText("");
        button10.setText("");
        button11.setText("");
        button12.setText("");
        button13.setText("");
        button14.setText("");
        button15.setText("");
        button16.setText("");

        Collections.shuffle(buttons);


        for (int i = 0; i < number; i++){
            showButton(buttons.get(i));
        }

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                button1.setText("");
                button2.setText("");
                button3.setText("");
                button4.setText("");
                button5.setText("");
                button6.setText("");
                button7.setText("");
                button8.setText("");
                button9.setText("");
                button10.setText("");
                button11.setText("");
                button12.setText("");
                button13.setText("");
                button14.setText("");
                button15.setText("");
                button16.setText("");

                enableButtons();

            }
        }, 1000);


    }

    private void showButton(int number){
        switch (number){
            case 1:
                button1.setText("✿");
                button1.setTextColor(0xff000000);
                break;
            case 2:
                button2.setText("✿");
                button2.setTextColor(0xff000000);
                break;
            case 3:
                button3.setText("✿");
                button3.setTextColor(0xff000000);
                break;
            case 4:
                button4.setText("✿");
                button4.setTextColor(0xff000000);
                break;
            case 5:
                button5.setText("✿");
                button5.setTextColor(0xff000000);
                break;
            case 6:
                button6.setText("✿");
                button6.setTextColor(0xff000000);
                break;
            case 7:
                button7.setText("✿");
                button7.setTextColor(0xff000000);
                break;
            case 8:
                button8.setText("✿");
                button8.setTextColor(0xff000000);
                break;
            case 9:
                button9.setText("✿");
                button9.setTextColor(0xff000000);
                break;
            case 10:
                button10.setText("✿");
                button10.setTextColor(0xff000000);
                break;
            case 11:
                button11.setText("✿");
                button11.setTextColor(0xff000000);
                break;
            case 12:
                button12.setText("✿");
                button12.setTextColor(0xff000000);
                break;
            case 13:
                button13.setText("✿");
                button13.setTextColor(0xff000000);
                break;
            case 14:
                button14.setText("✿");
                button14.setTextColor(0xff000000);
                break;
            case 15:
                button15.setText("✿");
                button15.setTextColor(0xff000000);
                break;
            case 16:
                button16.setText("✿");
                button16.setTextColor(0xff000000);
                break;

        }
    }

    private void enableButtons(){
        button1.setEnabled(true);
        button2.setEnabled(true);
        button3.setEnabled(true);
        button4.setEnabled(true);
        button5.setEnabled(true);
        button6.setEnabled(true);
        button7.setEnabled(true);
        button8.setEnabled(true);
        button9.setEnabled(true);
        button10.setEnabled(true);
        button11.setEnabled(true);
        button12.setEnabled(true);
        button13.setEnabled(true);
        button14.setEnabled(true);
        button15.setEnabled(true);
        button16.setEnabled(true);
    }

    private void disableButtons(){
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
        button6.setEnabled(false);
        button7.setEnabled(false);
        button8.setEnabled(false);
        button9.setEnabled(false);
        button10.setEnabled(false);
        button11.setEnabled(false);
        button12.setEnabled(false);
        button13.setEnabled(false);
        button14.setEnabled(false);
        button15.setEnabled(false);
        button16.setEnabled(false);
    }

}
