package com.example.yishutansuodemo.zhang_2.activity;

import java.util.ArrayList;

import apis.amapv2.com.listviewlibrary.activity.BaseListActivty;
import apis.amapv2.com.listviewlibrary.bean.ItemObject;

public class Zhang2MainActivity extends BaseListActivty {
    @Override
    protected void addData(ArrayList<ItemObject> data) {
        data.add(new ItemObject("通过Messenger实现进程间通信操作",MessengerActivity.class));
    }
}