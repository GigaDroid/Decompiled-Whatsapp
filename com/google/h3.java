package com.google;

import java.util.ListIterator;

class h3 implements ListIterator {
    final Z a;
    final int b;
    ListIterator c;

    public void a(String str) {
        throw new UnsupportedOperationException();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

    public void add(Object obj) {
        a((String) obj);
    }

    public void set(Object obj) {
        b((String) obj);
    }

    public String b() {
        return (String) this.c.next();
    }

    public String a() {
        return (String) this.c.previous();
    }

    public Object next() {
        return b();
    }

    h3(Z z, int i) {
        this.a = z;
        this.b = i;
        this.c = Z.a(this.a).listIterator(this.b);
    }

    public boolean hasPrevious() {
        return this.c.hasPrevious();
    }

    public int nextIndex() {
        return this.c.nextIndex();
    }

    public Object previous() {
        return a();
    }

    public void b(String str) {
        throw new UnsupportedOperationException();
    }

    public boolean hasNext() {
        return this.c.hasNext();
    }

    public int previousIndex() {
        return this.c.previousIndex();
    }
}
