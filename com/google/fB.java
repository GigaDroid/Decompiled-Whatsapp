package com.google;

import com.whatsapp.arj;
import org.v;
import org.whispersystems.at;

final class fB {
    private static final int[][] a;
    private static final int[][] b;
    private static final int[][] c;
    private static final int[][] d;
    private static final String[] z;

    private static void a(int i, int i2, dG dGVar) {
        int i3 = dG.c;
        int i4 = 0;
        while (i4 < 5) {
            int i5 = 0;
            while (i5 < 5) {
                dGVar.a(i + i5, i2 + i4, b[i4][i5]);
                i5++;
                if (i3 != 0) {
                    break;
                }
            }
            i5 = i4 + 1;
            if (i3 == 0) {
                i4 = i5;
            } else {
                return;
            }
        }
    }

    private static void d(dG dGVar) {
        int length = d[0].length;
        c(0, 0, dGVar);
        c(dGVar.b() - length, 0, dGVar);
        c(0, dGVar.b() - length, dGVar);
        d(0, 7, dGVar);
        d(dGVar.b() - 8, 7, dGVar);
        d(0, dGVar.b() - 8, dGVar);
        b(7, 0, dGVar);
        b((dGVar.c() - 7) - 1, 0, dGVar);
        b(7, dGVar.c() - 7, dGVar);
    }

    static void a(d_ d_Var, hP hPVar, fQ fQVar, int i, dG dGVar) {
        c(dGVar);
        a(fQVar, dGVar);
        a(hPVar, i, dGVar);
        b(fQVar, dGVar);
        a(d_Var, i, dGVar);
    }

