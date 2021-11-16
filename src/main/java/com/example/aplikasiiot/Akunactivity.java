package com.example.aplikasiiot;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Akunactivity extends AppCompatActivity {
    private Button btninput;
    private EditText txtinput;
    private EditText IDinput;

    private FirebaseDatabase mDatabase;
    private DatabaseReference mRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akunactivity);

        mDatabase = FirebaseDatabase.getInstance();
        mRef = mDatabase.getReference("UserID");

        txtinput = (EditText) findViewById(R.id.valinput);
        btninput = (Button) findViewById(R.id.buttoninput);
        IDinput = (EditText) findViewById(R.id.idinput);

        btninput.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String value = txtinput.getText().toString();
                String key = IDinput.getText().toString();
                mRef.child(key).setValue(value);
                Toast.makeText(Akunactivity.this, "Berhasil ditambahkan", Toast.LENGTH_SHORT).show();


            }
        });
    }
}