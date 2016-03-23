package com.google;

public final class aQ extends aH {
    private final int[] i;

    gg a() {
        return gg.EAN_8;
    }

    public aQ() {
        this.i = new int[4];
    }

    protected int a(d_ d_Var, int[] iArr, StringBuilder stringBuilder) {
        int i = aU.a;
        int[] iArr2 = this.i;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int d = d_Var.d();
        int i2 = iArr[1];
        int i3 = 0;
        while (i3 < 4 && i2 < d) {
            stringBuilder.append((char) (aH.a(d_Var, iArr2, i2, f) + 48));
            int length = iArr2.length;
            int i4 = 0;
            while (i4 < length) {
                i2 += iArr2[i4];
                i4++;
                if (i != 0) {
                    break;
                }
            }
            i4 = i3 + 1;
            if (i != 0) {
                break;
            }
            i3 = i4;
        }
        i2 = aH.a(d_Var, i2, true, d)[1];
        i3 = 0;
        while (i3 < 4 && i2 < d) {
            stringBuilder.append((char) (aH.a(d_Var, iArr2, i2, f) + 48));
            length = iArr2.length;
            i4 = 0;
            while (i4 < length) {
                i2 += iArr2[i4];
                i4++;
                if (i != 0) {
                    break;
                }
            }
            i4 = i3 + 1;
            if (i != 0) {
                break;
            }
            i3 = i4;
        }
        return i2;
    }
}
