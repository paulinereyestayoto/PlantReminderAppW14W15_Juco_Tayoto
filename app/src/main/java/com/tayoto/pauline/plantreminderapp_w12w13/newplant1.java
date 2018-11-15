package com.tayoto.pauline.plantreminderapp_w12w13;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class newplant1 extends AppCompatActivity {

    EditText ePlantName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newplant1);
        ePlantName = findViewById(R.id.etPlantName);
    }

    public void newplantActivity(View v) {
        Intent i = new Intent(this, newplant.class);
        startActivity(i);
    }

    public void saveSP (View v){
        SharedPreferences sp = getSharedPreferences("data1", Context.MODE_PRIVATE);
        SharedPreferences.Editor writer = sp.edit();
        String plantName = ePlantName.getText().toString();
        writer.putString("plantName", plantName);
        writer.commit();
        Toast.makeText(this, "You have successfully set a plant name", Toast.LENGTH_LONG).show();
        Intent i = new Intent (this, newplant2.class);
        startActivity(i);
    }
}
