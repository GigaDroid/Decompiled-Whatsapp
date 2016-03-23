package com.google;

final class hT {
    private final int a;
    private final fn b;

    hT(fn fnVar, int i) {
        this.b = fnVar;
        this.a = i;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof hT)) {
            return false;
        }
        hT hTVar = (hT) obj;
        if (this.b == hTVar.b && this.a == hTVar.a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.b.hashCode() * 65535) + this.a;
    }
}
