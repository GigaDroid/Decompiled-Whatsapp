package org.spongycastle.crypto.modes.gcm;

import org.spongycastle.jcajce.provider.digest.BCMessageDigest;
import org.spongycastle.util.Pack;

public abstract class GCMUtil {
    private static final int E1 = -520093696;
    private static final long E1L = -2233785415175766016L;
    private static final int[] LOOKUP;
    public static int a;

    public static int[] asInts(byte[] bArr) {
        int[] iArr = new int[4];
        Pack.bigEndianToInt(bArr, 0, iArr);
        return iArr;
    }

    static int shiftRightN(int[] iArr, int i, int[] iArr2) {
        boolean z = false;
        int i2 = a;
        int i3 = iArr[0];
        int i4 = 32 - i;
        iArr2[0] = i3 >>> i;
        i3 <<= i4;
        int i5 = iArr[1];
        iArr2[1] = i3 | (i5 >>> i);
        i3 = i5 << i4;
        i5 = iArr[2];
        iArr2[2] = i3 | (i5 >>> i);
        i3 = i5 << i4;
        i5 = iArr[3];
        iArr2[3] = i3 | (i5 >>> i);
        i3 = i5 << i4;
        if (i2 != 0) {
            if (!BCMessageDigest.a) {
                z = true;
            }
            BCMessageDigest.a = z;
        }
        return i3;
    }

    public static byte[] asBytes(long[] jArr) {
        byte[] bArr = new byte[16];
        Pack.longToBigEndian(jArr, bArr, 0);
        return bArr;
    }

    public static byte[] oneAsBytes() {
        byte[] bArr = new byte[16];
        bArr[0] = Byte.MIN_VALUE;
        return bArr;
    }

    static {
        LOOKUP = generateLookup();
    }

    public static void multiply(byte[] bArr, byte[] bArr2) {
        int[] asInts = asInts(bArr);
        multiply(asInts, asInts(bArr2));
        asBytes(asInts, bArr);
    }

    static int shiftRightN(int[] iArr, int i) {
        int i2 = a;
        int i3 = iArr[0];
        int i4 = 32 - i;
        iArr[0] = i3 >>> i;
        i3 <<= i4;
        int i5 = iArr[1];
        iArr[1] = i3 | (i5 >>> i);
        i3 = i5 << i4;
        i5 = iArr[2];
        iArr[2] = i3 | (i5 >>> i);
        i3 = i5 << i4;
        i5 = iArr[3];
        iArr[3] = i3 | (i5 >>> i);
        i3 = i5 << i4;
        if (BCMessageDigest.a) {
            a = i2 + 1;
        }
        return i3;
    }

    static long shiftRight(long[] jArr) {
        long j = jArr[0];
        jArr[0] = j >>> 1;
        j <<= 63;
        long j2 = jArr[1];
        jArr[1] = j | (j2 >>> 1);
        return j2 << 63;
    }

    public static void asLongs(byte[] bArr, long[] jArr) {
        Pack.bigEndianToLong(bArr, 0, jArr);
    }

    private static int[] generateLookup() {
        int[] iArr = new int[256];
        for (int i = 0; i < 256; i++) {
            int i2 = 0;
            for (int i3 = 7; i3 >= 0; i3--) {
                if (((1 << i3) & i) != 0) {
                    i2 ^= E1 >>> (7 - i3);
                }
            }
            iArr[i] = i2;
        }
        return iArr;
    }

    public static void multiplyP(int[] iArr) {
        iArr[0] = ((shiftRight(iArr) >> 8) & E1) ^ iArr[0];
    }

    static int shiftRight(int[] iArr, int[] iArr2) {
        int i = iArr[0];
        iArr2[0] = i >>> 1;
        i <<= 31;
        int i2 = iArr[1];
        iArr2[1] = i | (i2 >>> 1);
        i = i2 << 31;
        i2 = iArr[2];
        iArr2[2] = i | (i2 >>> 1);
        i = i2 << 31;
        i2 = iArr[3];
        iArr2[3] = i | (i2 >>> 1);
        return i2 << 31;
    }

    static int shiftRight(int[] iArr) {
        int i = iArr[0];
        iArr[0] = i >>> 1;
        i <<= 31;
        int i2 = iArr[1];
        iArr[1] = i | (i2 >>> 1);
        i = i2 << 31;
        i2 = iArr[2];
        iArr[2] = i | (i2 >>> 1);
        i = i2 << 31;
        i2 = iArr[3];
        iArr[3] = i | (i2 >>> 1);
        return i2 << 31;
    }

    public static void xor(byte[] bArr, byte[] bArr2) {
        int i = 0;
        do {
            bArr[i] = (byte) (bArr[i] ^ bArr2[i]);
            i++;
            bArr[i] = (byte) (bArr[i] ^ bArr2[i]);
            i++;
            bArr[i] = (byte) (bArr[i] ^ bArr2[i]);
            i++;
            bArr[i] = (byte) (bArr[i] ^ bArr2[i]);
            i++;
        } while (i < 16);
    }

    public static void xor(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
    }

    public static void multiplyP8(int[] iArr) {
        int shiftRightN = shiftRightN(iArr, 8);
        iArr[0] = LOOKUP[shiftRightN >>> 24] ^ iArr[0];
    }

