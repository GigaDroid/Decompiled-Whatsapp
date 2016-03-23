package com.whatsapp;

import android.graphics.Bitmap;

class ais implements Runnable {
    final PhotoView a;
    final int b;
    final Bitmap c;
    final a_d d;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r4 = this;
        r3 = 0;
        r0 = com.whatsapp.DialogToastActivity.f;
        r1 = r4.b;
        switch(r1) {
            case 3: goto L_0x001f;
            case 4: goto L_0x0008;
            case 5: goto L_0x0008;
            case 6: goto L_0x0016;
            case 7: goto L_0x0008;
            case 8: goto L_0x0028;
            default: goto L_0x0008;
        };
    L_0x0008:
        r0 = r4.a;
        r1 = 0;
        r0.setRotation(r1, r3);
    L_0x000e:
        r0 = r4.a;
        r1 = r4.c;
        r0.a(r1);
        return;
    L_0x0016:
        r1 = r4.a;
        r2 = 1119092736; // 0x42b40000 float:90.0 double:5.529052754E-315;
        r1.setRotation(r2, r3);
        if (r0 == 0) goto L_0x000e;
    L_0x001f:
        r1 = r4.a;
        r2 = 1127481344; // 0x43340000 float:180.0 double:5.570497984E-315;
        r1.setRotation(r2, r3);
        if (r0 == 0) goto L_0x000e;
    L_0x0028:
        r1 = r4.a;
        r2 = 1132920832; // 0x43870000 float:270.0 double:5.597372625E-315;
        r1.setRotation(r2, r3);
        if (r0 == 0) goto L_0x000e;
    L_0x0031:
        goto L_0x0008;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ais.run():void");
    }

    ais(a_d com_whatsapp_a_d, int i, PhotoView photoView, Bitmap bitmap) {
        this.d = com_whatsapp_a_d;
        this.b = i;
        this.a = photoView;
        this.c = bitmap;
    }
}
