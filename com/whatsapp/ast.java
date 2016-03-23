package com.whatsapp;

import org.v;
import org.whispersystems.at;

class ast implements Runnable {
    private static final String[] z;
    final String a;
    final kd b;
    final String c;
    final String d;

    static {
        String[] strArr = new String[3];
        String str = "H\u0016h";
        Object obj = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i2 = 0; length > i2; i2++) {
                int i3;
                char c = cArr[i2];
                switch (i2 % 5) {
                    case v.m /*0*/:
                        i3 = 59;
                        break;
                    case at.g /*1*/:
                        i3 = 115;
                        break;
                    case at.i /*2*/:
                        i3 = 28;
                        break;
                    case at.o /*3*/:
                        i3 = 110;
                        break;
                    default:
                        i3 = arj.Theme_ratingBarStyle;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "{\u00002\u0019\u0002Z\u0007o\u000f\u001aK]r\u000b\u001e";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "L\u0016~";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r6 = this;
        r0 = com.whatsapp.DialogToastActivity.f;
        r1 = com.whatsapp.wn.q();
        if (r1 == 0) goto L_0x006b;
    L_0x0008:
        r1 = r6.b;
        com.whatsapp.kd.a(r1);
        r1 = r6.d;
        r1 = com.whatsapp.App.n(r1);
        if (r1 != 0) goto L_0x006b;
    L_0x0015:
        r1 = r6.c;
        r2 = z;
        r3 = 2;
        r2 = r2[r3];
        r1 = r1.endsWith(r2);
        if (r1 != 0) goto L_0x002a;
    L_0x0022:
        r1 = r6.c;
        r1 = com.whatsapp.qm.i(r1);
        if (r1 == 0) goto L_0x005f;
    L_0x002a:
        r1 = r6.b;
        com.whatsapp.kd.a(r1);
        r1 = com.whatsapp.App.as;
        r2 = r6.c;
        r1 = r1.f(r2);
        if (r1 == 0) goto L_0x0051;
    L_0x0039:
        r1 = r6.b;
        com.whatsapp.kd.a(r1);
        r1 = r6.c;
        r2 = new com.whatsapp.protocol.bb;
        r3 = r6.d;
        r4 = z;
        r5 = 0;
        r4 = r4[r5];
        r2.<init>(r3, r4);
        com.whatsapp.App.b(r1, r2);
        if (r0 == 0) goto L_0x005d;
    L_0x0051:
        r1 = r6.b;
        com.whatsapp.kd.a(r1);
        r1 = r6.d;
        r2 = 404; // 0x194 float:5.66E-43 double:1.996E-321;
        com.whatsapp.App.a(r1, r2);
    L_0x005d:
        if (r0 == 0) goto L_0x006b;
    L_0x005f:
        r0 = r6.b;
        com.whatsapp.kd.a(r0);
        r0 = r6.d;
        r1 = 400; // 0x190 float:5.6E-43 double:1.976E-321;
        com.whatsapp.App.a(r0, r1);
    L_0x006b:
        r0 = r6.b;
        com.whatsapp.kd.a(r0);
        r0 = r6.d;
        r1 = r6.a;
        r2 = z;
        r3 = 1;
        r2 = r2[r3];
        com.whatsapp.App.c(r0, r1, r2);
        com.whatsapp.wn.m();
        com.whatsapp.wn.p();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ast.run():void");
    }

    ast(kd kdVar, String str, String str2, String str3) {
        this.b = kdVar;
        this.d = str;
        this.c = str2;
        this.a = str3;
    }
}
