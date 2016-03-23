package com.google;

import java.util.LinkedHashMap;

class fw {
    private LinkedHashMap a;
    private int b;

    public fw(int i) {
        this.b = i;
        this.a = new h2(this, ((i * 4) / 3) + 1, 0.75f, true);
    }

    public synchronized void a(Object obj, Object obj2) {
        this.a.put(obj, obj2);
    }

    public synchronized Object a(Object obj) {
        return this.a.get(obj);
    }

    static int a(fw fwVar) {
        return fwVar.b;
    }
}
