package com.example.actividadescontrolesbasicosii;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class actividad02 extends AppCompatActivity {


    private EditText editTextNum1,editTextNum2,editTextResul;
    private Button buttonCompror;
    private TextView textResumen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad02);

        editTextNum1 = findViewById(R.id.editTextNum1);
        editTextNum2 = findViewById(R.id.editTextNum2);
        editTextResul = findViewById(R.id.editTextResul);
        buttonCompror = findViewById(R.id.buttonCompror);
        textResumen = findViewById(R.id.textView3);

        int num1= (int)(Math.random()*100)+1;
        int num2= (int)(Math.random()*100)+1;


        editTextNum1.setText(num1+"");
        editTextNum2.setText(num2+"");


        buttonCompror.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!editTextResul.getText().toString().equals(""))
                {
                    Intent intent = new Intent(actividad02.this, actividad02_5.class);
                    intent.putExtra("num1", editTextNum1.getText().toString());
                    intent.putExtra("num2", editTextNum2.getText().toString());
                    intent.putExtra("resul", editTextResul.getText().toString());
                    startActivityForResult(intent, 1234);
                }
            }
        });


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
    int respC=0;
    int respI=0;

        if (requestCode == 1234) {
            if(resultCode == Activity.RESULT_OK){
                if(data.getStringExtra("resultado").equals("INCORRECTO"))
                {
                    respI=+1;
                }
                else {
                    respC=+1;
                }


                textResumen.setText("Preguntas Correctas= "+respC+", Incorrectas= "+ respI);
            }
            if (resultCode == Activity.RESULT_CANCELED) {
                //Write your code if there's no result
            }
        }
    }
}
