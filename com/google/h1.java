package com.google;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class h1 extends hH implements Iterable {
    private final List b;

    public Iterator iterator() {
        return this.b.iterator();
    }

    public h1() {
        this.b = new ArrayList();
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof h1) && ((h1) obj).b.equals(this.b));
    }
}
