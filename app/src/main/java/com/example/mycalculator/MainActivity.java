package com.example.mycalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText numero1;
    EditText numero2;
    TextView risultato;
    String operatore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        numero1 = findViewById(R.id.numero1);
        numero2 = findViewById(R.id.numero2);
        risultato = findViewById(R.id.risultato);
    }

    public void scegliOperatore(View view) {

        Button bottone = (Button) view;

        operatore = bottone.getText().toString();
    }

    public void calcola(View view) {

        double n1 = Double.parseDouble(numero1.getText().toString());
        double n2 = Double.parseDouble(numero2.getText().toString());

        double risultatoFinale = 0;

        if (operatore.equals("+")) {
            risultatoFinale = n1 + n2;
        }

        if (operatore.equals("-")) {
            risultatoFinale = n1 - n2;
        }

        if (operatore.equals("×")) {
            risultatoFinale = n1 * n2;
        }

        if (operatore.equals("÷")) {
            risultatoFinale = n1 / n2;
        }

        risultato.setText(String.valueOf(risultatoFinale));
    }
}
