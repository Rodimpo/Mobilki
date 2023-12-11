package com.example.kalkulator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Prostopadloscian extends Figura {
    double a,b,c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prostopadloscian);

        Button btn = (Button) findViewById(R.id.button23);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Prostopadloscian.this, MainActivity.class));
            }
        });
        TextView textView = (TextView) findViewById(R.id.textView5);
        Button btn2 = (Button) findViewById(R.id.button22);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(String.valueOf(oblicz_Pole()));
            }
        });

    }
    @Override
    double oblicz_Pole() {
        EditText editText = (EditText) findViewById(R.id.editTextNumber21);
        EditText editText2 = (EditText) findViewById(R.id.editTextNumber22);
        EditText editText3 = (EditText) findViewById(R.id.editTextNumber25);
        a = Double.parseDouble(editText.getText().toString());
        b = Double.parseDouble(editText2.getText().toString());
        c = Double.parseDouble(editText3.getText().toString());
        return 2*a*b+2*b*c+2*a*c;
    }

}
