package com.google;

abstract class B {
    private static final B[] a;

    abstract boolean a(int i, int i2);

    static {
        a = new B[]{new D(null), new E(null), new F(null), new G(null), new H(null), new I(null), new J(null), new K(null)};
    }

    final void a(hX hXVar, int i) {
        boolean z = fQ.b;
        int i2 = 0;
        while (i2 < i) {
            int i3 = 0;
            while (i3 < i) {
                try {
                    if (a(i2, i3)) {
                        hXVar.b(i3, i2);
                    }
                    i3++;
                    if (z) {
                        break;
                    }
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            i3 = i2 + 1;
            if (!z) {
                i2 = i3;
            } else {
                return;
            }
        }
    }

    private B() {
    }

    static B a(int i) {
        if (i >= 0 && i <= 7) {
            return a[i];
        }
        try {
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    B(i1 i1Var) {
        this();
    }
}
