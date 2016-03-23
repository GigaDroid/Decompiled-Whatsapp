package com.google;

final class g2 {
    private final dX[] a;
    private final int b;

    g2(int i, dX dXVar, dX dXVar2, fe feVar) {
        this(i, dXVar, dXVar2);
    }

    private g2(int i, dX dXVar, dX dXVar2) {
        this.b = i;
        this.a = new dX[]{dXVar, dXVar2};
    }

    g2(int i, dX dXVar, fe feVar) {
        this(i, dXVar);
    }

    dX[] b() {
        return this.a;
    }

    private g2(int i, dX dXVar) {
        this.b = i;
        this.a = new dX[]{dXVar};
    }

    int a() {
        return this.b;
    }
}
