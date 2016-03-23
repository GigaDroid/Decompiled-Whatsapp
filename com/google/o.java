package com.google;

import java.util.EnumMap;
import java.util.Map;

final class o {
    private final StringBuilder a;
    private final int[] b;

    private static Map a(String str) {
        if (str.length() != 2) {
            return null;
        }
        Map enumMap = new EnumMap(eD.class);
        enumMap.put(eD.ISSUE_NUMBER, Integer.valueOf(str));
        return enumMap;
    }

    o() {
        this.b = new int[4];
        this.a = new StringBuilder();
    }

    int a(d_ d_Var, int[] iArr, StringBuilder stringBuilder) {
        int i = aU.a;
        int[] iArr2 = this.b;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int d = d_Var.d();
        int i2 = 0;
        int i3 = 0;
        int i4 = iArr[1];
        while (i2 < 2 && i4 < d) {
            int a = aH.a(d_Var, iArr2, i4, aH.g);
            stringBuilder.append((char) ((a % 10) + 48));
            int length = iArr2.length;
            int i5 = 0;
            while (i5 < length) {
                i4 += iArr2[i5];
                i5++;
                if (i != 0) {
                    break;
                }
            }
            if (a >= 10) {
                i3 |= 1 << (1 - i2);
            }
            if (i2 != 1) {
                i4 = d_Var.d(d_Var.c(i4));
            }
            i5 = i2 + 1;
            if (i != 0) {
                break;
            }
            i2 = i5;
        }
        if (stringBuilder.length() != 2) {
            throw aN.a();
        } else if (Integer.parseInt(stringBuilder.toString()) % 4 == i3) {
            return i4;
        } else {
            throw aN.a();
        }
    }

    f6 a(int i, d_ d_Var, int[] iArr) {
        StringBuilder stringBuilder = this.a;
        stringBuilder.setLength(0);
        int a = a(d_Var, iArr, stringBuilder);
        String stringBuilder2 = stringBuilder.toString();
        Map a2 = a(stringBuilder2);
        f6 f6Var = new f6(stringBuilder2, null, new fI[]{new fI(((float) (iArr[0] + iArr[1])) / 2.0f, (float) i), new fI((float) a, (float) i)}, gg.UPC_EAN_EXTENSION);
        if (a2 != null) {
            f6Var.a(a2);
        }
        return f6Var;
    }
}
