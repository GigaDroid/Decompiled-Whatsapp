package com.google;

import java.io.Serializable;
import java.util.Comparator;

final class dy implements Comparator, Serializable {
    dy(e6 e6Var) {
        this();
    }

    private dy() {
    }

    public int compare(Object obj, Object obj2) {
        return a((fV) obj, (fV) obj2);
    }

    public int a(fV fVVar, fV fVVar2) {
        boolean z = false;
        boolean z2 = aN.b;
        float c = fVVar2.c() - fVVar.c();
        int i = ((double) c) < 0.0d ? -1 : ((double) c) > 0.0d ? 1 : 0;
        if (z2) {
            if (!aK.a) {
                z = true;
            }
            aK.a = z;
        }
        return i;
    }
}
