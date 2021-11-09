package com.example.prueba2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Spinner lug;
    Button cont;
    ArrayList<String> valores=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lug = (Spinner) findViewById(R.id.spinner3);
        cont=(Button) findViewById(R.id.button);

        valores.add("-----------");
        valores.add("Piramide de ibiza");
        valores.add("Coliseo Romano");
        valores.add("Estatua de la libertad");
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,valores);
        lug.setAdapter(adaptador);

        cont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (lug.getSelectedItem() =="Piramide de Giza"){
                    String lu= lug.getSelectedItem().toString();
                    Intent I= new Intent(getApplicationContext(),Base.class);
                    I.putExtra("slugar",lu);
                    startActivity(I);
                }
                if (lug.getSelectedItem() =="Coliseo Romano"){
                    String lu= lug.getSelectedItem().toString();
                    Intent I= new Intent(getApplicationContext(),Base2.class);
                    I.putExtra("slugar",lu);
                    startActivity(I);

                }
                if (lug.getSelectedItem() =="Estatua de la libertad"){
                    String lu= lug.getSelectedItem().toString();
                    Intent I= new Intent(getApplicationContext(),Base3.class);
                    I.putExtra("slugar",lu);
                    startActivity(I);

                }
                if (lug.getSelectedItem() =="-----------"){
                    Toast.makeText(getApplicationContext(),"Seleccione correctamente el lugar deseado", Toast.LENGTH_LONG);
                }
            }
        });
    }
}