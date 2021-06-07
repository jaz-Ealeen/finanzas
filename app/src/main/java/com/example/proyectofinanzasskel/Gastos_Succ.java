package com.example.proyectofinanzasskel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Gastos_Succ extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gastos_succ);
        button = findViewById(R.id.btnSuccess);
        button.setOnClickListener(v -> {
            Intent intent = new Intent(Gastos_Succ.this, Balance_General.class);
            startActivity(intent);
        });
    }
}