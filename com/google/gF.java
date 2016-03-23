package com.google;

import java.io.Serializable;
import java.util.Comparator;

final class gF implements Comparator, Serializable {
    private gF() {
    }

    public int compare(Object obj, Object obj2) {
        return a((j) obj, (j) obj2);
    }

    gF(cP cPVar) {
        this();
    }

    public int a(j jVar, j jVar2) {
        return jVar.b() - jVar2.b();
    }
}
