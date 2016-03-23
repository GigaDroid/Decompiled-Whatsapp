package com.google;

import java.util.NoSuchElementException;

class g6 implements d8 {
    private int a;
    private final int b;
    final hg c;

    private g6(hg hgVar) {
        this.c = hgVar;
        this.a = 0;
        this.b = hgVar.a();
    }

    public boolean hasNext() {
        try {
            return this.a < this.b;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        }
    }

    public Object next() {
        return a();
    }

    public Byte m440a() {
        return Byte.valueOf(a());
    }

    public byte a() {
        try {
            byte[] bArr = this.c.d;
            int i = this.a;
            this.a = i + 1;
            return bArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    g6(hg hgVar, fq fqVar) {
        this(hgVar);
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
