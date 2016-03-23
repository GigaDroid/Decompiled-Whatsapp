package com.facebook.rebound.ui;

import android.content.res.Resources;
import android.util.TypedValue;
import android.widget.FrameLayout.LayoutParams;

public abstract class a {
    public static final int a(float f, Resources resources) {
        return (int) TypedValue.applyDimension(1, f, resources.getDisplayMetrics());
    }

    public static final LayoutParams a() {
        return a(-1, -1);
    }

    public static final LayoutParams a(int i, int i2) {
        return new LayoutParams(i, i2);
    }

    public static final LayoutParams b() {
        return a(-1, -2);
    }
}
