package com.google;

import com.whatsapp.arj;
import org.v;
import org.whispersystems.at;

class gr {
    private static final String[] z;
    private final dv[] a;
    private final eP b;

    static {
        String[] strArr = new String[2];
        String str = "8\u001b^S%8\u001b^\u0015 .L\u001f\u0007";
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
                        i3 = 40;
                        break;
                    case at.i /*2*/:
                        i3 = 58;
                        break;
                    case at.o /*3*/:
                        i3 = arj.Theme_radioButtonStyle;
                        break;
                    default:
                        i3 = 5;
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
                    str = "8\u001b^S%=\b\u001a\u0015%=\b\u001f\u0007";
                    obj = null;
            }
        }
    }

    final dv[] b() {
        return this.a;
    }

    final int a(int i) {
        return i - this.b.i();
    }

    final dv b(int i) {
        int i2 = g0.a;
        dv c = c(i);
        if (c != null) {
            return c;
        }
        int i3 = 1;
        while (i3 < 5) {
            int a = a(i) - i3;
            if (a >= 0) {
                c = this.a[a];
                if (c != null) {
                    return c;
                }
            }
            a = a(i) + i3;
            if (a < this.a.length) {
                c = this.a[a];
                if (c != null) {
                    return c;
                }
            }
            a = i3 + 1;
            if (i2 != 0) {
                break;
            }
            i3 = a;
        }
        return null;
    }

    gr(eP ePVar) {
        this.b = new eP(ePVar);
        this.a = new dv[((ePVar.a() - ePVar.i()) + 1)];
    }

    final void a(int i, dv dvVar) {
        this.a[a(i)] = dvVar;
    }

    final eP a() {
        return this.b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
        r12 = this;
        r11 = 1;
        r3 = 0;
        r4 = com.google.g0.a;
        r5 = new java.util.Formatter;
        r5.<init>();
        r6 = r12.a;
        r7 = r6.length;
        r2 = r3;
        r1 = r3;
    L_0x000e:
        if (r2 >= r7) goto L_0x0053;
    L_0x0010:
        r8 = r6[r2];
        if (r8 != 0) goto L_0x005e;
    L_0x0014:
        r0 = z;
        r9 = r0[r11];
        r10 = new java.lang.Object[r11];
        r0 = r1 + 1;
        r1 = java.lang.Integer.valueOf(r1);
        r10[r3] = r1;
        r5.format(r9, r10);
        if (r4 == 0) goto L_0x004f;
    L_0x0027:
        r1 = z;
        r9 = r1[r3];
        r1 = 3;
        r10 = new java.lang.Object[r1];
        r1 = r0 + 1;
        r0 = java.lang.Integer.valueOf(r0);
        r10[r3] = r0;
        r0 = r8.c();
        r0 = java.lang.Integer.valueOf(r0);
        r10[r11] = r0;
        r0 = 2;
        r8 = r8.f();
        r8 = java.lang.Integer.valueOf(r8);
        r10[r0] = r8;
        r5.format(r9, r10);
        r0 = r1;
    L_0x004f:
        r1 = r2 + 1;
        if (r4 == 0) goto L_0x005b;
    L_0x0053:
        r0 = r5.toString();
        r5.close();
        return r0;
    L_0x005b:
        r2 = r1;
        r1 = r0;
        goto L_0x000e;
    L_0x005e:
        r0 = r1;
        goto L_0x0027;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gr.toString():java.lang.String");
    }

    final dv c(int i) {
        return this.a[a(i)];
    }
}
