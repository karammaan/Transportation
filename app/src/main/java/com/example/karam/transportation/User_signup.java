package com.example.karam.transportation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class User_signup extends AppCompatActivity {
    Button sign_et;
    TextView login_et;
    ImageView back_et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_signup);
        sign_et =(Button) findViewById(R.id.signup_id);
        login_et =(TextView) findViewById(R.id.login_id);
        back_et =(ImageView) findViewById(R.id.back_id);
    }
    public  void open_home_layout(View v){
        Intent i = new Intent(User_signup.this, User_home_layout.class);
        startActivity(i);
    }
    public  void open_login_layout(View v){
        Intent i = new Intent(User_signup.this ,User_Login.class);
        startActivity(i);
    }
    public  void move_back(View v){
        Intent i = new Intent(User_signup.this ,User_Login.class);
        startActivity(i);
    }
}
