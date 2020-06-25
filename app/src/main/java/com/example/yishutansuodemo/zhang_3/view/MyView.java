package com.example.yishutansuodemo.zhang_3.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MyView extends View {

    private VelocityTracker velocityTracker;
    private OnResultListener mListener;

    public MyView(Context context) {
        super(context);
    }

    public MyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        velocityTracker = VelocityTracker.obtain();
        velocityTracker.addMovement(event);

        //测量速度的一个单位，是以1秒作为单位
        velocityTracker.computeCurrentVelocity(1000);
        int xVelocity = (int) velocityTracker.getXVelocity();
        int yVelocity = (int) velocityTracker.getYVelocity();

        if (mListener != null){
            mListener.onSuccess("速度：" + xVelocity + "-" + yVelocity);
        }

        //必须要返回true,才能将事件拦截下来,将事件传递给这个控件
        return true;
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        velocityTracker.clear();
        velocityTracker.recycle();

        Toast.makeText(getContext(), "VelocityTracker销毁了！", Toast.LENGTH_SHORT).show();
    }

    public void setOnResultListener(OnResultListener listener){
        mListener = listener;
    }

    public interface OnResultListener{
        void onSuccess(String str);
    }
}
