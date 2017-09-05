package com.example.doctorbtl.ejemplo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class FotosActivity extends AppCompatActivity {
    Integer [] fotos = {
            R.drawable.audioslave,
            R.drawable.bob,
            R.drawable.led,
            R.drawable.pearl,
            R.drawable.ramones,
            R.drawable.rolling,
    };

    ImageView muestra;
    EditText tposicion;
    TextView tvContar;
    int posicion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fotos);
        muestra = (ImageView)findViewById(R.id.ivVisor);
        tposicion = (EditText)findViewById(R.id.etPosicion);
        //muestra.setImageResource(R.drawable.audioslave);
        posicion=0;
        tvContar = (TextView)findViewById(R.id.tvContador);
        muestra.setImageResource(fotos[posicion]);
        tvContar.setText(String.valueOf(posicion + 1));
    }

    public void mostrar(View view) {

        if(!tposicion.getText().toString().equals("")){

        posicion = Integer.parseInt(tposicion.getText().toString());
        if(posicion>=1 && posicion<=fotos.length) {
            muestra.setImageResource(fotos[posicion -1]);
        }
        else{
            Toast.makeText(this,"El numero ingresado esta fuera de rango",Toast.LENGTH_SHORT).show();
        }
        tposicion.setText("");
        }
        tvContar.setText(String.valueOf(posicion + 1));

    }

    public void back(View view) {

            posicion--;
        if (posicion==-1){
            posicion = fotos.length-1;
        }
            muestra.setImageResource(fotos[posicion]);
        tvContar.setText(String.valueOf(posicion + 1));

    }
    public void fwd(View view) {
        //if(posicion<fotos.length-1){
        posicion++;
        if (posicion == fotos.length){
            posicion=0;
        }
        muestra.setImageResource(fotos[posicion]);
        tvContar.setText(String.valueOf(posicion + 1));
        }

    }

