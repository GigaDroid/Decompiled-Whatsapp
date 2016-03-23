package org.whispersystems.curve25519;

public class s {
    public static int a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int i = J.c;
        byte[] bArr4 = new byte[32];
        int[] iArr = new int[10];
        int[] iArr2 = new int[10];
        int[] iArr3 = new int[10];
        int[] iArr4 = new int[10];
        int[] iArr5 = new int[10];
        int[] iArr6 = new int[10];
        int[] iArr7 = new int[10];
        int i2 = 0;
        while (i2 < 32) {
            bArr4[i2] = bArr2[i2];
            i2++;
            if (i != 0) {
                break;
            }
        }
        v.a(iArr, bArr3);
        B.a(iArr2);
        b.a(iArr3);
        V.a(iArr4, iArr);
        B.a(iArr5);
        int i3 = 0;
        int i4 = 254;
        while (i4 >= 0) {
            i2 = (bArr4[i4 / 8] >>> (i4 & 7)) & 1;
            i3 ^= i2;
            G.a(iArr2, iArr4, i3);
            G.a(iArr3, iArr5, i3);
            f.a(iArr6, iArr4, iArr5);
            f.a(iArr7, iArr2, iArr3);
            i.a(iArr2, iArr2, iArr3);
            i.a(iArr3, iArr4, iArr5);
            I.a(iArr5, iArr6, iArr2);
            I.a(iArr3, iArr3, iArr7);
            j.a(iArr6, iArr7);
            j.a(iArr7, iArr2);
            i.a(iArr4, iArr5, iArr3);
            f.a(iArr3, iArr5, iArr3);
            I.a(iArr2, iArr7, iArr6);
            f.a(iArr7, iArr7, iArr6);
            j.a(iArr3, iArr3);
            al.a(iArr5, iArr7);
            j.a(iArr4, iArr4);
            i.a(iArr6, iArr6, iArr5);
            I.a(iArr5, iArr, iArr3);
            I.a(iArr3, iArr7, iArr6);
            i3 = i4 - 1;
            if (i != 0) {
                break;
            }
            i4 = i3;
            i3 = i2;
        }
        i2 = i3;
        G.a(iArr2, iArr4, i2);
        G.a(iArr3, iArr5, i2);
        Y.a(iArr3, iArr3);
        I.a(iArr2, iArr2, iArr3);
        C.a(bArr, iArr2);
        return 0;
    }
}
