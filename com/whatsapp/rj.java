package com.whatsapp;

import android.view.animation.Animation;
import android.view.animation.Transformation;

class rj extends Animation {
    final BubbleRelativeLayout a;

    protected void applyTransformation(float f, Transformation transformation) {
        BubbleRelativeLayout.a(this.a, 1.0f - f);
        this.a.invalidate();
    }

    rj(BubbleRelativeLayout bubbleRelativeLayout, amk com_whatsapp_amk) {
        this(bubbleRelativeLayout);
    }

    private rj(BubbleRelativeLayout bubbleRelativeLayout) {
        this.a = bubbleRelativeLayout;
    }
}
