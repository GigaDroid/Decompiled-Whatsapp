package com.whatsapp.util;

import android.graphics.drawable.Drawable;
import java.io.File;

public class a3 {
    private int a;
    private Drawable b;
    private Drawable c;
    private int d;
    private final File e;
    private long f;

    public a3 a(int i) {
        this.d = i;
        return this;
    }

    public bb a() {
        return new bb(this, null);
    }

    static int f(a3 a3Var) {
        return a3Var.d;
    }

    public a3 a(Drawable drawable) {
        this.b = drawable;
        return this;
    }

    static int a(a3 a3Var) {
        return a3Var.a;
    }

    static long d(a3 a3Var) {
        return a3Var.f;
    }

    public a3 a(long j) {
        this.f = j;
        return this;
    }

    public a3 b(Drawable drawable) {
        this.c = drawable;
        return this;
    }

    public a3(File file) {
        this.f = 1048576;
        this.a = 4;
        this.e = file;
    }

    static File c(a3 a3Var) {
        return a3Var.e;
    }

    static Drawable b(a3 a3Var) {
        return a3Var.b;
    }

    static Drawable e(a3 a3Var) {
        return a3Var.c;
    }
}
