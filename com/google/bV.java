package com.google;

import java.io.Serializable;
import java.util.Comparator;

final class bV implements Comparator, Serializable {
    private final float a;

    public int a(fV fVVar, fV fVVar2) {
        float abs = Math.abs(fVVar2.c() - this.a);
        float abs2 = Math.abs(fVVar.c() - this.a);
        if (abs < abs2) {
            return -1;
        }
        return abs == abs2 ? 0 : 1;
    }

    private bV(float f) {
        this.a = f;
    }

    public int compare(Object obj, Object obj2) {
        return a((fV) obj, (fV) obj2);
    }

    bV(float f, b4 b4Var) {
        this(f);
    }
}
