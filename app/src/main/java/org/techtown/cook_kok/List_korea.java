package org.techtown.cook_kok;
//https://abhiandroid.com/ui/gridview
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class List_korea extends AppCompatActivity {

    GridView simpleList;
    ArrayList foodList =new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_grid_view);
        simpleList = (GridView) findViewById(R.id.simpleGridView);
        foodList.add(new Item("김밥",R.drawable.k1));
        foodList.add(new Item("김치찌개",R.drawable.k2));
        foodList.add(new Item("보쌈",R.drawable.k3));
        foodList.add(new Item("부대찌개",R.drawable.k4));
        foodList.add(new Item("비빔밥",R.drawable.k5));
        foodList.add(new Item("뼈해장국",R.drawable.k6));
        foodList.add(new Item("순대국",R.drawable.k7));
        foodList.add(new Item("제육볶음",R.drawable.k8));
        foodList.add(new Item("족발",R.drawable.k9));
        foodList.add(new Item("죽",R.drawable.k10));
        foodList.add(new Item("오징어삼겹살",R.drawable.k11));


        FoodAdapter myAdapter=new FoodAdapter(this,R.layout.activity_list_grid_view_form, foodList);
        if(simpleList != null) {
            simpleList.setAdapter(myAdapter);
        }
    }
}