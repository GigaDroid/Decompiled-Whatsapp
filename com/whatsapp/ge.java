package com.whatsapp;

import android.os.SystemClock;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import android.view.MotionEvent;
import android.view.View;

public abstract class ge extends CharacterStyle implements UpdateAppearance {
    private long a;
    boolean b;
    private int c;
    private int d;
    private int e;

    public abstract void a(View view);

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void updateDrawState(android.text.TextPaint r3) {
        /*
        r2 = this;
        r0 = com.whatsapp.DialogToastActivity.f;
        r1 = r2.b;
        if (r1 == 0) goto L_0x0011;
    L_0x0006:
        r1 = r2.d;
        r3.setColor(r1);
        r1 = r2.e;
        r3.bgColor = r1;
        if (r0 == 0) goto L_0x0024;
    L_0x0011:
        r1 = r2.c;
        if (r1 != 0) goto L_0x001c;
    L_0x0015:
        r1 = r3.linkColor;
        r3.setColor(r1);
        if (r0 == 0) goto L_0x0021;
    L_0x001c:
        r0 = r2.c;
        r3.setColor(r0);
    L_0x0021:
        r0 = 0;
        r3.bgColor = r0;
    L_0x0024:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ge.updateDrawState(android.text.TextPaint):void");
    }

    public boolean a(View view, MotionEvent motionEvent) {
        boolean z = true;
        if (motionEvent.getAction() == 1) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - this.a > 1000) {
                this.a = elapsedRealtime;
                a(view);
            }
        }
        if (motionEvent.getAction() != 0) {
            z = false;
        }
        this.b = z;
        view.invalidate();
        return false;
    }

    public ge(int i, int i2, int i3) {
        this.c = i;
        this.d = i2;
        this.e = i3;
    }
}
