package com.example.asg02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AppAuth extends AppCompatActivity {

    static String username = "";
    static String password = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appauth);
    }

    public void register(View view){
        Intent i = new Intent(this, RegisterActivity.class);
        startActivity(i);
    }

    public void login(View view){

        EditText inputUsernameTemp = findViewById(R.id.inputUsername);
        EditText inputPasswordTemp = findViewById(R.id.inputPassword);

        if(inputUsernameTemp.getText().toString().equals(username) && inputPasswordTemp.getText().toString().equals(password) && !inputUsernameTemp.getText().toString().equals("") && !inputPasswordTemp.getText().toString().equals("")) {
            Intent i = new Intent(this, HomeActivity.class);
            startActivity(i);
        } else if(!inputUsernameTemp.getText().toString().equals(username) || inputUsernameTemp.getText().toString().equals("")) {
            Toast.makeText(getApplicationContext(),"Username not found.",Toast.LENGTH_SHORT).show();
        } else if(!inputPasswordTemp.getText().toString().equals(password) || inputPasswordTemp.getText().toString().equals("")) {
            Toast.makeText(getApplicationContext(),"Password incorrect.",Toast.LENGTH_SHORT).show();
        }

    }

}