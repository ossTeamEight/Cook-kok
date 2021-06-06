package org.techtown.cook_kok;

import androidx.appcompat.app.AppCompatActivity;

//import android.content.Intent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class RecommendQ1Activity extends AppCompatActivity {

    Button btn_no;
    Button btn_yes;
    ImageView genie;
    ImageView balloon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommend_question1);


        btn_no = findViewById(R.id.btn_no);
        btn_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String answer1 = "F"; //
                Intent intent1 = new Intent(RecommendQ1Activity.this, RecommendQ2Activity.class);
                intent1.putExtra("answer1", answer1);
                startActivity(intent1); //액티비티 이동.
                overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
            }
        });

        btn_yes = findViewById(R.id.btn_yes);
        btn_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String answer1 = "T";
                Intent intent1 = new Intent(RecommendQ1Activity.this, RecommendQ2Activity.class);
                intent1.putExtra("answer1", answer1);
                startActivity(intent1); //액티비티 이동.
                overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);            }
        });
        ;


        genie = (ImageView)findViewById(R.id.genie);
        Glide.with(this).load(R.drawable.genie).into(genie);
        genie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"저는 누르는게 아니에요!",Toast.LENGTH_SHORT).show();
            }
        });

        balloon = (ImageView)findViewById(R.id.balloon);
        balloon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });

        Button back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
