package com.example.administrator.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * Created by Administrator on 2015/9/24.
 */
public class CustomView extends Activity {
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
        LinearLayout root = (LinearLayout)findViewById(R.id.root);
        final DrawView draw = new DrawView(this);
        draw.setMinimumWidth(300);
        draw.setMinimumHeight(500);
        draw.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                draw.currentX = motionEvent.getX();
                draw.currentY = motionEvent.getY();
                draw.invalidate();;
                return true;
            }
        });
        root.addView(draw);
    }
}
