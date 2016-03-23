package com.google;

import org.v;
import org.whispersystems.at;

public final class e extends d {
    private static final String[] z;
    private final byte[] c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;

    static {
        String[] strArr = new String[2];
        String str = "\t,5\u0007!(=!\u0016d)&3R-(i+\u00070(  \u0017d/!!R-6(#\u0017~{";
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
                        i3 = 91;
                        break;
                    case at.g /*1*/:
                        i3 = 73;
                        break;
                    case at.i /*2*/:
                        i3 = 68;
                        break;
                    case at.o /*3*/:
                        i3 = 114;
                        break;
                    default:
                        i3 = 68;
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
                    str = "\u0018;+\u0002d),'\u0006%5.(\u0017d?&!\u0001d5&0R\"2=d\u0005-/!-\u001cd2$%\u0015!{-%\u0006%u";
                    obj = null;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] a(int r5, byte[] r6) {
        /*
        r4 = this;
        r3 = 0;
        if (r5 < 0) goto L_0x0009;
    L_0x0003:
        r0 = r4.b();	 Catch:{ IllegalArgumentException -> 0x0025 }
        if (r5 < r0) goto L_0x0027;
    L_0x0009:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0025 }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0025 }
        r1.<init>();	 Catch:{ IllegalArgumentException -> 0x0025 }
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x0025 }
        r3 = 0;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x0025 }
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x0025 }
        r1 = r1.append(r5);	 Catch:{ IllegalArgumentException -> 0x0025 }
        r1 = r1.toString();	 Catch:{ IllegalArgumentException -> 0x0025 }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x0025 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0025 }
    L_0x0025:
        r0 = move-exception;
        throw r0;
    L_0x0027:
        r0 = r4.d();
        if (r6 == 0) goto L_0x0030;
    L_0x002d:
        r1 = r6.length;	 Catch:{ IllegalArgumentException -> 0x0041 }
        if (r1 >= r0) goto L_0x0032;
    L_0x0030:
        r6 = new byte[r0];
    L_0x0032:
        r1 = r4.d;
        r1 = r1 + r5;
        r2 = r4.f;
        r1 = r1 * r2;
        r2 = r4.g;
        r1 = r1 + r2;
        r2 = r4.c;
        java.lang.System.arraycopy(r2, r1, r6, r3, r0);
        return r6;
    L_0x0041:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.e.a(int, byte[]):byte[]");
    }

    public e(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        super(i5, i6);
        if (i3 + i5 > i || i4 + i6 > i2) {
            try {
                throw new IllegalArgumentException(z[1]);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        try {
            this.c = bArr;
            this.f = i;
            this.e = i2;
            this.g = i3;
            this.d = i4;
            if (z) {
                a(i5, i6);
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    private void a(int i, int i2) {
        int i3 = fI.a;
        byte[] bArr = this.c;
        int i4 = this.g + (this.d * this.f);
        int i5 = 0;
        while (i5 < i2) {
            int i6 = i4 + (i / 2);
            int i7 = (i4 + i) - 1;
            int i8 = i4;
            while (i8 < i6) {
                byte b = bArr[i8];
                bArr[i8] = bArr[i7];
                bArr[i7] = b;
                i8++;
                i7--;
                if (i3 != 0) {
                    break;
                }
            }
            i7 = i5 + 1;
            i4 += this.f;
            if (i3 == 0) {
                i5 = i7;
            } else {
                return;
            }
        }
    }

    public byte[] c() {
        int i = 0;
        int i2 = fI.a;
        int d = d();
        int b = b();
        try {
            if (d == this.f) {
                if (b == this.e) {
                    return this.c;
                }
            }
            int i3 = d * b;
            byte[] bArr = new byte[i3];
            int i4 = (this.d * this.f) + this.g;
            try {
                if (d == this.f) {
                    System.arraycopy(this.c, i4, bArr, 0, i3);
                    return bArr;
                }
                Object obj = this.c;
                while (i < b) {
                    System.arraycopy(obj, i4, bArr, i * d, d);
                    i4 += this.f;
                    i++;
                    if (i2 != 0) {
                        return bArr;
                    }
                }
                return bArr;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }
}
