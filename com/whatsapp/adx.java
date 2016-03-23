package com.whatsapp;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

final class adx extends LinkedHashMap {
    adx() {
    }

    protected boolean removeEldestEntry(Entry entry) {
        return size() > 100;
    }
}
