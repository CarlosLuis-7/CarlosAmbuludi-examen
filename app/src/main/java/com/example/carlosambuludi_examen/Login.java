package com.example.carlosambuludi_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {


    EditText editUsuario, editPassword;
    Button btnLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editUsuario = (EditText) findViewById(R.id.txtUsuario);
        editPassword = (EditText) findViewById(R.id.txtPassword);
        btnLogin = (Button) findViewById(R.id.btnLogin);

    }



    public void ingresarLogin (View v){
        String nombre, usuario;
        nombre = editUsuario.getText().toString();
        usuario = editPassword.getText().toString();

        if (nombre.equals("estudiante2019") && usuario.equals("uisrael2019")){
            Intent abrir_v2 = new Intent(Login.this, Registro.class);
            abrir_v2.putExtra( "datoEnviado", editUsuario.getText().toString());
            startActivity(abrir_v2);
            Toast.makeText(getApplicationContext(), "Bienvenido", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(getApplicationContext(), "Dato incorrecto", Toast.LENGTH_LONG).show();
    }






    }
}
