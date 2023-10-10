package com.example.dualratingbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RatingBar ratingBar;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.button);
        ratingBar = findViewById(R.id.ratingBar);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float rating = ratingBar.getRating();
                int stars = ratingBar.getNumStars();

                Toast.makeText(MainActivity.this, "You Rated us: " + rating + "/" + stars , Toast.LENGTH_SHORT).show();
            }
        });
    }
}