    private static void c(fQ fQVar, dG dGVar) {
        int i = dG.c;
        try {
            if (fQVar.a() >= 2) {
                int a = fQVar.a() - 1;
                int[] iArr = c[a];
                int length = c[a].length;
                int i2 = 0;
                while (i2 < length) {
                    a = 0;
                    while (a < length) {
                        int i3 = iArr[i2];
                        int i4 = iArr[a];
                        if (!(i4 == -1 || (i3 == -1 && i == 0))) {
                            try {
                                if (a(dGVar.a(i4, i3))) {
                                    a(i4 - 2, i3 - 2, dGVar);
                                }
                            } catch (IllegalArgumentException e) {
                                throw e;
                            }
                        }
                        a++;
                        if (i != 0) {
                            break;
                        }
                    }
                    a = i2 + 1;
                    if (i == 0) {
                        i2 = a;
                    } else {
                        return;
                    }
                }
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    static void a(hP hPVar, int i, d_ d_Var) {
        try {
            if (fY.b(i)) {
                int bits = (hPVar.getBits() << 3) | i;
                d_Var.a(bits, 5);
                d_Var.a(a(bits, 1335), 10);
                d_ d_Var2 = new d_();
                try {
                    d_Var2.a(21522, 15);
                    d_Var.a(d_Var2);
                    if (d_Var.d() != 15) {
                        throw new dC(z[3] + d_Var.d());
                    }
                    return;
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            throw new dC(z[2]);
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void a(com.google.hP r9, int r10, com.google.dG r11) {
        /*
        r1 = 0;
        r8 = 8;
        r2 = com.google.dG.c;
        r3 = new com.google.d_;
        r3.<init>();
        a(r9, r10, r3);
        r0 = r1;
    L_0x000e:
        r4 = r3.d();
        if (r0 >= r4) goto L_0x004d;
    L_0x0014:
        r4 = r3.d();
        r4 = r4 + -1;
        r4 = r4 - r0;
        r4 = r3.f(r4);
        r5 = a;
        r5 = r5[r0];
        r5 = r5[r1];
        r6 = a;
        r6 = r6[r0];
        r7 = 1;
        r6 = r6[r7];
        r11.a(r5, r6, r4);
        if (r0 >= r8) goto L_0x003d;
    L_0x0031:
        r5 = r11.b();
        r5 = r5 - r0;
        r5 = r5 + -1;
        r11.a(r5, r8, r4);
        if (r2 == 0) goto L_0x0049;
    L_0x003d:
        r5 = r11.c();
        r5 = r5 + -7;
        r6 = r0 + -8;
        r5 = r5 + r6;
        r11.a(r8, r5, r4);
    L_0x0049:
        r0 = r0 + 1;
        if (r2 == 0) goto L_0x000e;
    L_0x004d:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.fB.a(com.google.hP, int, com.google.dG):void");
    }

    static {
        String[] strArr = new String[5];
        String str = "]}#\u0000=\u007f~wB5gawC3}a\"M9w(w";
        int i = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i2 = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i3 = 0; length > i3; i3++) {
                int i4;
                char c = cArr[i3];
                switch (i3 % 5) {
                    case v.m /*0*/:
                        i4 = 19;
                        break;
                    case at.g /*1*/:
                        i4 = 18;
                        break;
                    case at.i /*2*/:
                        i4 = 87;
                        break;
                    case at.o /*3*/:
                        i4 = 32;
                        break;
                    default:
                        i4 = 92;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "Z|!A0zvwM=`ywP=gf2R2";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    i2 = 3;
                    strArr2 = strArr3;
                    str = "`z8U0w29O(3z6P,v|wB)g2 E|t}#\u001a|";
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    i2 = 4;
                    str = "`z8U0w29O(3z6P,v|wB)g2 E|t}#\u001a|";
                    i = 3;
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    d = new int[][]{new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};
                    b = new int[][]{new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};
                    c = new int[][]{new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, arj.Theme_checkboxStyle, -1, -1}, new int[]{6, 28, 54, 80, arj.Theme_ratingBarStyle, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, arj.Theme_checkboxStyle, 126, -1}, new int[]{6, 26, 52, 78, arj.Theme_editTextStyle, 130, -1}, new int[]{6, 30, 56, 82, arj.Theme_spinnerStyle, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, arj.Theme_checkboxStyle, 126, 150}, new int[]{6, 24, 50, 76, arj.Theme_checkboxStyle, 128, 154}, new int[]{6, 28, 54, 80, arj.Theme_ratingBarStyle, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};
                    a = new int[][]{new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "#2'O0j|8M5r~";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    static void b(fQ fQVar, dG dGVar) {
        int i = dG.c;
        try {
            if (fQVar.a() >= 7) {
                d_ d_Var = new d_();
                a(fQVar, d_Var);
                int i2 = 17;
                int i3 = 0;
                while (i3 < 6) {
                    int i4 = 0;
                    while (i4 < 3) {
                        boolean f = d_Var.f(i2);
                        i2--;
                        dGVar.a(i3, (dGVar.c() - 11) + i4, f);
                        dGVar.a((dGVar.c() - 11) + i4, i3, f);
                        i4++;
                        if (i != 0) {
                            break;
                        }
                    }
                    i4 = i3 + 1;
                    if (i == 0) {
                        i3 = i4;
                    } else {
                        return;
                    }
                }
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    private static boolean a(int i) {
        return i == -1;
    }

    private static void b(dG dGVar) {
        int i = dG.c;
        int i2 = 8;
        while (i2 < dGVar.b() - 8) {
            int i3 = (i2 + 1) % 2;
            try {
                if (a(dGVar.a(i2, 6))) {
                    dGVar.a(i2, 6, i3);
                }
                try {
                    if (a(dGVar.a(6, i2))) {
                        dGVar.a(6, i2, i3);
                    }
                    i2++;
                    if (i != 0) {
                        return;
                    }
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }
    }

    private static void d(int i, int i2, dG dGVar) {
        int i3 = dG.c;
        int i4 = 0;
        while (i4 < 8) {
            try {
                if (a(dGVar.a(i + i4, i2))) {
                    dGVar.a(i + i4, i2, 0);
                    i4++;
                    if (i3 != 0) {
                        return;
                    }
                }
                throw new dC();
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }

    static int b(int i) {
        int i2 = dG.c;
        int i3 = 0;
        while (i != 0) {
            i >>>= 1;
            i3++;
            if (i2 != 0) {
                break;
            }
        }
        return i3;
    }

    static void a(fQ fQVar, dG dGVar) {
        d(dGVar);
        a(dGVar);
        c(fQVar, dGVar);
        b(dGVar);
    }

    static void c(dG dGVar) {
        dGVar.a((byte) -1);
    }

    private static void b(int i, int i2, dG dGVar) {
        int i3 = dG.c;
        int i4 = 0;
        while (i4 < 7) {
            try {
                if (a(dGVar.a(i, i2 + i4))) {
                    dGVar.a(i, i2 + i4, 0);
                    i4++;
                    if (i3 != 0) {
                        return;
                    }
                }
                throw new dC();
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }

    private static void a(dG dGVar) {
        try {
            if (dGVar.a(8, dGVar.c() - 8) == null) {
                throw new dC();
            }
            dGVar.a(8, dGVar.c() - 8, 1);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    private static void c(int i, int i2, dG dGVar) {
        int i3 = dG.c;
        int i4 = 0;
        while (i4 < 7) {
            int i5 = 0;
            while (i5 < 7) {
                dGVar.a(i + i5, i2 + i4, d[i4][i5]);
                i5++;
                if (i3 != 0) {
                    break;
                }
            }
            i5 = i4 + 1;
            if (i3 == 0) {
                i4 = i5;
            } else {
                return;
            }
        }
    }

    static void a(d_ d_Var, int i, dG dGVar) {
        int i2 = dG.c;
        int b = dGVar.b() - 1;
        int c = dGVar.c() - 1;
        int i3 = -1;
        int i4 = 0;
        while (b > 0) {
            int i5;
            int i6;
            if (b == 6) {
                i5 = b - 1;
            } else {
                i5 = b;
            }
            while (c >= 0 && c < dGVar.c()) {
                i6 = 0;
                while (i6 < 2) {
                    int i7 = i5 - i6;
                    try {
                        if (a(dGVar.a(i7, c)) || i2 != 0) {
                            boolean z;
                            if (i4 < d_Var.d()) {
                                boolean f = d_Var.f(i4);
                                i4++;
                                if (i2 == 0) {
                                    boolean z2 = f;
                                    b = i4;
                                    z = z2;
                                    if (i != -1) {
                                        try {
                                            if (iM.a(i, i7, c)) {
                                                if (z) {
                                                    z = true;
                                                } else {
                                                    z = false;
                                                }
                                            }
                                        } catch (IllegalArgumentException e) {
                                            throw e;
                                        } catch (IllegalArgumentException e2) {
                                            throw e2;
                                        }
                                    }
                                    dGVar.a(i7, c, z);
                                }
                            }
                            b = i4;
                            z = false;
                            if (i != -1) {
                                if (iM.a(i, i7, c)) {
                                    if (z) {
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                }
                            }
                            dGVar.a(i7, c, z);
                        } else {
                            b = i4;
                        }
                        i4 = i6 + 1;
                        if (i2 != 0) {
                            break;
                        }
                        i6 = i4;
                        i4 = b;
                    } catch (IllegalArgumentException e22) {
                        throw e22;
                    } catch (IllegalArgumentException e222) {
                        throw e222;
                    }
                }
                b = i4;
                i4 = c + i3;
                if (i2 != 0) {
                    c = i4;
                    i4 = b;
                    break;
                }
                c = i4;
                i4 = b;
            }
            i6 = -i3;
            c += i6;
            b = i5 - 2;
            if (i2 == 0) {
                i3 = i6;
            }
        }
        try {
            break;
            if (i4 != d_Var.d()) {
                throw new dC(z[0] + i4 + '/' + d_Var.d());
            }
        } catch (IllegalArgumentException e2222) {
            throw e2222;
        }
    }

    static int a(int i, int i2) {
        int i3 = dG.c;
        if (i2 == 0) {
            try {
                throw new IllegalArgumentException(z[1]);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        int b = b(i2);
        int i4 = i << (b - 1);
        while (b(i4) >= b) {
            i4 ^= i2 << (b(i4) - b);
            if (i3 != 0) {
                break;
            }
        }
        return i4;
    }

    static void a(fQ fQVar, d_ d_Var) {
        d_Var.a(fQVar.a(), 6);
        try {
            d_Var.a(a(fQVar.a(), 7973), 12);
            if (d_Var.d() != 18) {
                throw new dC(z[4] + d_Var.d());
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }
}
