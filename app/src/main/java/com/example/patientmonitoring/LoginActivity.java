package com.example.patientmonitoring;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        EditText username=findViewById(R.id.username);
        EditText password=findViewById(R.id.password);
        Button btnlogin=findViewById(R.id.btnlogin);
        Intent login_page;
        login_page= new Intent(LoginActivity.this,MainActivity.class);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().equals("admin") && (password.getText().toString().equals("admin"))){
                    Toast.makeText(LoginActivity.this, "LOGIN SUCCESSFUL", Toast.LENGTH_SHORT).show();
                    startActivity(login_page);
                }
                else{
                    Toast.makeText(LoginActivity.this, "LOGIN FAILED", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}