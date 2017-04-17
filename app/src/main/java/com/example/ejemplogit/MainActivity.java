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
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import static android.R.id.list;

public class MainActivity extends AppCompatActivity{
    //declaramos las variables
    private ListView listView;
    private String[] elementos = {"Jaime","Albert","Jose","Nicole"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FrutasVerduras frutasVerduras_datos[]= new FrutasVerduras[]{
                new FrutasVerduras(R.drawable.icono_android,"Manzana"),
                new FrutasVerduras(R.drawable.icono_android,"Mango"),
                new FrutasVerduras(R.drawable.icono_android,"Papaya"),
                new FrutasVerduras(R.drawable.icono_android,"Peras"),
                new FrutasVerduras(R.drawable.icono_android,"Naranjas"),
                new FrutasVerduras(R.drawable.icono_android,"tomates"),

        };

            FrutasVerdurasAdapter adapter= new FrutasVerdurasAdapter(this, R.layout.listview_item_row, frutasVerduras_datos);
            listView=(ListView)findViewById(R.id.listView);
            View header=(View)getLayoutInflater().
                    inflate(R.layout.listview_header,null);
                    listView.addHeaderView(header);
                    listView.setAdapter(adapter);



        /*
        listView=(ListView)findViewById(R.id.listView);
        //PrimerParametro Donde
        //Segundo Estilo
        //Tercero Elementos a mostrar
        ArrayAdapter<String>arrayAdapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,elementos);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),String.valueOf(position),Toast.LENGTH_SHORT).show();
            }
        });
        */

    }
}
