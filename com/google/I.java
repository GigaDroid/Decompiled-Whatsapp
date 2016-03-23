package com.google;

final class I extends B {
    boolean a(int i, int i2) {
        int i3 = i * i2;
        return (i3 % 3) + (i3 & 1) == 0;
    }

    private I() {
        super(null);
    }

    I(i1 i1Var) {
        this();
    }
}
