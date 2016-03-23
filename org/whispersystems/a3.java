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

public final class a3 extends cJ implements bV {
    private int e;
    private hx f;
    private int g;

    public final boolean isInitialized() {
        return true;
    }

    public ad a() {
        return ad.l();
    }

    private a3(ec ecVar) {
        super(ecVar);
        this.f = hx.b;
        h();
    }

    public fO m1209getDefaultInstanceForType() {
        return a();
    }

    public ad b() {
        int i = 1;
        ad adVar = new ad((cJ) this, null);
        int i2 = this.e;
        if ((i2 & 1) != 1) {
            i = 0;
        }
        ad.b(adVar, this.g);
        if ((i2 & 2) == 2) {
            i |= 2;
        }
        ad.a(adVar, this.f);
        ad.a(adVar, i);
        f();
        return adVar;
    }

    private a3() {
        this.f = hx.b;
        h();
    }

    private void h() {
        if (!ad.j()) {
        }
    }

    public ci build() {
        return d();
    }

    private static a3 e() {
        return new a3();
    }

    public c3 mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    static a3 c() {
        return e();
    }

    public c3 mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public il m1212mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public a3 a(ci ciVar) {
        try {
            if (ciVar instanceof ad) {
                this = a((ad) ciVar);
            } else {
                super.mergeFrom(ciVar);
            }
            return this;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public cJ m1206clone() {
        return i();
    }

    public fn getDescriptorForType() {
        return a5.l();
    }

    public a3 a(hx hxVar) {
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

    public ch m1210mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public Object m1208clone() {
        return i();
    }

    public fl m1211mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    public ch m1207clone() {
        return i();
    }

    public a3 a(int i) {
        this.e |= 1;
        this.g = i;
        g();
        return this;
    }

    public fO m1205buildPartial() {
        return b();
    }

    public ad d() {
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

    public ci getDefaultInstanceForType() {
        return a();
    }

    a3(ec ecVar, bs bsVar) {
        this(ecVar);
    }

    public a3 a(ad adVar) {
        try {
            if (adVar != ad.l()) {
                try {
                    if (adVar.e()) {
                        a(adVar.c());
                    }
                    try {
                        if (adVar.a()) {
                            a(adVar.f());
                        }
                        a(adVar.getUnknownFields());
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

    public ci buildPartial() {
        return b();
    }

    protected bJ internalGetFieldAccessorTable() {
        return a5.j().a(ad.class, a3.class);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.whispersystems.a3 a(com.google.ad r5, com.google.h r6) {
        /*
        r4 = this;
        r2 = 0;
        r0 = org.whispersystems.ad.PARSER;	 Catch:{ fN -> 0x0011 }
        r0 = r0.parsePartialFrom(r5, r6);	 Catch:{ fN -> 0x0011 }
        r0 = (org.whispersystems.ad) r0;	 Catch:{ fN -> 0x0011 }
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
        r0 = (org.whispersystems.ad) r0;	 Catch:{ all -> 0x0026 }
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
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.a3.a(com.google.ad, com.google.h):org.whispersystems.a3");
    }

    public fO m1204build() {
        return d();
    }

    public a3 i() {
        return e().a(b());
    }

    public c3 clone() {
        return i();
    }
}
