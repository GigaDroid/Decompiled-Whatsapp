package com.google;

import org.v;
import org.whispersystems.at;

final class gR extends gr {
    private static final String z;
    private final boolean c;

    static {
        char[] toCharArray = "\u0011\u0004J,r,M&".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 88;
                    break;
                case at.g /*1*/:
                    i2 = 119;
                    break;
                case at.i /*2*/:
                    i2 = 6;
                    break;
                case at.o /*3*/:
                    i2 = 73;
                    break;
                default:
                    i2 = 20;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    int a(com.google.W r14) {
        /*
        r13 = this;
        r7 = com.google.g0.a;
        r8 = r13.b();
        r13.d();
        r13.a(r8, r14);
        r1 = r13.a();
        r0 = r13.c;
        if (r0 == 0) goto L_0x00b7;
    L_0x0014:
        r0 = r1.g();
    L_0x0018:
        r2 = r13.c;
        if (r2 == 0) goto L_0x00bd;
    L_0x001c:
        r1 = r1.h();
    L_0x0020:
        r0 = r0.b();
        r0 = (int) r0;
        r0 = r13.a(r0);
        r1 = r1.b();
        r1 = (int) r1;
        r9 = r13.a(r1);
        r1 = r9 - r0;
        r1 = (float) r1;
        r2 = r14.d();
        r2 = (float) r2;
        r10 = r1 / r2;
        r3 = -1;
        r2 = 1;
        r1 = 0;
        r6 = r0;
    L_0x0040:
        if (r6 >= r9) goto L_0x00b1;
    L_0x0042:
        r0 = r8[r6];
        if (r0 != 0) goto L_0x004f;
    L_0x0046:
        if (r7 == 0) goto L_0x00cf;
    L_0x0048:
        r0 = com.google.aK.a;
        if (r0 == 0) goto L_0x00c3;
    L_0x004c:
        r0 = 0;
    L_0x004d:
        com.google.aK.a = r0;
    L_0x004f:
        r11 = r8[r6];
        r0 = r11.c();
        r4 = r0 - r3;
        if (r4 != 0) goto L_0x005e;
    L_0x0059:
        r0 = r1 + 1;
        if (r7 == 0) goto L_0x00d5;
    L_0x005d:
        r1 = r0;
    L_0x005e:
        r0 = 1;
        if (r4 != r0) goto L_0x006f;
    L_0x0061:
        r1 = java.lang.Math.max(r2, r1);
        r0 = 1;
        r2 = r11.c();
        if (r7 == 0) goto L_0x00ad;
    L_0x006c:
        r3 = r2;
        r2 = r1;
        r1 = r0;
    L_0x006f:
        if (r4 < 0) goto L_0x007d;
    L_0x0071:
        r0 = r11.c();
        r5 = r14.d();
        if (r0 >= r5) goto L_0x007d;
    L_0x007b:
        if (r4 <= r6) goto L_0x0082;
    L_0x007d:
        r0 = 0;
        r8[r6] = r0;
        if (r7 == 0) goto L_0x00cf;
    L_0x0082:
        r0 = 2;
        if (r2 <= r0) goto L_0x008a;
    L_0x0085:
        r0 = r2 + -2;
        r0 = r0 * r4;
        if (r7 == 0) goto L_0x00d3;
    L_0x008a:
        r5 = r4;
    L_0x008b:
        if (r5 < r6) goto L_0x00c5;
    L_0x008d:
        r0 = 1;
    L_0x008e:
        r4 = 1;
    L_0x008f:
        if (r4 > r5) goto L_0x009e;
    L_0x0091:
        if (r0 != 0) goto L_0x009e;
    L_0x0093:
        r0 = r6 - r4;
        r0 = r8[r0];
        if (r0 == 0) goto L_0x00c7;
    L_0x0099:
        r0 = 1;
    L_0x009a:
        r4 = r4 + 1;
        if (r7 == 0) goto L_0x008f;
    L_0x009e:
        if (r0 == 0) goto L_0x00a5;
    L_0x00a0:
        r0 = 0;
        r8[r6] = r0;
        if (r7 == 0) goto L_0x00cf;
    L_0x00a5:
        r1 = r11.c();
        r0 = 1;
        r12 = r2;
        r2 = r1;
        r1 = r12;
    L_0x00ad:
        r3 = r6 + 1;
        if (r7 == 0) goto L_0x00c9;
    L_0x00b1:
        r0 = (double) r10;
        r2 = 4602678819172646912; // 0x3fe0000000000000 float:0.0 double:0.5;
        r0 = r0 + r2;
        r0 = (int) r0;
        return r0;
    L_0x00b7:
        r0 = r1.e();
        goto L_0x0018;
    L_0x00bd:
        r1 = r1.b();
        goto L_0x0020;
    L_0x00c3:
        r0 = 1;
        goto L_0x004d;
    L_0x00c5:
        r0 = 0;
        goto L_0x008e;
    L_0x00c7:
        r0 = 0;
        goto L_0x009a;
    L_0x00c9:
        r6 = r3;
        r3 = r2;
        r2 = r1;
        r1 = r0;
        goto L_0x0040;
    L_0x00cf:
        r0 = r1;
        r1 = r2;
        r2 = r3;
        goto L_0x00ad;
    L_0x00d3:
        r5 = r0;
        goto L_0x008b;
    L_0x00d5:
        r1 = r2;
        r2 = r3;
        goto L_0x00ad;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gR.a(com.google.W):int");
    }

    public String toString() {
        return z + this.c + '\n' + super.toString();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(com.google.dv[] r7, com.google.W r8) {
        /*
        r6 = this;
        r5 = 0;
        r2 = com.google.g0.a;
        r0 = 0;
    L_0x0004:
        r1 = r7.length;
        if (r0 >= r1) goto L_0x0032;
    L_0x0007:
        r1 = r7[r0];
        r3 = r7[r0];
        if (r3 != 0) goto L_0x000f;
    L_0x000d:
        if (r2 == 0) goto L_0x002e;
    L_0x000f:
        r3 = r1.f();
        r3 = r3 % 30;
        r1 = r1.c();
        r4 = r8.d();
        if (r1 <= r4) goto L_0x0023;
    L_0x001f:
        r7[r0] = r5;
        if (r2 == 0) goto L_0x002e;
    L_0x0023:
        r4 = r6.c;
        if (r4 != 0) goto L_0x0029;
    L_0x0027:
        r1 = r1 + 2;
    L_0x0029:
        r1 = r1 % 3;
        switch(r1) {
            case 0: goto L_0x0033;
            case 1: goto L_0x0041;
            case 2: goto L_0x0055;
            default: goto L_0x002e;
        };
    L_0x002e:
        r0 = r0 + 1;
        if (r2 == 0) goto L_0x0004;
    L_0x0032:
        return;
    L_0x0033:
        r1 = r3 * 3;
        r1 = r1 + 1;
        r4 = r8.e();
        if (r1 == r4) goto L_0x002e;
    L_0x003d:
        r7[r0] = r5;
        if (r2 == 0) goto L_0x002e;
    L_0x0041:
        r1 = r3 / 3;
        r4 = r8.a();
        if (r1 != r4) goto L_0x0051;
    L_0x0049:
        r1 = r3 % 3;
        r4 = r8.b();
        if (r1 == r4) goto L_0x002e;
    L_0x0051:
        r7[r0] = r5;
        if (r2 == 0) goto L_0x002e;
    L_0x0055:
        r1 = r3 + 1;
        r3 = r8.c();
        if (r1 == r3) goto L_0x002e;
    L_0x005d:
        r7[r0] = r5;
        goto L_0x002e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gR.a(com.google.dv[], com.google.W):void");
    }

    gR(eP ePVar, boolean z) {
        super(ePVar);
        this.c = z;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    com.google.W b() {
        /*
        r12 = this;
        r2 = 0;
        r3 = com.google.g0.a;
        r4 = r12.b();
        r5 = new com.google.e3;
        r5.<init>();
        r6 = new com.google.e3;
        r6.<init>();
        r7 = new com.google.e3;
        r7.<init>();
        r8 = new com.google.e3;
        r8.<init>();
        r9 = r4.length;
        r1 = r2;
    L_0x001d:
        if (r1 >= r9) goto L_0x0041;
    L_0x001f:
        r0 = r4[r1];
        if (r0 != 0) goto L_0x0025;
    L_0x0023:
        if (r3 == 0) goto L_0x003d;
    L_0x0025:
        r0.a();
        r10 = r0.f();
        r10 = r10 % 30;
        r0 = r0.c();
        r11 = r12.c;
        if (r11 != 0) goto L_0x0038;
    L_0x0036:
        r0 = r0 + 2;
    L_0x0038:
        r0 = r0 % 3;
        switch(r0) {
            case 0: goto L_0x0089;
            case 1: goto L_0x0092;
            case 2: goto L_0x009e;
            default: goto L_0x003d;
        };
    L_0x003d:
        r0 = r1 + 1;
        if (r3 == 0) goto L_0x00c5;
    L_0x0041:
        r0 = r5.a();
        r0 = r0.length;
        if (r0 == 0) goto L_0x0087;
    L_0x0048:
        r0 = r6.a();
        r0 = r0.length;
        if (r0 == 0) goto L_0x0087;
    L_0x004f:
        r0 = r7.a();
        r0 = r0.length;
        if (r0 == 0) goto L_0x0087;
    L_0x0056:
        r0 = r8.a();
        r0 = r0.length;
        if (r0 == 0) goto L_0x0087;
    L_0x005d:
        r0 = r5.a();
        r0 = r0[r2];
        r1 = 1;
        if (r0 < r1) goto L_0x0087;
    L_0x0066:
        r0 = r6.a();
        r0 = r0[r2];
        r1 = r7.a();
        r1 = r1[r2];
        r0 = r0 + r1;
        r1 = 3;
        if (r0 < r1) goto L_0x0087;
    L_0x0076:
        r0 = r6.a();
        r0 = r0[r2];
        r1 = r7.a();
        r1 = r1[r2];
        r0 = r0 + r1;
        r1 = 90;
        if (r0 <= r1) goto L_0x00a4;
    L_0x0087:
        r0 = 0;
    L_0x0088:
        return r0;
    L_0x0089:
        r0 = r10 * 3;
        r0 = r0 + 1;
        r6.a(r0);
        if (r3 == 0) goto L_0x003d;
    L_0x0092:
        r0 = r10 / 3;
        r8.a(r0);
        r0 = r10 % 3;
        r7.a(r0);
        if (r3 == 0) goto L_0x003d;
    L_0x009e:
        r0 = r10 + 1;
        r5.a(r0);
        goto L_0x003d;
    L_0x00a4:
        r0 = new com.google.W;
        r1 = r5.a();
        r1 = r1[r2];
        r3 = r6.a();
        r3 = r3[r2];
        r5 = r7.a();
        r5 = r5[r2];
        r6 = r8.a();
        r2 = r6[r2];
        r0.<init>(r1, r3, r5, r2);
        r12.a(r4, r0);
        goto L_0x0088;
    L_0x00c5:
        r1 = r0;
        goto L_0x001d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gR.b():com.google.W");
    }

    void d() {
        int i = g0.a;
        dv[] b = b();
        int length = b.length;
        int i2 = 0;
        while (i2 < length) {
            dv dvVar = b[i2];
            if (dvVar != null) {
                dvVar.a();
            }
            i2++;
            if (i != 0) {
                return;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    int b(com.google.W r13) {
        /*
        r12 = this;
        r2 = 1;
        r5 = com.google.g0.a;
        r1 = r12.a();
        r0 = r12.c;
        if (r0 == 0) goto L_0x0089;
    L_0x000b:
        r0 = r1.g();
    L_0x000f:
        r3 = r12.c;
        if (r3 == 0) goto L_0x008e;
    L_0x0013:
        r1 = r1.h();
    L_0x0017:
        r0 = r0.b();
        r0 = (int) r0;
        r0 = r12.a(r0);
        r1 = r1.b();
        r1 = (int) r1;
        r6 = r12.a(r1);
        r1 = r6 - r0;
        r1 = (float) r1;
        r3 = r13.d();
        r3 = (float) r3;
        r7 = r1 / r3;
        r8 = r12.b();
        r3 = -1;
        r1 = 0;
        r4 = r0;
        r0 = r1;
        r1 = r2;
    L_0x003c:
        if (r4 >= r6) goto L_0x007b;
    L_0x003e:
        r9 = r8[r4];
        if (r9 != 0) goto L_0x0044;
    L_0x0042:
        if (r5 == 0) goto L_0x0077;
    L_0x0044:
        r9 = r8[r4];
        r9.a();
        r10 = r9.c();
        r10 = r10 - r3;
        if (r10 != 0) goto L_0x0054;
    L_0x0050:
        r0 = r0 + 1;
        if (r5 == 0) goto L_0x0077;
    L_0x0054:
        if (r10 != r2) goto L_0x0063;
    L_0x0056:
        r0 = java.lang.Math.max(r1, r0);
        r1 = r9.c();
        if (r5 == 0) goto L_0x0093;
    L_0x0060:
        r3 = r1;
        r1 = r0;
        r0 = r2;
    L_0x0063:
        r10 = r9.c();
        r11 = r13.d();
        if (r10 < r11) goto L_0x0072;
    L_0x006d:
        r10 = 0;
        r8[r4] = r10;
        if (r5 == 0) goto L_0x0077;
    L_0x0072:
        r3 = r9.c();
        r0 = r2;
    L_0x0077:
        r4 = r4 + 1;
        if (r5 == 0) goto L_0x003c;
    L_0x007b:
        r0 = (double) r7;
        r2 = 4602678819172646912; // 0x3fe0000000000000 float:0.0 double:0.5;
        r0 = r0 + r2;
        r0 = (int) r0;
        r1 = com.google.aK.a;
        if (r1 == 0) goto L_0x0088;
    L_0x0084:
        r1 = r5 + 1;
        com.google.g0.a = r1;
    L_0x0088:
        return r0;
    L_0x0089:
        r0 = r1.e();
        goto L_0x000f;
    L_0x008e:
        r1 = r1.b();
        goto L_0x0017;
    L_0x0093:
        r3 = r1;
        r1 = r0;
        r0 = r2;
        goto L_0x0077;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gR.b(com.google.W):int");
    }

    int[] c() {
        int i = g0.a;
        W b = b();
        if (b == null) {
            return null;
        }
        b(b);
        int[] iArr = new int[b.d()];
        dv[] b2 = b();
        int length = b2.length;
        int i2 = 0;
        while (i2 < length) {
            dv dvVar = b2[i2];
            if (dvVar != null) {
                int c = dvVar.c();
                if (c >= iArr.length) {
                    throw aG.a();
                }
                iArr[c] = iArr[c] + 1;
            }
            i2++;
            if (i != 0) {
                return iArr;
            }
        }
        return iArr;
    }

    boolean a() {
        return this.c;
    }
}
