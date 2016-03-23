package com.google;

import java.util.Map;

public final class aq extends aU {
    private static final int[] b;
    private static final int[] c;
    private static final int[] d;
    static final int[][] f;
    private int e;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int[] a(com.google.d_ r12, int r13, int[] r14) {
        /*
        r11 = 2;
        r3 = 1;
        r4 = 0;
        r5 = com.google.aU.a;
        r6 = r14.length;
        r7 = new int[r6];
        r8 = r12.d();
        r0 = r13;
        r1 = r4;
        r2 = r4;
    L_0x000f:
        if (r13 >= r8) goto L_0x005b;
    L_0x0011:
        r9 = r12.f(r13);
        r9 = r9 ^ r2;
        if (r9 == 0) goto L_0x0020;
    L_0x0018:
        r9 = r7[r1];
        r9 = r9 + 1;
        r7[r1] = r9;
        if (r5 == 0) goto L_0x0057;
    L_0x0020:
        r9 = r6 + -1;
        if (r1 != r9) goto L_0x0050;
    L_0x0024:
        r9 = 1061662228; // 0x3f47ae14 float:0.78 double:5.245308343E-315;
        r9 = com.google.aU.a(r7, r14, r9);
        r10 = 1052938076; // 0x3ec28f5c float:0.38 double:5.202205305E-315;
        r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1));
        if (r9 >= 0) goto L_0x0039;
    L_0x0032:
        r1 = new int[r11];
        r1[r4] = r0;
        r1[r3] = r13;
        return r1;
    L_0x0039:
        r9 = r7[r4];
        r10 = r7[r3];
        r9 = r9 + r10;
        r0 = r0 + r9;
        r9 = r6 + -2;
        java.lang.System.arraycopy(r7, r11, r7, r4, r9);
        r9 = r6 + -2;
        r7[r9] = r4;
        r9 = r6 + -1;
        r7[r9] = r4;
        r1 = r1 + -1;
        if (r5 == 0) goto L_0x0052;
    L_0x0050:
        r1 = r1 + 1;
    L_0x0052:
        r7[r1] = r3;
        if (r2 != 0) goto L_0x0060;
    L_0x0056:
        r2 = r3;
    L_0x0057:
        r13 = r13 + 1;
        if (r5 == 0) goto L_0x000f;
    L_0x005b:
        r0 = com.google.aN.a();
        throw r0;
    L_0x0060:
        r2 = r4;
        goto L_0x0057;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.aq.a(com.google.d_, int, int[]):int[]");
    }

    static {
        d = new int[]{6, 8, 10, 12, 14};
        b = new int[]{1, 1, 1, 1};
        c = new int[]{1, 1, 3};
        f = new int[][]{new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};
    }

    int[] a(d_ d_Var) {
        d_Var.b();
        try {
            int[] a = a(d_Var, c(d_Var), c);
            a(d_Var, a[0]);
            int i = a[0];
            a[0] = d_Var.d() - a[1];
            a[1] = d_Var.d() - i;
            return a;
        } finally {
            d_Var.b();
        }
    }

    public f6 a(int i, d_ d_Var, Map map) {
        int i2 = aU.a;
        int[] b = b(d_Var);
        int[] a = a(d_Var);
        StringBuilder stringBuilder = new StringBuilder(20);
        a(d_Var, b[1], a[0], stringBuilder);
        String stringBuilder2 = stringBuilder.toString();
        int[] iArr = null;
        if (map != null) {
            iArr = (int[]) map.get(b3.ALLOWED_LENGTHS);
        }
        if (iArr == null) {
            iArr = d;
        }
        int length = stringBuilder2.length();
        int length2 = iArr.length;
        int i3 = 0;
        int i4 = 0;
        Object obj = null;
        while (i3 < length2) {
            int i5 = iArr[i3];
            if (length == i5) {
                obj = 1;
                if (i2 == 0) {
                    break;
                }
            }
            if (i5 > i4) {
                i4 = i5;
            }
            i5 = i3 + 1;
            if (i2 != 0) {
                break;
            }
            i3 = i5;
        }
        Object obj2 = obj;
        if (obj2 == null && length > r1) {
            obj2 = 1;
        }
        if (obj2 == null) {
            throw aG.a();
        }
        return new f6(stringBuilder2, null, new fI[]{new fI((float) b[1], (float) i), new fI((float) a[0], (float) i)}, gg.ITF);
    }

    private static int a(int[] iArr) {
        int i = aU.a;
        float f = 0.38f;
        int i2 = -1;
        int length = f.length;
        int i3 = 0;
        while (i3 < length) {
            float a = aU.a(iArr, f[i3], 0.78f);
            if (a < f) {
                i2 = i3;
            } else {
                a = f;
            }
            i3++;
            if (i != 0) {
                break;
            }
            f = a;
        }
        if (i2 >= 0) {
            return i2;
        }
        throw aN.a();
    }

    private void a(d_ d_Var, int i) {
        int i2 = aU.a;
        int i3 = this.e * 10;
        if (i3 >= i) {
            i3 = i;
        }
        int i4 = i - 1;
        while (i3 > 0 && i4 >= 0 && (!d_Var.f(i4) || i2 != 0)) {
            i3--;
            i4--;
            if (i2 != 0) {
                break;
            }
        }
        if (i3 != 0) {
            throw aN.a();
        }
    }

    private static void a(d_ d_Var, int i, int i2, StringBuilder stringBuilder) {
        int i3 = aU.a;
        int[] iArr = new int[10];
        int[] iArr2 = new int[5];
        int[] iArr3 = new int[5];
        int i4 = i;
        while (i4 < i2) {
            int i5;
            a(d_Var, i4, iArr);
            int i6 = 0;
            while (i6 < 5) {
                i5 = i6 * 2;
                iArr2[i6] = iArr[i5];
                iArr3[i6] = iArr[i5 + 1];
                i6++;
                if (i3 != 0) {
                    break;
                }
            }
            stringBuilder.append((char) (a(iArr2) + 48));
            stringBuilder.append((char) (a(iArr3) + 48));
            i5 = iArr.length;
            i6 = 0;
            while (i6 < i5) {
                i4 += iArr[i6];
                i6++;
                if (i3 != 0) {
                    break;
                    continue;
                }
            }
            if (i3 != 0) {
                return;
            }
        }
    }

    int[] b(d_ d_Var) {
        int[] a = a(d_Var, c(d_Var), b);
        this.e = (a[1] - a[0]) / 4;
        a(d_Var, a[0]);
        return a;
    }

    private static int c(d_ d_Var) {
        int d = d_Var.d();
        int c = d_Var.c(0);
        if (c != d) {
            return c;
        }
        throw aN.a();
    }

    public aq() {
        this.e = -1;
    }
}
