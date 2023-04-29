package com.example.asg02;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HistoryPageActivity extends AppCompatActivity {
    private LinearLayout mainLayout;
    private Button createLayoutButton;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainLayout = findViewById(R.id.main_layout);
        createLayoutButton = findViewById(R.id.create_layout_button);

        createLayoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new TextView and add it to the main layout
                TextView newTextView = new TextView(HistoryPageActivity.this);
                newTextView.setText("Hello, World!");
                mainLayout.addView(newTextView);
            }
        });
    }
}