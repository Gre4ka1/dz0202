package com.example.dz0202;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class Draw extends View {



    public Draw(Context context) {
        super(context);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        /*paint.setColor(Color.BLUE);
        canvas.drawRect(0, 0, getWidth(), getHeight(), paint);*/

        paint.setColor(Color.GREEN);
        canvas.drawRect(0, getHeight()/3*2, getWidth(), getHeight(), paint);

        Paint paint1 =new Paint();
        paint1.setColor(R.color.purple_200);
        canvas.drawRect(100, getHeight()/3*2, 400, getHeight()/3*2-250, paint1);


    }
}
