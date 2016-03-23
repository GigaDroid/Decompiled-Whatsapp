package com.google;

import java.util.Arrays;
import org.v;
import org.whispersystems.at;

public final class hX implements Cloneable {
    private static final String[] z;
    private final int a;
    private final int b;
    private final int[] c;
    private final int d;

    static {
        String[] strArr = new String[6];
        String str = "\u0000\f";
        Object obj = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i2 = 0; length > i2; i2++) {
                int i3;
                char c = cArr[i2];
                switch (i2 % 5) {
                    case v.m /*0*/:
                        i3 = 88;
                        break;
                    case at.g /*1*/:
                        i3 = 44;
                        break;
                    case at.i /*2*/:
                        i3 = 37;
                        break;
                    case at.o /*3*/:
                        i3 = 8;
                        break;
                    default:
                        i3 = 86;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u0014IC|v9BA(\"7\\\u0005e#+X\u0005j3xBJf8=KD|?.I";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\fD@($=KLg8xAP{\"xJL|v1BVa2=\fQ`3xAD|$1T";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "\u0010ILo>,\fDf2x[Ll\"0\fH}%,\fGmv9X\u0005d39_Q(g";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u001aCQ`v<EHm8+EJf%xAP{\"xN@(1*ID|3*\fQ`76\f\u0015";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "x\f";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public Object clone() {
        return f();
    }

    public int[] a() {
        boolean z = d_.a;
        int i = this.b;
        int i2 = this.a;
        int i3 = i;
        i = -1;
        int i4 = -1;
        int i5 = 0;
        while (i5 < this.a) {
            int i6 = i3;
            i3 = i2;
            i2 = i;
            i = i4;
            i4 = 0;
            while (i4 < this.d) {
                int i7 = this.c[(this.d * i5) + i4];
                if (i7 != 0) {
                    int i8;
                    if (i5 < i3) {
                        i3 = i5;
                    }
                    if (i5 > i) {
                        i = i5;
                    }
                    if (i4 * 32 < i6) {
                        i8 = 0;
                        while ((i7 << (31 - i8)) == 0) {
                            i8++;
                            if (z) {
                                break;
                            }
                        }
                        if ((i4 * 32) + i8 < i6) {
                            i6 = (i4 * 32) + i8;
                        }
                    }
                    if ((i4 * 32) + 31 > i2) {
                        i8 = 31;
                        while ((i7 >>> i8) == 0) {
                            i8--;
                            if (z) {
                                break;
                            }
                        }
                        if ((i4 * 32) + i8 > i2) {
                            i2 = (i4 * 32) + i8;
                        }
                    }
                }
                i4++;
                if (z) {
                    break;
                }
            }
            i4 = i;
            i = i2;
            i2 = i3;
            i3 = i6;
            i5++;
            if (z) {
                break;
            }
        }
        i4 -= i2;
        if (i - i3 < 0 || i4 < 0) {
            return null;
        }
        return new int[]{i3, i2, i, i4};
    }

    public int[] e() {
        boolean z = d_.a;
        int length = this.c.length - 1;
        while (length >= 0) {
            try {
                if (this.c[length] != 0) {
                    break;
                }
                length--;
                if (z) {
                    break;
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        if (length < 0) {
            return null;
        }
        int i = length / this.d;
        int i2 = (length % this.d) * 32;
        int i3 = this.c[length];
        length = 31;
        while ((i3 >>> length) == 0) {
            length--;
            if (z) {
                break;
            }
        }
        int i4 = i2 + length;
        return new int[]{i4, i};
    }

    public int hashCode() {
        return (((((((this.b * 31) + this.b) * 31) + this.a) * 31) + this.d) * 31) + Arrays.hashCode(this.c);
    }

    public void b(int i, int i2) {
        int i3 = (this.d * i2) + (i / 32);
        int[] iArr = this.c;
        iArr[i3] = iArr[i3] ^ (1 << (i & 31));
    }

    public hX(int i, int i2) {
        if (i < 1 || i2 < 1) {
            try {
                throw new IllegalArgumentException(z[5]);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        this.b = i;
        this.a = i2;
        this.d = (i + 31) / 32;
        this.c = new int[(this.d * i2)];
    }

    public boolean equals(Object obj) {
        try {
            if (!(obj instanceof hX)) {
                return false;
            }
            hX hXVar = (hX) obj;
            try {
                if (this.b != hXVar.b) {
                    return false;
                }
                if (this.a != hXVar.a) {
                    return false;
                }
                try {
                    if (this.d != hXVar.d) {
                        return false;
                    }
                    try {
                        if (Arrays.equals(this.c, hXVar.c)) {
                            return true;
                        }
                        return false;
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                } catch (IllegalArgumentException e2) {
                    throw e2;
                }
            } catch (IllegalArgumentException e22) {
                throw e22;
            } catch (IllegalArgumentException e222) {
                throw e222;
            }
        } catch (IllegalArgumentException e2222) {
            throw e2222;
        }
    }

    public hX f() {
        return new hX(this.b, this.a, this.d, (int[]) this.c.clone());
    }

    public int c() {
        return this.b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.d_ a(int r8, com.google.d_ r9) {
        /*
        r7 = this;
        r2 = com.google.d_.a;
        if (r9 == 0) goto L_0x000c;
    L_0x0004:
        r0 = r9.d();	 Catch:{ IllegalArgumentException -> 0x0031 }
        r1 = r7.b;	 Catch:{ IllegalArgumentException -> 0x0031 }
        if (r0 >= r1) goto L_0x0035;
    L_0x000c:
        r0 = new com.google.d_;
        r1 = r7.b;
        r0.<init>(r1);
        if (r2 == 0) goto L_0x0018;
    L_0x0015:
        r0.a();	 Catch:{ IllegalArgumentException -> 0x0033 }
    L_0x0018:
        r1 = r7.d;
        r3 = r8 * r1;
        r1 = 0;
    L_0x001d:
        r4 = r7.d;
        if (r1 >= r4) goto L_0x0030;
    L_0x0021:
        r4 = r1 * 32;
        r5 = r7.c;
        r6 = r3 + r1;
        r5 = r5[r6];
        r0.b(r4, r5);
        r1 = r1 + 1;
        if (r2 == 0) goto L_0x001d;
    L_0x0030:
        return r0;
    L_0x0031:
        r0 = move-exception;
        throw r0;
    L_0x0033:
        r0 = move-exception;
        throw r0;
    L_0x0035:
        r0 = r9;
        goto L_0x0015;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.hX.a(int, com.google.d_):com.google.d_");
    }

    public void b() {
        boolean z = d_.a;
        int c = c();
        int g = g();
        d_ d_Var = new d_(c);
        d_ d_Var2 = new d_(c);
        c = 0;
        while (c < (g + 1) / 2) {
            d_Var = a(c, d_Var);
            d_Var2 = a((g - 1) - c, d_Var2);
            d_Var.b();
            d_Var2.b();
            b(c, d_Var2);
            b((g - 1) - c, d_Var);
            c++;
            if (z) {
                return;
            }
        }
    }

    public void c(int i, int i2) {
        int i3 = (this.d * i2) + (i / 32);
        int[] iArr = this.c;
        iArr[i3] = iArr[i3] | (1 << (i & 31));
    }

    private hX(int i, int i2, int i3, int[] iArr) {
        this.b = i;
        this.a = i2;
        this.d = i3;
        this.c = iArr;
    }

    public boolean a(int i, int i2) {
        try {
            return ((this.c[(this.d * i2) + (i / 32)] >>> (i & 31)) & 1) != 0;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public void a(int i, int i2, int i3, int i4) {
        boolean z = d_.a;
        if (i2 < 0 || i < 0) {
            try {
                throw new IllegalArgumentException(z[2]);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } else if (i4 < 1 || i3 < 1) {
            try {
                throw new IllegalArgumentException(z[4]);
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        } else {
            int i5 = i + i3;
            int i6 = i2 + i4;
            try {
                if (i6 <= this.a) {
                    if (i5 <= this.b) {
                        while (i2 < i6) {
                            int i7 = i2 * this.d;
                            int i8 = i;
                            while (i8 < i5) {
                                int[] iArr = this.c;
                                int i9 = (i8 / 32) + i7;
                                iArr[i9] = iArr[i9] | (1 << (i8 & 31));
                                i8++;
                                if (z) {
                                    break;
                                }
                            }
                            i2++;
                            if (z) {
                                return;
                            }
                        }
                        return;
                    }
                }
                throw new IllegalArgumentException(z[3]);
            } catch (IllegalArgumentException e22) {
                throw e22;
            } catch (IllegalArgumentException e222) {
                throw e222;
            }
        }
    }

    public void b(int i, d_ d_Var) {
        System.arraycopy(d_Var.e(), 0, this.c, this.d * i, this.d);
    }

    public int g() {
        return this.a;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int[] d() {
        /*
        r7 = this;
        r1 = 0;
        r2 = com.google.d_.a;
        r0 = r1;
    L_0x0004:
        r3 = r7.c;
        r3 = r3.length;
        if (r0 >= r3) goto L_0x0013;
    L_0x0009:
        r3 = r7.c;	 Catch:{ IllegalArgumentException -> 0x001a }
        r3 = r3[r0];	 Catch:{ IllegalArgumentException -> 0x001a }
        if (r3 != 0) goto L_0x0013;
    L_0x000f:
        r0 = r0 + 1;
        if (r2 == 0) goto L_0x0004;
    L_0x0013:
        r3 = r7.c;	 Catch:{ IllegalArgumentException -> 0x001c }
        r3 = r3.length;	 Catch:{ IllegalArgumentException -> 0x001c }
        if (r0 != r3) goto L_0x001e;
    L_0x0018:
        r0 = 0;
    L_0x0019:
        return r0;
    L_0x001a:
        r0 = move-exception;
        throw r0;
    L_0x001c:
        r0 = move-exception;
        throw r0;
    L_0x001e:
        r3 = r7.d;
        r3 = r0 / r3;
        r4 = r7.d;
        r4 = r0 % r4;
        r4 = r4 * 32;
        r5 = r7.c;
        r5 = r5[r0];
        r0 = r1;
    L_0x002d:
        r6 = 31 - r0;
        r6 = r5 << r6;
        if (r6 != 0) goto L_0x0037;
    L_0x0033:
        r0 = r0 + 1;
        if (r2 == 0) goto L_0x002d;
    L_0x0037:
        r2 = r4 + r0;
        r0 = 2;
        r0 = new int[r0];
        r0[r1] = r2;
        r1 = 1;
        r0[r1] = r3;
        goto L_0x0019;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.hX.d():int[]");
    }

    public hX(int i) {
        this(i, i);
    }

    public String toString() {
        boolean z = d_.a;
        StringBuilder stringBuilder = new StringBuilder(this.a * (this.b + 1));
        int i = 0;
        while (i < this.a) {
            int i2 = 0;
            while (i2 < this.b) {
                try {
                    String str;
                    if (a(i2, i)) {
                        str = z[0];
                    } else {
                        str = z[1];
                    }
                    stringBuilder.append(str);
                    i2++;
                    if (z) {
                        break;
                    }
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            stringBuilder.append('\n');
            i++;
            if (z) {
                break;
            }
        }
        return stringBuilder.toString();
    }
}
