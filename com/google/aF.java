package com.google;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

abstract class aF implements Iterator {
    int a;
    hM b;
    hM c;
    final eI d;

    private aF(eI eIVar) {
        this.d = eIVar;
        this.c = this.d.b.c;
        this.b = null;
        this.a = this.d.f;
    }

    aF(eI eIVar, ex exVar) {
        this(eIVar);
    }

    public final boolean hasNext() {
        try {
            return this.c != this.d.b;
        } catch (NoSuchElementException e) {
            throw e;
        }
    }

    final hM a() {
        hM hMVar = this.c;
        try {
            if (hMVar == this.d.b) {
                throw new NoSuchElementException();
            }
            try {
                if (this.d.f != this.a) {
                    throw new ConcurrentModificationException();
                }
                this.c = hMVar.c;
                this.b = hMVar;
                return hMVar;
            } catch (NoSuchElementException e) {
                throw e;
            }
        } catch (NoSuchElementException e2) {
            throw e2;
        }
    }

    public final void remove() {
        try {
            if (this.b == null) {
                throw new IllegalStateException();
            }
            this.d.a(this.b, true);
            this.b = null;
            this.a = this.d.f;
        } catch (NoSuchElementException e) {
            throw e;
        }
    }
}
