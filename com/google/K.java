package com.google;

final class K extends B {
    K(i1 i1Var) {
        this();
    }

    private K() {
        super(null);
    }

    boolean a(int i, int i2) {
        return ((((i + i2) & 1) + ((i * i2) % 3)) & 1) == 0;
    }
}
