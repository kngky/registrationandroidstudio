package com.example.registrationfinaljud;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class anotherActivity extends AppCompatActivity {
    TextView name;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_another);

        name = (TextView) findViewById(R.id.name);

        Intent intent = getIntent();
        String fname = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        name.setText("Welcome to Google, " + fname + "!");
    }
}