package de.greenrobot.event;

import java.util.ArrayList;
import java.util.List;

final class b {
    private static final List d;
    k a;
    b b;
    Object c;

    static b a(k kVar, Object obj) {
        synchronized (d) {
            int size = d.size();
            if (size > 0) {
                b bVar = (b) d.remove(size - 1);
                bVar.c = obj;
                bVar.a = kVar;
                bVar.b = null;
                return bVar;
            }
            return new b(obj, kVar);
        }
    }

    static void a(b bVar) {
        int i = n.b;
        bVar.c = null;
        bVar.a = null;
        bVar.b = null;
        synchronized (d) {
            if (d.size() < 10000) {
                d.add(bVar);
            }
        }
        if (h.p != 0) {
            n.b = i + 1;
        }
    }

    static {
        d = new ArrayList();
    }

    private b(Object obj, k kVar) {
        this.c = obj;
        this.a = kVar;
    }
}
