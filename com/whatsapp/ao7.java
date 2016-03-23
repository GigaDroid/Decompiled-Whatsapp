package com.whatsapp;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.whatsapp.util.ah;

public class ao7 extends ah {
    private boolean b;
    private FontMetricsInt c;
    private int d;

    public void a(boolean z) {
        this.b = z;
    }

    public void a(int i) {
        this.d = i;
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        super.draw(canvas, charSequence, i, i2, f, i3, i4, i5, paint);
    }

    public ao7(Drawable drawable, FontMetricsInt fontMetricsInt) {
        super(drawable);
        this.d = -1;
        this.c = fontMetricsInt;
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, FontMetricsInt fontMetricsInt) {
        Rect bounds = a().getBounds();
        if (!(fontMetricsInt == null || this.b)) {
            int max = Math.max(0, (bounds.height() - this.c.descent) + this.c.ascent);
            fontMetricsInt.ascent = this.c.ascent - max;
            fontMetricsInt.descent = this.c.descent + max;
            fontMetricsInt.top = this.c.top - max;
            fontMetricsInt.bottom = max + this.c.bottom;
        }
        return bounds.right + ((int) a4d.a().g);
    }
}
