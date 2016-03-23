package com.google;

import org.v;
import org.whispersystems.at;

final class iM {
    private static final String z;

    static {
        char[] toCharArray = "1x#\u0014\u0011\u0011ru\u0018\u001c\u000b}u\u0005\u001c\fb0\u0007\u0013B6".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 120;
                    break;
                case at.g /*1*/:
                    i2 = 22;
                    break;
                case at.i /*2*/:
                    i2 = 85;
                    break;
                case at.o /*3*/:
                    i2 = 117;
                    break;
                default:
                    i2 = 125;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int c(com.google.dG r12) {
        /*
        r2 = 0;
        r11 = 1;
        r4 = com.google.dG.c;
        r5 = r12.a();
        r6 = r12.b();
        r7 = r12.c();
        r3 = r2;
        r0 = r2;
    L_0x0012:
        if (r3 >= r7) goto L_0x00af;
    L_0x0014:
        r1 = r2;
    L_0x0015:
        if (r1 >= r6) goto L_0x00ab;
    L_0x0017:
        r8 = r5[r3];
        r9 = r1 + 6;
        if (r9 >= r6) goto L_0x0059;
    L_0x001d:
        r9 = r8[r1];	 Catch:{ IllegalArgumentException -> 0x00b2 }
        if (r9 != r11) goto L_0x0059;
    L_0x0021:
        r9 = r1 + 1;
        r9 = r8[r9];	 Catch:{ IllegalArgumentException -> 0x00b4 }
        if (r9 != 0) goto L_0x0059;
    L_0x0027:
        r9 = r1 + 2;
        r9 = r8[r9];	 Catch:{ IllegalArgumentException -> 0x00b6 }
        if (r9 != r11) goto L_0x0059;
    L_0x002d:
        r9 = r1 + 3;
        r9 = r8[r9];	 Catch:{ IllegalArgumentException -> 0x00b8 }
        if (r9 != r11) goto L_0x0059;
    L_0x0033:
        r9 = r1 + 4;
        r9 = r8[r9];	 Catch:{ IllegalArgumentException -> 0x00ba }
        if (r9 != r11) goto L_0x0059;
    L_0x0039:
        r9 = r1 + 5;
        r9 = r8[r9];	 Catch:{ IllegalArgumentException -> 0x00bc }
        if (r9 != 0) goto L_0x0059;
    L_0x003f:
        r9 = r1 + 6;
        r9 = r8[r9];	 Catch:{ IllegalArgumentException -> 0x00be }
        if (r9 != r11) goto L_0x0059;
    L_0x0045:
        r9 = r1 + -4;
        r9 = a(r8, r9, r1);	 Catch:{ IllegalArgumentException -> 0x00c0 }
        if (r9 != 0) goto L_0x0057;
    L_0x004d:
        r9 = r1 + 7;
        r10 = r1 + 11;
        r8 = a(r8, r9, r10);	 Catch:{ IllegalArgumentException -> 0x00c2 }
        if (r8 == 0) goto L_0x0059;
    L_0x0057:
        r0 = r0 + 1;
    L_0x0059:
        r8 = r3 + 6;
        if (r8 >= r7) goto L_0x00a7;
    L_0x005d:
        r8 = r5[r3];	 Catch:{ IllegalArgumentException -> 0x00c4 }
        r8 = r8[r1];	 Catch:{ IllegalArgumentException -> 0x00c4 }
        if (r8 != r11) goto L_0x00a7;
    L_0x0063:
        r8 = r3 + 1;
        r8 = r5[r8];	 Catch:{ IllegalArgumentException -> 0x00c6 }
        r8 = r8[r1];	 Catch:{ IllegalArgumentException -> 0x00c6 }
        if (r8 != 0) goto L_0x00a7;
    L_0x006b:
        r8 = r3 + 2;
        r8 = r5[r8];	 Catch:{ IllegalArgumentException -> 0x00c8 }
        r8 = r8[r1];	 Catch:{ IllegalArgumentException -> 0x00c8 }
        if (r8 != r11) goto L_0x00a7;
    L_0x0073:
        r8 = r3 + 3;
        r8 = r5[r8];	 Catch:{ IllegalArgumentException -> 0x00ca }
        r8 = r8[r1];	 Catch:{ IllegalArgumentException -> 0x00ca }
        if (r8 != r11) goto L_0x00a7;
    L_0x007b:
        r8 = r3 + 4;
        r8 = r5[r8];	 Catch:{ IllegalArgumentException -> 0x00cc }
        r8 = r8[r1];	 Catch:{ IllegalArgumentException -> 0x00cc }
        if (r8 != r11) goto L_0x00a7;
    L_0x0083:
        r8 = r3 + 5;
        r8 = r5[r8];	 Catch:{ IllegalArgumentException -> 0x00ce }
        r8 = r8[r1];	 Catch:{ IllegalArgumentException -> 0x00ce }
        if (r8 != 0) goto L_0x00a7;
    L_0x008b:
        r8 = r3 + 6;
        r8 = r5[r8];	 Catch:{ IllegalArgumentException -> 0x00d0 }
        r8 = r8[r1];	 Catch:{ IllegalArgumentException -> 0x00d0 }
        if (r8 != r11) goto L_0x00a7;
    L_0x0093:
        r8 = r3 + -4;
        r8 = a(r5, r1, r8, r3);	 Catch:{ IllegalArgumentException -> 0x00d2 }
        if (r8 != 0) goto L_0x00a5;
    L_0x009b:
        r8 = r3 + 7;
        r9 = r3 + 11;
        r8 = a(r5, r1, r8, r9);	 Catch:{ IllegalArgumentException -> 0x00d4 }
        if (r8 == 0) goto L_0x00a7;
    L_0x00a5:
        r0 = r0 + 1;
    L_0x00a7:
        r1 = r1 + 1;
        if (r4 == 0) goto L_0x0015;
    L_0x00ab:
        r1 = r3 + 1;
        if (r4 == 0) goto L_0x00d6;
    L_0x00af:
        r0 = r0 * 40;
        return r0;
    L_0x00b2:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00b4 }
    L_0x00b4:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00b6 }
    L_0x00b6:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00b8 }
    L_0x00b8:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00ba }
    L_0x00ba:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00bc }
    L_0x00bc:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00be }
    L_0x00be:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00c0 }
    L_0x00c0:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00c2 }
    L_0x00c2:
        r0 = move-exception;
        throw r0;
    L_0x00c4:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00c6 }
    L_0x00c6:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00c8 }
    L_0x00c8:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00ca }
    L_0x00ca:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00cc }
    L_0x00cc:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00ce }
    L_0x00ce:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00d0 }
    L_0x00d0:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00d2 }
    L_0x00d2:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00d4 }
    L_0x00d4:
        r0 = move-exception;
        throw r0;
    L_0x00d6:
        r3 = r1;
        goto L_0x0012;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.iM.c(com.google.dG):int");
    }

    private static boolean a(byte[][] bArr, int i, int i2, int i3) {
        int i4 = dG.c;
        while (i2 < i3) {
            if (i2 >= 0) {
                try {
                    if (i2 < bArr.length) {
                        if (bArr[i2][i] == (byte) 1) {
                            return false;
                        }
                    }
                } catch (IllegalArgumentException e) {
                    throw e;
                } catch (IllegalArgumentException e2) {
                    throw e2;
                }
            }
            i2++;
            if (i4 != 0) {
                return true;
            }
        }
        return true;
    }

    static int a(dG dGVar) {
        int i = dG.c;
        byte[][] a = dGVar.a();
        int b = dGVar.b();
        int c = dGVar.c();
        int i2 = 0;
        int i3 = 0;
        while (i2 < c - 1) {
            int i4 = 0;
            while (i4 < b - 1) {
                byte b2 = a[i2][i4];
                try {
                    if (b2 == a[i2][i4 + 1]) {
                        if (b2 == a[i2 + 1][i4]) {
                            try {
                                if (b2 == a[i2 + 1][i4 + 1]) {
                                    i3++;
                                }
                            } catch (IllegalArgumentException e) {
                                throw e;
                            }
                        }
                    }
                    i4++;
                    if (i != 0) {
                        break;
                    }
                } catch (IllegalArgumentException e2) {
                    throw e2;
                } catch (IllegalArgumentException e22) {
                    throw e22;
                }
            }
            i4 = i2 + 1;
            if (i != 0) {
                break;
            }
            i2 = i4;
        }
        return i3 * 3;
    }

    static int d(dG dGVar) {
        int i;
        int i2 = dG.c;
        byte[][] a = dGVar.a();
        int b = dGVar.b();
        int c = dGVar.c();
        int i3 = 0;
        int i4 = 0;
        while (i3 < c) {
            byte[] bArr = a[i3];
            i = 0;
            while (i < b) {
                try {
                    if (bArr[i] == 1) {
                        i4++;
                    }
                    i++;
                    if (i2 != 0) {
                        break;
                    }
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            i = i3 + 1;
            if (i2 != 0) {
                break;
            }
            i3 = i;
        }
        i = dGVar.c() * dGVar.b();
        return ((Math.abs((i4 * 2) - i) * 10) / i) * 10;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean a(int r3, int r4, int r5) {
        /*
        r1 = com.google.dG.c;
        switch(r3) {
            case 0: goto L_0x0020;
            case 1: goto L_0x0026;
            case 2: goto L_0x002a;
            case 3: goto L_0x002e;
            case 4: goto L_0x0034;
            case 5: goto L_0x003d;
            case 6: goto L_0x0046;
            case 7: goto L_0x0051;
            default: goto L_0x0005;
        };
    L_0x0005:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x001e }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x001e }
        r1.<init>();	 Catch:{ IllegalArgumentException -> 0x001e }
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x001e }
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x001e }
        r1 = r1.append(r3);	 Catch:{ IllegalArgumentException -> 0x001e }
        r1 = r1.toString();	 Catch:{ IllegalArgumentException -> 0x001e }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x001e }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x001e }
    L_0x001e:
        r0 = move-exception;
        throw r0;
    L_0x0020:
        r0 = r5 + r4;
        r0 = r0 & 1;
        if (r1 == 0) goto L_0x005e;
    L_0x0026:
        r0 = r5 & 1;
        if (r1 == 0) goto L_0x005e;
    L_0x002a:
        r0 = r4 % 3;
        if (r1 == 0) goto L_0x005e;
    L_0x002e:
        r0 = r5 + r4;
        r0 = r0 % 3;
        if (r1 == 0) goto L_0x005e;
    L_0x0034:
        r0 = r5 / 2;
        r2 = r4 / 3;
        r0 = r0 + r2;
        r0 = r0 & 1;
        if (r1 == 0) goto L_0x005e;
    L_0x003d:
        r0 = r5 * r4;
        r2 = r0 & 1;
        r0 = r0 % 3;
        r0 = r0 + r2;
        if (r1 == 0) goto L_0x005e;
    L_0x0046:
        r0 = r5 * r4;
        r2 = r0 & 1;
        r0 = r0 % 3;
        r0 = r0 + r2;
        r0 = r0 & 1;
        if (r1 == 0) goto L_0x005e;
    L_0x0051:
        r0 = r5 * r4;
        r0 = r0 % 3;
        r2 = r5 + r4;
        r2 = r2 & 1;
        r0 = r0 + r2;
        r0 = r0 & 1;
        if (r1 != 0) goto L_0x0005;
    L_0x005e:
        if (r0 != 0) goto L_0x0062;
    L_0x0060:
        r0 = 1;
    L_0x0061:
        return r0;
    L_0x0062:
        r0 = 0;
        goto L_0x0061;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.iM.a(int, int, int):boolean");
    }

    static int b(dG dGVar) {
        return a(dGVar, true) + a(dGVar, false);
    }

    private static boolean a(byte[] bArr, int i, int i2) {
        int i3 = dG.c;
        while (i < i2) {
            if (i >= 0) {
                try {
                    if (i < bArr.length) {
                        if (bArr[i] == (byte) 1) {
                            return false;
                        }
                    }
                } catch (IllegalArgumentException e) {
                    throw e;
                } catch (IllegalArgumentException e2) {
                    throw e2;
                }
            }
            i++;
            if (i3 != 0) {
                return true;
            }
        }
        return true;
    }

    private static int a(dG dGVar, boolean z) {
        int i = dG.c;
        if (z) {
            try {
                int c = dGVar.c();
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        c = dGVar.b();
        if (z) {
            try {
                int b = dGVar.b();
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }
        b = dGVar.c();
        byte[][] a = dGVar.a();
        int i2 = 0;
        int i3 = 0;
        while (i2 < c) {
            Object obj = -1;
            int i4 = 0;
            int i5 = 0;
            int i6 = i3;
            while (i4 < b) {
                byte b2;
                byte b3;
                int i7;
                if (z) {
                    try {
                        b2 = a[i2][i4];
                    } catch (IllegalArgumentException e22) {
                        throw e22;
                    }
                }
                b2 = a[i4][i2];
                if (b2 == obj) {
                    i5++;
                    if (i == 0) {
                        i3 = i5;
                        b3 = obj;
                        i7 = i4 + 1;
                        if (i != 0) {
                            int i8 = i3;
                            i3 = i6;
                            i6 = i8;
                            break;
                        }
                        i4 = i7;
                        obj = b3;
                        i5 = i3;
                    }
                }
                if (i5 >= 5) {
                    i6 += (i5 - 5) + 3;
                }
                byte b4 = b2;
                i3 = 1;
                b3 = b4;
                i7 = i4 + 1;
                if (i != 0) {
                    int i82 = i3;
                    i3 = i6;
                    i6 = i82;
                    break;
                }
                i4 = i7;
                obj = b3;
                i5 = i3;
            }
            i3 = i6;
            i6 = i5;
            if (i6 >= 5) {
                i3 += (i6 - 5) + 3;
            }
            i6 = i2 + 1;
            if (i != 0) {
                break;
            }
            i2 = i6;
        }
        return i3;
    }
}
