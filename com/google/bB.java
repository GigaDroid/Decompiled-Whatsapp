package com.google;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

public final class bB extends bL implements hc {
    public static final int B = 4;
    public static final int C = 6;
    public static final int E = 11;
    public static final int F = 5;
    public static final int f = 3;
    public static final int g = 10;
    public static final int i = 8;
    public static final int l = 1;
    public static final int r = 9;
    private static final long serialVersionUID = 0;
    public static final int v = 2;
    private static final bB x;
    public static T y = null;
    public static final int z = 7;
    private List A;
    private List D;
    private Object e;
    private final eV h;
    private byte j;
    private cU k;
    private List m;
    private List n;
    private fs o;
    private Object p;
    private int q;
    private bg s;
    private List t;
    private List u;
    private int w;

    static Object j(bB bBVar) {
        return bBVar.e;
    }

    public T getParserForType() {
        return y;
    }

    static cU a(bB bBVar, cU cUVar) {
        bBVar.k = cUVar;
        return cUVar;
    }

    public cS J() {
        return F();
    }

    public static bB b(InputStream inputStream) {
        return (bB) y.b(inputStream);
    }

    public boolean k() {
        return (this.q & B) == B;
    }

    public int L() {
        return this.u.size();
    }

    public bg j() {
        return this.s;
    }

    protected Object writeReplace() {
        return super.writeReplace();
    }

    public static bB t() {
        return x;
    }

    public int n() {
        return this.o.size();
    }

    static List a(bB bBVar) {
        return bBVar.t;
    }

    static List b(bB bBVar, List list) {
        bBVar.A = list;
        return list;
    }

    private void c() {
        this.e = "";
        this.p = "";
        this.o = cy.a;
        this.D = Collections.emptyList();
        this.t = Collections.emptyList();
        this.A = Collections.emptyList();
        this.m = Collections.emptyList();
        this.u = Collections.emptyList();
        this.n = Collections.emptyList();
        this.k = cU.e();
        this.s = bg.d();
    }

    public il m146newBuilderForType() {
        return J();
    }

    static fs i(bB bBVar) {
        return bBVar.o;
    }

    public ci getDefaultInstanceForType() {
        return x();
    }

    public bx j(int i) {
        return (bx) this.u.get(i);
    }

    private bB(boolean z) {
        this.j = (byte) -1;
        this.w = -1;
        this.h = eV.h();
    }

    static Object a(bB bBVar, Object obj) {
        bBVar.p = obj;
        return obj;
    }

    public int p() {
        return this.D.size();
    }

    public List o() {
        return this.A;
    }

    public eh q() {
        return this.k;
    }

    public List e() {
        return this.A;
    }

    public int e(int i) {
        return ((Integer) this.t.get(i)).intValue();
    }

    protected fl newBuilderForType(ec ecVar) {
        return a(ecVar);
    }

    public static bB a(InputStream inputStream, h hVar) {
        return (bB) y.b(inputStream, hVar);
    }

    static List a(bB bBVar, List list) {
        bBVar.D = list;
        return list;
    }

    public bv b(int i) {
        return (bv) this.m.get(i);
    }

    static Object e(bB bBVar) {
        return bBVar.p;
    }

    public String l(int i) {
        return (String) this.o.get(i);
    }

    public cS A() {
        return g(this);
    }

    public int getSerializedSize() {
        int i = 0;
        boolean z = bA.b;
        int i2 = this.w;
        if (i2 != -1) {
            return i2;
        }
        if ((this.q & l) == l) {
            i2 = eb.c((int) l, w()) + 0;
        } else {
            i2 = 0;
        }
        if ((this.q & v) == v) {
            i2 += eb.c((int) v, u());
        }
        int i3 = 0;
        int i4 = 0;
        while (i3 < this.o.size()) {
            i4 += eb.c(this.o.a(i3));
            i3 += l;
            if (z) {
                break;
            }
        }
        i3 = 0;
        i4 = (i2 + i4) + (z().size() * l);
        while (i3 < this.A.size()) {
            i4 += eb.f((int) B, (fO) this.A.get(i3));
            i2 = i3 + l;
            if (z) {
                break;
            }
            i3 = i2;
        }
        i3 = 0;
        while (i3 < this.m.size()) {
            i4 += eb.f((int) F, (fO) this.m.get(i3));
            i2 = i3 + l;
            if (z) {
                break;
            }
            i3 = i2;
        }
        i3 = 0;
        while (i3 < this.u.size()) {
            i4 += eb.f((int) C, (fO) this.u.get(i3));
            i2 = i3 + l;
            if (z) {
                break;
            }
            i3 = i2;
        }
        i3 = 0;
        while (i3 < this.n.size()) {
            i4 += eb.f((int) z, (fO) this.n.get(i3));
            i2 = i3 + l;
            if (z) {
                break;
            }
            i3 = i2;
        }
        if ((this.q & B) == B) {
            i4 += eb.f((int) i, this.k);
        }
        if ((this.q & i) == i) {
            i4 += eb.f((int) r, this.s);
        }
        i3 = 0;
        int i5 = 0;
        while (i3 < this.D.size()) {
            i5 += eb.d(((Integer) this.D.get(i3)).intValue());
            i2 = i3 + l;
            if (z) {
                break;
            }
            i3 = i2;
        }
        i4 = (i4 + i5) + (y().size() * l);
        i3 = 0;
        while (i < this.t.size()) {
            i2 = eb.d(((Integer) this.t.get(i)).intValue()) + i3;
            i += l;
            if (z) {
                break;
            }
            i3 = i2;
        }
        i2 = i3;
        i2 = ((i2 + i4) + (i().size() * l)) + getUnknownFields().getSerializedSize();
        this.w = i2;
        return i2;
    }

