package com.google;

import com.whatsapp.arj;

public final class fQ {
    public static boolean b;
    private static final int[] e;
    private static final fQ[] f;
    private final fu[] a;
    private final int c;
    private final int d;
    private final int[] g;

    public static fQ b(int i) {
        if (i >= 1 && i <= 40) {
            return f[i - 1];
        }
        try {
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public fu a(hP hPVar) {
        return this.a[hPVar.ordinal()];
    }

    hX c() {
        boolean z = false;
        boolean z2 = b;
        int d = d();
        hX hXVar = new hX(d);
        hXVar.a(0, 0, 9, 9);
        hXVar.a(d - 8, 0, 8, 9);
        hXVar.a(0, d - 8, 9, 8);
        int length = this.g.length;
        int i = 0;
        while (i < length) {
            int i2 = this.g[i] - 2;
            int i3 = 0;
            while (i3 < length) {
                if (!((i == 0 && (i3 == 0 || i3 == length - 1)) || (i == length - 1 && i3 == 0 && !z2))) {
                    try {
                        hXVar.a(this.g[i3] - 2, i2, 5, 5);
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                }
                i3++;
                if (z2) {
                    break;
                }
            }
            i3 = i + 1;
            if (z2) {
                break;
            }
            i = i3;
        }
        try {
            hXVar.a(6, 9, 1, d - 17);
            hXVar.a(9, 6, d - 17, 1);
            if (this.d > 6) {
                hXVar.a(d - 11, 0, 3, 6);
                hXVar.a(0, d - 11, 6, 3);
            }
            try {
                if (aK.a) {
                    if (!z2) {
                        z = true;
                    }
                    b = z;
                }
                return hXVar;
            } catch (IllegalArgumentException e2) {
                throw e2;
            } catch (IllegalArgumentException e22) {
                throw e22;
            }
        } catch (IllegalArgumentException e222) {
            throw e222;
        }
    }

    public String toString() {
        return String.valueOf(this.d);
    }

    public int f() {
        return this.c;
    }

    private static fQ[] e() {
        r0 = new fQ[40];
        int[] iArr = new int[0];
        fu[] fuVarArr = new fu[4];
        fuVarArr[0] = new fu(7, new b[]{new b(1, 19)});
        fuVarArr[1] = new fu(10, new b[]{new b(1, 16)});
        fuVarArr[2] = new fu(13, new b[]{new b(1, 13)});
        fuVarArr[3] = new fu(17, new b[]{new b(1, 9)});
        r0[0] = new fQ(1, iArr, fuVarArr);
        iArr = new int[]{6, 18};
        fuVarArr = new fu[4];
        fuVarArr[0] = new fu(10, new b[]{new b(1, 34)});
        fuVarArr[1] = new fu(16, new b[]{new b(1, 28)});
        fuVarArr[2] = new fu(22, new b[]{new b(1, 22)});
        fuVarArr[3] = new fu(28, new b[]{new b(1, 16)});
        r0[1] = new fQ(2, iArr, fuVarArr);
        iArr = new int[]{6, 22};
        fuVarArr = new fu[4];
        fuVarArr[0] = new fu(15, new b[]{new b(1, 55)});
        fuVarArr[1] = new fu(26, new b[]{new b(1, 44)});
        fuVarArr[2] = new fu(18, new b[]{new b(2, 17)});
        fuVarArr[3] = new fu(22, new b[]{new b(2, 13)});
        r0[2] = new fQ(3, iArr, fuVarArr);
        iArr = new int[]{6, 26};
        fuVarArr = new fu[4];
        fuVarArr[0] = new fu(20, new b[]{new b(1, 80)});
        fuVarArr[1] = new fu(18, new b[]{new b(2, 32)});
        fuVarArr[2] = new fu(26, new b[]{new b(2, 24)});
        fuVarArr[3] = new fu(16, new b[]{new b(4, 9)});
        r0[3] = new fQ(4, iArr, fuVarArr);
        iArr = new int[]{6, 30};
        fuVarArr = new fu[4];
        fuVarArr[0] = new fu(26, new b[]{new b(1, arj.Theme_spinnerStyle)});
        fuVarArr[1] = new fu(24, new b[]{new b(2, 43)});
        fuVarArr[2] = new fu(18, new b[]{new b(2, 15), new b(2, 16)});
        fuVarArr[3] = new fu(22, new b[]{new b(2, 11), new b(2, 12)});
        r0[4] = new fQ(5, iArr, fuVarArr);
        iArr = new int[]{6, 34};
        fuVarArr = new fu[4];
        fuVarArr[0] = new fu(18, new b[]{new b(2, 68)});
        fuVarArr[1] = new fu(16, new b[]{new b(4, 27)});
        fuVarArr[2] = new fu(24, new b[]{new b(4, 19)});
        fuVarArr[3] = new fu(28, new b[]{new b(4, 15)});
        r0[5] = new fQ(6, iArr, fuVarArr);
        iArr = new int[]{6, 22, 38};
        fuVarArr = new fu[4];
        fuVarArr[0] = new fu(20, new b[]{new b(2, 78)});
        fuVarArr[1] = new fu(18, new b[]{new b(4, 31)});
        fuVarArr[2] = new fu(18, new b[]{new b(2, 14), new b(4, 15)});
        fuVarArr[3] = new fu(26, new b[]{new b(4, 13), new b(1, 14)});
        r0[6] = new fQ(7, iArr, fuVarArr);
        iArr = new int[]{6, 24, 42};
        fuVarArr = new fu[4];
        fuVarArr[0] = new fu(24, new b[]{new b(2, 97)});
        fuVarArr[1] = new fu(22, new b[]{new b(2, 38), new b(2, 39)});
        fuVarArr[2] = new fu(22, new b[]{new b(4, 18), new b(2, 19)});
        fuVarArr[3] = new fu(26, new b[]{new b(4, 14), new b(2, 15)});
        r0[7] = new fQ(8, iArr, fuVarArr);
        iArr = new int[]{6, 26, 46};
        fuVarArr = new fu[4];
        fuVarArr[0] = new fu(30, new b[]{new b(2, 116)});
        fuVarArr[1] = new fu(22, new b[]{new b(3, 36), new b(2, 37)});
        fuVarArr[2] = new fu(20, new b[]{new b(4, 16), new b(4, 17)});
        fuVarArr[3] = new fu(24, new b[]{new b(4, 12), new b(4, 13)});
        r0[8] = new fQ(9, iArr, fuVarArr);
        iArr = new int[]{6, 28, 50};
        fuVarArr = new fu[4];
        fuVarArr[0] = new fu(18, new b[]{new b(2, 68), new b(2, 69)});
        fuVarArr[1] = new fu(26, new b[]{new b(4, 43), new b(1, 44)});
        fuVarArr[2] = new fu(24, new b[]{new b(6, 19), new b(2, 20)});
        fuVarArr[3] = new fu(28, new b[]{new b(6, 15), new b(2, 16)});
        r0[9] = new fQ(10, iArr, fuVarArr);
        iArr = new int[]{6, 30, 54};
        fuVarArr = new fu[4];
        fuVarArr[0] = new fu(20, new b[]{new b(4, 81)});
        fuVarArr[1] = new fu(30, new b[]{new b(1, 50), new b(4, 51)});
        fuVarArr[2] = new fu(28, new b[]{new b(4, 22), new b(4, 23)});
        fuVarArr[3] = new fu(24, new b[]{new b(3, 12), new b(8, 13)});
        r0[10] = new fQ(11, iArr, fuVarArr);
        iArr = new int[]{6, 32, 58};
        fuVarArr = new fu[4];
        fuVarArr[0] = new fu(24, new b[]{new b(2, 92), new b(2, 93)});
        fuVarArr[1] = new fu(22, new b[]{new b(6, 36), new b(2, 37)});
        fuVarArr[2] = new fu(26, new b[]{new b(4, 20), new b(6, 21)});
        fuVarArr[3] = new fu(28, new b[]{new b(7, 14), new b(4, 15)});
        r0[11] = new fQ(12, iArr, fuVarArr);
        iArr = new int[]{6, 34, 62};
        fuVarArr = new fu[4];
        fuVarArr[0] = new fu(26, new b[]{new b(4, arj.Theme_seekBarStyle)});
        fuVarArr[1] = new fu(22, new b[]{new b(8, 37), new b(1, 38)});
        fuVarArr[2] = new fu(24, new b[]{new b(8, 20), new b(4, 21)});
        fuVarArr[3] = new fu(22, new b[]{new b(12, 11), new b(4, 12)});
        r0[12] = new fQ(13, iArr, fuVarArr);
        iArr = new int[]{6, 26, 46, 66};
        fuVarArr = new fu[4];
        fuVarArr[0] = new fu(30, new b[]{new b(3, 115), new b(1, 116)});
        fuVarArr[1] = new fu(24, new b[]{new b(4, 40), new b(5, 41)});
        fuVarArr[2] = new fu(20, new b[]{new b(11, 16), new b(5, 17)});
        fuVarArr[3] = new fu(24, new b[]{new b(11, 12), new b(5, 13)});
        r0[13] = new fQ(14, iArr, fuVarArr);
        iArr = new int[]{6, 26, 48, 70};
        fuVarArr = new fu[4];
        fuVarArr[0] = new fu(22, new b[]{new b(5, 87), new b(1, 88)});
        fuVarArr[1] = new fu(24, new b[]{new b(5, 41), new b(5, 42)});
        fuVarArr[2] = new fu(30, new b[]{new b(5, 24), new b(7, 25)});
        fuVarArr[3] = new fu(24, new b[]{new b(11, 12), new b(7, 13)});
        r0[14] = new fQ(15, iArr, fuVarArr);
        iArr = new int[]{6, 26, 50, 74};
        fuVarArr = new fu[4];
        fuVarArr[0] = new fu(24, new b[]{new b(5, 98), new b(1, 99)});
        fuVarArr[1] = new fu(28, new b[]{new b(7, 45), new b(3, 46)});
        fuVarArr[2] = new fu(24, new b[]{new b(15, 19), new b(2, 20)});
        fuVarArr[3] = new fu(30, new b[]{new b(3, 15), new b(13, 16)});
        r0[15] = new fQ(16, iArr, fuVarArr);
        iArr = new int[]{6, 30, 54, 78};
        fuVarArr = new fu[4];
        fuVarArr[0] = new fu(28, new b[]{new b(1, arj.Theme_seekBarStyle), new b(5, arj.Theme_spinnerStyle)});
        fuVarArr[1] = new fu(28, new b[]{new b(10, 46), new b(1, 47)});
        fuVarArr[2] = new fu(28, new b[]{new b(1, 22), new b(15, 23)});
        fuVarArr[3] = new fu(28, new b[]{new b(2, 14), new b(17, 15)});
        r0[16] = new fQ(17, iArr, fuVarArr);
        iArr = new int[]{6, 30, 56, 82};
        fuVarArr = new fu[4];
        fuVarArr[0] = new fu(30, new b[]{new b(5, 120), new b(1, 121)});
        fuVarArr[1] = new fu(26, new b[]{new b(9, 43), new b(4, 44)});
        fuVarArr[2] = new fu(28, new b[]{new b(17, 22), new b(1, 23)});
        fuVarArr[3] = new fu(28, new b[]{new b(2, 14), new b(19, 15)});
        r0[17] = new fQ(18, iArr, fuVarArr);
        iArr = new int[]{6, 30, 58, 86};
        fuVarArr = new fu[4];
        fuVarArr[0] = new fu(28, new b[]{new b(3, 113), new b(4, 114)});
        fuVarArr[1] = new fu(26, new b[]{new b(3, 44), new b(11, 45)});
        fuVarArr[2] = new fu(26, new b[]{new b(17, 21), new b(4, 22)});
        fuVarArr[3] = new fu(26, new b[]{new b(9, 13), new b(16, 14)});
        r0[18] = new fQ(19, iArr, fuVarArr);
        iArr = new int[]{6, 34, 62, 90};
        fuVarArr = new fu[4];
        fuVarArr[0] = new fu(28, new b[]{new b(3, arj.Theme_seekBarStyle), new b(5, arj.Theme_spinnerStyle)});
        fuVarArr[1] = new fu(26, new b[]{new b(3, 41), new b(13, 42)});
        fuVarArr[2] = new fu(30, new b[]{new b(15, 24), new b(5, 25)});
        fuVarArr[3] = new fu(28, new b[]{new b(15, 15), new b(10, 16)});
        r0[19] = new fQ(20, iArr, fuVarArr);
        iArr = new int[]{6, 28, 50, 72, 94};
        fuVarArr = new fu[4];
        fuVarArr[0] = new fu(28, new b[]{new b(4, 116), new b(4, 117)});
        fuVarArr[1] = new fu(26, new b[]{new b(17, 42)});
        fuVarArr[2] = new fu(28, new b[]{new b(17, 22), new b(6, 23)});
        fuVarArr[3] = new fu(30, new b[]{new b(19, 16), new b(6, 17)});
        r0[20] = new fQ(21, iArr, fuVarArr);
        iArr = new int[]{6, 26, 50, 74, 98};
        fuVarArr = new fu[4];
        fuVarArr[0] = new fu(28, new b[]{new b(2, 111), new b(7, 112)});
        fuVarArr[1] = new fu(28, new b[]{new b(17, 46)});
        fuVarArr[2] = new fu(30, new b[]{new b(7, 24), new b(16, 25)});
        fuVarArr[3] = new fu(24, new b[]{new b(34, 13)});
        r0[21] = new fQ(22, iArr, fuVarArr);
        iArr = new int[]{6, 30, 54, 78, arj.Theme_checkboxStyle};
        fuVarArr = new fu[4];
        fuVarArr[0] = new fu(30, new b[]{new b(4, 121), new b(5, 122)});
        fuVarArr[1] = new fu(28, new b[]{new b(4, 47), new b(14, 48)});
        fuVarArr[2] = new fu(30, new b[]{new b(11, 24), new b(14, 25)});
        fuVarArr[3] = new fu(30, new b[]{new b(16, 15), new b(14, 16)});
        r0[22] = new fQ(23, iArr, fuVarArr);
        iArr = new int[]{6, 28, 54, 80, arj.Theme_ratingBarStyle};
        fuVarArr = new fu[4];
        fuVarArr[0] = new fu(30, new b[]{new b(6, 117), new b(4, 118)});
        fuVarArr[1] = new fu(28, new b[]{new b(6, 45), new b(14, 46)});
        fuVarArr[2] = new fu(30, new b[]{new b(11, 24), new b(16, 25)});
        fuVarArr[3] = new fu(30, new b[]{new b(30, 16), new b(2, 17)});
        r0[23] = new fQ(24, iArr, fuVarArr);
        iArr = new int[]{6, 32, 58, 84, 110};
        fuVarArr = new fu[4];
        fuVarArr[0] = new fu(26, new b[]{new b(8, arj.Theme_ratingBarStyle), new b(4, arj.Theme_seekBarStyle)});
        fuVarArr[1] = new fu(28, new b[]{new b(8, 47), new b(13, 48)});
        fuVarArr[2] = new fu(30, new b[]{new b(7, 24), new b(22, 25)});
        fuVarArr[3] = new fu(30, new b[]{new b(22, 15), new b(13, 16)});
        r0[24] = new fQ(25, iArr, fuVarArr);
        iArr = new int[]{6, 30, 58, 86, 114};
        fuVarArr = new fu[4];
        fuVarArr[0] = new fu(28, new b[]{new b(10, 114), new b(2, 115)});
        fuVarArr[1] = new fu(28, new b[]{new b(19, 46), new b(4, 47)});
        fuVarArr[2] = new fu(28, new b[]{new b(28, 22), new b(6, 23)});
        fuVarArr[3] = new fu(30, new b[]{new b(33, 16), new b(4, 17)});
        r0[25] = new fQ(26, iArr, fuVarArr);
        iArr = new int[]{6, 34, 62, 90, 118};
        fuVarArr = new fu[4];
        fuVarArr[0] = new fu(30, new b[]{new b(8, 122), new b(4, 123)});
        fuVarArr[1] = new fu(28, new b[]{new b(22, 45), new b(3, 46)});
        fuVarArr[2] = new fu(30, new b[]{new b(8, 23), new b(26, 24)});
        fuVarArr[3] = new fu(30, new b[]{new b(12, 15), new b(28, 16)});
        r0[26] = new fQ(27, iArr, fuVarArr);
        iArr = new int[]{6, 26, 50, 74, 98, 122};
        fuVarArr = new fu[4];
        fuVarArr[0] = new fu(30, new b[]{new b(3, 117), new b(10, 118)});
        fuVarArr[1] = new fu(28, new b[]{new b(3, 45), new b(23, 46)});
        fuVarArr[2] = new fu(30, new b[]{new b(4, 24), new b(31, 25)});
        fuVarArr[3] = new fu(30, new b[]{new b(11, 15), new b(31, 16)});
        r0[27] = new fQ(28, iArr, fuVarArr);
        iArr = new int[]{6, 30, 54, 78, arj.Theme_checkboxStyle, 126};
        fuVarArr = new fu[4];
        fuVarArr[0] = new fu(30, new b[]{new b(7, 116), new b(7, 117)});
        fuVarArr[1] = new fu(28, new b[]{new b(21, 45), new b(7, 46)});
        fuVarArr[2] = new fu(30, new b[]{new b(1, 23), new b(37, 24)});
        fuVarArr[3] = new fu(30, new b[]{new b(19, 15), new b(26, 16)});
        r0[28] = new fQ(29, iArr, fuVarArr);
        iArr = new int[]{6, 26, 52, 78, arj.Theme_editTextStyle, 130};
        fuVarArr = new fu[4];
        fuVarArr[0] = new fu(30, new b[]{new b(5, 115), new b(10, 116)});
        fuVarArr[1] = new fu(28, new b[]{new b(19, 47), new b(10, 48)});
        fuVarArr[2] = new fu(30, new b[]{new b(15, 24), new b(25, 25)});
        fuVarArr[3] = new fu(30, new b[]{new b(23, 15), new b(25, 16)});
        r0[29] = new fQ(30, iArr, fuVarArr);
        iArr = new int[]{6, 30, 56, 82, arj.Theme_spinnerStyle, 134};
        fuVarArr = new fu[4];
        fuVarArr[0] = new fu(30, new b[]{new b(13, 115), new b(3, 116)});
        fuVarArr[1] = new fu(28, new b[]{new b(2, 46), new b(29, 47)});
        fuVarArr[2] = new fu(30, new b[]{new b(42, 24), new b(1, 25)});
        fuVarArr[3] = new fu(30, new b[]{new b(23, 15), new b(28, 16)});
        r0[30] = new fQ(31, iArr, fuVarArr);
        iArr = new int[]{6, 34, 60, 86, 112, 138};
        fuVarArr = new fu[4];
        fuVarArr[0] = new fu(30, new b[]{new b(17, 115)});
        fuVarArr[1] = new fu(28, new b[]{new b(10, 46), new b(23, 47)});
        fuVarArr[2] = new fu(30, new b[]{new b(10, 24), new b(35, 25)});
        fuVarArr[3] = new fu(30, new b[]{new b(19, 15), new b(35, 16)});
        r0[31] = new fQ(32, iArr, fuVarArr);
        iArr = new int[]{6, 30, 58, 86, 114, 142};
        fuVarArr = new fu[4];
        fuVarArr[0] = new fu(30, new b[]{new b(17, 115), new b(1, 116)});
        fuVarArr[1] = new fu(28, new b[]{new b(14, 46), new b(21, 47)});
        fuVarArr[2] = new fu(30, new b[]{new b(29, 24), new b(19, 25)});
        fuVarArr[3] = new fu(30, new b[]{new b(11, 15), new b(46, 16)});
        r0[32] = new fQ(33, iArr, fuVarArr);
        iArr = new int[]{6, 34, 62, 90, 118, 146};
        fuVarArr = new fu[4];
        fuVarArr[0] = new fu(30, new b[]{new b(13, 115), new b(6, 116)});
        fuVarArr[1] = new fu(28, new b[]{new b(14, 46), new b(23, 47)});
        fuVarArr[2] = new fu(30, new b[]{new b(44, 24), new b(7, 25)});
        fuVarArr[3] = new fu(30, new b[]{new b(59, 16), new b(1, 17)});
        r0[33] = new fQ(34, iArr, fuVarArr);
        iArr = new int[]{6, 30, 54, 78, arj.Theme_checkboxStyle, 126, 150};
        fuVarArr = new fu[4];
        fuVarArr[0] = new fu(30, new b[]{new b(12, 121), new b(7, 122)});
        fuVarArr[1] = new fu(28, new b[]{new b(12, 47), new b(26, 48)});
        fuVarArr[2] = new fu(30, new b[]{new b(39, 24), new b(14, 25)});
        fuVarArr[3] = new fu(30, new b[]{new b(22, 15), new b(41, 16)});
        r0[34] = new fQ(35, iArr, fuVarArr);
        iArr = new int[]{6, 24, 50, 76, arj.Theme_checkboxStyle, 128, 154};
        fuVarArr = new fu[4];
        fuVarArr[0] = new fu(30, new b[]{new b(6, 121), new b(14, 122)});
        fuVarArr[1] = new fu(28, new b[]{new b(6, 47), new b(34, 48)});
        fuVarArr[2] = new fu(30, new b[]{new b(46, 24), new b(10, 25)});
        fuVarArr[3] = new fu(30, new b[]{new b(2, 15), new b(64, 16)});
        r0[35] = new fQ(36, iArr, fuVarArr);
        iArr = new int[]{6, 28, 54, 80, arj.Theme_ratingBarStyle, 132, 158};
        fuVarArr = new fu[4];
        fuVarArr[0] = new fu(30, new b[]{new b(17, 122), new b(4, 123)});
        fuVarArr[1] = new fu(28, new b[]{new b(29, 46), new b(14, 47)});
        fuVarArr[2] = new fu(30, new b[]{new b(49, 24), new b(10, 25)});
        fuVarArr[3] = new fu(30, new b[]{new b(24, 15), new b(46, 16)});
        r0[36] = new fQ(37, iArr, fuVarArr);
        iArr = new int[]{6, 32, 58, 84, 110, 136, 162};
        fuVarArr = new fu[4];
        fuVarArr[0] = new fu(30, new b[]{new b(4, 122), new b(18, 123)});
        fuVarArr[1] = new fu(28, new b[]{new b(13, 46), new b(32, 47)});
        fuVarArr[2] = new fu(30, new b[]{new b(48, 24), new b(14, 25)});
        fuVarArr[3] = new fu(30, new b[]{new b(42, 15), new b(32, 16)});
        r0[37] = new fQ(38, iArr, fuVarArr);
        iArr = new int[]{6, 26, 54, 82, 110, 138, 166};
        fuVarArr = new fu[4];
        fuVarArr[0] = new fu(30, new b[]{new b(20, 117), new b(4, 118)});
        fuVarArr[1] = new fu(28, new b[]{new b(40, 47), new b(7, 48)});
        fuVarArr[2] = new fu(30, new b[]{new b(43, 24), new b(22, 25)});
        fuVarArr[3] = new fu(30, new b[]{new b(10, 15), new b(67, 16)});
        r0[38] = new fQ(39, iArr, fuVarArr);
        iArr = new int[]{6, 30, 58, 86, 114, 142, 170};
        fuVarArr = new fu[4];
        fuVarArr[0] = new fu(30, new b[]{new b(19, 118), new b(6, 119)});
        fuVarArr[1] = new fu(28, new b[]{new b(18, 47), new b(31, 48)});
        fuVarArr[2] = new fu(30, new b[]{new b(34, 24), new b(34, 25)});
        fuVarArr[3] = new fu(30, new b[]{new b(20, 15), new b(61, 16)});
        r0[39] = new fQ(40, iArr, fuVarArr);
        return r0;
    }

    public int d() {
        return (this.d * 4) + 17;
    }

    public static fQ c(int i) {
        try {
            if (i % 4 != 1) {
                throw aG.a();
            }
            try {
                return b((i - 17) / 4);
            } catch (IllegalArgumentException e) {
                throw aG.a();
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    static {
        e = new int[]{31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 68472, 70749, 76311, 79154, 84390, 87683, 92361, 96236, 102084, 102881, 110507, 110734, 117786, 119615, 126325, 127568, 133589, 136944, 141498, 145311, 150283, 152622, 158308, 161089, 167017};
        f = e();
    }

    public int a() {
        return this.d;
    }

    static fQ a(int i) {
        int i2 = 0;
        boolean z = b;
        int i3 = Integer.MAX_VALUE;
        int i4 = 0;
        while (i2 < e.length) {
            int i5 = e[i2];
            if (i5 != i) {
                i5 = dh.c(i, i5);
                if (i5 < i3) {
                    i4 = i2 + 7;
                    i3 = i5;
                }
                i2++;
                if (z) {
                    break;
                }
            }
            try {
                return b(i2 + 7);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        if (i3 > 3) {
            return null;
        }
        try {
            return b(i4);
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public int[] b() {
        return this.g;
    }

    private fQ(int i, int[] iArr, fu[] fuVarArr) {
        int i2 = 0;
        this.d = i;
        this.g = iArr;
        this.a = fuVarArr;
        int d = fuVarArr[0].d();
        b[] b = fuVarArr[0].b();
        int length = b.length;
        int i3 = 0;
        while (i2 < length) {
            b bVar = b[i2];
            i3 += (bVar.a() + d) * bVar.b();
            i2++;
        }
        this.c = i3;
    }
}
