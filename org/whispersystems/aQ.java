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

public final class aQ extends cJ implements A {
    private int e;
    private hx f;
    private int g;

    public cJ m1245clone() {
        return h();
    }

    public ci buildPartial() {
        return i();
    }

    public ci getDefaultInstanceForType() {
        return a();
    }

    public c3 mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public aQ a(hx hxVar) {
        if (hxVar == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        this.e |= 2;
        this.f = hxVar;
        g();
        return this;
    }

    public fO m1244buildPartial() {
        return i();
    }

    public ch m1249mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public c3 clone() {
        return h();
    }

    public fO m1243build() {
        return e();
    }

    public ci build() {
        return e();
    }

    public V a() {
        return V.j();
    }

    public fO m1248getDefaultInstanceForType() {
        return a();
    }

    public il m1251mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public aQ a(V v) {
        try {
            if (v != V.j()) {
                try {
                    if (v.d()) {
                        a(v.b());
                    }
                    try {
                        if (v.g()) {
                            a(v.f());
                        }
                        a(v.getUnknownFields());
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

    public c3 mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    public aQ a(ci ciVar) {
        try {
            if (ciVar instanceof V) {
                this = a((V) ciVar);
            } else {
                super.mergeFrom(ciVar);
            }
            return this;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public final boolean isInitialized() {
        return true;
    }

    static aQ g() {
        return f();
    }

    public fl m1250mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    private static aQ f() {
        return new aQ();
    }

    private aQ(ec ecVar) {
        super(ecVar);
        this.f = hx.b;
        d();
    }

    public aQ h() {
        return f().a(i());
    }

    public ch m1246clone() {
        return h();
    }

    public V e() {
        Object i = i();
        try {
            if (i.isInitialized()) {
                return i;
            }
            throw a((ci) i);
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public fn getDescriptorForType() {
        return a5.a();
    }

    protected bJ internalGetFieldAccessorTable() {
        return a5.s().a(V.class, aQ.class);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.whispersystems.aQ a(com.google.ad r5, com.google.h r6) {
        /*
        r4 = this;
        r2 = 0;
        r0 = org.whispersystems.V.PARSER;	 Catch:{ fN -> 0x0011 }
        r0 = r0.parsePartialFrom(r5, r6);	 Catch:{ fN -> 0x0011 }
        r0 = (org.whispersystems.V) r0;	 Catch:{ fN -> 0x0011 }
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
        r0 = (org.whispersystems.V) r0;	 Catch:{ all -> 0x0026 }
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
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.aQ.a(com.google.ad, com.google.h):org.whispersystems.aQ");
    }

    public Object m1247clone() {
        return h();
    }

    public V i() {
        int i = 1;
        V v = new V((cJ) this, null);
        int i2 = this.e;
        if ((i2 & 1) != 1) {
            i = 0;
        }
        V.a(v, this.g);
        if ((i2 & 2) == 2) {
            i |= 2;
        }
        V.a(v, this.f);
        V.b(v, i);
        f();
        return v;
    }

    aQ(ec ecVar, bs bsVar) {
        this(ecVar);
    }

    public aQ a(int i) {
        this.e |= 1;
        this.g = i;
        g();
        return this;
    }

    private aQ() {
        this.f = hx.b;
        d();
    }

    private void d() {
        if (!V.a()) {
        }
    }
}
