package com.example.actividadescontrolesbasicosii;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class actividad02_5 extends AppCompatActivity {

    private EditText editResul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad02_5);

        editResul = findViewById(R.id.editResul);

        Bundle extras = getIntent().getExtras();
        int num1 =Integer.parseInt( extras.getString("num1"));
        int num2=Integer.parseInt(extras.getString("num2"));
        int resul=Integer.parseInt(extras.getString("resul"));

        if(num1+num2==resul)
        {
            editResul.setText("El resultado es CORRECTO");

        }


    }
}
