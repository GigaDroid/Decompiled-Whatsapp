package org.whispersystems.curve25519;

public class D {
    public static void a(Z z, H h) {
        I.a(z.e, h.a, h.d);
        I.a(z.b, h.c, h.b);
        I.a(z.c, h.b, h.d);
        I.a(z.d, h.a, h.c);
    }
}
