package unipiloto.edu.co.laboratorio_constraint_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Ejercicio43 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio43);

    }

    public void Ejercicio44(View view) {
        Intent intent = new Intent(this, Ejercicio44.class);
        startActivity(intent);
    }
}