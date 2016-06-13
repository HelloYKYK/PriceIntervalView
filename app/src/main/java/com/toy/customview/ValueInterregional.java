package com.toy.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by TOY on 2016/6/13.
 * 根据价格区间显示图表矩形
 */
public class ValueInterregional extends View {

    private Paint mPaint;
    private Rect mBounds;

    private final  int TOTALPRICE= 100000;
    private int topPrice;
    private int floorPrice;
    private int presentPrice;


    public ValueInterregional(Context context) {
        super(context);
        init();
    }


    public ValueInterregional(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public ValueInterregional(Context context, AttributeSet attrs, int defStyleAttr) {

        super(context, attrs, defStyleAttr);
        init();
    }
    private void init() {
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mBounds = new Rect();
        topPrice = 50000;
        floorPrice = 20000;
        presentPrice = 47878;
    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
//        mPaint.setColor(Color.YELLOW);
//        canvas.drawRect(0, 0, getWidth(), getHeight(), mPaint);
        mPaint.setColor(Color.BLACK);

        float rateY= TOTALPRICE/getHeight();
        float startX = 0;
        float startY = (TOTALPRICE - floorPrice)/rateY;
        float stopY = (TOTALPRICE - topPrice )/rateY;
        float stopX = getWidth();

        canvas.drawLine(startX,startY,stopX,stopY,mPaint);
    }
}
