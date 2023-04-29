package com.example.asg02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class OrderPageActivity extends AppCompatActivity {

    TextView textview;
    int number;
    int lemonQty, oolongQty, greenTeaQty, americcanoQty, latteQty, cappucinoQty;
    double americanoPrice = 2.50;
    double lattePrice = 2.50;
    double cappucinoPrice = 2.50;
    double greenTeaPrice = 3.00;
    double lemonPrice = 2.00;
    double oolongPrice = 1.50;

    static double totalOrder = 0.00;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_page);

        TextView updateUsername = findViewById(R.id.wlcMsg);
        updateUsername.setText("Welcome, " + LoginActivity.username + "!");
    }


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
            americcanoQty = number;
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
            latteQty = number;
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
            cappucinoQty = number;
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
            greenTeaQty = number;
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
            oolongQty = number;
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
            lemonQty = number;
        }
    }

    public void confirmOrder(View view) {
        if (americcanoQty > 0){
            double total = americcanoQty * americanoPrice;
            summaryActivity.orderQty = summaryActivity.orderQty + americcanoQty +"\n";
            summaryActivity.orderItem = summaryActivity.orderItem + "Americano" +"\n";
            summaryActivity.orderPrice = summaryActivity.orderPrice + total +"\n";
            totalOrder = totalOrder + total;
        }
        if (latteQty > 0){
            double total = latteQty * lattePrice;
            summaryActivity.orderQty = summaryActivity.orderQty + latteQty +"\n";
            summaryActivity.orderItem = summaryActivity.orderItem + "Latte" +"\n";
            summaryActivity.orderPrice = summaryActivity.orderPrice + total +"\n";
            totalOrder = totalOrder + total;
        }
        if (cappucinoQty > 0){
            double total = cappucinoQty * cappucinoPrice;
            summaryActivity.orderQty = summaryActivity.orderQty + cappucinoQty+"\n";
            summaryActivity.orderItem = summaryActivity.orderItem + "Cappucino"+"\n";
            summaryActivity.orderPrice = summaryActivity.orderPrice + total+"\n";
            totalOrder = totalOrder + total;
        }
        if (greenTeaQty > 0){
            double total = greenTeaQty * greenTeaPrice;
            summaryActivity.orderQty = summaryActivity.orderQty + greenTeaQty+"\n";
            summaryActivity.orderItem = summaryActivity.orderItem + "Green Tea"+"\n";
            summaryActivity.orderPrice = summaryActivity.orderPrice + total+"\n";
            totalOrder = totalOrder + total;
        }
        if (oolongQty > 0){
            double total = oolongQty * oolongPrice;
            summaryActivity.orderQty = summaryActivity.orderQty + oolongQty+"\n";
            summaryActivity.orderItem = summaryActivity.orderItem + "Oolong Tea"+"\n";
            summaryActivity.orderPrice = summaryActivity.orderPrice + total+"\n";
            totalOrder = totalOrder + total;
        }
        if (lemonQty > 0){
            double total = lemonQty * lemonPrice;
            summaryActivity.orderQty = summaryActivity.orderQty + lemonQty+"\n";
            summaryActivity.orderItem = summaryActivity.orderItem + "Lemon Tea"+"\n";
            summaryActivity.orderPrice = summaryActivity.orderPrice + total+"\n";
            totalOrder = totalOrder + total;
        }
        summaryActivity.orderTotal = String.valueOf(totalOrder);
        Intent i = new Intent(this, summaryActivity.class);
        startActivity(i);
    }

}