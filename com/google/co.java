package com.google;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class co extends cJ implements iH {
    private int e;
    private fv f;
    private List g;
    private fv h;
    private fv i;
    private fv j;
    private List k;
    private Object l;
    private List m;
    private k n;
    private List o;
    private fv p;
    private cl q;
    private List r;

    private void x() {
        if ((this.e & 2) != 2) {
            this.k = new ArrayList(this.k);
            this.e |= 2;
        }
    }

    public Object m374clone() {
        return i();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.co a(com.google.cl r4) {
        /*
        r3 = this;
        r0 = com.google.bA.b;
        r1 = r3.n;
        if (r1 != 0) goto L_0x002f;
    L_0x0006:
        r1 = r3.e;
        r1 = r1 & 64;
        r2 = 64;
        if (r1 != r2) goto L_0x0028;
    L_0x000e:
        r1 = r3.q;
        r2 = com.google.cl.f();
        if (r1 == r2) goto L_0x0028;
    L_0x0016:
        r1 = r3.q;
        r1 = com.google.cl.b(r1);
        r1 = r1.a(r4);
        r1 = r1.g();
        r3.q = r1;
        if (r0 == 0) goto L_0x002a;
    L_0x0028:
        r3.q = r4;
    L_0x002a:
        r3.g();
        if (r0 == 0) goto L_0x0034;
    L_0x002f:
        r0 = r3.n;
        r0.a(r4);
    L_0x0034:
        r0 = r3.e;
        r0 = r0 | 64;
        r3.e = r0;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.co.a(com.google.cl):com.google.co");
    }

    public co a(ci ciVar) {
        if (ciVar instanceof br) {
            return a((br) ciVar);
        }
        super.mergeFrom(ciVar);
        return this;
    }

    public b6 a(int i) {
        return this.i == null ? (b6) this.g.get(i) : (b6) this.i.c(i);
    }

    private fv d() {
        if (this.j == null) {
            boolean z;
            List list = this.o;
            if ((this.e & 32) == 32) {
                z = true;
            } else {
                z = false;
            }
            this.j = new fv(list, z, e(), a());
            this.o = null;
        }
        return this.j;
    }

    private fv v() {
        if (this.h == null) {
            boolean z;
            List list = this.r;
            if ((this.e & 16) == 16) {
                z = true;
            } else {
                z = false;
            }
            this.h = new fv(list, z, e(), a());
            this.r = null;
        }
        return this.h;
    }

    public ci getDefaultInstanceForType() {
        return r();
    }

    private void p() {
        if ((this.e & 16) != 16) {
            this.r = new ArrayList(this.r);
            this.e |= 16;
        }
    }

    public c3 mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.br e() {
        /*
        r6 = this;
        r0 = 1;
        r2 = com.google.bA.b;
        r3 = new com.google.br;
        r1 = 0;
        r3.<init>(r6, r1);
        r4 = r6.e;
        r1 = 0;
        r5 = r4 & 1;
        if (r5 != r0) goto L_0x010d;
    L_0x0010:
        r1 = r6.l;
        com.google.br.a(r3, r1);
        r1 = r6.p;
        if (r1 != 0) goto L_0x0035;
    L_0x0019:
        r1 = r6.e;
        r1 = r1 & 2;
        r5 = 2;
        if (r1 != r5) goto L_0x002e;
    L_0x0020:
        r1 = r6.k;
        r1 = java.util.Collections.unmodifiableList(r1);
        r6.k = r1;
        r1 = r6.e;
        r1 = r1 & -3;
        r6.e = r1;
    L_0x002e:
        r1 = r6.k;
        com.google.br.d(r3, r1);
        if (r2 == 0) goto L_0x003e;
    L_0x0035:
        r1 = r6.p;
        r1 = r1.f();
        com.google.br.d(r3, r1);
    L_0x003e:
        r1 = r6.i;
        if (r1 != 0) goto L_0x005e;
    L_0x0042:
        r1 = r6.e;
        r1 = r1 & 4;
        r5 = 4;
        if (r1 != r5) goto L_0x0057;
    L_0x0049:
        r1 = r6.g;
        r1 = java.util.Collections.unmodifiableList(r1);
        r6.g = r1;
        r1 = r6.e;
        r1 = r1 & -5;
        r6.e = r1;
    L_0x0057:
        r1 = r6.g;
        com.google.br.b(r3, r1);
        if (r2 == 0) goto L_0x0067;
    L_0x005e:
        r1 = r6.i;
        r1 = r1.f();
        com.google.br.b(r3, r1);
    L_0x0067:
        r1 = r6.f;
        if (r1 != 0) goto L_0x0088;
    L_0x006b:
        r1 = r6.e;
        r1 = r1 & 8;
        r5 = 8;
        if (r1 != r5) goto L_0x0081;
    L_0x0073:
        r1 = r6.m;
        r1 = java.util.Collections.unmodifiableList(r1);
        r6.m = r1;
        r1 = r6.e;
        r1 = r1 & -9;
        r6.e = r1;
    L_0x0081:
        r1 = r6.m;
        com.google.br.e(r3, r1);
        if (r2 == 0) goto L_0x0091;
    L_0x0088:
        r1 = r6.f;
        r1 = r1.f();
        com.google.br.e(r3, r1);
    L_0x0091:
        r1 = r6.h;
        if (r1 != 0) goto L_0x00b2;
    L_0x0095:
        r1 = r6.e;
        r1 = r1 & 16;
        r5 = 16;
        if (r1 != r5) goto L_0x00ab;
    L_0x009d:
        r1 = r6.r;
        r1 = java.util.Collections.unmodifiableList(r1);
        r6.r = r1;
        r1 = r6.e;
        r1 = r1 & -17;
        r6.e = r1;
    L_0x00ab:
        r1 = r6.r;
        com.google.br.c(r3, r1);
        if (r2 == 0) goto L_0x00bb;
    L_0x00b2:
        r1 = r6.h;
        r1 = r1.f();
        com.google.br.c(r3, r1);
    L_0x00bb:
        r1 = r6.j;
        if (r1 != 0) goto L_0x00dc;
    L_0x00bf:
        r1 = r6.e;
        r1 = r1 & 32;
        r5 = 32;
        if (r1 != r5) goto L_0x00d5;
    L_0x00c7:
        r1 = r6.o;
        r1 = java.util.Collections.unmodifiableList(r1);
        r6.o = r1;
        r1 = r6.e;
        r1 = r1 & -33;
        r6.e = r1;
    L_0x00d5:
        r1 = r6.o;
        com.google.br.a(r3, r1);
        if (r2 == 0) goto L_0x00e5;
    L_0x00dc:
        r1 = r6.j;
        r1 = r1.f();
        com.google.br.a(r3, r1);
    L_0x00e5:
        r1 = r4 & 64;
        r4 = 64;
        if (r1 != r4) goto L_0x010b;
    L_0x00eb:
        r0 = r0 | 2;
        r1 = r0;
    L_0x00ee:
        r0 = r6.n;
        if (r0 != 0) goto L_0x00f9;
    L_0x00f2:
        r0 = r6.q;
        com.google.br.a(r3, r0);
        if (r2 == 0) goto L_0x0104;
    L_0x00f9:
        r0 = r6.n;
        r0 = r0.e();
        r0 = (com.google.cl) r0;
        com.google.br.a(r3, r0);
    L_0x0104:
        com.google.br.a(r3, r1);
        r6.f();
        return r3;
    L_0x010b:
        r1 = r0;
        goto L_0x00ee;
    L_0x010d:
        r0 = r1;
        goto L_0x0010;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.co.e():com.google.br");
    }

    private static co b() {
        return new co();
    }

    public il m378mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    private co() {
        this.l = "";
        this.k = Collections.emptyList();
        this.g = Collections.emptyList();
        this.m = Collections.emptyList();
        this.r = Collections.emptyList();
        this.o = Collections.emptyList();
        this.q = cl.f();
        w();
    }

    public final boolean isInitialized() {
        boolean z = bA.b;
        int i = 0;
        while (i < s()) {
            if (c(i).isInitialized()) {
                i++;
                if (z) {
                    break;
                }
            }
            return false;
        }
        i = 0;
        while (i < n()) {
            if (a(i).isInitialized()) {
                i++;
                if (z) {
                    break;
                }
            }
            return false;
        }
        i = 0;
        while (i < o()) {
            if (b(i).isInitialized()) {
                i++;
                if (z) {
                    break;
                }
            }
            return false;
        }
        i = 0;
        while (i < l()) {
            if (d(i).isInitialized()) {
                i++;
                if (z) {
                    break;
                }
            }
            return false;
        }
        if (!c() || j().isInitialized()) {
            return true;
        }
        return false;
    }

    public fO m375getDefaultInstanceForType() {
        return r();
    }

    private void q() {
        if ((this.e & 32) != 32) {
            this.o = new ArrayList(this.o);
            this.e |= 32;
        }
    }

    public int s() {
        if (this.p == null) {
            return this.k.size();
        }
        return this.p.d();
    }

    public boolean c() {
        return (this.e & 64) == 64;
    }

    public co i() {
        return b().a(e());
    }

    private fv m() {
        if (this.i == null) {
            boolean z;
            List list = this.g;
            if ((this.e & 4) == 4) {
                z = true;
            } else {
                z = false;
            }
            this.i = new fv(list, z, e(), a());
            this.g = null;
        }
        return this.i;
    }

    public ch m373clone() {
        return i();
    }

    protected bJ internalGetFieldAccessorTable() {
        return bh.x().a(br.class, co.class);
    }

    public ci buildPartial() {
        return e();
    }

    public c3 mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    public fn getDescriptorForType() {
        return bh.M();
    }

    public int l() {
        return this.h == null ? this.r.size() : this.h.d();
    }

    private fv h() {
        if (this.p == null) {
            boolean z;
            List list = this.k;
            if ((this.e & 2) == 2) {
                z = true;
            } else {
                z = false;
            }
            this.p = new fv(list, z, e(), a());
            this.k = null;
        }
        return this.p;
    }

    private void w() {
        if (bL.d) {
            h();
            m();
            u();
            v();
            d();
            f();
        }
    }

    public br r() {
        return br.a();
    }

    public fO m371buildPartial() {
        return e();
    }

    public c3 clone() {
        return i();
    }

    public b6 c(int i) {
        return this.p == null ? (b6) this.k.get(i) : (b6) this.p.c(i);
    }

    public int n() {
        return this.i == null ? this.g.size() : this.i.d();
    }

    public fl m377mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    private k f() {
        if (this.n == null) {
            this.n = new k(this.q, e(), a());
            this.q = null;
        }
        return this.n;
    }

    public ch m376mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    private void k() {
        if ((this.e & 4) != 4) {
            this.g = new ArrayList(this.g);
            this.e |= 4;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.co a(com.google.ad r5, com.google.h r6) {
        /*
        r4 = this;
        r2 = 0;
        r0 = com.google.br.m;	 Catch:{ fN -> 0x000f }
        r0 = r0.parsePartialFrom(r5, r6);	 Catch:{ fN -> 0x000f }
        r0 = (com.google.br) r0;	 Catch:{ fN -> 0x000f }
        if (r0 == 0) goto L_0x000e;
    L_0x000b:
        r4.a(r0);	 Catch:{ fN -> 0x0024 }
    L_0x000e:
        return r4;
    L_0x000f:
        r0 = move-exception;
        r1 = r0;
        r0 = r1.h();	 Catch:{ all -> 0x0026 }
        r0 = (com.google.br) r0;	 Catch:{ all -> 0x0026 }
        throw r1;	 Catch:{ all -> 0x0018 }
    L_0x0018:
        r1 = move-exception;
        r3 = r1;
        r1 = r0;
        r0 = r3;
    L_0x001c:
        if (r1 == 0) goto L_0x0021;
    L_0x001e:
        r4.a(r1);	 Catch:{ fN -> 0x0022 }
    L_0x0021:
        throw r0;
    L_0x0022:
        r0 = move-exception;
        throw r0;
    L_0x0024:
        r0 = move-exception;
        throw r0;
    L_0x0026:
        r0 = move-exception;
        r1 = r2;
        goto L_0x001c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.co.a(com.google.ad, com.google.h):com.google.co");
    }

    public cJ m372clone() {
        return i();
    }

    public ci build() {
        return a();
    }

    public fO m370build() {
        return a();
    }

    static co g() {
        return b();
    }

    public br b(int i) {
        return this.f == null ? (br) this.m.get(i) : (br) this.f.c(i);
    }

    private void t() {
        if ((this.e & 8) != 8) {
            this.m = new ArrayList(this.m);
            this.e |= 8;
        }
    }

    private co(ec ecVar) {
        super(ecVar);
        this.l = "";
        this.k = Collections.emptyList();
        this.g = Collections.emptyList();
        this.m = Collections.emptyList();
        this.r = Collections.emptyList();
        this.o = Collections.emptyList();
        this.q = cl.f();
        w();
    }

    private fv u() {
        if (this.f == null) {
            boolean z;
            List list = this.m;
            if ((this.e & 8) == 8) {
                z = true;
            } else {
                z = false;
            }
            this.f = new fv(list, z, e(), a());
            this.m = null;
        }
        return this.f;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.co a(com.google.br r5) {
        /*
        r4 = this;
        r1 = 0;
        r2 = com.google.bA.b;
        r0 = com.google.br.a();
        if (r5 != r0) goto L_0x000a;
    L_0x0009:
        return r4;
    L_0x000a:
        r0 = r5.b();
        if (r0 == 0) goto L_0x001f;
    L_0x0010:
        r0 = r4.e;
        r0 = r0 | 1;
        r4.e = r0;
        r0 = com.google.br.c(r5);
        r4.l = r0;
        r4.g();
    L_0x001f:
        r0 = r4.p;
        if (r0 != 0) goto L_0x0054;
    L_0x0023:
        r0 = com.google.br.f(r5);
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x008e;
    L_0x002d:
        r0 = r4.k;
        r0 = r0.isEmpty();
        if (r0 == 0) goto L_0x0043;
    L_0x0035:
        r0 = com.google.br.f(r5);
        r4.k = r0;
        r0 = r4.e;
        r0 = r0 & -3;
        r4.e = r0;
        if (r2 == 0) goto L_0x004f;
    L_0x0043:
        r4.x();
        r0 = r4.k;
        r3 = com.google.br.f(r5);
        r0.addAll(r3);
    L_0x004f:
        r4.g();
        if (r2 == 0) goto L_0x008e;
    L_0x0054:
        r0 = com.google.br.f(r5);
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x008e;
    L_0x005e:
        r0 = r4.p;
        r0 = r0.i();
        if (r0 == 0) goto L_0x0085;
    L_0x0066:
        r0 = r4.p;
        r0.b();
        r4.p = r1;
        r0 = com.google.br.f(r5);
        r4.k = r0;
        r0 = r4.e;
        r0 = r0 & -3;
        r4.e = r0;
        r0 = com.google.bL.d;
        if (r0 == 0) goto L_0x0260;
    L_0x007d:
        r0 = r4.h();
    L_0x0081:
        r4.p = r0;
        if (r2 == 0) goto L_0x008e;
    L_0x0085:
        r0 = r4.p;
        r3 = com.google.br.f(r5);
        r0.a(r3);
    L_0x008e:
        r0 = r4.i;
        if (r0 != 0) goto L_0x00c3;
    L_0x0092:
        r0 = com.google.br.d(r5);
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x00fd;
    L_0x009c:
        r0 = r4.g;
        r0 = r0.isEmpty();
        if (r0 == 0) goto L_0x00b2;
    L_0x00a4:
        r0 = com.google.br.d(r5);
        r4.g = r0;
        r0 = r4.e;
        r0 = r0 & -5;
        r4.e = r0;
        if (r2 == 0) goto L_0x00be;
    L_0x00b2:
        r4.k();
        r0 = r4.g;
        r3 = com.google.br.d(r5);
        r0.addAll(r3);
    L_0x00be:
        r4.g();
        if (r2 == 0) goto L_0x00fd;
    L_0x00c3:
        r0 = com.google.br.d(r5);
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x00fd;
    L_0x00cd:
        r0 = r4.i;
        r0 = r0.i();
        if (r0 == 0) goto L_0x00f4;
    L_0x00d5:
        r0 = r4.i;
        r0.b();
        r4.i = r1;
        r0 = com.google.br.d(r5);
        r4.g = r0;
        r0 = r4.e;
        r0 = r0 & -5;
        r4.e = r0;
        r0 = com.google.bL.d;
        if (r0 == 0) goto L_0x0263;
    L_0x00ec:
        r0 = r4.m();
    L_0x00f0:
        r4.i = r0;
        if (r2 == 0) goto L_0x00fd;
    L_0x00f4:
        r0 = r4.i;
        r3 = com.google.br.d(r5);
        r0.a(r3);
    L_0x00fd:
        r0 = r4.f;
        if (r0 != 0) goto L_0x0132;
    L_0x0101:
        r0 = com.google.br.a(r5);
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x016c;
    L_0x010b:
        r0 = r4.m;
        r0 = r0.isEmpty();
        if (r0 == 0) goto L_0x0121;
    L_0x0113:
        r0 = com.google.br.a(r5);
        r4.m = r0;
        r0 = r4.e;
        r0 = r0 & -9;
        r4.e = r0;
        if (r2 == 0) goto L_0x012d;
    L_0x0121:
        r4.t();
        r0 = r4.m;
        r3 = com.google.br.a(r5);
        r0.addAll(r3);
    L_0x012d:
        r4.g();
        if (r2 == 0) goto L_0x016c;
    L_0x0132:
        r0 = com.google.br.a(r5);
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x016c;
    L_0x013c:
        r0 = r4.f;
        r0 = r0.i();
        if (r0 == 0) goto L_0x0163;
    L_0x0144:
        r0 = r4.f;
        r0.b();
        r4.f = r1;
        r0 = com.google.br.a(r5);
        r4.m = r0;
        r0 = r4.e;
        r0 = r0 & -9;
        r4.e = r0;
        r0 = com.google.bL.d;
        if (r0 == 0) goto L_0x0266;
    L_0x015b:
        r0 = r4.u();
    L_0x015f:
        r4.f = r0;
        if (r2 == 0) goto L_0x016c;
    L_0x0163:
        r0 = r4.f;
        r3 = com.google.br.a(r5);
        r0.a(r3);
    L_0x016c:
        r0 = r4.h;
        if (r0 != 0) goto L_0x01a1;
    L_0x0170:
        r0 = com.google.br.b(r5);
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x01db;
    L_0x017a:
        r0 = r4.r;
        r0 = r0.isEmpty();
        if (r0 == 0) goto L_0x0190;
    L_0x0182:
        r0 = com.google.br.b(r5);
        r4.r = r0;
        r0 = r4.e;
        r0 = r0 & -17;
        r4.e = r0;
        if (r2 == 0) goto L_0x019c;
    L_0x0190:
        r4.p();
        r0 = r4.r;
        r3 = com.google.br.b(r5);
        r0.addAll(r3);
    L_0x019c:
        r4.g();
        if (r2 == 0) goto L_0x01db;
    L_0x01a1:
        r0 = com.google.br.b(r5);
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x01db;
    L_0x01ab:
        r0 = r4.h;
        r0 = r0.i();
        if (r0 == 0) goto L_0x01d2;
    L_0x01b3:
        r0 = r4.h;
        r0.b();
        r4.h = r1;
        r0 = com.google.br.b(r5);
        r4.r = r0;
        r0 = r4.e;
        r0 = r0 & -17;
        r4.e = r0;
        r0 = com.google.bL.d;
        if (r0 == 0) goto L_0x0269;
    L_0x01ca:
        r0 = r4.v();
    L_0x01ce:
        r4.h = r0;
        if (r2 == 0) goto L_0x01db;
    L_0x01d2:
        r0 = r4.h;
        r3 = com.google.br.b(r5);
        r0.a(r3);
    L_0x01db:
        r0 = r4.j;
        if (r0 != 0) goto L_0x0210;
    L_0x01df:
        r0 = com.google.br.g(r5);
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x024a;
    L_0x01e9:
        r0 = r4.o;
        r0 = r0.isEmpty();
        if (r0 == 0) goto L_0x01ff;
    L_0x01f1:
        r0 = com.google.br.g(r5);
        r4.o = r0;
        r0 = r4.e;
        r0 = r0 & -33;
        r4.e = r0;
        if (r2 == 0) goto L_0x020b;
    L_0x01ff:
        r4.q();
        r0 = r4.o;
        r3 = com.google.br.g(r5);
        r0.addAll(r3);
    L_0x020b:
        r4.g();
        if (r2 == 0) goto L_0x024a;
    L_0x0210:
        r0 = com.google.br.g(r5);
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x024a;
    L_0x021a:
        r0 = r4.j;
        r0 = r0.i();
        if (r0 == 0) goto L_0x0241;
    L_0x0222:
        r0 = r4.j;
        r0.b();
        r4.j = r1;
        r0 = com.google.br.g(r5);
        r4.o = r0;
        r0 = r4.e;
        r0 = r0 & -33;
        r4.e = r0;
        r0 = com.google.bL.d;
        if (r0 == 0) goto L_0x023d;
    L_0x0239:
        r1 = r4.d();
    L_0x023d:
        r4.j = r1;
        if (r2 == 0) goto L_0x024a;
    L_0x0241:
        r0 = r4.j;
        r1 = com.google.br.g(r5);
        r0.a(r1);
    L_0x024a:
        r0 = r5.k();
        if (r0 == 0) goto L_0x0257;
    L_0x0250:
        r0 = r5.w();
        r4.a(r0);
    L_0x0257:
        r0 = r5.getUnknownFields();
        r4.a(r0);
        goto L_0x0009;
    L_0x0260:
        r0 = r1;
        goto L_0x0081;
    L_0x0263:
        r0 = r1;
        goto L_0x00f0;
    L_0x0266:
        r0 = r1;
        goto L_0x015f;
    L_0x0269:
        r0 = r1;
        goto L_0x01ce;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.co.a(com.google.br):com.google.co");
    }

    public int o() {
        return this.f == null ? this.m.size() : this.f.d();
    }

    public bv d(int i) {
        return this.h == null ? (bv) this.r.get(i) : (bv) this.h.c(i);
    }

    public cl j() {
        if (this.n == null) {
            return this.q;
        }
        return (cl) this.n.c();
    }

    public br a() {
        Object e = e();
        if (e.isInitialized()) {
            return e;
        }
        throw a((ci) e);
    }

    co(ec ecVar, fm fmVar) {
        this(ecVar);
    }
}
