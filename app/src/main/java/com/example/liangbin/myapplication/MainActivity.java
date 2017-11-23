package com.example.liangbin.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends Activity implements View.OnTouchListener, View.OnClickListener {
    private LinearLayout linearLayout;
    private MyButton button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearLayout = findViewById(R.id.layout);
        button = findViewById(R.id.btn);

        linearLayout.setOnClickListener(this);
        button.setOnClickListener(this);
        linearLayout.setOnTouchListener(this);
        button.setOnTouchListener(this);
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        Log.d("liangbin", "onTouch: view:"+view.getClass().getSimpleName()+", event;"+motionEvent.getAction());
        return false;
    }

    @Override
    public void onClick(View view) {
        Log.d("liangbin", "onClick: view:"+view.getClass().getSimpleName());
    }
}
