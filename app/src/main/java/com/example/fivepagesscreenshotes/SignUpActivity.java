package com.example.fivepagesscreenshotes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SignUpActivity extends AppCompatActivity {


    AppCompatButton btnsignup;
    TextView txtlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        initview();
    }

    private void initview() {

        txtlogin=findViewById(R.id.txtlogin);
        txtlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(SignUpActivity.this, LoginActivity.class);
                startActivity(i);
            }
        });

    }
}