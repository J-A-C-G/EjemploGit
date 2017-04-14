package com.example.ejemplogit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    //declaramos las variables

    TextView tV;
    ImageView iV;
    Button bT, bI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    //vamos a enlazarlos con sus respectivos ids

        tV=(TextView)findViewById(R.id.tV);
        iV=(ImageView)findViewById(R.id.iV);
        bT=(Button)findViewById(R.id.bT);
        bI=(Button)findViewById(R.id.bI);

    //Necesario para activar el action listener
        bT.setOnClickListener(this);
        bI.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.bT:
                tV.setText("Chao Jaime");
                break;
            case R.id.bI:
                iV.setImageResource(R.drawable.icono_android);
                break;
        }
    }
}