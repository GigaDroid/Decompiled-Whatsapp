package com.whatsapp;

import com.whatsapp.protocol.c2;
import org.v;
import org.whispersystems.at;

class j9 implements Runnable {
    private static final String z;
    final String a;
    final String b;
    final int c;
    final kd d;
    final c2 e;

    static {
        char[] toCharArray = "[g\u001b".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 44;
                    break;
                case at.g /*1*/:
                    i2 = 2;
                    break;
                case at.i /*2*/:
                    i2 = 121;
                    break;
                case at.o /*3*/:
                    i2 = arj.Theme_spinnerStyle;
                    break;
                default:
                    i2 = 67;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r3 = this;
        r0 = r3.d;
        com.whatsapp.kd.a(r0);
        r0 = r3.e;
        r0 = r0.n;
        r0 = com.whatsapp.App.E(r0);
        if (r0 == 0) goto L_0x001f;
    L_0x000f:
        r1 = r3.d;
        com.whatsapp.kd.a(r1);
        r1 = r3.a;
        r2 = r3.c;
        com.whatsapp.App.a(r1, r0, r2);
        r0 = com.whatsapp.DialogToastActivity.f;
        if (r0 == 0) goto L_0x002b;
    L_0x001f:
        r0 = r3.d;
        com.whatsapp.kd.a(r0);
        r0 = r3.a;
        r1 = 404; // 0x194 float:5.66E-43 double:1.996E-321;
        com.whatsapp.App.a(r0, r1);
    L_0x002b:
        r0 = r3.d;
        com.whatsapp.kd.a(r0);
        r0 = r3.a;
        r1 = r3.b;
        r2 = z;
        com.whatsapp.App.c(r0, r1, r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.j9.run():void");
    }

    j9(kd kdVar, c2 c2Var, String str, int i, String str2) {
        this.d = kdVar;
        this.e = c2Var;
        this.a = str;
        this.c = i;
        this.b = str2;
    }
}
