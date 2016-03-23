package org.whispersystems.curve25519;

public class aY {
    public static int a(M m, byte[] bArr, long j, byte[] bArr2, long j2, byte[] bArr3) {
        Object obj = new byte[32];
        Object obj2 = new byte[32];
        Object obj3 = new byte[32];
        byte[] bArr4 = new byte[64];
        byte[] bArr5 = new byte[32];
        Z z = new Z();
        L l = new L();
        if (j2 < 64) {
            return -1;
        }
        if ((bArr2[63] & 224) != 0) {
            return -1;
        }
        if (u.a(z, bArr3) != 0) {
            return -1;
        }
        m.a(new byte[64], bArr3, 32);
        System.arraycopy(bArr3, 0, obj, 0, 32);
        System.arraycopy(bArr2, 0, obj2, 0, 32);
        System.arraycopy(bArr2, 32, obj3, 0, 32);
        System.arraycopy(bArr2, 0, bArr, 0, (int) j2);
        System.arraycopy(obj, 0, bArr, 32, 32);
        m.a(bArr4, bArr, j2);
        aU.a(bArr4);
        aj.a(l, bArr4, z, obj3);
        t.a(bArr5, l);
        if (U.a(bArr5, obj2) != 0) {
            return -1;
        }
        System.arraycopy(bArr, 64, bArr, 0, (int) (j2 - 64));
        return 0;
    }
}
