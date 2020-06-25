package com.example.yishutansuodemo.zhang_3.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.yishutansuodemo.R;
import com.example.yishutansuodemo.zhang_3.view.MyView;

public class VelocityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_velocity);

        final TextView tv = findViewById(R.id.tv);
        MyView myView = findViewById(R.id.my_view);

        myView.setOnResultListener(new MyView.OnResultListener(){
            public void onSuccess(String str){
                tv.setText(str);
            }
        });

    }
}