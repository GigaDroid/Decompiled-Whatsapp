package com.google;

final class bH extends bq {
    private final int b;
    private final int c;

    boolean a() {
        return this.b == 10;
    }

    bH(int i, int i2, int i3) {
        super(i);
        if (i2 < 0 || i2 > 10 || i3 < 0 || i3 > 10) {
            throw aG.a();
        }
        this.b = i2;
        this.c = i3;
    }

    int c() {
        return this.b;
    }

    int b() {
        return this.c;
    }

    boolean d() {
        return this.c == 10;
    }
}
