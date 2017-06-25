package com.example.karam.transportation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Driver_load_details extends AppCompatActivity {
    ImageView back_et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_load_details);
        back_et=(ImageView) findViewById(R.id.back_icon);
    }
    public  void open_home_layout (View v){
        Intent i = new Intent(Driver_load_details.this ,Driver_home_layout.class);
        startActivity(i);
    }
}
