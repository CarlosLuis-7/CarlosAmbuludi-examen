package com.example.carlosambuludi_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Resumen extends AppCompatActivity {


    Bundle datos;
    TextView recibir1, recibir2, recibir3, txtEstudiante, txtUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumen);

        recibir1 = findViewById(R.id.txtRecibir1);
        recibir2 = findViewById(R.id.txtRecibir2);
        recibir3 = findViewById(R.id.txtRecibir3);
        txtEstudiante = findViewById(R.id.txtNombre);
        txtUsuario = findViewById(R.id.txt_Usuario);

        datos = getIntent().getExtras();







        String datoRecibido = datos.getString("datoEnviado");
        String datoRecibido1 = datos.getString("datoEnviado1");
        String datoRecibido2 = datos.getString("datoEnviado2");
        String datoRecibido3 = datos.getString("datoEnviado3");
        String datoRecibidoUsuario = datos.getString("datoEnviadoUsuario");



        recibir1.setText(datoRecibido1);
        recibir2.setText(datoRecibido2);
        recibir3.setText(datoRecibido3);
        txtEstudiante.setText(datoRecibido);
        txtUsuario.setText(datoRecibidoUsuario);

    }
}