    public List I() {
        return this.n;
    }

    public List h() {
        return this.u;
    }

    public String g() {
        Object obj = this.p;
        if (obj instanceof String) {
            return (String) obj;
        }
        hx hxVar = (hx) obj;
        String e = hxVar.e();
        if (hxVar.d()) {
            this.p = e;
        }
        return e;
    }

    static {
        y = new gm();
        x = new bB(true);
        x.c();
    }

    bB(cJ cJVar, fm fmVar) {
        this(cJVar);
    }

    public int d() {
        return this.m.size();
    }

    public List z() {
        return this.o;
    }

    public iH k(int i) {
        return (iH) this.A.get(i);
    }

    public int a() {
        return this.t.size();
    }

    public fl toBuilder() {
        return A();
    }

    protected cS a(ec ecVar) {
        return new cS(ecVar, null);
    }

    public hx w() {
        Object obj = this.e;
        if (!(obj instanceof String)) {
            return (hx) obj;
        }
        hx a = hx.a((String) obj);
        this.e = a;
        return a;
    }

    public fl newBuilderForType() {
        return J();
    }

    public boolean C() {
        return (this.q & i) == i;
    }

    public br a(int i) {
        return (br) this.A.get(i);
    }

    public fO m145getDefaultInstanceForType() {
        return x();
    }

    public static bB a(hx hxVar) {
        return (bB) y.a(hxVar);
    }

    public List E() {
        return this.m;
    }

    public boolean B() {
        return (this.q & v) == v;
    }

    public hx u() {
        Object obj = this.p;
        if (!(obj instanceof String)) {
            return (hx) obj;
        }
        hx a = hx.a((String) obj);
        this.p = a;
        return a;
    }

    public gY i(int i) {
        return (gY) this.m.get(i);
    }

    static bg a(bB bBVar, bg bgVar) {
        bBVar.s = bgVar;
        return bgVar;
    }

    static List h(bB bBVar) {
        return bBVar.u;
    }

    public List G() {
        return this.u;
    }

    public hx c(int i) {
        return this.o.a(i);
    }

    public static bB a(byte[] bArr) {
        return (bB) y.a(bArr);
    }

    static List f(bB bBVar, List list) {
        bBVar.m = list;
        return list;
    }

    public bD f(int i) {
        return (bD) this.u.get(i);
    }

    static Object b(bB bBVar, Object obj) {
        bBVar.e = obj;
        return obj;
    }

    public ef s() {
        return this.s;
    }

    static fs a(bB bBVar, fs fsVar) {
        bBVar.o = fsVar;
        return fsVar;
    }

    public boolean l() {
        return (this.q & l) == l;
    }

    public static bB b(InputStream inputStream, h hVar) {
        return (bB) y.a(inputStream, hVar);
    }

