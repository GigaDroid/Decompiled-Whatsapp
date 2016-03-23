package com.google;

class a_ {
    private c2 a;

    a_() {
    }

    public c2 a() {
        boolean z = ak.i;
        c2 c2Var = this.a;
        if (c2Var == null) {
            return null;
        }
        c2 c2Var2 = c2Var.b;
        c2Var.b = null;
        c2 c2Var3 = c2Var.a;
        while (c2Var3 != null) {
            c2Var3.b = c2Var2;
            c2Var2 = c2Var3.h;
            if (z) {
                break;
            }
            c2 c2Var4 = c2Var2;
            c2Var2 = c2Var3;
            c2Var3 = c2Var4;
        }
        c2Var3 = c2Var2;
        this.a = c2Var3;
        return c2Var;
    }

    void a(c2 c2Var) {
        boolean z = ak.i;
        c2 c2Var2 = null;
        c2 c2Var3 = c2Var;
        while (c2Var3 != null) {
            c2Var3.b = c2Var2;
            c2Var = c2Var3.h;
            if (z) {
                break;
            }
            c2Var2 = c2Var3;
            c2Var3 = c2Var;
        }
        c2Var3 = c2Var2;
        this.a = c2Var3;
    }
}
