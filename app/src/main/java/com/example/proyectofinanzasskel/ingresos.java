package com.example.proyectofinanzasskel;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ingresos extends AppCompatActivity {
    TextView textView;
    EditText ingreso, fecha, descripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingresos);
        ingreso = findViewById(R.id.editTextIngreso);
        descripcion = findViewById(R.id.editTextTextPersonName2);
        fecha = findViewById(R.id.editTextDate2);

        textView = findViewById(R.id.add2);
        textView.setOnClickListener(v -> {
            Intent intent = new Intent(ingresos.this, Ingreso_Succ.class);
            startActivity(intent);
            Toast.makeText(ingresos.this, "Ingreso añadido", Toast.LENGTH_LONG).show();
        });
    }


}