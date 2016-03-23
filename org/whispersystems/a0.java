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

public final class a0 extends cJ implements c {
    private hx e;
    private hx f;
    private int g;
    private int h;

    public ci getDefaultInstanceForType() {
        return g();
    }

    private a0(ec ecVar) {
        super(ecVar);
        this.e = hx.b;
        this.f = hx.b;
        d();
    }

    public R a() {
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

    a0(ec ecVar, bs bsVar) {
        this(ecVar);
    }

    public fn getDescriptorForType() {
        return a5.w();
    }

    public fl m1181mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.whispersystems.a0 a(com.google.ad r5, com.google.h r6) {
        /*
        r4 = this;
        r2 = 0;
        r0 = org.whispersystems.R.f;	 Catch:{ fN -> 0x0011 }
        r0 = r0.parsePartialFrom(r5, r6);	 Catch:{ fN -> 0x0011 }
        r0 = (org.whispersystems.R) r0;	 Catch:{ fN -> 0x0011 }
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
        r0 = (org.whispersystems.R) r0;	 Catch:{ all -> 0x0026 }
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
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.a0.a(com.google.ad, com.google.h):org.whispersystems.a0");
    }

    public fO m1174build() {
        return a();
    }

    public ci buildPartial() {
        return b();
    }

    private static a0 e() {
        return new a0();
    }

    private void d() {
        if (!R.m()) {
        }
    }

    public final boolean isInitialized() {
        return true;
    }

    public a0 b(hx hxVar) {
        if (hxVar == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        this.h |= 4;
        this.f = hxVar;
        g();
        return this;
    }

    public ch m1180mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public c3 mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public ci build() {
        return a();
    }

    public R b() {
        int i = 1;
        R r = new R((cJ) this, null);
        int i2 = this.h;
        if ((i2 & 1) != 1) {
            i = 0;
        }
        R.a(r, this.g);
        if ((i2 & 2) == 2) {
            i |= 2;
        }
        R.b(r, this.e);
        if ((i2 & 4) == 4) {
            i |= 4;
        }
        R.a(r, this.f);
        R.b(r, i);
        f();
        return r;
    }

    public a0 h() {
        return e().a(b());
    }

    public a0 a(hx hxVar) {
        if (hxVar == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        this.h |= 2;
        this.e = hxVar;
        g();
        return this;
    }

    public fO m1179getDefaultInstanceForType() {
        return g();
    }

    static a0 f() {
        return e();
    }

    public a0 a(int i) {
        this.h |= 1;
        this.g = i;
        g();
        return this;
    }

    public Object m1178clone() {
        return h();
    }

    public cJ m1176clone() {
        return h();
    }

    public c3 clone() {
        return h();
    }

    protected bJ internalGetFieldAccessorTable() {
        return a5.e().a(R.class, a0.class);
    }

    public ch m1177clone() {
        return h();
    }

    public fO m1175buildPartial() {
        return b();
    }

    public il m1182mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    private a0() {
        this.e = hx.b;
        this.f = hx.b;
        d();
    }

    public c3 mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    public R g() {
        return R.k();
    }

    public a0 a(ci ciVar) {
        try {
            if (ciVar instanceof R) {
                this = a((R) ciVar);
            } else {
                super.mergeFrom(ciVar);
            }
            return this;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public a0 a(R r) {
        try {
            if (r != R.k()) {
                try {
                    if (r.e()) {
                        a(r.f());
                    }
                    try {
                        if (r.b()) {
                            a(r.g());
                        }
                        try {
                            if (r.c()) {
                                b(r.l());
                            }
                            a(r.getUnknownFields());
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
}
