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

public final class ay extends cJ implements bB {
    private int e;
    private hx f;
    private hx g;

    public fl m1172mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    public c3 mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    private void h() {
        if (!X.i()) {
        }
    }

    public fn getDescriptorForType() {
        return a5.u();
    }

    public fO m1166buildPartial() {
        return a();
    }

    public Object m1169clone() {
        return e();
    }

    public ay b(hx hxVar) {
        if (hxVar == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        this.e |= 2;
        this.g = hxVar;
        g();
        return this;
    }

    public c3 mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public X c() {
        return X.d();
    }

    public ay e() {
        return i().a(a());
    }

    public c3 clone() {
        return e();
    }

    private ay(ec ecVar) {
        super(ecVar);
        this.f = hx.b;
        this.g = hx.b;
        h();
    }

    public cJ m1167clone() {
        return e();
    }

    protected bJ internalGetFieldAccessorTable() {
        return a5.m().a(X.class, ay.class);
    }

    public ci getDefaultInstanceForType() {
        return c();
    }

    public fO m1170getDefaultInstanceForType() {
        return c();
    }

    static ay b() {
        return i();
    }

    public fO m1165build() {
        return d();
    }

    public X a() {
        int i = 1;
        X x = new X((cJ) this, null);
        int i2 = this.e;
        if ((i2 & 1) != 1) {
            i = 0;
        }
        X.a(x, this.f);
        if ((i2 & 2) == 2) {
            i |= 2;
        }
        X.b(x, this.g);
        X.a(x, i);
        f();
        return x;
    }

    public ch m1168clone() {
        return e();
    }

    public ci build() {
        return d();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.whispersystems.ay a(com.google.ad r5, com.google.h r6) {
        /*
        r4 = this;
        r2 = 0;
        r0 = org.whispersystems.X.PARSER;	 Catch:{ fN -> 0x0011 }
        r0 = r0.parsePartialFrom(r5, r6);	 Catch:{ fN -> 0x0011 }
        r0 = (org.whispersystems.X) r0;	 Catch:{ fN -> 0x0011 }
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
        r0 = (org.whispersystems.X) r0;	 Catch:{ all -> 0x0026 }
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
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.ay.a(com.google.ad, com.google.h):org.whispersystems.ay");
    }

    public final boolean isInitialized() {
        return true;
    }

    public ci buildPartial() {
        return a();
    }

    public il m1173mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public X d() {
        Object a = a();
        try {
            if (a.isInitialized()) {
                return a;
            }
            throw a((ci) a);
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public ay a(X x) {
        try {
            if (x != X.d()) {
                try {
                    if (x.f()) {
                        a(x.h());
                    }
                    try {
                        if (x.c()) {
                            b(x.g());
                        }
                        a(x.getUnknownFields());
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

    private ay() {
        this.f = hx.b;
        this.g = hx.b;
        h();
    }

    public ay a(hx hxVar) {
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

    ay(ec ecVar, bs bsVar) {
        this(ecVar);
    }

    private static ay i() {
        return new ay();
    }

    public ay a(ci ciVar) {
        try {
            if (ciVar instanceof X) {
                this = a((X) ciVar);
            } else {
                super.mergeFrom(ciVar);
            }
            return this;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public ch m1171mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }
}
