package com.gamecodeschool.gogofirst;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class LoginScreen extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.GoGoFirst.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
    }
    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        Intent intent = new Intent(this, Dashboard.class);
        EditText userNameText = (EditText) findViewById(R.id.UserNameText);
        String message = userNameText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}