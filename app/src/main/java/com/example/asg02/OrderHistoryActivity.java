package com.example.asg02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class OrderHistoryActivity extends AppCompatActivity {

    static String history = "";
    static int order = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_history);

        if(summaryActivity.historyUpdate == true) {

//            Doesnt work, separate individual value by \n and store into arrays, then combine all arraya together to form one sentence.
//            Use loop to display all sentences.

            String space = "                ";
            String removeN = summaryActivity.orderQty.replace("\n", "") + space + summaryActivity.orderItem.replace("\n", "") + "            " + summaryActivity.orderPrice.replace("\n", "");

            history += "Order #" + order + "\n\n" +
                    "QTY" + space + "Order" + space + "$\n" +
                    removeN;

            TextView updateHistory = findViewById(R.id.historyText);
            updateHistory.setText(history);

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