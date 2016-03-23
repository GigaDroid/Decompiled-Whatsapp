package com.whatsapp.protocol;

import org.v;
import org.whispersystems.Y;
import org.whispersystems.at;

class az extends a {
    private static final String[] z;
    final by a;

    static {
        String[] strArr = new String[8];
        String str = "4ma7\t8m";
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
                        i3 = 87;
                        break;
                    case at.g /*1*/:
                        i3 = 31;
                        break;
                    case at.i /*2*/:
                        i3 = 4;
                        break;
                    case at.o /*3*/:
                        i3 = 86;
                        break;
                    default:
                        i3 = 125;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "$@p";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "6ie?\u00116}h3";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "$@k";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "#ft3";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "$jf<\u00184k";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = ";pg7\t>pj";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "4ma7\t>pj";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    az(by byVar) {
        this.a = byVar;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.whatsapp.protocol.cw r21, java.lang.String r22) {
        /*
        r20 = this;
        r2 = 0;
        r0 = r21;
        r2 = r0.a(r2);
        r2 = com.whatsapp.protocol.cw.a(r2);
        r3 = z;
        r4 = 0;
        r3 = r3[r4];
        r4 = r2.b(r3);
        r3 = z;
        r5 = 1;
        r3 = r3[r5];
        r3 = r2.b(r3);
        r5 = 0;
        r6 = java.lang.Long.parseLong(r3);	 Catch:{ NumberFormatException -> 0x009d }
        r8 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r5 = r6 * r8;
    L_0x0027:
        r7 = z;
        r8 = 6;
        r7 = r7[r8];
        r7 = r2.b(r7);
        r8 = z;
        r9 = 2;
        r8 = r8[r9];
        r10 = r2.b(r8);
        r8 = 0;
        r8 = java.lang.Long.parseLong(r10);	 Catch:{ NumberFormatException -> 0x009f }
        r10 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r8 = r8 * r10;
    L_0x0042:
        r10 = z;
        r11 = 4;
        r10 = r10[r11];
        r10 = r2.b(r10);
        r11 = z;
        r12 = 5;
        r11 = r11[r12];
        r11 = r2.b(r11);
        r12 = z;
        r13 = 7;
        r12 = r12[r13];
        r14 = r2.b(r12);
        r12 = 0;
        if (r14 == 0) goto L_0x0081;
    L_0x0061:
        r15 = z;	 Catch:{ NumberFormatException -> 0x009b }
        r16 = 3;
        r15 = r15[r16];	 Catch:{ NumberFormatException -> 0x009b }
        r14 = r14.equals(r15);	 Catch:{ NumberFormatException -> 0x009b }
        if (r14 == 0) goto L_0x0073;
    L_0x006d:
        r12 = -1;
        r14 = com.whatsapp.protocol.co.s;
        if (r14 == 0) goto L_0x0081;
    L_0x0073:
        r14 = 0;
        r16 = java.lang.Long.parseLong(r3);	 Catch:{ NumberFormatException -> 0x00a1 }
        r18 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r16 = r16 * r18;
        r12 = java.lang.Math.max(r14, r16);	 Catch:{ NumberFormatException -> 0x00a1 }
    L_0x0081:
        r14 = new java.util.Hashtable;
        r14.<init>();
        r0 = r20;
        r3 = r0.a;
        com.whatsapp.protocol.by.a(r3, r2, r14);
        r0 = r20;
        r2 = r0.a;
        r2 = com.whatsapp.protocol.by.b(r2);
        r3 = r22;
        r2.a(r3, r4, r5, r7, r8, r10, r11, r12, r14);
        return;
    L_0x009b:
        r2 = move-exception;
        throw r2;
    L_0x009d:
        r7 = move-exception;
        goto L_0x0027;
    L_0x009f:
        r10 = move-exception;
        goto L_0x0042;
    L_0x00a1:
        r3 = move-exception;
        goto L_0x0081;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.protocol.az.a(com.whatsapp.protocol.cw, java.lang.String):void");
    }
}
