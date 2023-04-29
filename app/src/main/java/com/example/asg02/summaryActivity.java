package com.example.asg02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class summaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.summary);
    }
    public void btnPayment(View view){
        Toast.makeText(getApplicationContext(),"Fuck you",Toast.LENGTH_SHORT).show();
//        Insert the payment logic here
//        If the value is not the same as the order total, give out error toast
//        If the same, go to home and pop up toast 'payment successful'
    }
}