package com.google;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

abstract class db implements Iterator {
    int a;
    c2 b;
    c2 c;
    final ak d;

    public final boolean hasNext() {
        try {
            return this.b != this.d.j;
        } catch (NoSuchElementException e) {
            throw e;
        }
    }

    public final void remove() {
        try {
            if (this.c == null) {
                throw new IllegalStateException();
            }
            this.d.b(this.c, true);
            this.c = null;
            this.a = this.d.b;
        } catch (NoSuchElementException e) {
            throw e;
        }
    }

    private db(ak akVar) {
        this.d = akVar;
        this.b = this.d.j.f;
        this.c = null;
        this.a = this.d.b;
    }

    db(ak akVar, hu huVar) {
        this(akVar);
    }

    final c2 a() {
        c2 c2Var = this.b;
        try {
            if (c2Var == this.d.j) {
                throw new NoSuchElementException();
            }
            try {
                if (this.d.b != this.a) {
                    throw new ConcurrentModificationException();
                }
                this.b = c2Var.f;
                this.c = c2Var;
                return c2Var;
            } catch (NoSuchElementException e) {
                throw e;
            }
        } catch (NoSuchElementException e2) {
            throw e2;
        }
    }
}
