package org.whispersystems.curve25519;

public class g {
    static int a(byte b) {
        return (int) (((long) b) >>> 63);
    }

    static void a(J j, J j2, int i) {
        W.a(j.d, j2.d, i);
        W.a(j.a, j2.a, i);
        W.a(j.b, j2.b, i);
    }

    static int a(byte b, byte b2) {
        return ((b ^ b2) - 1) >>> 31;
    }

    public static void a(Z z, byte[] bArr) {
        int i = J.c;
        byte[] bArr2 = new byte[64];
        H h = new H();
        L l = new L();
        J j = new J();
        int i2 = 0;
        while (i2 < 32) {
            bArr2[(i2 * 2) + 0] = (byte) ((bArr[i2] >>> 0) & 15);
            bArr2[(i2 * 2) + 1] = (byte) ((bArr[i2] >>> 4) & 15);
            i2++;
            if (i != 0) {
                break;
            }
        }
        int i3 = 0;
        i2 = 0;
        while (i3 < 63) {
            bArr2[i3] = (byte) (i2 + bArr2[i3]);
            i2 = (byte) (((byte) (bArr2[i3] + 8)) >> 4);
            bArr2[i3] = (byte) (bArr2[i3] - (i2 << 4));
            i3++;
            if (i != 0) {
                break;
            }
        }
        bArr2[63] = (byte) (i2 + bArr2[63]);
        E.a(z);
        i2 = 1;
        while (i2 < 64) {
            a(j, i2 / 2, bArr2[i2]);
            A.a(h, z, j);
            D.a(z, h);
            i2 += 2;
            if (i != 0) {
                break;
            }
        }
        P.a(h, z);
        q.a(l, h);
        T.a(h, l);
        q.a(l, h);
        T.a(h, l);
        q.a(l, h);
        T.a(h, l);
        D.a(z, h);
        i2 = 0;
        while (i2 < 64) {
            a(j, i2 / 2, bArr2[i2]);
            A.a(h, z, j);
            D.a(z, h);
            i2 += 2;
            if (i != 0) {
                return;
            }
        }
    }

    static void a(J j, int i, byte b) {
        J[][] jArr = i <= 7 ? N.a : i <= 15 ? at.a : i <= 23 ? a.a : m.a;
        J j2 = new J();
        int a = a(b);
        int i2 = b - (((-a) & b) << 1);
        h.a(j);
        a(j, jArr[i][0], a((byte) i2, (byte) 1));
        a(j, jArr[i][1], a((byte) i2, (byte) 2));
        a(j, jArr[i][2], a((byte) i2, (byte) 3));
        a(j, jArr[i][3], a((byte) i2, (byte) 4));
        a(j, jArr[i][4], a((byte) i2, (byte) 5));
        a(j, jArr[i][5], a((byte) i2, (byte) 6));
        a(j, jArr[i][6], a((byte) i2, (byte) 7));
        a(j, jArr[i][7], a((byte) i2, (byte) 8));
        V.a(j2.d, j.a);
        V.a(j2.a, j.d);
        O.a(j2.b, j.b);
        a(j, j2, a);
    }
}
