package com.aplicacion.operaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class Resultado extends AppCompatActivity {
    EditText result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        result = (EditText)findViewById(R.id.txtResultado);
        result.setEnabled(false);
        ObtenerData();
    }

    private void ObtenerData() {
        Bundle dato = getIntent().getExtras();
        String resultado = dato.getString("resultado");
        result.setText(resultado);
    }
}