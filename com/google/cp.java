package com.google;

import java.util.List;
import java.util.Map;

public final class cp implements cO {
    private static final fI[] a;
    public static int c;
    private final f b;

    public f6 a(b1 b1Var, Map map) {
        am a;
        fI[] fIVarArr;
        f6 f6Var;
        List g;
        String e;
        int i = c;
        if (map != null && map.containsKey(b3.PURE_BARCODE)) {
            a = this.b.a(a(b1Var.d()));
            fIVarArr = a;
            if (i != 0) {
                boolean z;
                if (aK.a) {
                    z = false;
                } else {
                    z = true;
                }
                aK.a = z;
            }
            f6Var = new f6(a.f(), a.b(), fIVarArr, gg.DATA_MATRIX);
            g = a.g();
            if (g != null) {
                f6Var.a(eD.BYTE_SEGMENTS, g);
            }
            e = a.e();
            if (e != null) {
                f6Var.a(eD.ERROR_CORRECTION_LEVEL, e);
            }
            return f6Var;
        }
        bE a2 = new P(b1Var.d()).a();
        a = this.b.a(a2.a());
        fIVarArr = a2.b();
        f6Var = new f6(a.f(), a.b(), fIVarArr, gg.DATA_MATRIX);
        g = a.g();
        if (g != null) {
            f6Var.a(eD.BYTE_SEGMENTS, g);
        }
        e = a.e();
        if (e != null) {
            f6Var.a(eD.ERROR_CORRECTION_LEVEL, e);
        }
        return f6Var;
    }

    static {
        a = new fI[0];
    }

    private static int a(int[] iArr, hX hXVar) {
        int i = c;
        int c = hXVar.c();
        int i2 = iArr[0];
        int i3 = iArr[1];
        while (i2 < c && hXVar.a(i2, i3)) {
            i2++;
            if (i != 0) {
                break;
            }
        }
        if (i2 == c) {
            throw aN.a();
        }
        i2 -= iArr[0];
        if (i2 != 0) {
            return i2;
        }
        throw aN.a();
    }

    private static hX a(hX hXVar) {
        int i = c;
        int[] d = hXVar.d();
        int[] e = hXVar.e();
        if (d == null || e == null) {
            throw aN.a();
        }
        int a = a(d, hXVar);
        int i2 = d[1];
        int i3 = e[1];
        int i4 = d[0];
        int i5 = ((e[0] - i4) + 1) / a;
        i3 = ((i3 - i2) + 1) / a;
        if (i5 <= 0 || i3 <= 0) {
            throw aN.a();
        }
        int i6 = a / 2;
        i2 += i6;
        int i7 = i4 + i6;
        hX hXVar2 = new hX(i5, i3);
        i6 = 0;
        while (i6 < i3) {
            int i8 = i2 + (i6 * a);
            i4 = 0;
            while (i4 < i5) {
                if (hXVar.a((i4 * a) + i7, i8)) {
                    hXVar2.c(i4, i6);
                }
                i4++;
                if (i != 0) {
                    break;
                }
            }
            i4 = i6 + 1;
            if (i != 0) {
                break;
            }
            i6 = i4;
        }
        return hXVar2;
    }

    public void a() {
    }

    public cp() {
        int i = c;
        this.b = new f();
        if (aK.a) {
            c = i + 1;
        }
    }
}
