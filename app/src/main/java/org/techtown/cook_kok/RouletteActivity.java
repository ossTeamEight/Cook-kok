package org.techtown.cook_kok;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class RouletteActivity extends AppCompatActivity {//돌림판을 누르면 바로 랜덤으로 6가지, 추천을 받고 올 경우 (intent?)로 string arraylist를 받아 그 음식들로 6가지
    private CircleManager circleManager;
    private RelativeLayout layoutRoulette;

    private Button btnDrawRoulette;
    private Button btnRotate;
    private TextView tvResult;

    private ArrayList<String> STRINGS;
    private float initAngle = 0.0f;
    private int num_roulette;
    String[] m_array = {"짜장면","짬뽕","볶음밥","양꼬치","팔보채","잡채","마라탕","깐풍기","양장피","라조기",
            "냉모밀","돈까스","매운탕","알밥","연어롤","우동","초밥","캘리포니아롤","회","회덮밥",
            "김밥","김치찌개","보쌈","부대찌개","비빔밥","뼈해장국","순대국","제육볶음","족발","죽",
            "떡볶이","라면","샤브샤브","쌀국수","파니니","우육면","치킨","커리","파히니","팟타이",
            "라자냐","브리또","샌드위치","샐러드","스테이크","스파게티","오믈렛","크림파스타","피자","햄버거"};

    int[] id_array = {R.drawable.c7, R.drawable.c8,R.drawable.c3,R.drawable.c4,R.drawable.c5,
            R.drawable.c6,R.drawable.c2,R.drawable.c1,R.drawable.c9,R.drawable.c10,
            R.drawable.j1,R.drawable.j2,R.drawable.j3,R.drawable.j4,R.drawable.j5,
            R.drawable.j6,R.drawable.j7,R.drawable.j8,R.drawable.j9,R.drawable.j10,
            R.drawable.k1,R.drawable.k2,R.drawable.k3,R.drawable.k4,R.drawable.k5,
            R.drawable.k6,R.drawable.k7,R.drawable.k8,R.drawable.k9,R.drawable.k10,
            R.drawable.o1,R.drawable.o2,R.drawable.o3,R.drawable.o4,R.drawable.o5,
            R.drawable.o6,R.drawable.o7,R.drawable.o8,R.drawable.o9,R.drawable.o10,
            R.drawable.w1,R.drawable.w2,R.drawable.w3,R.drawable.w4,R.drawable.w5,
            R.drawable.w6,R.drawable.w7,R.drawable.w8,R.drawable.w9,R.drawable.w10};
    String[] s_array;

    Dialog myDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roulette);
        tvResult = findViewById(R.id.tvResult);
        btnRotate = findViewById(R.id.btnRotate);
        btnDrawRoulette = findViewById(R.id.btnDrawRoulette);
        layoutRoulette = findViewById(R.id.layoutRoulette);
        myDialog=new Dialog(this);
        Intent intent_roulette = getIntent();
        Bundle bundle = intent_roulette.getExtras();

        String food_names = bundle.getString("food_names");
        food_names = food_names.substring(0, food_names.length()-1);
        System.out.println(food_names);
        s_array = food_names.split(",");

        btnDrawRoulette.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//*******************목록이 6개 넘을 시, 랜덤 값으로 룰렛 개수 최대 6개를 맞춤******************************
                STRINGS = new ArrayList<>();
                if(s_array.length > 6) {
                    num_roulette = 6;
                    Set<Integer> set = new HashSet<>();
                    Random r = new Random();

                    while (set.size() < 6){
                        int i = r.nextInt(s_array.length);
                        set.add(i);
                    }
                    Iterator<Integer> it = set.iterator();
                    while(it.hasNext())
                        STRINGS.add(s_array[it.next()]);
                }
                else {
                    num_roulette = s_array.length;
                    for(int i = 0; i<num_roulette;i++){
                        STRINGS.add(s_array[i]);
                    }
                }
