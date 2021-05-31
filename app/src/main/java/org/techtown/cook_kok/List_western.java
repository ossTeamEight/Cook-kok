package org.techtown.cook_kok;
//https://abhiandroid.com/ui/gridview
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class List_western extends AppCompatActivity {

    GridView simpleList;
    ArrayList foodList =new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_western_food);
        simpleList = (GridView) findViewById(R.id.simpleGridView);
        foodList.add(new Item("라자냐",R.drawable.w1));
        foodList.add(new Item("브리또",R.drawable.w2));
        foodList.add(new Item("샌드위치",R.drawable.w3));
        foodList.add(new Item("샐러드",R.drawable.w4));
        foodList.add(new Item("스테이크",R.drawable.w5));
        foodList.add(new Item("스파게티",R.drawable.w6));
        foodList.add(new Item("오믈렛",R.drawable.w7));
        foodList.add(new Item("크림파스타",R.drawable.w8));
        foodList.add(new Item("피자",R.drawable.w9));
        foodList.add(new Item("햄버거",R.drawable.w10));

        FoodAdapter myAdapter=new FoodAdapter(this,R.layout.grid_view_items, foodList);
        if(simpleList != null) {
            simpleList.setAdapter(myAdapter);
        }
    }
}