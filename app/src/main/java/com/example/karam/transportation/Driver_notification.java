package com.example.karam.transportation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Driver_notification extends AppCompatActivity {
    ImageView back_et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_notification);
        back_et=(ImageView)findViewById(R.id.back_id);
    }
    public void back(View v ){
        Intent i = new Intent(Driver_notification.this,Driver_home_layout.class);
        startActivity(i);
    }
}
