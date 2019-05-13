package com.example.aula_1305;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int num;
    int total;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void teste(View view) {
        Toast toast = Toast.makeText(this,"texto",Toast.LENGTH_SHORT);
        toast.show();
    }



    public void soma1(View view){
        TextView cafe = findViewById(R.id.texto);
        TextView soma = findViewById(R.id.total);
        num++;
        total += 3;
        cafe.setText("" + num);
        soma.setText("Preço Total:" + total);
    }

    public void soma2(View view){
        TextView cafe = findViewById(R.id.texto);
        TextView soma = findViewById(R.id.total);
        num++;
        total += 4;
        cafe.setText("" + num);
        soma.setText("Preço Total:" + total);
    }

    public void soma3(View view){
        TextView cafe = findViewById(R.id.texto);
        TextView soma = findViewById(R.id.total);
        num++;
        total += 5;
        cafe.setText("" + num);
        soma.setText("Preço Total:" + total);
    }

    public void soma4(View view){
        TextView cafe = findViewById(R.id.texto);
        TextView soma = findViewById(R.id.total);
        num++;
        total += 7;
        cafe.setText("" + num);
        soma.setText("Preço Total:" + total);
    }

    public void soma5(View view){
        TextView cafe = findViewById(R.id.texto);
        TextView soma = findViewById(R.id.total);
        num++;
        total += 10;
        cafe.setText("" + num);
        soma.setText("Preço Total:" + total);
    }

}

