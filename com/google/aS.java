package com.google;

import java.io.UnsupportedEncodingException;
import java.util.Collection;
import java.util.Map;
import org.v;
import org.whispersystems.at;

final class aS {
    private static final char[] a;
    private static final String[] z;

    private static int a(eT eTVar) {
        int a = eTVar.a(8);
        if ((a & 128) == 0) {
            return a & 127;
        }
        if ((a & 192) == 128) {
            return ((a & 63) << 8) | eTVar.a(8);
        } else if ((a & 224) == 192) {
            return ((a & 31) << 16) | eTVar.a(16);
        } else {
            throw aG.a();
        }
    }

    private static void a(eT eTVar, StringBuilder stringBuilder, int i, dN dNVar, Collection collection, Map map) {
        boolean z = fQ.b;
        try {
            if (i * 8 > eTVar.a()) {
                throw aG.a();
            }
            String a;
            Object obj = new byte[i];
            int i2 = 0;
            while (i2 < i) {
                obj[i2] = (byte) eTVar.a(8);
                i2++;
                if (z) {
                    break;
                }
            }
            if (dNVar == null) {
                a = Y.a(obj, map);
            } else {
                a = dNVar.name();
            }
            try {
                stringBuilder.append(new String(obj, a));
                collection.add(obj);
            } catch (UnsupportedEncodingException e) {
                throw aG.a();
            }
        } catch (UnsupportedEncodingException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(com.google.eT r9, java.lang.StringBuilder r10, int r11, boolean r12) {
        /*
        r8 = 37;
        r7 = 11;
        r6 = 6;
        r5 = 1;
        r2 = com.google.fQ.b;
        r0 = r10.length();
        r1 = r11;
    L_0x000d:
        if (r1 <= r5) goto L_0x0036;
    L_0x000f:
        r3 = r9.a();	 Catch:{ IllegalArgumentException -> 0x001a }
        if (r3 >= r7) goto L_0x001c;
    L_0x0015:
        r0 = com.google.aG.a();	 Catch:{ IllegalArgumentException -> 0x001a }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x001a }
    L_0x001a:
        r0 = move-exception;
        throw r0;
    L_0x001c:
        r3 = r9.a(r7);
        r4 = r3 / 45;
        r4 = a(r4);
        r10.append(r4);
        r3 = r3 % 45;
        r3 = a(r3);
        r10.append(r3);
        r1 = r1 + -2;
        if (r2 == 0) goto L_0x000d;
    L_0x0036:
        if (r1 != r5) goto L_0x0050;
    L_0x0038:
        r1 = r9.a();	 Catch:{ IllegalArgumentException -> 0x0043 }
        if (r1 >= r6) goto L_0x0045;
    L_0x003e:
        r0 = com.google.aG.a();	 Catch:{ IllegalArgumentException -> 0x0043 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0043 }
    L_0x0043:
        r0 = move-exception;
        throw r0;
    L_0x0045:
        r1 = r9.a(r6);
        r1 = a(r1);
        r10.append(r1);
    L_0x0050:
        if (r12 == 0) goto L_0x007e;
    L_0x0052:
        r1 = r10.length();
        if (r0 >= r1) goto L_0x007e;
    L_0x0058:
        r1 = r10.charAt(r0);	 Catch:{ IllegalArgumentException -> 0x007f }
        if (r1 != r8) goto L_0x007a;
    L_0x005e:
        r1 = r10.length();	 Catch:{ IllegalArgumentException -> 0x0081 }
        r1 = r1 + -1;
        if (r0 >= r1) goto L_0x0075;
    L_0x0066:
        r1 = r0 + 1;
        r1 = r10.charAt(r1);	 Catch:{ IllegalArgumentException -> 0x0083 }
        if (r1 != r8) goto L_0x0075;
    L_0x006e:
        r1 = r0 + 1;
        r10.deleteCharAt(r1);	 Catch:{ IllegalArgumentException -> 0x0085 }
        if (r2 == 0) goto L_0x007a;
    L_0x0075:
        r1 = 29;
        r10.setCharAt(r0, r1);	 Catch:{ IllegalArgumentException -> 0x0085 }
    L_0x007a:
        r0 = r0 + 1;
        if (r2 == 0) goto L_0x0052;
    L_0x007e:
        return;
    L_0x007f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0081 }
    L_0x0081:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0083 }
    L_0x0083:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0085 }
    L_0x0085:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.aS.a(com.google.eT, java.lang.StringBuilder, int, boolean):void");
    }

    static {
        String[] strArr = new String[2];
        String str = "%\u001fFw`P";
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
                        i3 = 98;
                        break;
                    case at.g /*1*/:
                        i3 = 93;
                        break;
                    case at.i /*2*/:
                        i3 = 116;
                        break;
                    case at.o /*3*/:
                        i3 = 68;
                        break;
                    default:
                        i3 = 81;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    z = strArr3;
                    a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', ' ', '$', '%', '*', '+', '-', '.', '/', ':'};
                    return;
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "1\u0017=\u0017";
                    obj = null;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void b(com.google.eT r5, java.lang.StringBuilder r6, int r7) {
        /*
        r0 = 0;
        r2 = com.google.fQ.b;
        r1 = r7 * 13;
        r3 = r5.a();	 Catch:{ UnsupportedEncodingException -> 0x0010 }
        if (r1 <= r3) goto L_0x0012;
    L_0x000b:
        r0 = com.google.aG.a();	 Catch:{ UnsupportedEncodingException -> 0x0010 }
        throw r0;	 Catch:{ UnsupportedEncodingException -> 0x0010 }
    L_0x0010:
        r0 = move-exception;
        throw r0;
    L_0x0012:
        r1 = r7 * 2;
        r3 = new byte[r1];
        r1 = r0;
    L_0x0017:
        if (r7 <= 0) goto L_0x0048;
    L_0x0019:
        r0 = 13;
        r0 = r5.a(r0);
        r4 = r0 / 96;
        r4 = r4 << 8;
        r0 = r0 % 96;
        r0 = r0 | r4;
        r4 = 959; // 0x3bf float:1.344E-42 double:4.74E-321;
        if (r0 >= r4) goto L_0x0030;
    L_0x002a:
        r4 = 41377; // 0xa1a1 float:5.7982E-41 double:2.0443E-319;
        r0 = r0 + r4;
        if (r2 == 0) goto L_0x0034;
    L_0x0030:
        r4 = 42657; // 0xa6a1 float:5.9775E-41 double:2.10754E-319;
        r0 = r0 + r4;
    L_0x0034:
        r4 = r0 >> 8;
        r4 = r4 & 255;
        r4 = (byte) r4;
        r3[r1] = r4;
        r4 = r1 + 1;
        r0 = r0 & 255;
        r0 = (byte) r0;
        r3[r4] = r0;
        r0 = r1 + 2;
        r7 = r7 + -1;
        if (r2 == 0) goto L_0x005c;
    L_0x0048:
        r0 = new java.lang.String;	 Catch:{ UnsupportedEncodingException -> 0x0056 }
        r1 = z;	 Catch:{ UnsupportedEncodingException -> 0x0056 }
        r2 = 0;
        r1 = r1[r2];	 Catch:{ UnsupportedEncodingException -> 0x0056 }
        r0.<init>(r3, r1);	 Catch:{ UnsupportedEncodingException -> 0x0056 }
        r6.append(r0);	 Catch:{ UnsupportedEncodingException -> 0x0056 }
        return;
    L_0x0056:
        r0 = move-exception;
        r0 = com.google.aG.a();
        throw r0;
    L_0x005c:
        r1 = r0;
        goto L_0x0017;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.aS.b(com.google.eT, java.lang.StringBuilder, int):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.google.am a(byte[] r12, com.google.fQ r13, com.google.hP r14, java.util.Map r15) {
        /*
        r11 = com.google.fQ.b;
        r0 = new com.google.eT;
        r0.<init>(r12);
        r1 = new java.lang.StringBuilder;
        r2 = 50;
        r1.<init>(r2);
        r4 = new java.util.ArrayList;
        r2 = 1;
        r4.<init>(r2);
        r3 = -1;
        r6 = -1;
        r2 = 0;
        r5 = 0;
        r10 = r2;
        r2 = r6;
    L_0x001a:
        r6 = r0.a();	 Catch:{ IllegalArgumentException -> 0x0052 }
        r7 = 4;
        if (r6 >= r7) goto L_0x0025;
    L_0x0021:
        r6 = com.google.h8.TERMINATOR;	 Catch:{ IllegalArgumentException -> 0x0052 }
        if (r11 == 0) goto L_0x0116;
    L_0x0025:
        r6 = 4;
        r6 = r0.a(r6);	 Catch:{ IllegalArgumentException -> 0x0052 }
        r6 = com.google.h8.forBits(r6);	 Catch:{ IllegalArgumentException -> 0x0052 }
        r9 = r6;
    L_0x002f:
        r6 = com.google.h8.TERMINATOR;	 Catch:{ IllegalArgumentException -> 0x0058 }
        if (r9 == r6) goto L_0x0111;
    L_0x0033:
        r6 = com.google.h8.FNC1_FIRST_POSITION;	 Catch:{ IllegalArgumentException -> 0x0058 }
        if (r9 == r6) goto L_0x003b;
    L_0x0037:
        r6 = com.google.h8.FNC1_SECOND_POSITION;	 Catch:{ IllegalArgumentException -> 0x005a }
        if (r9 != r6) goto L_0x003e;
    L_0x003b:
        r5 = 1;
        if (r11 == 0) goto L_0x0111;
    L_0x003e:
        r8 = r5;
        r5 = com.google.h8.STRUCTURED_APPEND;	 Catch:{ IllegalArgumentException -> 0x005c }
        if (r9 != r5) goto L_0x006e;
    L_0x0043:
        r2 = r0.a();	 Catch:{ IllegalArgumentException -> 0x005e }
        r3 = 16;
        if (r2 >= r3) goto L_0x0060;
    L_0x004b:
        r0 = com.google.aG.a();	 Catch:{ IllegalArgumentException -> 0x0050 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0050 }
    L_0x0050:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0052 }
    L_0x0052:
        r0 = move-exception;
        r0 = com.google.aG.a();
        throw r0;
    L_0x0058:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x005a }
    L_0x005a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0052 }
    L_0x005c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x005e }
    L_0x005e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0050 }
    L_0x0060:
        r2 = 8;
        r3 = r0.a(r2);	 Catch:{ IllegalArgumentException -> 0x0052 }
        r2 = 8;
        r2 = r0.a(r2);	 Catch:{ IllegalArgumentException -> 0x0052 }
        if (r11 == 0) goto L_0x00e8;
    L_0x006e:
        r6 = r2;
        r7 = r3;
        r2 = com.google.h8.ECI;	 Catch:{ IllegalArgumentException -> 0x0085 }
        if (r9 != r2) goto L_0x010e;
    L_0x0074:
        r2 = a(r0);	 Catch:{ IllegalArgumentException -> 0x0052 }
        r3 = com.google.dN.getCharacterSetECIByValue(r2);	 Catch:{ IllegalArgumentException -> 0x0052 }
        if (r3 != 0) goto L_0x0087;
    L_0x007e:
        r0 = com.google.aG.a();	 Catch:{ IllegalArgumentException -> 0x0083 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0083 }
    L_0x0083:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0052 }
    L_0x0085:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0052 }
    L_0x0087:
        if (r11 == 0) goto L_0x011f;
    L_0x0089:
        r2 = com.google.h8.HANZI;	 Catch:{ IllegalArgumentException -> 0x00d6 }
        if (r9 != r2) goto L_0x00a2;
    L_0x008d:
        r2 = 4;
        r2 = r0.a(r2);	 Catch:{ IllegalArgumentException -> 0x0052 }
        r5 = r9.getCharacterCountBits(r13);	 Catch:{ IllegalArgumentException -> 0x0052 }
        r5 = r0.a(r5);	 Catch:{ IllegalArgumentException -> 0x0052 }
        r10 = 1;
        if (r2 != r10) goto L_0x00a0;
    L_0x009d:
        b(r0, r1, r5);	 Catch:{ IllegalArgumentException -> 0x00d8 }
    L_0x00a0:
        if (r11 == 0) goto L_0x011f;
    L_0x00a2:
        r2 = r9.getCharacterCountBits(r13);	 Catch:{ IllegalArgumentException -> 0x0052 }
        r2 = r0.a(r2);	 Catch:{ IllegalArgumentException -> 0x0052 }
        r5 = com.google.h8.NUMERIC;	 Catch:{ IllegalArgumentException -> 0x00da }
        if (r9 != r5) goto L_0x00b3;
    L_0x00ae:
        a(r0, r1, r2);	 Catch:{ IllegalArgumentException -> 0x00da }
        if (r11 == 0) goto L_0x011f;
    L_0x00b3:
        r5 = com.google.h8.ALPHANUMERIC;	 Catch:{ IllegalArgumentException -> 0x00dc }
        if (r9 != r5) goto L_0x00bc;
    L_0x00b7:
        a(r0, r1, r2, r8);	 Catch:{ IllegalArgumentException -> 0x00de }
        if (r11 == 0) goto L_0x011f;
    L_0x00bc:
        r5 = com.google.h8.BYTE;	 Catch:{ IllegalArgumentException -> 0x00e0 }
        if (r9 != r5) goto L_0x00c6;
    L_0x00c0:
        r5 = r15;
        a(r0, r1, r2, r3, r4, r5);	 Catch:{ IllegalArgumentException -> 0x00e2 }
        if (r11 == 0) goto L_0x011f;
    L_0x00c6:
        r5 = com.google.h8.KANJI;	 Catch:{ IllegalArgumentException -> 0x00e4 }
        if (r9 != r5) goto L_0x00cf;
    L_0x00ca:
        c(r0, r1, r2);	 Catch:{ IllegalArgumentException -> 0x00e6 }
        if (r11 == 0) goto L_0x011f;
    L_0x00cf:
        r0 = com.google.aG.a();	 Catch:{ IllegalArgumentException -> 0x00d4 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00d4 }
    L_0x00d4:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0052 }
    L_0x00d6:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0052 }
    L_0x00d8:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0052 }
    L_0x00da:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00dc }
    L_0x00dc:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00de }
    L_0x00de:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00e0 }
    L_0x00e0:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00e2 }
    L_0x00e2:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00e4 }
    L_0x00e4:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00e6 }
    L_0x00e6:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00d4 }
    L_0x00e8:
        r6 = r2;
        r5 = r3;
        r2 = r8;
        r3 = r10;
    L_0x00ec:
        r7 = com.google.h8.TERMINATOR;	 Catch:{ IllegalArgumentException -> 0x0052 }
        if (r9 != r7) goto L_0x0119;
    L_0x00f0:
        r0 = new com.google.am;	 Catch:{ IllegalArgumentException -> 0x0105 }
        r2 = r1.toString();	 Catch:{ IllegalArgumentException -> 0x0105 }
        r1 = r4.isEmpty();	 Catch:{ IllegalArgumentException -> 0x0105 }
        if (r1 == 0) goto L_0x0107;
    L_0x00fc:
        r3 = 0;
    L_0x00fd:
        if (r14 != 0) goto L_0x0109;
    L_0x00ff:
        r4 = 0;
    L_0x0100:
        r1 = r12;
        r0.<init>(r1, r2, r3, r4, r5, r6);
        return r0;
    L_0x0105:
        r0 = move-exception;
        throw r0;
    L_0x0107:
        r3 = r4;
        goto L_0x00fd;
    L_0x0109:
        r4 = r14.toString();
        goto L_0x0100;
    L_0x010e:
        r3 = r10;
        goto L_0x0089;
    L_0x0111:
        r6 = r2;
        r2 = r5;
        r5 = r3;
        r3 = r10;
        goto L_0x00ec;
    L_0x0116:
        r9 = r6;
        goto L_0x002f;
    L_0x0119:
        r10 = r3;
        r3 = r5;
        r5 = r2;
        r2 = r6;
        goto L_0x001a;
    L_0x011f:
        r2 = r8;
        r5 = r7;
        goto L_0x00ec;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.aS.a(byte[], com.google.fQ, com.google.hP, java.util.Map):com.google.am");
    }

    private static void a(eT eTVar, StringBuilder stringBuilder, int i) {
        int a;
        boolean z = fQ.b;
        int i2 = i;
        while (i2 >= 3) {
            try {
                if (eTVar.a() >= 10) {
                    a = eTVar.a(10);
                    if (a < 1000) {
                        stringBuilder.append(a(a / 100));
                        stringBuilder.append(a((a / 10) % 10));
                        stringBuilder.append(a(a % 10));
                        i2 -= 3;
                        if (z) {
                            break;
                        }
                    }
                    try {
                        throw aG.a();
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                }
                throw aG.a();
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }
        if (i2 == 2) {
            try {
                if (eTVar.a() < 7) {
                    throw aG.a();
                }
                a = eTVar.a(7);
                if (a >= 100) {
                    try {
                        throw aG.a();
                    } catch (IllegalArgumentException e22) {
                        throw e22;
                    }
                }
                try {
                    stringBuilder.append(a(a / 10));
                    stringBuilder.append(a(a % 10));
                    if (!z) {
                        return;
                    }
                } catch (IllegalArgumentException e222) {
                    throw e222;
                } catch (IllegalArgumentException e2222) {
                    throw e2222;
                }
            } catch (IllegalArgumentException e22222) {
                throw e22222;
            }
        }
        if (i2 == 1) {
            try {
                if (eTVar.a() < 4) {
                    throw aG.a();
                }
                i2 = eTVar.a(4);
                if (i2 >= 10) {
                    try {
                        throw aG.a();
                    } catch (IllegalArgumentException e222222) {
                        throw e222222;
                    }
                }
                stringBuilder.append(a(i2));
            } catch (IllegalArgumentException e2222222) {
                throw e2222222;
            }
        }
    }

    private static char a(int i) {
        try {
            if (i < a.length) {
                return a[i];
            }
            throw aG.a();
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void c(com.google.eT r5, java.lang.StringBuilder r6, int r7) {
        /*
        r2 = com.google.fQ.b;
        r0 = r7 * 13;
        r1 = r5.a();	 Catch:{ UnsupportedEncodingException -> 0x000f }
        if (r0 <= r1) goto L_0x0011;
    L_0x000a:
        r0 = com.google.aG.a();	 Catch:{ UnsupportedEncodingException -> 0x000f }
        throw r0;	 Catch:{ UnsupportedEncodingException -> 0x000f }
    L_0x000f:
        r0 = move-exception;
        throw r0;
    L_0x0011:
        r0 = r7 * 2;
        r3 = new byte[r0];
        r0 = 0;
        r1 = r0;
    L_0x0017:
        if (r7 <= 0) goto L_0x0044;
    L_0x0019:
        r0 = 13;
        r0 = r5.a(r0);
        r4 = r0 / 192;
        r4 = r4 << 8;
        r0 = r0 % 192;
        r0 = r0 | r4;
        r4 = 7936; // 0x1f00 float:1.1121E-41 double:3.921E-320;
        if (r0 >= r4) goto L_0x0030;
    L_0x002a:
        r4 = 33088; // 0x8140 float:4.6366E-41 double:1.63476E-319;
        r0 = r0 + r4;
        if (r2 == 0) goto L_0x0034;
    L_0x0030:
        r4 = 49472; // 0xc140 float:6.9325E-41 double:2.44424E-319;
        r0 = r0 + r4;
    L_0x0034:
        r4 = r0 >> 8;
        r4 = (byte) r4;
        r3[r1] = r4;
        r4 = r1 + 1;
        r0 = (byte) r0;
        r3[r4] = r0;
        r0 = r1 + 2;
        r7 = r7 + -1;
        if (r2 == 0) goto L_0x0058;
    L_0x0044:
        r0 = new java.lang.String;	 Catch:{ UnsupportedEncodingException -> 0x0052 }
        r1 = z;	 Catch:{ UnsupportedEncodingException -> 0x0052 }
        r2 = 1;
        r1 = r1[r2];	 Catch:{ UnsupportedEncodingException -> 0x0052 }
        r0.<init>(r3, r1);	 Catch:{ UnsupportedEncodingException -> 0x0052 }
        r6.append(r0);	 Catch:{ UnsupportedEncodingException -> 0x0052 }
        return;
    L_0x0052:
        r0 = move-exception;
        r0 = com.google.aG.a();
        throw r0;
    L_0x0058:
        r1 = r0;
        goto L_0x0017;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.aS.c(com.google.eT, java.lang.StringBuilder, int):void");
    }
}
