package com.example.taller1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText id_usuario;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        id_usuario = (EditText)findViewById(R.id.id_usuario);


    }


    //Boton Iniciar sesion
    public void Iniciar_sesion (View view) {
        Intent iniciar_sesion = new Intent(this, welcomeActivity.class);
        iniciar_sesion.putExtra("nombre_usuario",id_usuario.getText().toString());
        Toast.makeText(this, "Ingresado con exito", Toast.LENGTH_SHORT).show();
        startActivity(iniciar_sesion);

    }
    //Boton Registrarse
    public void Registro (View view) {
        Intent registro = new Intent(this, Registro.class);
        startActivity(registro);

    }
}