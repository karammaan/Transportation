package com.example.karam.transportation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class Splash_layout extends AppCompatActivity {
    RelativeLayout user_et, driver_et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_layout);
        user_et = (RelativeLayout) findViewById(R.id.user_layout);
        driver_et = (RelativeLayout) findViewById(R.id.driver_layout);
    }

    public void open_user_layout(View v){
        Intent i = new Intent(Splash_layout.this ,User_Login.class);
        startActivity(i);
    }

    public void open_driver_layout(View v){
        Intent i = new Intent(Splash_layout.this ,Driver_login.class);
        startActivity(i);
    }

}
