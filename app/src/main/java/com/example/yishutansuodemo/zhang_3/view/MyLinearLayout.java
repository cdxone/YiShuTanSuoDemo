package com.example.yishutansuodemo.zhang_3.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Scroller;

import androidx.annotation.Nullable;

public class MyLinearLayout extends LinearLayout {

    private static final String TAG = "test";
    private Scroller scroller;

    public MyLinearLayout(Context context) {
        super(context);
    }

    public MyLinearLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        scroller = new Scroller(getContext());
    }

    public MyLinearLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void startScroller(int destX,int destY){
        int scrollX = getScrollX();
        Log.e(TAG,"scrollX:" + scrollX);
        int delta = destX - scrollX;
        Log.e(TAG,"delta:" + delta);
        scroller.startScroll(scrollX,0,destX,0,5000);
        invalidate();
    }

    @Override
    public void computeScroll() {
        //反复执行这个方法,返回getCurrX和getCurrY参数，然后刷新
        Log.e(TAG,"scroller.computeScrollOffset():" + scroller.computeScrollOffset());
        //是否开始弹性滑动
        if (scroller.computeScrollOffset()){
            Log.e(TAG,"位置：" + scroller.getCurrX() + "," + scroller.getCurrY());
            scrollTo(scroller.getCurrX(),scroller.getCurrY());
            postInvalidate();
            View childAt = getChildAt(0);
            Log.e(TAG,"left:" + childAt.getLeft());//居然不变
            Log.e(TAG,"宽度：" + this.getWidth());//宽度不变
            Log.e(TAG,"容器的位置：" + this.getLeft());//居然一直是0
            Log.e(TAG,"容器的偏移量：" + this.getScrollX());
        }
    }
}
