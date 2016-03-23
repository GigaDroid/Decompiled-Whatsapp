package com.google;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class hS implements Iterator {
    public void remove() {
        throw new UnsupportedOperationException();
    }

    public Object next() {
        throw new NoSuchElementException();
    }

    hS() {
    }

    public boolean hasNext() {
        return false;
    }
}
