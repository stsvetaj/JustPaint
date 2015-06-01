package com.example.xxx.justpaint;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.view.View;

/**
 * Created by Stanislav on 21.04.2015.
 */
public class Draw2D extends View{

    private Paint mPaint = new Paint();

    public Draw2D(Context context) {
        super(context);

    }

    @Override
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);

        mPaint.setStyle(Paint.Style.FILL);

        mPaint.setColor(Color.WHITE);
        canvas.drawPaint(mPaint);

        mPaint.setAntiAlias(true);
        mPaint.setColor(Color.YELLOW);
        canvas.drawCircle(425, 50, 60, mPaint);

        mPaint.setAntiAlias(true);
        mPaint.setColor(Color.RED);
        canvas.drawCircle(425, 50, 30, mPaint);

        mPaint.setColor(Color.BLACK);
        mPaint.setStrokeWidth(3);
        float leftx = 205;
        float topy = 500;
        float rightx = 400;
        float bottomy = 700;
        canvas.drawRect(leftx, topy, rightx, bottomy, mPaint);

        mPaint.setStrokeWidth(3);
        mPaint.setColor(Color.RED);
        mPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        mPaint.setAntiAlias(true);

        Point a = new Point(300, 350);
        Point b = new Point(150, 500);
        Point c = new Point(450, 500);

        Path path = new Path();
        path.moveTo(a.x, a.y);
        path.lineTo(b.x, b.y);
        path.moveTo(b.x, b.y);
        path.lineTo(c.x, c.y);
        path.moveTo(c.x, c.y);
        path.lineTo(a.x, a.y);
        path.close();

        canvas.drawPath(path, mPaint);



        mPaint.setColor(Color.GREEN);
        canvas.drawRect(0, 650, 950, 680, mPaint);

        mPaint.setColor(Color.BLUE);
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setAntiAlias(true);
        mPaint.setTextSize(15);
        canvas.drawText("Лужайка только для котов", 5, 648, mPaint);

    }
}