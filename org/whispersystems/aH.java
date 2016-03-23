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
import com.google.fv;
import com.google.h;
import com.google.il;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class aH extends cJ implements aX {
    private List e;
    private int f;
    private fv g;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.whispersystems.aH a(org.whispersystems.U r2) {
        /*
        r1 = this;
        r0 = r1.g;	 Catch:{ NullPointerException -> 0x000e }
        if (r0 != 0) goto L_0x001f;
    L_0x0004:
        if (r2 != 0) goto L_0x0010;
    L_0x0006:
        r0 = new java.lang.NullPointerException;	 Catch:{ NullPointerException -> 0x000c }
        r0.<init>();	 Catch:{ NullPointerException -> 0x000c }
        throw r0;	 Catch:{ NullPointerException -> 0x000c }
    L_0x000c:
        r0 = move-exception;
        throw r0;
    L_0x000e:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x000c }
    L_0x0010:
        r1.h();	 Catch:{ NullPointerException -> 0x0025 }
        r0 = r1.e;	 Catch:{ NullPointerException -> 0x0025 }
        r0.add(r2);	 Catch:{ NullPointerException -> 0x0025 }
        r1.g();	 Catch:{ NullPointerException -> 0x0025 }
        r0 = org.whispersystems.Y.r;	 Catch:{ NullPointerException -> 0x0025 }
        if (r0 == 0) goto L_0x0024;
    L_0x001f:
        r0 = r1.g;	 Catch:{ NullPointerException -> 0x0025 }
        r0.a(r2);	 Catch:{ NullPointerException -> 0x0025 }
    L_0x0024:
        return r1;
    L_0x0025:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.aH.a(org.whispersystems.U):org.whispersystems.aH");
    }

    protected bJ internalGetFieldAccessorTable() {
        return a5.C().a(T.class, aH.class);
    }

    public ch m1195clone() {
        return j();
    }

    public Object m1196clone() {
        return j();
    }

    public aH a(ci ciVar) {
        try {
            if (ciVar instanceof T) {
                this = a((T) ciVar);
            } else {
                super.mergeFrom(ciVar);
            }
            return this;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.whispersystems.aH a(org.whispersystems.T r5) {
        /*
        r4 = this;
        r0 = 0;
        r1 = org.whispersystems.Y.r;
        r2 = org.whispersystems.T.a();	 Catch:{ NullPointerException -> 0x000a }
        if (r5 != r2) goto L_0x000c;
    L_0x0009:
        return r4;
    L_0x000a:
        r0 = move-exception;
        throw r0;
    L_0x000c:
        r2 = r4.g;	 Catch:{ NullPointerException -> 0x0086 }
        if (r2 != 0) goto L_0x0041;
    L_0x0010:
        r2 = org.whispersystems.T.b(r5);	 Catch:{ NullPointerException -> 0x0088 }
        r2 = r2.isEmpty();	 Catch:{ NullPointerException -> 0x0088 }
        if (r2 != 0) goto L_0x007e;
    L_0x001a:
        r2 = r4.e;	 Catch:{ NullPointerException -> 0x008a }
        r2 = r2.isEmpty();	 Catch:{ NullPointerException -> 0x008a }
        if (r2 == 0) goto L_0x0030;
    L_0x0022:
        r2 = org.whispersystems.T.b(r5);	 Catch:{ NullPointerException -> 0x008c }
        r4.e = r2;	 Catch:{ NullPointerException -> 0x008c }
        r2 = r4.f;	 Catch:{ NullPointerException -> 0x008c }
        r2 = r2 & -2;
        r4.f = r2;	 Catch:{ NullPointerException -> 0x008c }
        if (r1 == 0) goto L_0x003c;
    L_0x0030:
        r4.h();	 Catch:{ NullPointerException -> 0x008c }
        r2 = r4.e;	 Catch:{ NullPointerException -> 0x008c }
        r3 = org.whispersystems.T.b(r5);	 Catch:{ NullPointerException -> 0x008c }
        r2.addAll(r3);	 Catch:{ NullPointerException -> 0x008c }
    L_0x003c:
        r4.g();	 Catch:{ NullPointerException -> 0x008e }
        if (r1 == 0) goto L_0x007e;
    L_0x0041:
        r2 = org.whispersystems.T.b(r5);	 Catch:{ NullPointerException -> 0x0090 }
        r2 = r2.isEmpty();	 Catch:{ NullPointerException -> 0x0090 }
        if (r2 != 0) goto L_0x007e;
    L_0x004b:
        r2 = r4.g;	 Catch:{ NullPointerException -> 0x0092 }
        r2 = r2.i();	 Catch:{ NullPointerException -> 0x0092 }
        if (r2 == 0) goto L_0x0075;
    L_0x0053:
        r2 = r4.g;	 Catch:{ NullPointerException -> 0x0094 }
        r2.b();	 Catch:{ NullPointerException -> 0x0094 }
        r2 = 0;
        r4.g = r2;	 Catch:{ NullPointerException -> 0x0094 }
        r2 = org.whispersystems.T.b(r5);	 Catch:{ NullPointerException -> 0x0094 }
        r4.e = r2;	 Catch:{ NullPointerException -> 0x0094 }
        r2 = r4.f;	 Catch:{ NullPointerException -> 0x0094 }
        r2 = r2 & -2;
        r4.f = r2;	 Catch:{ NullPointerException -> 0x0094 }
        r2 = org.whispersystems.T.i();	 Catch:{ NullPointerException -> 0x0094 }
        if (r2 == 0) goto L_0x0071;
    L_0x006d:
        r0 = r4.f();	 Catch:{ NullPointerException -> 0x0094 }
    L_0x0071:
        r4.g = r0;	 Catch:{ NullPointerException -> 0x0096 }
        if (r1 == 0) goto L_0x007e;
    L_0x0075:
        r0 = r4.g;	 Catch:{ NullPointerException -> 0x0096 }
        r1 = org.whispersystems.T.b(r5);	 Catch:{ NullPointerException -> 0x0096 }
        r0.a(r1);	 Catch:{ NullPointerException -> 0x0096 }
    L_0x007e:
        r0 = r5.getUnknownFields();
        r4.a(r0);
        goto L_0x0009;
    L_0x0086:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0088 }
    L_0x0088:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x008a }
    L_0x008a:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x008c }
    L_0x008c:
        r0 = move-exception;
        throw r0;
    L_0x008e:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0090 }
    L_0x0090:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0092 }
    L_0x0092:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0094 }
    L_0x0094:
        r0 = move-exception;
        throw r0;
    L_0x0096:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.aH.a(org.whispersystems.T):org.whispersystems.aH");
    }

    public il m1200mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public T a() {
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

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.whispersystems.aH a(com.google.ad r5, com.google.h r6) {
        /*
        r4 = this;
        r2 = 0;
        r0 = org.whispersystems.T.j;	 Catch:{ fN -> 0x0011 }
        r0 = r0.parsePartialFrom(r5, r6);	 Catch:{ fN -> 0x0011 }
        r0 = (org.whispersystems.T) r0;	 Catch:{ fN -> 0x0011 }
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
        r0 = (org.whispersystems.T) r0;	 Catch:{ all -> 0x0026 }
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
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.aH.a(com.google.ad, com.google.h):org.whispersystems.aH");
    }

    private fv f() {
        boolean z = true;
        try {
            if (this.g == null) {
                List list = this.e;
                if ((this.f & 1) != 1) {
                    z = false;
                }
                this.g = new fv(list, z, e(), a());
                this.e = null;
            }
            return this.g;
        } catch (NullPointerException e) {
            throw e;
        } catch (NullPointerException e2) {
            throw e2;
        }
    }

    private void d() {
        try {
            if (T.g()) {
                f();
            }
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public c3 mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    public c3 clone() {
        return j();
    }

    static aH l() {
        return e();
    }

    public ci build() {
        return a();
    }

    public aH j() {
        return e().a(i());
    }

    public fO m1197getDefaultInstanceForType() {
        return k();
    }

    public fn getDescriptorForType() {
        return a5.i();
    }

    public ci buildPartial() {
        return i();
    }

    public cJ m1194clone() {
        return j();
    }

    private aH() {
        this.e = Collections.emptyList();
        d();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.whispersystems.T i() {
        /*
        r3 = this;
        r0 = new org.whispersystems.T;
        r1 = 0;
        r0.<init>(r3, r1);
        r1 = r3.f;
        r1 = r3.g;	 Catch:{ NullPointerException -> 0x0037 }
        if (r1 != 0) goto L_0x002a;
    L_0x000c:
        r1 = r3.f;	 Catch:{ NullPointerException -> 0x0039 }
        r1 = r1 & 1;
        r2 = 1;
        if (r1 != r2) goto L_0x0021;
    L_0x0013:
        r1 = r3.e;	 Catch:{ NullPointerException -> 0x0039 }
        r1 = java.util.Collections.unmodifiableList(r1);	 Catch:{ NullPointerException -> 0x0039 }
        r3.e = r1;	 Catch:{ NullPointerException -> 0x0039 }
        r1 = r3.f;	 Catch:{ NullPointerException -> 0x0039 }
        r1 = r1 & -2;
        r3.f = r1;	 Catch:{ NullPointerException -> 0x0039 }
    L_0x0021:
        r1 = r3.e;	 Catch:{ NullPointerException -> 0x003b }
        org.whispersystems.T.a(r0, r1);	 Catch:{ NullPointerException -> 0x003b }
        r1 = org.whispersystems.Y.r;	 Catch:{ NullPointerException -> 0x003b }
        if (r1 == 0) goto L_0x0033;
    L_0x002a:
        r1 = r3.g;	 Catch:{ NullPointerException -> 0x003b }
        r1 = r1.f();	 Catch:{ NullPointerException -> 0x003b }
        org.whispersystems.T.a(r0, r1);	 Catch:{ NullPointerException -> 0x003b }
    L_0x0033:
        r3.f();
        return r0;
    L_0x0037:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0039 }
    L_0x0039:
        r0 = move-exception;
        throw r0;
    L_0x003b:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.aH.i():org.whispersystems.T");
    }

    public ch m1198mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public final boolean isInitialized() {
        return true;
    }

    private static aH e() {
        return new aH();
    }

    public fO m1192build() {
        return a();
    }

    public T k() {
        return T.a();
    }

    public fl m1199mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    private void h() {
        try {
            if ((this.f & 1) != 1) {
                this.e = new ArrayList(this.e);
                this.f |= 1;
            }
        } catch (NullPointerException e) {
            throw e;
        }
    }

    aH(ec ecVar, bs bsVar) {
        this(ecVar);
    }

    public fO m1193buildPartial() {
        return i();
    }

    private aH(ec ecVar) {
        super(ecVar);
        this.e = Collections.emptyList();
        d();
    }

    public c3 mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    public ci getDefaultInstanceForType() {
        return k();
    }
}
