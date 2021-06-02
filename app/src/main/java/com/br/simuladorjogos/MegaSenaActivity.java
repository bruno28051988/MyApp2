package com.br.simuladorjogos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MegaSenaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mega_sena);
    }

    public void sorteioseis(View view){
        TextView texto = findViewById(R.id.txt_resultado);

        int num1 = new Random().nextInt(61);
        int num2 = new Random().nextInt(61);
        int num3 = new Random().nextInt(61);
        int num4 = new Random().nextInt(61);
        int num5 = new Random().nextInt(61);
        int num6 = new Random().nextInt(61);

        if(num1 != 0 && num2 != 0 && num3 != 0 && num4 != 0 && num5 != 0 && num6 != 0 && num1 != num2 && num1 != num3 && num1 != num3 && num1 != num4 && num1 != num5 && num1 != num6 && num2 != num3 && num2 != num4 && num2 != num5 && num2 != num6 && num3 != num4 && num3 != num5 && num3 != num6 && num4 != num5 && num4 != num6 && num5 != num6){
            texto.setText("O número sorteado foi: "+ num1 +", "+ num2 + ", "+ num3 +", "+ num4 +", "+ num5 +", "+ num6);

        }

    }

    public void sorteiosete(View view){
        TextView texto = findViewById(R.id.txt_resultado);

        int num1 = new Random().nextInt(61);
        int num2 = new Random().nextInt(61);
        int num3 = new Random().nextInt(61);
        int num4 = new Random().nextInt(61);
        int num5 = new Random().nextInt(61);
        int num6 = new Random().nextInt(61);
        int num7 = new Random().nextInt(61);

        if(num1 != 0 && num2 != 0 && num3 != 0 && num4 != 0 && num5 != 0 && num6 != 0 && num7 != 0 && num1 != num2 && num1 != num3 && num1 != num3 && num1 != num4 && num1 != num5 && num1 != num6 && num1 != num7 && num2 != num3 && num2 != num4 && num2 != num5 && num2 != num6 && num2 != num7 && num3 != num4 && num3 != num5 && num3 != num6 && num3 != num7 && num4 != num5 && num4 != num6 && num4 != num7 && num5 != num6 && num5 != num7 && num6 != num7){
            texto.setText("O número sorteado foi: "+ num1 +", "+ num2 + ", "+ num3 +", "+ num4 +", "+ num5 +", "+ num6+", "+ num7);

        }

    }

    public void sorteiooito(View view){
        TextView texto = findViewById(R.id.txt_resultado);

        int num1 = new Random().nextInt(61);
        int num2 = new Random().nextInt(61);
        int num3 = new Random().nextInt(61);
        int num4 = new Random().nextInt(61);
        int num5 = new Random().nextInt(61);
        int num6 = new Random().nextInt(61);
        int num7 = new Random().nextInt(61);
        int num8 = new Random().nextInt(61);

        if(num1 != 0 && num2 != 0 && num3 != 0 && num4 != 0 && num5 != 0 && num6 != 0 && num7 != 0 && num8 != 0 && num1 != num2 && num1 != num3 && num1 != num3 && num1 != num4 && num1 != num5 && num1 != num6 && num1 != num7 && num1 != num8 && num2 != num3 && num2 != num4 && num2 != num5 && num2 != num6 && num2 != num7 && num2 != num8 && num3 != num4 && num3 != num5 && num3 != num6 && num3 != num7 && num3 != num8 && num4 != num5 && num4 != num6 && num4 != num7 && num4 != num8 && num5 != num6 && num5 != num7 && num5 != num8 && num6 != num7 && num6 != num8 && num7 != num8){
            texto.setText("O número sorteado foi: "+ num1 +", "+ num2 + ", "+ num3 +", "+ num4 +", "+ num5 +", "+ num6+", "+ num7+","+num8);

        }

    }
}