package org.techtown.cook_kok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button_list = (Button) findViewById(R.id.list);
        button_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),listActivity.class);
                startActivity(intent);
            }
        });

        Button button_recommend = (Button) findViewById(R.id.recommend);
        button_recommend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), RecommendQ1Activity.class);
                startActivity(intent);
            }
        });

        Button button_show = (Button) findViewById(R.id.show);
        button_show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),showActivity.class);
                startActivity(intent);
            }
        });

        Button button_roulette = (Button) findViewById(R.id.roulette);
        button_roulette.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),rouletteActivity.class);
                startActivity(intent);
            }
        });
    }
}
