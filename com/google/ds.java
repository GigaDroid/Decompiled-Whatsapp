package com.google;

import com.whatsapp.arj;
import org.v;
import org.whispersystems.at;

final class ds {
    private static final String[] z;
    private final W a;
    private final int b;
    private final gr[] c;
    private eP d;

    static {
        String[] strArr = new String[5];
        String str = "Lr";
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
                        i3 = arj.Theme_radioButtonStyle;
                        break;
                    case at.g /*1*/:
                        i3 = 28;
                        break;
                    case at.i /*2*/:
                        i3 = 92;
                        break;
                    case at.o /*3*/:
                        i3 = 16;
                        break;
                    default:
                        i3 = 37;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "I<|0YI<|";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "I<|0YI<|";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "*K|5\u0016\r&";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "I9otYL/8";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    void a(int i, gr grVar) {
        this.c[i] = grVar;
    }

    private void a(int i, int i2, dv[] dvVarArr) {
        dv[] b;
        int i3 = g0.a;
        dv dvVar = dvVarArr[i2];
        dv[] b2 = this.c[i - 1].b();
        if (this.c[i + 1] != null) {
            b = this.c[i + 1].b();
        } else {
            b = b2;
        }
        dv[] dvVarArr2 = new dv[14];
        dvVarArr2[2] = b2[i2];
        dvVarArr2[3] = b[i2];
        if (i2 > 0) {
            dvVarArr2[0] = dvVarArr[i2 - 1];
            dvVarArr2[4] = b2[i2 - 1];
            dvVarArr2[5] = b[i2 - 1];
        }
        if (i2 > 1) {
            dvVarArr2[8] = dvVarArr[i2 - 2];
            dvVarArr2[10] = b2[i2 - 2];
            dvVarArr2[11] = b[i2 - 2];
        }
        if (i2 < dvVarArr.length - 1) {
            dvVarArr2[1] = dvVarArr[i2 + 1];
            dvVarArr2[6] = b2[i2 + 1];
            dvVarArr2[7] = b[i2 + 1];
        }
        if (i2 < dvVarArr.length - 2) {
            dvVarArr2[9] = dvVarArr[i2 + 2];
            dvVarArr2[12] = b2[i2 + 2];
            dvVarArr2[13] = b[i2 + 2];
        }
        int length = dvVarArr2.length;
        int i4 = 0;
        while (i4 < length && !a(dvVar, dvVarArr2[i4])) {
            i4++;
            if (i3 != 0) {
                return;
            }
        }
    }

    private void a(gr grVar) {
        if (grVar != null) {
            ((gR) grVar).a(this.a);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
        r12 = this;
        r11 = 2;
        r10 = 1;
        r2 = 0;
        r4 = com.google.g0.a;
        r0 = r12.c;
        r0 = r0[r2];
        if (r0 != 0) goto L_0x0013;
    L_0x000b:
        r0 = r12.c;
        r1 = r12.b;
        r1 = r1 + 1;
        r0 = r0[r1];
    L_0x0013:
        r5 = new java.util.Formatter;
        r5.<init>();
        r1 = r2;
    L_0x0019:
        r3 = r0.b();
        r3 = r3.length;
        if (r1 >= r3) goto L_0x008e;
    L_0x0020:
        r3 = z;
        r6 = 4;
        r3 = r3[r6];
        r6 = new java.lang.Object[r10];
        r7 = java.lang.Integer.valueOf(r1);
        r6[r2] = r7;
        r5.format(r3, r6);
        r3 = r2;
    L_0x0031:
        r6 = r12.b;
        r6 = r6 + 2;
        if (r3 >= r6) goto L_0x0081;
    L_0x0037:
        r6 = r12.c;
        r6 = r6[r3];
        if (r6 != 0) goto L_0x0048;
    L_0x003d:
        r6 = z;
        r6 = r6[r11];
        r7 = new java.lang.Object[r2];
        r5.format(r6, r7);
        if (r4 == 0) goto L_0x007d;
    L_0x0048:
        r6 = r12.c;
        r6 = r6[r3];
        r6 = r6.b();
        r6 = r6[r1];
        if (r6 != 0) goto L_0x0060;
    L_0x0054:
        r7 = z;
        r8 = 3;
        r7 = r7[r8];
        r8 = new java.lang.Object[r2];
        r5.format(r7, r8);
        if (r4 == 0) goto L_0x007d;
    L_0x0060:
        r7 = z;
        r7 = r7[r10];
        r8 = new java.lang.Object[r11];
        r9 = r6.c();
        r9 = java.lang.Integer.valueOf(r9);
        r8[r2] = r9;
        r6 = r6.f();
        r6 = java.lang.Integer.valueOf(r6);
        r8[r10] = r6;
        r5.format(r7, r8);
    L_0x007d:
        r3 = r3 + 1;
        if (r4 == 0) goto L_0x0031;
    L_0x0081:
        r3 = z;
        r3 = r3[r2];
        r6 = new java.lang.Object[r2];
        r5.format(r3, r6);
        r1 = r1 + 1;
        if (r4 == 0) goto L_0x0019;
    L_0x008e:
        r0 = r5.toString();
        r5.close();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ds.toString():java.lang.String");
    }

    int h() {
        return this.a.d();
    }

    int g() {
        return this.a.a();
    }

    int c() {
        return this.b;
    }

    gr a(int i) {
        return this.c[i];
    }

    private int a() {
        int i = g0.a;
        if (this.c[this.b + 1] == null) {
            return 0;
        }
        dv[] b = this.c[this.b + 1].b();
        int i2 = 0;
        int i3 = 0;
        while (i2 < b.length) {
            if (!(b[i2] == null && i == 0)) {
                int c = b[i2].c();
                int i4 = this.b + 1;
                int i5 = 0;
                while (i4 > 0 && i5 < 2) {
                    dv dvVar = this.c[i4].b()[i2];
                    if (dvVar != null) {
                        i5 = a(c, i5, dvVar);
                        if (!dvVar.d()) {
                            i3++;
                        }
                    }
                    i4--;
                    if (i != 0) {
                        break;
                    }
                }
            }
            i2++;
            if (i != 0) {
                break;
            }
        }
        return i3;
    }

    eP j() {
        return this.d;
    }

    private int e() {
        int i = g0.a;
        int d = d();
        if (d == 0) {
            return 0;
        }
        int i2 = 1;
        while (i2 < this.b + 1) {
            dv[] b = this.c[i2].b();
            int i3 = 0;
            while (i3 < b.length) {
                if (!((b[i3] == null && i == 0) || b[i3].d())) {
                    a(i2, i3, b);
                }
                i3++;
                if (i != 0) {
                    break;
                }
            }
            i2++;
            if (i != 0) {
                break;
            }
        }
        return d;
    }

    ds(W w, eP ePVar) {
        this.a = w;
        this.b = w.c();
        this.d = ePVar;
        this.c = new gr[(this.b + 2)];
    }

    public void a(eP ePVar) {
        this.d = ePVar;
    }

    private void b() {
        int i = 0;
        int i2 = g0.a;
        if (this.c[0] != null && this.c[this.b + 1] != null) {
            dv[] b = this.c[0].b();
            dv[] b2 = this.c[this.b + 1].b();
            while (i < b.length) {
                if (!(b[i] == null || b2[i] == null || b[i].c() != b2[i].c())) {
                    int i3 = 1;
                    while (i3 <= this.b) {
                        dv dvVar = this.c[i3].b()[i];
                        if (!(dvVar == null && i2 == 0)) {
                            dvVar.a(b[i].c());
                            if (!dvVar.d()) {
                                this.c[i3].b()[i] = null;
                            }
                        }
                        i3++;
                        if (i2 != 0) {
                            break;
                        }
                    }
                }
                i++;
                if (i2 != 0) {
                    return;
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    com.google.gr[] i() {
        /*
        r2 = this;
        r0 = r2.c;
        r1 = 0;
        r0 = r0[r1];
        r2.a(r0);
        r0 = r2.c;
        r1 = r2.b;
        r1 = r1 + 1;
        r0 = r0[r1];
        r2.a(r0);
        r0 = 928; // 0x3a0 float:1.3E-42 double:4.585E-321;
    L_0x0015:
        r1 = r2.e();
        if (r1 <= 0) goto L_0x001d;
    L_0x001b:
        if (r1 < r0) goto L_0x0020;
    L_0x001d:
        r0 = r2.c;
        return r0;
    L_0x0020:
        r0 = r1;
        goto L_0x0015;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ds.i():com.google.gr[]");
    }

    private static boolean a(dv dvVar, dv dvVar2) {
        if (dvVar2 == null || !dvVar2.d() || dvVar2.b() != dvVar.b()) {
            return false;
        }
        dvVar.a(dvVar2.c());
        return true;
    }

    private int d() {
        b();
        return f() + a();
    }

    private static int a(int i, int i2, dv dvVar) {
        if (dvVar == null || dvVar.d()) {
            return i2;
        }
        if (dvVar.b(i)) {
            dvVar.a(i);
            i2 = 0;
            if (g0.a == 0) {
                return 0;
            }
        }
        return i2 + 1;
    }

    private int f() {
        int i = g0.a;
        if (this.c[0] == null) {
            return 0;
        }
        dv[] b = this.c[0].b();
        int i2 = 0;
        int i3 = 0;
        while (i2 < b.length) {
            if (!(b[i2] == null && i == 0)) {
                int c = b[i2].c();
                int i4 = i3;
                i3 = 1;
                int i5 = 0;
                while (i3 < this.b + 1 && i5 < 2) {
                    dv dvVar = this.c[i3].b()[i2];
                    if (dvVar != null) {
                        i5 = a(c, i5, dvVar);
                        if (!dvVar.d()) {
                            i4++;
                        }
                    }
                    i3++;
                    if (i != 0) {
                        break;
                    }
                }
                i3 = i4;
            }
            i2++;
            if (i != 0) {
                break;
            }
        }
        return i3;
    }
}
