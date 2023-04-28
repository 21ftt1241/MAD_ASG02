package com.example.asg02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class OrderPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_page);

        TextView updateUsername = findViewById(R.id.wlcMsg);
        updateUsername.setText("Welcome, " + LoginActivity.username + "!");
    }

}