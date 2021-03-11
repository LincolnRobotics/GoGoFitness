package com.gamecodeschool.gogofirst;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton button1 = findViewById(R.id.loginbutton);
        ImageButton button2 = findViewById(R.id.guestbutton);
        ImageButton button3 = findViewById(R.id.aboutappbutton);

        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ToLogin();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ToGuest();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ToAboutApp();
            }
        });
    }

    public void ToLogin() {
        Intent intent = new Intent(this, LoginScreen.class);
        startActivity(intent);
    }
    public void ToGuest() {
        Intent intent = new Intent(this, GuestScreen.class);
        startActivity(intent);
    }

    public void ToAboutApp() {
        Intent intent = new Intent(this, AboutAppScreen.class);
        startActivity(intent);
    }
}