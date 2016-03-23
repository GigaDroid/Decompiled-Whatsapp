package com.google;

import com.whatsapp.arj;
import org.v;
import org.whispersystems.at;

public final class au extends aU {
    private static final int d;
    static final int[] e;
    private static final char[] h;
    private static final String z;
    private final boolean b;
    private final boolean c;
    private final int[] f;
    private final StringBuilder g;

    static {
        String str = "o6\u0018a^j1\u001djS\u001eEi\u0016/\u0019@b\u001b \u0014Kg\u001c%\u000fVx\u0001>\nQ}\n3\u0005*\u0004r@{(\u0001w";
        Object obj = -1;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i = 0; length > i; i++) {
                int i2;
                char c = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 95;
                        break;
                    case at.g /*1*/:
                        i2 = 7;
                        break;
                    case at.i /*2*/:
                        i2 = 42;
                        break;
                    case at.o /*3*/:
                        i2 = 82;
                        break;
                    default:
                        i2 = arj.Theme_ratingBarStyle;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    h = str.toCharArray();
                    e = new int[]{52, 289, 97, 352, 49, 304, 112, 37, 292, 100, 265, 73, 328, 25, 280, 88, 13, 268, 76, 28, 259, 67, 322, 19, 274, 82, 7, 262, 70, 22, 385, 193, 448, 145, 400, 208, 133, 388, 196, 148, 168, 162, 138, 42};
                    d = e[39];
                    return;
                default:
                    z = str;
                    str = "o6\u0018a^j1\u001djS\u001eEi\u0016/\u0019@b\u001b \u0014Kg\u001c%\u000fVx\u0001>\nQ}\n3\u0005*\u0004r@{(\u0001w";
                    obj = null;
            }
        }
    }

    public au() {
        this(false);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.f6 a(int r13, com.google.d_ r14, java.util.Map r15) {
        /*
        r12 = this;
        r4 = com.google.aU.a;
        r5 = r12.f;
        r0 = 0;
        java.util.Arrays.fill(r5, r0);
        r6 = r12.g;
        r0 = 0;
        r6.setLength(r0);
        r7 = a(r14, r5);
        r0 = 1;
        r0 = r7[r0];
        r0 = r14.c(r0);
        r8 = r14.d();
    L_0x001d:
        com.google.aU.a(r14, r0, r5);
        r1 = a(r5);
        if (r1 >= 0) goto L_0x002b;
    L_0x0026:
        r0 = com.google.aN.a();
        throw r0;
    L_0x002b:
        r3 = a(r1);
        r6.append(r3);
        r9 = r5.length;
        r1 = 0;
        r2 = r1;
        r1 = r0;
    L_0x0036:
        if (r2 >= r9) goto L_0x003f;
    L_0x0038:
        r10 = r5[r2];
        r1 = r1 + r10;
        r2 = r2 + 1;
        if (r4 == 0) goto L_0x0036;
    L_0x003f:
        r1 = r14.c(r1);
        r2 = 42;
        if (r3 != r2) goto L_0x00eb;
    L_0x0047:
        r2 = r6.length();
        r2 = r2 + -1;
        r6.setLength(r2);
        r3 = 0;
        r9 = r5.length;
        r2 = 0;
        r11 = r2;
        r2 = r3;
        r3 = r11;
    L_0x0056:
        if (r3 >= r9) goto L_0x005f;
    L_0x0058:
        r10 = r5[r3];
        r2 = r2 + r10;
        r3 = r3 + 1;
        if (r4 == 0) goto L_0x0056;
    L_0x005f:
        r3 = r2;
        r2 = r1 - r0;
        r2 = r2 - r3;
        if (r1 == r8) goto L_0x006e;
    L_0x0065:
        r1 = r2 * 2;
        if (r1 >= r3) goto L_0x006e;
    L_0x0069:
        r0 = com.google.aN.a();
        throw r0;
    L_0x006e:
        r1 = r12.b;
        if (r1 == 0) goto L_0x00a4;
    L_0x0072:
        r1 = r6.length();
        r5 = r1 + -1;
        r2 = 0;
        r1 = 0;
        r11 = r1;
        r1 = r2;
        r2 = r11;
    L_0x007d:
        if (r2 >= r5) goto L_0x0090;
    L_0x007f:
        r8 = z;
        r9 = r12.g;
        r9 = r9.charAt(r2);
        r8 = r8.indexOf(r9);
        r1 = r1 + r8;
        r2 = r2 + 1;
        if (r4 == 0) goto L_0x007d;
    L_0x0090:
        r2 = r6.charAt(r5);
        r4 = h;
        r1 = r1 % 43;
        r1 = r4[r1];
        if (r2 == r1) goto L_0x00a1;
    L_0x009c:
        r0 = com.google.aC.a();
        throw r0;
    L_0x00a1:
        r6.setLength(r5);
    L_0x00a4:
        r1 = r6.length();
        if (r1 != 0) goto L_0x00af;
    L_0x00aa:
        r0 = com.google.aN.a();
        throw r0;
    L_0x00af:
        r1 = r12.c;
        if (r1 == 0) goto L_0x00e6;
    L_0x00b3:
        r1 = a(r6);
    L_0x00b7:
        r2 = 1;
        r2 = r7[r2];
        r4 = 0;
        r4 = r7[r4];
        r2 = r2 + r4;
        r2 = (float) r2;
        r4 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r2 = r2 / r4;
        r0 = (float) r0;
        r3 = (float) r3;
        r4 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r3 = r3 / r4;
        r0 = r0 + r3;
        r3 = new com.google.f6;
        r4 = 0;
        r5 = 2;
        r5 = new com.google.fI[r5];
        r6 = 0;
        r7 = new com.google.fI;
        r8 = (float) r13;
        r7.<init>(r2, r8);
        r5[r6] = r7;
        r2 = 1;
        r6 = new com.google.fI;
        r7 = (float) r13;
        r6.<init>(r0, r7);
        r5[r2] = r6;
        r0 = com.google.gg.CODE_39;
        r3.<init>(r1, r4, r5, r0);
        return r3;
    L_0x00e6:
        r1 = r6.toString();
        goto L_0x00b7;
    L_0x00eb:
        r0 = r1;
        goto L_0x001d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.au.a(int, com.google.d_, java.util.Map):com.google.f6");
    }

    private static int a(int[] iArr) {
        int i = aU.a;
        int length = iArr.length;
        int i2 = 0;
        int i3;
        do {
            int i4 = Integer.MAX_VALUE;
            int length2 = iArr.length;
            int i5 = 0;
            while (i5 < length2) {
                i3 = iArr[i5];
                if (i3 < i4 && i3 > r0) {
                    i4 = i3;
                }
                i3 = i5 + 1;
                if (i != 0) {
                    break;
                }
                i5 = i3;
            }
            i2 = i4;
            length2 = 0;
            i4 = 0;
            i3 = 0;
            i5 = 0;
            while (length2 < length) {
                int i6 = iArr[length2];
                if (i6 > i2) {
                    i4 |= 1 << ((length - 1) - length2);
                    i5++;
                    i3 += i6;
                }
                length2++;
                if (i != 0) {
                    break;
                }
            }
            int i7 = i3;
            i3 = i5;
            i5 = i7;
            if (i3 == 3) {
                int i8 = i3;
                i3 = 0;
                while (i3 < length && i8 > 0) {
                    length2 = iArr[i3];
                    if (length2 > i2) {
                        i8--;
                        if (length2 * 2 >= i5) {
                            return -1;
                        }
                    }
                    i3++;
                    if (i != 0) {
                        break;
                    }
                }
                return i4;
            }
        } while (i3 > 3);
        return -1;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a(java.lang.CharSequence r10) {
        /*
        r1 = 0;
        r9 = 90;
        r8 = 65;
        r3 = com.google.aU.a;
        r4 = r10.length();
        r5 = new java.lang.StringBuilder;
        r5.<init>(r4);
        r2 = r1;
    L_0x0011:
        if (r2 >= r4) goto L_0x003f;
    L_0x0013:
        r6 = r10.charAt(r2);
        r0 = 43;
        if (r6 == r0) goto L_0x0027;
    L_0x001b:
        r0 = 36;
        if (r6 == r0) goto L_0x0027;
    L_0x001f:
        r0 = 37;
        if (r6 == r0) goto L_0x0027;
    L_0x0023:
        r0 = 47;
        if (r6 != r0) goto L_0x0093;
    L_0x0027:
        r0 = r2 + 1;
        r7 = r10.charAt(r0);
        switch(r6) {
            case 36: goto L_0x0052;
            case 37: goto L_0x0060;
            case 43: goto L_0x0044;
            case 47: goto L_0x007d;
            default: goto L_0x0030;
        };
    L_0x0030:
        r0 = r1;
    L_0x0031:
        r5.append(r0);
        r0 = r2 + 1;
        if (r3 == 0) goto L_0x003b;
    L_0x0038:
        r5.append(r6);
    L_0x003b:
        r2 = r0 + 1;
        if (r3 == 0) goto L_0x0011;
    L_0x003f:
        r0 = r5.toString();
        return r0;
    L_0x0044:
        if (r7 < r8) goto L_0x004d;
    L_0x0046:
        if (r7 > r9) goto L_0x004d;
    L_0x0048:
        r0 = r7 + 32;
        r0 = (char) r0;
        if (r3 == 0) goto L_0x0031;
    L_0x004d:
        r0 = com.google.aG.a();
        throw r0;
    L_0x0052:
        if (r7 < r8) goto L_0x005b;
    L_0x0054:
        if (r7 > r9) goto L_0x005b;
    L_0x0056:
        r0 = r7 + -64;
        r0 = (char) r0;
        if (r3 == 0) goto L_0x0031;
    L_0x005b:
        r0 = com.google.aG.a();
        throw r0;
    L_0x0060:
        if (r7 < r8) goto L_0x006b;
    L_0x0062:
        r0 = 69;
        if (r7 > r0) goto L_0x006b;
    L_0x0066:
        r0 = r7 + -38;
        r0 = (char) r0;
        if (r3 == 0) goto L_0x0031;
    L_0x006b:
        r0 = 70;
        if (r7 < r0) goto L_0x0078;
    L_0x006f:
        r0 = 87;
        if (r7 > r0) goto L_0x0078;
    L_0x0073:
        r0 = r7 + -11;
        r0 = (char) r0;
        if (r3 == 0) goto L_0x0031;
    L_0x0078:
        r0 = com.google.aG.a();
        throw r0;
    L_0x007d:
        if (r7 < r8) goto L_0x0088;
    L_0x007f:
        r0 = 79;
        if (r7 > r0) goto L_0x0088;
    L_0x0083:
        r0 = r7 + -32;
        r0 = (char) r0;
        if (r3 == 0) goto L_0x0031;
    L_0x0088:
        if (r7 != r9) goto L_0x008e;
    L_0x008a:
        r0 = 58;
        if (r3 == 0) goto L_0x0031;
    L_0x008e:
        r0 = com.google.aG.a();
        throw r0;
    L_0x0093:
        r0 = r2;
        goto L_0x0038;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.au.a(java.lang.CharSequence):java.lang.String");
    }

    public au(boolean z, boolean z2) {
        this.b = z;
        this.c = z2;
        this.g = new StringBuilder(20);
        this.f = new int[9];
    }

    private static char a(int i) {
        int i2 = aU.a;
        int i3 = 0;
        while (i3 < e.length) {
            if (e[i3] != i) {
                i3++;
                if (i2 != 0) {
                    break;
                }
            }
            return h[i3];
        }
        throw aN.a();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int[] a(com.google.d_ r12, int[] r13) {
        /*
        r11 = 2;
        r3 = 1;
        r4 = 0;
        r6 = com.google.aU.a;
        r7 = r12.d();
        r0 = r12.c(r4);
        r8 = r13.length;
        r5 = r0;
        r2 = r4;
        r1 = r4;
    L_0x0011:
        if (r5 >= r7) goto L_0x0067;
    L_0x0013:
        r9 = r12.f(r5);
        r9 = r9 ^ r2;
        if (r9 == 0) goto L_0x0022;
    L_0x001a:
        r9 = r13[r1];
        r9 = r9 + 1;
        r13[r1] = r9;
        if (r6 == 0) goto L_0x0063;
    L_0x0022:
        r9 = r8 + -1;
        if (r1 != r9) goto L_0x005c;
    L_0x0026:
        r9 = a(r13);
        r10 = d;
        if (r9 != r10) goto L_0x0045;
    L_0x002e:
        r9 = r5 - r0;
        r9 = r9 / 2;
        r9 = r0 - r9;
        r9 = java.lang.Math.max(r4, r9);
        r9 = r12.a(r9, r0, r4);
        if (r9 == 0) goto L_0x0045;
    L_0x003e:
        r1 = new int[r11];
        r1[r4] = r0;
        r1[r3] = r5;
        return r1;
    L_0x0045:
        r9 = r13[r4];
        r10 = r13[r3];
        r9 = r9 + r10;
        r0 = r0 + r9;
        r9 = r8 + -2;
        java.lang.System.arraycopy(r13, r11, r13, r4, r9);
        r9 = r8 + -2;
        r13[r9] = r4;
        r9 = r8 + -1;
        r13[r9] = r4;
        r1 = r1 + -1;
        if (r6 == 0) goto L_0x005e;
    L_0x005c:
        r1 = r1 + 1;
    L_0x005e:
        r13[r1] = r3;
        if (r2 != 0) goto L_0x006c;
    L_0x0062:
        r2 = r3;
    L_0x0063:
        r5 = r5 + 1;
        if (r6 == 0) goto L_0x0011;
    L_0x0067:
        r0 = com.google.aN.a();
        throw r0;
    L_0x006c:
        r2 = r4;
        goto L_0x0063;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.au.a(com.google.d_, int[]):int[]");
    }

    public au(boolean z) {
        this(z, false);
    }
}
