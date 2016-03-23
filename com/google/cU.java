package com.google;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

public final class cU extends c8 implements eh {
    public static final int E = 16;
    public static final int f = 11;
    public static final int g = 18;
    public static final int h = 999;
    public static final int i = 10;
    public static final int m = 17;
    public static final int r = 8;
    public static T s = null;
    private static final long serialVersionUID = 0;
    private static final cU t;
    public static final int u = 20;
    public static final int v = 9;
    public static final int x = 1;
    private boolean A;
    private A B;
    private boolean C;
    private boolean D;
    private List j;
    private int k;
    private Object l;
    private int n;
    private boolean o;
    private Object p;
    private final eV q;
    private byte w;
    private boolean y;
    private Object z;

    static boolean c(cU cUVar, boolean z) {
        cUVar.o = z;
        return z;
    }

    public hx o() {
        Object obj = this.p;
        if (!(obj instanceof String)) {
            return (hx) obj;
        }
        hx a = hx.a((String) obj);
        this.p = a;
        return a;
    }

    static boolean e(cU cUVar, boolean z) {
        cUVar.A = z;
        return z;
    }

    public hx p() {
        Object obj = this.l;
        if (!(obj instanceof String)) {
            return (hx) obj;
        }
        hx a = hx.a((String) obj);
        this.l = a;
        return a;
    }

    public boolean s() {
        return this.o;
    }

    public es b(int i) {
        return (es) this.j.get(i);
    }

    public cA n() {
        return B();
    }

    public boolean g() {
        return this.A;
    }

    public static cU a(ad adVar, h hVar) {
        return (cU) s.a(adVar, hVar);
    }

    protected fl newBuilderForType(ec ecVar) {
        return a(ecVar);
    }

