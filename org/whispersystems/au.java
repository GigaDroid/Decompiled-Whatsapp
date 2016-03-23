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

public final class au extends cJ implements ba {
    private int e;
    private int f;
    private int g;
    private hx h;

    public ci build() {
        return b();
    }

    public final boolean isInitialized() {
        return true;
    }

    protected bJ internalGetFieldAccessorTable() {
        return aC.b().a(O.class, au.class);
    }

    public O e() {
        return O.c();
    }

    public Object m1098clone() {
        return c();
    }

    public fn getDescriptorForType() {
        return aC.c();
    }

    public O f() {
        int i = 1;
        O o = new O((cJ) this, null);
        int i2 = this.f;
        if ((i2 & 1) != 1) {
            i = 0;
        }
        O.c(o, this.e);
        if ((i2 & 2) == 2) {
            i |= 2;
        }
        O.a(o, this.g);
        if ((i2 & 4) == 4) {
            i |= 4;
        }
        O.a(o, this.h);
        O.b(o, i);
        f();
        return o;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.whispersystems.au a(com.google.ad r5, com.google.h r6) {
        /*
        r4 = this;
        r2 = 0;
        r0 = org.whispersystems.O.h;	 Catch:{ fN -> 0x0011 }
        r0 = r0.parsePartialFrom(r5, r6);	 Catch:{ fN -> 0x0011 }
        r0 = (org.whispersystems.O) r0;	 Catch:{ fN -> 0x0011 }
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
        r0 = (org.whispersystems.O) r0;	 Catch:{ all -> 0x0026 }
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
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.au.a(com.google.ad, com.google.h):org.whispersystems.au");
    }

    public au a(O o) {
        try {
            if (o != O.c()) {
                try {
                    if (o.l()) {
                        a(o.j());
                    }
                    try {
                        if (o.a()) {
                            b(o.i());
                        }
                        try {
                            if (o.k()) {
                                a(o.b());
                            }
                            a(o.getUnknownFields());
                        } catch (NullPointerException e) {
                            throw e;
                        }
                    } catch (NullPointerException e2) {
                        throw e2;
                    }
                } catch (NullPointerException e22) {
                    throw e22;
                }
            }
            return this;
        } catch (NullPointerException e222) {
            throw e222;
        }
    }

    public c3 mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public il m1102mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public ci getDefaultInstanceForType() {
        return e();
    }

    public ci buildPartial() {
        return f();
    }

    private au() {
        this.h = hx.b;
        a();
    }

    public c3 clone() {
        return c();
    }

    static au d() {
        return g();
    }

    private au(ec ecVar) {
        super(ecVar);
        this.h = hx.b;
        a();
    }

    public fO m1099getDefaultInstanceForType() {
        return e();
    }

    public au c() {
        return g().a(f());
    }

    public au a(ci ciVar) {
        try {
            if (ciVar instanceof O) {
                this = a((O) ciVar);
            } else {
                super.mergeFrom(ciVar);
            }
            return this;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public ch m1100mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public fl m1101mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    public fO m1094build() {
        return b();
    }

    public ch m1097clone() {
        return c();
    }

    public cJ m1096clone() {
        return c();
    }

    private void a() {
        if (!O.e()) {
        }
    }

    public au a(int i) {
        this.f |= 1;
        this.e = i;
        g();
        return this;
    }

    public au a(hx hxVar) {
        if (hxVar == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        this.f |= 4;
        this.h = hxVar;
        g();
        return this;
    }

    private static au g() {
        return new au();
    }

    public c3 mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    au(ec ecVar, aK aKVar) {
        this(ecVar);
    }

    public O b() {
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

    public fO m1095buildPartial() {
        return f();
    }

    public au b(int i) {
        this.f |= 2;
        this.g = i;
        g();
        return this;
    }
}
