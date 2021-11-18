package com.gerardo.zamora.jimenez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button buttonSuma;
    private Button buttonResta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonSuma = findViewById(R.id.buttonSuma);
        buttonSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirSuma();
            }
        });
        buttonResta = findViewById(R.id.buttonResta);
        buttonResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirResta();
            }
        });
    }

    private void abrirSuma(){
        Intent Intent = new Intent(this, SumaActivity.class);
        startActivity(Intent);
    }

    private void abrirResta(){
        Intent Intent = new Intent(this, RestaActivity.class);
        startActivity(Intent);
    }
}