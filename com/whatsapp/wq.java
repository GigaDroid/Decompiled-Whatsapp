package com.whatsapp;

import java.util.ArrayList;

class wq implements Runnable {
    final ArrayList a;
    final md b;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r11 = this;
        r10 = 2;
        r4 = 0;
        r8 = 0;
        r3 = 1;
        r5 = com.whatsapp.DialogToastActivity.f;
        r0 = r11.b;
        r0 = r0.isCancelled();
        if (r0 != 0) goto L_0x0074;
    L_0x000f:
        r0 = com.whatsapp.App.az();
        if (r0 != r3) goto L_0x0075;
    L_0x0015:
        r2 = r3;
    L_0x0016:
        r0 = r11.a;
        r6 = r0.iterator();
    L_0x001c:
        r0 = r6.hasNext();
        if (r0 == 0) goto L_0x0074;
    L_0x0022:
        r0 = r6.next();
        r0 = (com.whatsapp.protocol.co) r0;
        r1 = com.whatsapp.App.d(r0);
        if (r1 == 0) goto L_0x0072;
    L_0x002e:
        r1 = r0.c;
        r1 = com.whatsapp.App.b(r1);
        if (r1 == 0) goto L_0x006f;
    L_0x0036:
        r1 = r0.Q;
        r1 = (com.whatsapp.MediaData) r1;
        r7 = r0.q;
        if (r7 == 0) goto L_0x0049;
    L_0x003e:
        if (r1 == 0) goto L_0x0044;
    L_0x0040:
        r1 = r1.file;
        if (r1 != 0) goto L_0x0049;
    L_0x0044:
        com.whatsapp.App.a(r0, r3, r8);
        if (r5 == 0) goto L_0x006d;
    L_0x0049:
        r1 = r0.d;
        r1 = com.whatsapp.protocol.b7.a(r1, r10);
        if (r1 >= 0) goto L_0x006a;
    L_0x0051:
        r1 = r0.d;
        r7 = 14;
        if (r1 == r7) goto L_0x006a;
    L_0x0057:
        if (r2 != 0) goto L_0x0065;
    L_0x0059:
        r1 = r0.c;
        if (r1 == r3) goto L_0x0065;
    L_0x005d:
        r1 = r0.c;
        if (r1 != r10) goto L_0x006d;
    L_0x0061:
        r1 = r0.r;
        if (r1 != r3) goto L_0x006d;
    L_0x0065:
        com.whatsapp.App.a(r0, r4);
        if (r5 == 0) goto L_0x006d;
    L_0x006a:
        com.whatsapp.App.a(r0, r3, r8);
    L_0x006d:
        if (r5 == 0) goto L_0x0072;
    L_0x006f:
        com.whatsapp.App.a(r0, r3, r8);
    L_0x0072:
        if (r5 == 0) goto L_0x001c;
    L_0x0074:
        return;
    L_0x0075:
        r2 = r4;
        goto L_0x0016;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wq.run():void");
    }

    wq(md mdVar, ArrayList arrayList) {
        this.b = mdVar;
        this.a = arrayList;
    }
}
