package org.whispersystems.curve25519;

public class t {
    public static void a(byte[] bArr, L l) {
        int[] iArr = new int[10];
        int[] iArr2 = new int[10];
        int[] iArr3 = new int[10];
        Y.a(iArr, l.a);
        I.a(iArr2, l.c, iArr);
        I.a(iArr3, l.b, iArr);
        C.a(bArr, iArr3);
        bArr[31] = (byte) ((l.a(iArr2) << 7) ^ bArr[31]);
    }
}
