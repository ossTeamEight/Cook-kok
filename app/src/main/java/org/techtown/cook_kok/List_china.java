package org.techtown.cook_kok;
//https://abhiandroid.com/ui/gridview
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class List_china extends AppCompatActivity {

    GridView simpleList;
    ArrayList foodList =new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_china_food);
        simpleList = (GridView) findViewById(R.id.simpleGridView);
        foodList.add(new Item("짜장면",R.drawable.c8));
        foodList.add(new Item("짬뽕",R.drawable.c9));
        foodList.add(new Item("볶음밥",R.drawable.c3));
        foodList.add(new Item("양꼬치",R.drawable.c4));
        foodList.add(new Item("팔보채",R.drawable.c5));
        foodList.add(new Item("잡채",R.drawable.c6));
        foodList.add(new Item("마라탕",R.drawable.c2));
        foodList.add(new Item("깐풍기",R.drawable.c1));
        foodList.add(new Item("양장피",R.drawable.c9));
        foodList.add(new Item("라조기",R.drawable.c10));

        FoodAdapter myAdapter=new FoodAdapter(this,R.layout.grid_view_items, foodList);
        if(simpleList != null) {
            simpleList.setAdapter(myAdapter);
        }
    }
}