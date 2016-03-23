package org.whispersystems.curve25519;

public class l {
    public static int a(int[] iArr) {
        byte[] bArr = new byte[32];
        C.a(bArr, iArr);
        return bArr[0] & 1;
    }
}
