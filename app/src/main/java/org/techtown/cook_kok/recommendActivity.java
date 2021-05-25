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

public class recommendActivity extends AppCompatActivity {

    Button btn_no_text;
    Button btn_yes_text;
    ImageView sprit;
    ImageView balloon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommend);


        btn_no_text = findViewById(R.id.btn_no_text);
        btn_no_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(recommendActivity.this,recommendActivity2.class);
                startActivity(intent); //액티비티 이동.
            }
        });

        btn_yes_text = findViewById(R.id.btn_yes_text);
        btn_yes_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(recommendActivity.this,recommendActivity2.class);
                startActivity(intent); //액티비티 이동.
            }
        });
        ;


        sprit = (ImageView)findViewById(R.id.sprit);
        Glide.with(this).load(R.raw.sprit_image).into(sprit);
        sprit.setOnClickListener(new View.OnClickListener() {
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

    }
}


//class ListNode {
//	String spicy_data;
//	String soup_data;
//	String rice_data;
//	ListNode rlink;
//	ListNode llink;
//}
//
//class DoubleLinkedList {
//	private ListNode head;
//	private ListNode tail;
//
//	public DoubleLinkedList() {
//		head = tail = null;
//	}
//
//	public void addNode(String spicy_data, String soup_data, String rice_data) {
//		ListNode newNode = new ListNode();
//		newNode.spicy_data = spicy_data;
//		newNode.soup_data = soup_data;
//		newNode.rice_data = rice_data;
//		newNode.rlink = null;
//
//		if (head == null) {  // 처음으로 항이 추가되는 경우
//			head = tail = newNode;
//		} else {
//			tail.rlink = newNode;
//			newNode.llink = tail;
//			tail = newNode;  // 마지막을 가리키는 항을 재지정
//		}
//	}
//
//	public void deleteNode() {
//		for(ListNode p = head; p != null; p = p.rlink) {
//			if(!p.spicy_data.equals("T")) { //첫번째 질문에서 참을 골랐을 때 데이터가 "T"가 아니면
//				if(p.llink == null) { // p == head
//					head = head.rlink;
//					head.llink = null;
//				}
//				else if(p.rlink == null) { // p == tail
//					tail = p.llink;
//					tail.rlink = null;
//				}
//				else {
//					p.llink.rlink = p.rlink;
//					p.rlink.llink = p.llink;
//				}
//			}
//
//			//------------------------------------------------------------------------//
//
//			if(!p.spicy_data.equals("F")) { //첫번째 질문에서 거짓을 골랐을 때 데이터가 "F"가 아니면
//				if(p.llink == null) { // p == head
//					head = head.rlink;
//					head.llink = null;
//				}
//				else if(p.rlink == null) { // p == tail
//					tail = p.llink;
//					tail.rlink = null;
//				}
//				else {
//					p.llink.rlink = p.rlink;
//					p.rlink.llink = p.llink;
//				}
//			}
//		}
//	}
//	// 이 deletNode 메소드를 질문 3개에 대해 실행하면, 3번의 메소드를 거친 리스트가 나온다.
//	// 이를 ListView 형태로 recommedAcivity4 에 넣는다.
//}
//
//
//class Main {
//
//	public static void main(String[] args) throws Exception {
//
//		// LinkedList 생성
//		DoubleLinkedList raman = new DoubleLinkedList();
//		raman.addNode("T", "T", "F"); // 이걸 50개를 만든다.
//
//	}
//}