    public String A() {
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

    static Object b(cU cUVar) {
        return cUVar.l;
    }

    static A a(cU cUVar, A a) {
        cUVar.B = a;
        return a;
    }

    public static cU a(byte[] bArr) {
        return (cU) s.a(bArr);
    }

    public static cU a(hx hxVar, h hVar) {
        return (cU) s.b(hxVar, hVar);
    }

    public final boolean isInitialized() {
        boolean z = bA.b;
        byte b = this.w;
        if (b == -1) {
            int i = 0;
            while (i < r()) {
                if (a(i).isInitialized()) {
                    i += x;
                    if (z) {
                        break;
                    }
                }
                this.w = (byte) 0;
                return false;
            }
            if (f()) {
                this.w = (byte) 1;
                return true;
            }
            this.w = (byte) 0;
            return false;
        } else if (b == (byte) 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean z() {
        return (this.k & 2) == 2;
    }

    public boolean D() {
        return (this.k & 4) == 4;
    }

    public final eV getUnknownFields() {
        return this.q;
    }

    public List a() {
        return this.j;
    }

    public boolean k() {
        return (this.k & 128) == 128;
    }

    private cU(c_ c_Var) {
        super(c_Var);
        this.w = (byte) -1;
        this.n = -1;
        this.q = c_Var.getUnknownFields();
    }

    public ci getDefaultInstanceForType() {
        return c();
    }

    private cU(boolean z) {
        this.w = (byte) -1;
        this.n = -1;
        this.q = eV.h();
    }

    public boolean j() {
        return (this.k & r) == r;
    }

    public static cU a(byte[] bArr, h hVar) {
        return (cU) s.a(bArr, hVar);
    }

    public T getParserForType() {
        return s;
    }

    public cA x() {
        return d(this);
    }

    public static cU e() {
        return t;
    }

    public static cU a(InputStream inputStream, h hVar) {
        return (cU) s.a(inputStream, hVar);
    }

    public boolean l() {
        return (this.k & x) == x;
    }

    static boolean a(cU cUVar, boolean z) {
        cUVar.y = z;
        return z;
    }

    public boolean t() {
        return (this.k & 64) == 64;
    }

    protected bJ internalGetFieldAccessorTable() {
        return bh.G().a(cU.class, cA.class);
    }

    public static cU b(InputStream inputStream) {
        return (cU) s.a(inputStream);
    }

    public int r() {
        return this.j.size();
    }

    public static cU a(InputStream inputStream) {
        return (cU) s.b(inputStream);
    }

    static Object c(cU cUVar) {
        return cUVar.p;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private cU(com.google.ad r10, com.google.h r11) {
        /*
        r9 = this;
        r2 = 1;
        r0 = 0;
        r1 = -1;
        r8 = 512; // 0x200 float:7.175E-43 double:2.53E-321;
        r3 = com.google.bA.b;
        r9.<init>();
        r9.w = r1;
        r9.n = r1;
        r9.C();
        r4 = com.google.eV.g();
        r1 = r0;
    L_0x0016:
        if (r0 != 0) goto L_0x00cd;
    L_0x0018:
        r5 = r10.z();	 Catch:{ fN -> 0x00ea, IOException -> 0x010b }
        switch(r5) {
            case 0: goto L_0x00e3;
            case 10: goto L_0x0028;
            case 66: goto L_0x0036;
            case 72: goto L_0x0044;
            case 80: goto L_0x005f;
            case 90: goto L_0x006d;
            case 128: goto L_0x007b;
            case 136: goto L_0x0089;
            case 144: goto L_0x0097;
            case 160: goto L_0x00a5;
            case 7994: goto L_0x00b3;
            default: goto L_0x001f;
        };
    L_0x001f:
        r5 = r9.a(r10, r4, r11, r5);	 Catch:{ fN -> 0x00e8, IOException -> 0x010b }
        if (r5 != 0) goto L_0x00cb;
    L_0x0025:
        if (r3 == 0) goto L_0x0130;
    L_0x0027:
        r0 = r2;
    L_0x0028:
        r5 = r9.k;	 Catch:{ fN -> 0x0107, IOException -> 0x010b }
        r5 = r5 | 1;
        r9.k = r5;	 Catch:{ fN -> 0x0107, IOException -> 0x010b }
        r5 = r10.q();	 Catch:{ fN -> 0x0107, IOException -> 0x010b }
        r9.l = r5;	 Catch:{ fN -> 0x0107, IOException -> 0x010b }
        if (r3 == 0) goto L_0x00cb;
    L_0x0036:
        r5 = r9.k;	 Catch:{ fN -> 0x0109, IOException -> 0x010b }
        r5 = r5 | 2;
        r9.k = r5;	 Catch:{ fN -> 0x0109, IOException -> 0x010b }
        r5 = r10.q();	 Catch:{ fN -> 0x0109, IOException -> 0x010b }
        r9.p = r5;	 Catch:{ fN -> 0x0109, IOException -> 0x010b }
        if (r3 == 0) goto L_0x00cb;
    L_0x0044:
        r5 = r10.b();	 Catch:{ fN -> 0x00ea, IOException -> 0x010b }
        r6 = com.google.A.valueOf(r5);	 Catch:{ fN -> 0x00ea, IOException -> 0x010b }
        if (r6 != 0) goto L_0x0055;
    L_0x004e:
        r7 = 9;
        r4.a(r7, r5);	 Catch:{ fN -> 0x011a, IOException -> 0x010b }
        if (r3 == 0) goto L_0x00cb;
    L_0x0055:
        r5 = r9.k;	 Catch:{ fN -> 0x011c, IOException -> 0x010b }
        r5 = r5 | 16;
        r9.k = r5;	 Catch:{ fN -> 0x011c, IOException -> 0x010b }
        r9.B = r6;	 Catch:{ fN -> 0x011c, IOException -> 0x010b }
        if (r3 == 0) goto L_0x00cb;
    L_0x005f:
        r5 = r9.k;	 Catch:{ fN -> 0x011e, IOException -> 0x010b }
        r5 = r5 | 4;
        r9.k = r5;	 Catch:{ fN -> 0x011e, IOException -> 0x010b }
        r5 = r10.w();	 Catch:{ fN -> 0x011e, IOException -> 0x010b }
        r9.C = r5;	 Catch:{ fN -> 0x011e, IOException -> 0x010b }
        if (r3 == 0) goto L_0x00cb;
    L_0x006d:
        r5 = r9.k;	 Catch:{ fN -> 0x0120, IOException -> 0x010b }
        r5 = r5 | 32;
        r9.k = r5;	 Catch:{ fN -> 0x0120, IOException -> 0x010b }
        r5 = r10.q();	 Catch:{ fN -> 0x0120, IOException -> 0x010b }
        r9.z = r5;	 Catch:{ fN -> 0x0120, IOException -> 0x010b }
        if (r3 == 0) goto L_0x00cb;
    L_0x007b:
        r5 = r9.k;	 Catch:{ fN -> 0x0122, IOException -> 0x010b }
        r5 = r5 | 64;
        r9.k = r5;	 Catch:{ fN -> 0x0122, IOException -> 0x010b }
        r5 = r10.w();	 Catch:{ fN -> 0x0122, IOException -> 0x010b }
        r9.A = r5;	 Catch:{ fN -> 0x0122, IOException -> 0x010b }
        if (r3 == 0) goto L_0x00cb;
    L_0x0089:
        r5 = r9.k;	 Catch:{ fN -> 0x0124, IOException -> 0x010b }
        r5 = r5 | 128;
        r9.k = r5;	 Catch:{ fN -> 0x0124, IOException -> 0x010b }
        r5 = r10.w();	 Catch:{ fN -> 0x0124, IOException -> 0x010b }
        r9.o = r5;	 Catch:{ fN -> 0x0124, IOException -> 0x010b }
        if (r3 == 0) goto L_0x00cb;
    L_0x0097:
        r5 = r9.k;	 Catch:{ fN -> 0x0126, IOException -> 0x010b }
        r5 = r5 | 256;
        r9.k = r5;	 Catch:{ fN -> 0x0126, IOException -> 0x010b }
        r5 = r10.w();	 Catch:{ fN -> 0x0126, IOException -> 0x010b }
        r9.D = r5;	 Catch:{ fN -> 0x0126, IOException -> 0x010b }
        if (r3 == 0) goto L_0x00cb;
    L_0x00a5:
        r5 = r9.k;	 Catch:{ fN -> 0x0128, IOException -> 0x010b }
        r5 = r5 | 8;
        r9.k = r5;	 Catch:{ fN -> 0x0128, IOException -> 0x010b }
        r5 = r10.w();	 Catch:{ fN -> 0x0128, IOException -> 0x010b }
        r9.y = r5;	 Catch:{ fN -> 0x0128, IOException -> 0x010b }
        if (r3 == 0) goto L_0x00cb;
    L_0x00b3:
        r5 = r1 & 512;
        if (r5 == r8) goto L_0x00c0;
    L_0x00b7:
        r5 = new java.util.ArrayList;	 Catch:{ fN -> 0x00ea, IOException -> 0x010b }
        r5.<init>();	 Catch:{ fN -> 0x00ea, IOException -> 0x010b }
        r9.j = r5;	 Catch:{ fN -> 0x00ea, IOException -> 0x010b }
        r1 = r1 | 512;
    L_0x00c0:
        r5 = r9.j;	 Catch:{ fN -> 0x00ea, IOException -> 0x010b }
        r6 = com.google.cj.u;	 Catch:{ fN -> 0x00ea, IOException -> 0x010b }
        r6 = r10.a(r6, r11);	 Catch:{ fN -> 0x00ea, IOException -> 0x010b }
        r5.add(r6);	 Catch:{ fN -> 0x00ea, IOException -> 0x010b }
    L_0x00cb:
        if (r3 == 0) goto L_0x0016;
    L_0x00cd:
        r0 = r1 & 512;
        if (r0 != r8) goto L_0x00d9;
    L_0x00d1:
        r0 = r9.j;	 Catch:{ fN -> 0x012e }
        r0 = java.util.Collections.unmodifiableList(r0);	 Catch:{ fN -> 0x012e }
        r9.j = r0;	 Catch:{ fN -> 0x012e }
    L_0x00d9:
        r0 = r4.d();
        r9.q = r0;
        r9.b();
        return;
    L_0x00e3:
        if (r3 == 0) goto L_0x0130;
    L_0x00e5:
        r0 = r2;
        goto L_0x001f;
    L_0x00e8:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x00ea, IOException -> 0x010b }
    L_0x00ea:
        r0 = move-exception;
        r0 = r0.a(r9);	 Catch:{ all -> 0x00f0 }
        throw r0;	 Catch:{ all -> 0x00f0 }
    L_0x00f0:
        r0 = move-exception;
        r1 = r1 & 512;
        if (r1 != r8) goto L_0x00fd;
    L_0x00f5:
        r1 = r9.j;	 Catch:{ fN -> 0x012c }
        r1 = java.util.Collections.unmodifiableList(r1);	 Catch:{ fN -> 0x012c }
        r9.j = r1;	 Catch:{ fN -> 0x012c }
    L_0x00fd:
        r1 = r4.d();
        r9.q = r1;
        r9.b();
        throw r0;
    L_0x0107:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0109, IOException -> 0x010b }
    L_0x0109:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x00ea, IOException -> 0x010b }
    L_0x010b:
        r0 = move-exception;
        r2 = new com.google.fN;	 Catch:{ all -> 0x00f0 }
        r0 = r0.getMessage();	 Catch:{ all -> 0x00f0 }
        r2.<init>(r0);	 Catch:{ all -> 0x00f0 }
        r0 = r2.a(r9);	 Catch:{ all -> 0x00f0 }
        throw r0;	 Catch:{ all -> 0x00f0 }
    L_0x011a:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x011c, IOException -> 0x010b }
    L_0x011c:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x011e, IOException -> 0x010b }
    L_0x011e:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0120, IOException -> 0x010b }
    L_0x0120:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0122, IOException -> 0x010b }
    L_0x0122:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0124, IOException -> 0x010b }
    L_0x0124:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0126, IOException -> 0x010b }
    L_0x0126:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0128, IOException -> 0x010b }
    L_0x0128:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x012a, IOException -> 0x010b }
    L_0x012a:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x00ea, IOException -> 0x010b }
    L_0x012c:
        r0 = move-exception;
        throw r0;
    L_0x012e:
        r0 = move-exception;
        throw r0;
    L_0x0130:
        r0 = r2;
        goto L_0x00cb;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.cU.<init>(com.google.ad, com.google.h):void");
    }

    static List a(cU cUVar) {
        return cUVar.j;
    }

    public List u() {
        return this.j;
    }

    public static cU a(ad adVar) {
        return (cU) s.a(adVar);
    }

    static Object c(cU cUVar, Object obj) {
        cUVar.z = obj;
        return obj;
    }

    public boolean q() {
        return this.y;
    }

    public boolean F() {
        return (this.k & 256) == 256;
    }

    protected Object writeReplace() {
        return super.writeReplace();
    }

    public static cA d(cU cUVar) {
        return B().a(cUVar);
    }

    static boolean d(cU cUVar, boolean z) {
        cUVar.D = z;
        return z;
    }

    public String m() {
        Object obj = this.z;
        if (obj instanceof String) {
            return (String) obj;
        }
        hx hxVar = (hx) obj;
        String e = hxVar.e();
        if (hxVar.d()) {
            this.z = e;
        }
        return e;
    }

    public static cU b(InputStream inputStream, h hVar) {
        return (cU) s.b(inputStream, hVar);
    }

    public fl toBuilder() {
        return x();
    }

    static {
        s = new gS();
        t = new cU(true);
        t.C();
    }

    public hx i() {
        Object obj = this.z;
        if (!(obj instanceof String)) {
            return (hx) obj;
        }
        hx a = hx.a((String) obj);
        this.z = a;
        return a;
    }

    private void C() {
        this.l = "";
        this.p = "";
        this.C = false;
        this.y = false;
        this.B = A.SPEED;
        this.z = "";
        this.A = false;
        this.o = false;
        this.D = false;
        this.j = Collections.emptyList();
    }

    public il m88newBuilderForType() {
        return n();
    }

    public String y() {
        Object obj = this.l;
        if (obj instanceof String) {
            return (String) obj;
        }
        hx hxVar = (hx) obj;
        String e = hxVar.e();
        if (hxVar.d()) {
            this.l = e;
        }
        return e;
    }

    protected cA a(ec ecVar) {
        return new cA(ecVar, null);
    }

    public static cA B() {
        return cA.c();
    }

    public boolean d() {
        return this.D;
    }

    public boolean v() {
        return this.C;
    }

    cU(ad adVar, h hVar, fm fmVar) {
        this(adVar, hVar);
    }

    public boolean b() {
        return (this.k & E) == E;
    }

    public cU c() {
        return t;
    }

    static Object b(cU cUVar, Object obj) {
        cUVar.l = obj;
        return obj;
    }

    static Object e(cU cUVar) {
        return cUVar.z;
    }

    static List a(cU cUVar, List list) {
        cUVar.j = list;
        return list;
    }

    public cj a(int i) {
        return (cj) this.j.get(i);
    }

    public static cU a(hx hxVar) {
        return (cU) s.a(hxVar);
    }

    public fO m87getDefaultInstanceForType() {
        return c();
    }

    static Object a(cU cUVar, Object obj) {
        cUVar.p = obj;
        return obj;
    }

    cU(c_ c_Var, fm fmVar) {
        this(c_Var);
    }

    public int getSerializedSize() {
        int i = 0;
        boolean z = bA.b;
        int i2 = this.n;
        if (i2 != -1) {
            return i2;
        }
        if ((this.k & x) == x) {
            i2 = eb.c((int) x, p()) + 0;
        } else {
            i2 = 0;
        }
        if ((this.k & 2) == 2) {
            i2 += eb.c((int) r, o());
        }
        if ((this.k & E) == E) {
            i2 += eb.b((int) v, this.B.getNumber());
        }
        if ((this.k & 4) == 4) {
            i2 += eb.b((int) i, this.C);
        }
        if ((this.k & 32) == 32) {
            i2 += eb.c((int) f, i());
        }
        if ((this.k & 64) == 64) {
            i2 += eb.b((int) E, this.A);
        }
        if ((this.k & 128) == 128) {
            i2 += eb.b((int) m, this.o);
        }
        if ((this.k & 256) == 256) {
            i2 += eb.b((int) g, this.D);
        }
        if ((this.k & r) == r) {
            i2 += eb.b((int) u, this.y);
        }
        int i3 = i2;
        while (i < this.j.size()) {
            i2 = eb.f((int) h, (fO) this.j.get(i)) + i3;
            i += x;
            if (z) {
                break;
            }
            i3 = i2;
        }
        i2 = i3;
        i2 = (i2 + a()) + getUnknownFields().getSerializedSize();
        this.n = i2;
        return i2;
    }

    public il m89toBuilder() {
        return x();
    }

    public static final fn w() {
        return bh.F();
    }

    public fl newBuilderForType() {
        return n();
    }

    public boolean h() {
        return (this.k & 32) == 32;
    }

    public void writeTo(eb ebVar) {
        boolean z = bA.b;
        getSerializedSize();
        f2 e = e();
        if ((this.k & x) == x) {
            ebVar.d((int) x, p());
        }
        if ((this.k & 2) == 2) {
            ebVar.d((int) r, o());
        }
        if ((this.k & E) == E) {
            ebVar.f((int) v, this.B.getNumber());
        }
        if ((this.k & 4) == 4) {
            ebVar.a((int) i, this.C);
        }
        if ((this.k & 32) == 32) {
            ebVar.d((int) f, i());
        }
        if ((this.k & 64) == 64) {
            ebVar.a((int) E, this.A);
        }
        if ((this.k & 128) == 128) {
            ebVar.a((int) m, this.o);
        }
        if ((this.k & 256) == 256) {
            ebVar.a((int) g, this.D);
        }
        if ((this.k & r) == r) {
            ebVar.a((int) u, this.y);
        }
        int i = 0;
        while (i < this.j.size()) {
            ebVar.e((int) h, (fO) this.j.get(i));
            int i2 = i + x;
            if (z) {
                break;
            }
            i = i2;
        }
        e.a(536870912, ebVar);
        getUnknownFields().writeTo(ebVar);
    }

    public A E() {
        return this.B;
    }

    static int a(cU cUVar, int i) {
        cUVar.k = i;
        return i;
    }

    static boolean b(cU cUVar, boolean z) {
        cUVar.C = z;
        return z;
    }
}
