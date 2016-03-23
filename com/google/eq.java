package com.google;

import java.util.AbstractList;
import java.util.List;

class eq extends AbstractList implements List {
    fv a;

    public int size() {
        return this.a.d();
    }

    void a() {
        this.modCount++;
    }

    public Object get(int i) {
        return a(i);
    }

    public bL a(int i) {
        return this.a.c(i);
    }
}
