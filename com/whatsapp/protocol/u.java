package com.whatsapp.protocol;

import org.v;
import org.whispersystems.at;

class u extends a {
    private static final String[] z;
    final by a;

    static {
        String[] strArr = new String[6];
        String str = "&N\u0012<1.";
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
                        i3 = 74;
                        break;
                    case at.g /*1*/:
                        i3 = 33;
                        break;
                    case at.i /*2*/:
                        i3 = 113;
                        break;
                    case at.o /*3*/:
                        i3 = 87;
                        break;
                    default:
                        i3 = 84;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "/M\u00180=(M\u0014";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = ">S\u00042";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "+B\u00122$>";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "+B\u00122$>";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "%Q\u00058!>";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    u(by byVar) {
        this.a = byVar;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.whatsapp.protocol.cw r11, java.lang.String r12) {
        /*
        r10 = this;
        r4 = 2;
        r5 = 1;
        r1 = -1;
        r0 = 0;
        r6 = com.whatsapp.protocol.co.s;
        r2 = z;
        r3 = 5;
        r2 = r2[r3];
        r7 = r11.f(r2);
        if (r7 == 0) goto L_0x004d;
    L_0x0011:
        r2 = z;
        r3 = 4;
        r2 = r2[r3];
        r2 = r7.b(r2, r0);
        r8 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r2 = r2 * r8;
        r8 = z;
        r8 = r8[r5];
        r7 = r7.b(r8);
        r8 = z;
        r9 = 3;
        r8 = r8[r9];
        r8 = r8.equals(r7);
        if (r8 == 0) goto L_0x0032;
    L_0x0030:
        if (r6 == 0) goto L_0x004b;
    L_0x0032:
        r8 = z;
        r0 = r8[r0];
        r0 = r0.equals(r7);
        if (r0 == 0) goto L_0x003e;
    L_0x003c:
        if (r6 == 0) goto L_0x005c;
    L_0x003e:
        r0 = z;
        r0 = r0[r4];
        r0 = r0.equals(r7);
        if (r0 == 0) goto L_0x004a;
    L_0x0048:
        if (r6 == 0) goto L_0x005a;
    L_0x004a:
        r0 = r1;
    L_0x004b:
        if (r6 == 0) goto L_0x0050;
    L_0x004d:
        r2 = 0;
        r0 = r1;
    L_0x0050:
        r1 = r10.a;
        r1 = com.whatsapp.protocol.by.d(r1);
        r1.a(r2, r0);
        return;
    L_0x005a:
        r0 = r5;
        goto L_0x004b;
    L_0x005c:
        r0 = r4;
        goto L_0x004b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.protocol.u.a(com.whatsapp.protocol.cw, java.lang.String):void");
    }

    public void a(int i) {
    }
}
