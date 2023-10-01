package com.example.activityone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

import android.net.Uri;
import android.os.Bundle;
import android.renderscript.Sampler;
import android.view.View;
import android.widget.Button;

public class ActivityTwo extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        button = findViewById(R.id.btnTwo);


        //gmail openup create
        Intent Objintent = new Intent(Intent.ACTION_SEND);
        final Intent chooser;
        Objintent.setData(Uri.parse("mailto:"));
        Objintent.putExtra(Intent.EXTRA_EMAIL, new String[]{"Vilochana.Rajapaksha2002@gmail.com"});
        Objintent.putExtra(Intent.EXTRA_SUBJECT, "Enter your subject here...");
        Objintent.putExtra(Intent.EXTRA_TEXT, "Enter your message here..");
        Objintent.setType("message/rfc822");
        chooser = Intent.createChooser(Objintent, "Send email test app");


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }

        });

        button = findViewById(R.id.btnGmail);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Launch the email Activity
                startActivity(chooser);
            }

        });
    }
}