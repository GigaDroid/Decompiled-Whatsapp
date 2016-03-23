package com.whatsapp;

import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;

public class kc implements jq {
    private Paint a;
    private float b;

    public ImageSpan a(Drawable drawable) {
        FontMetricsInt fontMetricsInt;
        if (this.a != null) {
            fontMetricsInt = this.a.getFontMetricsInt();
        } else {
            fontMetricsInt = null;
        }
        if (fontMetricsInt == null) {
            return null;
        }
        int textSize = (int) (((this.b * this.a.getTextSize()) * 1.1f) + 0.5f);
        drawable.setBounds(0, 0, textSize, textSize);
        return new ao7(drawable, fontMetricsInt);
    }

    public kc(Paint paint) {
        this.b = 1.0f;
        this.a = paint;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.drawable.Drawable a(android.graphics.drawable.Drawable r4, android.content.Context r5) {
        /*
        r3 = this;
        r2 = 0;
        r0 = r3.a;
        r0 = r0.getFontMetrics();
        if (r0 == 0) goto L_0x001e;
    L_0x0009:
        r0 = r3.b;
        r1 = r3.a;
        r1 = r1.getTextSize();
        r0 = r0 * r1;
        r1 = 1066192077; // 0x3f8ccccd float:1.1 double:5.26768877E-315;
        r0 = r0 * r1;
        r1 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r0 = r0 + r1;
        r0 = (int) r0;
        r1 = com.whatsapp.a28.a;
        if (r1 == 0) goto L_0x0027;
    L_0x001e:
        r0 = com.whatsapp.a4d.a();
        r0 = r0.b(r5);
        r0 = (int) r0;
    L_0x0027:
        r4.setBounds(r2, r2, r0, r0);
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.kc.a(android.graphics.drawable.Drawable, android.content.Context):android.graphics.drawable.Drawable");
    }

    public kc(Paint paint, float f) {
        this.b = 1.0f;
        this.a = paint;
        this.b = f;
    }
}
