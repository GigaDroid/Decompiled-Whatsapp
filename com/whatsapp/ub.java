package com.whatsapp;

import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Transformation;
import com.whatsapp.util.a2;

class ub extends a2 {
    final ai0 h;
    private boolean i;
    final View j;
    final View k;

    protected void applyTransformation(float f, Transformation transformation) {
        super.applyTransformation(f, transformation);
        float f2 = this.d;
        int i = ((int) (f2 + ((this.e - f2) * f))) % 360;
        if (i > 90 && i < 270) {
            if (!this.i) {
                this.i = true;
                this.j.setVisibility(4);
                if (!DialogToastActivity.f) {
                    return;
                }
            }
            return;
        }
        if (this.i) {
            this.i = false;
            this.j.setVisibility(0);
        }
    }

    public ub(ai0 com_whatsapp_ai0, View view, View view2) {
        this.h = com_whatsapp_ai0;
        this.k = view;
        this.j = view2;
        super(0.0f, 360.0f, (float) (view.getWidth() / 2), (float) (view.getHeight() / 2), a4d.a().g * 200.0f, false);
        setDuration(1000);
        setInterpolator(new AccelerateDecelerateInterpolator());
    }
}
