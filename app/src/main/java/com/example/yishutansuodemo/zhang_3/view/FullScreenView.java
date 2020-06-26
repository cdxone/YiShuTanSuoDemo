package com.example.yishutansuodemo.zhang_3.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;

public class FullScreenView extends AppCompatTextView {
    private static final String TAG = "FullScreenView";
    private float beforeX;
    private float beforeY;
    private float beforeDeltaX;
    private float beforeDeltaY;
    private float deltaX;
    private float deltaY;

    public FullScreenView(Context context) {
        super(context);
    }

    public FullScreenView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public FullScreenView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch(event.getAction()){
            case MotionEvent.ACTION_DOWN:
                beforeX = event.getRawX();
                beforeY = event.getRawY();
                break;
            case MotionEvent.ACTION_MOVE:
                deltaX = event.getRawX() - beforeX;
                deltaY = event.getRawY() - beforeY;
                Log.e(TAG, deltaX +"-" + deltaY);
                this.setTranslationX(beforeDeltaX + deltaX);
                this.setTranslationY(beforeDeltaY + deltaY);
                break;
            default:
            case MotionEvent.ACTION_UP:
                //手指抬起的时候记录偏移量
                beforeDeltaX = deltaX;
                beforeDeltaY = deltaY;
                break;
        }
        return true;
    }
}
