package com.google;

public final class a1 extends aH {
    static final int[] j;
    private final int[] i;

    private static void a(StringBuilder stringBuilder, int i) {
        int i2 = aU.a;
        int i3 = 0;
        while (i3 < 10) {
            if (i != j[i3]) {
                i3++;
                if (i2 != 0) {
                    break;
                }
            }
            stringBuilder.insert(0, (char) (i3 + 48));
            return;
        }
        throw aN.a();
    }

    public a1() {
        this.i = new int[4];
    }

    protected int a(d_ d_Var, int[] iArr, StringBuilder stringBuilder) {
        int i;
        int i2 = aU.a;
        int[] iArr2 = this.i;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int d = d_Var.d();
        int i3 = 0;
        int i4 = 0;
        int i5 = iArr[1];
        while (i3 < 6 && i5 < d) {
            int a = aH.a(d_Var, iArr2, i5, g);
            stringBuilder.append((char) ((a % 10) + 48));
            int length = iArr2.length;
            i = 0;
            while (i < length) {
                i5 += iArr2[i];
                i++;
                if (i2 != 0) {
                    break;
                }
            }
            if (a >= 10) {
                i4 |= 1 << (5 - i3);
            }
            i = i3 + 1;
            if (i2 != 0) {
                break;
            }
            i3 = i;
        }
        a(stringBuilder, i4);
        i = 0;
        i4 = aH.a(d_Var, i5, true, d)[1];
        while (i < 6 && i4 < d) {
            stringBuilder.append((char) (aH.a(d_Var, iArr2, i4, f) + 48));
            i3 = iArr2.length;
            i5 = 0;
            while (i5 < i3) {
                i4 += iArr2[i5];
                i5++;
                if (i2 != 0) {
                    break;
                }
            }
            i5 = i + 1;
            if (i2 != 0) {
                break;
            }
            i = i5;
        }
        return i4;
    }

    static {
        j = new int[]{0, 11, 13, 14, 19, 25, 28, 21, 22, 26};
    }

    gg a() {
        return gg.EAN_13;
    }
}
