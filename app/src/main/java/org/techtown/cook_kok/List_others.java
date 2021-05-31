package org.techtown.cook_kok;
//https://abhiandroid.com/ui/gridview
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class List_others extends AppCompatActivity {

    GridView simpleList;
    ArrayList foodList =new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_others_food);
        simpleList = (GridView) findViewById(R.id.simpleGridView);
        foodList.add(new Item("떡볶이",R.drawable.o1));
        foodList.add(new Item("라면",R.drawable.o2));
        foodList.add(new Item("샤브샤브",R.drawable.o3));
        foodList.add(new Item("쌀국수",R.drawable.o4));
        foodList.add(new Item("파니니",R.drawable.o5));
        foodList.add(new Item("우육면",R.drawable.o6));
        foodList.add(new Item("치킨",R.drawable.o7));
        foodList.add(new Item("커리",R.drawable.o8));
        foodList.add(new Item("파히니",R.drawable.o9));
        foodList.add(new Item("팟타이",R.drawable.o10));

        FoodAdapter myAdapter=new FoodAdapter(this,R.layout.grid_view_items, foodList);
        if(simpleList != null) {
            simpleList.setAdapter(myAdapter);
        }
    }
}