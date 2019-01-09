package com.example.nb.repeatgame;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Button playbtn, howbtn, optionsbtn, exitbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        playbtn = (Button) findViewById(R.id.playbtn);
        playbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPlayPage();
            }
        });
        howbtn = (Button) findViewById(R.id.howbtn);
        howbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHowtoPage();
            }
        });
        optionsbtn = (Button) findViewById(R.id.optionsbtn);
        optionsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOptionsPage();
            }
        });

    }

    public void openPlayPage(){

        Intent intent = new Intent(this, Login.class);
        startActivity(intent);

//        Intent intent = new Intent(this, PlayPage.class);
//        startActivity(intent);

    }

    public void openHowtoPage(){
        Intent intent = new Intent(this, Howto.class);
        startActivity(intent);

    }
    public void openOptionsPage(){
        Intent intent = new Intent(this, OptionsPage.class);
        startActivity(intent);

    }
    public void clickexit(View v){
        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(1);
    }
}
