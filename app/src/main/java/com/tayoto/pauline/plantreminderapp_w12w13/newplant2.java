package com.tayoto.pauline.plantreminderapp_w12w13;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class newplant2 extends AppCompatActivity {

    TextView tPlantName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newplant2);
        tPlantName = findViewById(R.id.tvPlantName);

        SharedPreferences sp = getSharedPreferences("data1", Context.MODE_PRIVATE);
        String plantName = sp.getString("plantName", null);
        String message = plantName;
        tPlantName.setText(message);
    }

    public void newplant1Activity(View v) {
        Intent i = new Intent(this, newplant1.class);
        startActivity(i);
    }
}
