package com.example.fridgepal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Nevera extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nevera);

        Toast toast = Toast.makeText(getApplicationContext(), "Pulsa en la nevera para abrirla", Toast.LENGTH_SHORT);
        toast.show();
    }


    public void abrirNevera(View view) {
        Intent i = new Intent(Nevera.this, MainActivity.class);
        startActivity(i);
    }
}