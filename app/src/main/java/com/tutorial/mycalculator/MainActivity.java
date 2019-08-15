package com.tutorial.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public EditText panta;
    public double operacion1, operacion2,resultado;
    int ope;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        panta = (EditText) findViewById(R.id.pantalla);

    }

    public void bt1(View v){
        String cap= panta.getText().toString();
        cap = cap+"1";
        panta.setText(cap);
    }
    public void bt2(View v){
        String cap= panta.getText().toString();
        cap = cap+"2";
        panta.setText(cap);
    }
    public void bt3(View v){
        String cap= panta.getText().toString();
        cap = cap+"3";
        panta.setText(cap);
    }
    public void bt4(View v){
        String cap= panta.getText().toString();
        cap = cap+"4";
        panta.setText(cap);
    }
    public void bt5(View v){
        String cap= panta.getText().toString();
        cap = cap+"5";
        panta.setText(cap);
    }
    public void bt6(View v){
        String cap= panta.getText().toString();
        cap = cap+"6";
        panta.setText(cap);
    }
    public void bt7(View v){
        String cap= panta.getText().toString();
        cap = cap+"7";
        panta.setText(cap);
    }
    public void bt8(View v){
        String cap= panta.getText().toString();
        cap = cap+"8";
        panta.setText(cap);
    }
    public void bt9(View v){
        String cap= panta.getText().toString();
        cap = cap+"9";
        panta.setText(cap);
    }
    public void bt0(View v){
        String cap= panta.getText().toString();
        cap = cap+"0";
        panta.setText(cap);
    }
    public void btnPun(View v){
        String cap= panta.getText().toString();
        cap = cap+".";
        panta.setText(cap);
    }
    public void suma(View view){
        try {
            String aux = panta.getText().toString();
            operacion1 = Double.parseDouble(aux);
        }catch (NumberFormatException e){}
        panta.setText("");
        ope=1;
    }
    public void resta(View view){
        try {
            String aux = panta.getText().toString();
            operacion1 = Double.parseDouble(aux);
        }catch (NumberFormatException e){}
        panta.setText("");
        ope=2;
    }
    public void multiplicacion(View view){
        try {
            String aux = panta.getText().toString();
            operacion1 = Double.parseDouble(aux);
        }catch (NumberFormatException e){}
        panta.setText("");
        ope=3;
    }
    public void division(View view){
        try {
            String aux = panta.getText().toString();
            operacion1 = Double.parseDouble(aux);
        }catch (NumberFormatException e){}
        panta.setText("/");
        ope=4;
    }
    public void factorial(View view){
        try {
            String aux = panta.getText().toString();
            operacion1 = Double.parseDouble(aux);
        }catch (NumberFormatException e){}
        panta.setText("");
        ope=5;
    }
    public void raiz (View view){
        try {
            String aux = panta.getText().toString();
            operacion1 = Double.parseDouble(aux);
        }catch (NumberFormatException e){}
        panta.setText("√("+operacion1+")");
        ope=6;
    }
    public void potencia(View view){
        try {
            String aux = panta.getText().toString();
            operacion1 = Double.parseDouble(aux);
        }catch (NumberFormatException e){}
        panta.setText("");
        ope=7;
    }
    public void porcentaje(View view){
        try {
            String aux = panta.getText().toString();
            operacion1 = Double.parseDouble(aux);
        }catch (NumberFormatException e){}
        panta.setText("");
        ope=8;
    }
    public void igual (View view){
        try {
            String aux2 = panta.getText().toString();
            operacion2 = Double.parseDouble(aux2);
        }catch (NumberFormatException e){}
        panta.setText("");

        if(ope==1){
            resultado=operacion1+operacion2;
        }else if(ope==2){
            resultado=operacion1-operacion2;
        }else if(ope ==3){
            resultado = operacion1*operacion2;
        }else if(ope ==4){
            if (operacion2 ==0){
                panta.setText("Error");
            }else{
                resultado = operacion1/operacion2;
            }
        }else if(ope ==5){
            resultado = Math.sqrt(operacion1);
        }else if(ope ==6){
            resultado = Math.sqrt(operacion1);
        }
        else if(ope ==7){
            resultado = Math.pow(operacion1,operacion2) ;
        }else if(ope ==8) {
            resultado = operacion2 * (operacion1 / 100.00);
        }
        panta.setText(""+resultado);
        operacion1=resultado;
    }

    public void CLEAR(View v){
        panta.setText("");
        operacion1=0.0;
        operacion2=0.0;
        resultado=0.0;
    }
    public void CLEAR_LAST(View v){
        if (!panta.getText().toString().equals("")){
            panta.setText(panta.getText().subSequence(0,panta.getText().length()-1)+"");
        }
    }
}
