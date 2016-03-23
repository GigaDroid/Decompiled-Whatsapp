package com.google;

class gP implements d8 {
    private d8 a;
    private final hN b;
    int c;
    final id d;

    public byte a() {
        try {
            if (!this.a.hasNext()) {
                this.a = this.b.b().i();
            }
            this.c--;
            return this.a.a();
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

    public Object next() {
        return a();
    }

    private gP(id idVar) {
        this.d = idVar;
        this.b = new hN(idVar, null);
        this.a = this.b.b().i();
        this.c = idVar.a();
    }

    public boolean hasNext() {
        try {
            return this.c > 0;
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    public Byte m441a() {
        return Byte.valueOf(a());
    }

    gP(id idVar, eQ eQVar) {
        this(idVar);
    }
}
