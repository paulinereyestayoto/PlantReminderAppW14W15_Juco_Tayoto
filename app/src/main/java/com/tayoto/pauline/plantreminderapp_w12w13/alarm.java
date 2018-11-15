package com.tayoto.pauline.plantreminderapp_w12w13;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class alarm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm);
    }

    public void newplantActivity(View v){
        Intent i = new Intent (this, newplant.class);
        startActivity(i);
    }
}
