package com.example.actividadescontrolesbasicosii;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;;
import android.widget.TextView;

public class actividad02_5 extends AppCompatActivity {

    private TextView editResul;
    private Button botonVolver;
    private String resultado="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad02_5);

        editResul = findViewById(R.id.editResul);
        botonVolver = findViewById(R.id.buttonVolver);


        Bundle extras = getIntent().getExtras();
        int num1 =Integer.parseInt( extras.getString("num1"));
        int num2=Integer.parseInt(extras.getString("num2"));
        int resul=Integer.parseInt(extras.getString("resul"));


        if(num1+num2==resul) {

            resultado="CORRECTO";
            editResul.setText(getString(R.string.resul)+resultado);
        }
        else
        {
            resultado="INCORRECTO";
            editResul.setText(getString(R.string.resul)+resultado);
        }




        botonVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent();
                intent.putExtra("resultado", resultado);
                setResult(RESULT_OK, intent);
                finish();

            }
        });

    }
}
