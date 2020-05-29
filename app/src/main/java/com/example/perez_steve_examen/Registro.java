package com.example.perez_steve_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Registro extends AppCompatActivity {
    TextView Nombre, nom1;
    EditText MontoInicial, total;
    Bundle dato;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        Nombre=findViewById(R.id.txnombre1);
        MontoInicial=findViewById(R.id.etMonto);
        total=findViewById(R.id.etTotal);
        nom1=findViewById(R.id.etNombre);

        dato=getIntent().getExtras();
        String datoRecibido=dato.getString("nombreusuario");
        Nombre.setText(datoRecibido);
    }

    public void Calcular(View v){
        double Costo=1800;
        double Mi,subtotal,totalm;

        Mi=Double.parseDouble(MontoInicial.getText().toString());
        subtotal=(Costo-Mi)/3;
        totalm=(subtotal*0.05)+subtotal;

        total.setText(Double.toString(totalm));

    }

    public void Guardar(View v){
        Intent enviar=new Intent(Registro.this, Encuesta.class);
     //   Intent enviar1=new Intent(Registro.this, Resumen.class);
        enviar.putExtra("guardarnombre", nom1.getText().toString());
        enviar.putExtra("guardarvalor", total.getText().toString());
        enviar.putExtra("usuario2",Nombre.getText().toString());
        startActivity(enviar);
        Toast.makeText(getApplicationContext(), "Nombre y Valor guardados correctamente", Toast.LENGTH_LONG).show();
    }
}
