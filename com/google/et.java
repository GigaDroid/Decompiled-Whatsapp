package com.google;

public final class et extends e8 {
    public hX a(hX hXVar, int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        return a(hXVar, i, i2, gU.a(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16));
    }

    public hX a(hX hXVar, int i, int i2, gU gUVar) {
        boolean z = d_.a;
        if (i <= 0 || i2 <= 0) {
            try {
                throw aN.a();
            } catch (ArrayIndexOutOfBoundsException e) {
                throw e;
            }
        }
        hX hXVar2 = new hX(i, i2);
        float[] fArr = new float[(i * 2)];
        int i3 = 0;
        while (i3 < i2) {
            int length = fArr.length;
            float f = ((float) i3) + 0.5f;
            int i4 = 0;
            while (i4 < length) {
                fArr[i4] = ((float) (i4 / 2)) + 0.5f;
                fArr[i4 + 1] = f;
                i4 += 2;
                if (z) {
                    break;
                }
            }
            gUVar.a(fArr);
            e8.a(hXVar, fArr);
            i4 = 0;
            while (i4 < length) {
                try {
                    if (hXVar.a((int) fArr[i4], (int) fArr[i4 + 1])) {
                        hXVar2.c(i4 / 2, i3);
                    }
                    i4 += 2;
                    if (z) {
                        break;
                    }
                } catch (ArrayIndexOutOfBoundsException e2) {
                    throw e2;
                } catch (ArrayIndexOutOfBoundsException e3) {
                    throw aN.a();
                }
            }
            i4 = i3 + 1;
            if (z) {
                break;
            }
            i3 = i4;
        }
        return hXVar2;
    }
}
