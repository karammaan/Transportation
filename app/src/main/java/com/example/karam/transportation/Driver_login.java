package com.example.karam.transportation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Driver_login extends AppCompatActivity {
    ImageView back_et;
    Button login_et;
    TextView forgot_et, signup_et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_login);
        back_et =(ImageView) findViewById(R.id.back_id);
        login_et =(Button) findViewById(R.id.login_id);
        forgot_et =(TextView) findViewById(R.id.forgot_id);
        signup_et =(TextView) findViewById(R.id.signup_id);
    }
    public void move_back(View v){
        Intent i = new Intent(Driver_login.this ,Splash_layout.class);
        startActivity(i);
    }
    public void login(View v){
        Intent i = new Intent(Driver_login.this ,Driver_home_layout.class);
        startActivity(i);
    }
    public void open_forgot_pass_layout(View v){
        Intent i = new Intent(Driver_login.this ,Driver_forgot_password.class);
        startActivity(i);
    }
    public void open_signup_layout(View v){
        Intent i = new Intent(Driver_login.this ,Driver_signup.class);
        startActivity(i);
    }
}
