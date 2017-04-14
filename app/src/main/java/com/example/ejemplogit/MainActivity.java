package com.example.ejemplogit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    //declaramos la variable imageView de tipo ImageView
    Button button;
    Toast toast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*//acceder a la imagen por medio del id
        imageView=(ImageView)findViewById(R.id.imageView);
        //si queremos modificar atributos ponemos
        imageView.setColorFilter(454);
*/
        button=(Button)findViewById(R.id.boton);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.boton:
                Toast.makeText(getApplicationContext(), "Hola esto es un toast", Toast.LENGTH_SHORT).show();
                break;
            default:
                Toast.makeText(getApplicationContext(),"Esto es por efecto", Toast.LENGTH_LONG).show();
                break;
        }
    }
}
