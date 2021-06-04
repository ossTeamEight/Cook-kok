package org.techtown.cook_kok;
//https://abhiandroid.com/ui/gridview
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class List_japan extends AppCompatActivity {

    GridView simpleList;
    ArrayList foodList =new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_grid_view);
        simpleList = (GridView) findViewById(R.id.simpleGridView);
        foodList.add(new Item("냉모밀",R.drawable.j1));
        foodList.add(new Item("돈까스",R.drawable.j2));
        foodList.add(new Item("매운탕",R.drawable.j3));
        foodList.add(new Item("알밥",R.drawable.j4));
        foodList.add(new Item("연어롤",R.drawable.j5));
        foodList.add(new Item("우동",R.drawable.j6));
        foodList.add(new Item("초밥",R.drawable.j7));
        foodList.add(new Item("캘리포니아롤",R.drawable.j8));
        foodList.add(new Item("회",R.drawable.j9));
        foodList.add(new Item("회덮밥",R.drawable.j10));

        FoodAdapter myAdapter=new FoodAdapter(this,R.layout.activity_list_grid_view_form, foodList);
        if(simpleList != null) {
            simpleList.setAdapter(myAdapter);
        }
    }
}