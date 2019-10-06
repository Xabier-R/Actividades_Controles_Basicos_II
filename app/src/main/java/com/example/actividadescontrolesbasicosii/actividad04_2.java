package com.example.actividadescontrolesbasicosii;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class actividad04_2 extends AppCompatActivity {

    private TextView textView6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad04_2);



        textView6 = findViewById(R.id.textView6);


        Bundle extras = getIntent().getExtras();
        String nombre = extras.getString("nombre");
        String apellido = extras.getString("apellido");
        String sexo = extras.getString("sexo");
        String velocidad = extras.getString("velocidad");
        String movil = extras.getString("movil");
        String servicios = extras.getString("servicios");


        textView6.setText(getString(R.string.Tu_nombre)+" "+nombre+" "+apellido+" "+getString(R.string.tu_sexo_es)+" "+sexo+" "+getString(R.string.vel_ele)+" "+velocidad+" "+getString(R.string.gb_movil)+" "+movil
        +" "+getString(R.string.ser_extra)+" "+servicios);
    }
}
