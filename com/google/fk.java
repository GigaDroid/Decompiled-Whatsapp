package com.google;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

final class fk {
    private static final NumberFormat a;
    private static final String[] b;
    private static final NumberFormat c;
    private static final String[] z;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.google.am a(byte[] r8, int r9) {
        /*
        r5 = 1;
        r6 = 0;
        r1 = com.google.eM.a;
        r2 = new java.lang.StringBuilder;
        r0 = 144; // 0x90 float:2.02E-43 double:7.1E-322;
        r2.<init>(r0);
        switch(r9) {
            case 2: goto L_0x001d;
            case 3: goto L_0x001d;
            case 4: goto L_0x00cb;
            case 5: goto L_0x00d7;
            default: goto L_0x000e;
        };
    L_0x000e:
        r0 = new com.google.am;
        r1 = r2.toString();
        r2 = 0;
        r3 = java.lang.String.valueOf(r9);
        r0.<init>(r8, r1, r2, r3);
        return r0;
    L_0x001d:
        r0 = 2;
        if (r9 != r0) goto L_0x003c;
    L_0x0020:
        r0 = d(r8);
        r3 = new java.text.DecimalFormat;
        r4 = z;
        r4 = r4[r5];
        r5 = e(r8);
        r4 = r4.substring(r6, r5);
        r3.<init>(r4);
        r4 = (long) r0;
        r0 = r3.format(r4);
        if (r1 == 0) goto L_0x0040;
    L_0x003c:
        r0 = a(r8);
    L_0x0040:
        r3 = a;
        r4 = b(r8);
        r4 = (long) r4;
        r3 = r3.format(r4);
        r4 = a;
        r5 = c(r8);
        r6 = (long) r5;
        r4 = r4.format(r6);
        r5 = 10;
        r6 = 84;
        r5 = a(r8, r5, r6);	 Catch:{ IllegalArgumentException -> 0x00e5 }
        r2.append(r5);	 Catch:{ IllegalArgumentException -> 0x00e5 }
        r5 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x00e5 }
        r6 = z;	 Catch:{ IllegalArgumentException -> 0x00e5 }
        r7 = 0;
        r6 = r6[r7];	 Catch:{ IllegalArgumentException -> 0x00e5 }
        r5 = r5.startsWith(r6);	 Catch:{ IllegalArgumentException -> 0x00e5 }
        if (r5 == 0) goto L_0x009e;
    L_0x0070:
        r5 = 9;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00e7 }
        r6.<init>();	 Catch:{ IllegalArgumentException -> 0x00e7 }
        r6 = r6.append(r0);	 Catch:{ IllegalArgumentException -> 0x00e7 }
        r7 = 29;
        r6 = r6.append(r7);	 Catch:{ IllegalArgumentException -> 0x00e7 }
        r6 = r6.append(r3);	 Catch:{ IllegalArgumentException -> 0x00e7 }
        r7 = 29;
        r6 = r6.append(r7);	 Catch:{ IllegalArgumentException -> 0x00e7 }
        r6 = r6.append(r4);	 Catch:{ IllegalArgumentException -> 0x00e7 }
        r7 = 29;
        r6 = r6.append(r7);	 Catch:{ IllegalArgumentException -> 0x00e7 }
        r6 = r6.toString();	 Catch:{ IllegalArgumentException -> 0x00e7 }
        r2.insert(r5, r6);	 Catch:{ IllegalArgumentException -> 0x00e7 }
        if (r1 == 0) goto L_0x000e;
    L_0x009e:
        r5 = 0;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00e9 }
        r6.<init>();	 Catch:{ IllegalArgumentException -> 0x00e9 }
        r0 = r6.append(r0);	 Catch:{ IllegalArgumentException -> 0x00e9 }
        r6 = 29;
        r0 = r0.append(r6);	 Catch:{ IllegalArgumentException -> 0x00e9 }
        r0 = r0.append(r3);	 Catch:{ IllegalArgumentException -> 0x00e9 }
        r3 = 29;
        r0 = r0.append(r3);	 Catch:{ IllegalArgumentException -> 0x00e9 }
        r0 = r0.append(r4);	 Catch:{ IllegalArgumentException -> 0x00e9 }
        r3 = 29;
        r0 = r0.append(r3);	 Catch:{ IllegalArgumentException -> 0x00e9 }
        r0 = r0.toString();	 Catch:{ IllegalArgumentException -> 0x00e9 }
        r2.insert(r5, r0);	 Catch:{ IllegalArgumentException -> 0x00e9 }
        if (r1 == 0) goto L_0x000e;
    L_0x00cb:
        r0 = 1;
        r3 = 93;
        r0 = a(r8, r0, r3);	 Catch:{ IllegalArgumentException -> 0x00e3 }
        r2.append(r0);	 Catch:{ IllegalArgumentException -> 0x00e3 }
        if (r1 == 0) goto L_0x000e;
    L_0x00d7:
        r0 = 1;
        r1 = 77;
        r0 = a(r8, r0, r1);	 Catch:{ IllegalArgumentException -> 0x00e3 }
        r2.append(r0);	 Catch:{ IllegalArgumentException -> 0x00e3 }
        goto L_0x000e;
    L_0x00e3:
        r0 = move-exception;
        throw r0;
    L_0x00e5:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00e7 }
    L_0x00e7:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00e9 }
    L_0x00e9:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00e3 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.fk.a(byte[], int):com.google.am");
    }

    static {
        String[] strArr = new String[4];
        String str = "+\u0016}M=A\"";
        int i = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i2 = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i3 = 0; length > i3; i3++) {
                int i4;
                char c = cArr[i3];
                switch (i3 % 5) {
                    case v.m /*0*/:
                        i4 = 112;
                        break;
                    case at.g /*1*/:
                        i4 = 63;
                        break;
                    case at.i /*2*/:
                        i4 = 67;
                        break;
                    case at.o /*3*/:
                        i4 = 83;
                        break;
                    default:
                        i4 = 13;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "@\u000fsc=@\u000fsc";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "@\u000fs";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    c = new DecimalFormat(z[2]);
                    a = new DecimalFormat(z[3]);
                    String[] strArr4 = new String[6];
                    i2 = 0;
                    strArr2 = strArr4;
                    strArr3 = strArr4;
                    str = "z~\u0001\u0010I5y\u0004\u001bD:t\u000f\u001eC?o\u0012\u0001^$j\u0015\u0004U)e\uffb9O\u0010n\uffc4c\uffaf/S\u001bfu*X\u0016ix!]\u0011lc<B\fwf;G\u0007zi\ufffc\uff82\uffcc\uffb7\uffab";
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    str = "\u0010^!0i\u0015Y$;d\u001aT/>c\u001fO2!~\u0004J5$u\tE\uffb9O\u0010n\uffc48\uffafp\u000e@xo0N\u0000\u0018\u000fP.`c\u007f#_\u0005\u0003rq\uff8c\uffca\uffb5\uffaf\ufffd\uff82\uffcc\uffb7\uffa4";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    str = "\u00b0\u00fe\u0081\u0090\u00c9\u00b5\u00f9\u0084\u009b\u00c4\u00ba\u00f4\u008f\u009e\u00c3\u00bf\u00ef\u0092\u0081\u00de\u00a4\u00ea\u0095\u0084\u00d5\u00a9\u00e5\uffb9O\u0010n\u00e4\u009f\u008e\u00d3\u00af\u0095\u00ef\u00e2\u00bf\u00c3\u008a\u00fa\u00e9\u00b1\u00cd\u0081\u00c3\u00d2\u008f\u00f3\u00bb\u00c6\u00d5\u008a\u00f8\u00b6\uffb4s\ufff4\uff83\uffcb\uffbb";
                    i = 5;
                    i2 = 2;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    str = "\u0090\u00de\u00a1\u00b0\u00e9\u0095\u00d9\u00a4\u00bb\u00e4\u009a\u00d4\u00af\u00be\u00e3\u009f\u00cf\u00b2\u00a1\u00fe\u0084\u00ca\u00b5\u00a4\u00f5\u0089\u00c5\uffb9O\u0010n\uffc4\u00b8\u00af\u00f0\u008e\u00c0\u00e2\u00fb\u00a6\u00df\u008f\u00f7\u00e4\u00b5\u00cb\u0080\u00c9\u00d8\u0081\u00fd\u00b1\u00cc\u00c3\u009c\u00e2\u00ac\u00d7\uffa4-\uff82\uffc6\uffb7\uffab";
                    i = 6;
                    i2 = 3;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    str = "p>AP\tu9D[\u0004z4O^\u0003\u007f/RA\u001ed*UD\u0015i%\uffb9\uffaf\ufff1k\uffc4_N\u0013o\u00a0\u00e3\u00f1\u00ae\u00d4\u009a\u00e5\u00f4\u00a4\u00dd\u0091\u00f5\u00c6\u009b\u00e7\u00a7\u00da\u00c9\u0096\u00ec\u00a2\u00dd\uffa4-\uff82\uffcc\uffba\uffab";
                    i = 7;
                    i2 = 4;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    str = "p>AP\tu9D[\u0004z4O^\u0003\u007f/RA\u001ed*UD\u0015i%XO\u0010n cr/S\u001bfu*X\u0016ix!]\u0011lc<B\fwf;G\u0007zi6L\u0002}l";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i2] = str;
                    b = strArr3;
                    return;
                default:
                    strArr2[i2] = str;
                    str = "@\u000fsc=@\u000fsc=";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    private static int a(int i, byte[] bArr) {
        int i2 = i - 1;
        try {
            if (((1 << (5 - (i2 % 6))) & bArr[i2 / 6]) == 0) {
                return 0;
            }
            return 1;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    private static int c(byte[] bArr) {
        return a(bArr, new byte[]{(byte) 55, (byte) 56, (byte) 57, (byte) 58, (byte) 59, (byte) 60, (byte) 49, (byte) 50, (byte) 51, (byte) 52});
    }

    private static int a(byte[] bArr, byte[] bArr2) {
        int i = 0;
        boolean z = eM.a;
        try {
            if (bArr2.length == 0) {
                throw new IllegalArgumentException();
            }
            int i2 = 0;
            while (i < bArr2.length) {
                i2 += a(bArr2[i], bArr) << ((bArr2.length - i) - 1);
                i++;
                if (z) {
                    break;
                }
            }
            return i2;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    private static int e(byte[] bArr) {
        return a(bArr, new byte[]{(byte) 39, (byte) 40, (byte) 41, (byte) 42, (byte) 31, (byte) 32});
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a(byte[] r13, int r14, int r15) {
        /*
        r5 = com.google.eM.a;
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r2 = -1;
        r1 = 0;
        r0 = 0;
        r3 = r14;
    L_0x000b:
        r4 = r14 + r15;
        if (r3 >= r4) goto L_0x002b;
    L_0x000f:
        r4 = b;
        r4 = r4[r1];
        r7 = r13[r3];
        r4 = r4.charAt(r7);
        switch(r4) {
            case 65520: goto L_0x0058;
            case 65521: goto L_0x0058;
            case 65522: goto L_0x0058;
            case 65523: goto L_0x0058;
            case 65524: goto L_0x0058;
            case 65525: goto L_0x0061;
            case 65526: goto L_0x0066;
            case 65527: goto L_0x0050;
            case 65528: goto L_0x0054;
            case 65529: goto L_0x0097;
            case 65530: goto L_0x001c;
            case 65531: goto L_0x006b;
            default: goto L_0x001c;
        };
    L_0x001c:
        r6.append(r4);	 Catch:{ IllegalArgumentException -> 0x00a4 }
        r12 = r0;
        r0 = r1;
        r1 = r12;
    L_0x0022:
        r4 = r2 + -1;
        if (r2 != 0) goto L_0x0027;
    L_0x0026:
        r0 = r1;
    L_0x0027:
        r3 = r3 + 1;
        if (r5 == 0) goto L_0x00a8;
    L_0x002b:
        r0 = r6.length();
        if (r0 <= 0) goto L_0x004b;
    L_0x0031:
        r0 = r6.length();	 Catch:{ IllegalArgumentException -> 0x00a6 }
        r0 = r0 + -1;
        r0 = r6.charAt(r0);	 Catch:{ IllegalArgumentException -> 0x00a6 }
        r1 = 65532; // 0xfffc float:9.183E-41 double:3.2377E-319;
        if (r0 != r1) goto L_0x004b;
    L_0x0040:
        r0 = r6.length();	 Catch:{ IllegalArgumentException -> 0x00a6 }
        r0 = r0 + -1;
        r6.setLength(r0);	 Catch:{ IllegalArgumentException -> 0x00a6 }
        if (r5 == 0) goto L_0x002b;
    L_0x004b:
        r0 = r6.toString();
        return r0;
    L_0x0050:
        r1 = 0;
        r2 = -1;
        if (r5 == 0) goto L_0x00b4;
    L_0x0054:
        r1 = 1;
        r2 = -1;
        if (r5 == 0) goto L_0x00b4;
    L_0x0058:
        r0 = r1;
        r1 = 65520; // 0xfff0 float:9.1813E-41 double:3.2371E-319;
        r1 = r4 - r1;
        r2 = 1;
        if (r5 == 0) goto L_0x00b4;
    L_0x0061:
        r0 = r1;
        r1 = 0;
        r2 = 2;
        if (r5 == 0) goto L_0x00b4;
    L_0x0066:
        r0 = r1;
        r1 = 0;
        r2 = 3;
        if (r5 == 0) goto L_0x00b4;
    L_0x006b:
        r3 = r3 + 1;
        r7 = r13[r3];
        r7 = r7 << 24;
        r3 = r3 + 1;
        r8 = r13[r3];
        r8 = r8 << 18;
        r7 = r7 + r8;
        r3 = r3 + 1;
        r8 = r13[r3];
        r8 = r8 << 12;
        r7 = r7 + r8;
        r3 = r3 + 1;
        r8 = r13[r3];
        r8 = r8 << 6;
        r7 = r7 + r8;
        r3 = r3 + 1;
        r8 = r13[r3];
        r7 = r7 + r8;
        r8 = c;
        r10 = (long) r7;
        r7 = r8.format(r10);
        r6.append(r7);
        if (r5 == 0) goto L_0x00b4;
    L_0x0097:
        r2 = r1;
        r1 = r0;
        r0 = r3;
        r3 = -1;
        if (r5 == 0) goto L_0x00ae;
    L_0x009d:
        r12 = r0;
        r0 = r1;
        r1 = r2;
        r2 = r3;
        r3 = r12;
        goto L_0x001c;
    L_0x00a4:
        r0 = move-exception;
        throw r0;
    L_0x00a6:
        r0 = move-exception;
        throw r0;
    L_0x00a8:
        r2 = r4;
        r12 = r0;
        r0 = r1;
        r1 = r12;
        goto L_0x000b;
    L_0x00ae:
        r12 = r0;
        r0 = r2;
        r2 = r3;
        r3 = r12;
        goto L_0x0022;
    L_0x00b4:
        r12 = r0;
        r0 = r1;
        r1 = r12;
        goto L_0x0022;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.fk.a(byte[], int, int):java.lang.String");
    }

    private static int d(byte[] bArr) {
        return a(bArr, new byte[]{(byte) 33, (byte) 34, (byte) 35, (byte) 36, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 1, (byte) 2});
    }

    private static String a(byte[] bArr) {
        return String.valueOf(new char[]{b[0].charAt(a(bArr, new byte[]{(byte) 39, (byte) 40, (byte) 41, (byte) 42, (byte) 31, (byte) 32})), b[0].charAt(a(bArr, new byte[]{(byte) 33, (byte) 34, (byte) 35, (byte) 36, (byte) 25, (byte) 26})), b[0].charAt(a(bArr, new byte[]{(byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 19, (byte) 20})), b[0].charAt(a(bArr, new byte[]{(byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 13, (byte) 14})), b[0].charAt(a(bArr, new byte[]{(byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 7, (byte) 8})), b[0].charAt(a(bArr, new byte[]{(byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 1, (byte) 2}))});
    }

    private static int b(byte[] bArr) {
        return a(bArr, new byte[]{(byte) 53, (byte) 54, (byte) 43, (byte) 44, (byte) 45, (byte) 46, (byte) 47, (byte) 48, (byte) 37, (byte) 38});
    }
}
