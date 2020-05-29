package com.example.perez_steve_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Resumen extends AppCompatActivity {
    EditText monto;
    TextView usuario, Nombre, centro, fut, bas, ten, sino;
    Bundle dato;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumen);
        dato=getIntent().getExtras();
        usuario=findViewById(R.id.txtUsuario1);
        String datoRecibido=dato.getString("usuario3");
        usuario.setText(datoRecibido);

        Nombre=findViewById(R.id.txtNombre);
        String datoRecibido1=dato.getString("nombre1");
        Nombre.setText(datoRecibido1);

        monto=findViewById(R.id.etPagar);
        String datoRecibido2=dato.getString("total1");
        monto.setText(datoRecibido2);

        centro=findViewById(R.id.txtComentario);
        String datoRecibido3=dato.getString("guardarcentro");
        centro.setText(datoRecibido3);

        fut=findViewById(R.id.txtFutbol);
        String datoRecibido4=dato.getString("fut");
        fut.setText(datoRecibido4);

        ten=findViewById(R.id.txtTenis);
        String datoRecibido5=dato.getString("ten");
        ten.setText(datoRecibido5);

        bas=findViewById(R.id.txtBasquet);
        String datoRecibido6=dato.getString("bas");
        bas.setText(datoRecibido6);

        sino=findViewById(R.id.txtSino);
        String datoRecibido7=dato.getString("sino");
        sino.setText(datoRecibido7);

    }
}
