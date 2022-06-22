package com.example.fivepagesscreenshotes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ThirdActivity extends AppCompatActivity {
    AppCompatButton btnsignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        initview();
    }

        private void initview () {
            btnsignup = findViewById(R.id.btnsignup);
            btnsignup.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent i = new Intent(ThirdActivity.this, SignUpActivity.class);
                    startActivity(i);
                }
            });
        }
    }