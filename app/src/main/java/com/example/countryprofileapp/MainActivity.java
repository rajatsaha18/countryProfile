package com.example.countryprofileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button bangladeshButton, indiaButton, nepalButton;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bangladeshButton    = (Button) findViewById(R.id.bangladeshButtonId);
        indiaButton         = (Button) findViewById(R.id.indiaButtonId);
        nepalButton         = (Button) findViewById(R.id.nepalButtonId);

        bangladeshButton.setOnClickListener(this);
        indiaButton.setOnClickListener(this);
        nepalButton.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        if(v.getId()== R.id.bangladeshButtonId){
            intent = new Intent(MainActivity.this,ProfileActivity.class);
            intent.putExtra("name", "bangladesh");
            startActivity(intent);
        }
        if(v.getId()== R.id.indiaButtonId){
            intent = new Intent(MainActivity.this,ProfileActivity.class);
            intent.putExtra("name", "india");
            startActivity(intent);
        }
        if(v.getId()== R.id.nepalButtonId){
            intent = new Intent(MainActivity.this,ProfileActivity.class);
            intent.putExtra("name", "nepal");
            startActivity(intent);
        }

    }
}