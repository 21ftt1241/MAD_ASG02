package com.example.asg02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class OrderPageActivity extends AppCompatActivity {

    TextView textview;
    int number;
    int lemonQty, oolongQty, greenTeaQty, americcanoQty, latteQty, cappucinoQty;
    double americanoPrice = 2.50;
    double lattePrice = 3.50;
    double cappucinoPrice = 4.00;
    double greenTeaPrice = 3.00;
    double lemonPrice = 1.50;
    double oolongPrice = 2.00;

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

    static ArrayList<String> arrQty = new ArrayList<String>();
    static ArrayList<String> arrItem = new ArrayList<String>();
    static ArrayList<String> arrPrice = new ArrayList<String>();

    public void confirmOrder(View view) {
        if (americcanoQty > 0){
            double total = americcanoQty * americanoPrice;
            summaryActivity.orderQty1 = String.valueOf(americcanoQty);
            summaryActivity.orderItem1 = "Americano";
            summaryActivity.orderPrice1 = String.valueOf(total);

            summaryActivity.orderQty = summaryActivity.orderQty + americcanoQty +"\n";
            summaryActivity.orderItem = summaryActivity.orderItem + "Americano" +"\n";
            summaryActivity.orderPrice = summaryActivity.orderPrice + total +"\n";
            totalOrder = totalOrder + total;

            arrQty.add(summaryActivity.orderQty1);
            arrItem.add(summaryActivity.orderItem1);
            arrPrice.add(summaryActivity.orderPrice1);
        }
        if (latteQty > 0){
            double total = latteQty * lattePrice;
            summaryActivity.orderQty1 = String.valueOf(latteQty);
            summaryActivity.orderItem1 = "Latte";
            summaryActivity.orderPrice1 = String.valueOf(total);

            summaryActivity.orderQty = summaryActivity.orderQty + latteQty +"\n";
            summaryActivity.orderItem = summaryActivity.orderItem + "Latte" +"\n";
            summaryActivity.orderPrice = summaryActivity.orderPrice + total +"\n";
            totalOrder = totalOrder + total;

            arrQty.add(summaryActivity.orderQty1);
            arrItem.add(summaryActivity.orderItem1);
            arrPrice.add(summaryActivity.orderPrice1);
        }
        if (cappucinoQty > 0){
            double total = cappucinoQty * cappucinoPrice;
            summaryActivity.orderQty1 = String.valueOf(cappucinoQty);
            summaryActivity.orderItem1 = "Cappucino";
            summaryActivity.orderPrice1 = String.valueOf(total);

            summaryActivity.orderQty = summaryActivity.orderQty + cappucinoQty+"\n";
            summaryActivity.orderItem = summaryActivity.orderItem + "Cappucino"+"\n";
            summaryActivity.orderPrice = summaryActivity.orderPrice + total+"\n";
            totalOrder = totalOrder + total;

            arrQty.add(summaryActivity.orderQty1);
            arrItem.add(summaryActivity.orderItem1);
            arrPrice.add(summaryActivity.orderPrice1);
        }
        if (greenTeaQty > 0){
            double total = greenTeaQty * greenTeaPrice;
            summaryActivity.orderQty1 = String.valueOf(greenTeaQty);
            summaryActivity.orderItem1 = "Green Tea";
            summaryActivity.orderPrice1 = String.valueOf(total);

            summaryActivity.orderQty = summaryActivity.orderQty + greenTeaQty+"\n";
            summaryActivity.orderItem = summaryActivity.orderItem + "Green Tea"+"\n";
            summaryActivity.orderPrice = summaryActivity.orderPrice + total+"\n";
            totalOrder = totalOrder + total;

            arrQty.add(summaryActivity.orderQty1);
            arrItem.add(summaryActivity.orderItem1);
            arrPrice.add(summaryActivity.orderPrice1);
        }
        if (oolongQty > 0){
            double total = oolongQty * oolongPrice;
            summaryActivity.orderQty1 = String.valueOf(oolongQty);
            summaryActivity.orderItem1 = "Oolong Tea";
            summaryActivity.orderPrice1 = String.valueOf(total);

            summaryActivity.orderQty = summaryActivity.orderQty + oolongQty+"\n";
            summaryActivity.orderItem = summaryActivity.orderItem + "Oolong Tea"+"\n";
            summaryActivity.orderPrice = summaryActivity.orderPrice + total+"\n";
            totalOrder = totalOrder + total;

            arrQty.add(summaryActivity.orderQty1);
            arrItem.add(summaryActivity.orderItem1);
            arrPrice.add(summaryActivity.orderPrice1);

        }
        if (lemonQty > 0){
            double total = lemonQty * lemonPrice;
            summaryActivity.orderQty1 = String.valueOf(lemonQty);
            summaryActivity.orderItem1 = "Lemon Tea";
            summaryActivity.orderPrice1 = String.valueOf(total);

            summaryActivity.orderQty = summaryActivity.orderQty + lemonQty+"\n";
            summaryActivity.orderItem = summaryActivity.orderItem + "Lemon Tea"+"\n";
            summaryActivity.orderPrice = summaryActivity.orderPrice + total+"\n";
            totalOrder = totalOrder + total;

            arrQty.add(summaryActivity.orderQty1);
            arrItem.add(summaryActivity.orderItem1);
            arrPrice.add(summaryActivity.orderPrice1);
        }
        summaryActivity.orderTotal = String.valueOf(totalOrder);
        Intent i = new Intent(this, summaryActivity.class);
        startActivity(i);

    }

}