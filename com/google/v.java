package com.google;

final class v {
    private static final int[] b;
    private final gv a;
    private final o c;

    static {
        b = new int[]{1, 1, 2};
    }

    v() {
        this.c = new o();
        this.a = new gv();
    }

    f6 a(int i, d_ d_Var, int i2) {
        int[] a = aH.a(d_Var, i2, false, b);
        try {
            return this.a.a(i, d_Var, a);
        } catch (aK e) {
            return this.c.a(i, d_Var, a);
        }
    }
}
