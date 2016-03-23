package com.whatsapp.protocol;

import com.whatsapp.arj;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

class n extends a {
    private static final String[] z;
    final String a;
    final int b;
    final by c;

    static {
        String[] strArr = new String[13];
        String str = "u\u0004O\b";
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
                        i3 = 6;
                        break;
                    case at.g /*1*/:
                        i3 = 125;
                        break;
                    case at.i /*2*/:
                        i3 = 33;
                        break;
                    case at.o /*3*/:
                        i3 = arj.Theme_seekBarStyle;
                        break;
                    default:
                        i3 = 42;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "q\u001cH\u001f";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "j\u001cR\u001f";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "p\u0018S\u0018Ci\u0013";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "e\u0012E\u000e";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    str = "d\u001cB\u0000E`\u001b";
                    obj = 5;
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    strArr2 = strArr3;
                    str = "c\u000fS\u0004X";
                    obj = 6;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "o\u0013W\nFo\u0019";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "s\u000eD\u0019";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "o\u0013";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "l\u0014E";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "i\bU";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "r\u000fT\u000e";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void a(cw cwVar, String str) {
        int i = 0;
        boolean z = co.s;
        cw f = cwVar.f(z[0]);
        if (f != null) {
            int length;
            cw[] cwVarArr = f.d;
            if (cwVarArr != null) {
                length = cwVarArr.length;
            } else {
                length = 0;
            }
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                if (cwVarArr[i2].d != null) {
                    i3 += cwVarArr[i2].d.length;
                }
                i2++;
                if (z) {
                    break;
                }
            }
            bg[] bgVarArr = new bg[i3];
            i3 = 0;
            while (i < length) {
                i3 += a(bgVarArr, i3, cwVarArr[i]);
                i++;
                if (z) {
                    break;
                }
            }
            a(f, bgVarArr);
        }
    }

    public void a(cw cwVar) {
        int i;
        cw f = cwVar.f(z[7]);
        int i2 = 0;
        long j = -1;
        if (f != null) {
            String b = f.b(z[5]);
            if (b != null) {
                i2 = Integer.parseInt(b);
            }
            String b2 = f.b(z[6]);
            if (b2 != null) {
                j = 1000 * Long.parseLong(b2);
                i = i2;
                by.d(this.c).a(this.a, this.b, i, j);
            }
        }
        i = i2;
        by.d(this.c).a(this.a, this.b, i, j);
    }

    public void a(int i) {
        by.d(this.c).a(this.a, this.b, i, 0);
    }

    private void a(cw cwVar, bg[] bgVarArr) {
        by.d(this.c).a(this.a, this.b, bgVarArr);
        if (z[1].equals(cwVar.b(z[3]))) {
            String b = cwVar.b(z[4]);
            String b2 = cwVar.b(z[2]);
            long j = -1;
            if (b2 != null) {
                j = Long.parseLong(b2) * 1000;
            }
            by.d(this.c).b(this.a, b, j);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int a(com.whatsapp.protocol.bg[] r9, int r10, com.whatsapp.protocol.cw r11) {
        /*
        r8 = this;
        r1 = 0;
        r2 = com.whatsapp.protocol.co.s;
        r3 = r11.d;
        if (r3 != 0) goto L_0x0008;
    L_0x0007:
        return r1;
    L_0x0008:
        r0 = z;
        r4 = 10;
        r0 = r0[r4];
        r0 = com.whatsapp.protocol.cw.b(r11, r0);
        if (r0 == 0) goto L_0x0016;
    L_0x0014:
        if (r2 == 0) goto L_0x005f;
    L_0x0016:
        r0 = z;
        r4 = 12;
        r0 = r0[r4];
        r0 = com.whatsapp.protocol.cw.b(r11, r0);
        if (r0 == 0) goto L_0x0025;
    L_0x0022:
        r0 = 1;
        if (r2 == 0) goto L_0x002f;
    L_0x0025:
        r0 = z;
        r4 = 8;
        r0 = r0[r4];
        com.whatsapp.protocol.cw.a(r11, r0);
        r0 = 2;
    L_0x002f:
        r4 = r3.length;
        if (r1 >= r4) goto L_0x0007;
    L_0x0032:
        r4 = r3[r1];
        r5 = z;
        r6 = 9;
        r5 = r5[r6];
        com.whatsapp.protocol.cw.a(r4, r5);
        r5 = new com.whatsapp.protocol.bg;
        r5.<init>();
        r6 = z;
        r7 = 11;
        r6 = r6[r7];
        r6 = r4.b(r6);
        r5.b = r6;
        r4 = r4.a();
        r5.c = r4;
        r5.a = r0;
        r4 = r10 + r1;
        r9[r4] = r5;
        r1 = r1 + 1;
        if (r2 == 0) goto L_0x002f;
    L_0x005e:
        goto L_0x0007;
    L_0x005f:
        r0 = r1;
        goto L_0x002f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.protocol.n.a(com.whatsapp.protocol.bg[], int, com.whatsapp.protocol.cw):int");
    }

    n(by byVar, String str, int i) {
        this.c = byVar;
        this.a = str;
        this.b = i;
    }
}
