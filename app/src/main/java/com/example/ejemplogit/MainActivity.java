package com.example.ejemplogit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    //declaramos las variables
    private Button btn;
    private EditText txt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button)findViewById(R.id.btn_activity);
        btn.setOnClickListener(this);
        txt=(EditText)findViewById(R.id.txtNombre);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.btn_activity:
                Intent intent= new Intent(this, Main2Activity.class);
                String vrbDato= txt.getText().toString();
                intent.putExtra("VRBDATO",vrbDato);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}