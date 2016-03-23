package com.google;

public abstract class a3 extends aU {
    private final float[] b;
    private final int[] c;
    private final int[] d;
    private final int[] e;
    private final int[] f;
    private final float[] g;

    protected static boolean b(int[] iArr) {
        int i = fx.a;
        int i2 = iArr[0] + iArr[1];
        float f = ((float) i2) / ((float) ((iArr[2] + i2) + iArr[3]));
        if (f < 0.7916667f || f > 0.89285713f) {
            return false;
        }
        int i3 = Integer.MAX_VALUE;
        i2 = Integer.MIN_VALUE;
        int length = iArr.length;
        int i4 = 0;
        while (i4 < length) {
            int i5 = iArr[i4];
            if (i5 > i2) {
                i2 = i5;
            }
            if (i5 < i3) {
                i3 = i5;
            }
            i5 = i4 + 1;
            if (i != 0) {
                break;
            }
            i4 = i5;
        }
        if (i2 < i3 * 10) {
            return true;
        }
        return false;
    }

    protected static int a(int[] iArr) {
        int i = 0;
        int i2 = fx.a;
        int length = iArr.length;
        int i3 = 0;
        while (i3 < length) {
            i += iArr[i3];
            i3++;
            if (i2 != 0) {
                break;
            }
        }
        return i;
    }

    protected a3() {
        int i = fx.a;
        this.f = new int[4];
        this.c = new int[8];
        this.b = new float[4];
        this.g = new float[4];
        this.e = new int[(this.c.length / 2)];
        this.d = new int[(this.c.length / 2)];
        if (aK.a) {
            fx.a = i + 1;
        }
    }

    protected static void b(int[] iArr, float[] fArr) {
        int i = 0;
        int i2 = fx.a;
        float f = fArr[0];
        int i3 = 1;
        while (i3 < iArr.length) {
            if (fArr[i3] > f) {
                f = fArr[i3];
                i = i3;
            }
            i3++;
            if (i2 != 0) {
                break;
            }
        }
        iArr[i] = iArr[i] + 1;
    }

    protected static void a(int[] iArr, float[] fArr) {
        int i = 0;
        int i2 = fx.a;
        float f = fArr[0];
        int i3 = 1;
        while (i3 < iArr.length) {
            if (fArr[i3] < f) {
                f = fArr[i3];
                i = i3;
            }
            i3++;
            if (i2 != 0) {
                break;
            }
        }
        iArr[i] = iArr[i] - 1;
    }

    protected final float[] a() {
        return this.b;
    }

    protected final int[] f() {
        return this.d;
    }

    protected final int[] b() {
        return this.c;
    }

    protected final int[] d() {
        return this.f;
    }

    protected final float[] e() {
        return this.g;
    }

    protected static int a(int[] iArr, int[][] iArr2) {
        int i = fx.a;
        int i2 = 0;
        while (i2 < iArr2.length) {
            if (aU.a(iArr, iArr2[i2], 0.45f) >= 0.2f) {
                i2++;
                if (i != 0) {
                    break;
                }
            }
            return i2;
        }
        throw aN.a();
    }

    protected final int[] c() {
        return this.e;
    }
}
