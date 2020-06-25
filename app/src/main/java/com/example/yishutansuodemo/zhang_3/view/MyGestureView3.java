package com.example.yishutansuodemo.zhang_3.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MyGestureView3 extends View {

    private GestureDetector gestureDetector;

    public MyGestureView3(Context context) {
        super(context);
    }

    public MyGestureView3(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        gestureDetector = new GestureDetector(context, new MySimple());
    }

    public MyGestureView3(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    private class MySimple extends GestureDetector.SimpleOnGestureListener{
        @Override
        public boolean onSingleTapUp(MotionEvent e) {
            Toast.makeText(getContext(), "单击", Toast.LENGTH_SHORT).show();
            return super.onSingleTapUp(e);
        }

        @Override
        public boolean onDoubleTap(MotionEvent e) {
            Toast.makeText(getContext(), "双击", Toast.LENGTH_SHORT).show();
            return super.onDoubleTap(e);
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
