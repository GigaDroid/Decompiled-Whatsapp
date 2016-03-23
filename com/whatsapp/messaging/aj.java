package com.whatsapp.messaging;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

final class aj extends LinkedHashMap {
    private static final long serialVersionUID = 1;

    public static boolean a(Entry entry) {
        return ((Long) entry.getValue()).longValue() + 86400000 < System.currentTimeMillis();
    }

    public static boolean a(Long l) {
        return l == null || l.longValue() + 86400000 < System.currentTimeMillis();
    }

    private aj() {
    }

    aj(l lVar) {
        this();
    }

    protected boolean removeEldestEntry(Entry entry) {
        return a(entry);
    }
}
