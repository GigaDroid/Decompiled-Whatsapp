package com.google;

final class dF {
    private dh a;
    private fQ b;
    private boolean c;
    private final hX d;

    void a(boolean z) {
        this.b = null;
        this.a = null;
        this.c = z;
    }

    byte[] a() {
        boolean z = fQ.b;
        dh d = d();
        fQ b = b();
        B a = B.a(d.a());
        int g = this.d.g();
        a.a(this.d, g);
        hX c = b.c();
        byte[] bArr = new byte[b.f()];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = g - 1;
        int i5 = 1;
        while (i4 > 0) {
            if (i4 == 6) {
                i4--;
            }
            int i6 = 0;
            int i7 = i;
            while (i6 < g) {
                if (i5 != 0) {
                    i = (g - 1) - i6;
                } else {
                    i = i6;
                }
                int i8 = 0;
                while (i8 < 2) {
                    int i9;
                    if (!c.a(i4 - i8, i)) {
                        i3++;
                        i2 <<= 1;
                        if (this.d.a(i4 - i8, i)) {
                            i2 |= 1;
                        }
                        if (i3 == 8) {
                            i9 = i7 + 1;
                            bArr[i7] = (byte) i2;
                            i3 = 0;
                            i2 = 0;
                            i7 = i9;
                        }
                    }
                    i9 = i8 + 1;
                    if (z) {
                        break;
                    }
                    i8 = i9;
                }
                i = i3;
                i3 = i2;
                i2 = i7;
                i6++;
                if (z) {
                    i6 = i;
                    i = i2;
                    break;
                }
                i7 = i2;
                i2 = i3;
                i3 = i;
            }
            i6 = i3;
            i = i7;
            i3 = i2;
            i2 = i5 ^ 1;
            i4 -= 2;
            if (z) {
                break;
            }
            i5 = i2;
            i2 = i3;
            i3 = i6;
        }
        if (i == b.f()) {
            return bArr;
        }
        throw aG.a();
    }

    fQ b() {
        boolean z = fQ.b;
        if (this.b != null) {
            return this.b;
        }
        int g = this.d.g();
        int i = (g - 17) / 4;
        if (i <= 6) {
            return fQ.b(i);
        }
        int i2 = g - 11;
        int i3 = 5;
        i = 0;
        while (i3 >= 0) {
            int i4 = g - 9;
            while (i4 >= i2) {
                i = a(i4, i3, i);
                i4--;
                if (z) {
                    break;
                }
            }
            i4 = i3 - 1;
            if (z) {
                break;
            }
            i3 = i4;
        }
        fQ a = fQ.a(i);
        if (a == null || a.d() != g) {
            i = 0;
            int i5 = 5;
            while (i5 >= 0) {
                int i6 = g - 9;
                while (i6 >= i2) {
                    i = a(i5, i6, i);
                    i6--;
                    if (z) {
                        break;
                    }
                }
                i6 = i5 - 1;
                if (z) {
                    break;
                }
                i5 = i6;
            }
            a = fQ.a(i);
            if (a == null || a.d() != g) {
                throw aG.a();
            }
            this.b = a;
            return a;
        }
        this.b = a;
        return a;
    }

    dh d() {
        boolean z = fQ.b;
        if (this.a != null) {
            return this.a;
        }
        int i = 0;
        int i2 = 0;
        while (i < 6) {
            i2 = a(i, 8, i2);
            i++;
            if (z) {
                break;
            }
        }
        i2 = a(8, 7, a(8, 8, a(7, 8, i2)));
        i = 5;
        while (i >= 0) {
            i2 = a(8, i, i2);
            i--;
            if (z) {
                break;
            }
        }
        int g = this.d.g();
        int i3 = g - 7;
        i = 0;
        int i4 = g - 1;
        while (i4 >= i3) {
            i = a(8, i4, i);
            i4--;
            if (z) {
                break;
            }
        }
        i4 = g - 8;
        while (i4 < g) {
            i = a(i4, 8, i);
            i4++;
            if (z) {
                break;
            }
        }
        this.a = dh.a(i2, i);
        if (this.a != null) {
            return this.a;
        }
        throw aG.a();
    }

    dF(hX hXVar) {
        int g = hXVar.g();
        if (g < 21 || (g & 3) != 1) {
            throw aG.a();
        }
        this.d = hXVar;
    }

    private int a(int i, int i2, int i3) {
        if (this.c ? this.d.a(i2, i) : this.d.a(i, i2)) {
            return (i3 << 1) | 1;
        }
        return i3 << 1;
    }

    void c() {
        boolean z = fQ.b;
        int i = 0;
        while (i < this.d.c()) {
            int i2 = i + 1;
            while (i2 < this.d.g()) {
                if (this.d.a(i, i2) != this.d.a(i2, i)) {
                    this.d.b(i2, i);
                    this.d.b(i, i2);
                }
                i2++;
                if (z) {
                    break;
                }
            }
            i++;
            if (z) {
                return;
            }
        }
    }

    void e() {
        if (this.a != null) {
            B.a(this.a.a()).a(this.d, this.d.g());
        }
    }
}
