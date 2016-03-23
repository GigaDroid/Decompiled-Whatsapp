package com.whatsapp;

import android.graphics.Paint;

public class kj extends kc {
    private static kj c;
    private int d;

    public static jq a() {
        int dimensionPixelSize = App.z().getResources().getDimensionPixelSize(2131427479);
        if (c == null || App.z().getResources().getDimensionPixelSize(2131427479) != c.d) {
            Paint paint = new Paint();
            paint.setTextSize((float) App.z().getResources().getDimensionPixelSize(2131427479));
            c = new kj(paint);
            c.d = dimensionPixelSize;
        }
        return c;
    }

    public kj(Paint paint) {
        super(paint);
    }
}
