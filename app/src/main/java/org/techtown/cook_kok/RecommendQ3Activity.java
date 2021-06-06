package org.techtown.cook_kok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class RecommendQ3Activity extends AppCompatActivity {

    Button btn_no;
    Button btn_yes;
    ImageView genie;
    ImageView balloon;
    Intent intent2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommend_question3);

        intent2 = getIntent();

        btn_no = findViewById(R.id.btn_no);
        btn_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = intent2.getExtras();
                String answer1 = bundle.getString("answer1");
                String answer2 = bundle.getString("answer2");
                String answer3 = "F";
                Intent intent3 = new Intent(RecommendQ3Activity.this, RecommendResultActivity.class);
                intent3.putExtra("answer1", answer1);
                intent3.putExtra("answer2", answer2);
                intent3.putExtra("answer3", answer3);
                startActivity(intent3); //액티비티 이동.
            }
        });

        btn_yes = findViewById(R.id.btn_yes);
        btn_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = intent2.getExtras();
                String answer1 = bundle.getString("answer1");
                String answer2 = bundle.getString("answer2");
                String answer3 = "T";
                Intent intent3 = new Intent(RecommendQ3Activity.this, RecommendResultActivity.class);
                intent3.putExtra("answer1", answer1);
                intent3.putExtra("answer2", answer2);
                intent3.putExtra("answer3", answer3);
                startActivity(intent3); //액티비티 이동.
            }
        });


        genie = (ImageView)findViewById(R.id.genie);
        Glide.with(this).load(R.drawable.genie).into(genie);
        genie.setOnClickListener(new View.OnClickListener() {
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

        Button back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
    }
}