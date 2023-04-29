package com.example.asg02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class OrderHistoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_history);
    }

    public void homeBtn(View view){
        Intent i = new Intent(this, HomeActivity.class);
        startActivity(i);

    }
}