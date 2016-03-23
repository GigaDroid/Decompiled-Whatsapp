package com.google;

public class dd extends cW {
    private static final byte[] d;
    private byte[] b;
    private final int[] c;

    private static int a(int[] iArr) {
        int i = 0;
        boolean z = d_.a;
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i2 < length) {
            if (iArr[i2] > i3) {
                i3 = iArr[i2];
                i4 = i2;
            }
            if (iArr[i2] > i5) {
                i5 = iArr[i2];
            }
            i2++;
            if (z) {
                break;
            }
        }
        i3 = i5;
        int i6 = 0;
        i2 = 0;
        while (i < length) {
            i5 = i - i4;
            i5 *= iArr[i] * i5;
            if (i5 > i6) {
                i2 = i;
            } else {
                i5 = i6;
            }
            i++;
            if (z) {
                break;
            }
            i6 = i5;
        }
        if (i4 <= i2) {
            int i7 = i2;
            i2 = i4;
            i4 = i7;
        }
        if (i4 - i2 <= length / 16) {
            throw aN.a();
        }
        i5 = i4 - 1;
        i = -1;
        length = i4 - 1;
        while (length > i2) {
            i6 = length - i2;
            i6 = ((i6 * i6) * (i4 - length)) * (i3 - iArr[length]);
            if (i6 > i) {
                i5 = length;
            } else {
                i6 = i;
            }
            length--;
            if (z) {
                break;
            }
            i = i6;
        }
        return i5 << 3;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.d_ a(int r10, com.google.d_ r11) {
        /*
        r9 = this;
        r0 = 1;
        r2 = 0;
        r4 = com.google.d_.a;
        r1 = r9.d();
        r5 = r1.d();
        if (r11 == 0) goto L_0x0014;
    L_0x000e:
        r3 = r11.d();
        if (r3 >= r5) goto L_0x001b;
    L_0x0014:
        r11 = new com.google.d_;
        r11.<init>(r5);
        if (r4 == 0) goto L_0x001e;
    L_0x001b:
        r11.a();
    L_0x001e:
        r9.a(r5);
        r3 = r9.b;
        r6 = r1.a(r10, r3);
        r3 = r9.c;
        r1 = r2;
    L_0x002a:
        if (r1 >= r5) goto L_0x003c;
    L_0x002c:
        r7 = r6[r1];
        r7 = r7 & 255;
        r7 = r7 >> 3;
        r8 = r3[r7];
        r8 = r8 + 1;
        r3[r7] = r8;
        r1 = r1 + 1;
        if (r4 == 0) goto L_0x002a;
    L_0x003c:
        r7 = a(r3);
        r1 = r6[r2];
        r2 = r1 & 255;
        r1 = r6[r0];
        r1 = r1 & 255;
        r3 = r2;
    L_0x0049:
        r2 = r5 + -1;
        if (r0 >= r2) goto L_0x0063;
    L_0x004d:
        r2 = r0 + 1;
        r2 = r6[r2];
        r2 = r2 & 255;
        r8 = r1 * 4;
        r3 = r8 - r3;
        r3 = r3 - r2;
        r3 = r3 / 2;
        if (r3 >= r7) goto L_0x005f;
    L_0x005c:
        r11.e(r0);
    L_0x005f:
        r0 = r0 + 1;
        if (r4 == 0) goto L_0x0064;
    L_0x0063:
        return r11;
    L_0x0064:
        r3 = r1;
        r1 = r2;
        goto L_0x0049;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.dd.a(int, com.google.d_):com.google.d_");
    }

    public cW a(d dVar) {
        return new dd(dVar);
    }

    public hX c() {
        boolean z = d_.a;
        d d = d();
        int d2 = d.d();
        int b = d.b();
        hX hXVar = new hX(d2, b);
        a(d2);
        int[] iArr = this.c;
        int i = 1;
        while (i < 5) {
            byte[] a = d.a((b * i) / 5, this.b);
            int i2 = (d2 * 4) / 5;
            int i3 = d2 / 5;
            while (i3 < i2) {
                int i4 = (a[i3] & 255) >> 3;
                iArr[i4] = iArr[i4] + 1;
                i3++;
                if (z) {
                    break;
                }
            }
            i3 = i + 1;
            if (z) {
                break;
            }
            i = i3;
        }
        int a2 = a(iArr);
        byte[] c = d.c();
        i = 0;
        while (i < b) {
            int i5 = i * d2;
            i3 = 0;
            while (i3 < d2) {
                if ((c[i5 + i3] & 255) < a2) {
                    hXVar.c(i3, i);
                }
                i3++;
                if (z) {
                    break;
                }
            }
            i3 = i + 1;
            if (z) {
                break;
            }
            i = i3;
        }
        return hXVar;
    }

    static {
        d = new byte[0];
    }

    private void a(int i) {
        boolean z = d_.a;
        if (this.b.length < i) {
            this.b = new byte[i];
        }
        int i2 = 0;
        while (i2 < 32) {
            this.c[i2] = 0;
            i2++;
            if (z) {
                return;
            }
        }
    }

    public dd(d dVar) {
        super(dVar);
        this.b = d;
        this.c = new int[32];
    }
}
