package com.example.fitness;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class AboutProgramm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_programm);

        getSupportActionBar().setTitle("О программе");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}