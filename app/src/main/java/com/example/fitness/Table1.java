package com.example.fitness;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import java.lang.Math;

public class Table1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table1);

        TextView first_first_first = (TextView) findViewById(R.id.textView15);
        TextView first_first_second = (TextView) findViewById(R.id.textView16);
        TextView first_first_third = (TextView) findViewById(R.id.textView17);
        TextView first_first_fourth = (TextView) findViewById(R.id.textView18);
        TextView first_first_fifth = (TextView) findViewById(R.id.textView19);

        TextView first_second_first = (TextView) findViewById(R.id.textView21);
        TextView first_second_second = (TextView) findViewById(R.id.textView22);
        TextView first_second_third = (TextView) findViewById(R.id.textView23);
        TextView first_second_fourth = (TextView) findViewById(R.id.textView24);
        TextView first_second_fifth = (TextView) findViewById(R.id.textView25);

        TextView second_first_first = (TextView) findViewById(R.id.textView27);
        TextView second_first_second = (TextView) findViewById(R.id.textView28);
        TextView second_first_third = (TextView) findViewById(R.id.textView29);
        TextView second_first_fourth = (TextView) findViewById(R.id.textView30);
        TextView second_first_fifth = (TextView) findViewById(R.id.textView31);

        TextView second_second_first = (TextView) findViewById(R.id.textView33);
        TextView second_second_second = (TextView) findViewById(R.id.textView34);
        TextView second_second_third = (TextView) findViewById(R.id.textView35);
        TextView second_second_fourth = (TextView) findViewById(R.id.textView36);
        TextView second_second_fifth = (TextView) findViewById(R.id.textView37);

        TextView third_first_first = (TextView) findViewById(R.id.textView39);
        TextView third_first_second = (TextView) findViewById(R.id.textView40);
        TextView third_first_third = (TextView) findViewById(R.id.textView41);
        TextView third_first_fourth = (TextView) findViewById(R.id.textView42);
        TextView third_first_fifth = (TextView) findViewById(R.id.textView43);

        TextView third_second_first = (TextView) findViewById(R.id.textView45);
        TextView third_second_second = (TextView) findViewById(R.id.textView46);
        TextView third_second_third = (TextView) findViewById(R.id.textView47);
        TextView third_second_fourth = (TextView) findViewById(R.id.textView48);
        TextView third_second_fifth = (TextView) findViewById(R.id.textView49);

        TextView fourth_first_first = (TextView) findViewById(R.id.textView51);
        TextView fourth_first_second = (TextView) findViewById(R.id.textView52);
        TextView fourth_first_third = (TextView) findViewById(R.id.textView53);
        TextView fourth_first_fourth = (TextView) findViewById(R.id.textView54);
        TextView fourth_first_fifth = (TextView) findViewById(R.id.textView55);

        TextView fourth_second_first = (TextView) findViewById(R.id.textView57);
        TextView fourth_second_second = (TextView) findViewById(R.id.textView58);
        TextView fourth_second_third = (TextView) findViewById(R.id.textView59);
        TextView fourth_second_fourth = (TextView) findViewById(R.id.textView60);
        TextView fourth_second_fifth = (TextView) findViewById(R.id.textView61);


        getSupportActionBar().setTitle("Таблица Тренировок");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent intent = getIntent();
        int number = intent.getIntExtra(MainActivity.max, 0);

        String first_week = "2 под x " + String.valueOf((int)Math.ceil((0.5)*number));
        first_first_first.setText(first_week);
        first_first_second.setText(first_week);
        first_first_third.setText(first_week);
        first_first_fourth.setText(first_week);
        first_first_fifth.setText(first_week);

        first_second_first.setText(first_week);
        first_second_second.setText(first_week);
        first_second_third.setText(first_week);
        first_second_fourth.setText(first_week);
        first_second_fifth.setText(first_week);

        second_first_first.setText("1 под x " + String.valueOf((int)((0.7)*number + 0.5)) + ". \n " + "\nНегатив  \n2 под x 2 р");
        second_first_second.setText("2 под х " + String.valueOf((int)((0.7)*number + 0.5)));
        second_first_third.setText("1 под x " + String.valueOf((int)((0.6)*number + 0.5)) + ".\nВис на согнутых руках 2 x 8 сек");
        second_first_fourth.setText("2 под x " + String.valueOf((int)((0.5)*number + 0.5)));
        second_first_fifth.setText("3 под: " + String.valueOf((int)((0.9)*number + 0.5)) + ", " + (int)((0.7)*number + 0.5) + ", " + (int)((0.7)*number + 0.5));

        second_second_first.setText("1 под x " + String.valueOf((int)((0.7)*number + 0.5)) + "." + "\n " + "\nНегатив \n2 под x 2 р");
        second_second_second.setText("2 под х " + String.valueOf((int)((0.7)*number + 0.5)));
        second_second_third.setText("1 под x " + String.valueOf((int)((0.8)*number + 0.5)) + ".\nВис на согнутых руках 2 x 6 сек");
        second_second_fourth.setText("2 под x " + String.valueOf((int)((0.7)*number + 0.5)));
        second_second_fifth.setText("3 под: " + String.valueOf((int)((0.9)*number + 0.5)) + ", " + (int)((0.8)*number + 0.5) + ", " + (int)((0.7)*number + 0.5));


        third_first_first.setText("2 под x " + String.valueOf((int)((0.7)*number + 0.5)) + ".\nВис 8 сек");
        third_first_second.setText("2 под: " + String.valueOf((int)((0.8)*number + 0.5)) + ", " + (int)((0.7)*number + 0.5));
        third_first_third.setText("3 под x " + String.valueOf((int)((0.7)*number + 0.5)));
        third_first_fourth.setText("2 под x " + String.valueOf((int)((0.7)*number + 0.5)));
        third_first_fifth.setText("3 под: " + String.valueOf((int)((0.9)*number + 0.5)) + ", " + (int)((0.9)*number + 0.5) + ", " + (int)((0.7)*number + 0.5));

        third_second_first.setText("2 под x " + String.valueOf((int)((0.7)*number + 0.5)) + ".\nВис 8 сек");
        third_second_second.setText("2 под: " + String.valueOf((int)((0.8)*number + 0.5)) + ", " + (int)((0.7)*number + 0.5));
        third_second_third.setText("3 под x " + String.valueOf((int)((0.7)*number + 0.5)));
        third_second_fourth.setText("2 под x " + String.valueOf((int)((0.7)*number + 0.5)));
        third_second_fifth.setText("3 под: " + String.valueOf((int)((0.9)*number + 0.5)) + ", " + (int)((0.9)*number + 0.5) + ", " + (int)((0.7)*number + 0.5));

        fourth_first_first.setText("2 под x " + String.valueOf((int)((0.8)*number + 0.5)) + ". \nВис 10 сек");
        fourth_first_second.setText("2 под x " + String.valueOf((int)((0.8)*number + 0.5)) + ". \nВис 10 сек");
        fourth_first_third.setText("3 под x " + String.valueOf((int)((0.7)*number + 0.5)) + ". \nВис 10 сек");
        fourth_first_fourth.setText("3 под x " + String.valueOf((int)((0.7)*number + 0.5)));
        fourth_first_fifth.setText("1 под x " + String.valueOf((int)((1.2)*number + 0.5)) + " или мах");

        fourth_second_first.setText("2 под x " + String.valueOf((int)((0.8)*number + 0.5)) + ". \nВис 10 сек");
        fourth_second_second.setText("2 под: " + String.valueOf((int)((0.8)*number + 0.5)) + ", " + (int)((0.7)*number + 0.5));
        fourth_second_third.setText("3 под x " + String.valueOf((int)((0.7)*number + 0.5)) + ". \nВис 10 сек");
        fourth_second_fourth.setText("3 под x " + String.valueOf((int)((0.7)*number + 0.5)));
        fourth_second_fifth.setText("1 под x " + String.valueOf((int)((1.2)*number + 0.5)) + " или мах");
    }

    private void showToast(String text) {
        Toast.makeText(Table1.this, text, Toast.LENGTH_SHORT).show();
    }
}