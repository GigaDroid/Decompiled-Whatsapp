package com.google;

import java.util.List;
import java.util.Map;

public class L implements cO {
    private static final fI[] a;
    public static boolean c;
    private final dx b;

    public L() {
        boolean z = c;
        this.b = new dx();
        if (aK.a) {
            c = !z;
        }
    }

    private static float a(int[] iArr, hX hXVar) {
        int i;
        boolean z = c;
        int g = hXVar.g();
        int c = hXVar.c();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = 0;
        int i5 = 1;
        while (i2 < c && i3 < g) {
            int i6;
            if (i5 != hXVar.a(i2, i3)) {
                i6 = i4 + 1;
                if (i6 == 5 && !z) {
                    break;
                }
                if (i5 != false) {
                    i4 = 0;
                } else {
                    i4 = 1;
                }
                i5 = i4;
            } else {
                i6 = i4;
            }
            i2++;
            i4 = i3 + 1;
            if (z) {
                i = i2;
                break;
            }
            i3 = i4;
            i4 = i6;
        }
        i4 = i3;
        i = i2;
        if (i != c && r0 != g) {
            return ((float) (i - iArr[0])) / 7.0f;
        }
        throw aN.a();
    }

    private static hX a(hX hXVar) {
        boolean z = c;
        int[] d = hXVar.d();
        int[] e = hXVar.e();
        if (d == null || e == null) {
            throw aN.a();
        }
        float a = a(d, hXVar);
        int i = d[1];
        int i2 = e[1];
        int i3 = d[0];
        int i4 = e[0];
        if (i3 >= i4 || i >= i2) {
            throw aN.a();
        }
        if (i2 - i != i4 - i3) {
            i4 = (i2 - i) + i3;
        }
        int round = Math.round(((float) ((i4 - i3) + 1)) / a);
        int round2 = Math.round(((float) ((i2 - i) + 1)) / a);
        if (round <= 0 || round2 <= 0) {
            throw aN.a();
        } else if (round2 != round) {
            throw aN.a();
        } else {
            int i5 = (int) (a / 2.0f);
            int i6 = i + i5;
            i = i3 + i5;
            i4 = (((int) (((float) (round - 1)) * a)) + i) - (i4 - 1);
            if (i4 <= 0) {
                i3 = i;
            } else if (i4 > i5) {
                throw aN.a();
            } else {
                i3 = i - i4;
            }
            i4 = (((int) (((float) (round2 - 1)) * a)) + i6) - (i2 - 1);
            if (i4 <= 0) {
                i4 = i6;
            } else if (i4 > i5) {
                throw aN.a();
            } else {
                i4 = i6 - i4;
            }
            hX hXVar2 = new hX(round, round2);
            i = 0;
            while (i < round2) {
                i5 = i4 + ((int) (((float) i) * a));
                i6 = 0;
                while (i6 < round) {
                    if (hXVar.a(((int) (((float) i6) * a)) + i3, i5)) {
                        hXVar2.c(i6, i);
                    }
                    i6++;
                    if (z) {
                        break;
                    }
                }
                i6 = i + 1;
                if (z) {
                    break;
                }
                i = i6;
            }
            return hXVar2;
        }
    }

    static {
        a = new fI[0];
    }

    public final f6 a(b1 b1Var, Map map) {
        am amVar;
        fI[] fIVarArr;
        f6 f6Var;
        List g;
        String e;
        boolean z = c;
        if (map != null && map.containsKey(b3.PURE_BARCODE)) {
            am a = this.b.a(a(b1Var.d()), map);
            fI[] fIVarArr2 = a;
            if (z) {
                boolean z2;
                if (aK.a) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                aK.a = z2;
            } else {
                amVar = a;
                fIVarArr = fIVarArr2;
                if (amVar.d() instanceof p) {
                    ((p) amVar.d()).a(fIVarArr);
                }
                f6Var = new f6(amVar.f(), amVar.b(), fIVarArr, gg.QR_CODE);
                g = amVar.g();
                if (g != null) {
                    f6Var.a(eD.BYTE_SEGMENTS, g);
                }
                e = amVar.e();
                if (e != null) {
                    f6Var.a(eD.ERROR_CORRECTION_LEVEL, e);
                }
                if (amVar.h()) {
                    f6Var.a(eD.STRUCTURED_APPEND_SEQUENCE, Integer.valueOf(amVar.a()));
                    f6Var.a(eD.STRUCTURED_APPEND_PARITY, Integer.valueOf(amVar.c()));
                }
                return f6Var;
            }
        }
        bE a2 = new bm(b1Var.d()).a(map);
        amVar = this.b.a(a2.a(), map);
        fIVarArr = a2.b();
        if (amVar.d() instanceof p) {
            ((p) amVar.d()).a(fIVarArr);
        }
        f6Var = new f6(amVar.f(), amVar.b(), fIVarArr, gg.QR_CODE);
        g = amVar.g();
        if (g != null) {
            f6Var.a(eD.BYTE_SEGMENTS, g);
        }
        e = amVar.e();
        if (e != null) {
            f6Var.a(eD.ERROR_CORRECTION_LEVEL, e);
        }
        if (amVar.h()) {
            f6Var.a(eD.STRUCTURED_APPEND_SEQUENCE, Integer.valueOf(amVar.a()));
            f6Var.a(eD.STRUCTURED_APPEND_PARITY, Integer.valueOf(amVar.c()));
        }
        return f6Var;
    }

    public void a() {
    }
}
