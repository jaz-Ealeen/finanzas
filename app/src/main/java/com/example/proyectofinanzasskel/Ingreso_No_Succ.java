package com.example.proyectofinanzasskel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Ingreso_No_Succ extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingreso_no_succ);
        button = findViewById(R.id.button5);
        button.setOnClickListener(v -> {
            Intent intent = new Intent(Ingreso_No_Succ.this, ingresos.class);
            startActivity(intent);
        });
    }
}