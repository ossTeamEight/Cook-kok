package org.techtown.cook_kok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class showActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
    }
    /*public void onButton2Clicked(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=%EC%B9%98%ED%82%A8&tbm=isch&ved=2ahUKEwiHsaO3yLvwAhVGEKYKHYZjCX0Q2-cCegQIABAA&oq=%EC%B9%98%ED%82%A8&gs_lcp=CgNpbWcQAzIFCAAQsQMyAggAMgIIADICCAAyAggAMgIIADICCAAyAggAMgIIADICCAA6CAgAELEDEIMBUJ7oB1it6wdg_u0HaAFwAHgBgAFmiAHrA5IBAzMuMpgBAKABAaoBC2d3cy13aXotaW1nwAEB&sclient=img&ei=p0qXYMfBOMagmAWGx6XoBw&bih=927&biw=1068&hl=ko"));
        startActivity(intent);
    }
    public void onButton3Clicked(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.search.naver.com/search.naver?sm=mtb_hty.top&where=m&oquery=%EB%84%A4%EC%9D%B4%EB%B2%84+%EB%8F%8C%EB%A6%BC%ED%8C%90%EA%B2%8C%EC%9E%84&tqi=h5OqbdprvyKsss7T2URssssssNC-388738&query=%EB%84%A4%EC%9D%B4%EB%B2%84+%EB%8F%8C%EB%A6%BC%ED%8C%90"));
        startActivity(intent);
    }*/
}
