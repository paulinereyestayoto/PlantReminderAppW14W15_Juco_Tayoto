package com.tayoto.pauline.plantreminderapp_w12w13;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class newplant extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newplant);
    }

    public void alarmActivity(View v) {
        Intent i = new Intent(this, alarm.class);
        startActivity(i);
    }

    public void newplant1Activity(View v) {
        Intent i = new Intent(this, newplant1.class);
        startActivity(i);
    }
}
