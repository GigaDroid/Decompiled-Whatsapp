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

public final class a9 extends cJ implements bT {
    private int e;
    private hx f;
    private int g;
    private hx h;
    private int i;

    public Object m1107clone() {
        return i();
    }

    public a9 i() {
        return a().a(h());
    }

    public P g() {
        return P.f();
    }

    a9(ec ecVar, aK aKVar) {
        this(ecVar);
    }

    private static a9 a() {
        return new a9();
    }

    public fl m1110mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    public cJ m1105clone() {
        return i();
    }

    public ci getDefaultInstanceForType() {
        return g();
    }

    public fn getDescriptorForType() {
        return aC.j();
    }

    public ci build() {
        return f();
    }

    public ci buildPartial() {
        return h();
    }

    public a9 a(hx hxVar) {
        if (hxVar == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        this.e |= 1;
        this.f = hxVar;
        g();
        return this;
    }

    public fO m1104buildPartial() {
        return h();
    }

    public a9 a(int i) {
        this.e |= 2;
        this.g = i;
        g();
        return this;
    }

    public a9 a(P p) {
        try {
            if (p != P.f()) {
                try {
                    if (p.p()) {
                        a(p.e());
                    }
                    try {
                        if (p.b()) {
                            a(p.l());
                        }
                        try {
                            if (p.j()) {
                                b(p.i());
                            }
                            try {
                                if (p.h()) {
                                    b(p.m());
                                }
                                a(p.getUnknownFields());
                            } catch (NullPointerException e) {
                                throw e;
                            }
                        } catch (NullPointerException e2) {
                            throw e2;
                        }
                    } catch (NullPointerException e22) {
                        throw e22;
                    }
                } catch (NullPointerException e222) {
                    throw e222;
                }
            }
            return this;
        } catch (NullPointerException e2222) {
            throw e2222;
        }
    }

    public a9 b(hx hxVar) {
        if (hxVar == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        this.e |= 8;
        this.h = hxVar;
        g();
        return this;
    }

    public c3 mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public P h() {
        int i = 1;
        P p = new P((cJ) this, null);
        int i2 = this.e;
        if ((i2 & 1) != 1) {
            i = 0;
        }
        P.a(p, this.f);
        if ((i2 & 2) == 2) {
            i |= 2;
        }
        P.a(p, this.g);
        if ((i2 & 4) == 4) {
            i |= 4;
        }
        P.c(p, this.i);
        if ((i2 & 8) == 8) {
            i |= 8;
        }
        P.b(p, this.h);
        P.b(p, i);
        f();
        return p;
    }

    public P f() {
        Object h = h();
        try {
            if (h.isInitialized()) {
                return h;
            }
            throw a((ci) h);
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public a9 a(ci ciVar) {
        try {
            if (ciVar instanceof P) {
                this = a((P) ciVar);
            } else {
                super.mergeFrom(ciVar);
            }
            return this;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public ch m1106clone() {
        return i();
    }

    public il m1111mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public a9 b(int i) {
        this.e |= 4;
        this.i = i;
        g();
        return this;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.whispersystems.a9 a(com.google.ad r5, com.google.h r6) {
        /*
        r4 = this;
        r2 = 0;
        r0 = org.whispersystems.P.k;	 Catch:{ fN -> 0x0011 }
        r0 = r0.parsePartialFrom(r5, r6);	 Catch:{ fN -> 0x0011 }
        r0 = (org.whispersystems.P) r0;	 Catch:{ fN -> 0x0011 }
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
        r0 = (org.whispersystems.P) r0;	 Catch:{ all -> 0x0026 }
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
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.a9.a(com.google.ad, com.google.h):org.whispersystems.a9");
    }

    protected bJ internalGetFieldAccessorTable() {
        return aC.i().a(P.class, a9.class);
    }

    public fO m1103build() {
        return f();
    }

    private a9(ec ecVar) {
        super(ecVar);
        this.f = hx.b;
        this.h = hx.b;
        d();
    }

    private void d() {
        if (!P.c()) {
        }
    }

    private a9() {
        this.f = hx.b;
        this.h = hx.b;
        d();
    }

    public fO m1108getDefaultInstanceForType() {
        return g();
    }

    public c3 mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    public final boolean isInitialized() {
        return true;
    }

    public ch m1109mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public c3 clone() {
        return i();
    }

    static a9 e() {
        return a();
    }
}
