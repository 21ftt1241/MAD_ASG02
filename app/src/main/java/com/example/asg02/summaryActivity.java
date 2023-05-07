package com.example.asg02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class summaryActivity extends AppCompatActivity {

    static String orderQty = "";
    static String orderItem = "";
    static String orderPrice = "";

    static String orderQty1 = "";
    static String orderItem1 = "";
    static String orderPrice1 = "";

    static String orderTotal = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.summary);

        TextView tvQty = findViewById(R.id.summaryQty);
        tvQty.setText(orderQty);

        TextView tvItem = findViewById(R.id.summaryItem);
        tvItem.setText(orderItem);

        TextView tvPrice = findViewById(R.id.summaryPrice);
        tvPrice.setText(orderPrice);

        TextView tvTotal = findViewById(R.id.summaryTotal);
        tvTotal.setText(orderTotal);

    }

    static boolean historyUpdate = false;

    public void btnPayment(View view){

        EditText payment = findViewById(R.id.inputPayment);

        if (payment.getText().toString().equals(orderTotal)) {
            Toast.makeText(getApplicationContext(), "Payment Successful", Toast.LENGTH_SHORT).show();

            historyUpdate = true;

            TextView tvQty = findViewById(R.id.summaryQty);
            tvQty.setText("");

            TextView tvItem = findViewById(R.id.summaryItem);
            tvItem.setText("");

            TextView tvPrice = findViewById(R.id.summaryPrice);
            tvPrice.setText("");

            TextView tvTotal = findViewById(R.id.summaryTotal);
            tvTotal.setText("");

            Intent i = new Intent(this, HomeActivity.class);
            startActivity(i);

        }else{
            Toast.makeText(getApplicationContext(), "Payment Failed", Toast.LENGTH_SHORT).show();
        }
    }
}