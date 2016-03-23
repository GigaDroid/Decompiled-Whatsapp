package com.google;

import com.whatsapp.arj;
import java.util.Arrays;
import org.v;
import org.whispersystems.at;

public final class d_ implements Cloneable {
    public static boolean a;
    private static final String[] z;
    private int[] b;
    private int c;

    static {
        String[] strArr = new String[2];
        String str = "%\u0019S\u000fkV\u0014F\u0004?\u0002PD\u000bl\u0015\u0018";
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
                        i3 = 118;
                        break;
                    case at.g /*1*/:
                        i3 = 112;
                        break;
                    case at.i /*2*/:
                        i3 = 41;
                        break;
                    case at.o /*3*/:
                        i3 = arj.Theme_ratingBarStyle;
                        break;
                    default:
                        i3 = 24;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "8\u0005DJz\u001f\u0004ZJu\u0003\u0003]Jz\u0013PK\u000fl\u0001\u0015L\u00048FPH\u0004|VC\u001b";
                    obj = null;
            }
        }
    }

    private static int[] b(int i) {
        return new int[((i + 31) / 32)];
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(int r13, int r14, boolean r15) {
        /*
        r12 = this;
        r3 = 31;
        r4 = 1;
        r1 = 0;
        r8 = a;
        if (r14 >= r13) goto L_0x0010;
    L_0x0008:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x000e }
        r0.<init>();	 Catch:{ IllegalArgumentException -> 0x000e }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x000e }
    L_0x000e:
        r0 = move-exception;
        throw r0;
    L_0x0010:
        if (r14 != r13) goto L_0x0014;
    L_0x0012:
        r1 = r4;
    L_0x0013:
        return r1;
    L_0x0014:
        r9 = r14 + -1;
        r7 = r13 / 32;
        r10 = r9 / 32;
        r6 = r7;
    L_0x001b:
        if (r6 > r10) goto L_0x0042;
    L_0x001d:
        if (r6 <= r7) goto L_0x0044;
    L_0x001f:
        r0 = r1;
    L_0x0020:
        if (r6 >= r10) goto L_0x0047;
    L_0x0022:
        r2 = r3;
    L_0x0023:
        if (r0 != 0) goto L_0x002a;
    L_0x0025:
        if (r2 != r3) goto L_0x002a;
    L_0x0027:
        r5 = -1;
        if (r8 == 0) goto L_0x0050;
    L_0x002a:
        r5 = r0;
        r0 = r1;
    L_0x002c:
        if (r5 > r2) goto L_0x0035;
    L_0x002e:
        r11 = r4 << r5;
        r0 = r0 | r11;
        r5 = r5 + 1;
        if (r8 == 0) goto L_0x002c;
    L_0x0035:
        r2 = r12.b;	 Catch:{ IllegalArgumentException -> 0x004a }
        r2 = r2[r6];	 Catch:{ IllegalArgumentException -> 0x004a }
        r2 = r2 & r0;
        if (r15 == 0) goto L_0x004c;
    L_0x003c:
        if (r2 != r0) goto L_0x0013;
    L_0x003e:
        r0 = r6 + 1;
        if (r8 == 0) goto L_0x004e;
    L_0x0042:
        r1 = r4;
        goto L_0x0013;
    L_0x0044:
        r0 = r13 & 31;
        goto L_0x0020;
    L_0x0047:
        r2 = r9 & 31;
        goto L_0x0023;
    L_0x004a:
        r0 = move-exception;
        throw r0;
    L_0x004c:
        r0 = r1;
        goto L_0x003c;
    L_0x004e:
        r6 = r0;
        goto L_0x001b;
    L_0x0050:
        r0 = r5;
        goto L_0x0035;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.d_.a(int, int, boolean):boolean");
    }

    public d_(int i) {
        this.c = i;
        this.b = b(i);
    }

    public int f() {
        return (this.c + 7) / 8;
    }

    public void a(int i, byte[] bArr, int i2, int i3) {
        boolean z = a;
        int i4 = 0;
        int i5 = i;
        while (i4 < i3) {
            int i6 = 0;
            int i7 = 0;
            while (i6 < 8) {
                if (f(i5)) {
                    i7 |= 1 << (7 - i6);
                }
                i5++;
                i6++;
                if (z) {
                    break;
                }
            }
            bArr[i2 + i4] = (byte) i7;
            i7 = i4 + 1;
            if (!z) {
                i4 = i7;
            } else {
                return;
            }
        }
    }

    public int c(int i) {
        boolean z = a;
        try {
            if (i >= this.c) {
                return this.c;
            }
            int i2 = i / 32;
            int i3 = this.b[i2] & (((1 << (i & 31)) - 1) ^ -1);
            while (i3 == 0) {
                i2++;
                try {
                    if (i2 != this.b.length) {
                        i3 = this.b[i2];
                        if (z) {
                            break;
                        }
                    }
                    return this.c;
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            i3 = Integer.numberOfTrailingZeros(i3) + (i2 * 32);
            try {
                if (i3 > this.c) {
                    return this.c;
                }
                return i3;
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    public int d(int i) {
        boolean z = a;
        try {
            if (i >= this.c) {
                return this.c;
            }
            int i2 = i / 32;
            int i3 = (this.b[i2] ^ -1) & (((1 << (i & 31)) - 1) ^ -1);
            while (i3 == 0) {
                i2++;
                try {
                    if (i2 != this.b.length) {
                        i3 = this.b[i2] ^ -1;
                        if (z) {
                            break;
                        }
                    }
                    return this.c;
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            i3 = Integer.numberOfTrailingZeros(i3) + (i2 * 32);
            try {
                return i3 > this.c ? this.c : i3;
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    public boolean equals(Object obj) {
        try {
            if (!(obj instanceof d_)) {
                return false;
            }
            d_ d_Var = (d_) obj;
            try {
                if (this.c != d_Var.c) {
                    return false;
                }
                if (Arrays.equals(this.b, d_Var.b)) {
                    return true;
                }
                return false;
            } catch (IllegalArgumentException e) {
                throw e;
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    public void e(int i) {
        int[] iArr = this.b;
        int i2 = i / 32;
        iArr[i2] = iArr[i2] | (1 << (i & 31));
    }

    public void a(boolean z) {
        try {
            a(this.c + 1);
            if (z) {
                int[] iArr = this.b;
                int i = this.c / 32;
                iArr[i] = iArr[i] | (1 << (this.c & 31));
            }
            this.c++;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public int d() {
        return this.c;
    }

    d_(int[] iArr, int i) {
        this.b = iArr;
        this.c = i;
    }

    private void a(int i) {
        if (i > this.b.length * 32) {
            Object b = b(i);
            System.arraycopy(this.b, 0, b, 0, this.b.length);
            this.b = b;
        }
    }

    public int[] e() {
        return this.b;
    }

    public boolean f(int i) {
        try {
            return (this.b[i / 32] & (1 << (i & 31))) != 0;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public void b(d_ d_Var) {
        boolean z = a;
        int i = d_Var.c;
        a(this.c + i);
        int i2 = 0;
        while (i2 < i) {
            a(d_Var.f(i2));
            i2++;
            if (z) {
                return;
            }
        }
    }

    public void b(int i, int i2) {
        this.b[i / 32] = i2;
    }

    public int hashCode() {
        return (this.c * 31) + Arrays.hashCode(this.b);
    }

    public void a(int i, int i2) {
        boolean z = a;
        if (i2 < 0 || i2 > 32) {
            try {
                throw new IllegalArgumentException(z[1]);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        a(this.c + i2);
        while (i2 > 0) {
            boolean z2;
            if (((i >> (i2 - 1)) & 1) == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            a(z2);
            i2--;
            if (z) {
                return;
            }
        }
    }

    public void a() {
        boolean z = a;
        int length = this.b.length;
        int i = 0;
        while (i < length) {
            this.b[i] = 0;
            i++;
            if (z) {
                return;
            }
        }
    }

    public String toString() {
        boolean z = a;
        StringBuilder stringBuilder = new StringBuilder(this.c);
        int i = 0;
        while (i < this.c) {
            if ((i & 7) == 0) {
                try {
                    stringBuilder.append(' ');
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            try {
                char c;
                if (f(i)) {
                    c = 'X';
                } else {
                    c = '.';
                }
                stringBuilder.append(c);
                i++;
                if (z) {
                    break;
                }
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }
        return stringBuilder.toString();
    }

    public void b() {
        boolean z = a;
        int[] iArr = new int[this.b.length];
        int i = (this.c - 1) / 32;
        int i2 = i + 1;
        int i3 = 0;
        while (i3 < i2) {
            long j = (long) this.b[i3];
            j = ((j & 1431655765) << 1) | ((j >> 1) & 1431655765);
            j = ((j & 858993459) << 2) | ((j >> 2) & 858993459);
            j = ((j & 252645135) << 4) | ((j >> 4) & 252645135);
            j = ((j & 16711935) << 8) | ((j >> 8) & 16711935);
            iArr[i - i3] = (int) (((j & 65535) << 16) | ((j >> 16) & 65535));
            i3++;
            if (z) {
                break;
            }
        }
        if (this.c != i2 * 32) {
            int i4 = (i2 * 32) - this.c;
            i3 = 1;
            i = 0;
            while (i < 31 - i4) {
                i3 = (i3 << 1) | 1;
                i++;
                if (z) {
                    break;
                }
            }
            i = (iArr[0] >> i4) & i3;
            int i5 = 1;
            while (i5 < i2) {
                int i6 = iArr[i5];
                iArr[i5 - 1] = i | (i6 << (32 - i4));
                i = (i6 >> i4) & i3;
                i5++;
                if (z) {
                    break;
                }
            }
            iArr[i2 - 1] = i;
        }
        this.b = iArr;
    }

    public Object clone() {
        return c();
    }

    public void a(d_ d_Var) {
        int i = 0;
        boolean z = a;
        try {
            if (this.b.length != d_Var.b.length) {
                throw new IllegalArgumentException(z[0]);
            }
            while (i < this.b.length) {
                int[] iArr = this.b;
                iArr[i] = iArr[i] ^ d_Var.b[i];
                i++;
                if (z) {
                    return;
                }
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public d_ c() {
        return new d_((int[]) this.b.clone(), this.c);
    }

    public d_() {
        this.c = 0;
        this.b = new int[1];
    }
}
