package com.example.karam.transportation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Driver_signup extends AppCompatActivity {
    Button sign_et;
    TextView login_et;
    ImageView back_et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_signup);
        sign_et =(Button) findViewById(R.id.signup_id);
        login_et =(TextView) findViewById(R.id.login_id);
        back_et = (ImageView) findViewById(R.id.back_id);
    }
    public  void open_home_layout(View v){
        Intent i = new Intent(Driver_signup.this, Driver_home_layout.class);
        startActivity(i);
    }
    public  void open_login_layout(View v){
        Intent i = new Intent(Driver_signup.this ,Driver_login.class);
        startActivity(i);
    }
    public  void back(View v){
        Intent i = new Intent(Driver_signup.this ,Driver_login.class);
        startActivity(i);
    }
}
