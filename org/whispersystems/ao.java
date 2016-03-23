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

public final class ao extends cJ implements bv {
    private int e;
    private int f;
    private int g;
    private hx h;

    private ao(ec ecVar) {
        super(ecVar);
        this.h = hx.b;
        d();
    }

    public ci build() {
        return g();
    }

    public fl m1220mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    protected bJ internalGetFieldAccessorTable() {
        return a5.n().a(a8.class, ao.class);
    }

    public ci getDefaultInstanceForType() {
        return e();
    }

    public ao b() {
        return f().a(a());
    }

    ao(ec ecVar, bs bsVar) {
        this(ecVar);
    }

    public ch m1216clone() {
        return b();
    }

    public fn getDescriptorForType() {
        return a5.b();
    }

    public fO m1214buildPartial() {
        return a();
    }

    static ao c() {
        return f();
    }

    public ao b(int i) {
        this.e |= 1;
        this.f = i;
        g();
        return this;
    }

    public ch m1219mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    private void d() {
        if (!a8.c()) {
        }
    }

    public ao a(hx hxVar) {
        if (hxVar == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        this.e |= 4;
        this.h = hxVar;
        g();
        return this;
    }

    public c3 clone() {
        return b();
    }

    public Object m1217clone() {
        return b();
    }

    public a8 e() {
        return a8.n();
    }

    public a8 g() {
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

    public ao a(a8 a8Var) {
        try {
            if (a8Var != a8.n()) {
                try {
                    if (a8Var.m()) {
                        b(a8Var.f());
                    }
                    try {
                        if (a8Var.h()) {
                            a(a8Var.i());
                        }
                        try {
                            if (a8Var.b()) {
                                a(a8Var.e());
                            }
                            a(a8Var.getUnknownFields());
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

    public c3 mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.whispersystems.ao a(com.google.ad r5, com.google.h r6) {
        /*
        r4 = this;
        r2 = 0;
        r0 = org.whispersystems.a8.PARSER;	 Catch:{ fN -> 0x0011 }
        r0 = r0.parsePartialFrom(r5, r6);	 Catch:{ fN -> 0x0011 }
        r0 = (org.whispersystems.a8) r0;	 Catch:{ fN -> 0x0011 }
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
        r0 = (org.whispersystems.a8) r0;	 Catch:{ all -> 0x0026 }
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
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.ao.a(com.google.ad, com.google.h):org.whispersystems.ao");
    }

    private ao() {
        this.h = hx.b;
        d();
    }

    private static ao f() {
        return new ao();
    }

    public final boolean isInitialized() {
        return true;
    }

    public c3 mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public il m1221mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public ao a(ci ciVar) {
        try {
            if (ciVar instanceof a8) {
                this = a((a8) ciVar);
            } else {
                super.mergeFrom(ciVar);
            }
            return this;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public ci buildPartial() {
        return a();
    }

    public fO m1213build() {
        return g();
    }

    public cJ m1215clone() {
        return b();
    }

    public a8 a() {
        int i = 1;
        a8 a8Var = new a8((cJ) this, null);
        int i2 = this.e;
        if ((i2 & 1) != 1) {
            i = 0;
        }
        a8.a(a8Var, this.f);
        if ((i2 & 2) == 2) {
            i |= 2;
        }
        a8.c(a8Var, this.g);
        if ((i2 & 4) == 4) {
            i |= 4;
        }
        a8.a(a8Var, this.h);
        a8.b(a8Var, i);
        f();
        return a8Var;
    }

    public fO m1218getDefaultInstanceForType() {
        return e();
    }

    public ao a(int i) {
        this.e |= 2;
        this.g = i;
        g();
        return this;
    }
}
