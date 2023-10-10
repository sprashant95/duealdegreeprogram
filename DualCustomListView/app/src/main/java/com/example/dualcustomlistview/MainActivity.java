package com.example.dualcustomlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    String[] name = {"Guns and Gulaabs","Adipurush","1920","Bambai","Jailer","Rocky and Rani","Jaanejaan"};

    String[] date = {"18 AUG 2023","12 JAN 2023","23 JUNE 2023","07 SEPT 2023","28 JULY 2023","05 SEPT 2023"};

    Integer[] images = {R.drawable.gunsandgulabs, R.drawable.adipurush, R.drawable.devil1920, R.drawable.bambai,
    R.drawable.jailer, R.drawable.rockyandrani, R.drawable.janejaan};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list);

        MyCustomAdapter myCustomAdapter = new MyCustomAdapter(this,name,date,images);
        listView.setAdapter(myCustomAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent(MainActivity.this,DetailedActivity.class);

                intent.putExtra("name",name[i]);
                intent.putExtra("date",date[i]);
                intent.putExtra("image",images[i]);

                startActivity(intent);

            }
        });

    }
}