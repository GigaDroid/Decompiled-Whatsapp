package com.google;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class c7 extends cJ implements ej {
    private fv e;
    private List f;
    private int g;

    public ch m228mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public ci getDefaultInstanceForType() {
        return c();
    }

    public bB a(int i) {
        return this.e == null ? (bB) this.f.get(i) : (bB) this.e.c(i);
    }

    public Object m226clone() {
        return g();
    }

    public ch m225clone() {
        return g();
    }

    public c3 mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    public c7 a(ci ciVar) {
        if (ciVar instanceof b2) {
            return a((b2) ciVar);
        }
        super.mergeFrom(ciVar);
        return this;
    }

    static c7 f() {
        return d();
    }

    private static c7 d() {
        return new c7();
    }

    public ci build() {
        return h();
    }

    public fl m229mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    public b2 h() {
        Object e = e();
        if (e.isInitialized()) {
            return e;
        }
        throw a((ci) e);
    }

    public fO m223buildPartial() {
        return e();
    }

    public il m230mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.c7 a(com.google.ad r5, com.google.h r6) {
        /*
        r4 = this;
        r2 = 0;
        r0 = com.google.b2.k;	 Catch:{ fN -> 0x0011 }
        r0 = r0.parsePartialFrom(r5, r6);	 Catch:{ fN -> 0x0011 }
        r0 = (com.google.b2) r0;	 Catch:{ fN -> 0x0011 }
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
        r0 = (com.google.b2) r0;	 Catch:{ all -> 0x0026 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.c7.a(com.google.ad, com.google.h):com.google.c7");
    }

    public ci buildPartial() {
        return e();
    }

    public cJ m224clone() {
        return g();
    }

    private void a() {
        if (bL.d) {
            i();
        }
    }

    private fv i() {
        boolean z = true;
        if (this.e == null) {
            List list = this.f;
            if ((this.g & 1) != 1) {
                z = false;
            }
            this.e = new fv(list, z, e(), a());
            this.f = null;
        }
        return this.e;
    }

    public int b() {
        return this.e == null ? this.f.size() : this.e.d();
    }

    private c7() {
        this.f = Collections.emptyList();
        a();
    }

    public b2 c() {
        return b2.e();
    }

    private void j() {
        if ((this.g & 1) != 1) {
            this.f = new ArrayList(this.f);
            this.g |= 1;
        }
    }

    public c7 g() {
        return d().a(e());
    }

    public final boolean isInitialized() {
        boolean z = bA.b;
        int i = 0;
        while (i < b()) {
            if (a(i).isInitialized()) {
                i++;
                if (z) {
                    break;
                }
            }
            return false;
        }
        return true;
    }

    c7(ec ecVar, fm fmVar) {
        this(ecVar);
    }

    public fO m227getDefaultInstanceForType() {
        return c();
    }

    public fn getDescriptorForType() {
        return bh.A();
    }

    protected bJ internalGetFieldAccessorTable() {
        return bh.a().a(b2.class, c7.class);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.b2 e() {
        /*
        r3 = this;
        r0 = new com.google.b2;
        r1 = 0;
        r0.<init>(r3, r1);
        r1 = r3.g;
        r1 = r3.e;
        if (r1 != 0) goto L_0x002a;
    L_0x000c:
        r1 = r3.g;
        r1 = r1 & 1;
        r2 = 1;
        if (r1 != r2) goto L_0x0021;
    L_0x0013:
        r1 = r3.f;
        r1 = java.util.Collections.unmodifiableList(r1);
        r3.f = r1;
        r1 = r3.g;
        r1 = r1 & -2;
        r3.g = r1;
    L_0x0021:
        r1 = r3.f;
        com.google.b2.a(r0, r1);
        r1 = com.google.bA.b;
        if (r1 == 0) goto L_0x0033;
    L_0x002a:
        r1 = r3.e;
        r1 = r1.f();
        com.google.b2.a(r0, r1);
    L_0x0033:
        r3.f();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.c7.e():com.google.b2");
    }

    public fO m222build() {
        return h();
    }

    public c3 mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    private c7(ec ecVar) {
        super(ecVar);
        this.f = Collections.emptyList();
        a();
    }

    public c3 clone() {
        return g();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.c7 a(com.google.b2 r5) {
        /*
        r4 = this;
        r0 = 0;
        r1 = com.google.bA.b;
        r2 = com.google.b2.e();
        if (r5 != r2) goto L_0x000a;
    L_0x0009:
        return r4;
    L_0x000a:
        r2 = r4.e;
        if (r2 != 0) goto L_0x003f;
    L_0x000e:
        r2 = com.google.b2.b(r5);
        r2 = r2.isEmpty();
        if (r2 != 0) goto L_0x0079;
    L_0x0018:
        r2 = r4.f;
        r2 = r2.isEmpty();
        if (r2 == 0) goto L_0x002e;
    L_0x0020:
        r2 = com.google.b2.b(r5);
        r4.f = r2;
        r2 = r4.g;
        r2 = r2 & -2;
        r4.g = r2;
        if (r1 == 0) goto L_0x003a;
    L_0x002e:
        r4.j();
        r2 = r4.f;
        r3 = com.google.b2.b(r5);
        r2.addAll(r3);
    L_0x003a:
        r4.g();
        if (r1 == 0) goto L_0x0079;
    L_0x003f:
        r2 = com.google.b2.b(r5);
        r2 = r2.isEmpty();
        if (r2 != 0) goto L_0x0079;
    L_0x0049:
        r2 = r4.e;
        r2 = r2.i();
        if (r2 == 0) goto L_0x0070;
    L_0x0051:
        r2 = r4.e;
        r2.b();
        r4.e = r0;
        r2 = com.google.b2.b(r5);
        r4.f = r2;
        r2 = r4.g;
        r2 = r2 & -2;
        r4.g = r2;
        r2 = com.google.bL.d;
        if (r2 == 0) goto L_0x006c;
    L_0x0068:
        r0 = r4.i();
    L_0x006c:
        r4.e = r0;
        if (r1 == 0) goto L_0x0079;
    L_0x0070:
        r0 = r4.e;
        r1 = com.google.b2.b(r5);
        r0.a(r1);
    L_0x0079:
        r0 = r5.getUnknownFields();
        r4.a(r0);
        goto L_0x0009;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.c7.a(com.google.b2):com.google.c7");
    }
}
