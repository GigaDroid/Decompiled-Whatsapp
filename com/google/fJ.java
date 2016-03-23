package com.google;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

final class fJ extends AbstractSet {
    final ak a;

    public boolean remove(Object obj) {
        if (!(obj instanceof Entry)) {
            return false;
        }
        c2 a = this.a.a((Entry) obj);
        if (a == null) {
            return false;
        }
        this.a.b(a, true);
        return true;
    }

    fJ(ak akVar) {
        this.a = akVar;
    }

    public void clear() {
        this.a.clear();
    }

    public int size() {
        return this.a.a;
    }

    public boolean contains(Object obj) {
        return (obj instanceof Entry) && this.a.a((Entry) obj) != null;
    }

    public Iterator iterator() {
        return new dL(this);
    }
}
