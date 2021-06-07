package com.example.proyectofinanzasskel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class gastos extends AppCompatActivity {
    TextView textView;
    EditText gasto, fecha, descripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gastos);
        gasto = findViewById(R.id.editTextGastos);
        descripcion = findViewById(R.id.editTextTextPersonName);
        fecha = findViewById(R.id.editTextDate);

        textView = findViewById(R.id.add);
        textView.setOnClickListener(v -> {
            Intent intent = new Intent(gastos.this, Gastos_Succ.class);
            startActivity(intent);
        });
    }
}