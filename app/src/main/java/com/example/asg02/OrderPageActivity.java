package com.example.asg02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class OrderPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_page);

        TextView updateUsername = findViewById(R.id.wlcMsg);
        updateUsername.setText("Welcome, " + LoginActivity.username + "!");
    }

    public void confirmOrder(View view) {
        Intent i = new Intent(this, OrderSummaryActivity.class);
        startActivity(i);
    }

    TextView textview;
    int number;

    public void americano(View view) {

        textview = findViewById(R.id.americanoNumber);
        number = Integer.parseInt(textview.getText().toString());

        switch(view.getId()) {
            case R.id.americanoAdd: number++; break;
            case R.id.americanoMinus: number--; break;
            default: Toast.makeText(getApplicationContext(),"Something went wrong. Please try again",Toast.LENGTH_SHORT).show();
        }

        if(number < 0) {
            textview.setText("0");
        } else {
            textview.setText(String.valueOf(number));
        }

    }

    public void latte(View view) {

        textview = findViewById(R.id.latteNumber);
        number = Integer.parseInt(textview.getText().toString());

        switch(view.getId()) {
            case R.id.latteAdd: number++; break;
            case R.id.latteMinus: number--; break;
            default: Toast.makeText(getApplicationContext(),"Something went wrong. Please try again",Toast.LENGTH_SHORT).show();
        }

        if(number < 0) {
            textview.setText("0");
        } else {
            textview.setText(String.valueOf(number));
        }

    }

    public void cappuccino(View view) {

        textview = findViewById(R.id.cappuccinoNumber);
        number = Integer.parseInt(textview.getText().toString());

        switch(view.getId()) {
            case R.id.cappuccinoAdd: number++; break;
            case R.id.cappuccinoMinus: number--; break;
            default: Toast.makeText(getApplicationContext(),"Something went wrong. Please try again",Toast.LENGTH_SHORT).show();
        }

        if(number < 0) {
            textview.setText("0");
        } else {
            textview.setText(String.valueOf(number));
        }

    }

    public void green(View view) {

        textview = findViewById(R.id.greenNumber);
        number = Integer.parseInt(textview.getText().toString());

        switch(view.getId()) {
            case R.id.greenAdd: number++; break;
            case R.id.greenMinus: number--; break;
            default: Toast.makeText(getApplicationContext(),"Something went wrong. Please try again",Toast.LENGTH_SHORT).show();
        }

        if(number < 0) {
            textview.setText("0");
        } else {
            textview.setText(String.valueOf(number));
        }

    }

    public void oolong(View view) {

        textview = findViewById(R.id.oolongNumber);
        number = Integer.parseInt(textview.getText().toString());

        switch(view.getId()) {
            case R.id.oolongAdd: number++; break;
            case R.id.oolongMinus: number--; break;
            default: Toast.makeText(getApplicationContext(),"Something went wrong. Please try again",Toast.LENGTH_SHORT).show();
        }

        if(number < 0) {
            textview.setText("0");
        } else {
            textview.setText(String.valueOf(number));
        }

    }

    public void lemon(View view) {

        textview = findViewById(R.id.lemonNumber);
        number = Integer.parseInt(textview.getText().toString());

        switch(view.getId()) {
            case R.id.lemonAdd: number++; break;
            case R.id.lemonMinus: number--; break;
            default: Toast.makeText(getApplicationContext(),"Something went wrong. Please try again",Toast.LENGTH_SHORT).show();
        }

        if(number < 0) {
            textview.setText("0");
        } else {
            textview.setText(String.valueOf(number));
        }

    }

}