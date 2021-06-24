package com.aplicacion.operaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText numero1, numero2;
    double resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero1 = (EditText)findViewById(R.id.txtNum);
        numero2 = (EditText)findViewById(R.id.txtNum2);
    }



    public void clickDivision(View view) {
        if (camposNoestanVacios()){
            resultado = Double.parseDouble(numero1.getText().toString()) / Double.parseDouble(numero2.getText().toString());
            IniciarActivity(resultado);
        }
    }

    public void clickMulti(View view) {
        if (camposNoestanVacios()){
            resultado = Double.parseDouble(numero1.getText().toString()) * Double.parseDouble(numero2.getText().toString());
            IniciarActivity(resultado);
        }
    }

    public void clickResta(View view) {
        if (camposNoestanVacios()){
            resultado = Double.parseDouble(numero1.getText().toString()) - Double.parseDouble(numero2.getText().toString());
            IniciarActivity(resultado);
        }
    }

    public void clickSuma(View view) {
        if (camposNoestanVacios()){
            resultado = Double.parseDouble(numero1.getText().toString()) + Double.parseDouble(numero2.getText().toString());
            IniciarActivity(resultado);
        }
    }

    private void IniciarActivity(double resultado) {
        Intent pantalla = new Intent(getApplicationContext(),Resultado.class);
        pantalla.putExtra("resultado",String.valueOf(resultado));
        startActivity(pantalla);
    }
    private boolean camposNoestanVacios() {
        if (numero1.getText().toString().trim().isEmpty() || numero2.getText().toString().trim().isEmpty() ){
            Toast.makeText(getApplicationContext(),"No puede dejar campos vacíos",Toast.LENGTH_SHORT).show();
            return false;
        }else{
            return true;
        }
    }

}