package unipiloto.edu.co.laboratorio_constraint_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Ejercicio44 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio44);
    }

    public void Ejercicio45(View view) {
        Intent intent = new Intent(this, Ejercicio45.class);
        startActivity(intent);
    }
}