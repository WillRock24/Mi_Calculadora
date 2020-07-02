package com.example.mi_calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText valor1,valor2;
TextView resultado;
int n1,n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valor1=(EditText) findViewById(R.id.v1);
        valor2=(EditText) findViewById(R.id.v2);
        resultado=(TextView) findViewById(R.id.tv_resultado);


    }

    public void onClick(View view) {
        n1=Integer.parseInt(valor1.getText().toString());
        n2=Integer.parseInt(valor2.getText().toString());
        switch(view.getId()){
            case R.id.b_suma: suma();
            break;
            case R.id.b_resta: restar();
                break;
            case R.id.b_multiplicacion: multiplicar();
                break;
            case R.id.b_division: dividir();
                break;

        }
    }

    private void dividir() {
        int division=n1/n2;
        resultado.setText("El Resultado de "+n1+"/"+n2+" es: "+division);
    }

    private void multiplicar() {
        int multiplicacion=n1*n2;
        resultado.setText("El Resultado de "+n1+"*"+n2+" es: "+multiplicacion);
    }

    private void restar() {
        int resta=n1-n2;
        resultado.setText("El Resultado de "+n1+"-"+n2+" es: "+resta);
    }

    private void suma() {
        int suma=n1+n2;
        resultado.setText("El Resultado de "+n1+"+"+n2+" es: "+suma);
    }
}