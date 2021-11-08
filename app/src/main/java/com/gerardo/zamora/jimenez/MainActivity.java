package com.gerardo.zamora.jimenez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button buttonSuma;

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
    }

    private void abrirSuma(){
        Intent Intent = new Intent(this, SumaActivity.class);
        startActivity(Intent);
    }
}