package com.example.calculadora.ui.home;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ShareActionProvider;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import com.example.calculadora.R;
import org.mariuszgromada.math.mxparser.*;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class HomeFragment extends Fragment  {

    private HomeViewModel homeViewModel;
    private  String calculo="";
    private TextView  operacion;
    private TextView resultado;
    private double variable = 45;

    View vista;
    Button btnC;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btn0;
    Button btnabre;
    Button btncierra;
    Button btnsuma;
    Button btnresta;
    Button btnmultiplicacion;
    Button btndiv;
    Button btnigual;
    Button punto;

    Button btnseno;
    Button btncoseno;
    Button btntangente;
    Button btnX;
    Button btnanterior;
    Button btnpotencia;


    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        //View root = inflater.inflate(R.layout.fragment_home, container, false);
        vista = inflater.inflate(R.layout.fragment_home, container, false);
        operacion = (TextView) vista.findViewById(R.id.Operacion);
        resultado = (TextView) vista.findViewById(R.id.Resultado);
        btn7 = vista.findViewById(R.id.btn7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button boton = (Button)v;
                calculo= calculo + boton.getText().toString();
                operacion.setText(calculo);
            }
        });

        btn1 = vista.findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button boton = (Button)v;
                calculo= calculo + boton.getText().toString();
                operacion.setText(calculo);
            }
        });

        btn2 = vista.findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button boton = (Button)v;
                calculo= calculo + boton.getText().toString();
                operacion.setText(calculo);
            }
        });

        btn3 = vista.findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button boton = (Button)v;
                calculo= calculo + boton.getText().toString();
                operacion.setText(calculo);
            }
        });

        btn4 = vista.findViewById(R.id.btn4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button boton = (Button)v;
                calculo= calculo + boton.getText().toString();
                operacion.setText(calculo);
            }
        });

        btn5 = vista.findViewById(R.id.btn5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button boton = (Button)v;
                calculo= calculo + boton.getText().toString();
                operacion.setText(calculo);
            }
        });

        btn6 = vista.findViewById(R.id.btn6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button boton = (Button)v;
                calculo= calculo + boton.getText().toString();
                operacion.setText(calculo);
            }
        });

        btn0 = vista.findViewById(R.id.btn0);
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button boton = (Button)v;
                calculo= calculo + boton.getText().toString();
                operacion.setText(calculo);
            }
        });

        btn8 = vista.findViewById(R.id.btn8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button boton = (Button)v;
                calculo= calculo + boton.getText().toString();
                operacion.setText(calculo);
            }
        });

        btn9 = vista.findViewById(R.id.btn9);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button boton = (Button)v;
                calculo= calculo + boton.getText().toString();
                operacion.setText(calculo);
            }
        });

        btnsuma = vista.findViewById(R.id.btnAdicion);
        btnsuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button boton = (Button)v;
                calculo= calculo + boton.getText().toString();
                operacion.setText(calculo);
            }
        });

        btnresta = vista.findViewById(R.id.btnresta);
        btnresta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button boton = (Button)v;
                calculo= calculo + boton.getText().toString();
                operacion.setText(calculo);
            }
        });

        btnmultiplicacion = vista.findViewById(R.id.btnMultiplicacion);
        btnmultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button boton = (Button)v;
                calculo= calculo + boton.getText().toString();
                operacion.setText(calculo);
            }
        });

        btndiv = vista.findViewById(R.id.btnDivision);
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button boton = (Button)v;
                calculo= calculo + boton.getText().toString();
                operacion.setText(calculo);
            }
        });

        btnabre = vista.findViewById(R.id.btnAbre);
        btnabre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button boton = (Button)v;
                calculo= calculo + boton.getText().toString();
                operacion.setText(calculo);
            }
        });

        btncierra = vista.findViewById(R.id.btncierra);
        btncierra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button boton = (Button)v;
                calculo= calculo + boton.getText().toString();
                operacion.setText(calculo);
            }
        });

        btnC = vista.findViewById(R.id.btnClear);
        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculo = "";
                resultado.setText("0");
                operacion.setText(calculo);
            }
        });

        punto = vista.findViewById(R.id.btnPunto);
        punto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button boton = (Button)v;
                calculo= calculo + boton.getText().toString();
                operacion.setText(calculo);
            }
        });

        btnigual = vista.findViewById(R.id.btnIgual);
        btnigual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Expression e = new Expression(calculo);
                String result = String.valueOf(e.calculate());
                resultado.setText(result);
                guardar();
                calculo="";

            }
        });
        //final TextView textView = root.findViewById(R.id.text_home);
        //homeViewModel.getText().observe(this, new Observer<String>() {
           // @Override
           // public void onChanged(@Nullable String s) {
                //textView.setText(s);
           // }
        //});

        //-------------------------------------------------

        btnseno = vista.findViewById(R.id.btnSen);
        btnseno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double respuesta = Math.sin(variable);
                String result = ""+respuesta;
                operacion.setText("Cos("+variable+")");
                resultado.setText(result);
                guardar();
            }
        });


        btncoseno = vista.findViewById(R.id.btnCo);
        btncoseno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double respuesta = Math.cos(variable);
                String result = ""+respuesta;
                operacion.setText("Cos("+variable+")");
                resultado.setText(result);
                guardar();

            }
        });

        btntangente = vista.findViewById(R.id.btnTangente);
        btntangente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double respuesta = Math.tan(variable);
                String result = ""+respuesta;
                operacion.setText("Tan("+variable+")");
                resultado.setText(result);
                guardar();

            }
        });

        btnX = vista.findViewById(R.id.btnX);
        btnX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                variable = Double.parseDouble(calculo);
                resultado.setText("x="+variable);
            }
        });

        btnpotencia= vista.findViewById(R.id.btnPotencia);
        btnpotencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado.setText(""+variable);
            }
        });

        btnanterior = vista.findViewById(R.id.btnAnterior);
        btnanterior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado.setText(""+variable);

            }
        });/* */

        return vista;
    }


    //public void acercade(View view) {
    //    Intent i = new Intent(this, AcercaDe.class );
    //    startActivity(i);
    //}

    private void guardar(){
        SharedPreferences preferences = this.getActivity().getSharedPreferences("calculos", Context.MODE_PRIVATE);

        String op = operacion.getText().toString();
        String res = resultado.getText().toString();

        SharedPreferences.Editor editor= preferences.edit();
        editor.putString(op,res);
        //editor.putString("res",res);
        editor.commit();
    }
}