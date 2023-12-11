package com.example.kalkulator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Trojkat extends Figura {
    double a,h;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trojkat);

        Button btn = (Button) findViewById(R.id.button23);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Trojkat.this, MainActivity.class));
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
        a = Double.parseDouble(editText.getText().toString());
        h = Double.parseDouble(editText2.getText().toString());
        return (a*h)/2;
    }

}
