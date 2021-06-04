package org.techtown.cook_kok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class RecommendQ2Activity extends AppCompatActivity {

    Button btn_no;
    Button btn_yes;
    ImageView sprit;
    ImageView balloon;
    Intent intent1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommend_question2);

        intent1 = getIntent();

        btn_no = findViewById(R.id.btn_no);
        btn_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = intent1.getExtras();
                String answer1 = bundle.getString("answer1");
                String answer2 = "F";
                Intent intent2 = new Intent(RecommendQ2Activity.this, RecommendQ3Activity.class);
                intent2.putExtra("answer1", answer1);
                intent2.putExtra("answer2", answer2);
                startActivity(intent2); //액티비티 이동.
            }
        });

        btn_yes = findViewById(R.id.btn_yes);
        btn_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = intent1.getExtras();
                String answer1 = bundle.getString("answer1");
                String answer2 = "T";
                Intent intent2 = new Intent(RecommendQ2Activity.this, RecommendQ3Activity.class);
                intent2.putExtra("answer1", answer1);
                intent2.putExtra("answer2", answer2);
                startActivity(intent2); //액티비티 이동.
            }
        });


        sprit = (ImageView)findViewById(R.id.sprit);
        Glide.with(this).load(R.raw.sprit_image).into(sprit);
        sprit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"저는 누르는게 아니라구요!",Toast.LENGTH_SHORT).show();
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