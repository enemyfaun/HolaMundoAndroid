package com.gerardo.zamora.jimenez;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputEditText;

public class SumaActivity extends AppCompatActivity {

        private EditText editTextX;
        private EditText editTextY;
        private EditText editTextTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suma);

        editTextX = findViewById(R.id.editTextNumberX);
        editTextY = findViewById(R.id.editTextNumberY);
        editTextTotal = findViewById(R.id.editTextNumberTotal);


    }
}