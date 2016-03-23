package com.whatsapp;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;

@SuppressLint({"HandlerLeak"})
final class mq extends Handler {
    final ael a;

    mq(ael com_whatsapp_ael, Looper looper, aa aaVar) {
        this(com_whatsapp_ael, looper);
    }

    private mq(@NonNull ael com_whatsapp_ael, Looper looper) {
        this.a = com_whatsapp_ael;
        super((Looper) auv.a((Object) looper));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMessage(android.os.Message r10) {
        /*
        r9 = this;
        r3 = 0;
        r8 = 2;
        r4 = 1;
        r5 = com.whatsapp.l5.s;
        r0 = r10.what;
        switch(r0) {
            case 1: goto L_0x000e;
            case 2: goto L_0x0026;
            case 3: goto L_0x001b;
            case 4: goto L_0x000a;
            case 5: goto L_0x0067;
            case 6: goto L_0x00b7;
            case 7: goto L_0x000a;
            case 8: goto L_0x000a;
            case 9: goto L_0x000a;
            case 10: goto L_0x00df;
            case 11: goto L_0x0047;
            case 12: goto L_0x00f0;
            case 13: goto L_0x008f;
            default: goto L_0x000a;
        };
    L_0x000a:
        super.handleMessage(r10);
    L_0x000d:
        return;
    L_0x000e:
        r1 = r9.a;
        r2 = r10.arg1;
        r0 = r10.obj;
        r0 = (com.whatsapp.protocol.co) r0;
        com.whatsapp.ael.a(r1, r2, r0);
        if (r5 == 0) goto L_0x000d;
    L_0x001b:
        r1 = r9.a;
        r0 = r10.obj;
        r0 = (com.whatsapp.protocol.co) r0;
        r1.g(r0);
        if (r5 == 0) goto L_0x000d;
    L_0x0026:
        r0 = r10.obj;
        r0 = (com.whatsapp.protocol.co) r0;
        r1 = r9.a;
        r2 = r10.arg1;
        r1 = com.whatsapp.ael.a(r1, r0, r2);
        if (r1 == 0) goto L_0x000d;
    L_0x0034:
        r1 = r9.a;
        r1 = com.whatsapp.ael.a(r1);
        r2 = r10.arg1;
        r6 = r10.arg2;
        r0 = android.os.Message.obtain(r1, r8, r2, r6, r0);
        r0.sendToTarget();
        if (r5 == 0) goto L_0x000d;
    L_0x0047:
        r0 = r10.obj;
        r0 = (com.whatsapp.protocol.co) r0;
        r1 = r9.a;
        r1 = com.whatsapp.ael.a(r1, r0);
        r2 = r9.a;
        r6 = com.whatsapp.ael.a(r2);
        r7 = 10;
        if (r1 != 0) goto L_0x0102;
    L_0x005b:
        r2 = r3;
    L_0x005c:
        if (r1 != 0) goto L_0x0105;
    L_0x005e:
        r0 = android.os.Message.obtain(r6, r7, r2, r3, r0);
        r0.sendToTarget();
        if (r5 == 0) goto L_0x000d;
    L_0x0067:
        r0 = r10.obj;
        r0 = (java.lang.String) r0;
        r1 = r9.a;
        r1 = com.whatsapp.ael.g(r1);
        r1 = android.os.Message.obtain(r1, r4, r0);
        r1.sendToTarget();
        r1 = r9.a;
        r1 = com.whatsapp.ael.a(r1, r0);
        if (r1 == 0) goto L_0x000d;
    L_0x0080:
        r1 = r9.a;
        r1 = com.whatsapp.ael.g(r1);
        r0 = android.os.Message.obtain(r1, r8, r0);
        r0.sendToTarget();
        if (r5 == 0) goto L_0x000d;
    L_0x008f:
        r0 = r10.obj;
        r0 = (java.lang.String) r0;
        r1 = r9.a;
        r1 = com.whatsapp.ael.g(r1);
        r1 = android.os.Message.obtain(r1, r4, r0);
        r1.sendToTarget();
        r1 = r9.a;
        r1 = com.whatsapp.ael.c(r1, r0);
        if (r1 == 0) goto L_0x000d;
    L_0x00a8:
        r1 = r9.a;
        r1 = com.whatsapp.ael.g(r1);
        r0 = android.os.Message.obtain(r1, r8, r0);
        r0.sendToTarget();
        if (r5 == 0) goto L_0x000d;
    L_0x00b7:
        r0 = r10.obj;
        r0 = (java.lang.String) r0;
        r1 = r9.a;
        r1 = com.whatsapp.ael.g(r1);
        r1 = android.os.Message.obtain(r1, r4, r0);
        r1.sendToTarget();
        r1 = r9.a;
        r1 = com.whatsapp.ael.b(r1, r0);
        if (r1 == 0) goto L_0x000d;
    L_0x00d0:
        r1 = r9.a;
        r1 = com.whatsapp.ael.g(r1);
        r0 = android.os.Message.obtain(r1, r8, r0);
        r0.sendToTarget();
        if (r5 == 0) goto L_0x000d;
    L_0x00df:
        r0 = r10.obj;
        r0 = (com.whatsapp.e4) r0;
        r1 = r9.a;
        r2 = r0.b;
        r3 = r0.a;
        r0 = r0.c;
        com.whatsapp.ael.a(r1, r2, r3, r0);
        if (r5 == 0) goto L_0x000d;
    L_0x00f0:
        r0 = r9.a;
        r0 = com.whatsapp.ael.d(r0);
        r1 = 7;
        r0 = android.os.Message.obtain(r0, r1);
        r0.sendToTarget();
        if (r5 == 0) goto L_0x000d;
    L_0x0100:
        goto L_0x000a;
    L_0x0102:
        r2 = r4;
        goto L_0x005c;
    L_0x0105:
        r0 = r1;
        goto L_0x005e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mq.handleMessage(android.os.Message):void");
    }
}
