package com.example.ejemplogit;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.ListMenuItemView;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import static android.R.id.list;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    //declaramos las variables
    private Button btn;
    private EditText txt;
    private RadioGroup radioGroup;
    private Spinner spinner;


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
        //enlazamos el spinner con el id
        spinner=(Spinner)findViewById(R.id.spinner);
        //creamos un List
        List list = new ArrayList();
        list.add("Item 1");
        list.add("Item 2");
        list.add("Item 3");
        list.add("Item 4");
        list.add("Item 5");
        list.add("Item 6");

        //creamos un Arrayadapter para pasarlo al spinner
        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,list);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);
        //vamos a pasarle una accion
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"Posicion "+String.valueOf(spinner.getSelectedItem()),Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

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