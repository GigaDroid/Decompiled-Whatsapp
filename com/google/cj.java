package com.google;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

public final class cj extends bL implements es {
    public static final int g = 5;
    public static final int i = 4;
    public static final int k = 2;
    public static final int m = 8;
    public static final int n = 7;
    public static final int o = 6;
    public static final int r = 3;
    private static final long serialVersionUID = 0;
    private static final cj t;
    public static T u;
    private hx e;
    private int f;
    private Object h;
    private final eV j;
    private int l;
    private long p;
    private double q;
    private byte s;
    private List v;
    private Object w;
    private long x;

    public final eV getUnknownFields() {
        return this.j;
    }

    protected ck a(ec ecVar) {
        return new ck(ecVar, null);
    }

    public boolean o() {
        return (this.f & 32) == 32;
    }

    public static cj a(byte[] bArr, h hVar) {
        return (cj) u.a(bArr, hVar);
    }

    static Object b(cj cjVar, Object obj) {
        cjVar.w = obj;
        return obj;
    }

    public int getSerializedSize() {
        boolean z = bA.b;
        int i = this.l;
        if (i != -1) {
            return i;
        }
        int i2;
        i = 0;
        int i3 = 0;
        while (i < this.v.size()) {
            i3 += eb.f((int) k, (fO) this.v.get(i));
            i2 = i + 1;
            if (z) {
                break;
            }
            i = i2;
        }
        if ((this.f & 1) == 1) {
            i3 += eb.c((int) r, s());
        }
        if ((this.f & k) == k) {
            i3 += eb.f((int) i, this.x);
        }
        if ((this.f & i) == i) {
            i3 += eb.c((int) g, this.p);
        }
        if ((this.f & m) == m) {
            i3 += eb.b((int) o, this.q);
        }
        if ((this.f & 16) == 16) {
            i3 += eb.c((int) n, this.e);
        }
        if ((this.f & 32) == 32) {
            i3 += eb.c((int) m, j());
        }
        i2 = getUnknownFields().getSerializedSize() + i3;
        this.l = i2;
        return i2;
    }

    public List b() {
        return this.v;
    }

    public boolean u() {
        return (this.f & k) == k;
    }

    public hx v() {
        return this.e;
    }

    public T getParserForType() {
        return u;
    }

    public List e() {
        return this.v;
    }

    public double r() {
        return this.q;
    }

    static List a(cj cjVar, List list) {
        cjVar.v = list;
        return list;
    }

    cj(ad adVar, h hVar, fm fmVar) {
        this(adVar, hVar);
    }

