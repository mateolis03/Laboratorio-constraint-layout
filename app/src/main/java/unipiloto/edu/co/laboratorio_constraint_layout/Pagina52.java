package unipiloto.edu.co.laboratorio_constraint_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Pagina52 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina52);
    }

    public void appreciclaje(View view) {
        Intent intent = new Intent(this, appreciclaje.class);
        startActivity(intent);
    }
}