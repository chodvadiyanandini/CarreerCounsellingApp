package com.example.fivepagesscreenshotes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    AppCompatButton nextbtn;
    TextView txtskip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initview();

        skip();
    }

    private void skip() {
        txtskip=findViewById(R.id.txtskip);
        txtskip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SecondActivity.this, SignUpActivity.class);
                startActivity(i);
            }
        });
    }


    private void initview() {
        nextbtn = findViewById(R.id.nextbtn);
        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(SecondActivity.this, ThirdActivity.class);
                startActivity(i);
            }
        });
    }
}