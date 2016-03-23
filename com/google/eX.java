package com.google;

import java.io.Serializable;
import java.util.Comparator;

final class eX implements Comparator, Serializable {
    private final float a;

    eX(float f, b4 b4Var) {
        this(f);
    }

    public int a(fV fVVar, fV fVVar2) {
        if (fVVar2.a() != fVVar.a()) {
            return fVVar2.a() - fVVar.a();
        }
        float abs = Math.abs(fVVar2.c() - this.a);
        float abs2 = Math.abs(fVVar.c() - this.a);
        if (abs < abs2) {
            return 1;
        }
        return abs == abs2 ? 0 : -1;
    }

    public int compare(Object obj, Object obj2) {
        return a((fV) obj, (fV) obj2);
    }

    private eX(float f) {
        this.a = f;
    }
}
