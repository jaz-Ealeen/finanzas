package com.example.proyectofinanzasskel;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
//metodo siguiente
public class MainActivity extends AppCompatActivity {
    TextView textView,textview2;
    EditText correo, contrasenia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        correo = findViewById(R.id.id_usuario);
        contrasenia = findViewById(R.id.id_password);
        textview2 = findViewById(R.id.id_login);
        textview2.setOnClickListener(v -> {
            login();
        });
        textView = (TextView)findViewById(R.id.id_registrateaqui);
        textView.setOnClickListener(v -> {

            Intent intent = new Intent(MainActivity.this, Registro.class);
            startActivity(intent);
            Toast.makeText(MainActivity.this, "¡Bienvenido a FINANZAS KEL!", Toast.LENGTH_LONG).show();

        });
    }

    private void login() {
        String Correo = correo.getText().toString().trim();
        String Contrasenia = contrasenia.getText().toString().trim();
        Integer Id;
        if (Correo.equals("") || Contrasenia.equals("")){
            Toast.makeText(MainActivity.this, "Rellena todos los campos", Toast.LENGTH_LONG).show();

        }else {
            if (AppDatabase.getDatabase(getApplicationContext()).userDao().Buscarlogin(Correo, Contrasenia)) {
                UserModel equisde = AppDatabase.getDatabase(getApplicationContext()).userDao().traer(Correo,Contrasenia);
                Id = AppDatabase.getDatabase(getApplicationContext()).userDao().traer(Correo,Contrasenia).getUid();
                Intent intent = new Intent(MainActivity.this, DatosPerfil.class);
                intent.putExtra("Id", Id);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "¡Bienvenido a FINANZAS KEL!", Toast.LENGTH_LONG).show();
            }
            else{
                Toast.makeText(MainActivity.this, " Datos incorrectos!", Toast.LENGTH_LONG).show();


            }
        }



    }
}

