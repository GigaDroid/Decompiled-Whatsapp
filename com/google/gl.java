package com.google;

public final class gl {
    public static int f;
    private static final int[] h;
    private int a;
    private int b;
    private int c;
    private boolean d;
    private final hX e;
    private int g;

    private int a(dO dOVar, dO dOVar2) {
        int i = f;
        float b = b(dOVar, dOVar2);
        float a = ((float) (dOVar2.a() - dOVar.a())) / b;
        float b2 = ((float) (dOVar2.b() - dOVar.b())) / b;
        float a2 = (float) dOVar.a();
        float b3 = (float) dOVar.b();
        boolean a3 = this.e.a(dOVar.a(), dOVar.b());
        int i2 = 0;
        float f = a2;
        a2 = b3;
        int i3 = 0;
        while (((float) i3) < b) {
            f += a;
            a2 += b2;
            if (this.e.a(h6.a(f), h6.a(a2)) != a3) {
                i2++;
            }
            i3++;
            if (i != 0) {
                break;
            }
        }
        float f2 = ((float) i2) / b;
        if (f2 > 0.1f && f2 < 0.9f) {
            return 0;
        }
        return ((f2 > 0.1f ? 1 : (f2 == 0.1f ? 0 : -1)) <= 0) == a3 ? 1 : -1;
    }

    public gl(hX hXVar) {
        this.e = hXVar;
    }

    private boolean a(int i, int i2) {
        return i >= 0 && i < this.e.c() && i2 > 0 && i2 < this.e.g();
    }

    private static float b(dO dOVar, dO dOVar2) {
        return h6.a(dOVar.a(), dOVar.b(), dOVar2.a(), dOVar2.b());
    }

    private hX a(hX hXVar, fI fIVar, fI fIVar2, fI fIVar3, fI fIVar4) {
        e8 a = e8.a();
        int a2 = a();
        float f = (((float) a2) / 2.0f) - ((float) this.c);
        float f2 = (((float) a2) / 2.0f) + ((float) this.c);
        return a.a(hXVar, a2, a2, f, f, f2, f, f2, f2, f, f2, fIVar.a(), fIVar.b(), fIVar2.a(), fIVar2.b(), fIVar3.a(), fIVar3.b(), fIVar4.a(), fIVar4.b());
    }

