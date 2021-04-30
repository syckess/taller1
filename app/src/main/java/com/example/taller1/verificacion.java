package com.example.taller1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class verificacion extends AppCompatActivity {

    private TextView id_email_registrado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verificacion);

        id_email_registrado = (TextView)findViewById(R.id.id_email_registrado);

        String aux2 = getIntent().getStringExtra("email_usuario");
        id_email_registrado.setText(" " + aux2);

    }

    //Boton volver al inicio
    public void Volver_inicio (View view) {
        Intent volver_inicio = new Intent(this, MainActivity.class);
        startActivity(volver_inicio);

    }

}