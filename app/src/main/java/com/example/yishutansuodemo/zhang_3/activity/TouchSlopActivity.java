package com.example.yishutansuodemo.zhang_3.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.yishutansuodemo.R;

public class TouchSlopActivity extends AppCompatActivity {

    private static final String TAG = "test";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_touch_slop);

        int result = ViewConfiguration.get(this).getScaledTouchSlop();
        Toast.makeText(this, "距离:" + result, Toast.LENGTH_SHORT).show();
    }
}