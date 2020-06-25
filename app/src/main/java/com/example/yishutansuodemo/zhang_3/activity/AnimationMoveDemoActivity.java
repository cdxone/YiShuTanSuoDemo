package com.example.yishutansuodemo.zhang_3.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Toast;

import com.example.yishutansuodemo.R;

public class AnimationMoveDemoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation_move_demo);

        final TextView tv = findViewById(R.id.tv);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AnimationMoveDemoActivity.this, "点了我", Toast.LENGTH_SHORT).show();
            }
        });
        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //使用补件动画，当点击原来的位置，可以触发点击事件
                Animation animation = AnimationUtils.loadAnimation(AnimationMoveDemoActivity.this, R.anim.anim_test);
                tv.startAnimation(animation);
            }
        });
    }
}