package org.whispersystems;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.text.ParseException;
import org.v;

public class aw {
    public static boolean a;
    private static final String z;

    static {
        char[] toCharArray = "Q\u0019}J68\u0003bPbk\u001alS.\"W".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 24;
                    break;
                case at.g /*1*/:
                    i2 = 119;
                    break;
                case at.i /*2*/:
                    i2 = 13;
                    break;
                case at.o /*3*/:
                    i2 = 63;
                    break;
                default:
                    i2 = 66;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public static byte[][] a(byte[] bArr, int i, int i2, int i3) {
        boolean z = true;
        boolean z2 = a;
        if (bArr == null || i < 0 || i2 < 0 || i3 < 0 || bArr.length < (i + i2) + i3) {
            throw new ParseException(z + (bArr == null ? null : am.a(bArr)), 0);
        }
        r3 = new byte[3][];
        System.arraycopy(bArr, 0, r3[0], 0, i);
        r3[1] = new byte[i2];
        System.arraycopy(bArr, i, r3[1], 0, i2);
        r3[2] = new byte[i3];
        System.arraycopy(bArr, i + i2, r3[2], 0, i3);
        if (a5.o) {
            if (z2) {
                z = false;
            }
            a = z;
        }
        return r3;
    }

    public static byte[] d(byte[] bArr, int i) {
        Object obj = new byte[i];
        System.arraycopy(bArr, 0, obj, 0, obj.length);
        return obj;
    }

    public static int a(byte b) {
        return (b & 255) >> 4;
    }

    public static int b(byte[] bArr, int i) {
        return ((((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16)) | ((bArr[i + 2] & 255) << 8)) | (bArr[i + 3] & 255);
    }

    public static int b(byte[] bArr, int i, int i2) {
        bArr[i + 1] = (byte) i2;
        bArr[i] = (byte) (i2 >> 8);
        return 2;
    }

    public static byte[] c(int i) {
        byte[] bArr = new byte[4];
        d(bArr, 0, i);
        return bArr;
    }

    public static byte[] a(byte[][] bArr) {
        boolean z = a;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int length = bArr.length;
            int i = 0;
            while (i < length) {
                byteArrayOutputStream.write(bArr[i]);
                i++;
                if (z) {
                    break;
                }
            }
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public static byte a(int i, int i2) {
        return (byte) (((i << 4) | i2) & 255);
    }

    public static int a(byte[] bArr, int i, int i2) {
        bArr[i + 2] = (byte) i2;
        bArr[i + 1] = (byte) (i2 >> 8);
        bArr[i] = (byte) (i2 >> 16);
        return 3;
    }

    public static int a(byte[] bArr, int i) {
        return (((bArr[i] & 255) << 16) | ((bArr[i + 1] & 255) << 8)) | (bArr[i + 2] & 255);
    }

    public static byte[][] c(byte[] bArr, int i, int i2) {
        byte[][] bArr2 = new byte[2][];
        bArr2[0] = new byte[i];
        System.arraycopy(bArr, 0, bArr2[0], 0, i);
        bArr2[1] = new byte[i2];
        System.arraycopy(bArr, i, bArr2[1], 0, i2);
        return bArr2;
    }

    public static int a(byte[] bArr, int i, long j) {
        boolean z = a;
        bArr[i + 7] = (byte) ((int) j);
        bArr[i + 6] = (byte) ((int) (j >> 8));
        bArr[i + 5] = (byte) ((int) (j >> 16));
        bArr[i + 4] = (byte) ((int) (j >> 24));
        bArr[i + 3] = (byte) ((int) (j >> 32));
        bArr[i + 2] = (byte) ((int) (j >> 40));
        bArr[i + 1] = (byte) ((int) (j >> 48));
        bArr[i] = (byte) ((int) (j >> 56));
        if (z) {
            a5.o = !a5.o;
        }
        return 8;
    }

    public static byte[] a(int i) {
        byte[] bArr = new byte[2];
        b(bArr, 0, i);
        return bArr;
    }

    public static int d(byte[] bArr, int i, int i2) {
        bArr[i + 3] = (byte) i2;
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i] = (byte) (i2 >> 24);
        return 4;
    }

    public static int a(byte[] bArr) {
        return b(bArr, 0);
    }

    public static long c(byte[] bArr, int i) {
        return (((((((long) bArr[i]) & 255) << 32) | ((((long) bArr[i + 1]) & 255) << 24)) | ((((long) bArr[i + 2]) & 255) << 16)) | ((((long) bArr[i + 3]) & 255) << 8)) | (((long) bArr[i + 4]) & 255);
    }

    public static byte[] b(int i) {
        byte[] bArr = new byte[3];
        a(bArr, 0, i);
        return bArr;
    }
}
