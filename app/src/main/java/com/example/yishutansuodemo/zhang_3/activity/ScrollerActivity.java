package com.example.yishutansuodemo.zhang_3.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.yishutansuodemo.R;
import com.example.yishutansuodemo.zhang_3.view.MyLinearLayout;

public class ScrollerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroller);

        final MyLinearLayout llContainer = findViewById(R.id.ll_container);

        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                llContainer.startScroller(100,100);
            }
        });


    }
}