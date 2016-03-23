package com.google;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

class eL extends AbstractSet {
    final eI a;

    eL(eI eIVar) {
        this.a = eIVar;
    }

    public boolean remove(Object obj) {
        if (!(obj instanceof Entry)) {
            return false;
        }
        hM a = this.a.a((Entry) obj);
        if (a == null) {
            return false;
        }
        this.a.a(a, true);
        return true;
    }

    public boolean contains(Object obj) {
        return (obj instanceof Entry) && this.a.a((Entry) obj) != null;
    }

    public void clear() {
        this.a.clear();
    }

    public Iterator iterator() {
        return new a8(this);
    }

    public int size() {
        return this.a.e;
    }
}
