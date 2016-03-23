package com.google;

import java.math.BigInteger;
import java.util.Arrays;

final class fM {
    private static final char[] a;
    private static final char[] b;
    private static final BigInteger[] c;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int b(int[] r10, int r11, java.lang.StringBuilder r12) {
        /*
        r9 = 900; // 0x384 float:1.261E-42 double:4.447E-321;
        r3 = 1;
        r1 = 0;
        r5 = com.google.g0.a;
        r0 = 15;
        r6 = new int[r0];
        r0 = r1;
        r2 = r1;
    L_0x000c:
        r4 = r10[r1];
        if (r11 >= r4) goto L_0x0050;
    L_0x0010:
        if (r0 != 0) goto L_0x0050;
    L_0x0012:
        r4 = r11 + 1;
        r7 = r10[r11];
        r8 = r10[r1];
        if (r4 != r8) goto L_0x001b;
    L_0x001a:
        r0 = r3;
    L_0x001b:
        if (r7 >= r9) goto L_0x0023;
    L_0x001d:
        r6[r2] = r7;
        r2 = r2 + 1;
        if (r5 == 0) goto L_0x0051;
    L_0x0023:
        if (r7 == r9) goto L_0x0039;
    L_0x0025:
        r8 = 901; // 0x385 float:1.263E-42 double:4.45E-321;
        if (r7 == r8) goto L_0x0039;
    L_0x0029:
        r8 = 924; // 0x39c float:1.295E-42 double:4.565E-321;
        if (r7 == r8) goto L_0x0039;
    L_0x002d:
        r8 = 928; // 0x3a0 float:1.3E-42 double:4.585E-321;
        if (r7 == r8) goto L_0x0039;
    L_0x0031:
        r8 = 923; // 0x39b float:1.293E-42 double:4.56E-321;
        if (r7 == r8) goto L_0x0039;
    L_0x0035:
        r8 = 922; // 0x39a float:1.292E-42 double:4.555E-321;
        if (r7 != r8) goto L_0x0051;
    L_0x0039:
        r11 = r4 + -1;
        r0 = r3;
    L_0x003c:
        r4 = r2 % 15;
        if (r4 == 0) goto L_0x0046;
    L_0x0040:
        r4 = 902; // 0x386 float:1.264E-42 double:4.456E-321;
        if (r7 == r4) goto L_0x0046;
    L_0x0044:
        if (r0 == 0) goto L_0x004e;
    L_0x0046:
        r2 = a(r6, r2);
        r12.append(r2);
        r2 = r1;
    L_0x004e:
        if (r5 == 0) goto L_0x000c;
    L_0x0050:
        return r11;
    L_0x0051:
        r11 = r4;
        goto L_0x003c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.fM.b(int[], int, java.lang.StringBuilder):int");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.google.am a(int[] r7, java.lang.String r8) {
        /*
        r6 = 0;
        r2 = com.google.g0.a;
        r3 = new java.lang.StringBuilder;
        r0 = r7.length;
        r0 = r0 * 2;
        r3.<init>(r0);
        r0 = 1;
        r1 = 2;
        r0 = r7[r0];
        r4 = new com.google.cH;
        r4.<init>();
    L_0x0014:
        r5 = 0;
        r5 = r7[r5];
        if (r1 >= r5) goto L_0x004e;
    L_0x0019:
        switch(r0) {
            case 900: goto L_0x0031;
            case 901: goto L_0x0037;
            case 902: goto L_0x003d;
            case 913: goto L_0x0037;
            case 922: goto L_0x0049;
            case 923: goto L_0x0049;
            case 924: goto L_0x0037;
            case 928: goto L_0x0043;
            default: goto L_0x001c;
        };
    L_0x001c:
        r0 = r1 + -1;
        r1 = a(r7, r0, r3);
        r0 = r1;
    L_0x0023:
        r1 = r7.length;
        if (r0 >= r1) goto L_0x002c;
    L_0x0026:
        r1 = r0 + 1;
        r0 = r7[r0];
        if (r2 == 0) goto L_0x0014;
    L_0x002c:
        r0 = com.google.aG.a();
        throw r0;
    L_0x0031:
        r1 = a(r7, r1, r3);
        if (r2 == 0) goto L_0x0066;
    L_0x0037:
        r1 = a(r0, r7, r1, r3);
        if (r2 == 0) goto L_0x0066;
    L_0x003d:
        r1 = b(r7, r1, r3);
        if (r2 == 0) goto L_0x0066;
    L_0x0043:
        r1 = a(r7, r1, r4);
        if (r2 == 0) goto L_0x0066;
    L_0x0049:
        r0 = com.google.aG.a();
        throw r0;
    L_0x004e:
        r0 = r3.length();
        if (r0 != 0) goto L_0x0059;
    L_0x0054:
        r0 = com.google.aG.a();
        throw r0;
    L_0x0059:
        r0 = new com.google.am;
        r1 = r3.toString();
        r0.<init>(r6, r1, r6, r8);
        r0.a(r4);
        return r0;
    L_0x0066:
        r0 = r1;
        goto L_0x0023;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.fM.a(int[], java.lang.String):com.google.am");
    }

    private static String a(int[] iArr, int i) {
        int i2 = g0.a;
        BigInteger bigInteger = BigInteger.ZERO;
        int i3 = 0;
        while (i3 < i) {
            bigInteger = bigInteger.add(c[(i - i3) - 1].multiply(BigInteger.valueOf((long) iArr[i3])));
            i3++;
            if (i2 != 0) {
                break;
            }
        }
        String bigInteger2 = bigInteger.toString();
        if (bigInteger2.charAt(0) == '1') {
            return bigInteger2.substring(1);
        }
        throw aG.a();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int a(int r12, int[] r13, int r14, java.lang.StringBuilder r15) {
        /*
        r7 = com.google.g0.a;
        r0 = 901; // 0x385 float:1.263E-42 double:4.45E-321;
        if (r12 != r0) goto L_0x00f8;
    L_0x0006:
        r4 = 0;
        r2 = 0;
        r0 = 6;
        r8 = new char[r0];
        r0 = 6;
        r9 = new int[r0];
        r1 = 0;
        r5 = r14 + 1;
        r0 = r13[r14];
        r6 = r5;
    L_0x0015:
        r5 = 0;
        r5 = r13[r5];
        if (r6 >= r5) goto L_0x006c;
    L_0x001a:
        if (r1 != 0) goto L_0x006c;
    L_0x001c:
        r5 = r4 + 1;
        r9[r4] = r0;
        r10 = 900; // 0x384 float:1.261E-42 double:4.447E-321;
        r2 = r2 * r10;
        r10 = (long) r0;
        r2 = r2 + r10;
        r4 = r6 + 1;
        r0 = r13[r6];
        r6 = 900; // 0x384 float:1.261E-42 double:4.447E-321;
        if (r0 == r6) goto L_0x0045;
    L_0x002d:
        r6 = 901; // 0x385 float:1.263E-42 double:4.45E-321;
        if (r0 == r6) goto L_0x0045;
    L_0x0031:
        r6 = 902; // 0x386 float:1.264E-42 double:4.456E-321;
        if (r0 == r6) goto L_0x0045;
    L_0x0035:
        r6 = 924; // 0x39c float:1.295E-42 double:4.565E-321;
        if (r0 == r6) goto L_0x0045;
    L_0x0039:
        r6 = 928; // 0x3a0 float:1.3E-42 double:4.585E-321;
        if (r0 == r6) goto L_0x0045;
    L_0x003d:
        r6 = 923; // 0x39b float:1.293E-42 double:4.56E-321;
        if (r0 == r6) goto L_0x0045;
    L_0x0041:
        r6 = 922; // 0x39a float:1.292E-42 double:4.555E-321;
        if (r0 != r6) goto L_0x004a;
    L_0x0045:
        r4 = r4 + -1;
        r1 = 1;
        if (r7 == 0) goto L_0x00f4;
    L_0x004a:
        r6 = r4;
        r4 = r5 % 5;
        if (r4 != 0) goto L_0x00f1;
    L_0x004f:
        if (r5 <= 0) goto L_0x00f1;
    L_0x0051:
        r4 = 0;
    L_0x0052:
        r5 = 6;
        if (r4 >= r5) goto L_0x0066;
    L_0x0055:
        r5 = 5 - r4;
        r10 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        r10 = r2 % r10;
        r10 = (int) r10;
        r10 = (char) r10;
        r8[r5] = r10;
        r5 = 8;
        r2 = r2 >> r5;
        r4 = r4 + 1;
        if (r7 == 0) goto L_0x0052;
    L_0x0066:
        r15.append(r8);
        r4 = 0;
        if (r7 == 0) goto L_0x0015;
    L_0x006c:
        r1 = 0;
        r1 = r13[r1];
        if (r6 != r1) goto L_0x007a;
    L_0x0071:
        r1 = 900; // 0x384 float:1.261E-42 double:4.447E-321;
        if (r0 >= r1) goto L_0x007a;
    L_0x0075:
        r1 = r4 + 1;
        r9[r4] = r0;
        r4 = r1;
    L_0x007a:
        r0 = 0;
    L_0x007b:
        if (r0 >= r4) goto L_0x0087;
    L_0x007d:
        r1 = r9[r0];
        r1 = (char) r1;
        r15.append(r1);
        r0 = r0 + 1;
        if (r7 == 0) goto L_0x007b;
    L_0x0087:
        if (r7 == 0) goto L_0x00ef;
    L_0x0089:
        r4 = r6;
    L_0x008a:
        r0 = 924; // 0x39c float:1.295E-42 double:4.565E-321;
        if (r12 != r0) goto L_0x00ec;
    L_0x008e:
        r1 = 0;
        r2 = 0;
        r0 = 0;
    L_0x0092:
        r5 = 0;
        r5 = r13[r5];
        if (r4 >= r5) goto L_0x00ec;
    L_0x0097:
        if (r0 != 0) goto L_0x00ec;
    L_0x0099:
        r5 = r4 + 1;
        r4 = r13[r4];
        r6 = 900; // 0x384 float:1.261E-42 double:4.447E-321;
        if (r4 >= r6) goto L_0x00aa;
    L_0x00a1:
        r1 = r1 + 1;
        r8 = 900; // 0x384 float:1.261E-42 double:4.447E-321;
        r2 = r2 * r8;
        r8 = (long) r4;
        r2 = r2 + r8;
        if (r7 == 0) goto L_0x00ed;
    L_0x00aa:
        r6 = 900; // 0x384 float:1.261E-42 double:4.447E-321;
        if (r4 == r6) goto L_0x00c6;
    L_0x00ae:
        r6 = 901; // 0x385 float:1.263E-42 double:4.45E-321;
        if (r4 == r6) goto L_0x00c6;
    L_0x00b2:
        r6 = 902; // 0x386 float:1.264E-42 double:4.456E-321;
        if (r4 == r6) goto L_0x00c6;
    L_0x00b6:
        r6 = 924; // 0x39c float:1.295E-42 double:4.565E-321;
        if (r4 == r6) goto L_0x00c6;
    L_0x00ba:
        r6 = 928; // 0x3a0 float:1.3E-42 double:4.585E-321;
        if (r4 == r6) goto L_0x00c6;
    L_0x00be:
        r6 = 923; // 0x39b float:1.293E-42 double:4.56E-321;
        if (r4 == r6) goto L_0x00c6;
    L_0x00c2:
        r6 = 922; // 0x39a float:1.292E-42 double:4.555E-321;
        if (r4 != r6) goto L_0x00ed;
    L_0x00c6:
        r4 = r5 + -1;
        r0 = 1;
    L_0x00c9:
        r5 = r1 % 5;
        if (r5 != 0) goto L_0x00ea;
    L_0x00cd:
        if (r1 <= 0) goto L_0x00ea;
    L_0x00cf:
        r1 = 6;
        r5 = new char[r1];
        r1 = 0;
    L_0x00d3:
        r6 = 6;
        if (r1 >= r6) goto L_0x00e6;
    L_0x00d6:
        r6 = 5 - r1;
        r8 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r8 = r8 & r2;
        r8 = (int) r8;
        r8 = (char) r8;
        r5[r6] = r8;
        r6 = 8;
        r2 = r2 >> r6;
        r1 = r1 + 1;
        if (r7 == 0) goto L_0x00d3;
    L_0x00e6:
        r15.append(r5);
        r1 = 0;
    L_0x00ea:
        if (r7 == 0) goto L_0x0092;
    L_0x00ec:
        return r4;
    L_0x00ed:
        r4 = r5;
        goto L_0x00c9;
    L_0x00ef:
        r4 = r6;
        goto L_0x00ec;
    L_0x00f1:
        r4 = r5;
        goto L_0x0015;
    L_0x00f4:
        r6 = r4;
        r4 = r5;
        goto L_0x0015;
    L_0x00f8:
        r4 = r14;
        goto L_0x008a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.fM.a(int, int[], int, java.lang.StringBuilder):int");
    }

    static {
        b = new char[]{';', '<', '>', '@', '[', '\\', ']', '_', '`', '~', '!', '\r', '\t', ',', ':', '\n', '-', '.', '$', '/', '\"', '|', '*', '(', ')', '?', '{', '}', '\''};
        a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '&', '\r', '\t', ',', ':', '#', '-', '.', '$', '/', '+', '%', '*', '=', '^'};
        c = new BigInteger[16];
        c[0] = BigInteger.ONE;
        BigInteger valueOf = BigInteger.valueOf(900);
        c[1] = valueOf;
        for (int i = 2; i < c.length; i++) {
            c[i] = c[i - 1].multiply(valueOf);
        }
    }

    private static int a(int[] iArr, int i, cH cHVar) {
        int i2 = g0.a;
        if (i + 2 > iArr[0]) {
            throw aG.a();
        }
        int[] iArr2 = new int[2];
        int i3 = 0;
        int i4 = i;
        while (i3 < 2) {
            iArr2[i3] = iArr[i4];
            i3++;
            i4++;
            if (i2 != 0) {
                break;
            }
        }
        cHVar.a(Integer.parseInt(a(iArr2, 2)));
        StringBuilder stringBuilder = new StringBuilder();
        int a = a(iArr, i4, stringBuilder);
        cHVar.a(stringBuilder.toString());
        if (iArr[a] == 923) {
            i4 = a + 1;
            int[] iArr3 = new int[(iArr[0] - i4)];
            i3 = 0;
            a = i4;
            i4 = 0;
            while (a < iArr[0] && r0 == 0) {
                int i5 = a + 1;
                int i6 = iArr[a];
                if (i6 < 900) {
                    a = i3 + 1;
                    iArr3[i3] = i6;
                    if (i2 != 0) {
                        i3 = a;
                    } else {
                        i3 = a;
                        a = i5;
                        continue;
                        if (i2 != 0) {
                        }
                    }
                }
                switch (i6) {
                    case 922:
                        cHVar.a(true);
                        a = i5 + 1;
                        if (i2 != 0) {
                            break;
                        }
                        i4 = true;
                        continue;
                    default:
                        break;
                }
                throw aG.a();
            }
            cHVar.a(Arrays.copyOf(iArr3, i3));
            if (i2 == 0) {
                return a;
            }
        }
        if (iArr[a] != 922) {
            return a;
        }
        cHVar.a(true);
        return a + 1;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int a(int[] r11, int r12, java.lang.StringBuilder r13) {
        /*
        r10 = 900; // 0x384 float:1.261E-42 double:4.447E-321;
        r1 = 0;
        r5 = com.google.g0.a;
        r0 = r11[r1];
        r0 = r0 - r12;
        r0 = r0 * 2;
        r6 = new int[r0];
        r0 = r11[r1];
        r0 = r0 - r12;
        r0 = r0 * 2;
        r7 = new int[r0];
        r0 = r1;
        r2 = r1;
    L_0x0015:
        r3 = r11[r1];
        if (r12 >= r3) goto L_0x0035;
    L_0x0019:
        if (r0 != 0) goto L_0x0035;
    L_0x001b:
        r3 = r12 + 1;
        r4 = r11[r12];
        if (r4 >= r10) goto L_0x002f;
    L_0x0021:
        r8 = r4 / 30;
        r6[r2] = r8;
        r8 = r2 + 1;
        r9 = r4 % 30;
        r6[r8] = r9;
        r2 = r2 + 2;
        if (r5 == 0) goto L_0x0032;
    L_0x002f:
        switch(r4) {
            case 900: goto L_0x0039;
            case 901: goto L_0x0040;
            case 902: goto L_0x0040;
            case 913: goto L_0x0045;
            case 922: goto L_0x0040;
            case 923: goto L_0x0040;
            case 924: goto L_0x0040;
            case 928: goto L_0x0040;
            default: goto L_0x0032;
        };
    L_0x0032:
        r12 = r3;
    L_0x0033:
        if (r5 == 0) goto L_0x0015;
    L_0x0035:
        a(r6, r7, r2, r13);
        return r12;
    L_0x0039:
        r4 = r2 + 1;
        r6[r2] = r10;
        if (r5 == 0) goto L_0x0052;
    L_0x003f:
        r2 = r4;
    L_0x0040:
        r3 = r3 + -1;
        r0 = 1;
        if (r5 == 0) goto L_0x0032;
    L_0x0045:
        r4 = 913; // 0x391 float:1.28E-42 double:4.51E-321;
        r6[r2] = r4;
        r12 = r3 + 1;
        r3 = r11[r3];
        r7[r2] = r3;
        r2 = r2 + 1;
        goto L_0x0033;
    L_0x0052:
        r2 = r4;
        r12 = r3;
        goto L_0x0033;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.fM.a(int[], int, java.lang.StringBuilder):int");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(int[] r9, int[] r10, int r11, java.lang.StringBuilder r12) {
        /*
        r4 = com.google.g0.a;
        r2 = com.google.bu.ALPHA;
        r1 = com.google.bu.ALPHA;
        r0 = 0;
        r3 = r0;
    L_0x0008:
        if (r3 >= r11) goto L_0x0021;
    L_0x000a:
        r5 = r9[r3];
        r0 = 0;
        r6 = com.google.f4.a;
        r7 = r2.ordinal();
        r6 = r6[r7];
        switch(r6) {
            case 1: goto L_0x0022;
            case 2: goto L_0x0062;
            case 3: goto L_0x00a5;
            case 4: goto L_0x00ee;
            case 5: goto L_0x0114;
            case 6: goto L_0x012d;
            default: goto L_0x0018;
        };
    L_0x0018:
        if (r0 == 0) goto L_0x001d;
    L_0x001a:
        r12.append(r0);
    L_0x001d:
        r0 = r3 + 1;
        if (r4 == 0) goto L_0x0153;
    L_0x0021:
        return;
    L_0x0022:
        r6 = 26;
        if (r5 >= r6) goto L_0x002b;
    L_0x0026:
        r0 = r5 + 65;
        r0 = (char) r0;
        if (r4 == 0) goto L_0x0018;
    L_0x002b:
        r6 = 26;
        if (r5 != r6) goto L_0x0033;
    L_0x002f:
        r0 = 32;
        if (r4 == 0) goto L_0x0018;
    L_0x0033:
        r6 = 27;
        if (r5 != r6) goto L_0x003b;
    L_0x0037:
        r2 = com.google.bu.LOWER;
        if (r4 == 0) goto L_0x0018;
    L_0x003b:
        r6 = 28;
        if (r5 != r6) goto L_0x0043;
    L_0x003f:
        r2 = com.google.bu.MIXED;
        if (r4 == 0) goto L_0x0018;
    L_0x0043:
        r6 = 29;
        if (r5 != r6) goto L_0x004e;
    L_0x0047:
        r1 = com.google.bu.PUNCT_SHIFT;
        if (r4 == 0) goto L_0x015b;
    L_0x004b:
        r8 = r2;
        r2 = r1;
        r1 = r8;
    L_0x004e:
        r6 = 913; // 0x391 float:1.28E-42 double:4.51E-321;
        if (r5 != r6) goto L_0x005a;
    L_0x0052:
        r6 = r10[r3];
        r6 = (char) r6;
        r12.append(r6);
        if (r4 == 0) goto L_0x0018;
    L_0x005a:
        r6 = 900; // 0x384 float:1.261E-42 double:4.447E-321;
        if (r5 != r6) goto L_0x0018;
    L_0x005e:
        r2 = com.google.bu.ALPHA;
        if (r4 == 0) goto L_0x0018;
    L_0x0062:
        r6 = 26;
        if (r5 >= r6) goto L_0x006b;
    L_0x0066:
        r0 = r5 + 97;
        r0 = (char) r0;
        if (r4 == 0) goto L_0x0018;
    L_0x006b:
        r6 = 26;
        if (r5 != r6) goto L_0x0073;
    L_0x006f:
        r0 = 32;
        if (r4 == 0) goto L_0x0018;
    L_0x0073:
        r6 = 27;
        if (r5 != r6) goto L_0x007e;
    L_0x0077:
        r1 = com.google.bu.ALPHA_SHIFT;
        if (r4 == 0) goto L_0x015b;
    L_0x007b:
        r8 = r2;
        r2 = r1;
        r1 = r8;
    L_0x007e:
        r6 = 28;
        if (r5 != r6) goto L_0x0086;
    L_0x0082:
        r2 = com.google.bu.MIXED;
        if (r4 == 0) goto L_0x0018;
    L_0x0086:
        r6 = 29;
        if (r5 != r6) goto L_0x0091;
    L_0x008a:
        r1 = com.google.bu.PUNCT_SHIFT;
        if (r4 == 0) goto L_0x015b;
    L_0x008e:
        r8 = r2;
        r2 = r1;
        r1 = r8;
    L_0x0091:
        r6 = 913; // 0x391 float:1.28E-42 double:4.51E-321;
        if (r5 != r6) goto L_0x009d;
    L_0x0095:
        r6 = r10[r3];
        r6 = (char) r6;
        r12.append(r6);
        if (r4 == 0) goto L_0x0018;
    L_0x009d:
        r6 = 900; // 0x384 float:1.261E-42 double:4.447E-321;
        if (r5 != r6) goto L_0x0018;
    L_0x00a1:
        r2 = com.google.bu.ALPHA;
        if (r4 == 0) goto L_0x0018;
    L_0x00a5:
        r6 = 25;
        if (r5 >= r6) goto L_0x00af;
    L_0x00a9:
        r0 = a;
        r0 = r0[r5];
        if (r4 == 0) goto L_0x0018;
    L_0x00af:
        r6 = 25;
        if (r5 != r6) goto L_0x00b7;
    L_0x00b3:
        r2 = com.google.bu.PUNCT;
        if (r4 == 0) goto L_0x0018;
    L_0x00b7:
        r6 = 26;
        if (r5 != r6) goto L_0x00bf;
    L_0x00bb:
        r0 = 32;
        if (r4 == 0) goto L_0x0018;
    L_0x00bf:
        r6 = 27;
        if (r5 != r6) goto L_0x00c7;
    L_0x00c3:
        r2 = com.google.bu.LOWER;
        if (r4 == 0) goto L_0x0018;
    L_0x00c7:
        r6 = 28;
        if (r5 != r6) goto L_0x00cf;
    L_0x00cb:
        r2 = com.google.bu.ALPHA;
        if (r4 == 0) goto L_0x0018;
    L_0x00cf:
        r6 = 29;
        if (r5 != r6) goto L_0x00da;
    L_0x00d3:
        r1 = com.google.bu.PUNCT_SHIFT;
        if (r4 == 0) goto L_0x015b;
    L_0x00d7:
        r8 = r2;
        r2 = r1;
        r1 = r8;
    L_0x00da:
        r6 = 913; // 0x391 float:1.28E-42 double:4.51E-321;
        if (r5 != r6) goto L_0x00e6;
    L_0x00de:
        r6 = r10[r3];
        r6 = (char) r6;
        r12.append(r6);
        if (r4 == 0) goto L_0x0018;
    L_0x00e6:
        r6 = 900; // 0x384 float:1.261E-42 double:4.447E-321;
        if (r5 != r6) goto L_0x0018;
    L_0x00ea:
        r2 = com.google.bu.ALPHA;
        if (r4 == 0) goto L_0x0018;
    L_0x00ee:
        r6 = 29;
        if (r5 >= r6) goto L_0x00f8;
    L_0x00f2:
        r0 = b;
        r0 = r0[r5];
        if (r4 == 0) goto L_0x0018;
    L_0x00f8:
        r6 = 29;
        if (r5 != r6) goto L_0x0100;
    L_0x00fc:
        r2 = com.google.bu.ALPHA;
        if (r4 == 0) goto L_0x0018;
    L_0x0100:
        r6 = 913; // 0x391 float:1.28E-42 double:4.51E-321;
        if (r5 != r6) goto L_0x010c;
    L_0x0104:
        r6 = r10[r3];
        r6 = (char) r6;
        r12.append(r6);
        if (r4 == 0) goto L_0x0018;
    L_0x010c:
        r6 = 900; // 0x384 float:1.261E-42 double:4.447E-321;
        if (r5 != r6) goto L_0x0018;
    L_0x0110:
        r2 = com.google.bu.ALPHA;
        if (r4 == 0) goto L_0x0018;
    L_0x0114:
        r2 = 26;
        if (r5 >= r2) goto L_0x011d;
    L_0x0118:
        r0 = r5 + 65;
        r0 = (char) r0;
        if (r4 == 0) goto L_0x0158;
    L_0x011d:
        r2 = 26;
        if (r5 != r2) goto L_0x0125;
    L_0x0121:
        r0 = 32;
        if (r4 == 0) goto L_0x0158;
    L_0x0125:
        r2 = 900; // 0x384 float:1.261E-42 double:4.447E-321;
        if (r5 != r2) goto L_0x0158;
    L_0x0129:
        r2 = com.google.bu.ALPHA;
        if (r4 == 0) goto L_0x0018;
    L_0x012d:
        r2 = 29;
        if (r5 >= r2) goto L_0x0137;
    L_0x0131:
        r0 = b;
        r0 = r0[r5];
        if (r4 == 0) goto L_0x0158;
    L_0x0137:
        r2 = 29;
        if (r5 != r2) goto L_0x0156;
    L_0x013b:
        r2 = com.google.bu.ALPHA;
        if (r4 == 0) goto L_0x0018;
    L_0x013f:
        r6 = 913; // 0x391 float:1.28E-42 double:4.51E-321;
        if (r5 != r6) goto L_0x014b;
    L_0x0143:
        r6 = r10[r3];
        r6 = (char) r6;
        r12.append(r6);
        if (r4 == 0) goto L_0x0018;
    L_0x014b:
        r6 = 900; // 0x384 float:1.261E-42 double:4.447E-321;
        if (r5 != r6) goto L_0x0018;
    L_0x014f:
        r2 = com.google.bu.ALPHA;
        goto L_0x0018;
    L_0x0153:
        r3 = r0;
        goto L_0x0008;
    L_0x0156:
        r2 = r1;
        goto L_0x013f;
    L_0x0158:
        r2 = r1;
        goto L_0x0018;
    L_0x015b:
        r8 = r2;
        r2 = r1;
        r1 = r8;
        goto L_0x0018;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.fM.a(int[], int[], int, java.lang.StringBuilder):void");
    }
}
