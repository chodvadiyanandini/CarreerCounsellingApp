package com.example.fivepagesscreenshotes;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    AppCompatButton nextbtn;
    TextView txtskip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initview();
        skip();

    }

    private void skip() {
        txtskip=findViewById(R.id.txtskip);
        txtskip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, SignUpActivity.class);
                startActivity(i);
            }
        });
    }

    private void initview() {
        nextbtn = findViewById(R.id.nextbtn);
        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(i);
            }
        });
    }

    public void onBackPressed()
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Exit");
        builder.setMessage("Do you want exit?");
        builder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                MainActivity.this.finish();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        AlertDialog d=builder.create();
        d.setCancelable(false);
        d.show();
    }
}