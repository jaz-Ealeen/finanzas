package com.example.proyectofinanzasskel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Ingreso_Succ extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingreso_succ);

        textView = findViewById(R.id.button4);

        textView.setOnClickListener(v ->{
            Intent intent = new Intent(Ingreso_Succ.this, Balance_General.class);
            startActivity(intent);
            Toast.makeText(Ingreso_Succ.this, "", Toast.LENGTH_LONG).show();
        });

    }
}