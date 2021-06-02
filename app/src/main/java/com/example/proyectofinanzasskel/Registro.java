package com.example.proyectofinanzasskel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class Registro extends AppCompatActivity {
    //metodo siguiente
    TextView textView;
    EditText nombre, apellido_paterno, apellido_materno, correo, edad, contrasenia, celular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        nombre = findViewById(R.id.nombre_text);
        apellido_paterno = findViewById(R.id.paterno_text);
        apellido_materno = findViewById(R.id.materno_text);
        edad = findViewById(R.id.EdadText);
        correo = findViewById(R.id.email);
        celular = findViewById(R.id.telefono);
        contrasenia = findViewById(R.id.password);


        textView = (TextView) findViewById(R.id.boton_registrar);
        textView.setOnClickListener(v -> {
            guardar();
        });

    }

    private void guardar() {
        String Nombre = nombre.getText().toString();

        String ap_paterno = apellido_paterno.getText().toString().trim();
        String ap_materno = apellido_materno.getText().toString().trim();
        String Edad = edad.getText().toString().trim();
        String Correo = correo.getText().toString().trim();
        String Celular = celular.getText().toString().trim();
        String Contrasenia = contrasenia.getText().toString().trim();
        if (Nombre.equals("") || ap_paterno.equals("") || ap_materno.equals("") || Edad.equals("") ||
                Correo.equals("") || Celular.equals("") || Contrasenia.equals("")) {
            Toast.makeText(Registro.this, "Rellena todos los campos", Toast.LENGTH_LONG).show();

    }
        else

    {
        //verifica que no exista un correo igual
        if (!AppDatabase.getDatabase(getApplicationContext()).userDao().Buscarregistro(Correo)) {

            UserModel model = new UserModel();

            model.setNombre(Nombre);
            model.setApellido_paterno(ap_paterno);
            model.setApellido_materno(ap_materno);
            model.setEdad(Edad);
            model.setCorreo(Correo);
            model.setContrasenia(Contrasenia);
            model.setTelefono(Celular);
            AppDatabase.getDatabase(getApplicationContext()).userDao().Insertar(model);

            Intent siguienteregistro = new Intent(this, ExitosoRegistro.class);
            startActivity(siguienteregistro);
            Toast.makeText(Registro.this, "¡REGISTRO EXITOSO :D!", Toast.LENGTH_LONG).show();
        } else {
            textView.setOnClickListener(v -> {
                Intent intent = new Intent(Registro.this, NoexitosoRegistro.class);
                startActivity(intent);
                Toast.makeText(Registro.this, "Registro no exitoso :c", Toast.LENGTH_LONG).show();
            });
            //si existe un usuario con ese correo
            //error
        }

    }

}

    //metodo para el boton anterior anterior

    public void Anterior (View view) {
        Intent anterior = new Intent(this, MainActivity.class);
        startActivity(anterior);
    }
}

