package de.greenrobot.event;

final class k {
    final Object a;
    final int b;
    final g c;
    volatile boolean d;

    k(Object obj, g gVar, int i) {
        this.a = obj;
        this.c = gVar;
        this.b = i;
        this.d = true;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.a == kVar.a && this.c.equals(kVar.c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() + this.c.b.hashCode();
    }
}
