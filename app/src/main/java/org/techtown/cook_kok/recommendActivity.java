package org.techtown.cook_kok;

import androidx.appcompat.app.AppCompatActivity;

//import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class recommendActivity extends AppCompatActivity {

    Button btn_no_text;
    Button btn_yes_text;
    Button btn_dontNo_text;
    ImageView test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommend);


        btn_no_text = findViewById(R.id.btn_no_text);
        btn_no_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               //Intent intent = new Intent(recommendActivity.this, recommendActivity1.class);
                //startActivities(intent); //액티비티 이동.
            }
        });

        btn_yes_text = findViewById(R.id.btn_yes_text);
        btn_yes_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent(recommendActivity.this, recommendActivity1.class);
                //startActivities(intent); //액티비티 이동.
            }
        });

        btn_dontNo_text = findViewById(R.id.btn_dontNo_text);
        btn_dontNo_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent(recommendActivity.this, recommendActivity1.class);
                //startActivities(intent); //액티비티 이동.
            }
        });


        test = (ImageView)findViewById(R.id.test);
        Glide.with(this).load(R.raw.sprit_image).into(test);
        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"저는 누르는게 아니에요!",Toast.LENGTH_SHORT).show();
            }
        });


    }
}
