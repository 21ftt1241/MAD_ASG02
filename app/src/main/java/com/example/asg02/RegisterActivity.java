package com.example.asg02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
    }

    public void registerAccount(View view) {

//        Getting text from textfiled
        EditText usernameTemp = findViewById(R.id.registerUsername);
        EditText passwordTemp = findViewById(R.id.registerPassword);

        if(usernameTemp.getText().toString().equals("")) {
//            To make sure user fill in both fields
            Toast.makeText(getApplicationContext(),"Please fill in both fields.",Toast.LENGTH_SHORT).show();
            usernameTemp.setError("Please enter username.");
        } else if(passwordTemp.getText().toString().equals("")) {
            Toast.makeText(getApplicationContext(),"Please fill in both fields.",Toast.LENGTH_SHORT).show();
            passwordTemp.setError("Please enter password.");
        } else {
            LoginActivity.username = usernameTemp.getText().toString();
            LoginActivity.password = passwordTemp.getText().toString();

            Toast.makeText(getApplicationContext(),"Registration Successful.",Toast.LENGTH_SHORT).show();

            Intent i = new Intent(this, LoginActivity.class);
            startActivity(i);
        }

    }
}