package com.whatsapp;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;

class p0 extends Drawable {
    final Drawable a;
    final BroadcastDetails b;
    final View c;

    public int getOpacity() {
        return 0;
    }

    public void setAlpha(int i) {
    }

    public void draw(Canvas canvas) {
        int intrinsicHeight = this.a.getIntrinsicHeight();
        int intrinsicWidth = this.a.getIntrinsicWidth();
        int width = this.c.getWidth();
        this.c.getWidth();
        this.a.setBounds(0, 0, width, (intrinsicHeight * width) / intrinsicWidth);
        this.a.draw(canvas);
    }

    p0(BroadcastDetails broadcastDetails, Drawable drawable, View view) {
        this.b = broadcastDetails;
        this.a = drawable;
        this.c = view;
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
