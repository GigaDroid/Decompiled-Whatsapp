package com.whatsapp;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

class atg extends Animation {
    final View a;
    final Conversation b;
    final int c;

    atg(Conversation conversation, int i, View view) {
        this.b = conversation;
        this.c = i;
        this.a = view;
    }

    protected void applyTransformation(float f, Transformation transformation) {
        int i = (int) (((float) this.c) * f);
        Drawable background = this.a.getBackground();
        if (background instanceof x1) {
            ((x1) background).a(0, i, 0, 0);
        }
    }

    public boolean willChangeBounds() {
        return false;
    }
}
