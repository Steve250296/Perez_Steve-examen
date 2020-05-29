package com.example.perez_steve_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText user, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        user=findViewById(R.id.etUser);
        password=findViewById(R.id.etPassword);
    }

    public void Ingresar(View v){
        Intent enviar=new Intent(Login.this, Registro.class);
        if(user.getText().toString().equals("estudiante2020")&&password.getText().toString().equals("uisrael2020")){
            enviar.putExtra("nombreusuario", user.getText().toString());
            startActivity(enviar);
            Toast.makeText(getApplicationContext(), "Bienvenido", Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(getApplicationContext(), "Usuario o contraseña incorrectos", Toast.LENGTH_LONG).show();
        }
    }
}
