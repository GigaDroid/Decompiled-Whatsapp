package com.whatsapp;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.graphics.drawable.DrawableWrapper;

class x1 extends DrawableWrapper {
    int b;
    int c;
    int d;
    int e;

    void a(int i, int i2, int i3, int i4) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        getWrappedDrawable().setBounds(bounds.left + this.b, bounds.top + this.c, bounds.right - this.d, bounds.bottom - this.e);
        getWrappedDrawable().draw(canvas);
    }

    public x1(Drawable drawable) {
        super(drawable);
    }
}
