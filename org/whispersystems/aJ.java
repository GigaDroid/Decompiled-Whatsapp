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

public final class aJ extends cJ implements as {
    private int e;
    private hx f;
    private hx g;
    private hx h;
    private int i;
    private hx j;
    private hx k;
    private hx l;

    public aJ c() {
        return a().a(f());
    }

    public ch m1281clone() {
        return c();
    }

    public fO m1279buildPartial() {
        return f();
    }

    public aJ a(aF aFVar) {
        try {
            if (aFVar != aF.f()) {
                try {
                    if (aFVar.h()) {
                        a(aFVar.a());
                    }
                    try {
                        if (aFVar.g()) {
                            f(aFVar.r());
                        }
                        try {
                            if (aFVar.c()) {
                                a(aFVar.j());
                            }
                            try {
                                if (aFVar.k()) {
                                    d(aFVar.e());
                                }
                                try {
                                    if (aFVar.p()) {
                                        b(aFVar.s());
                                    }
                                    try {
                                        if (aFVar.d()) {
                                            e(aFVar.m());
                                        }
                                        try {
                                            if (aFVar.t()) {
                                                c(aFVar.n());
                                            }
                                            a(aFVar.getUnknownFields());
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
                    } catch (NullPointerException e22222) {
                        throw e22222;
                    }
                } catch (NullPointerException e222222) {
                    throw e222222;
                }
            }
            return this;
        } catch (NullPointerException e2222222) {
            throw e2222222;
        }
    }

    public aJ c(hx hxVar) {
        if (hxVar == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        this.i |= 64;
        this.l = hxVar;
        g();
        return this;
    }

    public c3 clone() {
        return c();
    }

    public ci build() {
        return d();
    }

    public c3 mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    public fn getDescriptorForType() {
        return a5.r();
    }

    public ch m1284mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public fl m1285mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.whispersystems.aJ a(com.google.ad r5, com.google.h r6) {
        /*
        r4 = this;
        r2 = 0;
        r0 = org.whispersystems.aF.f;	 Catch:{ fN -> 0x0011 }
        r0 = r0.parsePartialFrom(r5, r6);	 Catch:{ fN -> 0x0011 }
        r0 = (org.whispersystems.aF) r0;	 Catch:{ fN -> 0x0011 }
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
        r0 = (org.whispersystems.aF) r0;	 Catch:{ all -> 0x0026 }
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
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.aJ.a(com.google.ad, com.google.h):org.whispersystems.aJ");
    }

    public aF f() {
        int i = 1;
        aF aFVar = new aF((cJ) this, null);
        int i2 = this.i;
        if ((i2 & 1) != 1) {
            i = 0;
        }
        aF.b(aFVar, this.e);
        if ((i2 & 2) == 2) {
            i |= 2;
        }
        aF.f(aFVar, this.h);
        if ((i2 & 4) == 4) {
            i |= 4;
        }
        aF.c(aFVar, this.f);
        if ((i2 & 8) == 8) {
            i |= 8;
        }
        aF.a(aFVar, this.g);
        if ((i2 & 16) == 16) {
            i |= 16;
        }
        aF.e(aFVar, this.j);
        if ((i2 & 32) == 32) {
            i |= 32;
        }
        aF.d(aFVar, this.k);
        if ((i2 & 64) == 64) {
            i |= 64;
        }
        aF.b(aFVar, this.l);
        aF.a(aFVar, i);
        f();
        return aFVar;
    }

    public aJ d(hx hxVar) {
        if (hxVar == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        this.i |= 8;
        this.g = hxVar;
        g();
        return this;
    }

    public ci getDefaultInstanceForType() {
        return e();
    }

    aJ(ec ecVar, bs bsVar) {
        this(ecVar);
    }

    private aJ(ec ecVar) {
        super(ecVar);
        this.h = hx.b;
        this.f = hx.b;
        this.g = hx.b;
        this.j = hx.b;
        this.k = hx.b;
        this.l = hx.b;
        h();
    }

    public aJ b(hx hxVar) {
        if (hxVar == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        this.i |= 16;
        this.j = hxVar;
        g();
        return this;
    }

    public aJ a(int i) {
        this.i |= 1;
        this.e = i;
        g();
        return this;
    }

    protected bJ internalGetFieldAccessorTable() {
        return a5.D().a(aF.class, aJ.class);
    }

    public final boolean isInitialized() {
        return true;
    }

    public aF d() {
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

    public aJ a(ci ciVar) {
        try {
            if (ciVar instanceof aF) {
                this = a((aF) ciVar);
            } else {
                super.mergeFrom(ciVar);
            }
            return this;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public cJ m1280clone() {
        return c();
    }

    public fO m1283getDefaultInstanceForType() {
        return e();
    }

    static aJ b() {
        return a();
    }

    private void h() {
        if (!aF.q()) {
        }
    }

    public aF e() {
        return aF.f();
    }

    public aJ a(hx hxVar) {
        if (hxVar == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        this.i |= 4;
        this.f = hxVar;
        g();
        return this;
    }

    public aJ e(hx hxVar) {
        if (hxVar == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        this.i |= 32;
        this.k = hxVar;
        g();
        return this;
    }

    private static aJ a() {
        return new aJ();
    }

    private aJ() {
        this.h = hx.b;
        this.f = hx.b;
        this.g = hx.b;
        this.j = hx.b;
        this.k = hx.b;
        this.l = hx.b;
        h();
    }

    public il m1286mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public Object m1282clone() {
        return c();
    }

    public c3 mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public ci buildPartial() {
        return f();
    }

    public aJ f(hx hxVar) {
        if (hxVar == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        this.i |= 2;
        this.h = hxVar;
        g();
        return this;
    }

    public fO m1278build() {
        return d();
    }
}
