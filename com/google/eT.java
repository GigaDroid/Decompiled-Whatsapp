package com.google;

public final class eT {
    private int a;
    private int b;
    private final byte[] c;

    public int c() {
        return this.b;
    }

    public int a() {
        return ((this.c.length - this.a) * 8) - this.b;
    }

    public int b() {
        return this.a;
    }

    public int a(int i) {
        int i2 = 0;
        boolean z = d_.a;
        if (i >= 1 && i <= 32) {
            try {
                if (i <= a()) {
                    int i3;
                    if (this.b > 0) {
                        i3 = 8 - this.b;
                        if (i < i3) {
                            i2 = i;
                        } else {
                            i2 = i3;
                        }
                        i3 -= i2;
                        i3 = (((255 >> (8 - i2)) << i3) & this.c[this.a]) >> i3;
                        i -= i2;
                        try {
                            this.b = i2 + this.b;
                            if (this.b == 8) {
                                this.b = 0;
                                this.a++;
                                i2 = i3;
                                i3 = i;
                            } else {
                                i2 = i3;
                                i3 = i;
                            }
                        } catch (IllegalArgumentException e) {
                            throw e;
                        }
                    }
                    i3 = i;
                    if (i3 <= 0) {
                        return i2;
                    }
                    while (i3 >= 8) {
                        i2 = (i2 << 8) | (this.c[this.a] & 255);
                        this.a++;
                        i3 -= 8;
                        if (z) {
                            break;
                        }
                    }
                    if (i3 <= 0) {
                        return i2;
                    }
                    int i4 = 8 - i3;
                    i2 = (i2 << i3) | ((((255 >> i4) << i4) & this.c[this.a]) >> i4);
                    this.b = i3 + this.b;
                    return i2;
                }
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }
        throw new IllegalArgumentException(String.valueOf(i));
    }

    public eT(byte[] bArr) {
        this.c = bArr;
    }
}
