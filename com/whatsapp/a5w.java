package com.whatsapp;

import com.whatsapp.protocol.co;

public class a5w {
    private co a;
    private int b;
    private long c;
    private int d;
    private long e;
    private int f;
    private double g;
    private boolean h;
    private long i;
    private long j;
    private long k;
    private long l;

    static int g(a5w com_whatsapp_a5w) {
        return com_whatsapp_a5w.f;
    }

    static boolean a(a5w com_whatsapp_a5w, boolean z) {
        com_whatsapp_a5w.h = z;
        return z;
    }

    static long e(a5w com_whatsapp_a5w, long j) {
        com_whatsapp_a5w.j = j;
        return j;
    }

    static long c(a5w com_whatsapp_a5w, long j) {
        com_whatsapp_a5w.l = j;
        return j;
    }

    static int d(a5w com_whatsapp_a5w) {
        return com_whatsapp_a5w.d;
    }

    public a5w() {
        this.l = 1;
        this.e = 1;
        this.j = 1;
    }

    static co a(a5w com_whatsapp_a5w, co coVar) {
        com_whatsapp_a5w.a = coVar;
        return coVar;
    }

    static double b(a5w com_whatsapp_a5w) {
        return com_whatsapp_a5w.g;
    }

    static long a(a5w com_whatsapp_a5w, long j) {
        com_whatsapp_a5w.c = j;
        return j;
    }

    static long j(a5w com_whatsapp_a5w) {
        return com_whatsapp_a5w.j;
    }

    static long l(a5w com_whatsapp_a5w) {
        return com_whatsapp_a5w.i;
    }

    static long b(a5w com_whatsapp_a5w, long j) {
        com_whatsapp_a5w.e = j;
        return j;
    }

    static co c(a5w com_whatsapp_a5w) {
        return com_whatsapp_a5w.a;
    }

    static int f(a5w com_whatsapp_a5w) {
        return com_whatsapp_a5w.b;
    }

    static int b(a5w com_whatsapp_a5w, int i) {
        com_whatsapp_a5w.b = i;
        return i;
    }

    static boolean i(a5w com_whatsapp_a5w) {
        return com_whatsapp_a5w.h;
    }

    static long f(a5w com_whatsapp_a5w, long j) {
        com_whatsapp_a5w.i = j;
        return j;
    }

    static long a(a5w com_whatsapp_a5w) {
        return com_whatsapp_a5w.k;
    }

    static int c(a5w com_whatsapp_a5w, int i) {
        com_whatsapp_a5w.f = i;
        return i;
    }

    static boolean a(a5w com_whatsapp_a5w, double d) {
        return com_whatsapp_a5w.a(d);
    }

    static long k(a5w com_whatsapp_a5w) {
        return com_whatsapp_a5w.e;
    }

    static int a(a5w com_whatsapp_a5w, int i) {
        com_whatsapp_a5w.d = i;
        return i;
    }

    static long d(a5w com_whatsapp_a5w, long j) {
        com_whatsapp_a5w.k = j;
        return j;
    }

    static long e(a5w com_whatsapp_a5w) {
        return com_whatsapp_a5w.c;
    }

    static double b(a5w com_whatsapp_a5w, double d) {
        com_whatsapp_a5w.g = d;
        return d;
    }

    static long h(a5w com_whatsapp_a5w) {
        return com_whatsapp_a5w.l;
    }

    private boolean a(double d) {
        boolean z = false;
        if (d == 0.0d) {
            return false;
        }
        boolean z2 = this.g > 0.0d;
        if (d > 0.0d) {
            z = true;
        }
        if (z2 != z) {
            this.g *= 0.9d;
        }
        this.g += d;
        return true;
    }
}
