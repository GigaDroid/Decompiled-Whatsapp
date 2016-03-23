package com.google;

import java.util.Map.Entry;

class hb implements Entry, Comparable {
    private Object a;
    final h4 b;
    private final Comparable c;

    public String toString() {
        return this.c + "=" + this.a;
    }

    public Object setValue(Object obj) {
        h4.c(this.b);
        Object obj2 = this.a;
        this.a = obj;
        return obj2;
    }

    public Object getKey() {
        return a();
    }

    public Comparable a() {
        return this.c;
    }

    public int compareTo(Object obj) {
        return a((hb) obj);
    }

    public int a(hb hbVar) {
        return a().compareTo(hbVar.a());
    }

    public int hashCode() {
        int i = 0;
        int hashCode = this.c == null ? 0 : this.c.hashCode();
        if (this.a != null) {
            i = this.a.hashCode();
        }
        return hashCode ^ i;
    }

    hb(h4 h4Var, Entry entry) {
        this(h4Var, (Comparable) entry.getKey(), entry.getValue());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) obj;
        if (a(this.c, entry.getKey()) && a(this.a, entry.getValue())) {
            return true;
        }
        return false;
    }

    private boolean a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        } else {
            return obj.equals(obj2);
        }
    }

    public Object getValue() {
        return this.a;
    }

    hb(h4 h4Var, Comparable comparable, Object obj) {
        this.b = h4Var;
        this.c = comparable;
        this.a = obj;
    }
}
