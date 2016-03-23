package com.google;

import java.util.Map;

public final class t implements cO {
    private static final fI[] b;
    public static int c;
    private final eM a;

    public void a() {
    }

    public t() {
        int i = c;
        this.a = new eM();
        if (aK.a) {
            c = i + 1;
        }
    }

    static {
        b = new fI[0];
    }

    public f6 a(b1 b1Var, Map map) {
        int i = c;
        if (map != null && map.containsKey(b3.PURE_BARCODE)) {
            am a = this.a.a(a(b1Var.d()), map);
            if (i != 0) {
                aK.a = !aK.a;
            } else {
                f6 f6Var = new f6(a.f(), a.b(), b, gg.MAXICODE);
                String e = a.e();
                if (e != null) {
                    f6Var.a(eD.ERROR_CORRECTION_LEVEL, e);
                }
                return f6Var;
            }
        }
        throw aN.a();
    }

    private static hX a(hX hXVar) {
        int i = c;
        int[] a = hXVar.a();
        if (a == null) {
            throw aN.a();
        }
        int i2 = a[0];
        int i3 = a[1];
        int i4 = a[2];
        int i5 = a[3];
        hX hXVar2 = new hX(30, 33);
        int i6 = 0;
        while (i6 < 33) {
            int i7 = i3 + (((i6 * i5) + (i5 / 2)) / 33);
            int i8 = 0;
            while (i8 < 30) {
                if (hXVar.a(((((i8 * i4) + (i4 / 2)) + (((i6 & 1) * i4) / 2)) / 30) + i2, i7)) {
                    hXVar2.c(i8, i6);
                }
                i8++;
                if (i != 0) {
                    break;
                }
            }
            i8 = i6 + 1;
            if (i != 0) {
                break;
            }
            i6 = i8;
        }
        return hXVar2;
    }
}
