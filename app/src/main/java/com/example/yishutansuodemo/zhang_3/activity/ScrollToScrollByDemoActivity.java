package com.example.yishutansuodemo.zhang_3.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.yishutansuodemo.R;

public class ScrollToScrollByDemoActivity extends AppCompatActivity {

    private static final String TAG = "Test";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_to_scroll_by_demo);

        final View temp = findViewById(R.id.temp);
        final LinearLayout llContainer = findViewById(R.id.ll);
        //getScrollX:获取水平的偏移量
        //getScrollY:获得竖直的偏移量

        //View提供的获取的坐标以及距离的方法
        //getTop()           获取到的是view自身的顶边到其父布局顶边的距离
        //getLeft()           获取到的是view自身的左边到其父布局左边的距离
        //getRight()        获取到的是view自身的右边到其父布局左边的距离
        //getBottom()     获取到的是view自身底边到其父布局顶边的距离

        //MotionEvent提供的方法
        //getX()       获取点击事件距离控件左边的距离，即视图坐标
        //getY()       获取点击事件距离控件顶边的距离，即视图坐标
        //getRawX()  获取到的是点击事件距离整个屏幕左边的距离，即绝对坐标
        // getRawY()  获取到的是点击事件距离整个屏幕顶边的距离，即绝对坐标
        // getScrollY()  获取 视图坐标原点 到 视图 滚出屏幕 的水平距离
        // getScrollX()  获取 视图坐标原点 到 视图 滚出屏幕 的竖直距离

        //getX和getRawX
        //getX是View中的方法，相对于当前View左上角的x和y的坐标。
        //getRawX是MotionEvent中的方法，相对于屏幕的坐标。

        //注意：ScrollTo和scrollBy的区别
        //scrollTo:是根据位置的绝对移动
        //scrollBy:是相对移动

        //❤最终下面的几个方法也没有搞清楚
        //注意：最终发
        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //注意：getX()是相对于当前View的左上角x和y的坐标,所以没有参考价值，一般用在触摸事件的地方
                Log.e(TAG,"移动前的x，y:" + temp.getX() + '-' + temp.getY()); // 80-80
                //注意：getLeft()表示针对父容器的一个位置
                Log.e(TAG,"移动前位置left,top：" + temp.getLeft() + "-" + temp.getTop());//80-80
                Log.e(TAG,"getScrollX,getScrollY:" + llContainer.getScrollX());
                //其中button原来的位置在50,50处
                //注意：滑动针对的是内容的滑动,滑动到70,70处

                llContainer.scrollTo(-100,-100);
                Log.e(TAG,"getScrollX,getScrollY:" + llContainer.getScrollX());
                Log.e(TAG,"移动后子视图的位置：" + temp.getLeft() + "-" + temp.getTop());//80-80
                Log.e(TAG,"移动后的x，y:" + temp.getX() + '-' + temp.getY());//80-80
                Log.e(TAG,"移动后的偏移量" + temp.getTranslationX() + temp.getTranslationY());

                //总结：对一个布局llContainer调用scrollTo函数，并没有移动它的子视图，虽然它们看起来动了，
                // 但是子视图在布局中的相对位置是没有变的，因为getLeft()和getTop没有变化。
                // 其实它是移动了该布局的显示区域(当我们对布局调用scrollTo之后，该布局调用getScrollX()和
                // getScrollY()返回的值和最开始相比是变化的，但是子视图的getLeft(),getTop()返回的值并没有变)。
                // 像我们搭地铁，地铁开动时我们看到窗外的广告牌移动了，但是其实它们并没有动，是我们的视线移动了。
            }
        });
        findViewById(R.id.btn2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e(TAG,"移动前的x，y:" + temp.getX() + '-' + temp.getY());
                Log.e(TAG,"移动前位置：" + temp.getLeft() + "-" + temp.getTop());
                //是相对滑动，移动70个位置
                llContainer.scrollBy(-100,-100);
                Log.e(TAG,"移动后位置left,Top：" + temp.getLeft() + "-" + temp.getTop());
                Log.e(TAG,"移动后的x，y:" + temp.getX() + '-' + temp.getY());
                Log.e(TAG,"移动后的偏移量" + temp.getTranslationX() + temp.getTranslationY());
                //注意：移动前和移动后的位置是一样的

            }
        });
    }
}