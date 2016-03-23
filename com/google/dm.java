package com.google;

import java.util.AbstractSet;
import java.util.Iterator;

final class dm extends AbstractSet {
    final eI a;

    public int size() {
        return this.a.e;
    }

    public void clear() {
        this.a.clear();
    }

    public boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    public Iterator iterator() {
        return new at(this);
    }

    public boolean remove(Object obj) {
        return this.a.b(obj) != null;
    }

    dm(eI eIVar) {
        this.a = eIVar;
    }
}
