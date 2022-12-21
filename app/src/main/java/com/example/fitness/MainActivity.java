package com.example.fitness;

import android.content.Intent;
import android.text.Editable;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    public static final String max = "com.example.fitness.example.max";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Фитнес трекер");

        Button next = (Button) findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTable();
            }
        });
    }
    public void openTable() {
        EditText MaxInput = (EditText) findViewById(R.id.MaxInput);
        String S = MaxInput.getText().toString();

        if (TextUtils.isEmpty(S)) {
            showToast("Вы ничего не ввели");
        } else {
            int mmax = Integer.parseInt(MaxInput.getText().toString());

            if (mmax < 6) {
                showToast("Подберите сочетание резин, с которыми вы подтянитесь 6 раз");
            } else {
                Intent intent = new Intent(this, Table1.class);
                intent.putExtra(max, mmax);
                startActivity(intent);
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.example_men, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.About:
                openAbout();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


    public void openAbout() {
        Intent intent = new Intent(this, AboutProgramm.class);
        startActivity(intent);
    }

    private void showToast(String text) {
        Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();
    }
}