package com.example.actividadescontrolesbasicosii;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class actividad04 extends AppCompatActivity {

    private Button botonEnviar;
    private EditText editTextNombre,editTextApellido;
    private RadioButton rbOpcionM,rbOpcionF,rbOpcionV1,rbOpcionV2,rbOpcionV3,rbOpcionM1,rbOpcionM2,rbOpcionM3,rbOpcionM4;
    private CheckBox checkBoxC,checkBoxM,checkBoxF,checkBoxAcepCondi;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad04);



        botonEnviar = findViewById(R.id.buttonEnv);
        editTextNombre = findViewById(R.id.editTextNombre);
        editTextApellido = findViewById(R.id.editTextApellido);
        rbOpcionM = findViewById(R.id.rbOpcionS1);
        rbOpcionF = findViewById(R.id.rbOpcionS2);
        rbOpcionV1 = findViewById(R.id.rbOpcionV1);
        rbOpcionV2 = findViewById(R.id.rbOpcionV2);
        rbOpcionV3 = findViewById(R.id.rbOpcionV3);
        rbOpcionM1 = findViewById(R.id.rbOpcionM1);
        rbOpcionM2 = findViewById(R.id.rbOpcionM2);
        rbOpcionM3 = findViewById(R.id.rbOpcionM3);
        rbOpcionM4 = findViewById(R.id.rbOpcionM4);
        checkBoxC = findViewById(R.id.checkBoxC);
        rbOpcionM1 = findViewById(R.id.rbOpcionM1);
        checkBoxM = findViewById(R.id.checkBoxM);
        checkBoxF = findViewById(R.id.checkBoxF);
        checkBoxAcepCondi = findViewById(R.id.checkBoxAcepCondi);


        botonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (checkBoxAcepCondi.isChecked()) {






                }
                else
                {
                    Intent intent = new Intent(actividad04.this, actividad04_1.class);

                    startActivity(intent);

                }

            }
        });


    }
}
