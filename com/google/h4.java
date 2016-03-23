package com.google;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

class h4 extends AbstractMap {
    private boolean a;
    private final int b;
    private volatile g5 c;
    private Map d;
    private List e;

    h4(int i, hm hmVar) {
        this(i);
    }

    public Entry c(int i) {
        return (Entry) this.e.get(i);
    }

    public void g() {
        try {
            if (!this.a) {
                Map emptyMap;
                if (this.d.isEmpty()) {
                    emptyMap = Collections.emptyMap();
                } else {
                    emptyMap = Collections.unmodifiableMap(this.d);
                }
                this.d = emptyMap;
                this.a = true;
            }
        } catch (UnsupportedOperationException e) {
            throw e;
        } catch (UnsupportedOperationException e2) {
            throw e2;
        }
    }

    private void b() {
        try {
            if (this.a) {
                throw new UnsupportedOperationException();
            }
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    public Object put(Object obj, Object obj2) {
        return a((Comparable) obj, obj2);
    }

    public int size() {
        return this.e.size() + this.d.size();
    }

    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = a(comparable);
        if (a < 0) {
            return this.d.get(comparable);
        }
        try {
            return ((hb) this.e.get(a)).getValue();
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    static Map a(h4 h4Var) {
        return h4Var.d;
    }

    public Iterable d() {
        try {
            return this.d.isEmpty() ? iU.a() : this.d.entrySet();
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    static List b(h4 h4Var) {
        return h4Var.e;
    }

    private h4(int i) {
        this.b = i;
        this.e = Collections.emptyList();
        this.d = Collections.emptyMap();
    }

    public int f() {
        return this.e.size();
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        try {
            if (a(comparable) < 0) {
                if (!this.d.containsKey(comparable)) {
                    return false;
                }
            }
            return true;
        } catch (UnsupportedOperationException e) {
            throw e;
        } catch (UnsupportedOperationException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int a(java.lang.Comparable r8) {
        /*
        r7 = this;
        r4 = com.google.bA.b;
        r2 = 0;
        r0 = r7.e;
        r0 = r0.size();
        r1 = r0 + -1;
        if (r1 < 0) goto L_0x005a;
    L_0x000d:
        r0 = r7.e;
        r0 = r0.get(r1);
        r0 = (com.google.hb) r0;
        r0 = r0.a();
        r0 = r8.compareTo(r0);
        if (r0 <= 0) goto L_0x0023;
    L_0x001f:
        r0 = r1 + 2;
        r0 = -r0;
    L_0x0022:
        return r0;
    L_0x0023:
        if (r0 != 0) goto L_0x005a;
    L_0x0025:
        r0 = r1;
        goto L_0x0022;
    L_0x0027:
        r3 = r1;
        r1 = r0;
    L_0x0029:
        if (r1 > r3) goto L_0x0058;
    L_0x002b:
        r0 = r1 + r3;
        r2 = r0 / 2;
        r0 = r7.e;
        r0 = r0.get(r2);
        r0 = (com.google.hb) r0;
        r0 = r0.a();
        r5 = r8.compareTo(r0);
        if (r5 >= 0) goto L_0x0056;
    L_0x0041:
        r0 = r2 + -1;
        if (r4 == 0) goto L_0x004d;
    L_0x0045:
        if (r5 <= 0) goto L_0x004b;
    L_0x0047:
        r1 = r2 + 1;
        if (r4 == 0) goto L_0x004d;
    L_0x004b:
        r0 = r2;
        goto L_0x0022;
    L_0x004d:
        r6 = r0;
        r0 = r1;
        r1 = r6;
        if (r4 == 0) goto L_0x0027;
    L_0x0052:
        r0 = r0 + 1;
        r0 = -r0;
        goto L_0x0022;
    L_0x0056:
        r0 = r3;
        goto L_0x0045;
    L_0x0058:
        r0 = r1;
        goto L_0x0052;
    L_0x005a:
        r3 = r1;
        r1 = r2;
        goto L_0x0029;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.h4.a(java.lang.Comparable):int");
    }

    private Object b(int i) {
        b();
        Object value = ((hb) this.e.remove(i)).getValue();
        if (!this.d.isEmpty()) {
            Iterator it = c().entrySet().iterator();
            this.e.add(new hb(this, (Entry) it.next()));
            it.remove();
        }
        return value;
    }

    public boolean e() {
        return this.a;
    }

    private SortedMap c() {
        try {
            b();
            if (this.d.isEmpty()) {
                if (!(this.d instanceof TreeMap)) {
                    this.d = new TreeMap();
                }
            }
            return (SortedMap) this.d;
        } catch (UnsupportedOperationException e) {
            throw e;
        } catch (UnsupportedOperationException e2) {
            throw e2;
        }
    }

    static h4 a(int i) {
        return new hm(i);
    }

    static Object a(h4 h4Var, int i) {
        return h4Var.b(i);
    }

    public void clear() {
        try {
            b();
            if (!this.e.isEmpty()) {
                this.e.clear();
            }
            try {
                if (!this.d.isEmpty()) {
                    this.d.clear();
                }
            } catch (UnsupportedOperationException e) {
                throw e;
            }
        } catch (UnsupportedOperationException e2) {
            throw e2;
        }
    }

    private void a() {
        try {
            b();
            if (!this.e.isEmpty()) {
                return;
            }
            if (!(this.e instanceof ArrayList)) {
                this.e = new ArrayList(this.b);
            }
        } catch (UnsupportedOperationException e) {
            throw e;
        } catch (UnsupportedOperationException e2) {
            throw e2;
        }
    }

    public Set entrySet() {
        try {
            if (this.c == null) {
                this.c = new g5(this, null);
            }
            return this.c;
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    public Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int a = a(comparable);
        if (a >= 0) {
            try {
                return b(a);
            } catch (UnsupportedOperationException e) {
                throw e;
            }
        }
        try {
            if (this.d.isEmpty()) {
                return null;
            }
            return this.d.remove(comparable);
        } catch (UnsupportedOperationException e2) {
            throw e2;
        }
    }

    public Object a(Comparable comparable, Object obj) {
        b();
        int a = a(comparable);
        if (a >= 0) {
            try {
                return ((hb) this.e.get(a)).setValue(obj);
            } catch (UnsupportedOperationException e) {
                throw e;
            }
        }
        a();
        int i = -(a + 1);
        try {
            if (i >= this.b) {
                return c().put(comparable, obj);
            }
            if (this.e.size() == this.b) {
                hb hbVar = (hb) this.e.remove(this.b - 1);
                c().put(hbVar.a(), hbVar.getValue());
            }
            this.e.add(i, new hb(this, comparable, obj));
            return null;
        } catch (UnsupportedOperationException e2) {
            throw e2;
        }
    }

    static void c(h4 h4Var) {
        h4Var.b();
    }
}
