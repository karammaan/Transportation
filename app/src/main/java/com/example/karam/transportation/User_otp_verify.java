package com.example.karam.transportation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class User_otp_verify extends AppCompatActivity {
    TextView next_et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_otp_verify);
        next_et = (TextView) findViewById(R.id.next_id);
    }
    public void next_layout(View v)
    {
        Intent i = new Intent(User_otp_verify.this, User_new_password.class);
        startActivity(i);
    }
}
