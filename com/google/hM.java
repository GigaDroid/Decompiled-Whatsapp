package com.google;

import java.util.Map.Entry;

final class hM implements Entry {
    hM a;
    hM b;
    hM c;
    hM d;
    final Object e;
    int f;
    hM g;
    Object h;

    public Object setValue(Object obj) {
        Object obj2 = this.h;
        this.h = obj;
        return obj2;
    }

    public Object getKey() {
        return this.e;
    }

    hM() {
        this.e = null;
        this.g = this;
        this.c = this;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) obj;
        if (this.e == null) {
            if (entry.getKey() != null) {
                return false;
            }
        } else if (!this.e.equals(entry.getKey())) {
            return false;
        }
        if (this.h == null) {
            if (entry.getValue() != null) {
                return false;
            }
        } else if (!this.h.equals(entry.getValue())) {
            return false;
        }
        return true;
    }

    public hM b() {
        boolean z = ak.i;
        hM hMVar = this.d;
        hM hMVar2 = this;
        while (hMVar != null) {
            hMVar2 = hMVar.d;
            if (z) {
                return hMVar;
            }
            hM hMVar3 = hMVar2;
            hMVar2 = hMVar;
            hMVar = hMVar3;
        }
        return hMVar2;
    }

    hM(hM hMVar, Object obj, hM hMVar2, hM hMVar3) {
        this.a = hMVar;
        this.e = obj;
        this.f = 1;
        this.c = hMVar2;
        this.g = hMVar3;
        hMVar3.c = this;
        hMVar2.g = this;
    }

    public String toString() {
        return this.e + "=" + this.h;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = this.e == null ? 0 : this.e.hashCode();
        if (this.h != null) {
            i = this.h.hashCode();
        }
        return hashCode ^ i;
    }

    public Object getValue() {
        return this.h;
    }

    public hM a() {
        boolean z = ak.i;
        hM hMVar = this.b;
        hM hMVar2 = this;
        while (hMVar != null) {
            hMVar2 = hMVar.b;
            if (z) {
                return hMVar;
            }
            hM hMVar3 = hMVar2;
            hMVar2 = hMVar;
            hMVar = hMVar3;
        }
        return hMVar2;
    }
}
