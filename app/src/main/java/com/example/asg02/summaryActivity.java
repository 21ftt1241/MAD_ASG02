package com.example.asg02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class summaryActivity extends AppCompatActivity {

    static String orderLine = "";
    static String orderQty = "";
    static String orderItem = "";
    static String orderPrice = "";


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

    }
    public void btnPayment(View view){
        Toast.makeText(getApplicationContext(),"Fuck you",Toast.LENGTH_SHORT).show();
//        Insert the payment logic here
//        If the value is not the same as the order total, give out error toast
//        If the same, go to home and pop up toast 'payment successful'
    }
}