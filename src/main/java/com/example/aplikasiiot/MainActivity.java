package com.example.aplikasiiot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText eUsername;
    private EditText ePassword;
    private Button eLogin;
    private TextView eAttempts;

    private String Username = "admin";
    private String Password = "1234";

    boolean isValid = false;
    private int counter = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eUsername = findViewById(R.id.editUsername);
        ePassword = findViewById(R.id.editPassword);
        eLogin = findViewById(R.id.btnLogin);
        eAttempts = findViewById(R.id.txInfo);
        eLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                String inputUsername = eUsername.getText().toString();
                String inputPassword = ePassword.getText().toString();

                if (inputUsername.isEmpty() || inputPassword.isEmpty()){

                    Toast.makeText(MainActivity.this,"Masukkan username dan password ", Toast.LENGTH_SHORT).show();

                }
                else{

                    isValid = validate(inputUsername, inputPassword);

                    if(!isValid){
                        counter--;

                        Toast.makeText(MainActivity.this,"Masukkan username dan password dengan benar!", Toast.LENGTH_SHORT).show();

                        eAttempts.setText("No. of attemps remaining: " + counter);
                        if(counter == 0){
                            eLogin.setEnabled(false);
                        }
                    }
                    else {
                        Toast.makeText(MainActivity.this,"Login berhasil :)", Toast.LENGTH_SHORT).show();

                        //Menambahkan aktifitas baru

                        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                        startActivity(intent);


                    }



                }
            }
        });

    }

    private boolean validate(String name, String pass){
        if(name.equals(Username) && pass.equals(Password)){

            return true;
        }
        return false;
    }
}