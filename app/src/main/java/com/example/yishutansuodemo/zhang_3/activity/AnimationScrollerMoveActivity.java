package com.example.yishutansuodemo.zhang_3.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

import com.example.yishutansuodemo.R;

public class AnimationScrollerMoveActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation_scroller_move);



        final LinearLayout llContainer = findViewById(R.id.ll_container);
        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int dx = -200;
                final int dy = -200;
                ValueAnimator valueAnimator = ValueAnimator.ofFloat(0, 1).setDuration(3000);
                valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    private static final String TAG = "test";

                    @Override
                    public void onAnimationUpdate(ValueAnimator animation) {
                        // 获得动画的百分比
                        float animatedFraction = animation.getAnimatedFraction();
                        Log.e(TAG,"animatedFraction:" + animatedFraction);
                        // 必须要注意，scrollTo传入正值，向相反的方向运行
                        llContainer.scrollTo((int) (dx * animatedFraction), (int) (dy * animatedFraction));
                    }
                });
                valueAnimator.start();
            }
        });
    }
}