package com.example.taller1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Registro extends AppCompatActivity {

    private EditText id_email_usuario;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        id_email_usuario = (EditText)findViewById(R.id.id_email_usuario);
    }

    //Boton Registrarse
    public void Registro_final (View view) {
        Intent registro_final = new Intent(this, verificacion.class);
        registro_final.putExtra("email_usuario",id_email_usuario.getText().toString());
        Toast.makeText(this, "Registrado con exito", Toast.LENGTH_SHORT).show();
        startActivity(registro_final);
    }

    //Boton iniciar sesion
    public void Iniciar_sesion (View view) {
        Intent iniciar_sesion = new Intent(this, MainActivity.class);
        startActivity(iniciar_sesion);

    }


}