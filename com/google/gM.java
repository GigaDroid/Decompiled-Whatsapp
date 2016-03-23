package com.google;

import java.util.AbstractSet;
import java.util.Iterator;

final class gM extends AbstractSet {
    final ak a;

    public Iterator iterator() {
        return new dr(this);
    }

    public void clear() {
        this.a.clear();
    }

    gM(ak akVar) {
        this.a = akVar;
    }

    public boolean remove(Object obj) {
        return this.a.b(obj) != null;
    }

    public int size() {
        return this.a.a;
    }

    public boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }
}
