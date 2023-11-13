package com.example.patientmonitoring;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.google.firebase.auth.FirebaseAuth;

public class RegisterActivity extends AppCompatActivity {
    private  EditText Reg_username,Reg_password;
   private Button btnregister;
   FirebaseAuth Reg_auth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Reg_username = findViewById(R.id.Reg_password);
        Reg_password = findViewById(R.id.Reg_password);
        btnregister=findViewById(R.id.btnregister);
        Reg_auth=FirebaseAuth.getInstance();

        btnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

}