    public static void asBytes(long[] jArr, byte[] bArr) {
        Pack.longToBigEndian(jArr, bArr, 0);
    }

    public static void asBytes(int[] iArr, byte[] bArr) {
        Pack.intToBigEndian(iArr, bArr, 0);
    }

    public static void xor(byte[] bArr, byte[] bArr2, int i, int i2) {
        int i3 = a;
        do {
            i2--;
            if (i2 >= 0) {
                bArr[i2] = (byte) (bArr[i2] ^ bArr2[i + i2]);
            } else {
                return;
            }
        } while (i3 == 0);
    }

    public static long[] oneAsLongs() {
        long[] jArr = new long[2];
        jArr[0] = Long.MIN_VALUE;
        return jArr;
    }

    public static void multiplyP(int[] iArr, int[] iArr2) {
        iArr2[0] = ((shiftRight(iArr, iArr2) >> 8) & E1) ^ iArr2[0];
    }

    public static int[] oneAsInts() {
        int[] iArr = new int[4];
        iArr[0] = Integer.MIN_VALUE;
        return iArr;
    }

    public static void multiplyP8(int[] iArr, int[] iArr2) {
        int shiftRightN = shiftRightN(iArr, 8, iArr2);
        iArr2[0] = LOOKUP[shiftRightN >>> 24] ^ iArr2[0];
    }

    public static void xor(int[] iArr, int[] iArr2, int[] iArr3) {
        iArr3[0] = iArr[0] ^ iArr2[0];
        iArr3[1] = iArr[1] ^ iArr2[1];
        iArr3[2] = iArr[2] ^ iArr2[2];
        iArr3[3] = iArr[3] ^ iArr2[3];
    }

    public static void xor(long[] jArr, long[] jArr2) {
        jArr[0] = jArr[0] ^ jArr2[0];
        jArr[1] = jArr[1] ^ jArr2[1];
    }

    public static void xor(int[] iArr, int[] iArr2) {
        iArr[0] = iArr[0] ^ iArr2[0];
        iArr[1] = iArr[1] ^ iArr2[1];
        iArr[2] = iArr[2] ^ iArr2[2];
        iArr[3] = iArr[3] ^ iArr2[3];
    }

    public static void multiply(long[] jArr, long[] jArr2) {
        int i = a;
        long j = jArr[0];
        long j2 = jArr[1];
        int i2 = 0;
        long j3 = 0;
        long j4 = 0;
        while (i2 < 2) {
            long j5 = j2;
            int i3 = 0;
            long j6 = j;
            j = jArr2[i2];
            while (i3 < 64) {
                long j7 = j >> 63;
                j <<= 1;
                j4 ^= j6 & j7;
                j3 ^= j7 & j5;
                j5 = (j5 >>> 1) | (j6 << 63);
                j6 = (j6 >>> 1) ^ (((j5 << 63) >> 8) & E1L);
                i3++;
                if (i != 0) {
                    break;
                }
            }
            i3 = i2 + 1;
            if (i != 0) {
                break;
            }
            i2 = i3;
            j = j6;
            j2 = j5;
        }
        jArr[0] = j4;
        jArr[1] = j3;
    }

    public static void xor(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int i = 0;
        do {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
            i++;
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
            i++;
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
            i++;
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
            i++;
        } while (i < 16);
    }

    public static void asInts(byte[] bArr, int[] iArr) {
        Pack.bigEndianToInt(bArr, 0, iArr);
    }

    public static void multiply(int[] iArr, int[] iArr2) {
        int i = a;
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i6 < 4) {
            int i11 = i5;
            i5 = i3;
            i3 = 0;
            int i12 = i4;
            i4 = i2;
            i2 = iArr2[i6];
            int i13 = i12;
            while (i3 < 32) {
                int i14 = i2 >> 31;
                i2 <<= 1;
                i10 ^= i4 & i14;
                i9 ^= i5 & i14;
                i8 ^= i13 & i14;
                i7 ^= i14 & i11;
                i11 = (i11 >>> 1) | (i13 << 31);
                i13 = (i13 >>> 1) | (i5 << 31);
                i5 = (i5 >>> 1) | (i4 << 31);
                i4 = (i4 >>> 1) ^ (((i11 << 31) >> 8) & E1);
                i3++;
                if (i != 0) {
                    break;
                }
            }
            i3 = i6 + 1;
            if (i != 0) {
                break;
            }
            i6 = i3;
            i2 = i4;
            i4 = i13;
            i3 = i5;
            i5 = i11;
        }
        iArr[0] = i10;
        iArr[1] = i9;
        iArr[2] = i8;
        iArr[3] = i7;
    }

    public static byte[] asBytes(int[] iArr) {
        byte[] bArr = new byte[16];
        Pack.intToBigEndian(iArr, bArr, 0);
        return bArr;
    }

    public static long[] asLongs(byte[] bArr) {
        long[] jArr = new long[2];
        Pack.bigEndianToLong(bArr, 0, jArr);
        return jArr;
    }

    static long shiftRight(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        jArr2[0] = j >>> 1;
        j <<= 63;
        long j2 = jArr[1];
        jArr2[1] = j | (j2 >>> 1);
        return j2 << 63;
    }
}
