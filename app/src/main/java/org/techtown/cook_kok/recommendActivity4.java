package org.techtown.cook_kok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class recommendActivity4 extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommend4);

        textView = findViewById(R.id.textView);

        Intent intent = getIntent();
        String[] value = intent.getStringArrayExtra("value");

        textView.setText(value[0] + "/" + value[1] + "/" + value[2]);
    }
}

class ListNode {
    String spicy_data;
    String soup_data;
    String rice_data;
    String food;
    ListNode rlink;
    ListNode llink;
}

class DoubleLinkedList {
    private ListNode head;
    private ListNode tail;

    public DoubleLinkedList() {
        head = tail = null;
    }

    public void addNode(String food, String spicy_data, String soup_data, String rice_data) {
        ListNode newNode = new ListNode();
        newNode.food = food;
        newNode.spicy_data = spicy_data;
        newNode.soup_data = soup_data;
        newNode.rice_data = rice_data;
        newNode.rlink = null;

        if (head == null) {  // 처음으로 항이 추가되는 경우
            head = tail = newNode;
        } else {
            tail.rlink = newNode;
            newNode.llink = tail;
            tail = newNode;  // 마지막을 가리키는 항을 재지정
        }
    }

    public void deleteNode() {
        for(ListNode p = head; p != null; p = p.rlink) {
            if(!p.spicy_data.equals("T")) { //첫번째 질문에서 참을 골랐을 때 데이터가 "T"가 아니면
                if(p.llink == null) { // p == head
                    head = head.rlink;
                    head.llink = null;
                }
                else if(p.rlink == null) { // p == tail
                    tail = p.llink;
                    tail.rlink = null;
                }
                else {
                    p.llink.rlink = p.rlink;
                    p.rlink.llink = p.llink;
                }
            }

            //------------------------------------------------------------------------//

            if(!p.spicy_data.equals("F")) { //첫번째 질문에서 거짓을 골랐을 때 데이터가 "F"가 아니면
                if(p.llink == null) { // p == head
                    head = head.rlink;
                    head.llink = null;
                }
                else if(p.rlink == null) { // p == tail
                    tail = p.llink;
                    tail.rlink = null;
                }
                else {
                    p.llink.rlink = p.rlink;
                    p.rlink.llink = p.llink;
                }
            }
        }
    }
    // 이 deletNode 메소드를 질문 3개에 대해 실행하면, 3번의 메소드를 거친 리스트가 나온다.
    // 이를 ListView 형태로 recommedAcivity4 에 넣는다.
}


class Main {

    public static void main(String[] args) throws Exception {

        // LinkedList 생성
        DoubleLinkedList food = new DoubleLinkedList();
        food.addNode("c1","T", "F", "F");
        food.addNode("c2","T", "T", "F");
        food.addNode("c3","T", "T", "T");
        food.addNode("c4","F", "F", "F");
        food.addNode("c5","F", "F", "F");
        food.addNode("c6","F", "F", "F");
        food.addNode("c7","F", "F", "F");
        food.addNode("c8","T", "T", "F");
        food.addNode("c9","F", "F", "F");
        food.addNode("c10","T", "F", "F");
        food.addNode("j1","F", "T", "F");
        food.addNode("j2","F", "F", "T");
        food.addNode("j3","T", "T", "F");
        food.addNode("j4","F", "F", "T");
        food.addNode("j5","F", "F", "T");
        food.addNode("j6","F", "T", "F");
        food.addNode("j7","F", "F", "T");
        food.addNode("j8","F", "F", "T");
        food.addNode("j9","F", "F", "F");
        food.addNode("j10","F", "F", "T");
        food.addNode("k1","F", "F", "T");
        food.addNode("k2","T", "T", "F");
        food.addNode("k3","F", "F", "F");
        food.addNode("k4","T", "T", "F");
        food.addNode("k5","F", "F", "T");
        food.addNode("k6","T", "T", "F");
        food.addNode("k7","F", "T", "F");
        food.addNode("k8","T", "F", "F");
        food.addNode("k9","F", "F", "F");
        food.addNode("k10","F", "F", "T");
        food.addNode("o1","T", "F", "F");
        food.addNode("o2","T", "T", "F");
        food.addNode("o3","F", "T", "F");
        food.addNode("o4","F", "T", "F");
        food.addNode("o5","F", "T", "F");
        food.addNode("o6","F", "F", "F");
        food.addNode("o7","F", "T", "T");
        food.addNode("o8","F", "F", "F");
        food.addNode("o9","F", "F", "F");
        food.addNode("o10","F", "F", "T");
        food.addNode("w1","F", "F", "F");
        food.addNode("w2","F", "F", "F");
        food.addNode("w3","F", "F", "F");
        food.addNode("w4","F", "F", "F");
        food.addNode("w5","F", "F", "F");
        food.addNode("w6","F", "F", "F");
        food.addNode("w7","F", "F", "T");
        food.addNode("w8","F", "F", "F");
        food.addNode("w9","F", "F", "F");
        food.addNode("w10","F", "F", "F");
    }
}
