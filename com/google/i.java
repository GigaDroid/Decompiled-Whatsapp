package com.google;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class i extends h {
    private static final i e;
    private final Map d;
    private final Map f;

    public static i a() {
        return e;
    }

    private i() {
        this.d = new HashMap();
        this.f = new HashMap();
    }

    private i(boolean z) {
        super(h.a());
        this.d = Collections.emptyMap();
        this.f = Collections.emptyMap();
    }

    public h9 a(fn fnVar, int i) {
        return (h9) this.f.get(new hT(fnVar, i));
    }

    static {
        e = new i(true);
    }
}
