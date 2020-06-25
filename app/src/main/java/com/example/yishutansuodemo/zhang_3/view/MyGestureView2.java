package com.example.yishutansuodemo.zhang_3.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MyGestureView2 extends View {

    private GestureDetector gestureDetector;

    public MyGestureView2(Context context) {
        super(context);
    }

    public MyGestureView2(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        gestureDetector = new GestureDetector(context, new MyOnDoubleTapListener());
    }

    public MyGestureView2(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    // 注意：❤
    // 如果只是实现双击接口，发现用不了,所以必须要先实现OnGestureListener接口，然后在实现双击接口
    private class MyOnDoubleTapListener implements GestureDetector.OnGestureListener,GestureDetector.OnDoubleTapListener{

        @Override
        public boolean onSingleTapConfirmed(MotionEvent e) {
            return false;
        }

        @Override
        public boolean onDoubleTap(MotionEvent e) {
            Toast.makeText(getContext(), "双击", Toast.LENGTH_SHORT).show();
            return false;
        }

        @Override
        public boolean onDoubleTapEvent(MotionEvent e) {
            return false;
        }

        @Override
        public boolean onDown(MotionEvent e) {
            return false;
        }

        @Override
        public void onShowPress(MotionEvent e) {

        }

        @Override
        public boolean onSingleTapUp(MotionEvent e) {
            Toast.makeText(getContext(), "单击！", Toast.LENGTH_SHORT).show();
            return false;
        }

        @Override
        public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
            return false;
        }

        @Override
        public void onLongPress(MotionEvent e) {

        }

        @Override
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
            return false;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        //在onTouchEvent中拦截事件，并且将事件传递给了gestureDetector
        boolean result = gestureDetector.onTouchEvent(event);

        //注意：这个地方需要注意 ❤
        //表示我需要这个事件，以后都将事件给我
        return true;
    }
}
