package com.whatsapp;

import java.util.concurrent.Callable;
import org.v;
import org.whispersystems.at;
import org.whispersystems.i;
import org.whispersystems.j;

final class h8 implements Callable {
    private static final String[] z;
    final awc a;
    final byte[] b;
    final i c;
    final j d;

    static {
        String[] strArr = new String[2];
        String str = "(u\u00041'5iM-,fmM6*f";
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
                        i3 = 70;
                        break;
                    case at.g /*1*/:
                        i3 = 26;
                        break;
                    case at.i /*2*/:
                        i3 = 36;
                        break;
                    case at.o /*3*/:
                        i3 = 66;
                        break;
                    default:
                        i3 = 66;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "3tA:2#yP'&fn]2'f~Q0+(}\u0004!#*v\u0004',%h]26/uJyb2cT'\u007f";
                    obj = null;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.whatsapp.protocol.b1 a() {
        /*
        r5 = this;
        r1 = 1;
        r0 = 0;
        r2 = com.whatsapp.DialogToastActivity.f;
        r3 = r5.a;
        r4 = r5.d;
        r3 = r3.b(r4);
        if (r3 != 0) goto L_0x002b;
    L_0x000e:
        r1 = new org.whispersystems.bX;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r0 = r3[r0];
        r0 = r2.append(r0);
        r2 = r5.d;
        r0 = r0.append(r2);
        r0 = r0.toString();
        r1.<init>(r0);
        throw r1;
    L_0x002b:
        r3 = r5.c;
        r4 = r5.b;
        r3 = r3.a(r4);
        r4 = r3.a();
        switch(r4) {
            case 2: goto L_0x0059;
            case 3: goto L_0x005b;
            default: goto L_0x003a;
        };
    L_0x003a:
        r0 = new java.lang.AssertionError;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r4 = z;
        r1 = r4[r1];
        r1 = r2.append(r1);
        r2 = r3.a();
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0059:
        if (r2 == 0) goto L_0x005e;
    L_0x005b:
        if (r2 != 0) goto L_0x003a;
    L_0x005d:
        r0 = r1;
    L_0x005e:
        r1 = new com.whatsapp.protocol.b1;
        r2 = 2;
        r3 = r3.b();
        r1.<init>(r2, r0, r3);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.h8.a():com.whatsapp.protocol.b1");
    }

    public Object call() {
        return a();
    }

    h8(awc com_whatsapp_awc, j jVar, i iVar, byte[] bArr) {
        this.a = com_whatsapp_awc;
        this.d = jVar;
        this.c = iVar;
        this.b = bArr;
    }
}
