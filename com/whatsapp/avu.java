package com.whatsapp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint.Align;
import android.graphics.Typeface;
import android.graphics.drawable.InsetDrawable;
import android.support.v4.content.ContextCompat;
import android.text.TextPaint;
import android.text.TextUtils;

public class avu extends InsetDrawable {
    private int a;
    private String b;
    private TextPaint c;

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (!TextUtils.isEmpty(this.b)) {
            if (this.a != getBounds().width()) {
                float width = (float) (getBounds().width() / this.b.length());
                this.a = getBounds().width();
                this.c.setTextSize(width);
                this.c.setTextSize(width * (((float) ((this.a * 17) / 24)) / this.c.measureText(this.b)));
            }
            canvas.drawText(this.b, (float) getBounds().centerX(), ((float) getBounds().centerY()) + ((2.0f * this.c.getTextSize()) / 3.0f), this.c);
        }
    }

    public avu(Context context, int i, String str) {
        super(ContextCompat.getDrawable(context, i), 0);
        this.c = new TextPaint();
        this.b = str;
        this.c.setAntiAlias(true);
        this.c.setColor(ContextCompat.getColor(context, 17170443));
        this.c.setTextSize((float) context.getResources().getDimensionPixelSize(2131427554));
        this.c.setTextAlign(Align.CENTER);
        this.c.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
    }
}
