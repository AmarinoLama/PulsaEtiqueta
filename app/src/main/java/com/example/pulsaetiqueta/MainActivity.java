package com.example.pulsaetiqueta;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView tvRespuesta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvRespuesta = findViewById(R.id.tvRespuesta);
        tvRespuesta.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        tvRespuesta.setText("hola");
        tvRespuesta.setRotation(45);
    }
}