package com.google;

import java.lang.reflect.Array;

final class fH {
    private static final float[][] a;

    static {
        a = (float[][]) Array.newInstance(Float.TYPE, new int[]{Q.d.length, 8});
        for (int i = 0; i < Q.d.length; i++) {
            int i2 = Q.d[i];
            int i3 = i2 & 1;
            for (int i4 = 0; i4 < 8; i4++) {
                float f = 0.0f;
                while ((i2 & 1) == i3) {
                    f += 1.0f;
                    i2 >>= 1;
                }
                i3 = i2 & 1;
                a[i][(8 - i4) - 1] = f / 17.0f;
            }
        }
    }

    private static int a(int[] iArr) {
        int i = g0.a;
        long j = 0;
        int i2 = 0;
        while (i2 < iArr.length) {
            long j2 = j;
            int i3 = 0;
            while (i3 < iArr[i2]) {
                int i4;
                j2 <<= 1;
                if (i2 % 2 == 0) {
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                j2 |= (long) i4;
                i3++;
                if (i != 0) {
                    break;
                }
            }
            j = j2;
            i2++;
            if (i != 0) {
                break;
            }
        }
        return (int) j;
    }

    private static int[] e(int[] iArr) {
        int i = 0;
        int i2 = g0.a;
        float a = (float) Q.a(iArr);
        int[] iArr2 = new int[8];
        int i3 = 0;
        int i4 = 0;
        while (i3 < 17) {
            if (((float) (iArr[i4] + i)) <= (a / 34.0f) + ((((float) i3) * a) / 17.0f)) {
                i += iArr[i4];
                i4++;
            }
            iArr2[i4] = iArr2[i4] + 1;
            i3++;
            if (i2 != 0) {
                break;
            }
        }
        return iArr2;
    }

    static int d(int[] iArr) {
        int c = c(e(iArr));
        return c != -1 ? c : b(iArr);
    }

    private static int c(int[] iArr) {
        int a = a(iArr);
        if (Q.a(a) == -1) {
            return -1;
        }
        return a;
    }

    private static int b(int[] iArr) {
        int i = g0.a;
        int a = Q.a(iArr);
        float[] fArr = new float[8];
        int i2 = 0;
        while (i2 < fArr.length) {
            fArr[i2] = ((float) iArr[i2]) / ((float) a);
            i2++;
            if (i != 0) {
                break;
            }
        }
        float f = Float.MAX_VALUE;
        a = -1;
        i2 = 0;
        while (i2 < a.length) {
            float f2 = 0.0f;
            float[] fArr2 = a[i2];
            int i3 = 0;
            while (i3 < 8) {
                float f3 = fArr2[i3] - fArr[i3];
                f2 += f3 * f3;
                if (f2 >= f && i == 0) {
                    break;
                }
                i3++;
                if (i != 0) {
                    break;
                }
            }
            if (f2 < f) {
                a = Q.d[i2];
                f = f2;
            }
            i2++;
            if (i != 0) {
                break;
            }
        }
        return a;
    }
}
