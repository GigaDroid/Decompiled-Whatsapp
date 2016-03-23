package com.google;

import java.util.List;
import java.util.Map;

public final class iY {
    private static final int[] a;
    private static final int[] b;
    private static final int[] c;
    private static final int[] d;

    private static float a(int[] iArr, int[] iArr2, float f) {
        int i = U.a;
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < length) {
            i4 += iArr[i2];
            i3 += iArr2[i2];
            i2++;
            if (i != 0) {
                break;
            }
        }
        i2 = i4;
        if (i2 < i3) {
            return Float.POSITIVE_INFINITY;
        }
        float f2 = ((float) i2) / ((float) i3);
        float f3 = f * f2;
        i4 = 0;
        float f4 = 0.0f;
        while (i4 < length) {
            float f5;
            i3 = iArr[i4];
            float f6 = ((float) iArr2[i4]) * f2;
            if (((float) i3) > f6) {
                f5 = ((float) i3) - f6;
            } else {
                f5 = f6 - ((float) i3);
            }
            if (f5 > f3) {
                return Float.POSITIVE_INFINITY;
            }
            f4 += f5;
            i3 = i4 + 1;
            if (i != 0) {
                break;
            }
            i4 = i3;
        }
        return f4 / ((float) i2);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.fI[] a(com.google.hX r13, int r14, int r15, int r16, int r17, int[] r18) {
        /*
        r11 = com.google.U.a;
        r1 = 4;
        r12 = new com.google.fI[r1];
        r8 = 0;
        r0 = r18;
        r1 = r0.length;
        r7 = new int[r1];
        r3 = r16;
    L_0x000d:
        if (r3 >= r14) goto L_0x0103;
    L_0x000f:
        r5 = 0;
        r1 = r13;
        r2 = r17;
        r4 = r15;
        r6 = r18;
        r1 = a(r1, r2, r3, r4, r5, r6, r7);
        if (r1 == 0) goto L_0x0100;
    L_0x001c:
        r8 = r1;
        r1 = r3;
    L_0x001e:
        if (r1 <= 0) goto L_0x00fc;
    L_0x0020:
        r3 = r1 + -1;
        r5 = 0;
        r1 = r13;
        r2 = r17;
        r4 = r15;
        r6 = r18;
        r1 = a(r1, r2, r3, r4, r5, r6, r7);
        if (r1 == 0) goto L_0x00f9;
    L_0x002f:
        if (r11 == 0) goto L_0x00f6;
    L_0x0031:
        r2 = r3 + 1;
        if (r11 == 0) goto L_0x0037;
    L_0x0035:
        if (r11 == 0) goto L_0x00f2;
    L_0x0037:
        r3 = 0;
        r4 = new com.google.fI;
        r5 = 0;
        r5 = r1[r5];
        r5 = (float) r5;
        r6 = (float) r2;
        r4.<init>(r5, r6);
        r12[r3] = r4;
        r3 = 1;
        r4 = new com.google.fI;
        r5 = 1;
        r1 = r1[r5];
        r1 = (float) r1;
        r5 = (float) r2;
        r4.<init>(r1, r5);
        r12[r3] = r4;
        r1 = 1;
        if (r11 == 0) goto L_0x0059;
    L_0x0054:
        r3 = r2;
    L_0x0055:
        r2 = r3 + 5;
        if (r11 == 0) goto L_0x00ee;
    L_0x0059:
        r10 = r2;
        r2 = r1;
    L_0x005b:
        r1 = r10 + 1;
        if (r2 == 0) goto L_0x00d4;
    L_0x005f:
        r9 = 0;
        r2 = 2;
        r8 = new int[r2];
        r2 = 0;
        r3 = 0;
        r3 = r12[r3];
        r3 = r3.a();
        r3 = (int) r3;
        r8[r2] = r3;
        r2 = 1;
        r3 = 1;
        r3 = r12[r3];
        r3 = r3.a();
        r3 = (int) r3;
        r8[r2] = r3;
        r3 = r1;
    L_0x007a:
        if (r3 >= r14) goto L_0x00eb;
    L_0x007c:
        r1 = 0;
        r2 = r8[r1];
        r5 = 0;
        r1 = r13;
        r4 = r15;
        r6 = r18;
        r1 = a(r1, r2, r3, r4, r5, r6, r7);
        if (r1 == 0) goto L_0x00e8;
    L_0x008a:
        r2 = 0;
        r2 = r8[r2];
        r4 = 0;
        r4 = r1[r4];
        r2 = r2 - r4;
        r2 = java.lang.Math.abs(r2);
        r4 = 5;
        if (r2 >= r4) goto L_0x00e8;
    L_0x0098:
        r2 = 1;
        r2 = r8[r2];
        r4 = 1;
        r4 = r1[r4];
        r2 = r2 - r4;
        r2 = java.lang.Math.abs(r2);
        r4 = 5;
        if (r2 >= r4) goto L_0x00e8;
    L_0x00a6:
        r2 = 0;
        if (r11 == 0) goto L_0x00b1;
    L_0x00a9:
        r4 = 25;
        if (r2 <= r4) goto L_0x00af;
    L_0x00ad:
        if (r11 == 0) goto L_0x00b5;
    L_0x00af:
        r2 = r2 + 1;
    L_0x00b1:
        r3 = r3 + 1;
        if (r11 == 0) goto L_0x00e5;
    L_0x00b5:
        r2 = r2 + 1;
        r2 = r3 - r2;
        r3 = 2;
        r4 = new com.google.fI;
        r5 = 0;
        r5 = r1[r5];
        r5 = (float) r5;
        r6 = (float) r2;
        r4.<init>(r5, r6);
        r12[r3] = r4;
        r3 = 3;
        r4 = new com.google.fI;
        r5 = 1;
        r1 = r1[r5];
        r1 = (float) r1;
        r5 = (float) r2;
        r4.<init>(r1, r5);
        r12[r3] = r4;
        r1 = r2;
    L_0x00d4:
        r1 = r1 - r10;
        r2 = 10;
        if (r1 >= r2) goto L_0x00e4;
    L_0x00d9:
        r1 = 0;
    L_0x00da:
        r2 = r12.length;
        if (r1 >= r2) goto L_0x00e4;
    L_0x00dd:
        r2 = 0;
        r12[r1] = r2;
        r1 = r1 + 1;
        if (r11 == 0) goto L_0x00da;
    L_0x00e4:
        return r12;
    L_0x00e5:
        r8 = r1;
        r9 = r2;
        goto L_0x007a;
    L_0x00e8:
        r1 = r8;
        r2 = r9;
        goto L_0x00a9;
    L_0x00eb:
        r1 = r8;
        r2 = r9;
        goto L_0x00b5;
    L_0x00ee:
        r8 = r1;
        r3 = r2;
        goto L_0x000d;
    L_0x00f2:
        r8 = r1;
        r1 = r2;
        goto L_0x001e;
    L_0x00f6:
        r2 = r3;
        goto L_0x0035;
    L_0x00f9:
        r1 = r8;
        goto L_0x0031;
    L_0x00fc:
        r2 = r1;
        r1 = r8;
        goto L_0x0037;
    L_0x0100:
        r1 = r8;
        goto L_0x0055;
    L_0x0103:
        r2 = r8;
        r10 = r3;
        goto L_0x005b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.iY.a(com.google.hX, int, int, int, int, int[]):com.google.fI[]");
    }

    private static fI[] a(hX hXVar, int i, int i2) {
        int a;
        int b;
        int g = hXVar.g();
        int c = hXVar.c();
        fI[] fIVarArr = new fI[8];
        a(fIVarArr, a(hXVar, g, c, i, i2, c), b);
        if (fIVarArr[4] != null) {
            a = (int) fIVarArr[4].a();
            b = (int) fIVarArr[4].b();
        } else {
            a = i2;
            b = i;
        }
        a(fIVarArr, a(hXVar, g, c, b, a, d), a);
        return fIVarArr;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int[] a(com.google.hX r9, int r10, int r11, int r12, boolean r13, int[] r14, int[] r15) {
        /*
        r5 = com.google.U.a;
        r0 = 0;
        r1 = r15.length;
        r2 = 0;
        java.util.Arrays.fill(r15, r0, r1, r2);
        r6 = r14.length;
        r0 = 0;
    L_0x000a:
        r1 = r9.a(r10, r11);
        if (r1 == 0) goto L_0x001b;
    L_0x0010:
        if (r10 <= 0) goto L_0x001b;
    L_0x0012:
        r1 = r0 + 1;
        r2 = 3;
        if (r0 >= r2) goto L_0x001b;
    L_0x0017:
        r10 = r10 + -1;
        if (r5 == 0) goto L_0x00a3;
    L_0x001b:
        r0 = 0;
        r3 = r10;
        r1 = r10;
        r2 = r13;
    L_0x001f:
        if (r3 >= r12) goto L_0x00a0;
    L_0x0021:
        r4 = r9.a(r3, r11);
        r4 = r4 ^ r2;
        if (r4 == 0) goto L_0x0030;
    L_0x0028:
        r4 = r15[r0];
        r4 = r4 + 1;
        r15[r0] = r4;
        if (r5 == 0) goto L_0x009d;
    L_0x0030:
        r4 = r6 + -1;
        if (r0 != r4) goto L_0x0069;
    L_0x0034:
        r4 = 1061997773; // 0x3f4ccccd float:0.8 double:5.246966156E-315;
        r4 = a(r15, r14, r4);
        r7 = 1054280253; // 0x3ed70a3d float:0.42 double:5.20883654E-315;
        r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1));
        if (r4 >= 0) goto L_0x004c;
    L_0x0042:
        r0 = 2;
        r0 = new int[r0];
        r2 = 0;
        r0[r2] = r1;
        r1 = 1;
        r0[r1] = r3;
    L_0x004b:
        return r0;
    L_0x004c:
        r4 = 0;
        r4 = r15[r4];
        r7 = 1;
        r7 = r15[r7];
        r4 = r4 + r7;
        r1 = r1 + r4;
        r4 = 2;
        r7 = 0;
        r8 = r6 + -2;
        java.lang.System.arraycopy(r15, r4, r15, r7, r8);
        r4 = r6 + -2;
        r7 = 0;
        r15[r4] = r7;
        r4 = r6 + -1;
        r7 = 0;
        r15[r4] = r7;
        r0 = r0 + -1;
        if (r5 == 0) goto L_0x006b;
    L_0x0069:
        r0 = r0 + 1;
    L_0x006b:
        r4 = 1;
        r15[r0] = r4;
        if (r2 != 0) goto L_0x0095;
    L_0x0070:
        r2 = 1;
    L_0x0071:
        r4 = r2;
        r2 = r1;
    L_0x0073:
        r1 = r3 + 1;
        if (r5 == 0) goto L_0x0099;
    L_0x0077:
        r3 = r6 + -1;
        if (r0 != r3) goto L_0x0097;
    L_0x007b:
        r0 = 1061997773; // 0x3f4ccccd float:0.8 double:5.246966156E-315;
        r0 = a(r15, r14, r0);
        r3 = 1054280253; // 0x3ed70a3d float:0.42 double:5.20883654E-315;
        r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1));
        if (r0 >= 0) goto L_0x0097;
    L_0x0089:
        r0 = 2;
        r0 = new int[r0];
        r3 = 0;
        r0[r3] = r2;
        r2 = 1;
        r1 = r1 + -1;
        r0[r2] = r1;
        goto L_0x004b;
    L_0x0095:
        r2 = 0;
        goto L_0x0071;
    L_0x0097:
        r0 = 0;
        goto L_0x004b;
    L_0x0099:
        r3 = r1;
        r1 = r2;
        r2 = r4;
        goto L_0x001f;
    L_0x009d:
        r4 = r2;
        r2 = r1;
        goto L_0x0073;
    L_0x00a0:
        r2 = r1;
        r1 = r3;
        goto L_0x0077;
    L_0x00a3:
        r0 = r1;
        goto L_0x000a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.iY.a(com.google.hX, int, int, int, boolean, int[], int[]):int[]");
    }

    static {
        b = new int[]{0, 4, 1, 5};
        a = new int[]{6, 2, 7, 3};
        c = new int[]{8, 1, 1, 1, 1, 1, 1, 3};
        d = new int[]{7, 1, 1, 3, 1, 1, 1, 2, 1};
    }

    private static void a(fI[] fIVarArr, fI[] fIVarArr2, int[] iArr) {
        int i = U.a;
        int i2 = 0;
        while (i2 < iArr.length) {
            fIVarArr[iArr[i2]] = fIVarArr2[i2];
            i2++;
            if (i != 0) {
                return;
            }
        }
    }

    public static U a(b1 b1Var, Map map, boolean z) {
        int i = U.a;
        hX d = b1Var.d();
        List a = a(z, d);
        if (a.isEmpty()) {
            d = d.f();
            d.b();
            a = a(z, d);
        }
        U u = new U(d, a);
        if (i != 0) {
            aK.a = !aK.a;
        }
        return u;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List a(boolean r12, com.google.hX r13) {
        /*
        r11 = 4;
        r10 = 3;
        r9 = 2;
        r2 = 1;
        r1 = 0;
        r5 = com.google.U.a;
        r6 = new java.util.ArrayList;
        r6.<init>();
        r0 = r1;
        r3 = r1;
        r4 = r1;
    L_0x000f:
        r7 = r13.g();
        if (r4 >= r7) goto L_0x0085;
    L_0x0015:
        r7 = a(r13, r4, r3);
        r3 = r7[r1];
        if (r3 != 0) goto L_0x005a;
    L_0x001d:
        r3 = r7[r10];
        if (r3 != 0) goto L_0x005a;
    L_0x0021:
        if (r0 != 0) goto L_0x0025;
    L_0x0023:
        if (r5 == 0) goto L_0x0085;
    L_0x0025:
        r3 = r6.iterator();
    L_0x0029:
        r0 = r3.hasNext();
        if (r0 == 0) goto L_0x0056;
    L_0x002f:
        r0 = r3.next();
        r0 = (com.google.fI[]) r0;
        r8 = r0[r2];
        if (r8 == 0) goto L_0x0045;
    L_0x0039:
        r4 = (float) r4;
        r8 = r0[r2];
        r8 = r8.b();
        r4 = java.lang.Math.max(r4, r8);
        r4 = (int) r4;
    L_0x0045:
        r8 = r0[r10];
        if (r8 == 0) goto L_0x0054;
    L_0x0049:
        r0 = r0[r10];
        r0 = r0.b();
        r0 = (int) r0;
        r4 = java.lang.Math.max(r4, r0);
    L_0x0054:
        if (r5 == 0) goto L_0x0029;
    L_0x0056:
        r0 = r4 + 5;
        if (r5 == 0) goto L_0x008a;
    L_0x005a:
        r6.add(r7);
        if (r12 != 0) goto L_0x0061;
    L_0x005f:
        if (r5 == 0) goto L_0x0085;
    L_0x0061:
        r0 = r7[r9];
        if (r0 == 0) goto L_0x0075;
    L_0x0065:
        r0 = r7[r9];
        r0 = r0.a();
        r0 = (int) r0;
        r3 = r7[r9];
        r3 = r3.b();
        r3 = (int) r3;
        if (r5 == 0) goto L_0x0083;
    L_0x0075:
        r0 = r7[r11];
        r0 = r0.a();
        r0 = (int) r0;
        r3 = r7[r11];
        r3 = r3.b();
        r3 = (int) r3;
    L_0x0083:
        if (r5 == 0) goto L_0x0086;
    L_0x0085:
        return r6;
    L_0x0086:
        r4 = r3;
        r3 = r0;
        r0 = r2;
        goto L_0x000f;
    L_0x008a:
        r3 = r1;
        r4 = r0;
        r0 = r1;
        goto L_0x000f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.iY.a(boolean, com.google.hX):java.util.List");
    }
}
