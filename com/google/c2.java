package com.google;

import java.util.Map.Entry;

final class c2 implements Entry {
    c2 a;
    c2 b;
    c2 c;
    final int d;
    Object e;
    c2 f;
    final Object g;
    c2 h;
    int i;

    public Object getValue() {
        return this.e;
    }

    public Object getKey() {
        return this.g;
    }

    public String toString() {
        return this.g + "=" + this.e;
    }

    c2(c2 c2Var, Object obj, int i, c2 c2Var2, c2 c2Var3) {
        this.b = c2Var;
        this.g = obj;
        this.d = i;
        this.i = 1;
        this.f = c2Var2;
        this.c = c2Var3;
        c2Var3.f = this;
        c2Var2.c = this;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = this.g == null ? 0 : this.g.hashCode();
        if (this.e != null) {
            i = this.e.hashCode();
        }
        return hashCode ^ i;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) obj;
        if (this.g == null) {
            if (entry.getKey() != null) {
                return false;
            }
        } else if (!this.g.equals(entry.getKey())) {
            return false;
        }
        if (this.e == null) {
            if (entry.getValue() != null) {
                return false;
            }
        } else if (!this.e.equals(entry.getValue())) {
            return false;
        }
        return true;
    }

    public c2 a() {
        boolean z = ak.i;
        c2 c2Var = this.a;
        c2 c2Var2 = this;
        while (c2Var != null) {
            c2Var2 = c2Var.a;
            if (z) {
                return c2Var;
            }
            c2 c2Var3 = c2Var2;
            c2Var2 = c2Var;
            c2Var = c2Var3;
        }
        return c2Var2;
    }

    public c2 b() {
        boolean z = ak.i;
        c2 c2Var = this.h;
        c2 c2Var2 = this;
        while (c2Var != null) {
            c2Var2 = c2Var.h;
            if (z) {
                return c2Var;
            }
            c2 c2Var3 = c2Var2;
            c2Var2 = c2Var;
            c2Var = c2Var3;
        }
        return c2Var2;
    }

    public Object setValue(Object obj) {
        Object obj2 = this.e;
        this.e = obj;
        return obj2;
    }

    c2() {
        this.g = null;
        this.d = -1;
        this.c = this;
        this.f = this;
    }
}
