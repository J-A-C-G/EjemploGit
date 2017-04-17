package com.example.ejemplogit;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by jaime on 17/4/2017.
 */

public class FrutasVerdurasAdapter  extends ArrayAdapter<FrutasVerduras>{
    Context myContext;
    int myLayoutResourcesID;
    FrutasVerduras mydata[]=null;

    public FrutasVerdurasAdapter(Context context, int layoutResourcesID, FrutasVerduras[] data){
    super(context,layoutResourcesID,data);
        this.myContext=context;
        this.myLayoutResourcesID=layoutResourcesID;
        this.mydata=data;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        View row = convertView;
        FrutasVerdurasHolder holder = null;

        if(row==null){
            LayoutInflater inflater =((Activity)myContext).getLayoutInflater();
            row=inflater.inflate(myLayoutResourcesID,parent,false);

            holder= new FrutasVerdurasHolder();
            holder.imagen=(ImageView)row.findViewById(R.id.imageV);
            holder.textView=(TextView)row.findViewById(R.id.tv);
            row.setTag(holder);
        }else{
            holder =(FrutasVerdurasHolder)row.getTag();
        }
            FrutasVerduras frutasVerduras= mydata[position];
            holder.textView.setText(frutasVerduras.title);
            holder.imagen.setImageResource(frutasVerduras.icon);

        return row;
    }

    //Holder para mantener los datos
    static class FrutasVerdurasHolder{
        ImageView imagen;
        TextView textView;
    }
}
