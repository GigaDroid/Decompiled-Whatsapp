package com.google;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class h {
    private static volatile boolean b;
    private static final h c;
    private final Map a;

    h(h hVar) {
        if (hVar == c) {
            this.a = Collections.emptyMap();
        } else {
            this.a = Collections.unmodifiableMap(hVar.a);
        }
    }

    private h(boolean z) {
        this.a = Collections.emptyMap();
    }

    static {
        b = false;
        c = new h(true);
    }

    public static h a() {
        return c;
    }

    h() {
        this.a = new HashMap();
    }

    public fE a(fO fOVar, int i) {
        return (fE) this.a.get(new hv(fOVar, i));
    }

    public static boolean b() {
        return b;
    }
}
