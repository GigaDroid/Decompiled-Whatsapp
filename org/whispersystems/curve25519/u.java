package org.whispersystems.curve25519;

public class u {
    static int[] a;
    static int[] b;

    static int a(Z z, byte[] bArr) {
        int[] iArr = new int[10];
        int[] iArr2 = new int[10];
        int[] iArr3 = new int[10];
        int[] iArr4 = new int[10];
        int[] iArr5 = new int[10];
        v.a(z.b, bArr);
        B.a(z.c);
        j.a(iArr, z.b);
        I.a(iArr2, iArr, a);
        f.a(iArr, iArr, z.c);
        i.a(iArr2, iArr2, z.c);
        j.a(iArr3, iArr2);
        I.a(iArr3, iArr3, iArr2);
        j.a(z.e, iArr3);
        I.a(z.e, z.e, iArr2);
        I.a(z.e, z.e, iArr);
        z.a(z.e, z.e);
        I.a(z.e, z.e, iArr3);
        I.a(z.e, z.e, iArr);
        j.a(iArr4, z.e);
        I.a(iArr4, iArr4, iArr2);
        f.a(iArr5, iArr4, iArr);
        if (k.a(iArr5) != 0) {
            i.a(iArr5, iArr4, iArr);
            if (k.a(iArr5) != 0) {
                return -1;
            }
            I.a(z.e, z.e, b);
        }
        if (l.a(z.e) == ((bArr[31] >>> 7) & 1)) {
            O.a(z.e, z.e);
        }
        I.a(z.d, z.e, z.b);
        return 0;
    }

    static {
        a = new int[]{-10913610, 13857413, -15372611, 6949391, 114729, -8787816, -6275908, -3247719, -18696448, -12055116};
        b = new int[]{-32595792, -7943725, 9377950, 3500415, 12389472, -272473, -25146209, -2005654, 326686, 11406482};
    }
}
