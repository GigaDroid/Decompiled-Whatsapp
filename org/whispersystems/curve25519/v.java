package org.whispersystems.curve25519;

public class v {
    public static long a(byte[] bArr, int i) {
        return (((((long) bArr[i + 0]) & 255) | ((((long) bArr[i + 1]) << 8) & 65280)) | ((((long) bArr[i + 2]) << 16) & 16711680)) | ((((long) bArr[i + 3]) << 24) & 4278190080L);
    }

    public static long b(byte[] bArr, int i) {
        return ((((long) bArr[i + 0]) & 255) | ((((long) bArr[i + 1]) << 8) & 65280)) | ((((long) bArr[i + 2]) << 16) & 16711680);
    }

    public static void a(int[] iArr, byte[] bArr) {
        long a = a(bArr, 0);
        long b = b(bArr, 4) << 6;
        long b2 = b(bArr, 7) << 5;
        long b3 = b(bArr, 10) << 3;
        long b4 = b(bArr, 13) << 2;
        long a2 = a(bArr, 16);
        long b5 = b(bArr, 23) << 5;
        long b6 = (b(bArr, 29) & 8388607) << 2;
        long j = (16777216 + b6) >> 25;
        a += 19 * j;
        b6 -= j << 25;
        j = (16777216 + b) >> 25;
        b2 += j;
        b -= j << 25;
        j = (16777216 + b3) >> 25;
        b4 += j;
        b3 -= j << 25;
        j = (16777216 + a2) >> 25;
        long b7 = (b(bArr, 20) << 7) + j;
        a2 -= j << 25;
        j = (16777216 + b5) >> 25;
        long b8 = (b(bArr, 26) << 4) + j;
        b5 -= j << 25;
        j = (33554432 + a) >> 26;
        b += j;
        a -= j << 26;
        j = (33554432 + b2) >> 26;
        b3 += j;
        b2 -= j << 26;
        j = (33554432 + b4) >> 26;
        a2 += j;
        b4 -= j << 26;
        j = (33554432 + b7) >> 26;
        b5 += j;
        b7 -= j << 26;
        j = (33554432 + b8) >> 26;
        b6 += j;
        b8 -= j << 26;
        iArr[0] = (int) a;
        iArr[1] = (int) b;
        iArr[2] = (int) b2;
        iArr[3] = (int) b3;
        iArr[4] = (int) b4;
        iArr[5] = (int) a2;
        iArr[6] = (int) b7;
        iArr[7] = (int) b5;
        iArr[8] = (int) b8;
        iArr[9] = (int) b6;
    }
}
