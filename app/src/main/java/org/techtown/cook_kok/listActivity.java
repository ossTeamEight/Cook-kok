package org.techtown.cook_kok;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;
import android.os.Bundle;

public class listActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
    }

    public void onClick01(View v) {
        /*Intent intent01 = new Intent(Intent.ACTION_VIEW, );
        startActivity(intent01);*/
        Toast.makeText(getApplicationContext(),"한식list",Toast.LENGTH_LONG).show();
    }
    public void onClick02(View v) {
        /*Intent intent02 = new Intent(Intent.ACTION_VIEW,);
        startActivity(intent02);*/
        Toast.makeText(getApplicationContext(),"중식list",Toast.LENGTH_LONG).show();
    }
    public void onClick03(View v) {
        /*Intent intent03 = new Intent(Intent.ACTION_VIEW,);
        startActivity(intent03);*/
        Toast.makeText(getApplicationContext(),"일식list",Toast.LENGTH_LONG).show();
    }
    public void onClick04(View v) {
        /*Intent intent04 = new Intent(Intent.ACTION_VIEW,);
        startActivity(intent04);*/
        Toast.makeText(getApplicationContext(),"양식list",Toast.LENGTH_LONG).show();
    }
    public void onClick05(View v) {
        /*Intent intent05 = new Intent(Intent.ACTION_VIEW,);
        startActivity(intent05);*/
        Toast.makeText(getApplicationContext(),"기타list",Toast.LENGTH_LONG).show();
    }
}