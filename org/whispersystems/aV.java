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

public final class aV extends cJ implements D {
    private int e;
    private int f;
    private hx g;
    private int h;
    private hx i;

    public fO m1139build() {
        return h();
    }

    public fO m1140buildPartial() {
        return e();
    }

    aV(ec ecVar, aK aKVar) {
        this(ecVar);
    }

    public ch m1142clone() {
        return a();
    }

    public cJ m1141clone() {
        return a();
    }

    public fO m1144getDefaultInstanceForType() {
        return g();
    }

    public N h() {
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

    public il m1147mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public Object m1143clone() {
        return a();
    }

    public ci buildPartial() {
        return e();
    }

    public final boolean isInitialized() {
        return true;
    }

    private static aV f() {
        return new aV();
    }

    public aV a() {
        return f().a(e());
    }

    public N e() {
        int i = 1;
        N n = new N((cJ) this, null);
        int i2 = this.e;
        if ((i2 & 1) != 1) {
            i = 0;
        }
        N.c(n, this.h);
        if ((i2 & 2) == 2) {
            i |= 2;
        }
        N.a(n, this.f);
        if ((i2 & 4) == 4) {
            i |= 4;
        }
        N.a(n, this.g);
        if ((i2 & 8) == 8) {
            i |= 8;
        }
        N.b(n, this.i);
        N.b(n, i);
        f();
        return n;
    }

    public ci build() {
        return h();
    }

    public c3 mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    public aV a(hx hxVar) {
        if (hxVar == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        this.e |= 4;
        this.g = hxVar;
        g();
        return this;
    }

    public aV a(N n) {
        try {
            if (n != N.a()) {
                try {
                    if (n.n()) {
                        b(n.i());
                    }
                    try {
                        if (n.p()) {
                            a(n.f());
                        }
                        try {
                            if (n.g()) {
                                a(n.h());
                            }
                            try {
                                if (n.b()) {
                                    b(n.k());
                                }
                                a(n.getUnknownFields());
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

    public aV b(hx hxVar) {
        if (hxVar == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        this.e |= 8;
        this.i = hxVar;
        g();
        return this;
    }

    public aV a(int i) {
        this.e |= 2;
        this.f = i;
        g();
        return this;
    }

    public fl m1146mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    static aV b() {
        return f();
    }

    public c3 clone() {
        return a();
    }

    public fn getDescriptorForType() {
        return aC.e();
    }

    public c3 mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public aV b(int i) {
        this.e |= 1;
        this.h = i;
        g();
        return this;
    }

    private aV(ec ecVar) {
        super(ecVar);
        this.g = hx.b;
        this.i = hx.b;
        d();
    }

    private aV() {
        this.g = hx.b;
        this.i = hx.b;
        d();
    }

    public ch m1145mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public ci getDefaultInstanceForType() {
        return g();
    }

    private void d() {
        if (!N.c()) {
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.whispersystems.aV a(com.google.ad r5, com.google.h r6) {
        /*
        r4 = this;
        r2 = 0;
        r0 = org.whispersystems.N.i;	 Catch:{ fN -> 0x0011 }
        r0 = r0.parsePartialFrom(r5, r6);	 Catch:{ fN -> 0x0011 }
        r0 = (org.whispersystems.N) r0;	 Catch:{ fN -> 0x0011 }
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
        r0 = (org.whispersystems.N) r0;	 Catch:{ all -> 0x0026 }
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
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.aV.a(com.google.ad, com.google.h):org.whispersystems.aV");
    }

    protected bJ internalGetFieldAccessorTable() {
        return aC.g().a(N.class, aV.class);
    }

    public aV a(ci ciVar) {
        try {
            if (ciVar instanceof N) {
                this = a((N) ciVar);
            } else {
                super.mergeFrom(ciVar);
            }
            return this;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public N g() {
        return N.a();
    }
}
