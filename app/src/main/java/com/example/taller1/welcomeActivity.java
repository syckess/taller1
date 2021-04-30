package com.example.taller1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class welcomeActivity extends AppCompatActivity {

    private TextView id_usuario_iniciado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        id_usuario_iniciado = (TextView)findViewById(R.id.id_usuario_iniciado);

        String aux = getIntent().getStringExtra("nombre_usuario");
        id_usuario_iniciado.setText("Bienvenido " + aux);

    }


}