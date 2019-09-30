package com.example.actividadescontrolesbasicosii;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class actividad02 extends AppCompatActivity {


    private EditText editTextNum1,editTextNum2,editTextResul;
    private Button buttonCompror;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad02);

        editTextNum1 = findViewById(R.id.editTextNum1);
        editTextNum2 = findViewById(R.id.editTextNum2);
        editTextResul = findViewById(R.id.editTextResul);
        buttonCompror = findViewById(R.id.buttonCompror);

        int num1= (int)(Math.random()*100)+1;
        int num2= (int)(Math.random()*100)+1;


        editTextNum1.setText(num1+"");
        editTextNum2.setText(num2+"");


        buttonCompror.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(actividad02.this,actividad02_5.class);
                intent.putExtra("num1", editTextNum1.getText().toString());
                intent.putExtra("num2", editTextNum2.getText().toString());
                intent.putExtra("resul", editTextResul.getText().toString());
                startActivityForResult(intent,1234);

            }
        });


    }
}