    private boolean a(dO dOVar, dO dOVar2, dO dOVar3, dO dOVar4) {
        dO dOVar5 = new dO(dOVar.a() - 3, dOVar.b() + 3);
        dO dOVar6 = new dO(dOVar2.a() - 3, dOVar2.b() - 3);
        dO dOVar7 = new dO(dOVar3.a() + 3, dOVar3.b() - 3);
        dO dOVar8 = new dO(dOVar4.a() + 3, 3 + dOVar4.b());
        int a = a(dOVar8, dOVar5);
        if (a != 0 && a(dOVar5, dOVar6) == a && a(dOVar6, dOVar7) == a && a(dOVar7, dOVar8) == a) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int a(long r8, boolean r10) {
        /*
        r1 = 4;
        r3 = 0;
        r4 = f;
        if (r10 == 0) goto L_0x000a;
    L_0x0006:
        r2 = 7;
        r0 = 2;
        if (r4 == 0) goto L_0x000e;
    L_0x000a:
        r0 = 10;
        r2 = r0;
        r0 = r1;
    L_0x000e:
        r5 = r2 - r0;
        r6 = new int[r2];
        r2 = r2 + -1;
    L_0x0014:
        if (r2 < 0) goto L_0x0020;
    L_0x0016:
        r7 = (int) r8;
        r7 = r7 & 15;
        r6[r2] = r7;
        r8 = r8 >> r1;
        r2 = r2 + -1;
        if (r4 == 0) goto L_0x0014;
    L_0x0020:
        r1 = new com.google.y;	 Catch:{ em -> 0x0039 }
        r2 = com.google.aj.d;	 Catch:{ em -> 0x0039 }
        r1.<init>(r2);	 Catch:{ em -> 0x0039 }
        r1.a(r6, r5);	 Catch:{ em -> 0x0039 }
        r2 = r3;
        r1 = r3;
    L_0x002c:
        if (r2 >= r0) goto L_0x0037;
    L_0x002e:
        r1 = r1 << 4;
        r3 = r6[r2];
        r1 = r1 + r3;
        r2 = r2 + 1;
        if (r4 == 0) goto L_0x002c;
    L_0x0037:
        r0 = r1;
        return r0;
    L_0x0039:
        r0 = move-exception;
        r0 = com.google.aN.a();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gl.a(long, boolean):int");
    }

    public by a(boolean z) {
        int i = f;
        fI[] a = a(b());
        if (z) {
            fI fIVar = a[0];
            a[0] = a[2];
            a[2] = fIVar;
        }
        a(a);
        by byVar = new by(a(this.e, a[this.a % 4], a[(this.a + 1) % 4], a[(this.a + 2) % 4], a[(this.a + 3) % 4]), b(a), this.d, this.b, this.g);
        if (i != 0) {
            aK.a = !aK.a;
        }
        return byVar;
    }

    private dO b() {
        fI fIVar;
        fI fIVar2;
        fI fIVar3;
        fI fIVar4;
        int c;
        int g;
        try {
            fI[] a = new g(this.e).a();
            fIVar = a[0];
            fIVar2 = a[1];
            fIVar3 = a[2];
            fIVar4 = a[3];
        } catch (aN e) {
            c = this.e.c() / 2;
            g = this.e.g() / 2;
            fIVar = a(new dO(c + 7, g - 7), false, 1, -1).c();
            fIVar2 = a(new dO(c + 7, g + 7), false, 1, 1).c();
            fIVar3 = a(new dO(c - 7, g + 7), false, -1, 1).c();
            fIVar4 = a(new dO(c - 7, g - 7), false, -1, -1).c();
        }
        g = h6.a((((fIVar.a() + fIVar4.a()) + fIVar2.a()) + fIVar3.a()) / 4.0f);
        c = h6.a((((fIVar4.b() + fIVar.b()) + fIVar2.b()) + fIVar3.b()) / 4.0f);
        try {
            fI[] a2 = new g(this.e, 15, g, c).a();
            fIVar = a2[0];
            fIVar2 = a2[1];
            fIVar3 = a2[2];
            fIVar4 = a2[3];
        } catch (aN e2) {
            fIVar = a(new dO(g + 7, c - 7), false, 1, -1).c();
            fIVar2 = a(new dO(g + 7, c + 7), false, 1, 1).c();
            fIVar3 = a(new dO(g - 7, c + 7), false, -1, 1).c();
            fIVar4 = a(new dO(g - 7, c - 7), false, -1, -1).c();
        }
        return new dO(h6.a((((fIVar.a() + fIVar4.a()) + fIVar2.a()) + fIVar3.a()) / 4.0f), h6.a((((fIVar4.b() + fIVar.b()) + fIVar2.b()) + fIVar3.b()) / 4.0f));
    }

    private fI[] a(dO dOVar) {
        int i = f;
        boolean z = true;
        this.c = 1;
        dO dOVar2 = dOVar;
        dO dOVar3 = dOVar;
        dO dOVar4 = dOVar;
        while (this.c < 9) {
            dO a = a(dOVar4, z, 1, -1);
            dO a2 = a(dOVar3, z, 1, 1);
            dO a3 = a(dOVar2, z, -1, 1);
            dO a4 = a(dOVar, z, -1, -1);
            if (this.c > 2) {
                float b = (b(a4, a) * ((float) this.c)) / (b(dOVar, dOVar4) * ((float) (this.c + 2)));
                if (((double) b) >= 0.75d) {
                    if (((double) b) <= 1.25d) {
                        if (!a(a, a2, a3, a4) && i == 0) {
                            break;
                        }
                    }
                    break;
                }
                break;
            }
            if (z) {
                z = false;
            } else {
                z = true;
            }
            this.c++;
            if (i != 0) {
                dOVar = a4;
                dOVar2 = a3;
                dOVar3 = a2;
                dOVar4 = a;
                break;
            }
            dOVar = a4;
            dOVar2 = a3;
            dOVar3 = a2;
            dOVar4 = a;
        }
        if (this.c == 5 || this.c == 7) {
            this.d = this.c == 5;
            fI fIVar = new fI(((float) dOVar4.a()) + 0.5f, ((float) dOVar4.b()) - 0.5f);
            fI fIVar2 = new fI(((float) dOVar3.a()) + 0.5f, ((float) dOVar3.b()) + 0.5f);
            fI fIVar3 = new fI(((float) dOVar2.a()) - 0.5f, ((float) dOVar2.b()) + 0.5f);
            fI fIVar4 = new fI(((float) dOVar.a()) - 0.5f, ((float) dOVar.b()) - 0.5f);
            return a(new fI[]{fIVar, fIVar2, fIVar3, fIVar4}, (float) ((this.c * 2) - 3), (float) (this.c * 2));
        }
        throw aN.a();
    }

    private int a(fI fIVar, fI fIVar2, int i) {
        int i2 = 0;
        int i3 = f;
        float a = a(fIVar, fIVar2);
        float f = a / ((float) i);
        float a2 = fIVar.a();
        float b = fIVar.b();
        float a3 = ((fIVar2.a() - fIVar.a()) * f) / a;
        f = (f * (fIVar2.b() - fIVar.b())) / a;
        int i4 = 0;
        while (i4 < i) {
            if (this.e.a(h6.a((((float) i4) * a3) + a2), h6.a((((float) i4) * f) + b))) {
                i2 |= 1 << ((i - i4) - 1);
            }
            i4++;
            if (i3 != 0) {
                break;
            }
        }
        return i2;
    }

    private static float a(fI fIVar, fI fIVar2) {
        return h6.a(fIVar.a(), fIVar.b(), fIVar2.a(), fIVar2.b());
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(com.google.fI[] r12) {
        /*
        r11 = this;
        r9 = 4;
        r8 = 3;
        r7 = 2;
        r6 = 1;
        r0 = 0;
        r4 = f;
        r1 = r12[r0];
        r1 = r11.a(r1);
        if (r1 == 0) goto L_0x0027;
    L_0x000f:
        r1 = r12[r6];
        r1 = r11.a(r1);
        if (r1 == 0) goto L_0x0027;
    L_0x0017:
        r1 = r12[r7];
        r1 = r11.a(r1);
        if (r1 == 0) goto L_0x0027;
    L_0x001f:
        r1 = r12[r8];
        r1 = r11.a(r1);
        if (r1 != 0) goto L_0x002c;
    L_0x0027:
        r0 = com.google.aN.a();
        throw r0;
    L_0x002c:
        r1 = r11.c;
        r1 = r1 * 2;
        r5 = new int[r9];
        r2 = r12[r0];
        r3 = r12[r6];
        r2 = r11.a(r2, r3, r1);
        r5[r0] = r2;
        r2 = r12[r6];
        r3 = r12[r7];
        r2 = r11.a(r2, r3, r1);
        r5[r6] = r2;
        r2 = r12[r7];
        r3 = r12[r8];
        r2 = r11.a(r2, r3, r1);
        r5[r7] = r2;
        r2 = r12[r8];
        r3 = r12[r0];
        r2 = r11.a(r2, r3, r1);
        r5[r8] = r2;
        r1 = a(r5, r1);
        r11.a = r1;
        r2 = 0;
        r10 = r0;
        r0 = r2;
        r2 = r10;
    L_0x0065:
        if (r2 >= r9) goto L_0x008e;
    L_0x0067:
        r3 = r11.a;
        r3 = r3 + r2;
        r3 = r3 % 4;
        r3 = r5[r3];
        r6 = r11.d;
        if (r6 == 0) goto L_0x007c;
    L_0x0072:
        r6 = 7;
        r0 = r0 << r6;
        r6 = r3 >> 1;
        r6 = r6 & 127;
        r6 = (long) r6;
        r0 = r0 + r6;
        if (r4 == 0) goto L_0x008a;
    L_0x007c:
        r6 = 10;
        r0 = r0 << r6;
        r6 = r3 >> 2;
        r6 = r6 & 992;
        r3 = r3 >> 1;
        r3 = r3 & 31;
        r3 = r3 + r6;
        r6 = (long) r3;
        r0 = r0 + r6;
    L_0x008a:
        r2 = r2 + 1;
        if (r4 == 0) goto L_0x0065;
    L_0x008e:
        r2 = r11.d;
        r0 = a(r0, r2);
        r1 = r11.d;
        if (r1 == 0) goto L_0x00a6;
    L_0x0098:
        r1 = r0 >> 6;
        r1 = r1 + 1;
        r11.g = r1;
        r1 = r0 & 63;
        r1 = r1 + 1;
        r11.b = r1;
        if (r4 == 0) goto L_0x00b2;
    L_0x00a6:
        r1 = r0 >> 11;
        r1 = r1 + 1;
        r11.g = r1;
        r0 = r0 & 2047;
        r0 = r0 + 1;
        r11.b = r0;
    L_0x00b2:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gl.a(com.google.fI[]):void");
    }

    private fI[] b(fI[] fIVarArr) {
        return a(fIVarArr, (float) (this.c * 2), (float) a());
    }

    private boolean a(fI fIVar) {
        return a(h6.a(fIVar.a()), h6.a(fIVar.b()));
    }

    private static fI[] a(fI[] fIVarArr, float f, float f2) {
        float f3 = f2 / (2.0f * f);
        float a = fIVarArr[0].a() - fIVarArr[2].a();
        float b = fIVarArr[0].b() - fIVarArr[2].b();
        float a2 = (fIVarArr[0].a() + fIVarArr[2].a()) / 2.0f;
        float b2 = (fIVarArr[0].b() + fIVarArr[2].b()) / 2.0f;
        fI fIVar = new fI((f3 * a) + a2, (f3 * b) + b2);
        fI fIVar2 = new fI(a2 - (a * f3), b2 - (b * f3));
        a = fIVarArr[1].a() - fIVarArr[3].a();
        b = fIVarArr[1].b() - fIVarArr[3].b();
        a2 = (fIVarArr[1].a() + fIVarArr[3].a()) / 2.0f;
        b2 = (fIVarArr[1].b() + fIVarArr[3].b()) / 2.0f;
        fI fIVar3 = new fI((f3 * a) + a2, (f3 * b) + b2);
        fI fIVar4 = new fI(a2 - (a * f3), b2 - (f3 * b));
        return new fI[]{fIVar, fIVar3, fIVar2, fIVar4};
    }

    private int a() {
        if (this.d) {
            return (this.g * 4) + 11;
        }
        return this.g <= 4 ? (this.g * 4) + 15 : ((this.g * 4) + ((((this.g - 4) / 8) + 1) * 2)) + 15;
    }

    private dO a(dO dOVar, boolean z, int i, int i2) {
        int i3 = f;
        int a = dOVar.a() + i;
        int b = dOVar.b() + i2;
        while (a(a, b) && this.e.a(a, b) == z) {
            a += i;
            b += i2;
            if (i3 != 0) {
                break;
            }
        }
        int i4 = b - i2;
        b = a - i;
        while (a(b, i4) && this.e.a(b, i4) == z) {
            b += i;
            if (i3 != 0) {
                break;
            }
        }
        a = b - i;
        b = i4;
        while (a(a, b) && this.e.a(a, b) == z) {
            b += i2;
            if (i3 != 0) {
                break;
            }
        }
        return new dO(a, b - i2);
    }

    private static int a(int[] iArr, int i) {
        int i2 = f;
        int length = iArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int i5 = iArr[i3];
            i4 <<= 3;
            i4 += (i5 & 1) + ((i5 >> (i - 2)) << 1);
            i3++;
            if (i2 != 0) {
                break;
            }
        }
        i3 = ((i4 & 1) << 11) + (i4 >> 1);
        i4 = 0;
        while (i4 < 4) {
            if (Integer.bitCount(h[i4] ^ i3) > 2) {
                i4++;
                if (i2 != 0) {
                    break;
                }
            }
            return i4;
        }
        throw aN.a();
    }

    static {
        h = new int[]{3808, 476, 2107, 1799};
    }
}
