package com.google;

import java.util.Iterator;
import java.util.Map.Entry;

class g9 implements Iterator {
    private Iterator a;

    public boolean hasNext() {
        return this.a.hasNext();
    }

    public Object next() {
        return a();
    }

    public Entry a() {
        Entry entry = (Entry) this.a.next();
        return entry.getValue() instanceof hY ? new R(entry, null) : entry;
    }

    public void remove() {
        this.a.remove();
    }

    public g9(Iterator it) {
        this.a = it;
    }
}
