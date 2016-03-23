package com.google;

import java.util.Map;

public final class ay extends aH {
    private final aH i;

    public ay() {
        this.i = new a1();
    }

    private static f6 a(f6 f6Var) {
        String c = f6Var.c();
        if (c.charAt(0) == '0') {
            return new f6(c.substring(1), null, f6Var.e(), gg.UPC_A);
        }
        throw aG.a();
    }

    protected int a(d_ d_Var, int[] iArr, StringBuilder stringBuilder) {
        return this.i.a(d_Var, iArr, stringBuilder);
    }

    gg a() {
        return gg.UPC_A;
    }

    public f6 a(b1 b1Var, Map map) {
        return a(this.i.a(b1Var, map));
    }

    public f6 a(int i, d_ d_Var, int[] iArr, Map map) {
        return a(this.i.a(i, d_Var, iArr, map));
    }

    public f6 a(int i, d_ d_Var, Map map) {
        return a(this.i.a(i, d_Var, map));
    }
}
