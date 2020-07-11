package com.example.yishutansuodemo;

import com.example.yishutansuodemo.zhang_3.Zhang3MainActivity;

import java.util.ArrayList;

import apis.amapv2.com.listviewlibrary.activity.BaseListActivty;
import apis.amapv2.com.listviewlibrary.bean.ItemObject;

public class MainActivity extends BaseListActivty {

    @Override
    protected void addData(ArrayList<ItemObject> data) {
        data.add(new ItemObject("2章：IPC机制", Zhang3MainActivity.class));
        data.add(new ItemObject("3章：View的事件体系", Zhang3MainActivity.class));
    }
}