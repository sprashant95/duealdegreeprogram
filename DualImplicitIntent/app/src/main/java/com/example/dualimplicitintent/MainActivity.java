package com.example.dualimplicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    Button btn;
    FloatingActionButton fab;
    EditText to,subject,body;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        to = findViewById(R.id.toemail);
        subject = findViewById(R.id.subemail);
        body = findViewById(R.id.bodyemail);

        btn = findViewById(R.id.button);
        fab = findViewById(R.id.floatingActionButton);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String toemail = to.getText().toString();
                String subemail = subject.getText().toString();
                String bodyemail = body.getText().toString();

                Intent intent = new Intent(Intent.ACTION_SEND);

                intent.putExtra(Intent.EXTRA_EMAIL,new String[]{toemail});
                intent.putExtra(Intent.EXTRA_SUBJECT,subemail);
                intent.putExtra(Intent.EXTRA_TEXT,bodyemail);

                intent.setType("message/rfc822");

                Intent.createChooser(intent,"Select App to send email");
                startActivity(intent);

                to.setText("");
                body.setText("");
                subject.setText("");

            }
        });

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
               // intent.setType("image/*");
                Intent.createChooser(intent,"Select App to click photo");
                startActivity(intent);

            }
        });
    }
}