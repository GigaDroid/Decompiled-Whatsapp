package org.whispersystems.curve25519;

public class n {
    public static void a(byte[] bArr, Z z) {
        int[] iArr = new int[10];
        int[] iArr2 = new int[10];
        int[] iArr3 = new int[10];
        Y.a(iArr, z.c);
        I.a(iArr2, z.e, iArr);
        I.a(iArr3, z.b, iArr);
        C.a(bArr, iArr3);
        bArr[31] = (byte) ((l.a(iArr2) << 7) ^ bArr[31]);
    }
}
