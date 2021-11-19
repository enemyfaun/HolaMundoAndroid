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
    private Button buttonCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coseno);

        editTextX = findViewById(R.id.editTextNumberX);
        editTextTotal = findViewById(R.id.editTextNumberTotal);

        buttonCalcular = findViewById(R.id.buttonCalcular);
        buttonCalcular.setOnClickListener(new View.OnClickListener() {
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
                System.out.println(Math.cos(Math.toRadians(90)));
            }
        }

        editTextTotal.setText(String.valueOf(total));
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