package com.example.dualcovidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class FeelingAcitivity extends AppCompatActivity {

    CheckBox cough, cold, fever, headache;
    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feeling_acitivity);

        fab = findViewById(R.id.floatingActionButton);
        cough = findViewById(R.id.cough);
        cold = findViewById(R.id.cold);
        fever = findViewById(R.id.fever);
        headache = findViewById(R.id.headache);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cough.isChecked()){
                    Toast.makeText(FeelingAcitivity.this, "You have cough and you are secure from COVID, STAY SAFE", Toast.LENGTH_SHORT).show();
                } else if (cold.isChecked()) {
                    Toast.makeText(FeelingAcitivity.this, "You have cold and you are secure from COVID", Toast.LENGTH_SHORT).show();
                } else if (fever.isChecked()) {
                    Toast.makeText(FeelingAcitivity.this, "You have fever, take care", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(FeelingAcitivity.this, "You have headache, take rest", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}