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

public final class ac extends cJ implements ak {
    private hx e;
    private hx f;
    private hx g;
    private int h;
    private int i;

    public final boolean isInitialized() {
        return true;
    }

    ac(ec ecVar, bs bsVar) {
        this(ecVar);
    }

    public ch m1293clone() {
        return f();
    }

    private ac(ec ecVar) {
        super(ecVar);
        this.f = hx.b;
        this.g = hx.b;
        this.e = hx.b;
        a();
    }

    public ac c(hx hxVar) {
        if (hxVar == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        this.h |= 4;
        this.g = hxVar;
        g();
        return this;
    }

    private static ac c() {
        return new ac();
    }

    public aj b() {
        int i = 1;
        aj ajVar = new aj((cJ) this, null);
        int i2 = this.h;
        if ((i2 & 1) != 1) {
            i = 0;
        }
        aj.b(ajVar, this.i);
        if ((i2 & 2) == 2) {
            i |= 2;
        }
        aj.c(ajVar, this.f);
        if ((i2 & 4) == 4) {
            i |= 4;
        }
        aj.a(ajVar, this.g);
        if ((i2 & 8) == 8) {
            i |= 8;
        }
        aj.b(ajVar, this.e);
        aj.a(ajVar, i);
        f();
        return ajVar;
    }

    public fO m1290build() {
        return d();
    }

    public ci getDefaultInstanceForType() {
        return e();
    }

    public cJ m1292clone() {
        return f();
    }

    public ac a(ci ciVar) {
        try {
            if (ciVar instanceof aj) {
                this = a((aj) ciVar);
            } else {
                super.mergeFrom(ciVar);
            }
            return this;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public il m1298mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public ac f() {
        return c().a(b());
    }

    public Object m1294clone() {
        return f();
    }

    public c3 mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public ci build() {
        return d();
    }

    public ci buildPartial() {
        return b();
    }

    protected bJ internalGetFieldAccessorTable() {
        return a5.E().a(aj.class, ac.class);
    }

    public fn getDescriptorForType() {
        return a5.d();
    }

    public fO m1291buildPartial() {
        return b();
    }

    public ac b(hx hxVar) {
        if (hxVar == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        this.h |= 2;
        this.f = hxVar;
        g();
        return this;
    }

    public ac a(int i) {
        this.h |= 1;
        this.i = i;
        g();
        return this;
    }

    public ch m1296mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.whispersystems.ac a(com.google.ad r5, com.google.h r6) {
        /*
        r4 = this;
        r2 = 0;
        r0 = org.whispersystems.aj.PARSER;	 Catch:{ fN -> 0x0011 }
        r0 = r0.parsePartialFrom(r5, r6);	 Catch:{ fN -> 0x0011 }
        r0 = (org.whispersystems.aj) r0;	 Catch:{ fN -> 0x0011 }
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
        r0 = (org.whispersystems.aj) r0;	 Catch:{ all -> 0x0026 }
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
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.ac.a(com.google.ad, com.google.h):org.whispersystems.ac");
    }

    public aj e() {
        return aj.j();
    }

    public c3 clone() {
        return f();
    }

    private void a() {
        if (!aj.g()) {
        }
    }

    private ac() {
        this.f = hx.b;
        this.g = hx.b;
        this.e = hx.b;
        a();
    }

    public ac a(aj ajVar) {
        try {
            if (ajVar != aj.j()) {
                try {
                    if (ajVar.b()) {
                        a(ajVar.k());
                    }
                    try {
                        if (ajVar.c()) {
                            b(ajVar.f());
                        }
                        try {
                            if (ajVar.m()) {
                                c(ajVar.l());
                            }
                            try {
                                if (ajVar.h()) {
                                    a(ajVar.d());
                                }
                                a(ajVar.getUnknownFields());
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

    static ac g() {
        return c();
    }

    public fO m1295getDefaultInstanceForType() {
        return e();
    }

    public c3 mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    public ac a(hx hxVar) {
        if (hxVar == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        this.h |= 8;
        this.e = hxVar;
        g();
        return this;
    }

    public fl m1297mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    public aj d() {
        Object b = b();
        try {
            if (b.isInitialized()) {
                return b;
            }
            throw a((ci) b);
        } catch (NullPointerException e) {
            throw e;
        }
    }
}
