package com.google;

import com.whatsapp.arj;
import org.v;
import org.whispersystems.at;

public final class a9 extends aU {
    private static final int[] b;
    private static final int d;
    private static final char[] e;
    private static final String z;
    private final StringBuilder c;
    private final int[] f;

    private static char a(int i) {
        int i2 = aU.a;
        int i3 = 0;
        while (i3 < b.length) {
            if (b[i3] != i) {
                i3++;
                if (i2 != 0) {
                    break;
                }
            }
            return e[i3];
        }
        throw aN.a();
    }

    private static void b(CharSequence charSequence) {
        int length = charSequence.length();
        a(charSequence, length - 2, 20);
        a(charSequence, length - 1, 15);
    }

    public a9() {
        this.c = new StringBuilder(20);
        this.f = new int[6];
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int[] a(com.google.d_ r14) {
        /*
        r13 = this;
        r12 = 2;
        r3 = 1;
        r4 = 0;
        r6 = com.google.aU.a;
        r7 = r14.d();
        r0 = r14.c(r4);
        r1 = r13.f;
        java.util.Arrays.fill(r1, r4);
        r8 = r13.f;
        r9 = r8.length;
        r5 = r0;
        r2 = r4;
        r1 = r0;
        r0 = r4;
    L_0x0019:
        if (r5 >= r7) goto L_0x005f;
    L_0x001b:
        r10 = r14.f(r5);
        r10 = r10 ^ r2;
        if (r10 == 0) goto L_0x002a;
    L_0x0022:
        r10 = r8[r0];
        r10 = r10 + 1;
        r8[r0] = r10;
        if (r6 == 0) goto L_0x005b;
    L_0x002a:
        r10 = r9 + -1;
        if (r0 != r10) goto L_0x0054;
    L_0x002e:
        r10 = a(r8);
        r11 = d;
        if (r10 != r11) goto L_0x003d;
    L_0x0036:
        r0 = new int[r12];
        r0[r4] = r1;
        r0[r3] = r5;
        return r0;
    L_0x003d:
        r10 = r8[r4];
        r11 = r8[r3];
        r10 = r10 + r11;
        r1 = r1 + r10;
        r10 = r9 + -2;
        java.lang.System.arraycopy(r8, r12, r8, r4, r10);
        r10 = r9 + -2;
        r8[r10] = r4;
        r10 = r9 + -1;
        r8[r10] = r4;
        r0 = r0 + -1;
        if (r6 == 0) goto L_0x0056;
    L_0x0054:
        r0 = r0 + 1;
    L_0x0056:
        r8[r0] = r3;
        if (r2 != 0) goto L_0x0064;
    L_0x005a:
        r2 = r3;
    L_0x005b:
        r5 = r5 + 1;
        if (r6 == 0) goto L_0x0019;
    L_0x005f:
        r0 = com.google.aN.a();
        throw r0;
    L_0x0064:
        r2 = r4;
        goto L_0x005b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.a9.a(com.google.d_):int[]");
    }

    static {
        String str = "xdXAB}c]JO\t\u0017)63\u000e\u0012\";<\u0003\u0019'<9\u0018\u00048!\"\u001d\u0003=*/\u0012xDRRg~O\u0013\u0014+1@";
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
                        i2 = 72;
                        break;
                    case at.g /*1*/:
                        i2 = 85;
                        break;
                    case at.i /*2*/:
                        i2 = arj.Theme_ratingBarStyle;
                        break;
                    case at.o /*3*/:
                        i2 = 114;
                        break;
                    default:
                        i2 = 118;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    e = str.toCharArray();
                    b = new int[]{276, 328, 324, 322, 296, 292, 290, 336, 274, 266, 424, 420, 418, 404, 402, 394, 360, 356, 354, 308, 282, 344, 332, 326, 300, 278, 436, 434, 428, 422, 406, 410, 364, 358, 310, 314, 302, 468, 466, 458, 366, 374, 430, 294, 474, 470, 306, 350};
                    d = b[47];
                    return;
                default:
                    z = str;
                    str = "xdXAB}c]JO\t\u0017)63\u000e\u0012\";<\u0003\u0019'<9\u0018\u00048!\"\u001d\u0003=*/\u0012xDRRg~O\u0013\u0014+1@";
                    obj = null;
            }
        }
    }

    private static void a(CharSequence charSequence, int i, int i2) {
        int i3 = aU.a;
        int i4 = i - 1;
        int i5 = 0;
        int i6 = 1;
        while (i4 >= 0) {
            i5 += z.indexOf(charSequence.charAt(i4)) * i6;
            i6++;
            if (i6 > i2) {
                i6 = 1;
            }
            i4--;
            if (i3 != 0) {
                break;
            }
        }
        if (charSequence.charAt(i) != e[i5 % 47]) {
            throw aC.a();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int a(int[] r8) {
        /*
        r3 = 0;
        r5 = com.google.aU.a;
        r6 = r8.length;
        r2 = r8.length;
        r1 = r3;
        r0 = r3;
    L_0x0007:
        if (r1 >= r2) goto L_0x0010;
    L_0x0009:
        r4 = r8[r1];
        r0 = r0 + r4;
        r1 = r1 + 1;
        if (r5 == 0) goto L_0x0007;
    L_0x0010:
        r4 = r3;
        r1 = r3;
    L_0x0012:
        if (r4 >= r6) goto L_0x0027;
    L_0x0014:
        r2 = r8[r4];
        r2 = (float) r2;
        r7 = 1091567616; // 0x41100000 float:9.0 double:5.39306059E-315;
        r2 = r2 * r7;
        r7 = (float) r0;
        r2 = r2 / r7;
        r7 = java.lang.Math.round(r2);
        r2 = 1;
        if (r7 < r2) goto L_0x0026;
    L_0x0023:
        r2 = 4;
        if (r7 <= r2) goto L_0x0028;
    L_0x0026:
        r1 = -1;
    L_0x0027:
        return r1;
    L_0x0028:
        r2 = r4 & 1;
        if (r2 != 0) goto L_0x0039;
    L_0x002c:
        r2 = r3;
    L_0x002d:
        if (r2 >= r7) goto L_0x0037;
    L_0x002f:
        r1 = r1 << 1;
        r1 = r1 | 1;
        r2 = r2 + 1;
        if (r5 == 0) goto L_0x002d;
    L_0x0037:
        if (r5 == 0) goto L_0x003a;
    L_0x0039:
        r1 = r1 << r7;
    L_0x003a:
        r2 = r4 + 1;
        if (r5 != 0) goto L_0x0027;
    L_0x003e:
        r4 = r2;
        goto L_0x0012;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.a9.a(int[]):int");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.f6 a(int r13, com.google.d_ r14, java.util.Map r15) {
        /*
        r12 = this;
        r4 = com.google.aU.a;
        r5 = r12.a(r14);
        r0 = 1;
        r0 = r5[r0];
        r0 = r14.c(r0);
        r6 = r14.d();
        r7 = r12.f;
        r1 = 0;
        java.util.Arrays.fill(r7, r1);
        r8 = r12.c;
        r1 = 0;
        r8.setLength(r1);
    L_0x001d:
        com.google.aU.a(r14, r0, r7);
        r1 = a(r7);
        if (r1 >= 0) goto L_0x002b;
    L_0x0026:
        r0 = com.google.aN.a();
        throw r0;
    L_0x002b:
        r3 = a(r1);
        r8.append(r3);
        r9 = r7.length;
        r1 = 0;
        r2 = r1;
        r1 = r0;
    L_0x0036:
        if (r2 >= r9) goto L_0x003f;
    L_0x0038:
        r10 = r7[r2];
        r1 = r1 + r10;
        r2 = r2 + 1;
        if (r4 == 0) goto L_0x0036;
    L_0x003f:
        r1 = r14.c(r1);
        r2 = 42;
        if (r3 != r2) goto L_0x00b7;
    L_0x0047:
        r2 = r8.length();
        r2 = r2 + -1;
        r8.deleteCharAt(r2);
        r3 = 0;
        r9 = r7.length;
        r2 = 0;
        r11 = r2;
        r2 = r3;
        r3 = r11;
    L_0x0056:
        if (r3 >= r9) goto L_0x005f;
    L_0x0058:
        r10 = r7[r3];
        r2 = r2 + r10;
        r3 = r3 + 1;
        if (r4 == 0) goto L_0x0056;
    L_0x005f:
        if (r1 == r6) goto L_0x0067;
    L_0x0061:
        r1 = r14.f(r1);
        if (r1 != 0) goto L_0x006c;
    L_0x0067:
        r0 = com.google.aN.a();
        throw r0;
    L_0x006c:
        r1 = r8.length();
        r3 = 2;
        if (r1 >= r3) goto L_0x0078;
    L_0x0073:
        r0 = com.google.aN.a();
        throw r0;
    L_0x0078:
        b(r8);
        r1 = r8.length();
        r1 = r1 + -2;
        r8.setLength(r1);
        r1 = a(r8);
        r3 = 1;
        r3 = r5[r3];
        r4 = 0;
        r4 = r5[r4];
        r3 = r3 + r4;
        r3 = (float) r3;
        r4 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r3 = r3 / r4;
        r0 = (float) r0;
        r2 = (float) r2;
        r4 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r2 = r2 / r4;
        r0 = r0 + r2;
        r2 = new com.google.f6;
        r4 = 0;
        r5 = 2;
        r5 = new com.google.fI[r5];
        r6 = 0;
        r7 = new com.google.fI;
        r8 = (float) r13;
        r7.<init>(r3, r8);
        r5[r6] = r7;
        r3 = 1;
        r6 = new com.google.fI;
        r7 = (float) r13;
        r6.<init>(r0, r7);
        r5[r3] = r6;
        r0 = com.google.gg.CODE_93;
        r2.<init>(r1, r4, r5, r0);
        return r2;
    L_0x00b7:
        r0 = r1;
        goto L_0x001d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.a9.a(int, com.google.d_, java.util.Map):com.google.f6");
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
        if (r2 >= r4) goto L_0x0040;
    L_0x0013:
        r6 = r10.charAt(r2);
        r0 = 97;
        if (r6 < r0) goto L_0x0094;
    L_0x001b:
        r0 = 100;
        if (r6 > r0) goto L_0x0094;
    L_0x001f:
        r0 = r4 + -1;
        if (r2 < r0) goto L_0x0028;
    L_0x0023:
        r0 = com.google.aG.a();
        throw r0;
    L_0x0028:
        r0 = r2 + 1;
        r7 = r10.charAt(r0);
        switch(r6) {
            case 97: goto L_0x0053;
            case 98: goto L_0x0061;
            case 99: goto L_0x007e;
            case 100: goto L_0x0045;
            default: goto L_0x0031;
        };
    L_0x0031:
        r0 = r1;
    L_0x0032:
        r5.append(r0);
        r0 = r2 + 1;
        if (r3 == 0) goto L_0x003c;
    L_0x0039:
        r5.append(r6);
    L_0x003c:
        r2 = r0 + 1;
        if (r3 == 0) goto L_0x0011;
    L_0x0040:
        r0 = r5.toString();
        return r0;
    L_0x0045:
        if (r7 < r8) goto L_0x004e;
    L_0x0047:
        if (r7 > r9) goto L_0x004e;
    L_0x0049:
        r0 = r7 + 32;
        r0 = (char) r0;
        if (r3 == 0) goto L_0x0032;
    L_0x004e:
        r0 = com.google.aG.a();
        throw r0;
    L_0x0053:
        if (r7 < r8) goto L_0x005c;
    L_0x0055:
        if (r7 > r9) goto L_0x005c;
    L_0x0057:
        r0 = r7 + -64;
        r0 = (char) r0;
        if (r3 == 0) goto L_0x0032;
    L_0x005c:
        r0 = com.google.aG.a();
        throw r0;
    L_0x0061:
        if (r7 < r8) goto L_0x006c;
    L_0x0063:
        r0 = 69;
        if (r7 > r0) goto L_0x006c;
    L_0x0067:
        r0 = r7 + -38;
        r0 = (char) r0;
        if (r3 == 0) goto L_0x0032;
    L_0x006c:
        r0 = 70;
        if (r7 < r0) goto L_0x0079;
    L_0x0070:
        r0 = 87;
        if (r7 > r0) goto L_0x0079;
    L_0x0074:
        r0 = r7 + -11;
        r0 = (char) r0;
        if (r3 == 0) goto L_0x0032;
    L_0x0079:
        r0 = com.google.aG.a();
        throw r0;
    L_0x007e:
        if (r7 < r8) goto L_0x0089;
    L_0x0080:
        r0 = 79;
        if (r7 > r0) goto L_0x0089;
    L_0x0084:
        r0 = r7 + -32;
        r0 = (char) r0;
        if (r3 == 0) goto L_0x0032;
    L_0x0089:
        if (r7 != r9) goto L_0x008f;
    L_0x008b:
        r0 = 58;
        if (r3 == 0) goto L_0x0032;
    L_0x008f:
        r0 = com.google.aG.a();
        throw r0;
    L_0x0094:
        r0 = r2;
        goto L_0x0039;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.a9.a(java.lang.CharSequence):java.lang.String");
    }
}
