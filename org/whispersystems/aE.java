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

public final class aE extends cJ implements bf {
    private int e;
    private int f;
    private hx g;

    public Object m1238clone() {
        return e();
    }

    public fO m1239getDefaultInstanceForType() {
        return g();
    }

    private aE(ec ecVar) {
        super(ecVar);
        this.g = hx.b;
        d();
    }

    public c3 mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    protected bJ internalGetFieldAccessorTable() {
        return a5.q().a(W.class, aE.class);
    }

    public aE a(ci ciVar) {
        try {
            if (ciVar instanceof W) {
                this = a((W) ciVar);
            } else {
                super.mergeFrom(ciVar);
            }
            return this;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public aE e() {
        return b().a(h());
    }

    public W f() {
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

    public aE a(int i) {
        this.f |= 1;
        this.e = i;
        g();
        return this;
    }

    private static aE b() {
        return new aE();
    }

    private aE() {
        this.g = hx.b;
        d();
    }

    aE(ec ecVar, bs bsVar) {
        this(ecVar);
    }

    public fO m1234build() {
        return f();
    }

    public il m1242mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public cJ m1236clone() {
        return e();
    }

    public ch m1240mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public ch m1237clone() {
        return e();
    }

    public W g() {
        return W.j();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.whispersystems.aE a(com.google.ad r5, com.google.h r6) {
        /*
        r4 = this;
        r2 = 0;
        r0 = org.whispersystems.W.PARSER;	 Catch:{ fN -> 0x0011 }
        r0 = r0.parsePartialFrom(r5, r6);	 Catch:{ fN -> 0x0011 }
        r0 = (org.whispersystems.W) r0;	 Catch:{ fN -> 0x0011 }
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
        r0 = (org.whispersystems.W) r0;	 Catch:{ all -> 0x0026 }
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
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.aE.a(com.google.ad, com.google.h):org.whispersystems.aE");
    }

    static aE a() {
        return b();
    }

    private void d() {
        if (!W.d()) {
        }
    }

    public W h() {
        int i = 1;
        W w = new W((cJ) this, null);
        int i2 = this.f;
        if ((i2 & 1) != 1) {
            i = 0;
        }
        W.b(w, this.e);
        if ((i2 & 2) == 2) {
            i |= 2;
        }
        W.a(w, this.g);
        W.a(w, i);
        f();
        return w;
    }

    public aE a(W w) {
        try {
            if (w != W.j()) {
                try {
                    if (w.l()) {
                        a(w.h());
                    }
                    try {
                        if (w.c()) {
                            a(w.f());
                        }
                        a(w.getUnknownFields());
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
        return h();
    }

    public fl m1241mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    public ci build() {
        return f();
    }

    public ci getDefaultInstanceForType() {
        return g();
    }

    public fn getDescriptorForType() {
        return a5.v();
    }

    public final boolean isInitialized() {
        return true;
    }

    public fO m1235buildPartial() {
        return h();
    }

    public c3 mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    public c3 clone() {
        return e();
    }

    public aE a(hx hxVar) {
        if (hxVar == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        this.f |= 2;
        this.g = hxVar;
        g();
        return this;
    }
}
