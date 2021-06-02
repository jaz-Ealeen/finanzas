package com.example.proyectofinanzasskel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class NoexitosoRegistro extends AppCompatActivity {
 Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noexitoso_registro);
        button = (Button) findViewById(R.id.btn_cancel);
        button.setOnClickListener(v -> {

            Intent intent = new Intent(NoexitosoRegistro.this, MainActivity.class);
            startActivity(intent);
        });

    }

//metodo anterior
    public void Anterior (View view) {
        Intent anterior = new Intent(NoexitosoRegistro.this, Registro.class);
        startActivity(anterior);
    }
}