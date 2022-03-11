package unipiloto.edu.co.laboratorio_constraint_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Ejercicio46 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio46);

    }
    public void Pagina52(View view) {
        Intent intent = new Intent(this, Pagina52.class);
        startActivity(intent);
    }
}