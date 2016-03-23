package com.whatsapp;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

class oz extends Animation {
    final View a;
    final uu b;
    final int c;

    oz(uu uuVar, int i, View view) {
        this.b = uuVar;
        this.c = i;
        this.a = view;
    }

    protected void applyTransformation(float f, Transformation transformation) {
        int i = this.c - ((int) (((float) this.c) * f));
        Drawable background = this.a.getBackground();
        if (background instanceof x1) {
            if (f == 1.0f) {
                this.a.setBackgroundDrawable(((x1) background).getWrappedDrawable());
                if (!DialogToastActivity.f) {
                    return;
                }
            }
            ((x1) background).a(0, i, 0, 0);
        }
    }

    public boolean willChangeBounds() {
        return false;
    }
}
