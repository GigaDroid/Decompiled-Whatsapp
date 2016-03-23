package com.whatsapp;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.support.annotation.NonNull;

class ar3 extends InsetDrawable {
    final HomeActivity a;

    ar3(HomeActivity homeActivity, Drawable drawable, int i) {
        this.a = homeActivity;
        super(drawable, i);
    }

    public void draw(@NonNull Canvas canvas) {
    }
}
