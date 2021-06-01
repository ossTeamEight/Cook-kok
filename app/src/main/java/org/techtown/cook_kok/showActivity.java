package org.techtown.cook_kok;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class showActivity extends AppCompatActivity {
    Dialog myDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        myDialog=new Dialog(this);
    }
    public void ShowPopup(View view){
        TextView txtclose;
        myDialog.setContentView(R.layout.activity_show_menu_hansik);
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
    public void ShowPopup2(View view){
        TextView txtclose;
        myDialog.setContentView(R.layout.activity_show_menu_jungsik);
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
    public void ShowPopup3(View view){
        TextView txtclose;
        myDialog.setContentView(R.layout.activity_show_menu_yangsik);
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
    public void ShowPopup4(View view){
        TextView txtclose;
        myDialog.setContentView(R.layout.activity_show_menu_ilsik);
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
    public void ShowPopup5(View view){
        TextView txtclose;
        myDialog.setContentView(R.layout.activity_show_menu_guitar);
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
    public void ShowPopup6(View view){
        TextView txtclose;
        myDialog.setContentView(R.layout.activity_show_menu_roulette);
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


    public void onButton_1_1_Clicked(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=%EA%B9%80%EB%B0%A5&tbm=isch&ved=2ahUKEwiu59D4mvfwAhWLAKYKHUvNDIoQ2-cCegQIABAA&oq=%EA%B9%80%EB%B0%A5&gs_lcp=CgNpbWcQAzICCAAyAggAMgIIADICCAAyAggAMgIIADICCAAyAggAMgIIADICCAA6BAgAEBhQyCZY1yhgtyloAHAAeACAAWaIAcQBkgEDMS4xmAEAoAEBqgELZ3dzLXdpei1pbWfAAQE&sclient=img&ei=BZC2YO7QD4uBmAXLmrPQCA&bih=937&biw=1920"));
        startActivity(intent);
    }
    public void onButton_1_2_Clicked(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=%EA%B9%80%EC%B9%98%EC%B0%8C%EA%B0%9C&tbm=isch&ved=2ahUKEwirptT7mvfwAhUG95QKHaAnCx8Q2-cCegQIABAA&oq=%EA%B9%80%EC%B9%98%EC%B0%8C%EA%B0%9C&gs_lcp=CgNpbWcQAzIFCAAQsQMyAggAMgIIADICCAAyAggAMgIIADICCAAyAggAMgIIADICCAA6BAgAEANQ8fkCWNmDA2CNiANoAXAAeAGAAWeIAf8GkgEDNS40mAEAoAEBqgELZ3dzLXdpei1pbWfAAQE&sclient=img&ei=C5C2YOv0JIbu0wSgz6z4AQ&bih=937&biw=1920"));
        startActivity(intent);
    }
    public void onButton_1_3_Clicked(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=%EB%B3%B4%EC%8C%88&tbm=isch&ved=2ahUKEwjd8PiTm_fwAhUSCpQKHWhNCFoQ2-cCegQIABAA&oq=%EB%B3%B4%EC%8C%88&gs_lcp=CgNpbWcQAzIFCAAQsQMyAggAMgIIADICCAAyAggAMgIIADICCAAyAggAMgIIADICCAA6CAgAELEDEIMBUKtHWPNKYOxZaAFwAHgBgAFtiAGCBJIBAzIuM5gBAKABAaoBC2d3cy13aXotaW1nwAEB&sclient=img&ei=PpC2YN3ZIJKU0ATomqHQBQ&bih=937&biw=1920"));
        startActivity(intent);
    }
    public void onButton_1_4_Clicked(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=%EB%B6%80%EB%8C%80%EC%B0%8C%EA%B0%9C+&tbm=isch&ved=2ahUKEwiJmO2Zm_fwAhXkJaYKHe7uB2wQ2-cCegQIABAA&oq=%EB%B6%80%EB%8C%80%EC%B0%8C%EA%B0%9C+&gs_lcp=CgNpbWcQAzICCAAyAggAMgIIADICCAAyAggAMgIIADICCAAyAggAMgIIADICCABQtDZYtDZgoj5oAHAAeACAAWOIAWOSAQExmAEAoAEBqgELZ3dzLXdpei1pbWfAAQE&sclient=img&ei=SpC2YInLOOTLmAXu3Z_gBg&bih=937&biw=1920"));
        startActivity(intent);
    }
    public void onButton_1_5_Clicked(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=%EB%B9%84%EB%B9%94%EB%B0%A5&tbm=isch&ved=2ahUKEwjbjIuem_fwAhVQEqYKHfcCB5wQ2-cCegQIABAA&oq=%EB%B9%84%EB%B9%94%EB%B0%A5&gs_lcp=CgNpbWcQAzIICAAQsQMQgwEyBQgAELEDMgIIADICCAAyAggAMgIIADICCAAyAggAMgIIADICCABQ-0lY4k5go09oAXAAeAGAAWSIAaMFkgEDNi4xmAEAoAEBqgELZ3dzLXdpei1pbWfAAQE&sclient=img&ei=U5C2YJuXMdCkmAX3hZzgCQ&bih=937&biw=1920"));
        startActivity(intent);
    }
    public void onButton_1_6_Clicked(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=%EB%BC%88%ED%95%B4%EC%9E%A5%EA%B5%AD&tbm=isch&ved=2ahUKEwiGxK6jm_fwAhVG7JQKHdO8BdgQ2-cCegQIABAA&oq=%EB%BC%88%ED%95%B4%EC%9E%A5%EA%B5%AD&gs_lcp=CgNpbWcQAzICCAAyAggAMgIIADICCAAyAggAMgIIADICCAAyAggAMgIIADICCAA6BQgAELEDULRhWLNoYMduaAJwAHgCgAGAAYgBsQiSAQQwLjEwmAEAoAEBqgELZ3dzLXdpei1pbWfAAQE&sclient=img&ei=XpC2YIadNcbY0wTT-ZbADQ&bih=937&biw=1920"));
        startActivity(intent);
    }
    public void onButton_1_7_Clicked(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=%EC%88%9C%EB%8C%80%EA%B5%AD&tbm=isch&ved=2ahUKEwia7sKqm_fwAhXiIaYKHfLNCysQ2-cCegQIABAA&oq=%EC%88%9C%EB%8C%80%EA%B5%AD&gs_lcp=CgNpbWcQAzICCAAyAggAMgIIADICCAAyAggAMgIIADICCAAyAggAMgIIADICCAA6BQgAELEDOggIABCxAxCDAVCbaFiSbWC7b2gBcAB4AYABaIgBnAaSAQM1LjOYAQCgAQGqAQtnd3Mtd2l6LWltZ8ABAQ&sclient=img&ei=bZC2YNqDNuLDmAXym6_YAg&bih=937&biw=1920"));
        startActivity(intent);
    }
    public void onButton_1_8_Clicked(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=%EC%A0%9C%EC%9C%A1%EB%B3%B6%EC%9D%8C+&tbm=isch&ved=2ahUKEwigivGxm_fwAhWOEKYKHQZ9DO0Q2-cCegQIABAA&oq=%EC%A0%9C%EC%9C%A1%EB%B3%B6%EC%9D%8C+&gs_lcp=CgNpbWcQAzICCAAyAggAMgIIADICCAAyAggAMgIIADICCAAyAggAMgIIADICCABQq11Yq11gymNoAHAAeACAAWiIAWiSAQMwLjGYAQCgAQGqAQtnd3Mtd2l6LWltZ8ABAQ&sclient=img&ei=fZC2YODXE46hmAWG-rHoDg&bih=937&biw=1920"));
        startActivity(intent);
    }
    public void onButton_1_9_Clicked(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=%EC%A1%B1%EB%B0%9C+&tbm=isch&ved=2ahUKEwjn4bO4m_fwAhW4xosBHVSTA5sQ2-cCegQIABAA&oq=%EC%A1%B1%EB%B0%9C+&gs_lcp=CgNpbWcQAzICCAAyAggAMgIIADICCAAyAggAMgIIADICCAAyAggAMgIIADICCABQlFdYlFdgqmFoAHAAeACAAWaIAWaSAQMwLjGYAQCgAQGqAQtnd3Mtd2l6LWltZ8ABAQ&sclient=img&ei=ipC2YOf0PLiNr7wP1KaO2Ak&bih=937&biw=1920"));
        startActivity(intent);
    }
    public void onButton_1_10_Clicked(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=%EC%A3%BD&tbm=isch&ved=2ahUKEwidoeC-m_fwAhVXB6YKHRDtBR0Q2-cCegQIABAA&oq=%EC%A3%BD&gs_lcp=CgNpbWcQAzIFCAAQsQMyBQgAELEDMgUIABCxAzICCAAyAggAMgIIADICCAAyAggAMgUIABCxAzICCABQjl5Yjl5gvGZoAHAAeACAAWCIAWCSAQExmAEAoAEBqgELZ3dzLXdpei1pbWfAAQE&sclient=img&ei=mJC2YJ31EteOmAWQ2pfoAQ&bih=937&biw=1920"));
        startActivity(intent);
    }

    public void onButton_2_1_Clicked(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=%ED%83%95%EC%88%98%EC%9C%A1&tbm=isch&ved=2ahUKEwjgubHFm_fwAhXGxIsBHXlPCtkQ2-cCegQIABAA&oq=%ED%83%95%EC%88%98%EC%9C%A1&gs_lcp=CgNpbWcQAzIFCAAQsQMyAggAMgIIADICCAAyAggAMgIIADICCAAyAggAMgIIADICCAA6CAgAELEDEIMBUNS4E1jzvhNgq8ATaAFwAHgBgAF4iAHOBpIBAzMuNZgBAKABAaoBC2d3cy13aXotaW1nwAEB&sclient=img&ei=ppC2YODODcaJr7wP-Z6pyA0&bih=937&biw=1920"));
        startActivity(intent);
    }
    public void onButton_2_2_Clicked(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=%EB%B3%B6%EC%9D%8C%EB%B0%A5+&tbm=isch&ved=2ahUKEwip1ZbenPfwAhUF9pQKHWL6BgEQ2-cCegQIABAA&oq=%EB%B3%B6%EC%9D%8C%EB%B0%A5+&gs_lcp=CgNpbWcQAzICCAAyAggAMgIIADICCAAyAggAMgIIADICCAAyAggAMgIIADICCABQxEVYxEVgiktoAHAAeACAAWiIAWiSAQMwLjGYAQCgAQGqAQtnd3Mtd2l6LWltZ8ABAQ&sclient=img&ei=5pG2YKnKJ4Xs0wTi9JsI&bih=937&biw=1920"));
        startActivity(intent);
    }
    public void onButton_2_3_Clicked(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=%EA%B9%90%ED%92%8D%EA%B8%B0+&tbm=isch&ved=2ahUKEwjKn7nonPfwAhULDpQKHYNVAxAQ2-cCegQIABAA&oq=%EA%B9%90%ED%92%8D%EA%B8%B0+&gs_lcp=CgNpbWcQAzICCAAyAggAMgIIADICCAAyAggAMgIIADICCAAyAggAMgIIADICCABQ52JY52JgzWdoAHAAeACAAWOIAWOSAQExmAEAoAEBqgELZ3dzLXdpei1pbWfAAQE&sclient=img&ei=_JG2YMqxC4uc0ASDq42AAQ&bih=937&biw=1920"));
        startActivity(intent);
    }
    public void onButton_2_4_Clicked(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=%ED%8C%94%EB%B3%B4%EC%B1%84+&tbm=isch&ved=2ahUKEwiO0ZfvnPfwAhULDpQKHYNVAxAQ2-cCegQIABAA&oq=%ED%8C%94%EB%B3%B4%EC%B1%84+&gs_lcp=CgNpbWcQAzICCAAyAggAMgIIADICCAAyAggAMgIIADICCAAyAggAMgIIAFDCR1jCR2CBTGgAcAB4AIABaYgBaZIBAzAuMZgBAKABAaoBC2d3cy13aXotaW1nwAEB&sclient=img&ei=CpK2YI6kE4uc0ASDq42AAQ&bih=937&biw=1920"));
        startActivity(intent);
    }
    public void onButton_2_5_Clicked(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=%EC%96%91%EC%9E%A5%ED%94%BC+&tbm=isch&ved=2ahUKEwi496D0nPfwAhWW0IsBHY_VAQMQ2-cCegQIABAA&oq=%EC%96%91%EC%9E%A5%ED%94%BC+&gs_lcp=CgNpbWcQAzICCAAyAggAMgIIADICCAAyAggAMgIIADICCAAyAggAMgIIADICCABQ6ERY6ERg1ktoAHAAeACAAWSIAWSSAQMwLjGYAQCgAQGqAQtnd3Mtd2l6LWltZ8ABAQ&sclient=img&ei=FJK2YLidOpahr7wPj6uHGA&bih=937&biw=1920"));
        startActivity(intent);
    }
    public void onButton_2_6_Clicked(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=%EC%A7%AC%EB%BD%95+&tbm=isch&ved=2ahUKEwjfvKD5nPfwAhUIx4sBHRW2ApoQ2-cCegQIABAA&oq=%EC%A7%AC%EB%BD%95+&gs_lcp=CgNpbWcQDDICCAAyAggAMgIIADICCAAyAggAMgIIADICCAAyAggAMgIIADICCABQkVlYkVlgl19oAHAAeACAAWiIAWiSAQMwLjGYAQCgAQGqAQtnd3Mtd2l6LWltZ8ABAQ&sclient=img&ei=H5K2YJ-xGoiOr7wPleyK0Ak&bih=937&biw=1920"));
        startActivity(intent);
    }
    public void onButton_2_7_Clicked(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=%EB%A7%88%EB%9D%BC%ED%83%95+&tbm=isch&ved=2ahUKEwiu8rr_nPfwAhUCA6YKHWluBjUQ2-cCegQIABAA&oq=%EB%A7%88%EB%9D%BC%ED%83%95+&gs_lcp=CgNpbWcQDDICCAAyAggAMgIIADICCAAyAggAMgIIADICCAAyAggAMgIIADICCABQ3lRY3lRgz1poAHAAeACAAWiIAWiSAQMwLjGYAQCgAQGqAQtnd3Mtd2l6LWltZ8ABAQ&sclient=img&ei=LJK2YK6sG4KGmAXp3JmoAw&bih=937&biw=1920"));
        startActivity(intent);
    }
    public void onButton_2_8_Clicked(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=%EC%A7%9C%EC%9E%A5%EB%A9%B4+&tbm=isch&ved=2ahUKEwja2baFnffwAhVrzYsBHWusA3oQ2-cCegQIABAA&oq=%EC%A7%9C%EC%9E%A5%EB%A9%B4+&gs_lcp=CgNpbWcQAzICCAAyAggAMgIIADICCAAyAggAMgIIADICCAAyAggAMgIIADICCABQlSxYlSxg7TBoAHAAeACAAWqIAWqSAQMwLjGYAQCgAQGqAQtnd3Mtd2l6LWltZ8ABAQ&sclient=img&ei=OJK2YNrdOuuar7wP69iO0Ac&bih=937&biw=1920"));
        startActivity(intent);
    }
    public void onButton_2_9_Clicked(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=%EC%9E%A1%EC%B1%84+&tbm=isch&ved=2ahUKEwjIsOOInffwAhVNzIsBHSxJAuUQ2-cCegQIABAA&oq=%EC%9E%A1%EC%B1%84+&gs_lcp=CgNpbWcQAzICCAAyAggAMgIIADICCAAyAggAMgIIADICCAAyAggAMgIIADICCABQ00NY00Ngm0hoAHAAeACAAWeIAWeSAQMwLjGYAQCgAQGqAQtnd3Mtd2l6LWltZ8ABAQ&sclient=img&ei=P5K2YIiVPM2Yr7wPrJKJqA4&bih=937&biw=1920"));
        startActivity(intent);
    }
    public void onButton_2_10_Clicked(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=%EC%96%91%EA%BC%AC%EC%B9%98&tbm=isch&ved=2ahUKEwiDscaNnffwAhWOz4sBHR7LBlcQ2-cCegQIABAA&oq=%EC%96%91%EA%BC%AC%EC%B9%98&gs_lcp=CgNpbWcQAzICCAAyAggAMgIIADICCAAyAggAMgIIADICCAAyAggAMgIIADICCABQmidYmidg4CtoAHAAeACAAWiIAWiSAQMwLjGYAQCgAQGqAQtnd3Mtd2l6LWltZ8ABAQ&sclient=img&ei=SZK2YMPoPI6fr7wPnpabuAU&bih=937&biw=1920"));
        startActivity(intent);
    }

    public void onButton_3_1_Clicked(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=%EB%9D%BC%EC%9E%90%EB%83%90+&tbm=isch&ved=2ahUKEwi8_c-QnffwAhW4xosBHVSTA5sQ2-cCegQIABAA&oq=%EB%9D%BC%EC%9E%90%EB%83%90+&gs_lcp=CgNpbWcQAzICCAAyAggAMgIIADICCAAyAggAMgIIADICCAAyAggAMgIIADICCABQg6QMWIOkDGCqqQxoAHAAeACAAaoBiAGqAZIBAzAuMZgBAKABAaoBC2d3cy13aXotaW1nwAEB&sclient=img&ei=UJK2YLyVG7iNr7wP1KaO2Ak&bih=937&biw=1920"));
        startActivity(intent);
    }
    public void onButton_3_2_Clicked(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=%EB%B8%8C%EB%A6%AC%EB%98%90+&tbm=isch&ved=2ahUKEwj4tqXxnffwAhUOdXAKHYsVCXYQ2-cCegQIABAA&oq=%EB%B8%8C%EB%A6%AC%EB%98%90+&gs_lcp=CgNpbWcQDDICCAAyAggAMgIIADICCAAyAggAMgIIADICCAAyBggAEAUQHjIGCAAQBRAeMgYIABAFEB5QqzZYqzZgpDtoAHAAeACAAWiIAWiSAQMwLjGYAQCgAQGqAQtnd3Mtd2l6LWltZ8ABAQ&sclient=img&ei=G5O2YLi9Co7qwQOLq6SwBw&bih=937&biw=1920"));
        startActivity(intent);
    }
    public void onButton_3_3_Clicked(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=%EC%83%8C%EB%93%9C%EC%9C%84%EC%B9%98+&tbm=isch&ved=2ahUKEwiyhKn1nffwAhVCMN4KHepnA-4Q2-cCegQIABAA&oq=%EC%83%8C%EB%93%9C%EC%9C%84%EC%B9%98+&gs_lcp=CgNpbWcQDDICCAAyAggAMgIIADICCAAyAggAMgIIADICCAAyAggAMgIIADICCABQpFlYpFlg911oAHAAeACAAV2IAV2SAQExmAEAoAEBqgELZ3dzLXdpei1pbWfAAQE&sclient=img&ei=I5O2YPLmJcLg-Abqz43wDg&bih=937&biw=1920"));
        startActivity(intent);
    }
    public void onButton_3_4_Clicked(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=%EC%83%90%EB%9F%AC%EB%93%9C+&tbm=isch&ved=2ahUKEwjQvr_7nffwAhWLAogKHZ2kC7sQ2-cCegQIABAA&oq=%EC%83%90%EB%9F%AC%EB%93%9C+&gs_lcp=CgNpbWcQAzICCAAyAggAMgIIADICCAAyAggAMgIIADICCAAyAggAMgIIADICCABQtNkBWLTZAWCS3wFoAHAAeACAAWaIAWaSAQMwLjGYAQCgAQGqAQtnd3Mtd2l6LWltZ8ABAQ&sclient=img&ei=MJO2YNDmIouFoASdya7YCw&bih=937&biw=1920"));
        startActivity(intent);
    }
    public void onButton_3_5_Clicked(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=%EC%8A%A4%ED%85%8C%EC%9D%B4%ED%81%AC+&tbm=isch&ved=2ahUKEwi_1MiJnvfwAhVb8WEKHYtyA4cQ2-cCegQIABAA&oq=%EC%8A%A4%ED%85%8C%EC%9D%B4%ED%81%AC+&gs_lcp=CgNpbWcQDDICCAAyAggAMgIIADICCAAyAggAMgIIADICCAAyAggAMgIIADICCABQzj9Yzj9g4UNoAHAAeACAAY0CiAGNApIBAzItMZgBAKABAaoBC2d3cy13aXotaW1nwAEB&sclient=img&ei=TpO2YL_1BNvihwOL5Y24CA&bih=937&biw=1920"));
        startActivity(intent);
    }
    public void onButton_3_6_Clicked(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=%EC%8A%A4%ED%8C%8C%EA%B2%8C%ED%8B%B0+&tbm=isch&ved=2ahUKEwjr0JiOnvfwAhWDCd4KHcyaC0UQ2-cCegQIABAA&oq=%EC%8A%A4%ED%8C%8C%EA%B2%8C%ED%8B%B0+&gs_lcp=CgNpbWcQAzICCAAyAggAMgIIADICCAAyAggAMgIIADICCAAyAggAMgIIADICCABQjSxYjSxg2zZoAHAAeACAAWiIAWiSAQMwLjGYAQCgAQGqAQtnd3Mtd2l6LWltZ8ABAQ&sclient=img&ei=V5O2YKvJL4OT-AbMta6oBA&bih=937&biw=1920"));
        startActivity(intent);
    }
    public void onButton_3_7_Clicked(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=%EC%98%A4%EB%AF%88%EB%A0%9B+&tbm=isch&ved=2ahUKEwiBu4CSnvfwAhUbad4KHaK1AoIQ2-cCegQIABAA&oq=%EC%98%A4%EB%AF%88%EB%A0%9B+&gs_lcp=CgNpbWcQAzICCAAyAggAMgIIADICCAAyAggAMgIIADICCAAyAggAMgIIADICCABQ00VY00VgsUtoAHAAeACAAWOIAWOSAQExmAEAoAEBqgELZ3dzLXdpei1pbWfAAQE&sclient=img&ei=X5O2YMGPL5vS-Qai64qQCA&bih=937&biw=1920"));
        startActivity(intent);
    }
    public void onButton_3_8_Clicked(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=%ED%81%AC%EB%A6%BC%ED%8C%8C%EC%8A%A4%ED%83%80+&tbm=isch&ved=2ahUKEwjT0IKXnvfwAhVCMN4KHepnA-4Q2-cCegQIABAA&oq=%ED%81%AC%EB%A6%BC%ED%8C%8C%EC%8A%A4%ED%83%80+&gs_lcp=CgNpbWcQDDICCAAyAggAMgIIADICCAAyAggAMgIIADICCAAyAggAMgIIADIGCAAQBRAeUP3KCFj9yghg-80IaABwAHgAgAG0AYgBtAGSAQMwLjGYAQCgAQGqAQtnd3Mtd2l6LWltZ8ABAQ&sclient=img&ei=apO2YNPzEcLg-Abqz43wDg&bih=937&biw=1920"));
        startActivity(intent);
    }
    public void onButton_3_9_Clicked(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=%ED%94%BC%EC%9E%90+&tbm=isch&ved=2ahUKEwjhotzanvfwAhUVIIgKHfy4Dr8Q2-cCegQIABAA&oq=%ED%94%BC%EC%9E%90+&gs_lcp=CgNpbWcQDDIICAAQsQMQgwEyCAgAELEDEIMBMgIIADICCAAyAggAMgIIADICCAAyAggAMgIIADICCABQ7kdY7kdgukxoAHAAeACAAV2IAV2SAQExmAEAoAEBqgELZ3dzLXdpei1pbWfAAQE&sclient=img&ei=-JO2YOHGEJXAoAT88br4Cw&bih=937&biw=1920"));
        startActivity(intent);
    }
    public void onButton_3_10_Clicked(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=%ED%96%84%EB%B2%84%EA%B1%B0&tbm=isch&ved=2ahUKEwjosfLfnvfwAhVFEogKHcFnBMwQ2-cCegQIABAA&oq=%ED%96%84%EB%B2%84%EA%B1%B0&gs_lcp=CgNpbWcQDDIFCAAQsQMyCAgAELEDEIMBMgIIADICCAAyAggAMgIIADICCAAyAggAMgIIADICCABQwG9YwG9gg3VoAHAAeACAAWKIAWKSAQExmAEAoAEBqgELZ3dzLXdpei1pbWfAAQE&sclient=img&ei=A5S2YKikB8WkoATBz5HgDA&bih=937&biw=1920"));
        startActivity(intent);
    }

    public void onButton_4_1_Clicked(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=%EB%8F%88%EA%B9%8C%EC%8A%A4+&tbm=isch&ved=2ahUKEwiErrvnnvfwAhUYQfUHHXE0B3MQ2-cCegQIABAA&oq=%EB%8F%88%EA%B9%8C%EC%8A%A4+&gs_lcp=CgNpbWcQDDICCAAyAggAMgIIADICCAAyAggAMgIIADICCAAyAggAMgIIADICCABQsXlYsXlgv35oAHAAeACAAWeIAWeSAQMwLjGYAQCgAQGqAQtnd3Mtd2l6LWltZ8ABAQ&sclient=img&ei=EpS2YITdPJiC1e8P8eicmAc&bih=937&biw=1920"));
        startActivity(intent);
    }
    public void onButton_4_2_Clicked(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=%EC%95%8C%EB%B0%A5+&tbm=isch&ved=2ahUKEwiBqMzvnvfwAhVMfHAKHWJuDlEQ2-cCegQIABAA&oq=%EC%95%8C%EB%B0%A5+&gs_lcp=CgNpbWcQDDICCAAyAggAMgIIADICCAAyBAgAEB4yBggAEAUQHjIGCAAQBRAeMgYIABAFEB4yBggAEAUQHjIGCAAQBRAeUP8xWP8xYIE3aABwAHgAgAFqiAFqkgEDMC4xmAEAoAEBqgELZ3dzLXdpei1pbWfAAQE&sclient=img&ei=JJS2YIGGA8z4wQPi3LmIBQ&bih=937&biw=1920"));
        startActivity(intent);
    }
    public void onButton_4_3_Clicked(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=%EC%BA%98%EB%A6%AC%ED%8F%AC%EB%8B%88%EC%95%84%EB%A1%A4+&tbm=isch&ved=2ahUKEwjRpLTznvfwAhXFxGEKHaEgDlUQ2-cCegQIABAA&oq=%EC%BA%98%EB%A6%AC%ED%8F%AC%EB%8B%88%EC%95%84%EB%A1%A4+&gs_lcp=CgNpbWcQDDICCAAyAggAMgIIADICCAAyBAgAEBgyBAgAEBgyBAgAEBgyBAgAEBgyBAgAEBgyBggAEAUQHlDsN1jsN2CQPGgAcAB4AIABd4gBd5IBAzAuMZgBAKABAaoBC2d3cy13aXotaW1nwAEB&sclient=img&ei=LJS2YNHeAsWJhwOhwbioBQ&bih=937&biw=1920"));
        startActivity(intent);
    }
    public void onButton_4_4_Clicked(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=%EC%97%B0%EC%96%B4%EB%A1%A4+&tbm=isch&ved=2ahUKEwiGjcL3nvfwAhUK62EKHcZgDP4Q2-cCegQIABAA&oq=%EC%97%B0%EC%96%B4%EB%A1%A4+&gs_lcp=CgNpbWcQDDIGCAAQBRAeMgYIABAFEB4yBggAEAUQHjIECAAQGDIECAAQGDIECAAQGDIECAAQGDIECAAQGDIECAAQGFDeixlY3osZYJ2QGWgAcAB4AIABvAGIAbwBkgEDMC4xmAEAoAEBqgELZ3dzLXdpei1pbWfAAQE&sclient=img&ei=NJS2YIajKIrWhwPGwbHwDw&bih=937&biw=1920"));
        startActivity(intent);
    }
    public void onButton_4_5_Clicked(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=%EC%B4%88%EB%B0%A5+&tbm=isch&ved=2ahUKEwiy2rK7oPfwAhXlzYsBHaWpB20Q2-cCegQIABAA&oq=%EC%B4%88%EB%B0%A5+&gs_lcp=CgNpbWcQAzICCAAyAggAMgIIADICCAAyAggAMgIIADICCAAyAggAMgIIADICCABQqzhYqzhg8T1oAHAAeACAAWqIAWqSAQMwLjGYAQCgAQGqAQtnd3Mtd2l6LWltZ8ABAQ&sclient=img&ei=z5W2YPK2G-Wbr7wPpdOe6AY&bih=937&biw=1920"));
        startActivity(intent);
    }
    public void onButton_4_6_Clicked(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=%ED%9A%8C+&tbm=isch&ved=2ahUKEwi519K_oPfwAhXkJqYKHRa9D08Q2-cCegQIABAA&oq=%ED%9A%8C+&gs_lcp=CgNpbWcQDDICCAAyAggAMgIIADICCAAyAggAMgIIADICCAAyAggAMgIIADICCABQ54QBWOeEAWC3iQFoAHAAeACAAWiIAWiSAQMwLjGYAQCgAQGqAQtnd3Mtd2l6LWltZ8ABAQ&sclient=img&ei=2JW2YLmLFuTNmAWW-r74BA&bih=937&biw=1920"));
        startActivity(intent);
    }
    public void onButton_4_7_Clicked(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=%ED%9A%8C%EB%8D%AE%EB%B0%A5+&tbm=isch&ved=2ahUKEwj1zLfIoPfwAhXjJqYKHd6xCp0Q2-cCegQIABAA&oq=%ED%9A%8C%EB%8D%AE%EB%B0%A5+&gs_lcp=CgNpbWcQDDICCAAyAggAMgIIADICCAAyAggAMgIIADICCAAyAggAMgIIADIGCAAQBRAeUKg6WKg6YM0-aABwAHgAgAFoiAFokgEDMC4xmAEAoAEBqgELZ3dzLXdpei1pbWfAAQE&sclient=img&ei=6pW2YPWvMOPNmAXe46roCQ&bih=937&biw=1920"));
        startActivity(intent);
    }
    public void onButton_4_8_Clicked(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=%EB%83%89%EB%AA%A8%EB%B0%80+&tbm=isch&ved=2ahUKEwiIpdLMoPfwAhXkJaYKHe7uB2wQ2-cCegQIABAA&oq=%EB%83%89%EB%AA%A8%EB%B0%80+&gs_lcp=CgNpbWcQAzIGCAAQBRAeMgQIABAYMgQIABAYMgQIABAYMgQIABAYMgQIABAYMgQIABAYMgQIABAYMgQIABAYMgQIABAYUJkoWJkoYMgvaABwAHgAgAFtiAFtkgEDMC4xmAEAoAEBqgELZ3dzLXdpei1pbWfAAQE&sclient=img&ei=85W2YMjfJeTLmAXu3Z_gBg&bih=937&biw=1920"));
        startActivity(intent);
    }
    public void onButton_4_9_Clicked(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=%EC%9A%B0%EB%8F%99+&tbm=isch&ved=2ahUKEwi_zoPQoPfwAhVAwIsBHbj-AMcQ2-cCegQIABAA&oq=%EC%9A%B0%EB%8F%99+&gs_lcp=CgNpbWcQDDICCAAyAggAMgIIADICCAAyAggAMgIIADICCAAyAggAMgIIADICCABQw1FYw1FgnVVoAHAAeACAAWOIAWOSAQExmAEAoAEBqgELZ3dzLXdpei1pbWfAAQE&sclient=img&ei=-pW2YL_pK8CAr7wPuP2DuAw&bih=937&biw=1920"));
        startActivity(intent);
    }
    public void onButton_4_10_Clicked(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=%EB%A7%A4%EC%9A%B4%ED%83%95&tbm=isch&ved=2ahUKEwiP0NTVoPfwAhUER5QKHV4EAUoQ2-cCegQIABAA&oq=%EB%A7%A4%EC%9A%B4%ED%83%95&gs_lcp=CgNpbWcQDDICCAAyAggAMgIIADICCAAyAggAMgIIADICCAAyAggAMgIIADICCABQ8j5Y8j5gyEJoAHAAeACAAWSIAWSSAQMwLjGYAQCgAQGqAQtnd3Mtd2l6LWltZ8ABAQ&sclient=img&ei=Bpa2YI-1IISO0QTeiITQBA&bih=937&biw=1920"));
        startActivity(intent);
    }

    public void onButton_5_1_Clicked(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=%EB%96%A1%EB%B3%B6%EC%9D%B4+&tbm=isch&ved=2ahUKEwil-pTaoPfwAhVGdpQKHf9sDHQQ2-cCegQIABAA&oq=%EB%96%A1%EB%B3%B6%EC%9D%B4+&gs_lcp=CgNpbWcQAzIICAAQsQMQgwEyAggAMgIIADICCAAyAggAMgIIADICCAAyAggAMgIIADICCABQwJsBWMCbAWD3oAFoAHAAeACAAWeIAWeSAQMwLjGYAQCgAQGqAQtnd3Mtd2l6LWltZ8ABAQ&sclient=img&ei=D5a2YOW2O8bs0QT_2bGgBw&bih=937&biw=1920"));
        startActivity(intent);
    }
    public void onButton_5_2_Clicked(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=%EB%9D%BC%EB%A9%B4+&tbm=isch&ved=2ahUKEwj037PkoPfwAhVE7ZQKHbhXBj0Q2-cCegQIABAA&oq=%EB%9D%BC%EB%A9%B4+&gs_lcp=CgNpbWcQDDIICAAQsQMQgwEyAggAMgIIADICCAAyAggAMgIIADICCAAyAggAMgIIADICCABQx2FYx2Fgx2ZoAHAAeACAAWqIAWqSAQMwLjGYAQCgAQGqAQtnd3Mtd2l6LWltZ8ABAQ&sclient=img&ei=JZa2YLS5G8Ta0wS4r5noAw&bih=937&biw=1920"));
        startActivity(intent);
    }
    public void onButton_5_3_Clicked(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=%EC%83%A4%EB%B8%8C%EC%83%A4%EB%B8%8C+&tbm=isch&ved=2ahUKEwj0nYProPfwAhWqJaYKHZtEBQcQ2-cCegQIABAA&oq=%EC%83%A4%EB%B8%8C%EC%83%A4%EB%B8%8C+&gs_lcp=CgNpbWcQDDICCAAyAggAMgIIADICCAAyAggAMgIIADICCAAyAggAMgIIADICCABQqEZYqEZghktoAHAAeACAAWaIAWaSAQMwLjGYAQCgAQGqAQtnd3Mtd2l6LWltZ8ABAQ&sclient=img&ei=M5a2YLS4FKrLmAWbiZU4&bih=937&biw=1920"));
        startActivity(intent);
    }
    public void onButton_5_4_Clicked(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=%EC%8C%80%EA%B5%AD%EC%88%98+&tbm=isch&ved=2ahUKEwiOzv7voPfwAhUFHqYKHW_wAysQ2-cCegQIABAA&oq=%EC%8C%80%EA%B5%AD%EC%88%98+&gs_lcp=CgNpbWcQAzICCAAyAggAMgIIADICCAAyAggAMgIIADICCAAyAggAMgIIADICCABQ0UBY0UBg8EZoAHAAeACAAWuIAWuSAQMwLjGYAQCgAQGqAQtnd3Mtd2l6LWltZ8ABAQ&sclient=img&ei=PZa2YM67LYW8mAXv4I_YAg&bih=937&biw=1920"));
        startActivity(intent);
    }
    public void onButton_5_5_Clicked(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=%EC%9A%B0%EC%9C%A1%EB%A9%B4+&tbm=isch&ved=2ahUKEwj59eD0oPfwAhXIEKYKHbSXDXYQ2-cCegQIABAA&oq=%EC%9A%B0%EC%9C%A1%EB%A9%B4+&gs_lcp=CgNpbWcQDDICCAAyAggAMgIIADIGCAAQBRAeMgYIABAFEB4yBggAEAUQHjIGCAAQBRAeMgYIABAFEB4yBggAEAUQHjIGCAAQBRAeUIxIWIxIYNlNaABwAHgAgAFtiAFtkgEDMC4xmAEAoAEBqgELZ3dzLXdpei1pbWfAAQE&sclient=img&ei=R5a2YLm2LcihmAW0r7awBw&bih=937&biw=1920"));
        startActivity(intent);
    }
    public void onButton_5_6_Clicked(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=%EC%B9%98%ED%82%A8+&tbm=isch&ved=2ahUKEwj4wIb6oPfwAhVo0IsBHfxDAWwQ2-cCegQIABAA&oq=%EC%B9%98%ED%82%A8+&gs_lcp=CgNpbWcQAzIFCAAQsQMyAggAMgIIADICCAAyCAgAELEDEIMBMgIIADICCAAyAggAMgIIADICCABQtD1YtD1g00JoAHAAeACAAWaIAWaSAQMwLjGYAQCgAQGqAQtnd3Mtd2l6LWltZ8ABAQ&sclient=img&ei=Upa2YPjPM-igr7wP_IeF4AY&bih=937&biw=1920"));
        startActivity(intent);
    }
    public void onButton_5_7_Clicked(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=%EC%BB%A4%EB%A6%AC+%EC%9D%8C%EC%8B%9D&tbm=isch&ved=2ahUKEwjPw4WLoffwAhXNAqYKHVucD7IQ2-cCegQIABAA&oq=%EC%BB%A4%EB%A6%AC+%EC%9D%8C%EC%8B%9D&gs_lcp=CgNpbWcQAzICCAA6BAgAEBhQyyVY-itgoixoAHAAeACAAW6IAdIFkgEDMi41mAEAoAEBqgELZ3dzLXdpei1pbWfAAQE&sclient=img&ei=dpa2YM-wHc2FmAXbuL6QCw&bih=937&biw=1920"));
        startActivity(intent);
    }
    public void onButton_5_8_Clicked(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=%ED%8C%8C%EB%8B%88%EB%8B%88+&tbm=isch&ved=2ahUKEwj7lp2OoffwAhUIx4sBHRW2ApoQ2-cCegQIABAA&oq=%ED%8C%8C%EB%8B%88%EB%8B%88+&gs_lcp=CgNpbWcQDDICCAAyAggAMgIIADICCAAyAggAMgIIADIGCAAQBRAeMgYIABAFEB4yBggAEAUQHjIGCAAQBRAeUJPSAViT0gFg-tcBaABwAHgAgAFriAFrkgEDMC4xmAEAoAEBqgELZ3dzLXdpei1pbWfAAQE&sclient=img&ei=fZa2YLvkCYiOr7wPleyK0Ak&bih=937&biw=1920"));
        startActivity(intent);
    }
    public void onButton_5_9_Clicked(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=%ED%8C%8C%ED%9E%88%ED%83%80+&tbm=isch&ved=2ahUKEwjnlOmboffwAhXNAqYKHVucD7IQ2-cCegQIABAA&oq=%ED%8C%8C%ED%9E%88%ED%83%80+&gs_lcp=CgNpbWcQDDICCAAyBAgAEBgyBAgAEBgyBAgAEBgyBAgAEBgyBggAEAUQHjIGCAAQBRAeMgYIABAFEB4yBggAEAUQHjIGCAAQBRAeUN5mWN5mYLpraABwAHgAgAFsiAFskgEDMC4xmAEAoAEBqgELZ3dzLXdpei1pbWfAAQE&sclient=img&ei=mZa2YKfkKM2FmAXbuL6QCw&bih=937&biw=1920"));
        startActivity(intent);
    }
    public void onButton_5_10_Clicked(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=%ED%8C%9F%ED%83%80%EC%9D%B4&tbm=isch&ved=2ahUKEwj-wu-ioffwAhXNzosBHQ_VABMQ2-cCegQIABAA&oq=%ED%8C%9F%ED%83%80%EC%9D%B4&gs_lcp=CgNpbWcQDDICCAAyAggAMgIIADICCAAyAggAMgIIADICCAAyAggAMgIIAFD-N1j-N2DrPGgAcAB4AIABaIgBaJIBAzAuMZgBAKABAaoBC2d3cy13aXotaW1nwAEB&sclient=img&ei=qJa2YP7OG82dr7wPj6qDmAE&bih=937&biw=1920"));
        startActivity(intent);
    }
}
