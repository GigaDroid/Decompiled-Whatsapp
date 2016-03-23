package org.whispersystems.curve25519;

public class U {
    public static int a(byte[] bArr, byte[] bArr2) {
        int i = 0;
        int i2 = J.c;
        int i3 = 0;
        while (i3 < 32) {
            i |= bArr[i3] ^ bArr2[i3];
            i3++;
            if (i2 != 0) {
                break;
            }
        }
        return i;
    }
}
