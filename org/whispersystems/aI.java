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

public final class aI extends cJ implements bL {
    private int e;
    private hx f;
    private hx g;
    private int h;
    private hx i;
    private hx j;

    public c3 clone() {
        return b();
    }

    public ch m1130clone() {
        return b();
    }

    private aI(ec ecVar) {
        super(ecVar);
        this.i = hx.b;
        this.f = hx.b;
        this.g = hx.b;
        this.j = hx.b;
        a();
    }

    public L d() {
        Object c = c();
        try {
            if (c.isInitialized()) {
                return c;
            }
            throw a((ci) c);
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public aI c(hx hxVar) {
        if (hxVar == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        this.e |= 2;
        this.i = hxVar;
        g();
        return this;
    }

    public ch m1133mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public aI a(ci ciVar) {
        try {
            if (ciVar instanceof L) {
                this = a((L) ciVar);
            } else {
                super.mergeFrom(ciVar);
            }
            return this;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    private aI() {
        this.i = hx.b;
        this.f = hx.b;
        this.g = hx.b;
        this.j = hx.b;
        a();
    }

    public L f() {
        return L.k();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.whispersystems.aI a(com.google.ad r5, com.google.h r6) {
        /*
        r4 = this;
        r2 = 0;
        r0 = org.whispersystems.L.s;	 Catch:{ fN -> 0x0011 }
        r0 = r0.parsePartialFrom(r5, r6);	 Catch:{ fN -> 0x0011 }
        r0 = (org.whispersystems.L) r0;	 Catch:{ fN -> 0x0011 }
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
        r0 = (org.whispersystems.L) r0;	 Catch:{ all -> 0x0026 }
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
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.aI.a(com.google.ad, com.google.h):org.whispersystems.aI");
    }

    public il m1135mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public fl m1134mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    public aI a(int i) {
        this.e |= 1;
        this.h = i;
        g();
        return this;
    }

    public L c() {
        int i = 1;
        L l = new L((cJ) this, null);
        int i2 = this.e;
        if ((i2 & 1) != 1) {
            i = 0;
        }
        L.a(l, this.h);
        if ((i2 & 2) == 2) {
            i |= 2;
        }
        L.b(l, this.i);
        if ((i2 & 4) == 4) {
            i |= 4;
        }
        L.c(l, this.f);
        if ((i2 & 8) == 8) {
            i |= 8;
        }
        L.d(l, this.g);
        if ((i2 & 16) == 16) {
            i |= 16;
        }
        L.a(l, this.j);
        L.b(l, i);
        f();
        return l;
    }

    private static aI e() {
        return new aI();
    }

    public Object m1131clone() {
        return b();
    }

    public aI a(L l) {
        try {
            if (l != L.k()) {
                try {
                    if (l.h()) {
                        a(l.n());
                    }
                    try {
                        if (l.m()) {
                            c(l.l());
                        }
                        try {
                            if (l.f()) {
                                b(l.i());
                            }
                            try {
                                if (l.p()) {
                                    d(l.j());
                                }
                                try {
                                    if (l.r()) {
                                        a(l.g());
                                    }
                                    a(l.getUnknownFields());
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
                } catch (NullPointerException e2222) {
                    throw e2222;
                }
            }
            return this;
        } catch (NullPointerException e22222) {
            throw e22222;
        }
    }

    public ci buildPartial() {
        return c();
    }

    protected bJ internalGetFieldAccessorTable() {
        return aC.d().a(L.class, aI.class);
    }

    public aI a(hx hxVar) {
        if (hxVar == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        this.e |= 16;
        this.j = hxVar;
        g();
        return this;
    }

    public c3 mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    public aI b() {
        return e().a(c());
    }

    public fO m1127build() {
        return d();
    }

    static aI g() {
        return e();
    }

    public fn getDescriptorForType() {
        return aC.f();
    }

    aI(ec ecVar, aK aKVar) {
        this(ecVar);
    }

    public aI d(hx hxVar) {
        if (hxVar == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        this.e |= 8;
        this.g = hxVar;
        g();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public ci build() {
        return d();
    }

    public fO m1128buildPartial() {
        return c();
    }

    public c3 mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public cJ m1129clone() {
        return b();
    }

    public fO m1132getDefaultInstanceForType() {
        return f();
    }

    public aI b(hx hxVar) {
        if (hxVar == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        this.e |= 4;
        this.f = hxVar;
        g();
        return this;
    }

    public ci getDefaultInstanceForType() {
        return f();
    }

    private void a() {
        if (!L.o()) {
        }
    }
}
