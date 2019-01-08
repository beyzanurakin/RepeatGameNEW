package com.example.nb.repeatgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;

public class PlayPage extends AppCompatActivity {

    Button gotoeasy, gotomedium, gotohard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_page);
        gotoeasy = (Button) findViewById(R.id.gotoeasy);
        gotoeasy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEasyPage();
            }
        });
        gotomedium = (Button) findViewById(R.id.gotomedium);
        gotomedium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMediumPage();
            }
        });
        gotohard = (Button) findViewById(R.id.gotohard);
        gotohard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHardPage();
            }
        });

    }


    public void openEasyPage(){
        Intent intent = new Intent(this, easy_level.class);
        startActivity(intent);

    }

    public void openMediumPage(){
        Intent intent = new Intent(this, medium_level.class);
        startActivity(intent);

    }

    public void openHardPage(){
        Intent intent = new Intent(this, hard_level.class);
        startActivity(intent);

    }
}
