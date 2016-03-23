package com.google;

public final class dj extends dd {
    private hX e;

    private static int a(int i, int i2, int i3) {
        if (i < i2) {
            return i2;
        }
        return i > i3 ? i3 : i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.hX c() {
        /*
        r7 = this;
        r1 = 40;
        r0 = r7.e;
        if (r0 == 0) goto L_0x0009;
    L_0x0006:
        r0 = r7.e;
    L_0x0008:
        return r0;
    L_0x0009:
        r0 = r7.d();
        r3 = r0.d();
        r4 = r0.b();
        if (r3 < r1) goto L_0x003f;
    L_0x0017:
        if (r4 < r1) goto L_0x003f;
    L_0x0019:
        r0 = r0.c();
        r1 = r3 >> 3;
        r2 = r3 & 7;
        if (r2 == 0) goto L_0x0025;
    L_0x0023:
        r1 = r1 + 1;
    L_0x0025:
        r2 = r4 >> 3;
        r5 = r4 & 7;
        if (r5 == 0) goto L_0x002d;
    L_0x002b:
        r2 = r2 + 1;
    L_0x002d:
        r5 = a(r0, r1, r2, r3, r4);
        r6 = new com.google.hX;
        r6.<init>(r3, r4);
        a(r0, r1, r2, r3, r4, r5, r6);
        r7.e = r6;
        r0 = com.google.d_.a;
        if (r0 == 0) goto L_0x0045;
    L_0x003f:
        r0 = super.c();
        r7.e = r0;
    L_0x0045:
        r0 = r7.e;
        goto L_0x0008;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.dj.c():com.google.hX");
    }

    private static void a(byte[] bArr, int i, int i2, int i3, int i4, int[][] iArr, hX hXVar) {
        boolean z = d_.a;
        int i5 = 0;
        while (i5 < i2) {
            int i6 = i5 << 3;
            int i7 = i4 - 8;
            if (i6 <= i7) {
                i7 = i6;
            }
            int i8 = 0;
            while (i8 < i) {
                i6 = i8 << 3;
                int i9 = i3 - 8;
                if (i6 <= i9) {
                    i9 = i6;
                }
                int a = a(i8, 2, i - 3);
                int a2 = a(i5, 2, i2 - 3);
                i6 = 0;
                int i10 = -2;
                while (i10 <= 2) {
                    int[] iArr2 = iArr[a2 + i10];
                    i6 += iArr2[a + 2] + (((iArr2[a - 2] + iArr2[a - 1]) + iArr2[a]) + iArr2[a + 1]);
                    i10++;
                    if (z) {
                        break;
                    }
                }
                a(bArr, i9, i7, i6 / 25, i3, hXVar);
                i6 = i8 + 1;
                if (z) {
                    break;
                }
                i8 = i6;
            }
            i6 = i5 + 1;
            if (!z) {
                i5 = i6;
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int[][] a(byte[] r13, int r14, int r15, int r16, int r17) {
        /*
        r11 = com.google.d_.a;
        r0 = new int[]{r15, r14};
        r1 = java.lang.Integer.TYPE;
        r0 = java.lang.reflect.Array.newInstance(r1, r0);
        r0 = (int[][]) r0;
        r1 = 0;
        r10 = r1;
    L_0x0010:
        if (r10 >= r15) goto L_0x00b3;
    L_0x0012:
        r2 = r10 << 3;
        r1 = r17 + -8;
        if (r2 <= r1) goto L_0x00c2;
    L_0x0018:
        r2 = 0;
        r9 = r2;
    L_0x001a:
        if (r9 >= r14) goto L_0x00af;
    L_0x001c:
        r3 = r9 << 3;
        r2 = r16 + -8;
        if (r3 <= r2) goto L_0x00bf;
    L_0x0022:
        r7 = 0;
        r4 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r3 = 0;
        r6 = 0;
        r5 = r1 * r16;
        r5 = r5 + r2;
        r2 = r3;
        r3 = r4;
        r4 = r7;
    L_0x002d:
        r7 = 8;
        if (r6 >= r7) goto L_0x007a;
    L_0x0031:
        r7 = 0;
        r8 = r7;
    L_0x0033:
        r7 = 8;
        if (r8 >= r7) goto L_0x0048;
    L_0x0037:
        r7 = r5 + r8;
        r7 = r13[r7];
        r7 = r7 & 255;
        r4 = r4 + r7;
        if (r7 >= r3) goto L_0x0041;
    L_0x0040:
        r3 = r7;
    L_0x0041:
        if (r7 <= r2) goto L_0x0044;
    L_0x0043:
        r2 = r7;
    L_0x0044:
        r7 = r8 + 1;
        if (r11 == 0) goto L_0x00bc;
    L_0x0048:
        r7 = r2 - r3;
        r8 = 24;
        if (r7 <= r8) goto L_0x0074;
    L_0x004e:
        r6 = r6 + 1;
        r5 = r5 + r16;
        r12 = r5;
        r5 = r6;
        r6 = r4;
        r4 = r12;
    L_0x0056:
        r7 = 8;
        if (r5 >= r7) goto L_0x0070;
    L_0x005a:
        r7 = 0;
    L_0x005b:
        r8 = 8;
        if (r7 >= r8) goto L_0x006a;
    L_0x005f:
        r8 = r4 + r7;
        r8 = r13[r8];
        r8 = r8 & 255;
        r6 = r6 + r8;
        r7 = r7 + 1;
        if (r11 == 0) goto L_0x005b;
    L_0x006a:
        r5 = r5 + 1;
        r4 = r4 + r16;
        if (r11 == 0) goto L_0x0056;
    L_0x0070:
        r12 = r4;
        r4 = r6;
        r6 = r5;
        r5 = r12;
    L_0x0074:
        r6 = r6 + 1;
        r5 = r5 + r16;
        if (r11 == 0) goto L_0x002d;
    L_0x007a:
        r12 = r2;
        r2 = r4;
        r4 = r3;
        r3 = r12;
        r2 = r2 >> 6;
        r3 = r3 - r4;
        r5 = 24;
        if (r3 > r5) goto L_0x00a7;
    L_0x0085:
        r3 = r4 / 2;
        if (r10 <= 0) goto L_0x00ba;
    L_0x0089:
        if (r9 <= 0) goto L_0x00ba;
    L_0x008b:
        r2 = r10 + -1;
        r2 = r0[r2];
        r2 = r2[r9];
        r5 = r0[r10];
        r6 = r9 + -1;
        r5 = r5[r6];
        r5 = r5 * 2;
        r2 = r2 + r5;
        r5 = r10 + -1;
        r5 = r0[r5];
        r6 = r9 + -1;
        r5 = r5[r6];
        r2 = r2 + r5;
        r2 = r2 / 4;
        if (r4 >= r2) goto L_0x00ba;
    L_0x00a7:
        r3 = r0[r10];
        r3[r9] = r2;
        r2 = r9 + 1;
        if (r11 == 0) goto L_0x00b7;
    L_0x00af:
        r1 = r10 + 1;
        if (r11 == 0) goto L_0x00b4;
    L_0x00b3:
        return r0;
    L_0x00b4:
        r10 = r1;
        goto L_0x0010;
    L_0x00b7:
        r9 = r2;
        goto L_0x001a;
    L_0x00ba:
        r2 = r3;
        goto L_0x00a7;
    L_0x00bc:
        r8 = r7;
        goto L_0x0033;
    L_0x00bf:
        r2 = r3;
        goto L_0x0022;
    L_0x00c2:
        r1 = r2;
        goto L_0x0018;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.dj.a(byte[], int, int, int, int):int[][]");
    }

    public cW a(d dVar) {
        return new dj(dVar);
    }

    public dj(d dVar) {
        super(dVar);
    }

    private static void a(byte[] bArr, int i, int i2, int i3, int i4, hX hXVar) {
        boolean z = d_.a;
        int i5 = (i2 * i4) + i;
        int i6 = 0;
        while (i6 < 8) {
            int i7 = 0;
            while (i7 < 8) {
                if ((bArr[i5 + i7] & 255) <= i3) {
                    hXVar.c(i + i7, i2 + i6);
                }
                i7++;
                if (z) {
                    break;
                }
            }
            i6++;
            i7 = i5 + i4;
            if (!z) {
                i5 = i7;
            } else {
                return;
            }
        }
    }
}
