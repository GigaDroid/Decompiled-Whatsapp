package com.whatsapp;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

public class a_z extends MetricAffectingSpan {
    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(android.graphics.Paint r3) {
        /*
        r1 = r3.getTypeface();
        if (r1 != 0) goto L_0x000b;
    L_0x0006:
        r0 = 0;
        r2 = com.whatsapp.DialogToastActivity.f;
        if (r2 == 0) goto L_0x000f;
    L_0x000b:
        r0 = r1.getStyle();
    L_0x000f:
        r1 = com.whatsapp.a4d.e();
        r2 = r1.getStyle();
        r2 = r2 ^ -1;
        r0 = r0 & r2;
        r2 = r0 & 1;
        if (r2 == 0) goto L_0x0022;
    L_0x001e:
        r2 = 1;
        r3.setFakeBoldText(r2);
    L_0x0022:
        r0 = r0 & 2;
        if (r0 == 0) goto L_0x002b;
    L_0x0026:
        r0 = -1098907648; // 0xffffffffbe800000 float:-0.25 double:NaN;
        r3.setTextSkewX(r0);
    L_0x002b:
        r3.setTypeface(r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a_z.a(android.graphics.Paint):void");
    }

    public void updateDrawState(TextPaint textPaint) {
        a(textPaint);
    }

    public void updateMeasureState(TextPaint textPaint) {
        a(textPaint);
    }
}
