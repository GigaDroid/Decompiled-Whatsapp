package com.google;

import java.util.Iterator;

class fR implements Iterator {
    Iterator a;
    final Z b;

    public String a() {
        return (String) this.a.next();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

    public Object next() {
        return a();
    }

    fR(Z z) {
        this.b = z;
        this.a = Z.a(this.b).iterator();
    }

    public boolean hasNext() {
        return this.a.hasNext();
    }
}
