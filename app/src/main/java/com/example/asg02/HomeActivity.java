package com.example.asg02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
    }
    public void openOrderPage(View view){
        Intent i = new Intent(this, OrderPageActivity.class);
        startActivity(i);
    }

    public void openOrderHistory(View view){
        Intent i = new Intent(this, HistoryPageActivity.class);
        startActivity(i);
    }
}