package com.whatsapp;

import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;

class a94 extends ShapeDrawable {
    final MediaView a;

    public int getOpacity() {
        return 0;
    }

    a94(MediaView mediaView) {
        this.a = mediaView;
    }

    public int getIntrinsicWidth() {
        return (int) (a4d.a().g * 16.0f);
    }

    public int getIntrinsicHeight() {
        return (int) (a4d.a().g * 16.0f);
    }

    public void draw(Canvas canvas) {
    }
}
