package org.whispersystems.curve25519;

public class aM {
    static int a(M m, byte[] bArr, byte[] bArr2, long j, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        int i = J.c;
        byte[] bArr6 = new byte[64];
        byte[] bArr7 = new byte[64];
        Z z = new Z();
        System.arraycopy(bArr2, 0, bArr, 64, (int) j);
        System.arraycopy(bArr3, 0, bArr, 32, 32);
        bArr[0] = (byte) -2;
        int i2 = 1;
        while (i2 < 32) {
            bArr[i2] = (byte) -1;
            i2++;
            if (i != 0) {
                break;
            }
        }
        System.arraycopy(bArr5, 0, bArr, (int) (64 + j), 64);
        m.a(bArr6, bArr, 128 + j);
        System.arraycopy(bArr4, 0, bArr, 32, 32);
        aU.a(bArr6);
        g.a(z, bArr6);
        n.a(bArr, z);
        m.a(bArr7, bArr, 64 + j);
        aU.a(bArr7);
        Object obj = new byte[32];
        x.a(obj, bArr7, bArr3, bArr6);
        System.arraycopy(obj, 0, bArr, 32, 32);
        return 0;
    }
}
