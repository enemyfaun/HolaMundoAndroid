package com.gerardo.zamora.jimenez;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CosenoActivity extends AppCompatActivity {

    private EditText editTextX;
    private EditText editTextTotal;
    private Button buttonResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suma);

        editTextX = findViewById(R.id.editTextNumberX);
        editTextTotal = findViewById(R.id.editTextNumberTotal);
        editTextX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                realizaOperacion();
            }
        });
    }

    private void realizaOperacion(){
        double total = 0;
        if(editTextX.getText().toString() != null){
            if( isEntero(editTextX.getText().toString())){
                total = Math.cos(Math.toRadians(Double.parseDouble(editTextX.getText().toString())));
            }
        }

        editTextTotal.setText(String.format("%d", total), TextView.BufferType.SPANNABLE);
        editTextTotal.setEnabled(false);
    }

    private int getEntero(String entero){
        try{
            return Integer.parseInt(entero);
        }catch (NumberFormatException ex){
            ex.printStackTrace();
        }

        return 0;
    }

    private boolean isEntero(String entero){
        try{
            if(entero == null || entero.length() == 0){
                return false;
            }
            Integer.parseInt(entero);
            return true;
        }
        catch(NumberFormatException ex){
            ex.printStackTrace();
        }
        return false;
    }

}