package com.google;

abstract class dI extends dM {
    dI(d_ d_Var) {
        super(d_Var);
    }

    protected abstract int a(int i);

    protected abstract void c(StringBuilder stringBuilder, int i);

    protected final void b(StringBuilder stringBuilder, int i, int i2) {
        boolean z = dt.c;
        int a = a().a(i, i2);
        c(stringBuilder, a);
        int a2 = a(a);
        int i3 = 100000;
        a = 0;
        while (a < 5) {
            if (a2 / i3 == 0) {
                stringBuilder.append('0');
            }
            i3 /= 10;
            a++;
            if (z) {
                break;
            }
        }
        stringBuilder.append(a2);
    }
}
