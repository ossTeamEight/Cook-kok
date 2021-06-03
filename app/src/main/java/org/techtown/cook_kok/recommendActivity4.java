package org.techtown.cook_kok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class recommendActivity4 extends AppCompatActivity {

    Button roulette;

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
        setContentView(R.layout.activity_recommend4);

        Intent intent3 = getIntent();

        Bundle bundle = intent3.getExtras();
        final String answer1 = bundle.getString("answer1");
        final String answer2 = bundle.getString("answer2");
        final String answer3 = bundle.getString("answer3");

        DoubleLinkedList food = new DoubleLinkedList();
        food.addNode("c1", "T", "F", "F");
        food.addNode("c2", "T", "T", "F");
        food.addNode("c3", "T", "T", "T");
        food.addNode("c4", "F", "F", "F");
        food.addNode("c5", "F", "F", "F");
        food.addNode("c6", "F", "F", "F");
        food.addNode("c7", "F", "F", "F");
        food.addNode("c8", "T", "T", "F");
        food.addNode("c9", "F", "F", "F");
        food.addNode("c10", "T", "F", "F");
        food.addNode("j1", "F", "T", "F");
        food.addNode("j2", "F", "F", "T");
        food.addNode("j3", "T", "T", "F");
        food.addNode("j4", "F", "F", "T");
        food.addNode("j5", "F", "F", "T");
        food.addNode("j6", "F", "T", "F");
        food.addNode("j7", "F", "F", "T");
        food.addNode("j8", "F", "F", "T");
        food.addNode("j9", "F", "F", "F");
        food.addNode("j10", "F", "F", "T");
        food.addNode("k1", "F", "F", "T");
        food.addNode("k2", "T", "T", "F");
        food.addNode("k3", "F", "F", "F");
        food.addNode("k4", "T", "T", "F");
        food.addNode("k5", "F", "F", "T");
        food.addNode("k6", "T", "T", "F");
        food.addNode("k7", "F", "T", "F");
        food.addNode("k8", "T", "F", "F");
        food.addNode("k9", "F", "F", "F");
        food.addNode("k10", "F", "F", "T");
        food.addNode("o1", "T", "F", "F");
        food.addNode("o2", "T", "T", "F");
        food.addNode("o3", "F", "T", "F");
        food.addNode("o4", "F", "T", "F");
        food.addNode("o5", "F", "T", "F");
        food.addNode("o6", "F", "F", "F");
        food.addNode("o7", "F", "T", "T");
        food.addNode("o8", "F", "F", "F");
        food.addNode("o9", "F", "F", "F");
        food.addNode("o10", "F", "F", "T");
        food.addNode("w1", "F", "F", "F");
        food.addNode("w2", "F", "F", "F");
        food.addNode("w3", "F", "F", "F");
        food.addNode("w4", "F", "F", "F");
        food.addNode("w5", "F", "F", "F");
        food.addNode("w6", "F", "F", "F");
        food.addNode("w7", "F", "F", "T");
        food.addNode("w8", "F", "F", "F");
        food.addNode("w9", "F", "F", "F");
        food.addNode("w10", "F", "F", "F");

        for(ListNode p = food.head; p != null; p = p.rlink) {
            if (p.spicy_data.equals(answer1) && p.soup_data.equals(answer2) && p.rice_data.equals(answer3)) {
                p.food_name;
            }
        }



        roulette = findViewById(R.id.roulette);
        roulette.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(recommendActivity4.this, rouletteActivity.class);
                startActivity(intent4);
            }
        });
    }
}

//    public void findFood() {
//        for(ListNode p = food.head; p != null; p = p.rlink) {
//            if(!p.spicy_data.equals("T")) { //첫번째 질문에서 참을 골랐을 때 데이터가 "T"가 아니면
//                if(p.llink == null) { // p == head
//                    food.head = food.head.rlink;
//                    food.head.llink = null;
//                }
//                else if(p.rlink == null) { // p == tail
//                    food.tail = p.llink;
//                    food.tail.rlink = null;
//                }
//                else {
//                    p.llink.rlink = p.rlink;
//                    p.rlink.llink = p.llink;
//                }
//            }
