package com.google;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

class hN implements Iterator {
    private hg a;
    private final Stack b;

    public hg b() {
        try {
            if (this.a == null) {
                throw new NoSuchElementException();
            }
            hg hgVar = this.a;
            this.a = a();
            return hgVar;
        } catch (NoSuchElementException e) {
            throw e;
        }
    }

    private hg a(hx hxVar) {
        boolean z = bA.b;
        hx hxVar2 = hxVar;
        while (hxVar2 instanceof id) {
            id idVar = (id) hxVar2;
            this.b.push(idVar);
            hxVar2 = id.a(idVar);
            if (z) {
                break;
            }
        }
        return (hg) hxVar2;
    }

    hN(hx hxVar, eQ eQVar) {
        this(hxVar);
    }

    private hg a() {
        hg a;
        do {
            try {
                if (this.b.isEmpty()) {
                    return null;
                }
                a = a(id.b((id) this.b.pop()));
                try {
                } catch (NoSuchElementException e) {
                    throw e;
                }
            } catch (NoSuchElementException e2) {
                throw e2;
            }
        } while (a.g());
        return a;
    }

    private hN(hx hxVar) {
        this.b = new Stack();
        this.a = a(hxVar);
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

    public Object next() {
        return b();
    }

    public boolean hasNext() {
        try {
            return this.a != null;
        } catch (NoSuchElementException e) {
            throw e;
        }
    }
}
