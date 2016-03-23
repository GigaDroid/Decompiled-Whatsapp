package com.whatsapp.protocol;

import java.util.Hashtable;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

class m extends a {
    private static final String[] z;
    final Hashtable a;
    final by b;

    static {
        String[] strArr = new String[9];
        String str = ")e\u0010";
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
                        i3 = 29;
                        break;
                    case at.g /*1*/:
                        i3 = 85;
                        break;
                    case at.i /*2*/:
                        i3 = 33;
                        break;
                    case at.o /*3*/:
                        i3 = 126;
                        break;
                    default:
                        i3 = 16;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "i,Q\u001b";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = ")e\u0015";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "{4H\u0012";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "~:E\u001b";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "h&D\f";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = ")e\u0012";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "n!@\nen";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "w<E";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    m(by byVar, Hashtable hashtable) {
        this.b = byVar;
        this.a = hashtable;
    }

    public void a(int i) {
        by.d(this.b).a(new Integer(i));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.whatsapp.protocol.cw r14, java.lang.String r15) {
        /*
        r13 = this;
        r4 = 0;
        r0 = 0;
        r1 = com.whatsapp.protocol.co.s;
        r2 = z;
        r3 = 8;
        r2 = r2[r3];
        r6 = r14.f(r2);
        if (r6 == 0) goto L_0x00a8;
    L_0x0011:
        r2 = r6.d;	 Catch:{ NumberFormatException -> 0x00d0 }
        if (r2 == 0) goto L_0x00a8;
    L_0x0015:
        r2 = r6.d;
        r2 = r2.length;
        if (r0 >= r2) goto L_0x00a8;
    L_0x001a:
        r2 = r6.d;
        r7 = r2[r0];
        r2 = z;
        r3 = 6;
        r2 = r2[r3];
        com.whatsapp.protocol.cw.a(r7, r2);
        r2 = z;
        r3 = 1;
        r2 = r2[r3];
        r8 = r7.b(r2);
        r2 = "t";
        r2 = r7.b(r2);
        r10 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        if (r2 != 0) goto L_0x00d2;
    L_0x003a:
        r2 = r4;
    L_0x003b:
        r2 = r2 * r10;
    L_0x003c:
        r9 = z;
        r10 = 5;
        r9 = r9[r10];
        r9 = r7.b(r9);
        r10 = z;
        r11 = 2;
        r10 = r10[r11];
        r10 = r7.b(r10);
        r7 = r7.a();
        r11 = r13.a;	 Catch:{ NumberFormatException -> 0x00dc }
        r11.remove(r8);	 Catch:{ NumberFormatException -> 0x00dc }
        if (r10 == 0) goto L_0x009b;
    L_0x0059:
        r11 = z;	 Catch:{ NumberFormatException -> 0x00de }
        r12 = 4;
        r11 = r11[r12];	 Catch:{ NumberFormatException -> 0x00de }
        r10 = r10.equals(r11);	 Catch:{ NumberFormatException -> 0x00de }
        if (r10 == 0) goto L_0x009b;
    L_0x0064:
        r10 = z;	 Catch:{ NumberFormatException -> 0x00e0 }
        r11 = 0;
        r10 = r10[r11];	 Catch:{ NumberFormatException -> 0x00e0 }
        r10 = r10.equals(r9);	 Catch:{ NumberFormatException -> 0x00e0 }
        if (r10 != 0) goto L_0x0085;
    L_0x006f:
        r10 = z;	 Catch:{ NumberFormatException -> 0x00e2 }
        r11 = 7;
        r10 = r10[r11];	 Catch:{ NumberFormatException -> 0x00e2 }
        r10 = r10.equals(r9);	 Catch:{ NumberFormatException -> 0x00e2 }
        if (r10 != 0) goto L_0x0085;
    L_0x007a:
        r10 = z;	 Catch:{ NumberFormatException -> 0x00e4 }
        r11 = 3;
        r10 = r10[r11];	 Catch:{ NumberFormatException -> 0x00e4 }
        r9 = r10.equals(r9);	 Catch:{ NumberFormatException -> 0x00e4 }
        if (r9 == 0) goto L_0x0090;
    L_0x0085:
        r9 = r13.b;	 Catch:{ NumberFormatException -> 0x00e6 }
        r9 = com.whatsapp.protocol.by.d(r9);	 Catch:{ NumberFormatException -> 0x00e6 }
        r9.c(r8);	 Catch:{ NumberFormatException -> 0x00e6 }
        if (r1 == 0) goto L_0x00a4;
    L_0x0090:
        r9 = r13.b;	 Catch:{ NumberFormatException -> 0x00e8 }
        r9 = com.whatsapp.protocol.by.d(r9);	 Catch:{ NumberFormatException -> 0x00e8 }
        r9.d(r8);	 Catch:{ NumberFormatException -> 0x00e8 }
        if (r1 == 0) goto L_0x00a4;
    L_0x009b:
        r9 = r13.b;	 Catch:{ NumberFormatException -> 0x00e8 }
        r9 = com.whatsapp.protocol.by.d(r9);	 Catch:{ NumberFormatException -> 0x00e8 }
        r9.a(r8, r2, r7);	 Catch:{ NumberFormatException -> 0x00e8 }
    L_0x00a4:
        r0 = r0 + 1;
        if (r1 == 0) goto L_0x0015;
    L_0x00a8:
        r0 = r13.a;
        r2 = r0.keys();
    L_0x00ae:
        r0 = r2.hasMoreElements();
        if (r0 == 0) goto L_0x00c5;
    L_0x00b4:
        r0 = r2.nextElement();
        r0 = (java.lang.String) r0;
        r3 = r13.b;
        r3 = com.whatsapp.protocol.by.d(r3);
        r3.d(r0);
        if (r1 == 0) goto L_0x00ae;
    L_0x00c5:
        r0 = r13.b;
        r0 = com.whatsapp.protocol.by.d(r0);
        r1 = 0;
        r0.a(r1);
        return;
    L_0x00d0:
        r0 = move-exception;
        throw r0;
    L_0x00d2:
        r2 = java.lang.Long.parseLong(r2);	 Catch:{ NumberFormatException -> 0x00d8 }
        goto L_0x003b;
    L_0x00d8:
        r2 = move-exception;
        r2 = r4;
        goto L_0x003c;
    L_0x00dc:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00de }
    L_0x00de:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00e0 }
    L_0x00e0:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00e2 }
    L_0x00e2:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00e4 }
    L_0x00e4:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00e6 }
    L_0x00e6:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00e8 }
    L_0x00e8:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.protocol.m.a(com.whatsapp.protocol.cw, java.lang.String):void");
    }
}
