package com.example.liangbin.myapplication;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.Button;

/**
 * Created by liangbin on 2017/11/21.
 */

public class MyButton extends Button {
    public MyButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.d("liangbin", "dispatchTouchEvent: "+event.getAction()+", view:button");
        boolean b = super.dispatchTouchEvent(event);
        return b;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d("liangbin", "onTouchEvent: "+event.getAction()+", view:button");
        boolean b = super.onTouchEvent(event);
        return b;
    }
}
