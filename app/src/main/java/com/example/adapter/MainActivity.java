package com.example.adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView myList=findViewById(R.id.list);

        ArrayList<NumberView> item = new ArrayList<NumberView>();



       // ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,item);

        item.add(new NumberView(R.drawable.img1,"CupCake","v1.5"));
        item.add(new NumberView(R.drawable.img2,"Donut","v1.6"));
        item.add(new NumberView(R.drawable.img3,"Eclair","v2.0"));
        item.add(new NumberView(R.drawable.img4,"Froyo","v2.2"));
        item.add(new NumberView(R.drawable.img5,"GingerBread","v2.3"));
        item.add(new NumberView(R.drawable.img6,"HoneyComb","v3.0"));
        item.add(new NumberView(R.drawable.img7,"IceCreamSandwich","v4.0"));
        item.add(new NumberView(R.drawable.img8,"JellyBean","v4.1"));
        item.add(new NumberView(R.drawable.img9,"KitKat","v4.4"));
        item.add(new NumberView(R.drawable.img10,"LollyPop","v5.0"));
        item.add(new NumberView(R.drawable.img11,"Marshmallow","v6.0"));
        item.add(new NumberView(R.drawable.img12,"Nougat","v7.0"));
        item.add(new NumberView(R.drawable.img13,"Oreo","v8.0"));
        item.add(new NumberView(R.drawable.img14,"Pie","v9.0"));
        item.add(new NumberView(R.drawable.img15,"Android10","v10.0"));
        item.add(new NumberView(R.drawable.img16,"Android11","v11"));
        item.add(new NumberView(R.drawable.img1,"CupCake","v1.5"));
        item.add(new NumberView(R.drawable.img2,"Donut","v1.6"));
        item.add(new NumberView(R.drawable.img3,"Eclair","v2.0"));
        item.add(new NumberView(R.drawable.img4,"Froyo","v2.2"));
        item.add(new NumberView(R.drawable.img5,"GingerBread","v2.3"));
        item.add(new NumberView(R.drawable.img6,"HoneyComb","v3.0"));
        item.add(new NumberView(R.drawable.img7,"IceCreamSandwich","v4.0"));
        item.add(new NumberView(R.drawable.img8,"JellyBean","v4.1"));
        item.add(new NumberView(R.drawable.img9,"KitKat","v4.4"));
        item.add(new NumberView(R.drawable.img10,"LollyPop","v5.0"));
        item.add(new NumberView(R.drawable.img11,"Marshmallow","v6.0"));
        item.add(new NumberView(R.drawable.img12,"Nougat","v7.0"));
        item.add(new NumberView(R.drawable.img13,"Oreo","v8.0"));
        item.add(new NumberView(R.drawable.img14,"Pie","v9.0"));
        item.add(new NumberView(R.drawable.img15,"Android10","v10.0"));
        item.add(new NumberView(R.drawable.img16,"Android11","v11"));


        AdapterClass adapter = new AdapterClass(this,item);



        myList.setAdapter(adapter);




    }
}