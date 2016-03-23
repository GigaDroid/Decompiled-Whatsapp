package com.whatsapp.protocol;

import com.whatsapp.arj;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.at;

class l extends a {
    private static final String[] z;
    final b9 a;
    final by b;

    static {
        String[] strArr = new String[8];
        String str = "\u001bME\u0016";
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
                        i3 = 120;
                        break;
                    case at.g /*1*/:
                        i3 = 34;
                        break;
                    case at.i /*2*/:
                        i3 = 33;
                        break;
                    case at.o /*3*/:
                        i3 = 115;
                        break;
                    default:
                        i3 = arj.Theme_editTextStyle;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u000bV@\u0007\u001d\u000b";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\f[Q\u0016";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "\rQD\u0001";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "L\u0012\u0015";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "L\u0012\u0012";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "L\u0012\u0010";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u001eCH\u001f";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void a(int i) {
        this.a.a(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.whatsapp.protocol.cw r10, java.lang.String r11) {
        /*
        r9 = this;
        r0 = 0;
        r5 = 1;
        r8 = 0;
        r2 = com.whatsapp.protocol.co.s;
        r3 = z;
        r4 = 2;
        r3 = r3[r4];
        r3 = r10.f(r3);
        if (r3 == 0) goto L_0x008a;
    L_0x0011:
        r4 = r3.d;	 Catch:{ NumberFormatException -> 0x0090 }
        if (r4 == 0) goto L_0x008a;
    L_0x0015:
        r4 = r3.d;	 Catch:{ NumberFormatException -> 0x0092 }
        r4 = r4.length;	 Catch:{ NumberFormatException -> 0x0092 }
        if (r4 != r5) goto L_0x008a;
    L_0x001a:
        r3 = r3.d;
        r3 = r3[r8];
        r4 = z;
        r5 = 4;
        r4 = r4[r5];
        com.whatsapp.protocol.cw.a(r3, r4);
        r4 = "t";
        r4 = r3.b(r4);
        r6 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        if (r4 != 0) goto L_0x0094;
    L_0x0031:
        r0 = r0 * r6;
    L_0x0032:
        r4 = z;
        r4 = r4[r8];
        r4 = r3.b(r4);
        r5 = z;
        r6 = 3;
        r5 = r5[r6];
        r5 = r3.b(r5);
        r3 = r3.a();
        if (r5 == 0) goto L_0x0083;
    L_0x0049:
        r6 = z;	 Catch:{ NumberFormatException -> 0x0099 }
        r7 = 1;
        r6 = r6[r7];	 Catch:{ NumberFormatException -> 0x0099 }
        r5 = r5.equals(r6);	 Catch:{ NumberFormatException -> 0x0099 }
        if (r5 == 0) goto L_0x0083;
    L_0x0054:
        r5 = z;	 Catch:{ NumberFormatException -> 0x009b }
        r6 = 7;
        r5 = r5[r6];	 Catch:{ NumberFormatException -> 0x009b }
        r5 = r5.equals(r4);	 Catch:{ NumberFormatException -> 0x009b }
        if (r5 != 0) goto L_0x0075;
    L_0x005f:
        r5 = z;	 Catch:{ NumberFormatException -> 0x009d }
        r6 = 6;
        r5 = r5[r6];	 Catch:{ NumberFormatException -> 0x009d }
        r5 = r5.equals(r4);	 Catch:{ NumberFormatException -> 0x009d }
        if (r5 != 0) goto L_0x0075;
    L_0x006a:
        r5 = z;	 Catch:{ NumberFormatException -> 0x009f }
        r6 = 5;
        r5 = r5[r6];	 Catch:{ NumberFormatException -> 0x009f }
        r4 = r5.equals(r4);	 Catch:{ NumberFormatException -> 0x009f }
        if (r4 == 0) goto L_0x007c;
    L_0x0075:
        r4 = r9.a;	 Catch:{ NumberFormatException -> 0x00a1 }
        r4.b();	 Catch:{ NumberFormatException -> 0x00a1 }
        if (r2 == 0) goto L_0x0088;
    L_0x007c:
        r4 = r9.a;	 Catch:{ NumberFormatException -> 0x00a3 }
        r4.a();	 Catch:{ NumberFormatException -> 0x00a3 }
        if (r2 == 0) goto L_0x0088;
    L_0x0083:
        r4 = r9.a;	 Catch:{ NumberFormatException -> 0x00a3 }
        r4.a(r0, r3);	 Catch:{ NumberFormatException -> 0x00a3 }
    L_0x0088:
        if (r2 == 0) goto L_0x008f;
    L_0x008a:
        r0 = r9.a;	 Catch:{ NumberFormatException -> 0x00a5 }
        r0.a();	 Catch:{ NumberFormatException -> 0x00a5 }
    L_0x008f:
        return;
    L_0x0090:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0092 }
    L_0x0092:
        r0 = move-exception;
        throw r0;
    L_0x0094:
        r0 = java.lang.Long.parseLong(r4);	 Catch:{ NumberFormatException -> 0x00a7 }
        goto L_0x0031;
    L_0x0099:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x009b }
    L_0x009b:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x009d }
    L_0x009d:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x009f }
    L_0x009f:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00a1 }
    L_0x00a1:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00a3 }
    L_0x00a3:
        r0 = move-exception;
        throw r0;
    L_0x00a5:
        r0 = move-exception;
        throw r0;
    L_0x00a7:
        r4 = move-exception;
        goto L_0x0032;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.protocol.l.a(com.whatsapp.protocol.cw, java.lang.String):void");
    }

    l(by byVar, b9 b9Var) {
        this.b = byVar;
        this.a = b9Var;
    }
}
