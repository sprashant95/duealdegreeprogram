package com.example.dualcustomlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class DetailedActivity extends AppCompatActivity {

    CircleImageView imageView;
    TextView name, date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed);

        imageView = findViewById(R.id.dimage);
        name = findViewById(R.id.dname);
        date = findViewById(R.id.ddate);


        Intent intent = getIntent();

        String mydate = intent.getStringExtra("date");
        String myname = intent.getStringExtra("name");
        Integer myimage = intent.getIntExtra("image",R.drawable.ic_launcher_background);

        date.setText(mydate);
        name.setText(myname);
        imageView.setImageResource(myimage);

    }
}