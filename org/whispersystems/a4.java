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

public final class a4 extends cJ implements x {
    private hx e;
    private long f;
    private int g;
    private int h;
    private hx i;
    private hx j;

    public ch m1256clone() {
        return e();
    }

    public a4 a(ci ciVar) {
        try {
            if (ciVar instanceof at) {
                this = a((at) ciVar);
            } else {
                super.mergeFrom(ciVar);
            }
            return this;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public a4 b(hx hxVar) {
        if (hxVar == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        this.g |= 4;
        this.e = hxVar;
        g();
        return this;
    }

    public ch m1259mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public ci build() {
        return c();
    }

    public a4 e() {
        return f().a(b());
    }

    private a4() {
        this.j = hx.b;
        this.e = hx.b;
        this.i = hx.b;
        a();
    }

    public il m1261mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public c3 clone() {
        return e();
    }

    public Object m1257clone() {
        return e();
    }

    private a4(ec ecVar) {
        super(ecVar);
        this.j = hx.b;
        this.e = hx.b;
        this.i = hx.b;
        a();
    }

    public a4 a(at atVar) {
        try {
            if (atVar != at.r()) {
                try {
                    if (atVar.l()) {
                        a(atVar.j());
                    }
                    try {
                        if (atVar.d()) {
                            c(atVar.g());
                        }
                        try {
                            if (atVar.o()) {
                                b(atVar.p());
                            }
                            try {
                                if (atVar.m()) {
                                    a(atVar.q());
                                }
                                try {
                                    if (atVar.e()) {
                                        a(atVar.b());
                                    }
                                    a(atVar.getUnknownFields());
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

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.whispersystems.a4 a(com.google.ad r5, com.google.h r6) {
        /*
        r4 = this;
        r2 = 0;
        r0 = org.whispersystems.at.h;	 Catch:{ fN -> 0x0011 }
        r0 = r0.parsePartialFrom(r5, r6);	 Catch:{ fN -> 0x0011 }
        r0 = (org.whispersystems.at) r0;	 Catch:{ fN -> 0x0011 }
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
        r0 = (org.whispersystems.at) r0;	 Catch:{ all -> 0x0026 }
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
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.a4.a(com.google.ad, com.google.h):org.whispersystems.a4");
    }

    private static a4 f() {
        return new a4();
    }

    public fl m1260mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    public c3 mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public fO m1253build() {
        return c();
    }

    public ci buildPartial() {
        return b();
    }

    public a4 a(hx hxVar) {
        if (hxVar == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        this.g |= 8;
        this.i = hxVar;
        g();
        return this;
    }

    a4(ec ecVar, bs bsVar) {
        this(ecVar);
    }

    static a4 g() {
        return f();
    }

    public ci getDefaultInstanceForType() {
        return d();
    }

    public fO m1258getDefaultInstanceForType() {
        return d();
    }

    public cJ m1255clone() {
        return e();
    }

    public final boolean isInitialized() {
        return true;
    }

    public at b() {
        int i = 1;
        at atVar = new at((cJ) this, null);
        int i2 = this.g;
        if ((i2 & 1) != 1) {
            i = 0;
        }
        at.a(atVar, this.h);
        if ((i2 & 2) == 2) {
            i |= 2;
        }
        at.a(atVar, this.j);
        if ((i2 & 4) == 4) {
            i |= 4;
        }
        at.c(atVar, this.e);
        if ((i2 & 8) == 8) {
            i |= 8;
        }
        at.b(atVar, this.i);
        if ((i2 & 16) == 16) {
            i |= 16;
        }
        at.a(atVar, this.f);
        at.b(atVar, i);
        f();
        return atVar;
    }

    public a4 a(int i) {
        this.g |= 1;
        this.h = i;
        g();
        return this;
    }

    public a4 c(hx hxVar) {
        if (hxVar == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        this.g |= 2;
        this.j = hxVar;
        g();
        return this;
    }

    public at c() {
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

    private void a() {
        if (!at.n()) {
        }
    }

    public a4 a(long j) {
        this.g |= 16;
        this.f = j;
        g();
        return this;
    }

    protected bJ internalGetFieldAccessorTable() {
        return a5.p().a(at.class, a4.class);
    }

    public fn getDescriptorForType() {
        return a5.z();
    }

    public c3 mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    public at d() {
        return at.r();
    }

    public fO m1254buildPartial() {
        return b();
    }
}
