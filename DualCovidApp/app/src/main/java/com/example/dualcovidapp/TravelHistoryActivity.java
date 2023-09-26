package com.example.dualcovidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class TravelHistoryActivity extends AppCompatActivity {

    FloatingActionButton fab;
    RadioButton yes, no, maybe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel_history);


        fab = findViewById(R.id.floatingActionButton);
        yes = findViewById(R.id.yes);
        no = findViewById(R.id.no);
        maybe = findViewById(R.id.nottosay);


        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    if (yes.isChecked()){
                        Toast.makeText(TravelHistoryActivity.this,"You clicked YES",Toast.LENGTH_LONG).show();
                    }
                    if (no.isChecked()){
                        Toast.makeText(TravelHistoryActivity.this, "You Clicked NO", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        Toast.makeText(TravelHistoryActivity.this, "Prefer not to say", Toast.LENGTH_SHORT).show();
                    }

                Intent intent = new Intent(TravelHistoryActivity.this, FeelingAcitivity.class);
                    startActivity(intent);
            }
        });
    }
}