//**************************************************************************************************
                circleManager = new CircleManager(RouletteActivity.this, num_roulette);
                layoutRoulette.addView(circleManager);
                btnDrawRoulette.setVisibility(View.INVISIBLE);
            }
        });

        btnRotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rotateLayout(layoutRoulette, num_roulette);
            }
        });
    }

    public void rotateLayout(final RelativeLayout layout, final int num) {
        final float fromAngle = getRandom(360) + 3600 + initAngle;

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                getResult(fromAngle, num); // start when animation complete
            }
        }, 3000);

        RotateAnimation rotateAnimation = new RotateAnimation(initAngle, fromAngle,
                Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);

        rotateAnimation.setInterpolator(AnimationUtils.loadInterpolator(this, android.R.anim.accelerate_decelerate_interpolator));
        rotateAnimation.setDuration(3000);
        rotateAnimation.setFillEnabled(true);
        rotateAnimation.setFillAfter(true);
        layout.startAnimation(rotateAnimation);
    }

    // get Angle to random
    private int getRandom(int maxNumber) {
        double r = Math.random();
        return (int)(r * maxNumber);
    }

    private void getResult(float angle, int num_roulette) {
        String text = "";
        angle = angle % 360;

        Log.d("roulette", "getResult : " + angle);

        switch(num_roulette){
            case 2:
                if(angle > 90 && angle <= 270) {
                    text = STRINGS.get(0);
                    ShowPopup(text);
                }
                else if (angle > 270 || angle <= 90){
                    text = STRINGS.get(1);
                    ShowPopup(text);
                }
                break;
            case 3:
                if (angle > 270 || angle <= 30) {
                    text = STRINGS.get(2);
                    ShowPopup(text);
                }
                else if (angle > 30 && angle <= 150){
                    text =STRINGS.get(1);
                    ShowPopup(text);
                }
                else if (angle > 150 && angle <= 270){
                    text = STRINGS.get(0);
                    ShowPopup(text);
                }
                break;
            case 4:
                if (angle >= 270) {
                    text = STRINGS.get(3);
                    ShowPopup(text);
                }
                else if (angle >= 180 && angle < 270){
                    text =STRINGS.get(0);
                    ShowPopup(text);
                }
                else if (angle >= 90 && angle < 180){
                    text = STRINGS.get(1);
                    ShowPopup(text);
                }
                else if (angle < 90){
                    text = STRINGS.get(2);
                    ShowPopup(text);
                }
                break;
            case 5:
                if (angle > 270 && angle <= 342) {
                    text = STRINGS.get(4);
                    ShowPopup(text);
                }
                else if (angle > 198 && angle <= 270){
                    text =STRINGS.get(0);
                    ShowPopup(text);
                }
                else if (angle > 126 && angle <= 198){
                    text = STRINGS.get(1);
                    ShowPopup(text);
                }
                else if (angle > 54 && angle <= 126){
                    text = STRINGS.get(2);
                    ShowPopup(text);
                }
                else if (angle <= 54 || angle > 342){
                    text = STRINGS.get(3);
                    ShowPopup(text);
                }
                break;
            case 6:
                if (angle > 330 || angle <= 30) {
                    text = STRINGS.get(4);
                    ShowPopup(text);
                } else if (angle > 30 && angle <= 90) {
                    text = STRINGS.get(3);
                    ShowPopup(text);
                } else if (angle > 90 && angle <= 150) {
                    text = STRINGS.get(2);
                    ShowPopup(text);
                } else if (angle > 150 && angle <= 210) {
                    text = STRINGS.get(1);
                    ShowPopup(text);
                } else if (angle > 210 && angle <= 270) {
                    text = STRINGS.get(0);
                    ShowPopup(text);
                } else if (angle > 270 && angle <= 330) {
                    text = STRINGS.get(5);
                    ShowPopup(text);
                }
                break;
                //확장가능
        }

        tvResult.setText("오늘의 식사 "+text+"!");
    }

    public void ShowPopup(String text){
        TextView txtclose, cookname;
        ImageView cookimage;

        myDialog.setContentView(R.layout.activity_roulette_result);
        cookname = myDialog.findViewById(R.id.cook_name);
        cookname.setText(text+" 당첨!");
        cookimage = myDialog.findViewById(R.id.cook_image);

        int index = Arrays.binarySearch(m_array,text);
        System.out.println(text);
        System.out.println(index);
        cookimage.setImageResource(id_array[index]);

        txtclose=(TextView) myDialog.findViewById(R.id.txtclose);
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();
    }

    public class CircleManager extends View {
        private Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
//        private int[] COLORS = {Color.parseColor("#FFFF7F50"), Color.parseColor("#FF3CB371"), Color.parseColor("#FF6495ED"),
//                Color.parseColor("#FFADD8E6"), Color.parseColor("#FFDDA0DD"), Color.GRAY};
        private int[] COLORS = {Color.parseColor("#FF9575CD"), Color.parseColor("#FFB39DDB")};
        private int num;

        public CircleManager(Context context, int num) {
            super(context);
            this.num = num;
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);

            int width = layoutRoulette.getWidth();
            int height = layoutRoulette.getHeight();
            int sweepAngle = 360 / num;

            RectF rectF = new RectF(0, 0, width, height);
            Rect rect = new Rect(0, 0, width, height);

            int centerX = (rect.left + rect.right) / 2;
            int centerY = (rect.top + rect.bottom) / 2;
            int radius = (rect.right - rect.left) / 2;

            int temp = 0;

            for (int i = 0; i < num; i++) {
                paint.setColor(COLORS[i%2]);
                paint.setStyle(Paint.Style.FILL_AND_STROKE);
                paint.setAntiAlias(true);
                paint.setTextAlign(Paint.Align.CENTER);
                canvas.drawArc(rectF, temp, sweepAngle, true, paint);

                float medianAngle = (temp + (sweepAngle / 2f)) * (float) Math.PI / 180f;

                paint.setColor(Color.BLACK);
                paint.setTextSize(64);
                paint.setStyle(Paint.Style.FILL_AND_STROKE);

                float arcCenterX = (float) (centerX + (radius * Math.cos(medianAngle))); // Arc's center X
                float arcCenterY = (float) (centerY + (radius * Math.sin(medianAngle))); // Arc's center Y

                // put text at middle of Arc's center point and Circle's center point
                float textX = (centerX + arcCenterX) / 2;
                float textY = (centerY + arcCenterY) / 2;

                canvas.drawText(STRINGS.get(i), textX, textY, paint);
                temp += sweepAngle;
            }
        }
    }
    // if you want use AlertDialog then use this
    private void buildAlert(String text) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("바꾸기 금지!")
                .setMessage(text + " 당첨!!")
                .setPositiveButton("OK", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        layoutRoulette.setRotation(360 - initAngle);
                    }
                });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }


}