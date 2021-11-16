package com.example.aplikasiiot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.pusher.pushnotifications.PushNotifications;

public class SecondActivity extends AppCompatActivity {
    Button open;
    Button lock;
    Button rfid;
    Button akun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        PushNotifications.start(getApplicationContext(), "3dc75359-f86e-4b81-9c16-d4b27130f033");
        PushNotifications.addDeviceInterest("hello");

        open = (Button) findViewById(R.id.tombolopen);
        lock = (Button) findViewById(R.id.tombollock);
        rfid = (Button) findViewById(R.id.tombolrfid);
        akun = (Button) findViewById(R.id.tombolakun);


        open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Write a message to the database
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("RELAY_STATUS");

                myRef.setValue(1);
                Toast.makeText(SecondActivity.this,"Door Open", Toast.LENGTH_SHORT).show();
            }
        });
        lock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Write a message to the database
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("RELAY_STATUS");

                myRef.setValue(2);
                Toast.makeText(SecondActivity.this,"Door close", Toast.LENGTH_SHORT).show();
            }
        });


        rfid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Write a message to the database
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("RELAY_STATUS");

                myRef.setValue(3);
                Toast.makeText(SecondActivity.this,"RFID dapat digunakan", Toast.LENGTH_SHORT).show();
            }
        });

        akun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(SecondActivity.this, Akunactivity.class);
                startActivity(intent);
                Toast.makeText(SecondActivity.this,"Tambah dan edit serial number", Toast.LENGTH_SHORT).show();
            }
        });


    }


}