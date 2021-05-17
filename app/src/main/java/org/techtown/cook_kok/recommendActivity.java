package org.techtown.cook_kok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class recommendActivity extends AppCompatActivity {

    Button btn_no_text;
    Button btn_yes_text;
    Button btn_dontNo_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommend);


        btn_no_text = findViewById(R.id.btn_no_text);
        btn_no_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(recommendActivity.this, recommendActivity1.class);
                startActivities(intent); //액티비티 이동.
            }
        });

        btn_yes_text = findViewById(R.id.btn_yes_text);
        btn_yes_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(recommendActivity.this, recommendActivity1.class);
                startActivities(intent); //액티비티 이동.
            }
        });

        btn_dontNo_text = findViewById(R.id.btn_dontNo_text);
        btn_dontNo_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(recommendActivity.this, recommendActivity1.class);
                startActivities(intent); //액티비티 이동.
            }
        });
    }
}
