package com.example.actividadescontrolesbasicosii;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class actividad03_5 extends AppCompatActivity {

    private TextView textViewDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad03_5);


        textViewDatos = findViewById(R.id.textViewDatos);


        Bundle extras = getIntent().getExtras();
        String nombre = extras.getString("nombre");
        String apellido = extras.getString("apellido");
        String sexo = extras.getString("sexo");
        String aficiones = extras.getString("aficiones");



        textViewDatos.setText(getString(R.string.Tu_nombre)+" "+nombre+" "+apellido+" "+getString(R.string.tu_sexo_es)+" "+sexo+" "+getString(R.string.aficiones_son)+" "+ aficiones);
    }
}
