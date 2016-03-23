package com.google;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

class h2 extends LinkedHashMap {
    final fw a;

    protected boolean removeEldestEntry(Entry entry) {
        return size() > fw.a(this.a);
    }

    h2(fw fwVar, int i, float f, boolean z) {
        this.a = fwVar;
        super(i, f, z);
    }
}