    public static bB a(ad adVar, h hVar) {
        return (bB) y.a(adVar, hVar);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private bB(com.google.ad r13, com.google.h r14) {
        /*
        r12 = this;
        r11 = 64;
        r10 = 32;
        r9 = 16;
        r8 = 4;
        r7 = 8;
        r4 = com.google.bA.b;
        r12.<init>();
        r0 = -1;
        r12.j = r0;
        r0 = -1;
        r12.w = r0;
        r12.c();
        r1 = 0;
        r5 = com.google.eV.g();
        r0 = 0;
    L_0x001d:
        if (r0 != 0) goto L_0x01cd;
    L_0x001f:
        r2 = r13.z();	 Catch:{ fN -> 0x0237, IOException -> 0x02a7 }
        switch(r2) {
            case 0: goto L_0x0230;
            case 10: goto L_0x002f;
            case 18: goto L_0x003d;
            case 26: goto L_0x004b;
            case 34: goto L_0x0063;
            case 42: goto L_0x007d;
            case 50: goto L_0x0097;
            case 58: goto L_0x00b3;
            case 66: goto L_0x00cf;
            case 74: goto L_0x02ef;
            case 80: goto L_0x012b;
            case 82: goto L_0x0147;
            case 88: goto L_0x017c;
            case 90: goto L_0x0198;
            default: goto L_0x0026;
        };
    L_0x0026:
        r2 = r12.a(r13, r5, r14, r2);	 Catch:{ fN -> 0x0235, IOException -> 0x02a7 }
        if (r2 != 0) goto L_0x01cb;
    L_0x002c:
        r0 = 1;
        if (r4 == 0) goto L_0x01cb;
    L_0x002f:
        r2 = r12.q;	 Catch:{ fN -> 0x02a1, IOException -> 0x02a7 }
        r2 = r2 | 1;
        r12.q = r2;	 Catch:{ fN -> 0x02a1, IOException -> 0x02a7 }
        r2 = r13.q();	 Catch:{ fN -> 0x02a1, IOException -> 0x02a7 }
        r12.e = r2;	 Catch:{ fN -> 0x02a1, IOException -> 0x02a7 }
        if (r4 == 0) goto L_0x01cb;
    L_0x003d:
        r2 = r12.q;	 Catch:{ fN -> 0x02a3, IOException -> 0x02a7 }
        r2 = r2 | 2;
        r12.q = r2;	 Catch:{ fN -> 0x02a3, IOException -> 0x02a7 }
        r2 = r13.q();	 Catch:{ fN -> 0x02a3, IOException -> 0x02a7 }
        r12.p = r2;	 Catch:{ fN -> 0x02a3, IOException -> 0x02a7 }
        if (r4 == 0) goto L_0x01cb;
    L_0x004b:
        r2 = r1 & 4;
        if (r2 == r8) goto L_0x0058;
    L_0x004f:
        r2 = new com.google.cy;	 Catch:{ fN -> 0x0237, IOException -> 0x02a7 }
        r2.<init>();	 Catch:{ fN -> 0x0237, IOException -> 0x02a7 }
        r12.o = r2;	 Catch:{ fN -> 0x0237, IOException -> 0x02a7 }
        r1 = r1 | 4;
    L_0x0058:
        r2 = r12.o;	 Catch:{ fN -> 0x02b6, IOException -> 0x02a7 }
        r3 = r13.q();	 Catch:{ fN -> 0x02b6, IOException -> 0x02a7 }
        r2.a(r3);	 Catch:{ fN -> 0x02b6, IOException -> 0x02a7 }
        if (r4 == 0) goto L_0x01cb;
    L_0x0063:
        r2 = r1 & 32;
        if (r2 == r10) goto L_0x0070;
    L_0x0067:
        r2 = new java.util.ArrayList;	 Catch:{ fN -> 0x0237, IOException -> 0x02a7 }
        r2.<init>();	 Catch:{ fN -> 0x0237, IOException -> 0x02a7 }
        r12.A = r2;	 Catch:{ fN -> 0x0237, IOException -> 0x02a7 }
        r1 = r1 | 32;
    L_0x0070:
        r2 = r12.A;	 Catch:{ fN -> 0x02b8, IOException -> 0x02a7 }
        r3 = com.google.br.m;	 Catch:{ fN -> 0x02b8, IOException -> 0x02a7 }
        r3 = r13.a(r3, r14);	 Catch:{ fN -> 0x02b8, IOException -> 0x02a7 }
        r2.add(r3);	 Catch:{ fN -> 0x02b8, IOException -> 0x02a7 }
        if (r4 == 0) goto L_0x01cb;
    L_0x007d:
        r2 = r1 & 64;
        if (r2 == r11) goto L_0x008a;
    L_0x0081:
        r2 = new java.util.ArrayList;	 Catch:{ fN -> 0x0237, IOException -> 0x02a7 }
        r2.<init>();	 Catch:{ fN -> 0x0237, IOException -> 0x02a7 }
        r12.m = r2;	 Catch:{ fN -> 0x0237, IOException -> 0x02a7 }
        r1 = r1 | 64;
    L_0x008a:
        r2 = r12.m;	 Catch:{ fN -> 0x02ba, IOException -> 0x02a7 }
        r3 = com.google.bv.k;	 Catch:{ fN -> 0x02ba, IOException -> 0x02a7 }
        r3 = r13.a(r3, r14);	 Catch:{ fN -> 0x02ba, IOException -> 0x02a7 }
        r2.add(r3);	 Catch:{ fN -> 0x02ba, IOException -> 0x02a7 }
        if (r4 == 0) goto L_0x01cb;
    L_0x0097:
        r2 = r1 & 128;
        r3 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        if (r2 == r3) goto L_0x00a6;
    L_0x009d:
        r2 = new java.util.ArrayList;	 Catch:{ fN -> 0x0237, IOException -> 0x02a7 }
        r2.<init>();	 Catch:{ fN -> 0x0237, IOException -> 0x02a7 }
        r12.u = r2;	 Catch:{ fN -> 0x0237, IOException -> 0x02a7 }
        r1 = r1 | 128;
    L_0x00a6:
        r2 = r12.u;	 Catch:{ fN -> 0x02bc, IOException -> 0x02a7 }
        r3 = com.google.bx.f;	 Catch:{ fN -> 0x02bc, IOException -> 0x02a7 }
        r3 = r13.a(r3, r14);	 Catch:{ fN -> 0x02bc, IOException -> 0x02a7 }
        r2.add(r3);	 Catch:{ fN -> 0x02bc, IOException -> 0x02a7 }
        if (r4 == 0) goto L_0x01cb;
    L_0x00b3:
        r2 = r1 & 256;
        r3 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        if (r2 == r3) goto L_0x00c2;
    L_0x00b9:
        r2 = new java.util.ArrayList;	 Catch:{ fN -> 0x0237, IOException -> 0x02a7 }
        r2.<init>();	 Catch:{ fN -> 0x0237, IOException -> 0x02a7 }
        r12.n = r2;	 Catch:{ fN -> 0x0237, IOException -> 0x02a7 }
        r1 = r1 | 256;
    L_0x00c2:
        r2 = r12.n;	 Catch:{ fN -> 0x0237, IOException -> 0x02a7 }
        r3 = com.google.b6.z;	 Catch:{ fN -> 0x0237, IOException -> 0x02a7 }
        r3 = r13.a(r3, r14);	 Catch:{ fN -> 0x0237, IOException -> 0x02a7 }
        r2.add(r3);	 Catch:{ fN -> 0x0237, IOException -> 0x02a7 }
        if (r4 == 0) goto L_0x01cb;
    L_0x00cf:
        r2 = r0;
        r0 = 0;
        r3 = r12.q;	 Catch:{ fN -> 0x0237, IOException -> 0x02a7 }
        r3 = r3 & 4;
        if (r3 != r8) goto L_0x02ec;
    L_0x00d7:
        r0 = r12.k;	 Catch:{ fN -> 0x0237, IOException -> 0x02a7 }
        r0 = r0.x();	 Catch:{ fN -> 0x0237, IOException -> 0x02a7 }
        r3 = r0;
    L_0x00de:
        r0 = com.google.cU.s;	 Catch:{ fN -> 0x02be, IOException -> 0x02a7 }
        r0 = r13.a(r0, r14);	 Catch:{ fN -> 0x02be, IOException -> 0x02a7 }
        r0 = (com.google.cU) r0;	 Catch:{ fN -> 0x02be, IOException -> 0x02a7 }
        r12.k = r0;	 Catch:{ fN -> 0x02be, IOException -> 0x02a7 }
        if (r3 == 0) goto L_0x00f5;
    L_0x00ea:
        r0 = r12.k;	 Catch:{ fN -> 0x02be, IOException -> 0x02a7 }
        r3.a(r0);	 Catch:{ fN -> 0x02be, IOException -> 0x02a7 }
        r0 = r3.e();	 Catch:{ fN -> 0x02be, IOException -> 0x02a7 }
        r12.k = r0;	 Catch:{ fN -> 0x02be, IOException -> 0x02a7 }
    L_0x00f5:
        r0 = r12.q;	 Catch:{ fN -> 0x0237, IOException -> 0x02a7 }
        r0 = r0 | 4;
        r12.q = r0;	 Catch:{ fN -> 0x0237, IOException -> 0x02a7 }
        if (r4 == 0) goto L_0x02e6;
    L_0x00fd:
        r0 = 0;
        r3 = r12.q;	 Catch:{ fN -> 0x0237, IOException -> 0x02a7 }
        r3 = r3 & 8;
        if (r3 != r7) goto L_0x02e9;
    L_0x0104:
        r0 = r12.s;	 Catch:{ fN -> 0x0237, IOException -> 0x02a7 }
        r0 = r0.j();	 Catch:{ fN -> 0x0237, IOException -> 0x02a7 }
        r3 = r0;
    L_0x010b:
        r0 = com.google.bg.g;	 Catch:{ fN -> 0x02c0, IOException -> 0x02a7 }
        r0 = r13.a(r0, r14);	 Catch:{ fN -> 0x02c0, IOException -> 0x02a7 }
        r0 = (com.google.bg) r0;	 Catch:{ fN -> 0x02c0, IOException -> 0x02a7 }
        r12.s = r0;	 Catch:{ fN -> 0x02c0, IOException -> 0x02a7 }
        if (r3 == 0) goto L_0x0122;
    L_0x0117:
        r0 = r12.s;	 Catch:{ fN -> 0x02c0, IOException -> 0x02a7 }
        r3.a(r0);	 Catch:{ fN -> 0x02c0, IOException -> 0x02a7 }
        r0 = r3.h();	 Catch:{ fN -> 0x02c0, IOException -> 0x02a7 }
        r12.s = r0;	 Catch:{ fN -> 0x02c0, IOException -> 0x02a7 }
    L_0x0122:
        r0 = r12.q;	 Catch:{ fN -> 0x02c2, IOException -> 0x02a7 }
        r0 = r0 | 8;
        r12.q = r0;	 Catch:{ fN -> 0x02c2, IOException -> 0x02a7 }
        if (r4 == 0) goto L_0x02e6;
    L_0x012a:
        r0 = r2;
    L_0x012b:
        r2 = r1 & 8;
        if (r2 == r7) goto L_0x0138;
    L_0x012f:
        r2 = new java.util.ArrayList;	 Catch:{ fN -> 0x0237, IOException -> 0x02a7 }
        r2.<init>();	 Catch:{ fN -> 0x0237, IOException -> 0x02a7 }
        r12.D = r2;	 Catch:{ fN -> 0x0237, IOException -> 0x02a7 }
        r1 = r1 | 8;
    L_0x0138:
        r2 = r12.D;	 Catch:{ fN -> 0x0237, IOException -> 0x02a7 }
        r3 = r13.i();	 Catch:{ fN -> 0x0237, IOException -> 0x02a7 }
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ fN -> 0x0237, IOException -> 0x02a7 }
        r2.add(r3);	 Catch:{ fN -> 0x0237, IOException -> 0x02a7 }
        if (r4 == 0) goto L_0x01cb;
    L_0x0147:
        r2 = r13.n();	 Catch:{ fN -> 0x0237, IOException -> 0x02a7 }
        r2 = r13.b(r2);	 Catch:{ fN -> 0x0237, IOException -> 0x02a7 }
        r3 = r1 & 8;
        if (r3 == r7) goto L_0x0162;
    L_0x0153:
        r3 = r13.e();	 Catch:{ fN -> 0x02c4, IOException -> 0x02a7 }
        if (r3 <= 0) goto L_0x0162;
    L_0x0159:
        r3 = new java.util.ArrayList;	 Catch:{ fN -> 0x0237, IOException -> 0x02a7 }
        r3.<init>();	 Catch:{ fN -> 0x0237, IOException -> 0x02a7 }
        r12.D = r3;	 Catch:{ fN -> 0x0237, IOException -> 0x02a7 }
        r1 = r1 | 8;
    L_0x0162:
        r3 = r13.e();	 Catch:{ fN -> 0x0237, IOException -> 0x02a7 }
        if (r3 <= 0) goto L_0x0177;
    L_0x0168:
        r3 = r12.D;	 Catch:{ fN -> 0x0237, IOException -> 0x02a7 }
        r6 = r13.i();	 Catch:{ fN -> 0x0237, IOException -> 0x02a7 }
        r6 = java.lang.Integer.valueOf(r6);	 Catch:{ fN -> 0x0237, IOException -> 0x02a7 }
        r3.add(r6);	 Catch:{ fN -> 0x0237, IOException -> 0x02a7 }
        if (r4 == 0) goto L_0x0162;
    L_0x0177:
        r13.g(r2);	 Catch:{ fN -> 0x02c6, IOException -> 0x02a7 }
        if (r4 == 0) goto L_0x01cb;
    L_0x017c:
        r2 = r1 & 16;
        if (r2 == r9) goto L_0x0189;
    L_0x0180:
        r2 = new java.util.ArrayList;	 Catch:{ fN -> 0x0237, IOException -> 0x02a7 }
        r2.<init>();	 Catch:{ fN -> 0x0237, IOException -> 0x02a7 }
        r12.t = r2;	 Catch:{ fN -> 0x0237, IOException -> 0x02a7 }
        r1 = r1 | 16;
    L_0x0189:
        r2 = r12.t;	 Catch:{ fN -> 0x0237, IOException -> 0x02a7 }
        r3 = r13.i();	 Catch:{ fN -> 0x0237, IOException -> 0x02a7 }
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ fN -> 0x0237, IOException -> 0x02a7 }
        r2.add(r3);	 Catch:{ fN -> 0x0237, IOException -> 0x02a7 }
        if (r4 == 0) goto L_0x01cb;
    L_0x0198:
        r2 = r13.n();	 Catch:{ fN -> 0x0237, IOException -> 0x02a7 }
        r2 = r13.b(r2);	 Catch:{ fN -> 0x0237, IOException -> 0x02a7 }
        r3 = r1 & 16;
        if (r3 == r9) goto L_0x01b3;
    L_0x01a4:
        r3 = r13.e();	 Catch:{ fN -> 0x02c8, IOException -> 0x02a7 }
        if (r3 <= 0) goto L_0x01b3;
    L_0x01aa:
        r3 = new java.util.ArrayList;	 Catch:{ fN -> 0x0237, IOException -> 0x02a7 }
        r3.<init>();	 Catch:{ fN -> 0x0237, IOException -> 0x02a7 }
        r12.t = r3;	 Catch:{ fN -> 0x0237, IOException -> 0x02a7 }
        r1 = r1 | 16;
    L_0x01b3:
        r3 = r13.e();	 Catch:{ fN -> 0x0237, IOException -> 0x02a7 }
        if (r3 <= 0) goto L_0x01c8;
    L_0x01b9:
        r3 = r12.t;	 Catch:{ fN -> 0x0237, IOException -> 0x02a7 }
        r6 = r13.i();	 Catch:{ fN -> 0x0237, IOException -> 0x02a7 }
        r6 = java.lang.Integer.valueOf(r6);	 Catch:{ fN -> 0x0237, IOException -> 0x02a7 }
        r3.add(r6);	 Catch:{ fN -> 0x0237, IOException -> 0x02a7 }
        if (r4 == 0) goto L_0x01b3;
    L_0x01c8:
        r13.g(r2);	 Catch:{ fN -> 0x0237, IOException -> 0x02a7 }
    L_0x01cb:
        if (r4 == 0) goto L_0x001d;
    L_0x01cd:
        r0 = r1 & 4;
        if (r0 != r8) goto L_0x01da;
    L_0x01d1:
        r0 = new com.google.Z;	 Catch:{ fN -> 0x02d8 }
        r2 = r12.o;	 Catch:{ fN -> 0x02d8 }
        r0.<init>(r2);	 Catch:{ fN -> 0x02d8 }
        r12.o = r0;	 Catch:{ fN -> 0x02d8 }
    L_0x01da:
        r0 = r1 & 32;
        if (r0 != r10) goto L_0x01e6;
    L_0x01de:
        r0 = r12.A;	 Catch:{ fN -> 0x02da }
        r0 = java.util.Collections.unmodifiableList(r0);	 Catch:{ fN -> 0x02da }
        r12.A = r0;	 Catch:{ fN -> 0x02da }
    L_0x01e6:
        r0 = r1 & 64;
        if (r0 != r11) goto L_0x01f2;
    L_0x01ea:
        r0 = r12.m;	 Catch:{ fN -> 0x02dc }
        r0 = java.util.Collections.unmodifiableList(r0);	 Catch:{ fN -> 0x02dc }
        r12.m = r0;	 Catch:{ fN -> 0x02dc }
    L_0x01f2:
        r0 = r1 & 128;
        r2 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        if (r0 != r2) goto L_0x0200;
    L_0x01f8:
        r0 = r12.u;	 Catch:{ fN -> 0x02de }
        r0 = java.util.Collections.unmodifiableList(r0);	 Catch:{ fN -> 0x02de }
        r12.u = r0;	 Catch:{ fN -> 0x02de }
    L_0x0200:
        r0 = r1 & 256;
        r2 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        if (r0 != r2) goto L_0x020e;
    L_0x0206:
        r0 = r12.n;	 Catch:{ fN -> 0x02e0 }
        r0 = java.util.Collections.unmodifiableList(r0);	 Catch:{ fN -> 0x02e0 }
        r12.n = r0;	 Catch:{ fN -> 0x02e0 }
    L_0x020e:
        r0 = r1 & 8;
        if (r0 != r7) goto L_0x021a;
    L_0x0212:
        r0 = r12.D;	 Catch:{ fN -> 0x02e2 }
        r0 = java.util.Collections.unmodifiableList(r0);	 Catch:{ fN -> 0x02e2 }
        r12.D = r0;	 Catch:{ fN -> 0x02e2 }
    L_0x021a:
        r0 = r1 & 16;
        if (r0 != r9) goto L_0x0226;
    L_0x021e:
        r0 = r12.t;	 Catch:{ fN -> 0x02e4 }
        r0 = java.util.Collections.unmodifiableList(r0);	 Catch:{ fN -> 0x02e4 }
        r12.t = r0;	 Catch:{ fN -> 0x02e4 }
    L_0x0226:
        r0 = r5.d();
        r12.h = r0;
        r12.b();
        return;
    L_0x0230:
        r0 = 1;
        if (r4 == 0) goto L_0x01cb;
    L_0x0233:
        goto L_0x0026;
    L_0x0235:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0237, IOException -> 0x02a7 }
    L_0x0237:
        r0 = move-exception;
        r0 = r0.a(r12);	 Catch:{ all -> 0x023d }
        throw r0;	 Catch:{ all -> 0x023d }
    L_0x023d:
        r0 = move-exception;
        r2 = r1 & 4;
        if (r2 != r8) goto L_0x024b;
    L_0x0242:
        r2 = new com.google.Z;	 Catch:{ fN -> 0x02ca }
        r3 = r12.o;	 Catch:{ fN -> 0x02ca }
        r2.<init>(r3);	 Catch:{ fN -> 0x02ca }
        r12.o = r2;	 Catch:{ fN -> 0x02ca }
    L_0x024b:
        r2 = r1 & 32;
        if (r2 != r10) goto L_0x0257;
    L_0x024f:
        r2 = r12.A;	 Catch:{ fN -> 0x02cc }
        r2 = java.util.Collections.unmodifiableList(r2);	 Catch:{ fN -> 0x02cc }
        r12.A = r2;	 Catch:{ fN -> 0x02cc }
    L_0x0257:
        r2 = r1 & 64;
        if (r2 != r11) goto L_0x0263;
    L_0x025b:
        r2 = r12.m;	 Catch:{ fN -> 0x02ce }
        r2 = java.util.Collections.unmodifiableList(r2);	 Catch:{ fN -> 0x02ce }
        r12.m = r2;	 Catch:{ fN -> 0x02ce }
    L_0x0263:
        r2 = r1 & 128;
        r3 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        if (r2 != r3) goto L_0x0271;
    L_0x0269:
        r2 = r12.u;	 Catch:{ fN -> 0x02d0 }
        r2 = java.util.Collections.unmodifiableList(r2);	 Catch:{ fN -> 0x02d0 }
        r12.u = r2;	 Catch:{ fN -> 0x02d0 }
    L_0x0271:
        r2 = r1 & 256;
        r3 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        if (r2 != r3) goto L_0x027f;
    L_0x0277:
        r2 = r12.n;	 Catch:{ fN -> 0x02d2 }
        r2 = java.util.Collections.unmodifiableList(r2);	 Catch:{ fN -> 0x02d2 }
        r12.n = r2;	 Catch:{ fN -> 0x02d2 }
    L_0x027f:
        r2 = r1 & 8;
        if (r2 != r7) goto L_0x028b;
    L_0x0283:
        r2 = r12.D;	 Catch:{ fN -> 0x02d4 }
        r2 = java.util.Collections.unmodifiableList(r2);	 Catch:{ fN -> 0x02d4 }
        r12.D = r2;	 Catch:{ fN -> 0x02d4 }
    L_0x028b:
        r1 = r1 & 16;
        if (r1 != r9) goto L_0x0297;
    L_0x028f:
        r1 = r12.t;	 Catch:{ fN -> 0x02d6 }
        r1 = java.util.Collections.unmodifiableList(r1);	 Catch:{ fN -> 0x02d6 }
        r12.t = r1;	 Catch:{ fN -> 0x02d6 }
    L_0x0297:
        r1 = r5.d();
        r12.h = r1;
        r12.b();
        throw r0;
    L_0x02a1:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x02a3, IOException -> 0x02a7 }
    L_0x02a3:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x02a5, IOException -> 0x02a7 }
    L_0x02a5:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0237, IOException -> 0x02a7 }
    L_0x02a7:
        r0 = move-exception;
        r2 = new com.google.fN;	 Catch:{ all -> 0x023d }
        r0 = r0.getMessage();	 Catch:{ all -> 0x023d }
        r2.<init>(r0);	 Catch:{ all -> 0x023d }
        r0 = r2.a(r12);	 Catch:{ all -> 0x023d }
        throw r0;	 Catch:{ all -> 0x023d }
    L_0x02b6:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0237, IOException -> 0x02a7 }
    L_0x02b8:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0237, IOException -> 0x02a7 }
    L_0x02ba:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0237, IOException -> 0x02a7 }
    L_0x02bc:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0237, IOException -> 0x02a7 }
    L_0x02be:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0237, IOException -> 0x02a7 }
    L_0x02c0:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0237, IOException -> 0x02a7 }
    L_0x02c2:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0237, IOException -> 0x02a7 }
    L_0x02c4:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0237, IOException -> 0x02a7 }
    L_0x02c6:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0237, IOException -> 0x02a7 }
    L_0x02c8:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0237, IOException -> 0x02a7 }
    L_0x02ca:
        r0 = move-exception;
        throw r0;
    L_0x02cc:
        r0 = move-exception;
        throw r0;
    L_0x02ce:
        r0 = move-exception;
        throw r0;
    L_0x02d0:
        r0 = move-exception;
        throw r0;
    L_0x02d2:
        r0 = move-exception;
        throw r0;
    L_0x02d4:
        r0 = move-exception;
        throw r0;
    L_0x02d6:
        r0 = move-exception;
        throw r0;
    L_0x02d8:
        r0 = move-exception;
        throw r0;
    L_0x02da:
        r0 = move-exception;
        throw r0;
    L_0x02dc:
        r0 = move-exception;
        throw r0;
    L_0x02de:
        r0 = move-exception;
        throw r0;
    L_0x02e0:
        r0 = move-exception;
        throw r0;
    L_0x02e2:
        r0 = move-exception;
        throw r0;
    L_0x02e4:
        r0 = move-exception;
        throw r0;
    L_0x02e6:
        r0 = r2;
        goto L_0x01cb;
    L_0x02e9:
        r3 = r0;
        goto L_0x010b;
    L_0x02ec:
        r3 = r0;
        goto L_0x00de;
    L_0x02ef:
        r2 = r0;
        goto L_0x00fd;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.bB.<init>(com.google.ad, com.google.h):void");
    }

    public List i() {
        return this.t;
    }

    public int h(int i) {
        return ((Integer) this.D.get(i)).intValue();
    }

    public cU r() {
        return this.k;
    }

    public bB x() {
        return x;
    }

    public List D() {
        return this.n;
    }

    static List f(bB bBVar) {
        return bBVar.D;
    }

    public static bB a(InputStream inputStream) {
        return (bB) y.a(inputStream);
    }

    public static bB a(hx hxVar, h hVar) {
        return (bB) y.b(hxVar, hVar);
    }

    public il m147toBuilder() {
        return A();
    }

    public static bB a(byte[] bArr, h hVar) {
        return (bB) y.a(bArr, hVar);
    }

    public List y() {
        return this.D;
    }

    public cQ d(int i) {
        return (cQ) this.n.get(i);
    }

    public void writeTo(eb ebVar) {
        int i = 0;
        boolean z = bA.b;
        getSerializedSize();
        if ((this.q & l) == l) {
            ebVar.d((int) l, w());
        }
        if ((this.q & v) == v) {
            ebVar.d((int) v, u());
        }
        int i2 = 0;
        while (i2 < this.o.size()) {
            ebVar.d((int) f, this.o.a(i2));
            i2 += l;
            if (z) {
                break;
            }
        }
        int i3 = 0;
        while (i3 < this.A.size()) {
            ebVar.e((int) B, (fO) this.A.get(i3));
            i2 = i3 + l;
            if (z) {
                break;
            }
            i3 = i2;
        }
        i3 = 0;
        while (i3 < this.m.size()) {
            ebVar.e((int) F, (fO) this.m.get(i3));
            i2 = i3 + l;
            if (z) {
                break;
            }
            i3 = i2;
        }
        i3 = 0;
        while (i3 < this.u.size()) {
            ebVar.e((int) C, (fO) this.u.get(i3));
            i2 = i3 + l;
            if (z) {
                break;
            }
            i3 = i2;
        }
        i3 = 0;
        while (i3 < this.n.size()) {
            ebVar.e((int) z, (fO) this.n.get(i3));
            i2 = i3 + l;
            if (z) {
                break;
            }
            i3 = i2;
        }
        if ((this.q & B) == B) {
            ebVar.e((int) i, this.k);
        }
        if ((this.q & i) == i) {
            ebVar.e((int) r, this.s);
        }
        i3 = 0;
        while (i3 < this.D.size()) {
            ebVar.a((int) g, ((Integer) this.D.get(i3)).intValue());
            i2 = i3 + l;
            if (z) {
                break;
            }
            i3 = i2;
        }
        while (i < this.t.size()) {
            ebVar.a((int) E, ((Integer) this.t.get(i)).intValue());
            i += l;
            if (z) {
                break;
            }
        }
        getUnknownFields().writeTo(ebVar);
    }

    static List d(bB bBVar, List list) {
        bBVar.t = list;
        return list;
    }

    public int f() {
        return this.n.size();
    }

    public int m() {
        return this.A.size();
    }

    public static cS F() {
        return cS.z();
    }

    protected bJ internalGetFieldAccessorTable() {
        return bh.j().a(bB.class, cS.class);
    }

    public static final fn v() {
        return bh.l();
    }

    public b6 g(int i) {
        return (b6) this.n.get(i);
    }

    static List c(bB bBVar) {
        return bBVar.n;
    }

    public static cS g(bB bBVar) {
        return F().a(bBVar);
    }

    static List d(bB bBVar) {
        return bBVar.A;
    }

    private bB(cJ cJVar) {
        super(cJVar);
        this.j = (byte) -1;
        this.w = -1;
        this.h = cJVar.getUnknownFields();
    }

    public List K() {
        return this.m;
    }

    public String H() {
        Object obj = this.e;
        if (obj instanceof String) {
            return (String) obj;
        }
        hx hxVar = (hx) obj;
        String e = hxVar.e();
        if (hxVar.d()) {
            this.e = e;
        }
        return e;
    }

    static List e(bB bBVar, List list) {
        bBVar.u = list;
        return list;
    }

    public final boolean isInitialized() {
        boolean z = true;
        boolean z2 = bA.b;
        byte b = this.j;
        if (b != -1) {
            if (b != (byte) 1) {
                z = false;
            }
            return z;
        }
        int i = 0;
        while (i < m()) {
            if (a(i).isInitialized()) {
                i += l;
                if (z2) {
                    break;
                }
            }
            this.j = (byte) 0;
            return false;
        }
        i = 0;
        while (i < d()) {
            if (b(i).isInitialized()) {
                i += l;
                if (z2) {
                    break;
                }
            }
            this.j = (byte) 0;
            return false;
        }
        i = 0;
        while (i < L()) {
            if (j(i).isInitialized()) {
                i += l;
                if (z2) {
                    break;
                }
            }
            this.j = (byte) 0;
            return false;
        }
        i = 0;
        while (i < f()) {
            if (g(i).isInitialized()) {
                i += l;
                if (z2) {
                    break;
                }
            }
            this.j = (byte) 0;
            return false;
        }
        if (!k() || r().isInitialized()) {
            this.j = (byte) 1;
            return true;
        }
        this.j = (byte) 0;
        return false;
    }

    static List c(bB bBVar, List list) {
        bBVar.n = list;
        return list;
    }

    bB(ad adVar, h hVar, fm fmVar) {
        this(adVar, hVar);
    }

    public static bB a(ad adVar) {
        return (bB) y.a(adVar);
    }

    public final eV getUnknownFields() {
        return this.h;
    }

    static int a(bB bBVar, int i) {
        bBVar.q = i;
        return i;
    }

    static List b(bB bBVar) {
        return bBVar.m;
    }
}
