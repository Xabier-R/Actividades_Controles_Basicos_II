package com.example.actividadescontrolesbasicosii;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class actividad01 extends AppCompatActivity {

    private EditText editText,editText2;
    private Button button1,buttonVolver;
    private TextView textView5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad01);

        button1 = findViewById(R.id.button);
        buttonVolver = findViewById(R.id.buttonVolver);
        editText = findViewById(R.id.editText);
        editText2 = findViewById(R.id.editText2);
        textView5 = findViewById(R.id.textView5);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(actividad01.this,actividad01_5.class);
                intent.putExtra("nombre", editText.getText().toString());
                intent.putExtra("apellido", editText2.getText().toString());
                //la actividad lanzadora recibirá datos de la actividad lanzada
                startActivityForResult(intent,1234);

            }
        });

        buttonVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               finish();

            }
        });



    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (requestCode == 1234) {
            if(resultCode == Activity.RESULT_OK){
                String result=data.getStringExtra("resultado");
                textView5.setText(getString(R.string.condiciones)+result);
            }
            if (resultCode == Activity.RESULT_CANCELED) {
                //Write your code if there's no result
            }
        }
    }

}
