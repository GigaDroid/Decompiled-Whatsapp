package com.google;

import java.util.Arrays;
import java.util.Map;

public abstract class aU implements cO {
    public static int a;

    public abstract f6 a(int i, d_ d_Var, Map map);

    protected static void b(d_ d_Var, int i, int[] iArr) {
        int i2 = a;
        int length = iArr.length;
        boolean f = d_Var.f(i);
        int i3 = i;
        while (i3 > 0 && length >= 0) {
            i3--;
            if (d_Var.f(i3) != f) {
                length--;
                f = !f;
                if (i2 != 0) {
                    break;
                }
            }
        }
        if (length >= 0) {
            throw aN.a();
        }
        a(d_Var, i3 + 1, iArr);
    }

    protected static float a(int[] iArr, int[] iArr2, float f) {
        int i = a;
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < length) {
            i4 += iArr[i2];
            i3 += iArr2[i2];
            i2++;
            if (i != 0) {
                break;
            }
        }
        i2 = i4;
        if (i2 < i3) {
            return Float.POSITIVE_INFINITY;
        }
        float f2 = ((float) i2) / ((float) i3);
        float f3 = f * f2;
        i4 = 0;
        float f4 = 0.0f;
        while (i4 < length) {
            float f5;
            i3 = iArr[i4];
            float f6 = ((float) iArr2[i4]) * f2;
            if (((float) i3) > f6) {
                f5 = ((float) i3) - f6;
            } else {
                f5 = f6 - ((float) i3);
            }
            if (f5 > f3) {
                return Float.POSITIVE_INFINITY;
            }
            f4 += f5;
            i3 = i4 + 1;
            if (i != 0) {
                break;
            }
            i4 = i3;
        }
        return f4 / ((float) i2);
    }

    public f6 a(b1 b1Var, Map map) {
        int i;
        b1 e;
        f6 b;
        Map b2;
        fI[] e2;
        int b3;
        int i2 = 0;
        int i3 = a;
        try {
            return b(b1Var, map);
        } catch (aN e3) {
            if (map != null) {
                try {
                    if (map.containsKey(b3.TRY_HARDER)) {
                        i = 1;
                        if (i != 0) {
                            try {
                                if (b1Var.a()) {
                                    e = b1Var.e();
                                    b = b(e, map);
                                    b2 = b.b();
                                    if (b2 != null) {
                                        try {
                                            if (b2.containsKey(eD.ORIENTATION)) {
                                                i = (((Integer) b2.get(eD.ORIENTATION)).intValue() + 270) % 360;
                                                b.a(eD.ORIENTATION, Integer.valueOf(i));
                                                e2 = b.e();
                                                if (e2 != null) {
                                                    b3 = e.b();
                                                    while (i2 < e2.length) {
                                                        e2[i2] = new fI((((float) b3) - e2[i2].b()) - 1.0f, e2[i2].a());
                                                        i2++;
                                                        if (i3 != 0) {
                                                            break;
                                                        }
                                                    }
                                                }
                                                return b;
                                            }
                                        } catch (aN e4) {
                                            throw e4;
                                        }
                                    }
                                    i = 270;
                                    b.a(eD.ORIENTATION, Integer.valueOf(i));
                                    e2 = b.e();
                                    if (e2 != null) {
                                        b3 = e.b();
                                        while (i2 < e2.length) {
                                            e2[i2] = new fI((((float) b3) - e2[i2].b()) - 1.0f, e2[i2].a());
                                            i2++;
                                            if (i3 != 0) {
                                                break;
                                            }
                                        }
                                    }
                                    return b;
                                }
                            } catch (aN e42) {
                                throw e42;
                            }
                        }
                        throw e3;
                    }
                } catch (aN e422) {
                    throw e422;
                }
            }
            i = 0;
            if (i != 0) {
                if (b1Var.a()) {
                    e = b1Var.e();
                    b = b(e, map);
                    b2 = b.b();
                    if (b2 != null) {
                        if (b2.containsKey(eD.ORIENTATION)) {
                            i = (((Integer) b2.get(eD.ORIENTATION)).intValue() + 270) % 360;
                            b.a(eD.ORIENTATION, Integer.valueOf(i));
                            e2 = b.e();
                            if (e2 != null) {
                                b3 = e.b();
                                while (i2 < e2.length) {
                                    e2[i2] = new fI((((float) b3) - e2[i2].b()) - 1.0f, e2[i2].a());
                                    i2++;
                                    if (i3 != 0) {
                                        break;
                                    }
                                }
                            }
                            return b;
                        }
                    }
                    i = 270;
                    b.a(eD.ORIENTATION, Integer.valueOf(i));
                    e2 = b.e();
                    if (e2 != null) {
                        b3 = e.b();
                        while (i2 < e2.length) {
                            e2[i2] = new fI((((float) b3) - e2[i2].b()) - 1.0f, e2[i2].a());
                            i2++;
                            if (i3 != 0) {
                                break;
                            }
                        }
                    }
                    return b;
                }
            }
            throw e3;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.google.f6 b(com.google.b1 r19, java.util.Map r20) {
        /*
        r18 = this;
        r8 = a;
        r9 = r19.c();
        r4 = r19.b();
        r6 = new com.google.d_;
        r6.<init>(r9);
        r10 = r4 >> 1;
        if (r20 == 0) goto L_0x00db;
    L_0x0013:
        r2 = com.google.b3.TRY_HARDER;	 Catch:{ aN -> 0x00d7 }
        r0 = r20;
        r2 = r0.containsKey(r2);	 Catch:{ aN -> 0x00d7 }
        if (r2 == 0) goto L_0x00db;
    L_0x001d:
        r2 = 1;
    L_0x001e:
        r5 = 1;
        if (r2 == 0) goto L_0x00de;
    L_0x0021:
        r3 = 8;
    L_0x0023:
        r3 = r4 >> r3;
        r11 = java.lang.Math.max(r5, r3);
        if (r2 == 0) goto L_0x002d;
    L_0x002b:
        if (r8 == 0) goto L_0x0108;
    L_0x002d:
        r2 = 15;
    L_0x002f:
        r3 = 0;
        r7 = r3;
    L_0x0031:
        if (r7 >= r2) goto L_0x00fd;
    L_0x0033:
        r3 = r7 + 1;
        r5 = r3 / 2;
        r3 = r7 & 1;
        if (r3 != 0) goto L_0x00e1;
    L_0x003b:
        r3 = 1;
    L_0x003c:
        if (r3 == 0) goto L_0x00e4;
    L_0x003e:
        r3 = r5;
    L_0x003f:
        r3 = r3 * r11;
        r12 = r10 + r3;
        if (r12 < 0) goto L_0x00fd;
    L_0x0044:
        if (r12 < r4) goto L_0x0048;
    L_0x0046:
        if (r8 == 0) goto L_0x00fd;
    L_0x0048:
        r0 = r19;
        r3 = r0.a(r12, r6);	 Catch:{ aN -> 0x00e7 }
    L_0x004e:
        r5 = 0;
        r6 = r5;
    L_0x0050:
        r5 = 2;
        if (r6 >= r5) goto L_0x00f8;
    L_0x0053:
        r5 = 1;
        if (r6 != r5) goto L_0x0078;
    L_0x0056:
        r3.b();	 Catch:{ aN -> 0x00ed }
        if (r20 == 0) goto L_0x0078;
    L_0x005b:
        r5 = com.google.b3.NEED_RESULT_POINT_CALLBACK;	 Catch:{ aN -> 0x00ef }
        r0 = r20;
        r5 = r0.containsKey(r5);	 Catch:{ aN -> 0x00ef }
        if (r5 == 0) goto L_0x0078;
    L_0x0065:
        r5 = new java.util.EnumMap;
        r13 = com.google.b3.class;
        r5.<init>(r13);
        r0 = r20;
        r5.putAll(r0);
        r13 = com.google.b3.NEED_RESULT_POINT_CALLBACK;
        r5.remove(r13);
        r20 = r5;
    L_0x0078:
        r0 = r18;
        r1 = r20;
        r5 = r0.a(r12, r3, r1);	 Catch:{ aK -> 0x00f3 }
        r13 = 1;
        if (r6 != r13) goto L_0x00d6;
    L_0x0083:
        r13 = com.google.eD.ORIENTATION;	 Catch:{ aK -> 0x00f3 }
        r14 = 180; // 0xb4 float:2.52E-43 double:8.9E-322;
        r14 = java.lang.Integer.valueOf(r14);	 Catch:{ aK -> 0x00f3 }
        r5.a(r13, r14);	 Catch:{ aK -> 0x00f3 }
        r13 = r5.e();	 Catch:{ aK -> 0x00f3 }
        if (r13 == 0) goto L_0x00d6;
    L_0x0094:
        r14 = 0;
        r15 = new com.google.fI;	 Catch:{ aN -> 0x00f1 }
        r0 = (float) r9;	 Catch:{ aN -> 0x00f1 }
        r16 = r0;
        r17 = 0;
        r17 = r13[r17];	 Catch:{ aN -> 0x00f1 }
        r17 = r17.a();	 Catch:{ aN -> 0x00f1 }
        r16 = r16 - r17;
        r17 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r16 = r16 - r17;
        r17 = 0;
        r17 = r13[r17];	 Catch:{ aN -> 0x00f1 }
        r17 = r17.b();	 Catch:{ aN -> 0x00f1 }
        r15.<init>(r16, r17);	 Catch:{ aN -> 0x00f1 }
        r13[r14] = r15;	 Catch:{ aN -> 0x00f1 }
        r14 = 1;
        r15 = new com.google.fI;	 Catch:{ aN -> 0x00f1 }
        r0 = (float) r9;	 Catch:{ aN -> 0x00f1 }
        r16 = r0;
        r17 = 1;
        r17 = r13[r17];	 Catch:{ aN -> 0x00f1 }
        r17 = r17.a();	 Catch:{ aN -> 0x00f1 }
        r16 = r16 - r17;
        r17 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r16 = r16 - r17;
        r17 = 1;
        r17 = r13[r17];	 Catch:{ aN -> 0x00f1 }
        r17 = r17.b();	 Catch:{ aN -> 0x00f1 }
        r15.<init>(r16, r17);	 Catch:{ aN -> 0x00f1 }
        r13[r14] = r15;	 Catch:{ aN -> 0x00f1 }
    L_0x00d6:
        return r5;
    L_0x00d7:
        r2 = move-exception;
        throw r2;	 Catch:{ aN -> 0x00d9 }
    L_0x00d9:
        r2 = move-exception;
        throw r2;
    L_0x00db:
        r2 = 0;
        goto L_0x001e;
    L_0x00de:
        r3 = 5;
        goto L_0x0023;
    L_0x00e1:
        r3 = 0;
        goto L_0x003c;
    L_0x00e4:
        r3 = -r5;
        goto L_0x003f;
    L_0x00e7:
        r3 = move-exception;
        if (r8 == 0) goto L_0x00f9;
    L_0x00ea:
        r3 = r6;
        goto L_0x004e;
    L_0x00ed:
        r2 = move-exception;
        throw r2;	 Catch:{ aN -> 0x00ef }
    L_0x00ef:
        r2 = move-exception;
        throw r2;
    L_0x00f1:
        r5 = move-exception;
        throw r5;	 Catch:{ aK -> 0x00f3 }
    L_0x00f3:
        r5 = move-exception;
        r5 = r6 + 1;
        if (r8 == 0) goto L_0x0105;
    L_0x00f8:
        r6 = r3;
    L_0x00f9:
        r3 = r7 + 1;
        if (r8 == 0) goto L_0x0102;
    L_0x00fd:
        r2 = com.google.aN.a();
        throw r2;
    L_0x0102:
        r7 = r3;
        goto L_0x0031;
    L_0x0105:
        r6 = r5;
        goto L_0x0050;
    L_0x0108:
        r2 = r4;
        goto L_0x002f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.aU.b(com.google.b1, java.util.Map):com.google.f6");
    }

    protected static void a(d_ d_Var, int i, int[] iArr) {
        int i2 = a;
        int length = iArr.length;
        Arrays.fill(iArr, 0, length, 0);
        int d = d_Var.d();
        if (i >= d) {
            throw aN.a();
        }
        int i3;
        int i4;
        if (d_Var.f(i)) {
            i3 = 0;
        } else {
            i3 = 1;
        }
        int i5 = i;
        int i6 = i3;
        i3 = 0;
        while (i5 < d) {
            int i7;
            if ((d_Var.f(i5) ^ i6) != 0) {
                iArr[i3] = iArr[i3] + 1;
                if (i2 == 0) {
                    i7 = i3;
                    i3 = i5 + 1;
                    if (i2 != 0) {
                        i4 = i7;
                        break;
                    } else {
                        i5 = i3;
                        i3 = i7;
                    }
                }
            }
            i7 = i3 + 1;
            if (i7 != length || i2 != 0) {
                iArr[i7] = 1;
                if (i6 == 0) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                i6 = i3;
                i3 = i5 + 1;
                if (i2 != 0) {
                    i4 = i7;
                    break;
                } else {
                    i5 = i3;
                    i3 = i7;
                }
            } else {
                i3 = i5;
                i4 = i7;
                break;
            }
        }
        i4 = i3;
        i3 = i5;
        if (i4 == length) {
            return;
        }
        if (i4 != length - 1 || r0 != d) {
            throw aN.a();
        }
    }

    public void a() {
    }
}
