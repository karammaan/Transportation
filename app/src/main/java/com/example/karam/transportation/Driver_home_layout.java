package com.example.karam.transportation;

import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Driver_home_layout extends AppCompatActivity {
    DrawerLayout drawer;
    ImageView list_et;
    LinearLayout  detail_et, profile_et, setting_et, notifi_et, logout_et, history_et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_home_layout);
        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        list_et= (ImageView) findViewById(R.id.list_icon);
        profile_et = (LinearLayout) findViewById(R.id.profile_id);
        setting_et = (LinearLayout) findViewById(R.id.setting_id);
        notifi_et = (LinearLayout) findViewById(R.id.notifi_id);
        logout_et = (LinearLayout) findViewById(R.id.logout_id);
        history_et = (LinearLayout) findViewById(R.id.history_id);
        detail_et = (LinearLayout) findViewById(R.id.detail_id);
        detail_et = (LinearLayout) findViewById(R.id.detail_id1);
        detail_et = (LinearLayout) findViewById(R.id.detail_id2);
        detail_et = (LinearLayout) findViewById(R.id.detail_id3);
    }
    public void open_drawer(View v) {
        drawer.openDrawer(Gravity.LEFT);
    }
    public void open_profile(View v) {
        Intent i = new Intent(Driver_home_layout.this, Driver_profile.class);
        startActivity(i);
    }


    public void open_history(View v) {
        Intent i = new Intent(Driver_home_layout.this, Driver_load_history.class);
        startActivity(i);
    }

    public void open_setting(View v) {
        Intent i = new Intent(Driver_home_layout.this, Driver_setting.class);
        startActivity(i);
    }

    public void logout(View v) {
        Intent i = new Intent(Driver_home_layout.this, Driver_login.class);
        startActivity(i);
    }

    public void open_notifi(View v) {
        Intent i = new Intent(Driver_home_layout.this, Driver_notification.class);
        startActivity(i);
    }
    public void open_full_detail(View v) {
        Intent i = new Intent(Driver_home_layout.this, Driver_load_details.class);
        startActivity(i);
    }
}
