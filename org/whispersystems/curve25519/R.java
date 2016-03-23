package org.whispersystems.curve25519;

public class R {
    public static int a(M m, byte[] bArr, byte[] bArr2, byte[] bArr3, int i, byte[] bArr4) {
        Z z = new Z();
        byte[] bArr5 = new byte[32];
        Object obj = new byte[(i + 128)];
        g.a(z, bArr2);
        n.a(bArr5, z);
        byte b = (byte) (bArr5[31] & 128);
        aM.a(m, obj, bArr3, (long) i, bArr2, bArr5, bArr4);
        System.arraycopy(obj, 0, bArr, 0, 64);
        bArr[63] = (byte) (bArr[63] & 127);
        bArr[63] = (byte) (b | bArr[63]);
        return 0;
    }

    public static void a(byte[] bArr, byte[] bArr2) {
        Z z = new Z();
        int[] iArr = new int[10];
        iArr = new int[10];
        int[] iArr2 = new int[10];
        int[] iArr3 = new int[10];
        int[] iArr4 = new int[10];
        g.a(z, bArr2);
        i.a(iArr, z.b, z.c);
        f.a(iArr2, z.c, z.b);
        Y.a(iArr3, iArr2);
        I.a(iArr4, iArr, iArr3);
        C.a(bArr, iArr4);
    }

    public static int a(M m, byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        int[] iArr = new int[10];
        int[] iArr2 = new int[10];
        int[] iArr3 = new int[10];
        int[] iArr4 = new int[10];
        int[] iArr5 = new int[10];
        int[] iArr6 = new int[10];
        byte[] bArr4 = new byte[32];
        Object obj = new byte[(i + 64)];
        byte[] bArr5 = new byte[(i + 64)];
        v.a(iArr, bArr2);
        B.a(iArr5);
        f.a(iArr2, iArr, iArr5);
        i.a(iArr3, iArr, iArr5);
        Y.a(iArr4, iArr3);
        I.a(iArr6, iArr2, iArr4);
        C.a(bArr4, iArr6);
        bArr4[31] = (byte) (bArr4[31] & 127);
        bArr4[31] = (byte) (bArr4[31] | (bArr[63] & 128));
        System.arraycopy(bArr, 0, obj, 0, 64);
        obj[63] = (byte) (obj[63] & 127);
        System.arraycopy(bArr3, 0, obj, 64, i);
        return aY.a(m, bArr5, 0, obj, (long) (i + 64), bArr4);
    }
}
