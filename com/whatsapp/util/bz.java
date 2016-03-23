package com.whatsapp.util;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.support.annotation.NonNull;
import com.whatsapp.App;

public class bz extends InsetDrawable {
    boolean a;

    public bz(Drawable drawable, boolean z) {
        super(drawable, 0);
        this.a = z;
    }

    public boolean getPadding(Rect rect) {
        boolean padding = super.getPadding(rect);
        if (this.a) {
            int i = rect.right;
            rect.right = rect.left;
            rect.left = i;
        }
        return padding;
    }

    public void draw(@NonNull Canvas canvas) {
        if (!this.a) {
            super.draw(canvas);
            if (Log.h == 0) {
                return;
            }
        }
        canvas.save();
        canvas.scale(-1.0f, 1.0f, getBounds().exactCenterX(), 0.0f);
        super.draw(canvas);
        canvas.restore();
    }

    public bz(Drawable drawable) {
        this(drawable, !App.a1());
    }
}
