package com.whatsapp.util;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class bf extends LinkedHashMap {
    private static final float a = 0.75f;
    private int b;

    protected boolean removeEldestEntry(Entry entry) {
        return size() > this.b;
    }

    public bf(int i) {
        super(((int) Math.ceil((double) (((float) i) / a))) + 1, a, true);
        this.b = i;
    }
}
