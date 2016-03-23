package com.google;

final class df {
    private final int a;
    private final gj b;

    public int hashCode() {
        return (this.b.hashCode() * 65535) + this.a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof df)) {
            return false;
        }
        df dfVar = (df) obj;
        if (this.b == dfVar.b && this.a == dfVar.a) {
            return true;
        }
        return false;
    }

    df(gj gjVar, int i) {
        this.b = gjVar;
        this.a = i;
    }
}
