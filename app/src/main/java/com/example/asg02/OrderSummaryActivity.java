package com.example.asg02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class OrderSummaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_summary);

        String receipt;

        // Enabling access to ids in another class/layout? UPDATE: Doesnt matter as americano is 0 when page changes. Update static variable here when orderConfirm button is pressed
        View inflatedView = getLayoutInflater().inflate(R.layout.order_page, null);
        TextView testing = inflatedView.findViewById(R.id.americanoNumber);

        if((Integer.parseInt(testing.getText().toString())) == 0) {
            TextView orderSummary = findViewById(R.id.orderSummary);

            receipt = "\n" + testing.getText().toString() + " Americano ordered - Price: " + 2.50*(Integer.parseInt(testing.getText().toString()));

            orderSummary.setText(receipt);
        }
    }
}