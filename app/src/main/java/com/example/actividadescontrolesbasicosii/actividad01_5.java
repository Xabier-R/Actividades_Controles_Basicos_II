package com.example.actividadescontrolesbasicosii;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class actividad01_5 extends AppCompatActivity {


    private TextView textView;
    private Button buttonAcep,buttonCance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad01_5);

        textView = findViewById(R.id.textView);
        buttonAcep = findViewById(R.id.buttonAcep);
        buttonCance = findViewById(R.id.buttonCance);

        Bundle extras = getIntent().getExtras();
        String nom = extras.getString("nombre");
        String ape=extras.getString("apellido");

        textView.setText("Hola "+nom+" "+ape+ " "+getString(R.string.condiciones));





        buttonAcep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("resultado", " ACEPTADAS");
                setResult(RESULT_OK, intent);
                finish();

            }
        });

        buttonCance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent();
                intent.putExtra("resultado", " RECHAZADAS");
                setResult(RESULT_OK, intent);
                finish();

            }
        });

    }
}
