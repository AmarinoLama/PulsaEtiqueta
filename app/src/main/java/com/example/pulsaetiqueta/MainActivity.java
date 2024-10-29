package com.example.pulsaetiqueta;

import static com.example.pulsaetiqueta.R.*;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView tvRespuesta;

    Integer rotation = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvRespuesta = findViewById(R.id.tvRespuesta);
        tvRespuesta.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (rotation == 360) {
            rotation = 0;
        }
        rotation += 45;
        tvRespuesta.setText("hola");
        tvRespuesta.setRotation(rotation);
        tvRespuesta.setTextSize(40);
        tvRespuesta.setTextColor(Color.RED);
        tvRespuesta.setBackgroundColor(Color.YELLOW);
    }
}