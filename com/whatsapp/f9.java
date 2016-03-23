package com.whatsapp;

import java.util.List;

final class f9 implements Runnable {
    final String a;
    final boolean b;
    final int c;
    final List d;
    final int e;
    final g2 f;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r11 = this;
        r5 = 1;
        r6 = 0;
        r3 = 0;
        r7 = com.whatsapp.DialogToastActivity.f;
        r8 = new java.util.ArrayList;	 Catch:{ all -> 0x00ed }
        r8.<init>();	 Catch:{ all -> 0x00ed }
        r0 = r11.d;	 Catch:{ all -> 0x00ed }
        if (r0 == 0) goto L_0x0097;
    L_0x000e:
        r0 = r11.d;	 Catch:{ all -> 0x00ed }
        r9 = r0.iterator();	 Catch:{ all -> 0x00ed }
    L_0x0014:
        r0 = r9.hasNext();	 Catch:{ all -> 0x00ed }
        if (r0 == 0) goto L_0x0097;
    L_0x001a:
        r0 = r9.next();	 Catch:{ all -> 0x00ed }
        r0 = (com.whatsapp.protocol.co) r0;	 Catch:{ all -> 0x00ed }
        r1 = r0.d;	 Catch:{ all -> 0x00ed }
        r2 = 6;
        if (r1 != r2) goto L_0x002b;
    L_0x0025:
        r1 = com.whatsapp.qm.b(r0);	 Catch:{ all -> 0x00ed }
        if (r7 == 0) goto L_0x00f4;
    L_0x002b:
        r2 = new com.whatsapp.protocol.c2;	 Catch:{ all -> 0x00ed }
        r2.<init>();	 Catch:{ all -> 0x00ed }
        r2.k = r0;	 Catch:{ all -> 0x00ed }
        r1 = r0.e;	 Catch:{ all -> 0x00ed }
        if (r1 != 0) goto L_0x0058;
    L_0x0036:
        r1 = r0.k;	 Catch:{ all -> 0x00ed }
        r1 = r1.c;	 Catch:{ all -> 0x00ed }
        r1 = com.whatsapp.qa.d(r1);	 Catch:{ all -> 0x00ed }
        r1 = r1.c();	 Catch:{ all -> 0x00ed }
        if (r1 == 0) goto L_0x0058;
    L_0x0044:
        r1 = r0.t;	 Catch:{ all -> 0x00ed }
        if (r1 == 0) goto L_0x00dd;
    L_0x0048:
        r1 = com.whatsapp.App.as;	 Catch:{ all -> 0x00ed }
        r4 = r0.t;	 Catch:{ all -> 0x00ed }
        r1 = r1.b(r4);	 Catch:{ all -> 0x00ed }
    L_0x0050:
        r4 = r2.k;	 Catch:{ all -> 0x00ed }
        if (r1 == 0) goto L_0x00e0;
    L_0x0054:
        r1 = r1.f;	 Catch:{ all -> 0x00ed }
    L_0x0056:
        r4.e = r1;	 Catch:{ all -> 0x00ed }
    L_0x0058:
        r1 = r0.c;	 Catch:{ all -> 0x00ed }
        if (r1 != 0) goto L_0x00e3;
    L_0x005c:
        r1 = r5;
    L_0x005d:
        if (r1 == 0) goto L_0x00e6;
    L_0x005f:
        r4 = r0.a;	 Catch:{ all -> 0x00ed }
        r4 = android.text.TextUtils.isEmpty(r4);	 Catch:{ all -> 0x00ed }
        if (r4 == 0) goto L_0x006f;
    L_0x0067:
        r4 = r0.A;	 Catch:{ all -> 0x00ed }
        r4 = android.text.TextUtils.isEmpty(r4);	 Catch:{ all -> 0x00ed }
        if (r4 != 0) goto L_0x00e6;
    L_0x006f:
        r4 = r5;
    L_0x0070:
        if (r1 == 0) goto L_0x00e8;
    L_0x0072:
        r1 = r3;
    L_0x0073:
        if (r1 == 0) goto L_0x007d;
    L_0x0075:
        r10 = r1.mediaKey;	 Catch:{ all -> 0x00ed }
        if (r10 == 0) goto L_0x007d;
    L_0x0079:
        r1 = r1.mediaKey;	 Catch:{ all -> 0x00ed }
        r2.g = r1;	 Catch:{ all -> 0x00ed }
    L_0x007d:
        if (r4 == 0) goto L_0x008f;
    L_0x007f:
        r0 = r0.c();	 Catch:{ all -> 0x00ed }
        r0 = com.whatsapp.util.ac.c(r0);	 Catch:{ all -> 0x00ed }
        r1 = android.text.TextUtils.isEmpty(r0);	 Catch:{ all -> 0x00ed }
        if (r1 != 0) goto L_0x008f;
    L_0x008d:
        r2.u = r0;	 Catch:{ all -> 0x00ed }
    L_0x008f:
        r0 = r2;
    L_0x0090:
        if (r0 == 0) goto L_0x0095;
    L_0x0092:
        r8.add(r0);	 Catch:{ all -> 0x00ed }
    L_0x0095:
        if (r7 == 0) goto L_0x0014;
    L_0x0097:
        r0 = r11.f;	 Catch:{ all -> 0x00ed }
        r0.b();	 Catch:{ all -> 0x00ed }
        r6 = new com.whatsapp._d;	 Catch:{ all -> 0x00ed }
        r0 = new com.whatsapp.sh;	 Catch:{ all -> 0x00ed }
        r1 = r11.a;	 Catch:{ all -> 0x00ed }
        r2 = r11.d;	 Catch:{ all -> 0x00ed }
        r3 = r11.e;	 Catch:{ all -> 0x00ed }
        r4 = r11.b;	 Catch:{ all -> 0x00ed }
        r5 = r11.c;	 Catch:{ all -> 0x00ed }
        r0.<init>(r1, r2, r3, r4, r5);	 Catch:{ all -> 0x00ed }
        r6.<init>(r0);	 Catch:{ all -> 0x00ed }
        r0 = r11.a;	 Catch:{ all -> 0x00ed }
        if (r0 != 0) goto L_0x00c0;
    L_0x00b4:
        r0 = com.whatsapp.wn.u();	 Catch:{ all -> 0x00ed }
        r1 = r11.e;	 Catch:{ all -> 0x00ed }
        r1 = com.whatsapp.messaging.co.a(r0, r1, r8, r6);	 Catch:{ all -> 0x00ed }
        if (r7 == 0) goto L_0x00cb;
    L_0x00c0:
        r0 = r11.a;	 Catch:{ all -> 0x00ed }
        r1 = r11.a;	 Catch:{ all -> 0x00ed }
        r2 = r11.c;	 Catch:{ all -> 0x00ed }
        r3 = 0;
        r1 = com.whatsapp.messaging.co.a(r1, r8, r2, r3, r6);	 Catch:{ all -> 0x00ed }
    L_0x00cb:
        r2 = com.whatsapp.App.p;	 Catch:{ all -> 0x00ed }
        r2 = r2.ai;	 Catch:{ all -> 0x00ed }
        r3 = new com.whatsapp.jobqueue.job.SendWebForwardJob;	 Catch:{ all -> 0x00ed }
        r3.<init>(r0, r1);	 Catch:{ all -> 0x00ed }
        r2.a(r3);	 Catch:{ all -> 0x00ed }
        r0 = r11.f;
        r0.a();
        return;
    L_0x00dd:
        r1 = r3;
        goto L_0x0050;
    L_0x00e0:
        r1 = r3;
        goto L_0x0056;
    L_0x00e3:
        r1 = r6;
        goto L_0x005d;
    L_0x00e6:
        r4 = r6;
        goto L_0x0070;
    L_0x00e8:
        r1 = r0.Q;	 Catch:{ all -> 0x00ed }
        r1 = (com.whatsapp.MediaData) r1;	 Catch:{ all -> 0x00ed }
        goto L_0x0073;
    L_0x00ed:
        r0 = move-exception;
        r1 = r11.f;
        r1.a();
        throw r0;
    L_0x00f4:
        r0 = r1;
        goto L_0x0090;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.f9.run():void");
    }

    f9(List list, g2 g2Var, String str, int i, boolean z, int i2) {
        this.d = list;
        this.f = g2Var;
        this.a = str;
        this.e = i;
        this.b = z;
        this.c = i2;
    }
}
