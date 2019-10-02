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

public class actividad03 extends AppCompatActivity {

    private Button botonEnviar;
    private EditText editTextNombre,editTextApellido;
    private RadioGroup rgOpciones;
    private RadioButton rbOpcionM,rbOpcionF;
    private CheckBox checkBoxM,checkBoxL,checkBoxD,checkBoxV;
    private String aficiones="";
    private String sexo="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad03);

        botonEnviar = findViewById(R.id.buttonCompror);
        editTextNombre = findViewById(R.id.editTextNombre);
        editTextApellido = findViewById(R.id.editTextApellido);
        rgOpciones = findViewById(R.id.rgOpciones);
        rbOpcionM = findViewById(R.id.rbOpcion1);
        rbOpcionF = findViewById(R.id.rbOpcion2);
        checkBoxM = findViewById(R.id.checkBoxM);
        checkBoxL = findViewById(R.id.checkBoxL);
        checkBoxD = findViewById(R.id.checkBoxD);
        checkBoxV = findViewById(R.id.checkBoxV);



        botonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            if (checkBoxM.isChecked()) {
                aficiones += checkBoxM.getText()+" ";
            }
            if (checkBoxL.isChecked()) {
                aficiones += checkBoxL.getText()+" ";
            }
            if (checkBoxD.isChecked()) {
                aficiones += checkBoxD.getText()+" ";
            }
            if (checkBoxV.isChecked()) {
                aficiones += checkBoxV.getText()+" ";
            }

            if (rbOpcionF.isChecked()) {
                sexo = rbOpcionF.getText()+" ";
            }
            else
            {
                sexo = rbOpcionM.getText()+" ";
            }




            if ((!editTextNombre.getText().toString().equals(""))&&(!editTextApellido.getText().toString().equals("")))
            {
                Intent intent = new Intent(actividad03.this, actividad03_5.class);
                intent.putExtra("nombre", editTextNombre.getText().toString());
                intent.putExtra("apellido", editTextApellido.getText().toString());
                intent.putExtra("sexo",sexo );
                intent.putExtra("aficiones", aficiones);


                startActivity(intent);
            }
            }
        });

    }
}
