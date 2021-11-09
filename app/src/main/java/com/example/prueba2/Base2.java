package com.example.prueba2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Base2 extends AppCompatActivity {

    ImageButton x;
    ImageButton z;
    Button ubicacion;
    Button volver;
    String lugar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base2);
        x=(ImageButton) findViewById(R.id.imageButton);
        z=(ImageButton) findViewById(R.id.imageButton);
        ubicacion=(Button) findViewById(R.id.btn_ubicacion3);
        volver=(Button) findViewById(R.id.btn_volver3);
        Bundle b= getIntent().getExtras();
        lugar=b.getString("lugar");
        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent uno= new Intent(getApplicationContext() ,MainActivity.class);
                startActivity(uno);
            }
        });
        ubicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent uno= new Intent(getApplicationContext(),MapsActivity2.class);
                startActivity(uno);
            }
    }
}