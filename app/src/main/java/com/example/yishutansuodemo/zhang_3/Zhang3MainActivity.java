package com.example.yishutansuodemo.zhang_3;

import java.util.ArrayList;

import apis.amapv2.com.listviewlibrary.activity.BaseListActivty;
import apis.amapv2.com.listviewlibrary.bean.ItemObject;

public class Zhang3MainActivity extends BaseListActivty {
    @Override
    protected void addData(ArrayList<ItemObject> data) {
        data.add(new ItemObject("获得最小滑动距离",TouchSlopActivity.class));
    }
}