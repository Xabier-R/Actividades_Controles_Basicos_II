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
    private CheckBox[] checkServicios;
    private CheckBox checkBoxAcepCondi;
    private RadioGroup rgOpciones,rgVel,rgOpcionesMovil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad04);


        botonEnviar = findViewById(R.id.buttonEnv);
        editTextNombre = findViewById(R.id.editTextNombre);
        editTextApellido = findViewById(R.id.editTextApellido);

        rgOpciones = findViewById(R.id.rgOpciones);
        rgVel = findViewById(R.id.rgOpcionesVelo);
        rgOpcionesMovil = findViewById(R.id.rgOpcionesMovil);


        checkServicios = new CheckBox[3];
        checkServicios[0] = findViewById(R.id.checkBoxC);
        checkServicios[1] = findViewById(R.id.checkBoxM);
        checkServicios[2] = findViewById(R.id.checkBoxF);


        checkBoxAcepCondi = findViewById(R.id.checkBoxAcepCondi);


        botonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (checkBoxAcepCondi.isChecked()) {


                    Intent intent = new Intent(actividad04.this, actividad04_2.class);
                    intent.putExtra("nombre", editTextNombre.getText().toString());
                    intent.putExtra("apellido", editTextApellido.getText().toString());

                    RadioButton sexo = findViewById(rgOpciones.getCheckedRadioButtonId());
                    intent.putExtra("sexo", sexo.getText().toString());

                    RadioButton velocidad = findViewById(rgVel.getCheckedRadioButtonId());
                    intent.putExtra("velocidad", velocidad.getText().toString());

                    RadioButton movil = findViewById(rgOpcionesMovil.getCheckedRadioButtonId());
                    intent.putExtra("movil", movil.getText().toString());


                    intent.putExtra("servicios", checkBoxSeleccionados());


                    startActivity(intent);


                } else {
                    Intent intent = new Intent(actividad04.this, actividad04_1.class);

                    startActivity(intent);

                }

            }
        });

    }

        private String checkBoxSeleccionados(){
            String strCheck =" ";
            for(int i=0;i<checkServicios.length;i++)
            {
                if(checkServicios[i].isChecked())
                {

                    strCheck += (checkServicios[i].getText() + ", ");

                }
            }

            return strCheck;
        }


    }

