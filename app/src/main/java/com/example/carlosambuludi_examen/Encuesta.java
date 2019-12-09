package com.example.carlosambuludi_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class Encuesta extends AppCompatActivity {

    CheckBox op1, op2, op3;
    RadioButton rbOp1, rbO2;
    EditText editPregunta1;
    TextView txtResultado1, txtResultado2, txtResultado3, txtNombre, txtUsuario;
    Bundle datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encuesta);

        op1 = findViewById(R.id.cbFutbol);
        op2 = findViewById(R.id.cbAtletismo);
        op3 = findViewById(R.id.cbNatacion);

        rbOp1 = findViewById(R.id.rbOp1);
        rbO2 = findViewById(R.id.rbOp2);

        editPregunta1 = findViewById(R.id.EditPregunta1);

        txtResultado1 = findViewById(R.id.txtResultado1);
        txtResultado2 = findViewById(R.id.txtResultado2);
        txtResultado3 = findViewById(R.id.txtResultado3);
        txtNombre = findViewById(R.id.txtNombre);
        txtUsuario = findViewById(R.id.txtUsuario);
        datos = getIntent().getExtras();
        String datoRecibido = datos.getString("datoEnviado");
        String datoRecibidoUsuario = datos.getString("datoEnviadoUsuario");
        txtNombre.setText(datoRecibido);
        txtUsuario.setText(datoRecibidoUsuario);


    }


    public void mostrar1 (View v){
        txtResultado1.setText(editPregunta1.getText());
    }



    public void mostrar2 (View v){
        if (op1.isChecked()==true){
            //  Toast.makeText(getApplicationContext(),"Selecciono" + op1.getText(),Toast.LENGTH_LONG).show();
            txtResultado2.setText(op1.getText());
        }  if (op2.isChecked()==true){
            txtResultado2.setText(op2.getText());
        } if (op3.isChecked()==true){
            txtResultado2.setText(op3.getText());
        } if (op1.isChecked()==true && op2.isChecked()==true){
            txtResultado2.setText(op1.getText()+"//"+op2.getText().toString());
        }  if (op2.isChecked()==true && op3.isChecked()==true){
            txtResultado2.setText(op2.getText()+"//"+op3.getText().toString());
        } if (op1.isChecked()==true && op3.isChecked()==true){
            txtResultado2.setText(op1.getText()+"//"+op3.getText().toString());
        } if (op1.isChecked()==true && op2.isChecked()==true && op3.isChecked()==true){
            txtResultado2.setText(op1.getText()+"//"+op2.getText().toString()+"//"+op3.getText().toString());
        }






    }


    public void MostrarRB (View v){
        if (rbOp1.isChecked()){
            //  Toast.makeText(getApplicationContext(),"Selecciono" + rbOpcion1.getText(),Toast.LENGTH_LONG).show();
            //  String resultadoP2 = null;
            //  resultadoP2 = rbOpcion1.getText().toString();
            txtResultado3.setText(rbOp1.getText());

        } else if (rbO2.isChecked()){
            txtResultado3.setText(rbO2.getText());
        }

        Intent abrir_v2 = new Intent(Encuesta.this, Resumen.class );
        abrir_v2.putExtra( "datoEnviado1", txtResultado1.getText().toString());
        abrir_v2.putExtra( "datoEnviado2", txtResultado2.getText().toString());
        abrir_v2.putExtra( "datoEnviado3", txtResultado3.getText().toString());
        abrir_v2.putExtra( "datoEnviado", txtNombre.getText().toString());
        abrir_v2.putExtra( "datoEnviadoUsuario", txtUsuario.getText().toString());


        startActivity(abrir_v2);

    }






}
