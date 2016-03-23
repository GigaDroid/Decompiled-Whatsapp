package com.google;

import java.util.Arrays;
import java.util.Map;
import org.v;
import org.whispersystems.at;

public final class al extends aU {
    private static final char[] b;
    static final char[] d;
    static final int[] e;
    private int c;
    private int[] f;
    private final StringBuilder g;

    private void a(int i) {
        this.f[this.c] = i;
        this.c++;
        if (this.c >= this.f.length) {
            Object obj = new int[(this.c * 2)];
            System.arraycopy(this.f, 0, obj, 0, this.c);
            this.f = obj;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(com.google.d_ r9) {
        /*
        r8 = this;
        r1 = 1;
        r2 = 0;
        r5 = com.google.aU.a;
        r8.c = r2;
        r0 = r9.d(r2);
        r6 = r9.d();
        if (r0 < r6) goto L_0x0015;
    L_0x0010:
        r0 = com.google.aN.a();
        throw r0;
    L_0x0015:
        r3 = r1;
        r4 = r0;
        r0 = r2;
    L_0x0018:
        if (r4 >= r6) goto L_0x0031;
    L_0x001a:
        r7 = r9.f(r4);
        r7 = r7 ^ r3;
        if (r7 == 0) goto L_0x0025;
    L_0x0021:
        r0 = r0 + 1;
        if (r5 == 0) goto L_0x002d;
    L_0x0025:
        r8.a(r0);
        if (r3 != 0) goto L_0x0035;
    L_0x002a:
        r0 = r1;
    L_0x002b:
        r3 = r0;
        r0 = r1;
    L_0x002d:
        r4 = r4 + 1;
        if (r5 == 0) goto L_0x0018;
    L_0x0031:
        r8.a(r0);
        return;
    L_0x0035:
        r0 = r2;
        goto L_0x002b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.al.a(com.google.d_):void");
    }

    static {
        char[] toCharArray = "QA?\u0005\u000fTF:\u000e\u0002LT7\u0019\u0015J1Ou\u007f".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 97;
                    break;
                case at.g /*1*/:
                    i2 = 112;
                    break;
                case at.i /*2*/:
                    i2 = 13;
                    break;
                case at.o /*3*/:
                    i2 = 54;
                    break;
                default:
                    i2 = 59;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        d = new String(cArr).intern().toCharArray();
        e = new int[]{3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};
        b = new char[]{'A', 'B', 'C', 'D'};
    }

    static boolean a(char[] cArr, char c) {
        int i = aU.a;
        if (cArr == null) {
            return false;
        }
        int length = cArr.length;
        int i2 = 0;
        while (i2 < length) {
            if (cArr[i2] == c) {
                return true;
            }
            i2++;
            if (i != 0) {
                return false;
            }
        }
        return false;
    }

    public f6 a(int i, d_ d_Var, Map map) {
        int c;
        int i2 = aU.a;
        Arrays.fill(this.f, 0);
        a(d_Var);
        int a = a();
        this.g.setLength(0);
        int i3 = a;
        do {
            c = c(i3);
            if (c != -1) {
                this.g.append((char) c);
                i3 += 8;
                if (this.g.length() > 1 && a(b, d[c]) && i2 == 0) {
                    break;
                }
            } else {
                throw aN.a();
            }
        } while (i3 < this.c);
        int i4 = this.f[i3 - 1];
        int i5 = -8;
        c = 0;
        while (i5 < -1) {
            c += this.f[i3 + i5];
            i5++;
            if (i2 != 0) {
                break;
            }
        }
        if (i3 >= this.c || i4 >= r2 / 2) {
            b(a);
            c = 0;
            while (c < this.g.length()) {
                this.g.setCharAt(c, d[this.g.charAt(c)]);
                c++;
                if (i2 != 0) {
                    break;
                }
            }
            if (a(b, this.g.charAt(0))) {
                if (!a(b, this.g.charAt(this.g.length() - 1))) {
                    throw aN.a();
                } else if (this.g.length() <= 3) {
                    throw aN.a();
                } else {
                    if (map == null || !map.containsKey(b3.RETURN_CODABAR_START_END)) {
                        this.g.deleteCharAt(this.g.length() - 1);
                        this.g.deleteCharAt(0);
                    }
                    i5 = 0;
                    c = 0;
                    while (i5 < a) {
                        c += this.f[i5];
                        i5++;
                        if (i2 != 0) {
                            break;
                        }
                    }
                    float f = (float) c;
                    int i6 = a;
                    a = c;
                    c = i6;
                    while (c < i3 - 1) {
                        a += this.f[c];
                        c++;
                        if (i2 != 0) {
                            break;
                        }
                    }
                    float f2 = (float) a;
                    f6 f6Var = new f6(this.g.toString(), null, new fI[]{new fI(f, (float) i), new fI(f2, (float) i)}, gg.CODABAR);
                    if (aK.a) {
                        aU.a = i2 + 1;
                    }
                    return f6Var;
                }
            }
            throw aN.a();
        }
        throw aN.a();
    }

    private int c(int i) {
        int i2 = aU.a;
        int i3 = i + 7;
        if (i3 >= this.c) {
            return -1;
        }
        int i4;
        int i5;
        int[] iArr = this.f;
        int i6 = i;
        int i7 = Integer.MAX_VALUE;
        int i8 = 0;
        while (i6 < i3) {
            i4 = iArr[i6];
            if (i4 < i7) {
                i7 = i4;
            }
            if (i4 > i8) {
                i8 = i4;
            }
            i4 = i6 + 2;
            if (i2 != 0) {
                break;
            }
            i6 = i4;
        }
        i4 = (i7 + i8) / 2;
        i6 = i + 1;
        i8 = 0;
        i7 = Integer.MAX_VALUE;
        while (i6 < i3) {
            i5 = iArr[i6];
            if (i5 < i7) {
                i7 = i5;
            }
            if (i5 > i8) {
                i8 = i5;
            }
            i5 = i6 + 2;
            if (i2 != 0) {
                break;
            }
            i6 = i5;
        }
        i8 = (i7 + i8) / 2;
        i6 = 0;
        i5 = 0;
        i3 = 128;
        while (i6 < 7) {
            if ((i6 & 1) == 0) {
                i7 = i4;
            } else {
                i7 = i8;
            }
            i3 >>= 1;
            if (iArr[i + i6] > i7) {
                i7 = i5 | i3;
            } else {
                i7 = i5;
            }
            i5 = i6 + 1;
            if (i2 != 0) {
                break;
            }
            i6 = i5;
            i5 = i7;
        }
        i7 = i5;
        i8 = 0;
        while (i8 < e.length) {
            if (e[i8] != i7) {
                i8++;
                if (i2 != 0) {
                    break;
                }
            }
            return i8;
        }
        return -1;
    }

    private int a() {
        int i = aU.a;
        int i2 = 1;
        while (i2 < this.c) {
            int c = c(i2);
            if (c != -1 && a(b, d[c])) {
                c = 0;
                int i3 = i2;
                while (i3 < i2 + 7) {
                    c += this.f[i3];
                    i3++;
                    if (i != 0) {
                        break;
                    }
                }
                if (i2 == 1 || this.f[i2 - 1] >= r2 / 2) {
                    return i2;
                }
            }
            i2 += 2;
            if (i != 0) {
                break;
            }
        }
        throw aN.a();
    }

    void b(int i) {
        int i2 = aU.a;
        int[] iArr = new int[]{0, 0, 0, 0};
        int[] iArr2 = new int[]{0, 0, 0, 0};
        int length = this.g.length() - 1;
        int i3 = 0;
        int i4 = i;
        do {
            int i5 = e[this.g.charAt(i3)];
            int i6 = 6;
            while (i6 >= 0) {
                int i7 = (i6 & 1) + ((i5 & 1) * 2);
                iArr[i7] = iArr[i7] + this.f[i4 + i6];
                iArr2[i7] = iArr2[i7] + 1;
                i5 >>= 1;
                i6--;
                if (i2 != 0) {
                    break;
                }
            }
            if (i3 >= length && i2 == 0) {
                break;
            }
            i4 += 8;
            i3++;
        } while (i2 == 0);
        float[] fArr = new float[4];
        float[] fArr2 = new float[4];
        i3 = 0;
        while (i3 < 2) {
            fArr2[i3] = 0.0f;
            fArr2[i3 + 2] = ((((float) iArr[i3]) / ((float) iArr2[i3])) + (((float) iArr[i3 + 2]) / ((float) iArr2[i3 + 2]))) / 2.0f;
            fArr[i3] = fArr2[i3 + 2];
            fArr[i3 + 2] = ((((float) iArr[i3 + 2]) * 2.0f) + 1.5f) / ((float) iArr2[i3 + 2]);
            i3++;
            if (i2 != 0) {
                break;
            }
        }
        i3 = 0;
        do {
            i6 = e[this.g.charAt(i3)];
            i4 = 6;
            while (i4 >= 0) {
                int i8 = (i4 & 1) + ((i6 & 1) * 2);
                int i9 = this.f[i + i4];
                if (((float) i9) >= fArr2[i8] && ((float) i9) <= fArr[i8]) {
                    i6 >>= 1;
                    i4--;
                    if (i2 != 0) {
                        break;
                    }
                }
                throw aN.a();
            }
            if (i3 < length || i2 != 0) {
                i += 8;
                i3++;
            } else {
                return;
            }
        } while (i2 == 0);
    }

    public al() {
        this.g = new StringBuilder(20);
        this.f = new int[80];
        this.c = 0;
    }
}