    public static cj l() {
        return t;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private cj(com.google.ad r9, com.google.h r10) {
        /*
        r8 = this;
        r0 = 0;
        r1 = -1;
        r2 = 1;
        r3 = com.google.bA.b;
        r8.<init>();
        r8.s = r1;
        r8.l = r1;
        r8.m();
        r4 = com.google.eV.g();
        r1 = r0;
    L_0x0014:
        if (r0 != 0) goto L_0x0094;
    L_0x0016:
        r5 = r9.z();	 Catch:{ fN -> 0x00b1, IOException -> 0x00da }
        switch(r5) {
            case 0: goto L_0x00aa;
            case 18: goto L_0x0026;
            case 26: goto L_0x0040;
            case 32: goto L_0x004e;
            case 40: goto L_0x005c;
            case 49: goto L_0x006a;
            case 58: goto L_0x0078;
            case 66: goto L_0x0086;
            default: goto L_0x001d;
        };
    L_0x001d:
        r5 = r8.a(r9, r4, r10, r5);	 Catch:{ fN -> 0x00af, IOException -> 0x00da }
        if (r5 != 0) goto L_0x0092;
    L_0x0023:
        if (r3 == 0) goto L_0x00ed;
    L_0x0025:
        r0 = r2;
    L_0x0026:
        r5 = r1 & 1;
        if (r5 == r2) goto L_0x0033;
    L_0x002a:
        r5 = new java.util.ArrayList;	 Catch:{ fN -> 0x00b1, IOException -> 0x00da }
        r5.<init>();	 Catch:{ fN -> 0x00b1, IOException -> 0x00da }
        r8.v = r5;	 Catch:{ fN -> 0x00b1, IOException -> 0x00da }
        r1 = r1 | 1;
    L_0x0033:
        r5 = r8.v;	 Catch:{ fN -> 0x00ce, IOException -> 0x00da }
        r6 = com.google.cF.j;	 Catch:{ fN -> 0x00ce, IOException -> 0x00da }
        r6 = r9.a(r6, r10);	 Catch:{ fN -> 0x00ce, IOException -> 0x00da }
        r5.add(r6);	 Catch:{ fN -> 0x00ce, IOException -> 0x00da }
        if (r3 == 0) goto L_0x0092;
    L_0x0040:
        r5 = r8.f;	 Catch:{ fN -> 0x00ce, IOException -> 0x00da }
        r5 = r5 | 1;
        r8.f = r5;	 Catch:{ fN -> 0x00ce, IOException -> 0x00da }
        r5 = r9.q();	 Catch:{ fN -> 0x00ce, IOException -> 0x00da }
        r8.h = r5;	 Catch:{ fN -> 0x00ce, IOException -> 0x00da }
        if (r3 == 0) goto L_0x0092;
    L_0x004e:
        r5 = r8.f;	 Catch:{ fN -> 0x00d0, IOException -> 0x00da }
        r5 = r5 | 2;
        r8.f = r5;	 Catch:{ fN -> 0x00d0, IOException -> 0x00da }
        r6 = r9.a();	 Catch:{ fN -> 0x00d0, IOException -> 0x00da }
        r8.x = r6;	 Catch:{ fN -> 0x00d0, IOException -> 0x00da }
        if (r3 == 0) goto L_0x0092;
    L_0x005c:
        r5 = r8.f;	 Catch:{ fN -> 0x00d2, IOException -> 0x00da }
        r5 = r5 | 4;
        r8.f = r5;	 Catch:{ fN -> 0x00d2, IOException -> 0x00da }
        r6 = r9.y();	 Catch:{ fN -> 0x00d2, IOException -> 0x00da }
        r8.p = r6;	 Catch:{ fN -> 0x00d2, IOException -> 0x00da }
        if (r3 == 0) goto L_0x0092;
    L_0x006a:
        r5 = r8.f;	 Catch:{ fN -> 0x00d4, IOException -> 0x00da }
        r5 = r5 | 8;
        r8.f = r5;	 Catch:{ fN -> 0x00d4, IOException -> 0x00da }
        r6 = r9.x();	 Catch:{ fN -> 0x00d4, IOException -> 0x00da }
        r8.q = r6;	 Catch:{ fN -> 0x00d4, IOException -> 0x00da }
        if (r3 == 0) goto L_0x0092;
    L_0x0078:
        r5 = r8.f;	 Catch:{ fN -> 0x00d6, IOException -> 0x00da }
        r5 = r5 | 16;
        r8.f = r5;	 Catch:{ fN -> 0x00d6, IOException -> 0x00da }
        r5 = r9.q();	 Catch:{ fN -> 0x00d6, IOException -> 0x00da }
        r8.e = r5;	 Catch:{ fN -> 0x00d6, IOException -> 0x00da }
        if (r3 == 0) goto L_0x0092;
    L_0x0086:
        r5 = r8.f;	 Catch:{ fN -> 0x00d8, IOException -> 0x00da }
        r5 = r5 | 32;
        r8.f = r5;	 Catch:{ fN -> 0x00d8, IOException -> 0x00da }
        r5 = r9.q();	 Catch:{ fN -> 0x00d8, IOException -> 0x00da }
        r8.w = r5;	 Catch:{ fN -> 0x00d8, IOException -> 0x00da }
    L_0x0092:
        if (r3 == 0) goto L_0x0014;
    L_0x0094:
        r0 = r1 & 1;
        if (r0 != r2) goto L_0x00a0;
    L_0x0098:
        r0 = r8.v;	 Catch:{ fN -> 0x00eb }
        r0 = java.util.Collections.unmodifiableList(r0);	 Catch:{ fN -> 0x00eb }
        r8.v = r0;	 Catch:{ fN -> 0x00eb }
    L_0x00a0:
        r0 = r4.d();
        r8.j = r0;
        r8.b();
        return;
    L_0x00aa:
        if (r3 == 0) goto L_0x00ed;
    L_0x00ac:
        r0 = r2;
        goto L_0x001d;
    L_0x00af:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x00b1, IOException -> 0x00da }
    L_0x00b1:
        r0 = move-exception;
        r0 = r0.a(r8);	 Catch:{ all -> 0x00b7 }
        throw r0;	 Catch:{ all -> 0x00b7 }
    L_0x00b7:
        r0 = move-exception;
        r1 = r1 & 1;
        if (r1 != r2) goto L_0x00c4;
    L_0x00bc:
        r1 = r8.v;	 Catch:{ fN -> 0x00e9 }
        r1 = java.util.Collections.unmodifiableList(r1);	 Catch:{ fN -> 0x00e9 }
        r8.v = r1;	 Catch:{ fN -> 0x00e9 }
    L_0x00c4:
        r1 = r4.d();
        r8.j = r1;
        r8.b();
        throw r0;
    L_0x00ce:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x00d0, IOException -> 0x00da }
    L_0x00d0:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x00d2, IOException -> 0x00da }
    L_0x00d2:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x00d4, IOException -> 0x00da }
    L_0x00d4:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x00d6, IOException -> 0x00da }
    L_0x00d6:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x00d8, IOException -> 0x00da }
    L_0x00d8:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x00b1, IOException -> 0x00da }
    L_0x00da:
        r0 = move-exception;
        r3 = new com.google.fN;	 Catch:{ all -> 0x00b7 }
        r0 = r0.getMessage();	 Catch:{ all -> 0x00b7 }
        r3.<init>(r0);	 Catch:{ all -> 0x00b7 }
        r0 = r3.a(r8);	 Catch:{ all -> 0x00b7 }
        throw r0;	 Catch:{ all -> 0x00b7 }
    L_0x00e9:
        r0 = move-exception;
        throw r0;
    L_0x00eb:
        r0 = move-exception;
        throw r0;
    L_0x00ed:
        r0 = r2;
        goto L_0x0092;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.cj.<init>(com.google.ad, com.google.h):void");
    }

    static List d(cj cjVar) {
        return cjVar.v;
    }

    public static cj b(InputStream inputStream) {
        return (cj) u.a(inputStream);
    }

    public static final fn c() {
        return bh.O();
    }

    public boolean a() {
        return (this.f & m) == m;
    }

    protected Object writeReplace() {
        return super.writeReplace();
    }

    public static cj a(ad adVar) {
        return (cj) u.a(adVar);
    }

    public static ck x() {
        return ck.j();
    }

    public hx j() {
        Object obj = this.w;
        if (!(obj instanceof String)) {
            return (hx) obj;
        }
        hx a = hx.a((String) obj);
        this.w = a;
        return a;
    }

    static Object b(cj cjVar) {
        return cjVar.w;
    }

    static hx a(cj cjVar, hx hxVar) {
        cjVar.e = hxVar;
        return hxVar;
    }

    public boolean t() {
        return (this.f & 16) == 16;
    }

    public boolean q() {
        return (this.f & i) == i;
    }

    public static cj a(hx hxVar) {
        return (cj) u.a(hxVar);
    }

    public int i() {
        return this.v.size();
    }

    static double a(cj cjVar, double d) {
        cjVar.q = d;
        return d;
    }

    public boolean h() {
        return (this.f & 1) == 1;
    }

    private void m() {
        this.v = Collections.emptyList();
        this.h = "";
        this.x = 0;
        this.p = 0;
        this.q = 0.0d;
        this.e = hx.b;
        this.w = "";
    }

    protected bJ internalGetFieldAccessorTable() {
        return bh.n().a(cj.class, ck.class);
    }

    public static cj a(hx hxVar, h hVar) {
        return (cj) u.b(hxVar, hVar);
    }

    public il m414newBuilderForType() {
        return d();
    }

    public long p() {
        return this.x;
    }

    static {
        u = new gf();
        t = new cj(true);
        t.m();
    }

    public hx s() {
        Object obj = this.h;
        if (!(obj instanceof String)) {
            return (hx) obj;
        }
        hx a = hx.a((String) obj);
        this.h = a;
        return a;
    }

    public final boolean isInitialized() {
        boolean z = bA.b;
        byte b = this.s;
        if (b == -1) {
            int i = 0;
            while (i < i()) {
                if (a(i).isInitialized()) {
                    i++;
                    if (z) {
                        break;
                    }
                }
                this.s = (byte) 0;
                return false;
            }
            this.s = (byte) 1;
            return true;
        } else if (b == (byte) 1) {
            return true;
        } else {
            return false;
        }
    }

    public void writeTo(eb ebVar) {
        boolean z = bA.b;
        getSerializedSize();
        int i = 0;
        while (i < this.v.size()) {
            ebVar.e((int) k, (fO) this.v.get(i));
            int i2 = i + 1;
            if (z) {
                break;
            }
            i = i2;
        }
        if ((this.f & 1) == 1) {
            ebVar.d((int) r, s());
        }
        if ((this.f & k) == k) {
            ebVar.d((int) i, this.x);
        }
        if ((this.f & i) == i) {
            ebVar.b((int) g, this.p);
        }
        if ((this.f & m) == m) {
            ebVar.a((int) o, this.q);
        }
        if ((this.f & 16) == 16) {
            ebVar.d((int) n, this.e);
        }
        if ((this.f & 32) == 32) {
            ebVar.d((int) m, j());
        }
        getUnknownFields().writeTo(ebVar);
    }

    public String w() {
        Object obj = this.w;
        if (obj instanceof String) {
            return (String) obj;
        }
        hx hxVar = (hx) obj;
        String e = hxVar.e();
        if (hxVar.d()) {
            this.w = e;
        }
        return e;
    }

    cj(cJ cJVar, fm fmVar) {
        this(cJVar);
    }

    static int a(cj cjVar, int i) {
        cjVar.f = i;
        return i;
    }

    static long a(cj cjVar, long j) {
        cjVar.p = j;
        return j;
    }

    public fl toBuilder() {
        return k();
    }

    public static cj a(ad adVar, h hVar) {
        return (cj) u.a(adVar, hVar);
    }

    public static cj a(byte[] bArr) {
        return (cj) u.a(bArr);
    }

    public static cj a(InputStream inputStream) {
        return (cj) u.b(inputStream);
    }

    public fO m413getDefaultInstanceForType() {
        return g();
    }

    public cj g() {
        return t;
    }

    static Object a(cj cjVar, Object obj) {
        cjVar.h = obj;
        return obj;
    }

    public String n() {
        Object obj = this.h;
        if (obj instanceof String) {
            return (String) obj;
        }
        hx hxVar = (hx) obj;
        String e = hxVar.e();
        if (hxVar.d()) {
            this.h = e;
        }
        return e;
    }

    public long f() {
        return this.p;
    }

    public ck k() {
        return a(this);
    }

    public cF a(int i) {
        return (cF) this.v.get(i);
    }

    public static cj b(InputStream inputStream, h hVar) {
        return (cj) u.a(inputStream, hVar);
    }

    private cj(boolean z) {
        this.s = (byte) -1;
        this.l = -1;
        this.j = eV.h();
    }

    protected fl newBuilderForType(ec ecVar) {
        return a(ecVar);
    }

    public ci getDefaultInstanceForType() {
        return g();
    }

    public fl newBuilderForType() {
        return d();
    }

    public ck d() {
        return x();
    }

    public il m415toBuilder() {
        return k();
    }

    static Object c(cj cjVar) {
        return cjVar.h;
    }

    public static ck a(cj cjVar) {
        return x().a(cjVar);
    }

    private cj(cJ cJVar) {
        super(cJVar);
        this.s = (byte) -1;
        this.l = -1;
        this.j = cJVar.getUnknownFields();
    }

    public f_ b(int i) {
        return (f_) this.v.get(i);
    }

    public static cj a(InputStream inputStream, h hVar) {
        return (cj) u.b(inputStream, hVar);
    }

    static long b(cj cjVar, long j) {
        cjVar.x = j;
        return j;
    }
}
