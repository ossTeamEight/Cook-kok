package org.techtown.cook_kok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Pattern;

import com.google.android.material.textfield.TextInputLayout;

public class Put_nameActivity extends AppCompatActivity {

    Boolean check = false;
    String food_names;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_putname);

        Button goRoulette = findViewById(R.id.goRotate);
        TextInputLayout inputLayout = findViewById(R.id.input_layout);

        EditText editText = inputLayout.getEditText();

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                String pattern = "^[\\w,]*$";
                if(!Pattern.matches(pattern, s)){
                    inputLayout.setError("형식에 맞춰주세요.");
                    check = false;
                }else{
                    if(Pattern.matches("^[\\w,]+,$",s)){
                        inputLayout.setError("마지막은 단어로 끝나야합니다.");
                        check = false;
                    }
                    else {
                        inputLayout.setError(null);
                        check = true;
                        food_names = s.toString();
                    }
                }
            }
        });

        goRoulette.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (check) {
                    Intent intent_roulette = new Intent(Put_nameActivity.this, RouletteActivity.class);
                    intent_roulette.putExtra("food_names", food_names+",");
                    startActivity(intent_roulette);
                }
                else{
                    Toast.makeText(getApplicationContext(),"입력을 완성해주세요!",Toast.LENGTH_SHORT).show();
                }
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