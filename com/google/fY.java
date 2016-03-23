package com.google;

import org.v;
import org.whispersystems.Y;
import org.whispersystems.at;

public final class fY {
    private static final String[] z;
    private dG a;
    private int b;
    private h8 c;
    private hP d;
    private fQ e;

    static {
        String[] strArr = new String[8];
        String str = "5\u0011\"YYZG\"V/\u001f";
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
                        i3 = 63;
                        break;
                    case at.g /*1*/:
                        i3 = 49;
                        break;
                    case at.i /*2*/:
                        i3 = 71;
                        break;
                    case at.o /*3*/:
                        i3 = 58;
                        break;
                    default:
                        i3 = 21;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u0003\rM";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "5\u00111_gLX(T/\u001f";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "5\u0011*[aMX?\u00005QD+V\u001f";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u001f\\(^p\u0005\u0011";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u0001\u000fM";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "5\u0011*[aMX?\u0000\u001f";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "5\u0011*[fTa&NaZC)\u00005";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void a(h8 h8Var) {
        this.c = h8Var;
    }

    public void a(dG dGVar) {
        this.a = dGVar;
    }

    public void a(hP hPVar) {
        this.d = hPVar;
    }

    public static boolean b(int i) {
        return i >= 0 && i < 8;
    }

    public void a(int i) {
        this.b = i;
    }

    public dG a() {
        return this.a;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
        r3 = this;
        r0 = new java.lang.StringBuilder;
        r1 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        r0.<init>(r1);
        r1 = z;
        r2 = 2;
        r1 = r1[r2];
        r0.append(r1);
        r1 = z;
        r2 = 5;
        r1 = r1[r2];
        r0.append(r1);
        r1 = r3.c;
        r0.append(r1);
        r1 = z;
        r2 = 0;
        r1 = r1[r2];
        r0.append(r1);
        r1 = r3.d;
        r0.append(r1);
        r1 = z;
        r2 = 3;
        r1 = r1[r2];
        r0.append(r1);
        r1 = r3.e;
        r0.append(r1);
        r1 = z;
        r2 = 1;
        r1 = r1[r2];
        r0.append(r1);
        r1 = r3.b;
        r0.append(r1);
        r1 = r3.a;
        if (r1 != 0) goto L_0x0053;
    L_0x0047:
        r1 = z;
        r2 = 4;
        r1 = r1[r2];
        r0.append(r1);
        r1 = com.google.dG.c;
        if (r1 == 0) goto L_0x0060;
    L_0x0053:
        r1 = z;
        r2 = 7;
        r1 = r1[r2];
        r0.append(r1);
        r1 = r3.a;
        r0.append(r1);
    L_0x0060:
        r1 = z;
        r2 = 6;
        r1 = r1[r2];
        r0.append(r1);
        r0 = r0.toString();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.fY.toString():java.lang.String");
    }

    public void a(fQ fQVar) {
        this.e = fQVar;
    }

    public fY() {
        this.b = -1;
    }
}
