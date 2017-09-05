package com.example.doctorbtl.ejemplo1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvSaludo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Iniciando Java");
        tvSaludo = (TextView)findViewById(R.id.tvMensaje);
        tvSaludo.setText("Presta atencion no digites");
    }

    public void cambiar(View view) {
        setTitle("Programando en Android");
        tvSaludo.setText("Avanzando...");
    }

    public void cerrar(View view) {
        finish();
    }

    public void mostrarFotos(View view){
        Intent intent = new Intent(this,FotosActivity.class);
        startActivity(intent);
    }
}
