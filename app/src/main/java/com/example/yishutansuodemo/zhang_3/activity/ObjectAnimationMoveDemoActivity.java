package com.example.yishutansuodemo.zhang_3.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.yishutansuodemo.R;

public class ObjectAnimationMoveDemoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_object_animation_move_demo);

        final TextView tv = findViewById(R.id.tv);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ObjectAnimationMoveDemoActivity.this, "点击了", Toast.LENGTH_SHORT).show();
            }
        });
        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //其中属性的设置，可以通过tv.setTranslationX来看看
                ObjectAnimator translationX = ObjectAnimator.ofFloat(tv, "translationX", 0, 200);
                translationX.setDuration(3000);
                translationX.start();
            }
        });
    }
}