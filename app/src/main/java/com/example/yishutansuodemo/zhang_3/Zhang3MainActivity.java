package com.example.yishutansuodemo.zhang_3;

import com.example.yishutansuodemo.zhang_3.activity.AnimationMoveDemoActivity;
import com.example.yishutansuodemo.zhang_3.activity.AnimationScrollerMoveActivity;
import com.example.yishutansuodemo.zhang_3.activity.FullScreenMoveActivity;
import com.example.yishutansuodemo.zhang_3.activity.GestureDetector1Activity;
import com.example.yishutansuodemo.zhang_3.activity.GestureDetector2Activity;
import com.example.yishutansuodemo.zhang_3.activity.GestureDetector3Activity;
import com.example.yishutansuodemo.zhang_3.activity.ObjectAnimationMoveDemoActivity;
import com.example.yishutansuodemo.zhang_3.activity.ParamMoveDemoActivity;
import com.example.yishutansuodemo.zhang_3.activity.ScrollToScrollByDemoActivity;
import com.example.yishutansuodemo.zhang_3.activity.ScrollerActivity;
import com.example.yishutansuodemo.zhang_3.activity.TouchSlopActivity;
import com.example.yishutansuodemo.zhang_3.activity.VelocityActivity;

import java.util.ArrayList;

import apis.amapv2.com.listviewlibrary.activity.BaseListActivty;
import apis.amapv2.com.listviewlibrary.bean.ItemObject;

public class Zhang3MainActivity extends BaseListActivty {
    @Override
    protected void addData(ArrayList<ItemObject> data) {
        data.add(new ItemObject("获得最小滑动距离", TouchSlopActivity.class));
        data.add(new ItemObject("监听滑动的速度", VelocityActivity.class));
        data.add(new ItemObject("GestureDetector监听单击事件", GestureDetector1Activity.class));
        data.add(new ItemObject("GestureDetector监听双击事件", GestureDetector2Activity.class));
        data.add(new ItemObject("GestureDetector监听单击双击事件的简单做法", GestureDetector3Activity.class));
        data.add(new ItemObject("ScrollTo/ScrollBy实现瞬间滑动", ScrollToScrollByDemoActivity.class));
        data.add(new ItemObject("Scroller实现弹性滑动", ScrollerActivity.class));
        data.add(new ItemObject("使用补件动画来实现滑动", AnimationMoveDemoActivity.class));
        data.add(new ItemObject("使用属性动画来实现滑动", ObjectAnimationMoveDemoActivity.class));
        data.add(new ItemObject("通过布局参数来实现滑动", ParamMoveDemoActivity.class));
        data.add(new ItemObject("实现全屏滑动", FullScreenMoveActivity.class));
        data.add(new ItemObject("属性动画+Scroller实现弹性滑动", AnimationScrollerMoveActivity.class));
    }
}