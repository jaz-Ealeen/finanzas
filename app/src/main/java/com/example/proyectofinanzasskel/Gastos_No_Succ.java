package com.example.proyectofinanzasskel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Gastos_No_Succ extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gastos_no_succ);
        button = findViewById(R.id.button3);
        button.setOnClickListener(v -> {
            Intent intent = new Intent(Gastos_No_Succ.this, gastos.class);
            startActivity(intent);
        });
    }
}