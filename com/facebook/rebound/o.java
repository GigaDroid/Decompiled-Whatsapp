package com.facebook.rebound;

public class o {
    public static o b;
    public double a;
    public double c;

    static {
        b = a(40.0d, 7.0d);
    }

    public o(double d, double d2) {
        this.a = d;
        this.c = d2;
    }

    public static o a(double d, double d2) {
        return new o(b.a(d), b.c(d2));
    }
}
