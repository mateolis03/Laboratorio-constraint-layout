package unipiloto.edu.co.laboratorio_constraint_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Ejercicio45 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio45);
    }

    public void Ejercicio46(View view) {
        Intent intent = new Intent(this, Ejercicio46.class);
        startActivity(intent);
    }
}