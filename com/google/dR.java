package com.google;

import com.whatsapp.arj;
import org.v;
import org.whispersystems.at;

final class dR {
    private static final String z;
    private final hX a;
    private final a b;
    private final hX c;

    static {
        char[] toCharArray = "aB@\u0001\u000bVBB\nEJM\r\u0006\fQfL\u0016\f]\u000b@\u0011\u0016Q\u000b@\u0005\u0011FC\r\u0010\r@\u000b[\u0001\u0017VBB\nEVBW\u0001".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 37;
                    break;
                case at.g /*1*/:
                    i2 = 43;
                    break;
                case at.i /*2*/:
                    i2 = 45;
                    break;
                case at.o /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = arj.Theme_buttonStyleSmall;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    int a(int i, int i2, int i3, int i4) {
        int i5;
        boolean z = false;
        int i6 = a.f;
        if (b(i - 2, i2 - 2, i3, i4)) {
            i5 = 1;
        } else {
            i5 = 0;
        }
        i5 <<= 1;
        if (b(i - 2, i2 - 1, i3, i4)) {
            i5 |= 1;
        }
        i5 <<= 1;
        if (b(i - 1, i2 - 2, i3, i4)) {
            i5 |= 1;
        }
        i5 <<= 1;
        if (b(i - 1, i2 - 1, i3, i4)) {
            i5 |= 1;
        }
        i5 <<= 1;
        if (b(i - 1, i2, i3, i4)) {
            i5 |= 1;
        }
        i5 <<= 1;
        if (b(i, i2 - 2, i3, i4)) {
            i5 |= 1;
        }
        i5 <<= 1;
        if (b(i, i2 - 1, i3, i4)) {
            i5 |= 1;
        }
        i5 <<= 1;
        if (b(i, i2, i3, i4)) {
            i5 |= 1;
        }
        if (i6 != 0) {
            try {
                if (!aK.a) {
                    z = true;
                }
                aK.a = z;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        return i5;
    }

    int a(int i, int i2) {
        int i3;
        if (b(i - 3, 0, i, i2)) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        i3 <<= 1;
        if (b(i - 2, 0, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (b(i - 1, 0, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (b(0, i2 - 4, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (b(0, i2 - 3, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (b(0, i2 - 2, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (b(0, i2 - 1, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (b(1, i2 - 1, i, i2)) {
            return i3 | 1;
        }
        return i3;
    }

    int d(int i, int i2) {
        int i3;
        if (b(i - 1, 0, i, i2)) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        i3 <<= 1;
        if (b(i - 1, 1, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (b(i - 1, 2, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (b(0, i2 - 2, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (b(0, i2 - 1, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (b(1, i2 - 1, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (b(2, i2 - 1, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (b(3, i2 - 1, i, i2)) {
            return i3 | 1;
        }
        return i3;
    }

    int b(int i, int i2) {
        int i3;
        int i4 = a.f;
        if (b(i - 1, 0, i, i2)) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        i3 <<= 1;
        if (b(i - 1, i2 - 1, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (b(0, i2 - 3, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (b(0, i2 - 2, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (b(0, i2 - 1, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (b(1, i2 - 3, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (b(1, i2 - 2, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (b(1, i2 - 1, i, i2)) {
            i3 |= 1;
        }
        try {
            if (aK.a) {
                a.f = i4 + 1;
            }
            return i3;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    dR(hX hXVar) {
        int g = hXVar.g();
        if (g < 8 || g > 144 || (g & 1) != 0) {
            try {
                throw aG.a();
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        this.b = b(hXVar);
        this.c = a(hXVar);
        this.a = new hX(this.c.c(), this.c.g());
    }

    boolean b(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (i < 0) {
            i5 = i + i3;
            i6 = (4 - ((i3 + 4) & 7)) + i2;
        } else {
            i6 = i2;
            i5 = i;
        }
        if (i6 < 0) {
            i6 += i4;
            i5 += 4 - ((i4 + 4) & 7);
        }
        this.a.c(i6, i5);
        return this.c.a(i6, i5);
    }

    hX a(hX hXVar) {
        int i = a.f;
        int d = this.b.d();
        int g = this.b.g();
        try {
            if (hXVar.g() != d) {
                throw new IllegalArgumentException(z);
            }
            int f = this.b.f();
            int b = this.b.b();
            int i2 = d / f;
            int i3 = g / b;
            hX hXVar2 = new hX(i3 * b, i2 * f);
            int i4 = 0;
            while (i4 < i2) {
                int i5 = i4 * f;
                int i6 = 0;
                while (i6 < i3) {
                    int i7 = i6 * b;
                    g = 0;
                    while (g < f) {
                        int i8 = (((f + 2) * i4) + 1) + g;
                        int i9 = i5 + g;
                        d = 0;
                        while (d < b) {
                            if (hXVar.a((((b + 2) * i6) + 1) + d, i8)) {
                                hXVar2.c(i7 + d, i9);
                            }
                            d++;
                            if (i != 0) {
                                break;
                            }
                        }
                        d = g + 1;
                        if (i != 0) {
                            break;
                        }
                        g = d;
                    }
                    d = i6 + 1;
                    if (i != 0) {
                        break;
                    }
                    i6 = d;
                }
                d = i4 + 1;
                if (i != 0) {
                    break;
                }
                i4 = d;
            }
            return hXVar2;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    private static a b(hX hXVar) {
        return a.a(hXVar.g(), hXVar.c());
    }

    a a() {
        return this.b;
    }

    byte[] b() {
        int i = a.f;
        byte[] bArr = new byte[this.b.h()];
        int i2 = 4;
        int i3 = 0;
        int g = this.c.g();
        int c = this.c.c();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        int i4 = 0;
        while (true) {
            int i5;
            if (i2 == g && i3 == 0 && r3 == null) {
                i5 = i4 + 1;
                bArr[i4] = (byte) d(g, c);
                i2 -= 2;
                i3 += 2;
                obj = 1;
                if (i != 0) {
                    i4 = i5;
                }
                if (i2 < g || r4 < c) {
                    i4 = i5;
                } else {
                    try {
                        break;
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                }
            }
            if (i2 == g - 2 && i3 == 0 && (c & 3) != 0 && r2 == null) {
                i5 = i4 + 1;
                bArr[i4] = (byte) a(g, c);
                i2 -= 2;
                i3 += 2;
                obj2 = 1;
                if (i != 0) {
                    i4 = i5;
                }
                if (i2 < g) {
                }
                i4 = i5;
            }
            if (i2 == g + 4 && i3 == 2 && (c & 7) == 0 && r1 == null) {
                i5 = i4 + 1;
                bArr[i4] = (byte) b(g, c);
                i2 -= 2;
                i3 += 2;
                obj3 = 1;
                if (i != 0) {
                    i4 = i5;
                }
                if (i2 < g) {
                }
                i4 = i5;
            }
            if (i2 == g - 2 && i3 == 0 && (c & 7) == 4 && r0 == null) {
                i5 = i4 + 1;
                bArr[i4] = (byte) c(g, c);
                i2 -= 2;
                i3 += 2;
                obj4 = 1;
                if (i != 0) {
                    i4 = i2;
                    i2 = i3;
                    i3 = i5;
                }
                if (i2 < g) {
                }
                i4 = i5;
            } else {
                int i6 = i3;
                i3 = i4;
                i4 = i2;
                i2 = i6;
            }
            while (true) {
                if (i4 < g && i2 >= 0) {
                    try {
                        if (!this.a.a(i2, i4)) {
                            i5 = i3 + 1;
                            bArr[i3] = (byte) a(i4, i2, g, c);
                            i4 -= 2;
                            i3 = i2 + 2;
                            if (i4 < 0 || i3 >= c) {
                                i4++;
                                i2 = i3 + 3;
                                i3 = i5;
                            } else {
                                i2 = i3;
                                i3 = i5;
                            }
                        }
                    } catch (IllegalArgumentException e2) {
                        throw e2;
                    }
                }
                i5 = i3;
                i4 -= 2;
                i3 = i2 + 2;
                if (i4 < 0) {
                    break;
                }
                break;
            }
            i4++;
            i2 = i3 + 3;
            i3 = i5;
            while (true) {
                if (i4 >= 0 && i2 < c) {
                    try {
                        if (!this.a.a(i2, i4)) {
                            i5 = i3 + 1;
                            bArr[i3] = (byte) a(i4, i2, g, c);
                            i4 += 2;
                            i3 = i2 - 2;
                            if (i4 >= g || i3 < 0) {
                                i2 = i4 + 3;
                                i3++;
                            } else {
                                i2 = i3;
                                i3 = i5;
                            }
                        }
                    } catch (IllegalArgumentException e22) {
                        throw e22;
                    }
                }
                i5 = i3;
                i4 += 2;
                i3 = i2 - 2;
                if (i4 >= g) {
                    break;
                }
                break;
            }
            i2 = i4 + 3;
            i3++;
            if (i2 < g) {
            }
            i4 = i5;
        }
        if (i5 == this.b.h()) {
            return bArr;
        }
        throw aG.a();
    }

    int c(int i, int i2) {
        int i3;
        if (b(i - 3, 0, i, i2)) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        i3 <<= 1;
        if (b(i - 2, 0, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (b(i - 1, 0, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (b(0, i2 - 2, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (b(0, i2 - 1, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (b(1, i2 - 1, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (b(2, i2 - 1, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (b(3, i2 - 1, i, i2)) {
            return i3 | 1;
        }
        return i3;
    }
}
