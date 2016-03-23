package com.google;

public final class f7 {
    static final int a;
    static final int b;
    static final int c;
    static final int d;

    public static int a(int i) {
        return i >>> 3;
    }

    static {
        d = a(1, 3);
        b = a(1, 4);
        c = a(2, 0);
        a = a(3, 2);
    }

    static int a(int i, int i2) {
        return (i << 3) | i2;
    }

    static int b(int i) {
        return i & 7;
    }
}
