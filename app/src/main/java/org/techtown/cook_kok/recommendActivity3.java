package org.techtown.cook_kok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class recommendActivity3 extends AppCompatActivity {

    Button btn_no_text;
    Button btn_yes_text;
    ImageView sprit;
    ImageView balloon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommend3);

        btn_no_text = findViewById(R.id.btn_no_text);
        btn_no_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(recommendActivity3.this,recommendActivity4.class);
                startActivity(intent); //액티비티 이동.
            }
        });

        btn_yes_text = findViewById(R.id.btn_yes_text);
        btn_yes_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(recommendActivity3.this,recommendActivity4.class);
                startActivity(intent); //액티비티 이동.
            }
        });
        ;


        sprit = (ImageView)findViewById(R.id.sprit);
        Glide.with(this).load(R.raw.sprit_image).into(sprit);
        sprit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"그만 눌러요...",Toast.LENGTH_SHORT).show();
            }
        });

        balloon = (ImageView)findViewById(R.id.balloon);
        balloon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}