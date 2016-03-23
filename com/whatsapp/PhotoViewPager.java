package com.whatsapp;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;

public class PhotoViewPager extends ViewPager {
    private int a;
    private float b;
    private float c;
    private float d;
    private axn e;

    public PhotoViewPager(Context context) {
        super(context);
        a();
    }

    public PhotoViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    private void a() {
        if (VERSION.SDK_INT >= 11) {
            setPageTransformer(true, new qg(this));
            if (!DialogToastActivity.f) {
                return;
            }
        }
        setPageMargin((int) (12.0f * getContext().getResources().getDisplayMetrics().density));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r9) {
        /*
        r8 = this;
        r7 = -1;
        r3 = 1;
        r2 = 0;
        r4 = com.whatsapp.DialogToastActivity.f;
        r0 = r8.e;
        if (r0 == 0) goto L_0x0042;
    L_0x0009:
        r0 = r8.e;
        r1 = r8.d;
        r5 = r8.b;
        r0 = r0.a(r1, r5);
    L_0x0013:
        r5 = android.support.v4.view.MotionEventCompat.getPointerCount(r9);
        r1 = com.whatsapp.alf.BOTH;
        if (r0 == r1) goto L_0x0021;
    L_0x001b:
        r1 = com.whatsapp.alf.LEFT;
        if (r0 == r1) goto L_0x0021;
    L_0x001f:
        if (r5 <= r3) goto L_0x0045;
    L_0x0021:
        r1 = r3;
    L_0x0022:
        r6 = com.whatsapp.alf.BOTH;
        if (r0 == r6) goto L_0x002c;
    L_0x0026:
        r6 = com.whatsapp.alf.RIGHT;
        if (r0 == r6) goto L_0x002c;
    L_0x002a:
        if (r5 <= r3) goto L_0x0047;
    L_0x002c:
        r0 = r3;
    L_0x002d:
        r5 = r9.getAction();
        r5 = r5 & 255;
        r6 = 3;
        if (r5 == r6) goto L_0x0038;
    L_0x0036:
        if (r5 != r3) goto L_0x003a;
    L_0x0038:
        r8.a = r7;
    L_0x003a:
        switch(r5) {
            case 0: goto L_0x007a;
            case 2: goto L_0x0049;
            case 6: goto L_0x0094;
            default: goto L_0x003d;
        };
    L_0x003d:
        r2 = super.onInterceptTouchEvent(r9);
    L_0x0041:
        return r2;
    L_0x0042:
        r0 = com.whatsapp.alf.NONE;
        goto L_0x0013;
    L_0x0045:
        r1 = r2;
        goto L_0x0022;
    L_0x0047:
        r0 = r2;
        goto L_0x002d;
    L_0x0049:
        if (r1 != 0) goto L_0x004d;
    L_0x004b:
        if (r0 == 0) goto L_0x003d;
    L_0x004d:
        r5 = r8.a;
        if (r5 != r7) goto L_0x0053;
    L_0x0051:
        if (r4 == 0) goto L_0x003d;
    L_0x0053:
        r5 = android.support.v4.view.MotionEventCompat.findPointerIndex(r9, r5);
        r5 = android.support.v4.view.MotionEventCompat.getX(r9, r5);
        if (r1 == 0) goto L_0x0062;
    L_0x005d:
        if (r0 == 0) goto L_0x0062;
    L_0x005f:
        r8.c = r5;
        goto L_0x0041;
    L_0x0062:
        if (r1 == 0) goto L_0x006d;
    L_0x0064:
        r1 = r8.c;
        r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1));
        if (r1 <= 0) goto L_0x006d;
    L_0x006a:
        r8.c = r5;
        goto L_0x0041;
    L_0x006d:
        if (r0 == 0) goto L_0x0078;
    L_0x006f:
        r0 = r8.c;
        r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1));
        if (r0 >= 0) goto L_0x0078;
    L_0x0075:
        r8.c = r5;
        goto L_0x0041;
    L_0x0078:
        if (r4 == 0) goto L_0x003d;
    L_0x007a:
        r0 = r9.getX();
        r8.c = r0;
        r0 = r9.getRawX();
        r8.d = r0;
        r0 = r9.getRawY();
        r8.b = r0;
        r0 = android.support.v4.view.MotionEventCompat.getPointerId(r9, r2);
        r8.a = r0;
        if (r4 == 0) goto L_0x003d;
    L_0x0094:
        r0 = android.support.v4.view.MotionEventCompat.getActionIndex(r9);
        r1 = android.support.v4.view.MotionEventCompat.getPointerId(r9, r0);
        r4 = r8.a;
        if (r1 != r4) goto L_0x003d;
    L_0x00a0:
        if (r0 != 0) goto L_0x00af;
    L_0x00a2:
        r0 = android.support.v4.view.MotionEventCompat.getX(r9, r3);
        r8.c = r0;
        r0 = android.support.v4.view.MotionEventCompat.getPointerId(r9, r3);
        r8.a = r0;
        goto L_0x003d;
    L_0x00af:
        r3 = r2;
        goto L_0x00a2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.PhotoViewPager.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setOnInterceptTouchListener(axn com_whatsapp_axn) {
        this.e = com_whatsapp_axn;
    }
}
