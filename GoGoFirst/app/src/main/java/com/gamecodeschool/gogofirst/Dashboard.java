package com.gamecodeschool.gogofirst;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;

public class Dashboard extends AppCompatActivity {

    protected Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        // Get the Intent that started this activity and extract the string
        intent = getIntent();
        String message = intent.getStringExtra(LoginScreen.EXTRA_MESSAGE);
        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.usernametextView);
        textView.setText(message);
    }
}