package com.example.administrator.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by Administrator joe on 2015/9/24.
 */
public class DrawView extends View{
    public float currentX = 40;
    public float currentY =50;
    /*
    * @param context
     */
    public DrawView(Context context){
        super(context);
    }

    public void onDraw(Canvas canvas){
        super.onDraw(canvas);
        Paint p = new Paint();
        p.setColor(Color.RED);
        canvas.drawCircle(currentX, currentY, 15, p);

    }
}
