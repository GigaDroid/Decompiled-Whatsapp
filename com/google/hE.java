package com.google;

import java.util.Set;

public final class hE extends hH {
    private final eI b;

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof hE) && ((hE) obj).b.equals(this.b));
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public hE() {
        this.b = new eI();
    }

    public Set a() {
        return this.b.entrySet();
    }
}
