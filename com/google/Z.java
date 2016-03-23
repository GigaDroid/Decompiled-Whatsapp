package com.google;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public class Z extends AbstractList implements fs, RandomAccess {
    private final fs a;

    public ListIterator listIterator(int i) {
        return new h3(this, i);
    }

    static fs a(Z z) {
        return z.a;
    }

    public String m102a(int i) {
        return (String) this.a.get(i);
    }

    public List a() {
        return this.a.a();
    }

    public int size() {
        return this.a.size();
    }

    public Iterator iterator() {
        return new fR(this);
    }

    public hx a(int i) {
        return this.a.a(i);
    }

    public Z(fs fsVar) {
        this.a = fsVar;
    }

    public void a(hx hxVar) {
        throw new UnsupportedOperationException();
    }

    public Object get(int i) {
        return a(i);
    }
}
