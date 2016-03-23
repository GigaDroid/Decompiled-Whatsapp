package com.whatsapp;

public final class aas extends aax {
    public aas(l5 l5Var) {
        super(l5Var);
    }

    protected boolean b(l5 l5Var) {
        l5Var.a = this.a.a;
        boolean z = (this.a.c > 0 && l5Var.c != this.a.c) || ((this.a.o > 0 && l5Var.o != this.a.o) || ((this.a.c < 0 && l5Var.c >= 0) || (this.a.o < 0 && l5Var.o >= 0)));
        l5Var.c = this.a.c;
        l5Var.o = this.a.o;
        l5Var.x = this.a.x;
        return z;
    }
}
