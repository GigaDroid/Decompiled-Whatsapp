package org.whispersystems.curve25519;

public class o {
    public static void a(H h, Z z, J j) {
        int[] iArr = new int[10];
        i.a(h.a, z.b, z.e);
        f.a(h.c, z.b, z.e);
        I.a(h.b, h.a, j.a);
        I.a(h.c, h.c, j.d);
        I.a(h.d, j.b, z.d);
        i.a(iArr, z.c, z.c);
        f.a(h.a, h.b, h.c);
        i.a(h.c, h.b, h.c);
        f.a(h.b, iArr, h.d);
        i.a(h.d, iArr, h.d);
    }
}
