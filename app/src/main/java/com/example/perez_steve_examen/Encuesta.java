package com.example.perez_steve_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Encuesta extends AppCompatActivity {
    TextView usuario, total, nombre;
    EditText cen;
    CheckBox fut, bas, ten;
    RadioButton si, no;
    Bundle dato;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encuesta);
        usuario=findViewById(R.id.txtnom);
        cen=findViewById(R.id.txtCentro);
        fut=findViewById(R.id.cbFutbol);
        bas=findViewById(R.id.cbBasquet);
        ten=findViewById(R.id.cbTenis);
        si=findViewById(R.id.rbSi);
        no=findViewById(R.id.rbNo);
        total=findViewById(R.id.txtTotal);
        nombre=findViewById(R.id.tvNombre);

        dato=getIntent().getExtras();
        String datoRecibido=dato.getString("usuario2");
        usuario.setText(datoRecibido);

        String datoRecibido2=dato.getString("guardarvalor");
        total.setText(datoRecibido2);

        String datoRecibido3=dato.getString("guardarnombre");
        nombre.setText(datoRecibido3);

    }
    public void Guardar(View v){
        Intent enviar=new Intent(Encuesta.this, Resumen.class);
        enviar.putExtra("usuario3",usuario.getText().toString());
        enviar.putExtra("total1",total.getText().toString());
        enviar.putExtra("nombre1",nombre.getText().toString());
        enviar.putExtra("guardarcentro", cen.getText().toString());
        if(fut.isChecked()==true){
            enviar.putExtra("fut",fut.getText().toString());
        }else{
            enviar.putExtra("fut","No practica futbol");
        }
        if(bas.isChecked()==true){
            enviar.putExtra("bas",bas.getText().toString());
        }else{
            enviar.putExtra("bas","No practica basquet");
        }
        if(ten.isChecked()==true){
            enviar.putExtra("ten",ten.getText().toString());
        }else{
            enviar.putExtra("ten","No practica Tenis");
        }

        if(si.isChecked()==true){
            enviar.putExtra("sino",si.getText().toString());
        }else{
            enviar.putExtra("sino",no.getText().toString());
        }

        startActivity(enviar);
        Toast.makeText(getApplicationContext(), "Encuesta Guardada correctamente", Toast.LENGTH_LONG).show();
    }
}
