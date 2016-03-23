package com.google;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

class g5 extends AbstractSet {
    final h4 a;

    public boolean add(Object obj) {
        return a((Entry) obj);
    }

    public Iterator iterator() {
        return new cz(this.a, null);
    }

    public boolean contains(Object obj) {
        Entry entry = (Entry) obj;
        Object obj2 = this.a.get(entry.getKey());
        Object value = entry.getValue();
        return obj2 == value || (obj2 != null && obj2.equals(value));
    }

    g5(h4 h4Var, hm hmVar) {
        this(h4Var);
    }

    public boolean remove(Object obj) {
        Entry entry = (Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.a.remove(entry.getKey());
        return true;
    }

    public void clear() {
        this.a.clear();
    }

    public int size() {
        return this.a.size();
    }

    private g5(h4 h4Var) {
        this.a = h4Var;
    }

    public boolean a(Entry entry) {
        if (contains(entry)) {
            return false;
        }
        this.a.a((Comparable) entry.getKey(), entry.getValue());
        return true;
    }
}
