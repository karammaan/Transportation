package com.example.karam.transportation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Driver_forgot_password extends AppCompatActivity {
    Button otp_et;
    TextView signup_et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_forgot_password);
        otp_et =(Button)findViewById(R.id.otp_id);
        signup_et =(TextView) findViewById(R.id.signup_id);

    }
    public  void open_signup_layout(View v){
        Intent i = new Intent(Driver_forgot_password.this, Driver_signup.class);
        startActivity(i);
    }
    public  void open_otp_layout(View v){
        Intent i = new Intent(Driver_forgot_password.this ,Driver_otp_verify.class);
        startActivity(i);
    }
}
