package com.google;

import java.util.Map;

public class bm {
    private final hX a;
    private dB b;

    public final bE a(Map map) {
        dB dBVar;
        if (map == null) {
            dBVar = null;
        } else {
            dBVar = (dB) map.get(b3.NEED_RESULT_POINT_CALLBACK);
        }
        this.b = dBVar;
        return a(new h_(this.a, this.b).a(map));
    }

    private static hX a(hX hXVar, gU gUVar, int i) {
        return e8.a().a(hXVar, i, i, gUVar);
    }

    protected final float a(fI fIVar, fI fIVar2, fI fIVar3) {
        return (a(fIVar, fIVar2) + a(fIVar, fIVar3)) / 2.0f;
    }

    private float a(fI fIVar, fI fIVar2) {
        float b = b((int) fIVar.a(), (int) fIVar.b(), (int) fIVar2.a(), (int) fIVar2.b());
        float b2 = b((int) fIVar2.a(), (int) fIVar2.b(), (int) fIVar.a(), (int) fIVar.b());
        if (Float.isNaN(b)) {
            return b2 / 7.0f;
        }
        if (Float.isNaN(b2)) {
            return b / 7.0f;
        }
        return (b + b2) / 14.0f;
    }

    protected final fa a(float f, int i, int i2, float f2) {
        boolean z = h_.e;
        int i3 = (int) (f2 * f);
        int max = Math.max(0, i - i3);
        int min = Math.min(this.a.c() - 1, i + i3);
        if (((float) (min - max)) < f * 3.0f) {
            throw aN.a();
        }
        int max2 = Math.max(0, i2 - i3);
        int min2 = Math.min(this.a.g() - 1, i3 + i2);
        if (((float) (min2 - max2)) < f * 3.0f) {
            throw aN.a();
        }
        fa a = new ed(this.a, max, max2, min - max, min2 - max2, f, this.b).a();
        if (z) {
            aK.a = !aK.a;
        }
        return a;
    }

    private static gU a(fI fIVar, fI fIVar2, fI fIVar3, fI fIVar4, int i) {
        float a;
        float b;
        float f;
        float f2;
        float f3 = ((float) i) - 3.5f;
        if (fIVar4 != null) {
            a = fIVar4.a();
            b = fIVar4.b();
            f = f3 - 3.0f;
            if (!h_.e) {
                f2 = f;
                return gU.a(3.5f, 3.5f, f3, 3.5f, f2, f, 3.5f, f3, fIVar.a(), fIVar.b(), fIVar2.a(), fIVar2.b(), a, b, fIVar3.a(), fIVar3.b());
            }
        }
        a = (fIVar2.a() - fIVar.a()) + fIVar3.a();
        b = (fIVar2.b() - fIVar.b()) + fIVar3.b();
        f = f3;
        f2 = f3;
        return gU.a(3.5f, 3.5f, f3, 3.5f, f2, f, 3.5f, f3, fIVar.a(), fIVar.b(), fIVar2.a(), fIVar2.b(), a, b, fIVar3.a(), fIVar3.b());
    }

