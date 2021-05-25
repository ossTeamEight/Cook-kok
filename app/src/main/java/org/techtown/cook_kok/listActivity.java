package org.techtown.cook_kok;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.ImageButton;
import android.os.Bundle;

public class listActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ImageButton button_korea = (ImageButton) findViewById(R.id.korea);
        button_korea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),
                        List_korea.class);
                startActivity(intent);
            }
        });

        ImageButton button_china = (ImageButton) findViewById(R.id.china);
        button_china.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),
                        List_china.class);
                startActivity(intent);
            }
        });

        ImageButton japan = (ImageButton) findViewById(R.id.japan);
        japan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),
                        List_japan.class);
                startActivity(intent);
            }
        });

        ImageButton western = (ImageButton) findViewById(R.id.western);
        western.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),
                        List_western.class);
                startActivity(intent);
            }
        });

        ImageButton others = (ImageButton) findViewById(R.id.others);
        others.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),
                        List_others.class);
                startActivity(intent);
            }
        });
    }
}