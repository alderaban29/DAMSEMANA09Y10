package com.example.damsem10;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnSnackBar;
    Button btnSnackBar1;
    Button btnSnackBar2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSnackBar = findViewById(R.id.button1snackbar);
        btnSnackBar.setOnClickListener(this);
        btnSnackBar1 = findViewById(R.id.button2snackbar);
        btnSnackBar1.setOnClickListener(this);
        btnSnackBar2 = findViewById(R.id.button3snackbar);
        btnSnackBar2.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.button1snackbar){
            Snackbar.make(view, "Mensaje de Tipo SnackBar", Snackbar.LENGTH_LONG).show();
        }
        if(view.getId()==R.id.button2snackbar){
            Snackbar.make(view, "Mensaje de Tipo SnackBar", Snackbar.LENGTH_SHORT).show();
        }
        if(view.getId()==R.id.button3snackbar){
            Snackbar.make(view, "Mensaje de Tipo SnackBar", Snackbar.LENGTH_INDEFINITE).show();
        }
    }
}