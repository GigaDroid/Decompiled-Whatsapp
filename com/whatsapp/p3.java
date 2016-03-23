package com.whatsapp;

import android.os.Handler;
import android.os.Looper;
import org.v;
import org.whispersystems.at;

class p3 extends Handler {
    private static final String z;
    final MediaView a;

    static {
        char[] toCharArray = "\\{V\u0003bGwW\u001d,PkV\u0003l\u001emW\u001e#Eq\u0012\u0019w^n\u0012\u0019wPjG\u0019".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 49;
                    break;
                case at.g /*1*/:
                    i2 = 30;
                    break;
                case at.i /*2*/:
                    i2 = 50;
                    break;
                case at.o /*3*/:
                    i2 = arj.Theme_ratingBarStyle;
                    break;
                default:
                    i2 = 3;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMessage(android.os.Message r9) {
        /*
        r8 = this;
        r7 = 5;
        r6 = 4;
        r0 = com.whatsapp.DialogToastActivity.f;
        r1 = r8.a;
        r1 = com.whatsapp.MediaView.r(r1);
        if (r1 != 0) goto L_0x000d;
    L_0x000c:
        return;
    L_0x000d:
        r1 = r8.a;
        r1 = com.whatsapp.MediaView.p(r1);
        if (r1 != r6) goto L_0x006d;
    L_0x0015:
        r1 = r8.a;
        r1 = com.whatsapp.MediaView.h(r1);
        r1 = r1.d();
        if (r1 <= 0) goto L_0x0065;
    L_0x0021:
        r1 = r8.a;
        r1 = com.whatsapp.MediaView.r(r1);
        r1 = r1.a();
        r2 = r8.a;
        r2 = com.whatsapp.MediaView.h(r2);
        r2 = r2.d();
        r1 = java.lang.Math.min(r1, r2);
        r2 = r8.a;
        r2 = com.whatsapp.MediaView.e(r2);
        r2 = r2 / 1000;
        r3 = r1 / 1000;
        if (r2 == r3) goto L_0x005a;
    L_0x0045:
        r2 = r8.a;
        r2 = com.whatsapp.MediaView.k(r2);
        r3 = r1 / 1000;
        r4 = (long) r3;
        r3 = android.text.format.DateUtils.formatElapsedTime(r4);
        r2.setText(r3);
        r2 = r8.a;
        com.whatsapp.MediaView.g(r2, r1);
    L_0x005a:
        r2 = r8.a;
        r2 = com.whatsapp.MediaView.h(r2);
        r2.setProgress(r1);
        if (r0 == 0) goto L_0x006d;
    L_0x0065:
        r1 = r8.a;
        r2 = 2131231130; // 0x7f08019a float:1.8078332E38 double:1.0529680847E-314;
        r1.a(r2);
    L_0x006d:
        r1 = r8.a;
        r1 = r1.isFinishing();
        if (r1 != 0) goto L_0x0097;
    L_0x0075:
        r1 = r8.a;
        r1 = com.whatsapp.MediaView.p(r1);
        if (r1 != r6) goto L_0x0097;
    L_0x007d:
        r1 = r8.a;
        r1 = com.whatsapp.MediaView.r(r1);
        r1 = r1.f();
        if (r1 == 0) goto L_0x0097;
    L_0x0089:
        r1 = r8.a;
        r1 = com.whatsapp.MediaView.u(r1);
        r2 = 0;
        r4 = 50;
        r1.sendEmptyMessageDelayed(r2, r4);
        if (r0 == 0) goto L_0x000c;
    L_0x0097:
        r0 = r8.a;
        r0 = com.whatsapp.MediaView.p(r0);
        if (r0 == r7) goto L_0x000c;
    L_0x009f:
        r0 = z;
        com.whatsapp.util.Log.i(r0);
        r0 = r8.a;
        r0 = com.whatsapp.MediaView.h(r0);
        r1 = r8.a;
        r1 = com.whatsapp.MediaView.h(r1);
        r1 = r1.d();
        r0.setProgress(r1);
        r0 = r8.a;
        r0 = com.whatsapp.MediaView.k(r0);
        r1 = r8.a;
        r1 = com.whatsapp.MediaView.r(r1);
        r1 = r1.d();
        r1 = r1 / 1000;
        r2 = (long) r1;
        r1 = android.text.format.DateUtils.formatElapsedTime(r2);
        r0.setText(r1);
        r0 = r8.a;
        com.whatsapp.MediaView.b(r0, r7);
        r0 = r8.a;
        r0 = com.whatsapp.MediaView.s(r0);
        r1 = new com.whatsapp.util.bz;
        r2 = r8.a;
        r2 = r2.getResources();
        r3 = 2130839676; // 0x7f02087c float:1.728437E38 double:1.0527746807E-314;
        r2 = r2.getDrawable(r3);
        r1.<init>(r2);
        r0.setImageDrawable(r1);
        goto L_0x000c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.p3.handleMessage(android.os.Message):void");
    }

    p3(MediaView mediaView, Looper looper) {
        this.a = mediaView;
        super(looper);
    }
}
