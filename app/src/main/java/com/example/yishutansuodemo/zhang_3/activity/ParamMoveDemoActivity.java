package com.example.yishutansuodemo.zhang_3.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.yishutansuodemo.R;

public class ParamMoveDemoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_param_move_demo);

        final TextView tv = findViewById(R.id.tv);
        //❤注意：这个地方的强转很关键,当是没有想到
        final ViewGroup.MarginLayoutParams layoutParams = (ViewGroup.MarginLayoutParams) tv.getLayoutParams();

        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layoutParams.leftMargin += 20;
                //必须要设置参数，否则不生效
                //tv.requestLayout();
                tv.setLayoutParams(layoutParams);
            }
        });
    }
}