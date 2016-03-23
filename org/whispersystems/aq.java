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

public final class aq extends cJ implements s {
    private hx e;
    private int f;
    private hx g;

    public ci getDefaultInstanceForType() {
        return g();
    }

    public fl m1122mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    public aq b(hx hxVar) {
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

    public Q f() {
        int i = 1;
        Q q = new Q((cJ) this, null);
        int i2 = this.f;
        if ((i2 & 1) != 1) {
            i = 0;
        }
        Q.b(q, this.e);
        if ((i2 & 2) == 2) {
            i |= 2;
        }
        Q.a(q, this.g);
        Q.a(q, i);
        f();
        return q;
    }

    public aq a(hx hxVar) {
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

    public Object m1119clone() {
        return e();
    }

    private void a() {
        if (!Q.i()) {
        }
    }

    protected bJ internalGetFieldAccessorTable() {
        return a5.h().a(Q.class, aq.class);
    }

    aq(ec ecVar, bs bsVar) {
        this(ecVar);
    }

    public aq e() {
        return d().a(f());
    }

    public fO m1116buildPartial() {
        return f();
    }

    public c3 mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    private aq() {
        this.e = hx.b;
        this.g = hx.b;
        a();
    }

    public ci buildPartial() {
        return f();
    }

    public fO m1120getDefaultInstanceForType() {
        return g();
    }

    public fO m1115build() {
        return b();
    }

    public ch m1121mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public fn getDescriptorForType() {
        return a5.k();
    }

    public ci build() {
        return b();
    }

    public aq a(Q q) {
        try {
            if (q != Q.j()) {
                try {
                    if (q.a()) {
                        a(q.h());
                    }
                    try {
                        if (q.g()) {
                            b(q.d());
                        }
                        a(q.getUnknownFields());
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

    public cJ m1117clone() {
        return e();
    }

    public il m1123mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public Q b() {
        Object f = f();
        try {
            if (f.isInitialized()) {
                return f;
            }
            throw a((ci) f);
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public c3 mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public final boolean isInitialized() {
        return true;
    }

    public c3 clone() {
        return e();
    }

    private static aq d() {
        return new aq();
    }

    private aq(ec ecVar) {
        super(ecVar);
        this.e = hx.b;
        this.g = hx.b;
        a();
    }

    static aq c() {
        return d();
    }

    public aq a(ci ciVar) {
        try {
            if (ciVar instanceof Q) {
                this = a((Q) ciVar);
            } else {
                super.mergeFrom(ciVar);
            }
            return this;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public ch m1118clone() {
        return e();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.whispersystems.aq a(com.google.ad r5, com.google.h r6) {
        /*
        r4 = this;
        r2 = 0;
        r0 = org.whispersystems.Q.j;	 Catch:{ fN -> 0x0011 }
        r0 = r0.parsePartialFrom(r5, r6);	 Catch:{ fN -> 0x0011 }
        r0 = (org.whispersystems.Q) r0;	 Catch:{ fN -> 0x0011 }
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
        r0 = (org.whispersystems.Q) r0;	 Catch:{ all -> 0x0026 }
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
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.aq.a(com.google.ad, com.google.h):org.whispersystems.aq");
    }

    public Q g() {
        return Q.j();
    }
}
