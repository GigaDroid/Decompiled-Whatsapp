package com.whatsapp;

import com.whatsapp.protocol.c2;
import org.v;
import org.whispersystems.at;

class en implements Runnable {
    private static final String z;
    final String a;
    final String b;
    final kd c;
    final c2 d;

    static {
        char[] toCharArray = "$T\u0012".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 83;
                    break;
                case at.g /*1*/:
                    i2 = 49;
                    break;
                case at.i /*2*/:
                    i2 = 112;
                    break;
                case at.o /*3*/:
                    i2 = 95;
                    break;
                default:
                    i2 = 123;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    en(kd kdVar, c2 c2Var, String str, String str2) {
        this.c = kdVar;
        this.d = c2Var;
        this.b = str;
        this.a = str2;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r5 = this;
        r1 = 0;
        r0 = r5.d;
        r0 = r0.a;
        if (r0 == 0) goto L_0x0061;
    L_0x0007:
        r0 = new com.whatsapp.protocol.c3;
        r2 = r5.d;
        r2 = r2.n;
        r3 = r5.d;
        r3 = r3.o;
        r4 = r5.d;
        r4 = r4.a;
        r0.<init>(r2, r3, r4);
    L_0x0018:
        r2 = r5.d;
        r2 = r2.l;
        if (r2 == 0) goto L_0x0063;
    L_0x001e:
        if (r0 == 0) goto L_0x0044;
    L_0x0020:
        r2 = r5.c;
        com.whatsapp.kd.a(r2);
        r2 = com.whatsapp.App.aK;
        r2 = r2.a(r0);
        if (r2 == 0) goto L_0x0044;
    L_0x002d:
        r1 = r5.c;
        com.whatsapp.kd.a(r1);
        r1 = com.whatsapp.App.aK;
        r2 = r5.d;
        r2 = r2.n;
        r3 = r5.d;
        r3 = r3.r;
        r3 = java.lang.Integer.valueOf(r3);
        r1 = r1.a(r2, r0, r3);
    L_0x0044:
        if (r1 == 0) goto L_0x0050;
    L_0x0046:
        r0 = r5.b;
        r2 = 4;
        com.whatsapp.App.b(r0, r1, r2);
        r0 = com.whatsapp.DialogToastActivity.f;
        if (r0 == 0) goto L_0x0057;
    L_0x0050:
        r0 = r5.b;
        r1 = 404; // 0x194 float:5.66E-43 double:1.996E-321;
        com.whatsapp.App.a(r0, r1);
    L_0x0057:
        r0 = r5.b;
        r1 = r5.a;
        r2 = z;
        com.whatsapp.App.c(r0, r1, r2);
        return;
    L_0x0061:
        r0 = r1;
        goto L_0x0018;
    L_0x0063:
        if (r0 == 0) goto L_0x0070;
    L_0x0065:
        r1 = com.whatsapp.App.aK;
        r2 = r5.d;
        r2 = r2.r;
        r1 = r1.a(r0, r2);
        goto L_0x0044;
    L_0x0070:
        r0 = com.whatsapp.App.aK;
        r1 = r5.d;
        r1 = r1.n;
        r0 = r0.m(r1);
        if (r0 == 0) goto L_0x008e;
    L_0x007c:
        r1 = r0.k;
        r2 = com.whatsapp.App.aK;
        r3 = r5.d;
        r3 = r3.r;
        r1 = r2.a(r1, r3);
        if (r1 == 0) goto L_0x0044;
    L_0x008a:
        r1.add(r0);
        goto L_0x0044;
    L_0x008e:
        r1 = new java.util.ArrayList;
        r1.<init>();
        goto L_0x0044;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.en.run():void");
    }
}
