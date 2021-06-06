package org.techtown.cook_kok;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RecommendResultActivity extends AppCompatActivity {

    Button btn_roulette;
    Button btn_recommend;
    Button btn_show;
    TextView text_foodlist;
    String food_names = "";

    class ListNode {
        String spicy_data;
        String soup_data;
        String rice_data;
        String food_name;
        ListNode rlink;
        ListNode llink;
    }

    class DoubleLinkedList {
        private ListNode head;
        private ListNode tail;

        public DoubleLinkedList() {
            head = tail = null;
        }

        public void addNode(String food_name, String spicy_data, String soup_data, String rice_data) {
            ListNode newNode = new ListNode();
            newNode.food_name = food_name;
            newNode.spicy_data = spicy_data;
            newNode.soup_data = soup_data;
            newNode.rice_data = rice_data;

            if (head == null) {  // 처음으로 항이 추가되는 경우
                head = tail = newNode;
            } else {
                tail.rlink = newNode;
                newNode.llink = tail;
                tail = newNode;  // 마지막을 가리키는 항을 재지정
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommend_result);

        Intent intent3 = getIntent();

        Bundle bundle = intent3.getExtras();
        String answer1 = bundle.getString("answer1");
        String answer2 = bundle.getString("answer2");
        String answer3 = bundle.getString("answer3");

        DoubleLinkedList food = new DoubleLinkedList();
        food.addNode("깐풍기", "T", "F", "F");
        food.addNode("마라탕", "T", "T", "F");
        food.addNode("볶음밥", "F", "F", "T");
        food.addNode("양꼬치", "F", "F", "F");
        food.addNode("양장피", "F", "F", "F");
        food.addNode("잡채", "F", "F", "F");
        food.addNode("짜장면", "F", "F", "F");
        food.addNode("짬뽕", "T", "T", "F");
        food.addNode("탕수육", "F", "F", "F");
        food.addNode("팔보채", "T", "F", "F");
        food.addNode("냉모밀", "F", "T", "F");
        food.addNode("돈까스", "F", "F", "T");
        food.addNode("매운탕", "T", "T", "T");
        food.addNode("알밥", "F", "F", "T");
        food.addNode("연어롤", "F", "F", "T");
        food.addNode("우동", "F", "T", "F");
        food.addNode("초밥", "F", "F", "T");
        food.addNode("캘리포니아롤", "F", "F", "T");
        food.addNode("회", "F", "F", "F");
        food.addNode("회덮밥", "F", "F", "T");
        food.addNode("김밥", "F", "F", "T");
        food.addNode("김치찌개", "T", "T", "T");
        food.addNode("보쌈", "F", "F", "F");
        food.addNode("부대찌개", "T", "T", "T");
        food.addNode("비빔밥", "F", "F", "T");
        food.addNode("뼈해장국", "T", "T", "T");
        food.addNode("순대국", "F", "T", "T");
        food.addNode("제육볶음", "T", "F", "T");
        food.addNode("족발", "F", "F", "F");
        food.addNode("죽", "F", "F", "T");
        food.addNode("떡볶이", "T", "F", "F");
        food.addNode("라면", "T", "T", "F");
        food.addNode("샤브샤브", "F", "T", "F");
        food.addNode("쌀국수", "F", "T", "F");
        food.addNode("우육면", "F", "T", "F");
        food.addNode("치킨", "F", "F", "F");
        food.addNode("커리", "F", "T", "T");
        food.addNode("파니니", "F", "F", "F");
        food.addNode("파하타", "F", "F", "F");
        food.addNode("팟타이", "F", "F", "T");
        food.addNode("라자냐", "F", "F", "F");
        food.addNode("브리또", "F", "F", "F");
        food.addNode("샌드위치", "F", "F", "F");
        food.addNode("샐러드", "F", "F", "F");
        food.addNode("스테이크", "F", "F", "F");
        food.addNode("스파게티", "F", "F", "F");
        food.addNode("오믈렛", "F", "F", "T");
        food.addNode("크림파스타", "F", "F", "F");
        food.addNode("피자", "F", "F", "F");
        food.addNode("햄버거", "F", "F", "F");
        food.addNode("오삼불고기", "T", "F", "T");


        for (ListNode p = food.head; p != null; p = p.rlink) {
            if (p.spicy_data.equals(answer1) && p.soup_data.equals(answer2) && p.rice_data.equals(answer3)) {
                food_names += (p.food_name + ",");
            }
        }
        text_foodlist = findViewById(R.id.text_foodlist);
        text_foodlist.setText(food_names + " " + "이중에 먹어!");

        btn_recommend = findViewById(R.id.btn_recommend);
        btn_recommend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_recommend = new Intent(RecommendResultActivity.this, RecommendQ1Activity.class);
                startActivity(intent_recommend);
            }
        });

        btn_roulette = findViewById(R.id.btn_roulette);
        btn_roulette.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_roulette = new Intent(RecommendResultActivity.this, RouletteActivity.class);
                intent_roulette.putExtra("food_names", food_names);
                startActivity(intent_roulette);
            }
        });

        btn_show= findViewById(R.id.btn_show);
        btn_show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_show = new Intent(RecommendResultActivity.this, ShowActivity.class);
                startActivity(intent_show);
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