    protected final bE a(eu euVar) {
        boolean z = h_.e;
        fI a = euVar.a();
        fI b = euVar.b();
        fI c = euVar.c();
        float a2 = a(a, b, c);
        if (a2 < 1.0f) {
            try {
                throw aN.a();
            } catch (aN e) {
                throw e;
            }
        }
        fI[] fIVarArr;
        int a3 = a(a, b, c, a2);
        fQ c2 = fQ.c(a3);
        int d = c2.d() - 7;
        fI fIVar = null;
        if (c2.b().length > 0) {
            float a4 = (b.a() - a.a()) + c.a();
            float b2 = (b.b() - a.b()) + c.b();
            float f = 1.0f - (3.0f / ((float) d));
            int a5 = (int) (((a4 - a.a()) * f) + a.a());
            d = (int) (a.b() + (f * (b2 - a.b())));
            int i = 4;
            while (i <= 16) {
                try {
                    fIVar = a(a2, a5, d, (float) i);
                    break;
                } catch (aN e2) {
                    i <<= 1;
                    if (z) {
                        break;
                    }
                }
            }
        }
        hX a6 = a(this.a, a(a, b, c, fIVar, a3), a3);
        if (fIVar == null) {
            fI[] fIVarArr2 = new fI[]{c, a, b};
            if (!z) {
                fIVarArr = fIVarArr2;
                return new bE(a6, fIVarArr);
            }
        }
        fIVarArr = new fI[]{c, a, b, fIVar};
        return new bE(a6, fIVarArr);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private float b(int r10, int r11, int r12, int r13) {
        /*
        r9 = this;
        r1 = 0;
        r3 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r4 = com.google.h_.e;
        r5 = r9.a(r10, r11, r12, r13);
        r0 = r12 - r10;
        r0 = r10 - r0;
        if (r0 >= 0) goto L_0x007e;
    L_0x000f:
        r2 = (float) r10;
        r0 = r10 - r0;
        r0 = (float) r0;
        r0 = r2 / r0;
        if (r4 == 0) goto L_0x007c;
    L_0x0017:
        r2 = r0;
        r0 = r1;
    L_0x0019:
        r6 = r9.a;
        r6 = r6.c();
        if (r0 < r6) goto L_0x0078;
    L_0x0021:
        r2 = r9.a;
        r2 = r2.c();
        r2 = r2 + -1;
        r2 = r2 - r10;
        r2 = (float) r2;
        r0 = r0 - r10;
        r0 = (float) r0;
        r2 = r2 / r0;
        r0 = r9.a;
        r0 = r0.c();
        r0 = r0 + -1;
        r8 = r0;
        r0 = r2;
        r2 = r8;
    L_0x0039:
        r6 = (float) r11;
        r7 = r13 - r11;
        r7 = (float) r7;
        r0 = r0 * r7;
        r0 = r6 - r0;
        r0 = (int) r0;
        if (r0 >= 0) goto L_0x0075;
    L_0x0043:
        r6 = (float) r11;
        r0 = r11 - r0;
        r0 = (float) r0;
        r0 = r6 / r0;
        if (r4 == 0) goto L_0x0068;
    L_0x004b:
        r4 = r9.a;
        r4 = r4.g();
        if (r1 < r4) goto L_0x0068;
    L_0x0053:
        r0 = r9.a;
        r0 = r0.g();
        r0 = r0 + -1;
        r0 = r0 - r11;
        r0 = (float) r0;
        r1 = r1 - r11;
        r1 = (float) r1;
        r0 = r0 / r1;
        r1 = r9.a;
        r1 = r1.g();
        r1 = r1 + -1;
    L_0x0068:
        r4 = (float) r10;
        r2 = r2 - r10;
        r2 = (float) r2;
        r0 = r0 * r2;
        r0 = r0 + r4;
        r0 = (int) r0;
        r0 = r9.a(r10, r11, r0, r1);
        r0 = r0 + r5;
        r0 = r0 - r3;
        return r0;
    L_0x0075:
        r1 = r0;
        r0 = r3;
        goto L_0x004b;
    L_0x0078:
        r8 = r0;
        r0 = r2;
        r2 = r8;
        goto L_0x0039;
    L_0x007c:
        r2 = r1;
        goto L_0x0039;
    L_0x007e:
        r2 = r3;
        goto L_0x0019;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.bm.b(int, int, int, int):float");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int a(com.google.fI r3, com.google.fI r4, com.google.fI r5, float r6) {
        /*
        r1 = com.google.h_.e;
        r0 = com.google.fI.a(r3, r4);
        r0 = r0 / r6;
        r0 = com.google.h6.a(r0);
        r2 = com.google.fI.a(r3, r5);
        r2 = r2 / r6;
        r2 = com.google.h6.a(r2);
        r0 = r0 + r2;
        r0 = r0 / 2;
        r0 = r0 + 7;
        r2 = r0 & 3;
        switch(r2) {
            case 0: goto L_0x001f;
            case 1: goto L_0x001e;
            case 2: goto L_0x0023;
            case 3: goto L_0x0027;
            default: goto L_0x001e;
        };
    L_0x001e:
        return r0;
    L_0x001f:
        r0 = r0 + 1;
        if (r1 == 0) goto L_0x001e;
    L_0x0023:
        r0 = r0 + -1;
        if (r1 == 0) goto L_0x001e;
    L_0x0027:
        r0 = com.google.aN.a();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.bm.a(com.google.fI, com.google.fI, com.google.fI, float):int");
    }

    private float a(int i, int i2, int i3, int i4) {
        Object obj;
        int i5;
        boolean z = h_.e;
        if (Math.abs(i4 - i2) > Math.abs(i3 - i)) {
            obj = 1;
        } else {
            obj = null;
        }
        if (obj == null) {
            int i6 = i4;
            i4 = i3;
            i3 = i6;
            int i7 = i2;
            i2 = i;
            i = i7;
        }
        int abs = Math.abs(i4 - i2);
        int abs2 = Math.abs(i3 - i);
        int i8 = (-abs) / 2;
        int i9 = i2 < i4 ? 1 : -1;
        if (i < i3) {
            i5 = 1;
        } else {
            i5 = -1;
        }
        int i10 = 0;
        int i11 = i4 + i9;
        int i12 = i2;
        int i13 = i8;
        i8 = i;
        while (i12 != i11) {
            int i14;
            int i15;
            if (obj != null) {
                i14 = i8;
            } else {
                i14 = i12;
            }
            if ((i10 == 1) != this.a.a(i14, obj != null ? i12 : i8)) {
                i15 = i10;
            } else if (i10 == 2) {
                return h6.a(i12, i8, i2, i);
            } else {
                i15 = i10 + 1;
            }
            int i16 = i13 + abs2;
            if (i16 > 0) {
                if (i8 == i3 && !z) {
                    i5 = i15;
                    break;
                }
                i10 = i8 + i5;
                i8 = i16 - abs;
            } else {
                i10 = i8;
                i8 = i16;
            }
            i12 += i9;
            if (z) {
                i5 = i15;
                break;
            }
            i13 = i8;
            i8 = i10;
            i10 = i15;
        }
        i5 = i10;
        return i5 == 2 ? h6.a(i4 + i9, i3, i2, i) : Float.NaN;
    }

    public bm(hX hXVar) {
        this.a = hXVar;
    }
}
