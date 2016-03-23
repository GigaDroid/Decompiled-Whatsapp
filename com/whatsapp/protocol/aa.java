package com.whatsapp.protocol;

import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

class aa extends a {
    private static final String[] z;
    final Runnable a;
    final by b;
    final b5 c;

    static {
        String[] strArr = new String[11];
        String str = "w\u0001uw%w\u0015x{";
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
                        i3 = 22;
                        break;
                    case at.g /*1*/:
                        i3 = 119;
                        break;
                    case at.i /*2*/:
                        i3 = 20;
                        break;
                    case at.o /*3*/:
                        i3 = 30;
                        break;
                    default:
                        i3 = 73;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "e\u0002vt,u\u0003";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "b\u000ed{";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "q\u0005{k9";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "u\u0005q\u007f=\u007f\u0018z";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "q\u0005{k9e";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "e(`";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "u\u0005q\u007f=y\u0005";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u007f\u0013";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "e({";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "z\u0018w\u007f=\u007f\u0018z";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    aa(by byVar, Runnable runnable, b5 b5Var) {
        this.b = byVar;
        this.a = runnable;
        this.c = b5Var;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.whatsapp.protocol.cw r27, java.lang.String r28) {
        /*
        r26 = this;
        r16 = com.whatsapp.protocol.co.s;
        r17 = new java.util.Vector;
        r17.<init>();
        r2 = z;
        r3 = 6;
        r2 = r2[r3];
        r0 = r27;
        r2 = r0.f(r2);
        if (r2 == 0) goto L_0x00dc;
    L_0x0014:
        r3 = z;
        r4 = 4;
        r3 = r3[r4];
        r18 = r2.c(r3);
        r2 = 0;
        r15 = r2;
    L_0x001f:
        r2 = r18.size();
        if (r15 >= r2) goto L_0x00dc;
    L_0x0025:
        r0 = r18;
        r2 = r0.elementAt(r15);
        r2 = (com.whatsapp.protocol.cw) r2;
        r3 = z;
        r4 = 9;
        r3 = r3[r4];
        r3 = r2.b(r3);
        r0 = r26;
        r4 = r0.b;
        r3 = com.whatsapp.protocol.by.a(r4, r3);
        r4 = z;
        r5 = 8;
        r4 = r4[r5];
        r4 = r2.b(r4);
        r5 = z;
        r6 = 5;
        r5 = r5[r6];
        r14 = r2.b(r5);
        r5 = 0;
        r6 = java.lang.Long.parseLong(r14);	 Catch:{ NumberFormatException -> 0x00fb }
        r8 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r5 = r6 * r8;
    L_0x005c:
        r7 = z;
        r8 = 2;
        r7 = r7[r8];
        r7 = r2.b(r7);
        r8 = z;
        r9 = 7;
        r8 = r8[r9];
        r10 = r2.b(r8);
        r8 = 0;
        r8 = java.lang.Long.parseLong(r10);	 Catch:{ NumberFormatException -> 0x00fe }
        r10 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r8 = r8 * r10;
    L_0x0077:
        r10 = z;
        r11 = 10;
        r10 = r10[r11];
        r10 = r2.b(r10);
        r11 = z;
        r12 = 3;
        r11 = r11[r12];
        r11 = r2.b(r11);
        r12 = 0;
        r19 = z;
        r20 = 1;
        r19 = r19[r20];
        r0 = r19;
        r19 = r2.b(r0);
        if (r19 == 0) goto L_0x00b8;
    L_0x009a:
        r20 = z;	 Catch:{ NumberFormatException -> 0x00f7 }
        r21 = 0;
        r20 = r20[r21];	 Catch:{ NumberFormatException -> 0x00f7 }
        r19 = r19.equals(r20);	 Catch:{ NumberFormatException -> 0x00f7 }
        if (r19 == 0) goto L_0x00aa;
    L_0x00a6:
        r12 = -1;
        if (r16 == 0) goto L_0x00b8;
    L_0x00aa:
        r20 = 0;
        r22 = java.lang.Long.parseLong(r14);	 Catch:{ NumberFormatException -> 0x0101 }
        r24 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r22 = r22 * r24;
        r12 = java.lang.Math.max(r20, r22);	 Catch:{ NumberFormatException -> 0x0101 }
    L_0x00b8:
        r14 = new java.util.Hashtable;
        r14.<init>();
        r0 = r26;
        r0 = r0.b;
        r19 = r0;
        r0 = r19;
        com.whatsapp.protocol.by.a(r0, r2, r14);
        r0 = r26;
        r2 = r0.b;
        r2 = com.whatsapp.protocol.by.b(r2);
        r2.b(r3, r4, r5, r7, r8, r10, r11, r12, r14);
        r0 = r17;
        r0.addElement(r3);
        r2 = r15 + 1;
        if (r16 == 0) goto L_0x0103;
    L_0x00dc:
        r0 = r26;
        r2 = r0.b;	 Catch:{ NumberFormatException -> 0x00f9 }
        r2 = com.whatsapp.protocol.by.b(r2);	 Catch:{ NumberFormatException -> 0x00f9 }
        r0 = r17;
        r2.a(r0);	 Catch:{ NumberFormatException -> 0x00f9 }
        r0 = r26;
        r2 = r0.a;	 Catch:{ NumberFormatException -> 0x00f9 }
        if (r2 == 0) goto L_0x00f6;
    L_0x00ef:
        r0 = r26;
        r2 = r0.a;	 Catch:{ NumberFormatException -> 0x00f9 }
        r2.run();	 Catch:{ NumberFormatException -> 0x00f9 }
    L_0x00f6:
        return;
    L_0x00f7:
        r2 = move-exception;
        throw r2;
    L_0x00f9:
        r2 = move-exception;
        throw r2;
    L_0x00fb:
        r7 = move-exception;
        goto L_0x005c;
    L_0x00fe:
        r10 = move-exception;
        goto L_0x0077;
    L_0x0101:
        r14 = move-exception;
        goto L_0x00b8;
    L_0x0103:
        r15 = r2;
        goto L_0x001f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.protocol.aa.a(com.whatsapp.protocol.cw, java.lang.String):void");
    }

    public void a(int i) {
        try {
            if (this.c != null) {
                this.c.a(i);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }
}
