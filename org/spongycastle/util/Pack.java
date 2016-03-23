package org.spongycastle.util;

import org.spongycastle.jcajce.provider.digest.BCMessageDigest;

public abstract class Pack {
    public static int a;

    public static void longToBigEndian(long[] jArr, byte[] bArr, int i) {
        int i2 = a;
        int length = jArr.length;
        int i3 = 0;
        while (i3 < length) {
            longToBigEndian(jArr[i3], bArr, i);
            i += 8;
            i3++;
            if (i2 != 0) {
                return;
            }
        }
    }

    public static void intToBigEndian(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) (i >>> 24);
        int i3 = i2 + 1;
        bArr[i3] = (byte) (i >>> 16);
        i3++;
        bArr[i3] = (byte) (i >>> 8);
        bArr[i3 + 1] = (byte) i;
    }

    public static void longToBigEndian(long j, byte[] bArr, int i) {
        intToBigEndian((int) (j >>> 32), bArr, i);
        intToBigEndian((int) (4294967295L & j), bArr, i + 4);
    }

    public static void intToLittleEndian(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        int i3 = i2 + 1;
        bArr[i3] = (byte) (i >>> 8);
        i3++;
        bArr[i3] = (byte) (i >>> 16);
        bArr[i3 + 1] = (byte) (i >>> 24);
    }

    public static void intToBigEndian(int[] iArr, byte[] bArr, int i) {
        int i2 = a;
        int length = iArr.length;
        int i3 = 0;
        while (i3 < length) {
            intToBigEndian(iArr[i3], bArr, i);
            i += 4;
            i3++;
            if (i2 != 0) {
                return;
            }
        }
    }

    public static int bigEndianToInt(byte[] bArr, int i) {
        int i2 = a;
        int i3 = i + 1;
        i3++;
        int i4 = (((bArr[i] << 24) | ((bArr[i3] & 255) << 16)) | ((bArr[i3] & 255) << 8)) | (bArr[i3 + 1] & 255);
        if (BCMessageDigest.a) {
            a = i2 + 1;
        }
        return i4;
    }

    public static void bigEndianToInt(byte[] bArr, int i, int[] iArr) {
        int i2 = a;
        int i3 = 0;
        while (i3 < iArr.length) {
            iArr[i3] = bigEndianToInt(bArr, i);
            i += 4;
            i3++;
            if (i2 != 0) {
                return;
            }
        }
    }

    public static void bigEndianToLong(byte[] bArr, int i, long[] jArr) {
        int i2 = a;
        int i3 = 0;
        while (i3 < jArr.length) {
            jArr[i3] = bigEndianToLong(bArr, i);
            i += 8;
            i3++;
            if (i2 != 0) {
                return;
            }
        }
    }

    public static long bigEndianToLong(byte[] bArr, int i) {
        return (((long) bigEndianToInt(bArr, i + 4)) & 4294967295L) | ((((long) bigEndianToInt(bArr, i)) & 4294967295L) << 32);
    }

    public static int littleEndianToInt(byte[] bArr, int i) {
        int i2 = i + 1;
        i2++;
        int i3 = (((bArr[i] & 255) | ((bArr[i2] & 255) << 8)) | ((bArr[i2] & 255) << 16)) | (bArr[i2 + 1] << 24);
        if (a != 0) {
            BCMessageDigest.a = !BCMessageDigest.a;
        }
        return i3;
    }
}
