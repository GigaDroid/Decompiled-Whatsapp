package com.google;

import java.util.Comparator;

final class ex implements Comparator {
    public int compare(Object obj, Object obj2) {
        return a((Comparable) obj, (Comparable) obj2);
    }

    ex() {
    }

    public int a(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }
}
