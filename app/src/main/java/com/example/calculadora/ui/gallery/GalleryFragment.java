package com.example.calculadora.ui.gallery;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import com.example.calculadora.R;

import java.util.Map;

public class GalleryFragment extends Fragment {

    private GalleryViewModel galleryViewModel;
    public TextView operacion;
    public String opera;
    View vista;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        galleryViewModel =
                ViewModelProviders.of(this).get(GalleryViewModel.class);


        vista = inflater.inflate(R.layout.fragment_gallery, container, false);
        operacion = vista.findViewById(R.id.Operacion);
        opera = operacion.getText().toString();
        cargar();
        //final TextView textView = root.findViewById(R.id.text_gallery);
        /*galleryViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                //textView.setText(s);
            }
        });*/
        return vista;
    }

    private void cargar() {
        SharedPreferences preferences = this.getActivity().getSharedPreferences("calculos", Context.MODE_PRIVATE);
        //String op =preferences.getString("op","vacio");
        //String res =preferences.getString("res","vacio");
        Map<String, ?> datos = preferences.getAll();
        for (Map.Entry<String, ?> entry : datos.entrySet()) {
            operacion.setText(operacion.getText().toString()+ "\n"+ entry.getKey() + " = " + entry.getValue().toString());
        }
        //operacion.setText(op+" "+res);


    }
}