package com.example.carlosambuludi_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Registro extends AppCompatActivity {

    Bundle datos;
    TextView  recibirInf;
    EditText txtNombre;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        recibirInf= findViewById(R.id.txt_Usuario);
        datos = getIntent().getExtras();
        String datoRecibido = datos.getString("datoEnviado");
        recibirInf.setText(datoRecibido);
        txtNombre = findViewById(R.id.txtNombre);


    }

    public void Guardar (View v){

        Intent abrir_v2 = new Intent(Registro.this, Encuesta.class );
        abrir_v2.putExtra( "datoEnviado", txtNombre.getText().toString());
        abrir_v2.putExtra( "datoEnviadoUsuario", recibirInf.getText().toString());
        startActivity(abrir_v2);

    }

}
