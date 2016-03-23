package com.google;

final class hv {
    private final int a;
    private final Object b;

    public int hashCode() {
        return (System.identityHashCode(this.b) * 65535) + this.a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof hv)) {
            return false;
        }
        hv hvVar = (hv) obj;
        if (this.b == hvVar.b && this.a == hvVar.a) {
            return true;
        }
        return false;
    }

    hv(Object obj, int i) {
        this.b = obj;
        this.a = i;
    }
}
