package com.google;

import com.whatsapp.arj;

public final class a {
    public static int f;
    private static final a[] h;
    private final g2 a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int g;
    private final int i;

    public int d() {
        return this.g;
    }

    public int c() {
        return this.c;
    }

    public int b() {
        return this.i;
    }

    public int h() {
        return this.d;
    }

    private a(int i, int i2, int i3, int i4, int i5, g2 g2Var) {
        int i6 = 0;
        this.c = i;
        this.g = i2;
        this.b = i3;
        this.e = i4;
        this.i = i5;
        this.a = g2Var;
        int a = g2Var.a();
        dX[] b = g2Var.b();
        int length = b.length;
        int i7 = 0;
        while (i6 < length) {
            dX dXVar = b[i6];
            i7 += (dXVar.b() + a) * dXVar.a();
            i6++;
        }
        this.d = i7;
    }

    private static a[] a() {
        return new a[]{new a(1, 10, 10, 8, 8, new g2(5, new dX(1, 3, null), null)), new a(2, 12, 12, 10, 10, new g2(7, new dX(1, 5, null), null)), new a(3, 14, 14, 12, 12, new g2(10, new dX(1, 8, null), null)), new a(4, 16, 16, 14, 14, new g2(12, new dX(1, 12, null), null)), new a(5, 18, 18, 16, 16, new g2(14, new dX(1, 18, null), null)), new a(6, 20, 20, 18, 18, new g2(18, new dX(1, 22, null), null)), new a(7, 22, 22, 20, 20, new g2(20, new dX(1, 30, null), null)), new a(8, 24, 24, 22, 22, new g2(24, new dX(1, 36, null), null)), new a(9, 26, 26, 24, 24, new g2(28, new dX(1, 44, null), null)), new a(10, 32, 32, 14, 14, new g2(36, new dX(1, 62, null), null)), new a(11, 36, 36, 16, 16, new g2(42, new dX(1, 86, null), null)), new a(12, 40, 40, 18, 18, new g2(48, new dX(1, 114, null), null)), new a(13, 44, 44, 20, 20, new g2(56, new dX(1, 144, null), null)), new a(14, 48, 48, 22, 22, new g2(68, new dX(1, 174, null), null)), new a(15, 52, 52, 24, 24, new g2(42, new dX(2, arj.Theme_checkboxStyle, null), null)), new a(16, 64, 64, 14, 14, new g2(56, new dX(2, 140, null), null)), new a(17, 72, 72, 16, 16, new g2(36, new dX(4, 92, null), null)), new a(18, 80, 80, 18, 18, new g2(48, new dX(4, 114, null), null)), new a(19, 88, 88, 20, 20, new g2(56, new dX(4, 144, null), null)), new a(20, 96, 96, 22, 22, new g2(68, new dX(4, 174, null), null)), new a(21, arj.Theme_editTextStyle, arj.Theme_editTextStyle, 24, 24, new g2(56, new dX(6, 136, null), null)), new a(22, 120, 120, 18, 18, new g2(68, new dX(6, 175, null), null)), new a(23, 132, 132, 20, 20, new g2(62, new dX(8, 163, null), null)), new a(24, 144, 144, 22, 22, new g2(62, new dX(8, 156, null), new dX(2, 155, null), null)), new a(25, 8, 18, 6, 16, new g2(7, new dX(1, 5, null), null)), new a(26, 8, 32, 6, 14, new g2(11, new dX(1, 10, null), null)), new a(27, 12, 26, 10, 24, new g2(14, new dX(1, 16, null), null)), new a(28, 12, 36, 10, 16, new g2(18, new dX(1, 22, null), null)), new a(29, 16, 36, 14, 16, new g2(24, new dX(1, 32, null), null)), new a(30, 16, 48, 14, 22, new g2(28, new dX(1, 49, null), null))};
    }

    public static a a(int i, int i2) {
        int i3 = f;
        if ((i & 1) == 0 && (i2 & 1) == 0) {
            a[] aVarArr = h;
            int length = aVarArr.length;
            int i4 = 0;
            while (i4 < length) {
                a aVar = aVarArr[i4];
                if (aVar.g != i || aVar.b != i2) {
                    i4++;
                    if (i3 != 0) {
                        break;
                    }
                }
                return aVar;
            }
            throw aG.a();
        }
        throw aG.a();
    }

    public int f() {
        return this.e;
    }

    g2 e() {
        return this.a;
    }

    static {
        h = a();
    }

    public int g() {
        return this.b;
    }

    public String toString() {
        return String.valueOf(this.c);
    }
}
