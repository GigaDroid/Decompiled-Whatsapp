package com.google;

final class dO {
    private final int a;
    private final int b;

    int a() {
        return this.b;
    }

    int b() {
        return this.a;
    }

    public String toString() {
        int i = gl.f;
        String str = "<" + this.b + ' ' + this.a + '>';
        if (aK.a) {
            gl.f = i + 1;
        }
        return str;
    }

    dO(int i, int i2) {
        this.b = i;
        this.a = i2;
    }

    fI c() {
        return new fI((float) a(), (float) b());
    }
}
