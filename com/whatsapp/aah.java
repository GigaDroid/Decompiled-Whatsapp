package com.whatsapp;

import android.os.Handler;
import android.os.Looper;

class aah extends Handler {
    final ael a;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMessage(android.os.Message r6) {
        /*
        r5 = this;
        r1 = com.whatsapp.l5.s;
        r0 = r6.what;
        switch(r0) {
            case 1: goto L_0x0008;
            case 2: goto L_0x0017;
            case 3: goto L_0x0007;
            case 4: goto L_0x0007;
            case 5: goto L_0x0007;
            case 6: goto L_0x0007;
            case 7: goto L_0x0007;
            case 8: goto L_0x002f;
            case 9: goto L_0x005e;
            default: goto L_0x0007;
        };
    L_0x0007:
        return;
    L_0x0008:
        r0 = r6.obj;
        r0 = (java.lang.String) r0;
        r2 = r5.a;
        r2 = com.whatsapp.ael.e(r2);
        r2.b(r0);
        if (r1 == 0) goto L_0x0007;
    L_0x0017:
        r0 = r6.obj;
        r0 = (java.lang.String) r0;
        r2 = r5.a;
        r2 = com.whatsapp.ael.f(r2);
        r2.a(r0);
        r2 = r5.a;
        r2 = com.whatsapp.ael.e(r2);
        r2.b(r0);
        if (r1 == 0) goto L_0x0007;
    L_0x002f:
        r0 = r5.a;
        r0 = com.whatsapp.ael.c(r0);
        r2 = r0.keys();
    L_0x0039:
        r0 = r2.hasMoreElements();
        if (r0 == 0) goto L_0x0007;
    L_0x003f:
        r0 = r2.nextElement();
        r0 = (java.lang.String) r0;
        r3 = r5.a;
        r3 = com.whatsapp.ael.c(r3);
        r4 = new com.whatsapp.a5w;
        r4.<init>();
        r3.put(r0, r4);
        r3 = r5.a;
        r3 = com.whatsapp.ael.e(r3);
        r3.b(r0);
        if (r1 == 0) goto L_0x0039;
    L_0x005e:
        r0 = new java.util.HashSet;
        r2 = r5.a;
        r2 = com.whatsapp.ael.c(r2);
        r2 = r2.keySet();
        r0.<init>(r2);
        r2 = r0.iterator();
    L_0x0071:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x0007;
    L_0x0077:
        r0 = r2.next();
        r0 = (java.lang.String) r0;
        r3 = "-";
        r3 = r0.contains(r3);
        if (r3 != 0) goto L_0x009a;
    L_0x0086:
        r3 = r5.a;
        r3 = com.whatsapp.ael.c(r3);
        r3.remove(r0);
        r3 = r5.a;
        r3 = com.whatsapp.ael.e(r3);
        r3.c(r0);
        if (r1 == 0) goto L_0x00b1;
    L_0x009a:
        r3 = r5.a;
        r3 = com.whatsapp.ael.c(r3);
        r4 = new com.whatsapp.a5w;
        r4.<init>();
        r3.put(r0, r4);
        r3 = r5.a;
        r3 = com.whatsapp.ael.e(r3);
        r3.b(r0);
    L_0x00b1:
        if (r1 == 0) goto L_0x0071;
    L_0x00b3:
        goto L_0x0007;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.aah.handleMessage(android.os.Message):void");
    }

    aah(ael com_whatsapp_ael, Looper looper) {
        this.a = com_whatsapp_ael;
        super(looper);
    }
}
