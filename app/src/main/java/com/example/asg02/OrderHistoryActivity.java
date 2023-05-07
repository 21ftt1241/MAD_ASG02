package com.example.asg02;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class OrderHistoryActivity extends AppCompatActivity {

    static String orderHistory = "";
    static int order = 0;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_history);

        TextView updateHistory = findViewById(R.id.historyText);

        if(summaryActivity.historyUpdate) {

            orderHistory = "";

            for (int i = 0; i < OrderPageActivity.arrQty.size(); i++){
                updateHistory.setText("Quantity\t\t\t" + "Item\t\t\t" + "Price\t\t\t" + "\n" + orderHistory + "\n");
                orderHistory += OrderPageActivity.arrQty.get(i).replace("\n", "") + "\t\t\t" +
                        OrderPageActivity.arrItem.get(i).replace("\n", "") + "\t\t\t" +
                        OrderPageActivity.arrPrice.get(i).replace("\n", "") + "\n";

            }
            orderHistory += "Total:"+ OrderPageActivity.totalOrder + "\n";

            summaryActivity.orderPrice = "";
            summaryActivity.orderQty = "";
            summaryActivity.orderItem = "";
            OrderPageActivity.totalOrder = 0;

        }

    }

    public void homeBtn(View view){
        Intent i = new Intent(this, HomeActivity.class);
        startActivity(i);

    }
}