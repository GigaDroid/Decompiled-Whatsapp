package org.whispersystems;

import com.google.ad;
import com.google.bJ;
import com.google.c3;
import com.google.cJ;
import com.google.ch;
import com.google.ci;
import com.google.ec;
import com.google.fO;
import com.google.fl;
import com.google.fn;
import com.google.h;
import com.google.hx;
import com.google.il;

public final class al extends cJ implements bn {
    private hx e;
    private int f;
    private hx g;

    public ch m1058mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public fO m1052build() {
        return f();
    }

    public ch m1055clone() {
        return a();
    }

    public fn getDescriptorForType() {
        return v.d();
    }

    private al() {
        this.e = hx.b;
        this.g = hx.b;
        d();
    }

    public il m1060mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    private al(ec ecVar) {
        super(ecVar);
        this.e = hx.b;
        this.g = hx.b;
        d();
    }

    public c3 clone() {
        return a();
    }

    public K g() {
        return K.l();
    }

    public final boolean isInitialized() {
        return true;
    }

    public fl m1059mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    public al a(ci ciVar) {
        try {
            if (ciVar instanceof K) {
                this = a((K) ciVar);
            } else {
                super.mergeFrom(ciVar);
            }
            return this;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    private void d() {
        if (!K.e()) {
        }
    }

    public al a() {
        return c().a(e());
    }

    al(ec ecVar, a6 a6Var) {
        this(ecVar);
    }

    public al a(K k) {
        try {
            if (k != K.l()) {
                try {
                    if (k.h()) {
                        a(k.i());
                    }
                    try {
                        if (k.k()) {
                            b(k.j());
                        }
                        a(k.getUnknownFields());
                    } catch (NullPointerException e) {
                        throw e;
                    }
                } catch (NullPointerException e2) {
                    throw e2;
                }
            }
            return this;
        } catch (NullPointerException e22) {
            throw e22;
        }
    }

    public ci build() {
        return f();
    }

    public cJ m1054clone() {
        return a();
    }

    public ci getDefaultInstanceForType() {
        return g();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.whispersystems.al a(com.google.ad r5, com.google.h r6) {
        /*
        r4 = this;
        r2 = 0;
        r0 = org.whispersystems.K.i;	 Catch:{ fN -> 0x0011 }
        r0 = r0.parsePartialFrom(r5, r6);	 Catch:{ fN -> 0x0011 }
        r0 = (org.whispersystems.K) r0;	 Catch:{ fN -> 0x0011 }
        if (r0 == 0) goto L_0x000e;
    L_0x000b:
        r4.a(r0);	 Catch:{ fN -> 0x000f }
    L_0x000e:
        return r4;
    L_0x000f:
        r0 = move-exception;
        throw r0;
    L_0x0011:
        r0 = move-exception;
        r1 = r0;
        r0 = r1.h();	 Catch:{ all -> 0x0026 }
        r0 = (org.whispersystems.K) r0;	 Catch:{ all -> 0x0026 }
        throw r1;	 Catch:{ all -> 0x001a }
    L_0x001a:
        r1 = move-exception;
        r3 = r1;
        r1 = r0;
        r0 = r3;
    L_0x001e:
        if (r1 == 0) goto L_0x0023;
    L_0x0020:
        r4.a(r1);	 Catch:{ fN -> 0x0024 }
    L_0x0023:
        throw r0;
    L_0x0024:
        r0 = move-exception;
        throw r0;
    L_0x0026:
        r0 = move-exception;
        r1 = r2;
        goto L_0x001e;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.al.a(com.google.ad, com.google.h):org.whispersystems.al");
    }

    public c3 mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    public al b(hx hxVar) {
        if (hxVar == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        this.f |= 2;
        this.g = hxVar;
        g();
        return this;
    }

    public fO m1053buildPartial() {
        return e();
    }

    public Object m1056clone() {
        return a();
    }

    public al a(hx hxVar) {
        if (hxVar == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        this.f |= 1;
        this.e = hxVar;
        g();
        return this;
    }

    public ci buildPartial() {
        return e();
    }

    static al b() {
        return c();
    }

    public K f() {
        Object e = e();
        try {
            if (e.isInitialized()) {
                return e;
            }
            throw a((ci) e);
        } catch (NullPointerException e2) {
            throw e2;
        }
    }

    public fO m1057getDefaultInstanceForType() {
        return g();
    }

    public K e() {
        int i = 1;
        K k = new K((cJ) this, null);
        int i2 = this.f;
        if ((i2 & 1) != 1) {
            i = 0;
        }
        K.b(k, this.e);
        if ((i2 & 2) == 2) {
            i |= 2;
        }
        K.a(k, this.g);
        K.a(k, i);
        f();
        return k;
    }

    private static al c() {
        return new al();
    }

    public c3 mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    protected bJ internalGetFieldAccessorTable() {
        return v.e().a(K.class, al.class);
    }
}
