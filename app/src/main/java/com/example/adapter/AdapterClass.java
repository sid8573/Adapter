package com.example.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class AdapterClass extends ArrayAdapter<NumberView> {


    public AdapterClass(@NonNull Context context, ArrayList<NumberView> array) {
        super(context, 0,array);
    }

    @NonNull
    @Override
    public View getView(int position, @NonNull View convertView, @NonNull ViewGroup parent)
    {
        View currentItemView=convertView;

        if(currentItemView==null)
        {
            currentItemView= LayoutInflater.from(getContext()).inflate(R.layout.item,parent,false);
        }
        NumberView currentNumberPosition=getItem(position);

        ImageView numberImage=currentItemView.findViewById(R.id.avatar);
        assert currentNumberPosition!=null;
        numberImage.setImageResource(currentNumberPosition.getImageId());

        TextView textView1=currentItemView.findViewById(R.id.text1);
        textView1.setText(currentNumberPosition.getTextId1());

        TextView textView2=currentItemView.findViewById(R.id.text2);
        textView2.setText(currentNumberPosition.getTextId2());


        return currentItemView;

    }
}
