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

public class RouletteActivity extends AppCompatActivity {//돌림판을 누르면 바로 랜덤으로 6가지, 추천을 받고 올 경우 (intent?)로 string arraylist를 받아 그 음식들로 6가지
    private CircleManager circleManager;
    private RelativeLayout layoutRoulette;

    private Button btnDrawRoulette;
    private Button btnRotate;
    private TextView tvResult;

    private ArrayList<String> STRINGS;
    private float initAngle = 0.0f;
    private int num_roulette;
    String[] s_array = {"짜장면","짬뽕"}; //intent로 받아오기
    //String[] s_array = {"짜장면","짬뽕","탕수육","깐풍기","마라탕","볶음밥"};
    
    int[] id_array = {R.drawable.c7, R.drawable.c8};

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

        btnDrawRoulette.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num_roulette = s_array.length;
                STRINGS = new ArrayList<>();
                for(int i = 0; i<s_array.length;i++){
                    STRINGS.add(s_array[i]);
                }
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

        int index = Arrays.binarySearch(s_array,text);
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

    public class CircleManager extends View {
        private Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        private int[] COLORS = {Color.parseColor("#FFFF7F50"), Color.parseColor("#FF3CB371"), Color.parseColor("#FF6495ED"),
                Color.parseColor("#FFADD8E6"), Color.parseColor("#FFDDA0DD"), Color.GRAY};
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
                paint.setColor(COLORS[i]);
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


}

/*
public class rouletteActivity extends AppCompatActivity {//돌림판을 누르면 바로 랜덤으로 6가지, 추천을 받고 올 경우 (intent?)로 string arraylist를 받아 그 음식들로 6가지
    private CircleManager circleManager;
    private RelativeLayout layoutRoulette;

    private Button btnDrawRoulette;
    private Button btnRotate;
    private TextView tvResult;

    private ArrayList<String> STRINGS;
    private float initAngle = 0.0f;
    private int num_roulette;
    String[] s_array = {"0","1","2","3","4"}; //intent로 받아오기
    //String[] s_array = {"짜장면","짬뽕","탕수육","깐풍기","마라탕","볶음밥"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roulette);

        tvResult = findViewById(R.id.tvResult);
        btnRotate = findViewById(R.id.btnRotate);
        btnDrawRoulette = findViewById(R.id.btnDrawRoulette);
        layoutRoulette = findViewById(R.id.layoutRoulette);


        btnDrawRoulette.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num_roulette = s_array.length;
                STRINGS = new ArrayList<>();
                for(int i = 0; i<s_array.length;i++){
                    STRINGS.add(s_array[i]);
                }
                circleManager = new CircleManager(rouletteActivity.this, num_roulette);
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
                    buildAlert(text);
                }
                else if (angle > 270 || angle <= 90){
                    text = STRINGS.get(1);
                    buildAlert(text);
                }
                break;
            case 3:
                if (angle > 270 || angle <= 30) {
                    text = STRINGS.get(2);
                    buildAlert(text);
                }
                else if (angle > 30 && angle <= 150){
                    text =STRINGS.get(1);
                    buildAlert(text);
                }
                else if (angle > 150 && angle <= 270){
                    text = STRINGS.get(0);
                    buildAlert(text);
                }
                break;
            case 4:
                if (angle >= 270) {
                    text = STRINGS.get(3);
                    buildAlert(text);
                }
                else if (angle >= 180 && angle < 270){
                    text =STRINGS.get(0);
                    buildAlert(text);
                }
                else if (angle >= 90 && angle < 180){
                    text = STRINGS.get(1);
                    buildAlert(text);
                }
                else if (angle < 90){
                    text = STRINGS.get(2);
                    buildAlert(text);
                }
                break;
            case 5:
                if (angle > 270 && angle <= 342) {
                    text = STRINGS.get(4);
                    buildAlert(text);
                }
                else if (angle > 198 && angle <= 270){
                    text =STRINGS.get(0);
                    buildAlert(text);
                }
                else if (angle > 126 && angle <= 198){
                    text = STRINGS.get(1);
                    buildAlert(text);
                }
                else if (angle > 54 && angle <= 126){
                    text = STRINGS.get(2);
                    buildAlert(text);
                }
                else if (angle <= 54 || angle > 342){
                    text = STRINGS.get(3);
                    buildAlert(text);
                }
                break;
            case 6:
                if (angle > 330 || angle <= 30) {
                    text = STRINGS.get(4);
                    buildAlert(text);
                } else if (angle > 30 && angle <= 90) {
                    text = STRINGS.get(3);
                    buildAlert(text);
                } else if (angle > 90 && angle <= 150) {
                    text = STRINGS.get(2);
                    buildAlert(text);
                } else if (angle > 150 && angle <= 210) {
                    text = STRINGS.get(1);
                    buildAlert(text);
                } else if (angle > 210 && angle <= 270) {
                    text = STRINGS.get(0);
                    buildAlert(text);
                } else if (angle > 270 && angle <= 330) {
                    text = STRINGS.get(5);
                    buildAlert(text);
                }
                break;
                //확장가능
        }

        tvResult.setText("오늘의 식사 "+text+"!");
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

    public class CircleManager extends View {
        private Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        private int[] COLORS = {Color.parseColor("#FFFF7F50"), Color.parseColor("#FF3CB371"), Color.parseColor("#FF6495ED"),
                Color.parseColor("#FFADD8E6"), Color.parseColor("#FFDDA0DD"), Color.GRAY};
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
                paint.setColor(COLORS[i]);
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


}

 */
