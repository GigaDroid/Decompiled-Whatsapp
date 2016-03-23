package com.whatsapp;

import android.os.Handler;
import android.os.Looper;
import com.whatsapp.messaging.co;
import java.util.HashMap;

final class aog extends Handler {
    private final HashMap a;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(java.lang.String r12, boolean r13, int r14) {
        /*
        r11 = this;
        r1 = 1;
        r10 = 2;
        r2 = 0;
        r0 = r11.hasMessages(r1, r12);
        if (r0 != 0) goto L_0x0089;
    L_0x0009:
        r0 = 4;
        r0 = r11.hasMessages(r0, r12);
        if (r0 != 0) goto L_0x0089;
    L_0x0010:
        r11.removeMessages(r2, r12);
        r0 = r11.hasMessages(r10, r12);
        if (r0 != 0) goto L_0x0044;
    L_0x0019:
        r0 = 5;
        r0 = r11.hasMessages(r0, r12);
        if (r0 != 0) goto L_0x0044;
    L_0x0020:
        r0 = com.whatsapp.App.N();
        if (r0 == 0) goto L_0x007a;
    L_0x0026:
        if (r13 == 0) goto L_0x0033;
    L_0x0028:
        r0 = com.whatsapp.App.aF();
        r3 = com.whatsapp.messaging.co.d(r12, r14);
        r0.b(r3);
    L_0x0033:
        r0 = r11.a;
        r4 = java.lang.System.currentTimeMillis();
        r3 = java.lang.Long.valueOf(r4);
        r0.put(r12, r3);
        r0 = com.whatsapp.DialogToastActivity.f;
        if (r0 == 0) goto L_0x007a;
    L_0x0044:
        r0 = r11.a;
        r0 = r0.get(r12);
        r0 = (java.lang.Long) r0;
        r4 = java.lang.System.currentTimeMillis();
        if (r0 == 0) goto L_0x007a;
    L_0x0052:
        r6 = r0.longValue();
        r6 = r4 - r6;
        r8 = 10000; // 0x2710 float:1.4013E-41 double:4.9407E-320;
        r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r0 <= 0) goto L_0x007a;
    L_0x005e:
        r0 = com.whatsapp.App.N();
        if (r0 == 0) goto L_0x007a;
    L_0x0064:
        if (r13 == 0) goto L_0x0071;
    L_0x0066:
        r0 = com.whatsapp.App.aF();
        r3 = com.whatsapp.messaging.co.d(r12, r14);
        r0.b(r3);
    L_0x0071:
        r0 = r11.a;
        r3 = java.lang.Long.valueOf(r4);
        r0.put(r12, r3);
    L_0x007a:
        r11.removeMessages(r10, r12);
        if (r13 == 0) goto L_0x008a;
    L_0x007f:
        r0 = r1;
    L_0x0080:
        r0 = r11.obtainMessage(r10, r0, r2, r12);
        r2 = 2500; // 0x9c4 float:3.503E-42 double:1.235E-320;
        r11.sendMessageDelayed(r0, r2);
    L_0x0089:
        return;
    L_0x008a:
        r0 = r2;
        goto L_0x0080;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.aog.b(java.lang.String, boolean, int):void");
    }

    private void a(String str, boolean z, int i) {
        int i2 = 1;
        if (!hasMessages(1, str) && !hasMessages(4, str)) {
            if (!hasMessages(2, str) && App.N() && z) {
                App.aF().b(co.d(str, i));
            }
            if (!z) {
                i2 = 0;
            }
            sendMessageDelayed(obtainMessage(5, i2, 0, str), 30000);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMessage(android.os.Message r7) {
        /*
        r6 = this;
        r3 = 0;
        r2 = 1;
        r4 = com.whatsapp.DialogToastActivity.f;
        r0 = r7.what;
        switch(r0) {
            case 0: goto L_0x000a;
            case 1: goto L_0x002a;
            case 2: goto L_0x002a;
            case 3: goto L_0x001a;
            case 4: goto L_0x0038;
            case 5: goto L_0x0046;
            default: goto L_0x0009;
        };
    L_0x0009:
        return;
    L_0x000a:
        r0 = r7.obj;
        r0 = (java.lang.String) r0;
        r1 = r7.arg1;
        if (r1 != r2) goto L_0x0053;
    L_0x0012:
        r1 = r2;
    L_0x0013:
        r5 = r7.arg2;
        r6.b(r0, r1, r5);
        if (r4 == 0) goto L_0x0009;
    L_0x001a:
        r0 = r7.obj;
        r0 = (java.lang.String) r0;
        r1 = r7.arg1;
        if (r1 != r2) goto L_0x0055;
    L_0x0022:
        r1 = r2;
    L_0x0023:
        r5 = r7.arg2;
        r6.a(r0, r1, r5);
        if (r4 == 0) goto L_0x0009;
    L_0x002a:
        r0 = r7.obj;
        r0 = (java.lang.String) r0;
        r1 = r7.arg1;
        if (r1 != r2) goto L_0x0057;
    L_0x0032:
        r1 = r2;
    L_0x0033:
        r6.a(r0, r1);
        if (r4 == 0) goto L_0x0009;
    L_0x0038:
        r0 = r7.obj;
        r0 = (java.lang.String) r0;
        r1 = r7.arg1;
        if (r1 != r2) goto L_0x0059;
    L_0x0040:
        r1 = r2;
    L_0x0041:
        r6.a(r0, r1, r3);
        if (r4 == 0) goto L_0x0009;
    L_0x0046:
        r0 = r7.obj;
        r0 = (java.lang.String) r0;
        r1 = r7.arg1;
        if (r1 != r2) goto L_0x004f;
    L_0x004e:
        r3 = r2;
    L_0x004f:
        r6.a(r0, r3, r2);
        goto L_0x0009;
    L_0x0053:
        r1 = r3;
        goto L_0x0013;
    L_0x0055:
        r1 = r3;
        goto L_0x0023;
    L_0x0057:
        r1 = r3;
        goto L_0x0033;
    L_0x0059:
        r1 = r3;
        goto L_0x0041;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.aog.handleMessage(android.os.Message):void");
    }

    private void a(String str, boolean z) {
        if (!hasMessages(0, str) && !hasMessages(3, str)) {
            if (!hasMessages(5, str) && App.N() && z) {
                App.aF().b(co.c(str));
            }
            removeMessages(1, str);
            removeMessages(2, str);
        }
    }

    private void a(String str, boolean z, boolean z2) {
        if (!hasMessages(0, str) && !hasMessages(3, str)) {
            if (!hasMessages(2, str) && App.N() && z && (z2 || hasMessages(5, str))) {
                App.aF().b(co.c(str));
            }
            removeMessages(4, str);
            removeMessages(5, str);
        }
    }

    aog(Looper looper) {
        super(looper);
        this.a = new HashMap();
    }
}
