package com.example.liangbin.myapplication;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * Created by liangbin on 2017/11/21.
 */

public class MyLinerlayout extends LinearLayout {
    public MyLinerlayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.d("liangbin", "dispatchTouchEvent: "+ev.getAction()+", view:LinearLayout");
        boolean b = super.dispatchTouchEvent(ev);
        return b;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d("liangbin", "onTouchEvent: "+event.getAction()+", view:LinearLayout");
        boolean b = super.onTouchEvent(event);
        return b;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.d("liangbin", "onInterceptTouchEvent: "+ev.getAction()+", view:LinearLayout");
        return false;
    }
}
