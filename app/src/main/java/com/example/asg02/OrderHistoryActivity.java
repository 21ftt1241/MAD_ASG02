package com.example.asg02;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.sql.Array;
import java.util.ArrayList;

public class OrderHistoryActivity extends AppCompatActivity {

    static ArrayList<String> finalReceipt = new ArrayList<String>();
    static String finalOrder = "";
//    static String finalSummary = "";
    static int order = 1;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_history);

        TextView updateHistory = findViewById(R.id.historyText);

        if(summaryActivity.historyUpdate) {

            String orderHistory = "";

            orderHistory = "";
            boolean x = true;
            for (int i = 0; i < OrderPageActivity.arrQty.size(); i++) {

                orderHistory += OrderPageActivity.arrQty.get(i).replace("\n", "") + "           " +

                        OrderPageActivity.arrItem.get(i).replace("\n", "") + "\t\t\t" +
                        OrderPageActivity.arrPrice.get(i).replace("\n", "") + "\n";

                updateHistory.setText("Quantity\t\t\t" + "Item\t\t\t" + "Price\t\t\t" + "\n" + orderHistory);
            }
              
            finalOrder += "Order #" + order + "\nQuantity\t\t\t" + "Item\t\t\t" + "Price\t\t\t" + "\n" + orderHistory + "\n";
            order++;
            finalReceipt.add(finalOrder);
//            orderHistory += "Total:"+ OrderPageActivity.totalOrder + "\n";

            summaryActivity.orderPrice = "";
            summaryActivity.orderQty = "";
            summaryActivity.orderItem = "";
            OrderPageActivity.totalOrder = 0;

            for(int k=0; k<OrderPageActivity.arrQty.size(); k++) {
                OrderPageActivity.arrQty.remove(0);
                OrderPageActivity.arrItem.remove(0);
                OrderPageActivity.arrPrice.remove(0);
            }

            summaryActivity.historyUpdate = false;

        }

        for(int j=0; j<finalReceipt.size(); j++) {
            String finalSummary = "";
            finalSummary += finalReceipt.get(j);

            updateHistory.setText(finalSummary);
        }

//        updateHistory.setText(finalSummary);
        // test

    }

    public void homeBtn(View view){
        Intent i = new Intent(this, HomeActivity.class);
        startActivity(i);

    }
}