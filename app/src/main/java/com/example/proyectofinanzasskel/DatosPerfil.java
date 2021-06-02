package com.example.proyectofinanzasskel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class DatosPerfil extends AppCompatActivity {
    EditText contrasenia, correo;
    Button guardar;
    TextView nombre, ap_paterno, ap_materno;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos_perfil);
        correo = findViewById(R.id.id_email);
        contrasenia = findViewById(R.id.id_contra);
        nombre = findViewById(R.id.id_nombre);
        ap_materno = findViewById(R.id.id_materno);
        ap_paterno = findViewById(R.id.id_appaterno);
        Integer id = getIntent().getExtras().getInt("Id");
        UserModel user =AppDatabase.getDatabase(getApplicationContext()).userDao().traerporid(id);
         nombre.setText(user.getNombre());
         ap_paterno.setText(user.getApellido_paterno());
        ap_materno.setText(user.getApellido_materno());
        correo.setText(user.getCorreo());
        contrasenia.setText(user.getContrasenia());
        guardar = findViewById(R.id.button);
        guardar.setOnClickListener(v -> {
            user.setCorreo(correo.getText().toString());
            user.setContrasenia(contrasenia.getText().toString());
            AppDatabase.getDatabase(getApplicationContext()).userDao().actualizar(user);
            Toast.makeText(getApplicationContext(), "¡Usuario Actualizado!", Toast.LENGTH_LONG).show();

        });

        button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(v -> {
            Intent intent = new Intent(DatosPerfil.this, Categorias.class);
            startActivity(intent);
            Toast.makeText(getApplicationContext(), "¡Agrega subcategorias a gastos!", Toast.LENGTH_LONG).show();
        });


    }

}
