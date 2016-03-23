package com.whatsapp;

import org.v;
import org.whispersystems.at;

class a29 implements Runnable {
    private static final String z;
    final String a;
    final kd b;
    final String c;

    static {
        char[] toCharArray = "\u0010\rD".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_checkedTextViewStyle;
                    break;
                case at.g /*1*/:
                    i2 = arj.Theme_editTextStyle;
                    break;
                case at.i /*2*/:
                    i2 = 38;
                    break;
                case at.o /*3*/:
                    i2 = 22;
                    break;
                default:
                    i2 = 126;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    a29(kd kdVar, String str, String str2) {
        this.b = kdVar;
        this.a = str;
        this.c = str2;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r3 = this;
        r0 = r3.b;
        com.whatsapp.kd.a(r0);
        r0 = com.whatsapp.App.aK;
        r0 = r0.f();
        if (r0 == 0) goto L_0x001d;
    L_0x000d:
        r1 = r3.b;
        com.whatsapp.kd.a(r1);
        r1 = r3.a;
        r2 = 20;
        com.whatsapp.App.b(r1, r0, r2);
        r0 = com.whatsapp.DialogToastActivity.f;
        if (r0 == 0) goto L_0x0029;
    L_0x001d:
        r0 = r3.b;
        com.whatsapp.kd.a(r0);
        r0 = r3.a;
        r1 = 404; // 0x194 float:5.66E-43 double:1.996E-321;
        com.whatsapp.App.a(r0, r1);
    L_0x0029:
        r0 = r3.b;
        com.whatsapp.kd.a(r0);
        r0 = r3.a;
        r1 = r3.c;
        r2 = z;
        com.whatsapp.App.c(r0, r1, r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a29.run():void");
    }
}
