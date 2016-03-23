package com.google;

import org.v;
import org.whispersystems.at;

final class gp {
    public static boolean c(byte[] bArr, int i, int i2) {
        return d(bArr, i, i2) == 0;
    }

    private static int b(byte[] bArr, int i, int i2) {
        while (i < i2) {
            int i3 = i + 1;
            int i4 = bArr[i];
            if (i4 < 0) {
                if (i4 < -32) {
                    if (i3 >= i2) {
                        return i4;
                    }
                    if (i4 >= -62) {
                        i4 = i3 + 1;
                        if (bArr[i3] > (byte) -65) {
                        }
                    }
                    return -1;
                } else if (i4 < -16) {
                    if (i3 >= i2 - 1) {
                        return a(bArr, i3, i2);
                    }
                    r3 = i3 + 1;
                    r2 = bArr[i3];
                    if (r2 <= (byte) -65 && ((i4 != -32 || r2 >= (byte) -96) && (i4 != -19 || r2 < (byte) -96))) {
                        i4 = r3 + 1;
                        if (bArr[r3] > (byte) -65) {
                        }
                    }
                    return -1;
                } else if (i3 >= i2 - 2) {
                    return a(bArr, i3, i2);
                } else {
                    r3 = i3 + 1;
                    r2 = bArr[i3];
                    if (r2 <= (byte) -65 && (((i4 << 28) + (r2 + 112)) >> 30) == 0) {
                        i3 = r3 + 1;
                        if (bArr[r3] <= (byte) -65) {
                            i4 = i3 + 1;
                            if (bArr[i3] > (byte) -65) {
                            }
                        }
                    }
                    return -1;
                }
                i = i4;
            } else {
                i = i3;
            }
        }
        return 0;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(int r7, byte[] r8, int r9, int r10) {
        /*
        r3 = -32;
        r4 = -96;
        r1 = -1;
        r6 = -65;
        if (r7 == 0) goto L_0x0087;
    L_0x0009:
        if (r9 < r10) goto L_0x000c;
    L_0x000b:
        return r7;
    L_0x000c:
        r5 = (byte) r7;
        if (r5 >= r3) goto L_0x001b;
    L_0x000f:
        r0 = -62;
        if (r5 < r0) goto L_0x0019;
    L_0x0013:
        r0 = r9 + 1;
        r2 = r8[r9];
        if (r2 <= r6) goto L_0x0086;
    L_0x0019:
        r7 = r1;
        goto L_0x000b;
    L_0x001b:
        r0 = -16;
        if (r5 >= r0) goto L_0x004a;
    L_0x001f:
        r0 = r7 >> 8;
        r0 = r0 ^ -1;
        r0 = (byte) r0;
        if (r0 != 0) goto L_0x0031;
    L_0x0026:
        r2 = r9 + 1;
        r0 = r8[r9];
        if (r2 < r10) goto L_0x0032;
    L_0x002c:
        r7 = a(r5, r0);
        goto L_0x000b;
    L_0x0031:
        r2 = r9;
    L_0x0032:
        if (r0 > r6) goto L_0x0044;
    L_0x0034:
        if (r5 != r3) goto L_0x0038;
    L_0x0036:
        if (r0 < r4) goto L_0x0044;
    L_0x0038:
        r3 = -19;
        if (r5 != r3) goto L_0x003e;
    L_0x003c:
        if (r0 >= r4) goto L_0x0044;
    L_0x003e:
        r9 = r2 + 1;
        r0 = r8[r2];
        if (r0 <= r6) goto L_0x0046;
    L_0x0044:
        r7 = r1;
        goto L_0x000b;
    L_0x0046:
        r0 = com.google.bA.b;
        if (r0 == 0) goto L_0x0087;
    L_0x004a:
        r4 = r9;
        r0 = r7 >> 8;
        r0 = r0 ^ -1;
        r2 = (byte) r0;
        r0 = 0;
        if (r2 != 0) goto L_0x005e;
    L_0x0053:
        r3 = r4 + 1;
        r2 = r8[r4];
        if (r3 < r10) goto L_0x008c;
    L_0x0059:
        r7 = a(r5, r2);
        goto L_0x000b;
    L_0x005e:
        r0 = r7 >> 16;
        r0 = (byte) r0;
        r3 = r4;
        r4 = r2;
    L_0x0063:
        if (r0 != 0) goto L_0x0070;
    L_0x0065:
        r2 = r3 + 1;
        r0 = r8[r3];
        if (r2 < r10) goto L_0x0071;
    L_0x006b:
        r7 = a(r5, r4, r0);
        goto L_0x000b;
    L_0x0070:
        r2 = r3;
    L_0x0071:
        if (r4 > r6) goto L_0x0084;
    L_0x0073:
        r3 = r5 << 28;
        r4 = r4 + 112;
        r3 = r3 + r4;
        r3 = r3 >> 30;
        if (r3 != 0) goto L_0x0084;
    L_0x007c:
        if (r0 > r6) goto L_0x0084;
    L_0x007e:
        r9 = r2 + 1;
        r0 = r8[r2];
        if (r0 <= r6) goto L_0x0087;
    L_0x0084:
        r7 = r1;
        goto L_0x000b;
    L_0x0086:
        r9 = r0;
    L_0x0087:
        r7 = d(r8, r9, r10);
        goto L_0x000b;
    L_0x008c:
        r4 = r2;
        goto L_0x0063;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gp.a(int, byte[], int, int):int");
    }

    private static int a(int i, int i2) {
        return (i > -12 || i2 > -65) ? -1 : (i2 << 8) ^ i;
    }

    private static int a(byte[] bArr, int i, int i2) {
        int i3 = bArr[i - 1];
        switch (i2 - i) {
            case v.m /*0*/:
                return a(i3);
            case at.g /*1*/:
                return a(i3, bArr[i]);
            case at.i /*2*/:
                return a(i3, bArr[i], bArr[i + 1]);
            default:
                throw new AssertionError();
        }
    }

    private static int a(int i, int i2, int i3) {
        return (i > -12 || i2 > -65 || i3 > -65) ? -1 : ((i2 << 8) ^ i) ^ (i3 << 16);
    }

    public static int d(byte[] bArr, int i, int i2) {
        boolean z = bA.b;
        int i3 = i;
        while (i3 < i2 && bArr[i3] >= null) {
            i3++;
            if (z) {
                break;
            }
        }
        return i3 >= i2 ? 0 : b(bArr, i3, i2);
    }

    private static int a(int i) {
        return i > -12 ? -1 : i;
    }
}
