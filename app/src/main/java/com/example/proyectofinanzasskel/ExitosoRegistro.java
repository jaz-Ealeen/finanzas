package com.example.proyectofinanzasskel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ExitosoRegistro extends AppCompatActivity {
TextView textView;
@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exitosoregistro);
        textView = (TextView)findViewById(R.id.boton_siguientep);
        textView.setOnClickListener(v -> {
        Intent intent = new Intent( ExitosoRegistro.this,MainActivity.class);
        startActivity(intent);
        Toast.makeText(ExitosoRegistro.this, "¡Por favor inicia sesión!", Toast.LENGTH_LONG).show();
        });
}
}