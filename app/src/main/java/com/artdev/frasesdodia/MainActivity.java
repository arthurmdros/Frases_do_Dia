package com.artdev.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void newPhrase(View v){
        String[] phrases = {
                "Seja seu principal incentivador!",
                "Persista não desista!",
                "Quando o ser faz planos Deus dá risadas",
                "Ta esperando o que?"
        };
        int number =  new Random().nextInt(4);

        TextView phrase = findViewById(R.id.newPhrase);
        phrase.setText(phrases[number]);

    }
}