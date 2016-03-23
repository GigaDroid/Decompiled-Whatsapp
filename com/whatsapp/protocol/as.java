package com.whatsapp.protocol;

import com.whatsapp.arj;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

class as extends a {
    private static final String[] z;
    final bd a;
    final by b;

    static {
        String[] strArr = new String[10];
        String str = "18";
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
                        i3 = 88;
                        break;
                    case at.g /*1*/:
                        i3 = 72;
                        break;
                    case at.i /*2*/:
                        i3 = arj.Theme_switchStyle;
                        break;
                    case at.o /*3*/:
                        i3 = 16;
                        break;
                    default:
                        i3 = 60;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "*-\u001eeQ=";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "<=\u001fqH1'\u0003";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "-:\u0001";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "+!\u0017u";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "-:\u0001";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "5-\ty]";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "<=\u001d|U;)\u0019u";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = ",1\u001du";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "5!\u0000uH!8\b";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.whatsapp.protocol.cw r8, java.lang.String r9) {
        /*
        r7 = this;
        r1 = 0;
        r2 = com.whatsapp.protocol.co.s;
        r0 = z;
        r3 = 7;
        r0 = r0[r3];
        r0 = r8.f(r0);
        if (r0 == 0) goto L_0x0036;
    L_0x000e:
        r3 = z;
        r4 = 6;
        r3 = r3[r4];
        r3 = r0.b(r3);
        r4 = z;
        r4 = r4[r1];
        r4 = r0.b(r4);
        r5 = z;
        r6 = 2;
        r5 = r5[r6];
        r0 = r0.b(r5);
        if (r0 != 0) goto L_0x00d1;
    L_0x002a:
        r0 = r1;
    L_0x002b:
        r5 = r7.a;	 Catch:{ NumberFormatException -> 0x00db }
        if (r5 == 0) goto L_0x0034;
    L_0x002f:
        r5 = r7.a;	 Catch:{ NumberFormatException -> 0x00db }
        r5.a(r3, r4, r0);	 Catch:{ NumberFormatException -> 0x00db }
    L_0x0034:
        if (r2 == 0) goto L_0x00d0;
    L_0x0036:
        r0 = z;
        r3 = 8;
        r0 = r0[r3];
        r0 = r8.f(r0);
        if (r0 == 0) goto L_0x00d0;
    L_0x0042:
        r3 = r0.b;	 Catch:{ NumberFormatException -> 0x00dd }
        if (r3 == 0) goto L_0x00d0;
    L_0x0046:
        r3 = new com.whatsapp.protocol.be;
        r3.<init>();
    L_0x004b:
        r4 = r0.b;
        r4 = r4.length;
        if (r1 >= r4) goto L_0x00c7;
    L_0x0050:
        r4 = z;	 Catch:{ NumberFormatException -> 0x00df }
        r5 = 9;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x00df }
        r5 = r0.b;	 Catch:{ NumberFormatException -> 0x00df }
        r5 = r5[r1];	 Catch:{ NumberFormatException -> 0x00df }
        r5 = r5.a;	 Catch:{ NumberFormatException -> 0x00df }
        r4 = r4.equals(r5);	 Catch:{ NumberFormatException -> 0x00df }
        if (r4 == 0) goto L_0x0070;
    L_0x0062:
        r4 = r0.b;	 Catch:{ NumberFormatException -> 0x00df }
        r4 = r4[r1];	 Catch:{ NumberFormatException -> 0x00df }
        r4 = r4.b;	 Catch:{ NumberFormatException -> 0x00df }
        r4 = com.whatsapp.protocol.co.c(r4);	 Catch:{ NumberFormatException -> 0x00df }
        r3.b = r4;	 Catch:{ NumberFormatException -> 0x00df }
        if (r2 == 0) goto L_0x00c3;
    L_0x0070:
        r4 = z;	 Catch:{ NumberFormatException -> 0x00e1 }
        r5 = 1;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x00e1 }
        r5 = r0.b;	 Catch:{ NumberFormatException -> 0x00e1 }
        r5 = r5[r1];	 Catch:{ NumberFormatException -> 0x00e1 }
        r5 = r5.a;	 Catch:{ NumberFormatException -> 0x00e1 }
        r4 = r4.equals(r5);	 Catch:{ NumberFormatException -> 0x00e1 }
        if (r4 == 0) goto L_0x008b;
    L_0x0081:
        r4 = r0.b;	 Catch:{ NumberFormatException -> 0x00e3 }
        r4 = r4[r1];	 Catch:{ NumberFormatException -> 0x00e3 }
        r4 = r4.b;	 Catch:{ NumberFormatException -> 0x00e3 }
        r3.c = r4;	 Catch:{ NumberFormatException -> 0x00e3 }
        if (r2 == 0) goto L_0x00c3;
    L_0x008b:
        r4 = z;	 Catch:{ NumberFormatException -> 0x00e5 }
        r5 = 4;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x00e5 }
        r5 = r0.b;	 Catch:{ NumberFormatException -> 0x00e5 }
        r5 = r5[r1];	 Catch:{ NumberFormatException -> 0x00e5 }
        r5 = r5.a;	 Catch:{ NumberFormatException -> 0x00e5 }
        r4 = r4.equals(r5);	 Catch:{ NumberFormatException -> 0x00e5 }
        if (r4 == 0) goto L_0x00a6;
    L_0x009c:
        r4 = r0.b;	 Catch:{ NumberFormatException -> 0x00e7 }
        r4 = r4[r1];	 Catch:{ NumberFormatException -> 0x00e7 }
        r4 = r4.b;	 Catch:{ NumberFormatException -> 0x00e7 }
        r3.a = r4;	 Catch:{ NumberFormatException -> 0x00e7 }
        if (r2 == 0) goto L_0x00c3;
    L_0x00a6:
        r4 = z;	 Catch:{ NumberFormatException -> 0x00e9 }
        r5 = 5;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x00e9 }
        r5 = r0.b;	 Catch:{ NumberFormatException -> 0x00e9 }
        r5 = r5[r1];	 Catch:{ NumberFormatException -> 0x00e9 }
        r5 = r5.a;	 Catch:{ NumberFormatException -> 0x00e9 }
        r4 = r4.equals(r5);	 Catch:{ NumberFormatException -> 0x00e9 }
        if (r4 == 0) goto L_0x00ee;
    L_0x00b7:
        r4 = r0.b;	 Catch:{ NumberFormatException -> 0x00eb }
        r4 = r4[r1];	 Catch:{ NumberFormatException -> 0x00eb }
        r4 = r4.b;	 Catch:{ NumberFormatException -> 0x00eb }
        r4 = java.lang.Long.parseLong(r4);	 Catch:{ NumberFormatException -> 0x00eb }
        r3.d = r4;	 Catch:{ NumberFormatException -> 0x00eb }
    L_0x00c3:
        r1 = r1 + 1;
        if (r2 == 0) goto L_0x004b;
    L_0x00c7:
        r0 = r7.a;	 Catch:{ NumberFormatException -> 0x0110 }
        if (r0 == 0) goto L_0x00d0;
    L_0x00cb:
        r0 = r7.a;	 Catch:{ NumberFormatException -> 0x0110 }
        r0.a(r3);	 Catch:{ NumberFormatException -> 0x0110 }
    L_0x00d0:
        return;
    L_0x00d1:
        r0 = java.lang.Integer.parseInt(r0);	 Catch:{ NumberFormatException -> 0x00d7 }
        goto L_0x002b;
    L_0x00d7:
        r0 = move-exception;
        r0 = r1;
        goto L_0x002b;
    L_0x00db:
        r0 = move-exception;
        throw r0;
    L_0x00dd:
        r0 = move-exception;
        throw r0;
    L_0x00df:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00e1 }
    L_0x00e1:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00e3 }
    L_0x00e3:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00e5 }
    L_0x00e5:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00e7 }
    L_0x00e7:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00e9 }
    L_0x00e9:
        r0 = move-exception;
        throw r0;
    L_0x00eb:
        r4 = move-exception;
        if (r2 == 0) goto L_0x00c3;
    L_0x00ee:
        r4 = z;	 Catch:{ NumberFormatException -> 0x010e }
        r5 = 3;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x010e }
        r5 = r0.b;	 Catch:{ NumberFormatException -> 0x010e }
        r5 = r5[r1];	 Catch:{ NumberFormatException -> 0x010e }
        r5 = r5.a;	 Catch:{ NumberFormatException -> 0x010e }
        r4 = r4.equals(r5);	 Catch:{ NumberFormatException -> 0x010e }
        if (r4 == 0) goto L_0x00c3;
    L_0x00ff:
        r4 = r0.b;	 Catch:{ NumberFormatException -> 0x010c }
        r4 = r4[r1];	 Catch:{ NumberFormatException -> 0x010c }
        r4 = r4.b;	 Catch:{ NumberFormatException -> 0x010c }
        r4 = java.lang.Integer.parseInt(r4);	 Catch:{ NumberFormatException -> 0x010c }
        r3.f = r4;	 Catch:{ NumberFormatException -> 0x010c }
        goto L_0x00c3;
    L_0x010c:
        r4 = move-exception;
        goto L_0x00c3;
    L_0x010e:
        r0 = move-exception;
        throw r0;
    L_0x0110:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.protocol.as.a(com.whatsapp.protocol.cw, java.lang.String):void");
    }

    public void a(int i) {
        try {
            if (this.a != null) {
                this.a.a(i);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    as(by byVar, bd bdVar) {
        this.b = byVar;
        this.a = bdVar;
    }
}
