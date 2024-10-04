package com.example.proyecto;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

import models.Administrador;

public class Login extends AppCompatActivity {

    private String usus;
    private String passe;
    private TextView tbusu;
    private TextView pass;
    private Button button;
    private Administrador admin = new Administrador();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        try {
            tbusu= findViewById(R.id.usu);
            pass= findViewById(R.id.pass);
            button=findViewById(R.id.button);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    usus = tbusu.getEditableText().toString();
                    passe = pass.getEditableText().toString();
                    if( usus.equals(admin.getUsu())){
                        if(passe.equals(admin.getPass())) {
                            Toast.makeText(getApplicationContext(), "Ingresaste", Toast.LENGTH_LONG).show();
                        }
                        } else {
                        Toast.makeText(getApplicationContext(),"Clave o usuario incorrectos",Toast.LENGTH_LONG).show();
                    }
                }
            });
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}