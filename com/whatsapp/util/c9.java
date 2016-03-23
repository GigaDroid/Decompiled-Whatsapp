package com.whatsapp.util;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class c9 {
    private final long a;
    private final HashMap b;

    public synchronized boolean a() {
        return this.b.isEmpty();
    }

    public synchronized Collection c() {
        return new ArrayList(this.b.values());
    }

    public synchronized boolean b(Object obj) {
        boolean z;
        Long l = (Long) this.b.get(obj);
        if (l == null || l.longValue() + this.a <= SystemClock.elapsedRealtime()) {
            this.b.put(obj, Long.valueOf(SystemClock.elapsedRealtime()));
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public synchronized Long a(Object obj) {
        Long l;
        l = (Long) this.b.remove(obj);
        if (l == null) {
            l = null;
        }
        return l;
    }

    public synchronized void b() {
        this.b.clear();
    }

    public c9(long j) {
        this.a = j;
        this.b = new HashMap();
    }
}
