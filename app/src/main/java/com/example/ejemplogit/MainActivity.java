package com.example.ejemplogit;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    //declaramos las variables
    private Button btn;
    private EditText txt;
    private RadioGroup radioGroup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button)findViewById(R.id.btn_activity);
        btn.setOnClickListener(this);
        txt=(EditText)findViewById(R.id.txtNombre);
        //buscar el id del radiogroup
        radioGroup=(RadioGroup)findViewById(R.id.radioGroup);
        //llamar al metodo onchecked
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {

                if(checkedId==R.id.opcion1){
                    Toast.makeText(getApplicationContext(),"1",Toast.LENGTH_SHORT).show();
                }else if(checkedId==R.id.opcion2) {
                    Toast.makeText(getApplicationContext(), "2", Toast.LENGTH_SHORT).show();
                }
                else if(checkedId==R.id.opcion3){
                    Toast.makeText(getApplicationContext(), "3", Toast.LENGTH_SHORT).show();
                }

            }
        });
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