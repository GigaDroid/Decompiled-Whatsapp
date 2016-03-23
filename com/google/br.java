package com.google;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

public final class br extends bL implements iH {
    public static final int e = 2;
    private static final br f;
    public static final int i = 7;
    public static final int k = 6;
    public static T m = null;
    public static final int o = 3;
    public static final int q = 4;
    public static final int s = 1;
    private static final long serialVersionUID = 0;
    public static final int x = 5;
    private List g;
    private List h;
    private byte j;
    private int l;
    private List n;
    private final eV p;
    private cl r;
    private int t;
    private List u;
    private Object v;
    private List w;

    public int getSerializedSize() {
        int i = 0;
        boolean z = bA.b;
        int i2 = this.t;
        if (i2 != -1) {
            return i2;
        }
        if ((this.l & s) == s) {
            i2 = eb.c((int) s, y()) + 0;
        } else {
            i2 = 0;
        }
        int i3 = 0;
        int i4 = i2;
        while (i3 < this.h.size()) {
            i4 += eb.f((int) e, (fO) this.h.get(i3));
            i2 = i3 + s;
            if (z) {
                break;
            }
            i3 = i2;
        }
        i3 = 0;
        while (i3 < this.u.size()) {
            i4 += eb.f((int) o, (fO) this.u.get(i3));
            i2 = i3 + s;
            if (z) {
                break;
            }
            i3 = i2;
        }
        i3 = 0;
        while (i3 < this.g.size()) {
            i4 += eb.f((int) q, (fO) this.g.get(i3));
            i2 = i3 + s;
            if (z) {
                break;
            }
            i3 = i2;
        }
        i3 = 0;
        while (i3 < this.n.size()) {
            i4 += eb.f((int) x, (fO) this.n.get(i3));
            i2 = i3 + s;
            if (z) {
                break;
            }
            i3 = i2;
        }
        while (i < this.w.size()) {
            i4 += eb.f((int) k, (fO) this.w.get(i));
            i += s;
            if (z) {
                break;
            }
        }
        if ((this.l & e) == e) {
            i4 += eb.f((int) i, this.r);
        }
        i2 = getUnknownFields().getSerializedSize() + i4;
        this.t = i2;
        return i2;
    }

    public fl toBuilder() {
        return g();
    }

    public final eV getUnknownFields() {
        return this.p;
    }

    public String f() {
        Object obj = this.v;
        if (obj instanceof String) {
            return (String) obj;
        }
        hx hxVar = (hx) obj;
        String e = hxVar.e();
        if (hxVar.d()) {
            this.v = e;
        }
        return e;
    }

    public dP d(int i) {
        return (dP) this.n.get(i);
    }

    static List c(br brVar, List list) {
        brVar.g = list;
        return list;
    }

    public static br a(InputStream inputStream) {
        return (br) m.a(inputStream);
    }

    public static br a() {
        return f;
    }

    public co g() {
        return e(this);
    }

    public bQ x() {
        return this.r;
    }

    public boolean b() {
        return (this.l & s) == s;
    }

    public static br a(hx hxVar, h hVar) {
        return (br) m.b(hxVar, hVar);
    }

    public static br a(ad adVar, h hVar) {
        return (br) m.a(adVar, hVar);
    }

    protected Object writeReplace() {
        return super.writeReplace();
    }

    public il m221toBuilder() {
        return g();
    }

    public List z() {
        return this.g;
    }

    public List i() {
        return this.n;
    }

    static List g(br brVar) {
        return brVar.n;
    }

    public static co h() {
        return co.g();
    }

    static int a(br brVar, int i) {
        brVar.l = i;
        return i;
    }

    public ci getDefaultInstanceForType() {
        return v();
    }

    public co e() {
        return h();
    }

    public int n() {
        return this.u.size();
    }

    public static co e(br brVar) {
        return h().a(brVar);
    }

    public boolean k() {
        return (this.l & e) == e;
    }

    public List q() {
        return this.w;
    }

    static List b(br brVar, List list) {
        brVar.w = list;
        return list;
    }

    public il m220newBuilderForType() {
        return e();
    }

    public List j() {
        return this.h;
    }

    public static br a(byte[] bArr) {
        return (br) m.a(bArr);
    }

    protected co a(ec ecVar) {
        return new co(ecVar, null);
    }

    public bv g(int i) {
        return (bv) this.g.get(i);
    }

    private void t() {
        this.v = "";
        this.h = Collections.emptyList();
        this.w = Collections.emptyList();
        this.u = Collections.emptyList();
        this.g = Collections.emptyList();
        this.n = Collections.emptyList();
        this.r = cl.f();
    }

    public static br a(hx hxVar) {
        return (br) m.a(hxVar);
    }

    public List c() {
        return this.h;
    }

    public fO m219getDefaultInstanceForType() {
        return v();
    }

    public b6 f(int i) {
        return (b6) this.w.get(i);
    }

    static List e(br brVar, List list) {
        brVar.u = list;
        return list;
    }

    private br(cJ cJVar) {
        super(cJVar);
        this.j = (byte) -1;
        this.t = -1;
        this.p = cJVar.getUnknownFields();
    }

    public int p() {
        return this.n.size();
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
        while (i < s()) {
            if (a(i).isInitialized()) {
                i += s;
                if (z2) {
                    break;
                }
            }
            this.j = (byte) 0;
            return false;
        }
        i = 0;
        while (i < A()) {
            if (f(i).isInitialized()) {
                i += s;
                if (z2) {
                    break;
                }
            }
            this.j = (byte) 0;
            return false;
        }
        i = 0;
        while (i < n()) {
            if (i(i).isInitialized()) {
                i += s;
                if (z2) {
                    break;
                }
            }
            this.j = (byte) 0;
            return false;
        }
        i = 0;
        while (i < d()) {
            if (g(i).isInitialized()) {
                i += s;
                if (z2) {
                    break;
                }
            }
            this.j = (byte) 0;
            return false;
        }
        if (!k() || w().isInitialized()) {
            this.j = (byte) 1;
            return true;
        }
        this.j = (byte) 0;
        return false;
    }

    public List u() {
        return this.u;
    }

    public cl w() {
        return this.r;
    }

    public b6 a(int i) {
        return (b6) this.h.get(i);
    }

    br(cJ cJVar, fm fmVar) {
        this(cJVar);
    }

    static List d(br brVar) {
        return brVar.w;
    }

    static List b(br brVar) {
        return brVar.g;
    }

    public fl newBuilderForType() {
        return e();
    }

    public void writeTo(eb ebVar) {
        int i = 0;
        boolean z = bA.b;
        getSerializedSize();
        if ((this.l & s) == s) {
            ebVar.d((int) s, y());
        }
        int i2 = 0;
        while (i2 < this.h.size()) {
            ebVar.e((int) e, (fO) this.h.get(i2));
            int i3 = i2 + s;
            if (z) {
                break;
            }
            i2 = i3;
        }
        i2 = 0;
        while (i2 < this.u.size()) {
            ebVar.e((int) o, (fO) this.u.get(i2));
            i3 = i2 + s;
            if (z) {
                break;
            }
            i2 = i3;
        }
        i2 = 0;
        while (i2 < this.g.size()) {
            ebVar.e((int) q, (fO) this.g.get(i2));
            i3 = i2 + s;
            if (z) {
                break;
            }
            i2 = i3;
        }
        i2 = 0;
        while (i2 < this.n.size()) {
            ebVar.e((int) x, (fO) this.n.get(i2));
            i3 = i2 + s;
            if (z) {
                break;
            }
            i2 = i3;
        }
        while (i < this.w.size()) {
            ebVar.e((int) k, (fO) this.w.get(i));
            i += s;
            if (z) {
                break;
            }
        }
        if ((this.l & e) == e) {
            ebVar.e((int) i, this.r);
        }
        getUnknownFields().writeTo(ebVar);
    }

    public gY h(int i) {
        return (gY) this.g.get(i);
    }

    static List f(br brVar) {
        return brVar.h;
    }

    public int A() {
        return this.w.size();
    }

    public hx y() {
        Object obj = this.v;
        if (!(obj instanceof String)) {
            return (hx) obj;
        }
        hx a = hx.a((String) obj);
        this.v = a;
        return a;
    }

    public br v() {
        return f;
    }

    public int s() {
        return this.h.size();
    }

    br(ad adVar, h hVar, fm fmVar) {
        this(adVar, hVar);
    }

    public int d() {
        return this.g.size();
    }

    public cQ c(int i) {
        return (cQ) this.w.get(i);
    }

    static List a(br brVar, List list) {
        brVar.n = list;
        return list;
    }

    protected bJ internalGetFieldAccessorTable() {
        return bh.x().a(br.class, co.class);
    }

    public br i(int i) {
        return (br) this.u.get(i);
    }

    public T getParserForType() {
        return m;
    }

    public List l() {
        return this.w;
    }

    public static br b(InputStream inputStream) {
        return (br) m.b(inputStream);
    }

    static {
        m = new g1();
        f = new br(true);
        f.t();
    }

    public List B() {
        return this.u;
    }

    public static br a(InputStream inputStream, h hVar) {
        return (br) m.a(inputStream, hVar);
    }

    public iH j(int i) {
        return (iH) this.u.get(i);
    }

    public static br a(byte[] bArr, h hVar) {
        return (br) m.a(bArr, hVar);
    }

    public static final fn r() {
        return bh.M();
    }

    public bR e(int i) {
        return (bR) this.n.get(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private br(com.google.ad r12, com.google.h r13) {
        /*
        r11 = this;
        r10 = 32;
        r9 = 16;
        r8 = 8;
        r7 = 4;
        r6 = 2;
        r4 = com.google.bA.b;
        r11.<init>();
        r0 = -1;
        r11.j = r0;
        r0 = -1;
        r11.t = r0;
        r11.t();
        r1 = 0;
        r5 = com.google.eV.g();
        r2 = 0;
    L_0x001c:
        if (r2 != 0) goto L_0x00ee;
    L_0x001e:
        r3 = r12.z();	 Catch:{ fN -> 0x013b, IOException -> 0x018c }
        switch(r3) {
            case 0: goto L_0x0134;
            case 10: goto L_0x01ce;
            case 18: goto L_0x01cb;
            case 26: goto L_0x01c8;
            case 34: goto L_0x01c5;
            case 42: goto L_0x01c2;
            case 50: goto L_0x01bf;
            case 58: goto L_0x00c0;
            default: goto L_0x0025;
        };
    L_0x0025:
        r0 = r2;
    L_0x0026:
        r2 = r11.a(r12, r5, r13, r3);	 Catch:{ fN -> 0x0139, IOException -> 0x018c }
        if (r2 != 0) goto L_0x00ec;
    L_0x002c:
        r0 = 1;
        if (r4 == 0) goto L_0x00ec;
    L_0x002f:
        r2 = r11.l;	 Catch:{ fN -> 0x0188, IOException -> 0x018c }
        r2 = r2 | 1;
        r11.l = r2;	 Catch:{ fN -> 0x0188, IOException -> 0x018c }
        r2 = r12.q();	 Catch:{ fN -> 0x0188, IOException -> 0x018c }
        r11.v = r2;	 Catch:{ fN -> 0x0188, IOException -> 0x018c }
        if (r4 == 0) goto L_0x00ec;
    L_0x003d:
        r2 = r1 & 2;
        if (r2 == r6) goto L_0x004a;
    L_0x0041:
        r2 = new java.util.ArrayList;	 Catch:{ fN -> 0x013b, IOException -> 0x018c }
        r2.<init>();	 Catch:{ fN -> 0x013b, IOException -> 0x018c }
        r11.h = r2;	 Catch:{ fN -> 0x013b, IOException -> 0x018c }
        r1 = r1 | 2;
    L_0x004a:
        r2 = r11.h;	 Catch:{ fN -> 0x019b, IOException -> 0x018c }
        r3 = com.google.b6.z;	 Catch:{ fN -> 0x019b, IOException -> 0x018c }
        r3 = r12.a(r3, r13);	 Catch:{ fN -> 0x019b, IOException -> 0x018c }
        r2.add(r3);	 Catch:{ fN -> 0x019b, IOException -> 0x018c }
        if (r4 == 0) goto L_0x00ec;
    L_0x0057:
        r2 = r1 & 8;
        if (r2 == r8) goto L_0x0064;
    L_0x005b:
        r2 = new java.util.ArrayList;	 Catch:{ fN -> 0x013b, IOException -> 0x018c }
        r2.<init>();	 Catch:{ fN -> 0x013b, IOException -> 0x018c }
        r11.u = r2;	 Catch:{ fN -> 0x013b, IOException -> 0x018c }
        r1 = r1 | 8;
    L_0x0064:
        r2 = r11.u;	 Catch:{ fN -> 0x019d, IOException -> 0x018c }
        r3 = m;	 Catch:{ fN -> 0x019d, IOException -> 0x018c }
        r3 = r12.a(r3, r13);	 Catch:{ fN -> 0x019d, IOException -> 0x018c }
        r2.add(r3);	 Catch:{ fN -> 0x019d, IOException -> 0x018c }
        if (r4 == 0) goto L_0x00ec;
    L_0x0071:
        r2 = r1 & 16;
        if (r2 == r9) goto L_0x007e;
    L_0x0075:
        r2 = new java.util.ArrayList;	 Catch:{ fN -> 0x013b, IOException -> 0x018c }
        r2.<init>();	 Catch:{ fN -> 0x013b, IOException -> 0x018c }
        r11.g = r2;	 Catch:{ fN -> 0x013b, IOException -> 0x018c }
        r1 = r1 | 16;
    L_0x007e:
        r2 = r11.g;	 Catch:{ fN -> 0x019f, IOException -> 0x018c }
        r3 = com.google.bv.k;	 Catch:{ fN -> 0x019f, IOException -> 0x018c }
        r3 = r12.a(r3, r13);	 Catch:{ fN -> 0x019f, IOException -> 0x018c }
        r2.add(r3);	 Catch:{ fN -> 0x019f, IOException -> 0x018c }
        if (r4 == 0) goto L_0x00ec;
    L_0x008b:
        r2 = r1 & 32;
        if (r2 == r10) goto L_0x0098;
    L_0x008f:
        r2 = new java.util.ArrayList;	 Catch:{ fN -> 0x013b, IOException -> 0x018c }
        r2.<init>();	 Catch:{ fN -> 0x013b, IOException -> 0x018c }
        r11.n = r2;	 Catch:{ fN -> 0x013b, IOException -> 0x018c }
        r1 = r1 | 32;
    L_0x0098:
        r2 = r11.n;	 Catch:{ fN -> 0x01a1, IOException -> 0x018c }
        r3 = com.google.bR.j;	 Catch:{ fN -> 0x01a1, IOException -> 0x018c }
        r3 = r12.a(r3, r13);	 Catch:{ fN -> 0x01a1, IOException -> 0x018c }
        r2.add(r3);	 Catch:{ fN -> 0x01a1, IOException -> 0x018c }
        if (r4 == 0) goto L_0x00ec;
    L_0x00a5:
        r2 = r1 & 4;
        if (r2 == r7) goto L_0x00b2;
    L_0x00a9:
        r2 = new java.util.ArrayList;	 Catch:{ fN -> 0x013b, IOException -> 0x018c }
        r2.<init>();	 Catch:{ fN -> 0x013b, IOException -> 0x018c }
        r11.w = r2;	 Catch:{ fN -> 0x013b, IOException -> 0x018c }
        r1 = r1 | 4;
    L_0x00b2:
        r2 = r11.w;	 Catch:{ fN -> 0x013b, IOException -> 0x018c }
        r3 = com.google.b6.z;	 Catch:{ fN -> 0x013b, IOException -> 0x018c }
        r3 = r12.a(r3, r13);	 Catch:{ fN -> 0x013b, IOException -> 0x018c }
        r2.add(r3);	 Catch:{ fN -> 0x013b, IOException -> 0x018c }
        if (r4 == 0) goto L_0x00ec;
    L_0x00bf:
        r2 = r0;
    L_0x00c0:
        r0 = 0;
        r3 = r11.l;	 Catch:{ fN -> 0x013b, IOException -> 0x018c }
        r3 = r3 & 2;
        if (r3 != r6) goto L_0x01bc;
    L_0x00c7:
        r0 = r11.r;	 Catch:{ fN -> 0x013b, IOException -> 0x018c }
        r0 = r0.a();	 Catch:{ fN -> 0x013b, IOException -> 0x018c }
        r3 = r0;
    L_0x00ce:
        r0 = com.google.cl.n;	 Catch:{ fN -> 0x01a3, IOException -> 0x018c }
        r0 = r12.a(r0, r13);	 Catch:{ fN -> 0x01a3, IOException -> 0x018c }
        r0 = (com.google.cl) r0;	 Catch:{ fN -> 0x01a3, IOException -> 0x018c }
        r11.r = r0;	 Catch:{ fN -> 0x01a3, IOException -> 0x018c }
        if (r3 == 0) goto L_0x00e5;
    L_0x00da:
        r0 = r11.r;	 Catch:{ fN -> 0x01a3, IOException -> 0x018c }
        r3.a(r0);	 Catch:{ fN -> 0x01a3, IOException -> 0x018c }
        r0 = r3.g();	 Catch:{ fN -> 0x01a3, IOException -> 0x018c }
        r11.r = r0;	 Catch:{ fN -> 0x01a3, IOException -> 0x018c }
    L_0x00e5:
        r0 = r11.l;	 Catch:{ fN -> 0x013b, IOException -> 0x018c }
        r0 = r0 | 2;
        r11.l = r0;	 Catch:{ fN -> 0x013b, IOException -> 0x018c }
        r0 = r2;
    L_0x00ec:
        if (r4 == 0) goto L_0x01b9;
    L_0x00ee:
        r0 = r1 & 2;
        if (r0 != r6) goto L_0x00fa;
    L_0x00f2:
        r0 = r11.h;	 Catch:{ fN -> 0x01af }
        r0 = java.util.Collections.unmodifiableList(r0);	 Catch:{ fN -> 0x01af }
        r11.h = r0;	 Catch:{ fN -> 0x01af }
    L_0x00fa:
        r0 = r1 & 8;
        if (r0 != r8) goto L_0x0106;
    L_0x00fe:
        r0 = r11.u;	 Catch:{ fN -> 0x01b1 }
        r0 = java.util.Collections.unmodifiableList(r0);	 Catch:{ fN -> 0x01b1 }
        r11.u = r0;	 Catch:{ fN -> 0x01b1 }
    L_0x0106:
        r0 = r1 & 16;
        if (r0 != r9) goto L_0x0112;
    L_0x010a:
        r0 = r11.g;	 Catch:{ fN -> 0x01b3 }
        r0 = java.util.Collections.unmodifiableList(r0);	 Catch:{ fN -> 0x01b3 }
        r11.g = r0;	 Catch:{ fN -> 0x01b3 }
    L_0x0112:
        r0 = r1 & 32;
        if (r0 != r10) goto L_0x011e;
    L_0x0116:
        r0 = r11.n;	 Catch:{ fN -> 0x01b5 }
        r0 = java.util.Collections.unmodifiableList(r0);	 Catch:{ fN -> 0x01b5 }
        r11.n = r0;	 Catch:{ fN -> 0x01b5 }
    L_0x011e:
        r0 = r1 & 4;
        if (r0 != r7) goto L_0x012a;
    L_0x0122:
        r0 = r11.w;	 Catch:{ fN -> 0x01b7 }
        r0 = java.util.Collections.unmodifiableList(r0);	 Catch:{ fN -> 0x01b7 }
        r11.w = r0;	 Catch:{ fN -> 0x01b7 }
    L_0x012a:
        r0 = r5.d();
        r11.p = r0;
        r11.b();
        return;
    L_0x0134:
        r0 = 1;
        if (r4 == 0) goto L_0x00ec;
    L_0x0137:
        goto L_0x0026;
    L_0x0139:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x013b, IOException -> 0x018c }
    L_0x013b:
        r0 = move-exception;
        r0 = r0.a(r11);	 Catch:{ all -> 0x0141 }
        throw r0;	 Catch:{ all -> 0x0141 }
    L_0x0141:
        r0 = move-exception;
        r2 = r1 & 2;
        if (r2 != r6) goto L_0x014e;
    L_0x0146:
        r2 = r11.h;	 Catch:{ fN -> 0x01a5 }
        r2 = java.util.Collections.unmodifiableList(r2);	 Catch:{ fN -> 0x01a5 }
        r11.h = r2;	 Catch:{ fN -> 0x01a5 }
    L_0x014e:
        r2 = r1 & 8;
        if (r2 != r8) goto L_0x015a;
    L_0x0152:
        r2 = r11.u;	 Catch:{ fN -> 0x01a7 }
        r2 = java.util.Collections.unmodifiableList(r2);	 Catch:{ fN -> 0x01a7 }
        r11.u = r2;	 Catch:{ fN -> 0x01a7 }
    L_0x015a:
        r2 = r1 & 16;
        if (r2 != r9) goto L_0x0166;
    L_0x015e:
        r2 = r11.g;	 Catch:{ fN -> 0x01a9 }
        r2 = java.util.Collections.unmodifiableList(r2);	 Catch:{ fN -> 0x01a9 }
        r11.g = r2;	 Catch:{ fN -> 0x01a9 }
    L_0x0166:
        r2 = r1 & 32;
        if (r2 != r10) goto L_0x0172;
    L_0x016a:
        r2 = r11.n;	 Catch:{ fN -> 0x01ab }
        r2 = java.util.Collections.unmodifiableList(r2);	 Catch:{ fN -> 0x01ab }
        r11.n = r2;	 Catch:{ fN -> 0x01ab }
    L_0x0172:
        r1 = r1 & 4;
        if (r1 != r7) goto L_0x017e;
    L_0x0176:
        r1 = r11.w;	 Catch:{ fN -> 0x01ad }
        r1 = java.util.Collections.unmodifiableList(r1);	 Catch:{ fN -> 0x01ad }
        r11.w = r1;	 Catch:{ fN -> 0x01ad }
    L_0x017e:
        r1 = r5.d();
        r11.p = r1;
        r11.b();
        throw r0;
    L_0x0188:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x018a, IOException -> 0x018c }
    L_0x018a:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x013b, IOException -> 0x018c }
    L_0x018c:
        r0 = move-exception;
        r2 = new com.google.fN;	 Catch:{ all -> 0x0141 }
        r0 = r0.getMessage();	 Catch:{ all -> 0x0141 }
        r2.<init>(r0);	 Catch:{ all -> 0x0141 }
        r0 = r2.a(r11);	 Catch:{ all -> 0x0141 }
        throw r0;	 Catch:{ all -> 0x0141 }
    L_0x019b:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x013b, IOException -> 0x018c }
    L_0x019d:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x013b, IOException -> 0x018c }
    L_0x019f:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x013b, IOException -> 0x018c }
    L_0x01a1:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x013b, IOException -> 0x018c }
    L_0x01a3:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x013b, IOException -> 0x018c }
    L_0x01a5:
        r0 = move-exception;
        throw r0;
    L_0x01a7:
        r0 = move-exception;
        throw r0;
    L_0x01a9:
        r0 = move-exception;
        throw r0;
    L_0x01ab:
        r0 = move-exception;
        throw r0;
    L_0x01ad:
        r0 = move-exception;
        throw r0;
    L_0x01af:
        r0 = move-exception;
        throw r0;
    L_0x01b1:
        r0 = move-exception;
        throw r0;
    L_0x01b3:
        r0 = move-exception;
        throw r0;
    L_0x01b5:
        r0 = move-exception;
        throw r0;
    L_0x01b7:
        r0 = move-exception;
        throw r0;
    L_0x01b9:
        r2 = r0;
        goto L_0x001c;
    L_0x01bc:
        r3 = r0;
        goto L_0x00ce;
    L_0x01bf:
        r0 = r2;
        goto L_0x00a5;
    L_0x01c2:
        r0 = r2;
        goto L_0x008b;
    L_0x01c5:
        r0 = r2;
        goto L_0x0071;
    L_0x01c8:
        r0 = r2;
        goto L_0x0057;
    L_0x01cb:
        r0 = r2;
        goto L_0x003d;
    L_0x01ce:
        r0 = r2;
        goto L_0x002f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.br.<init>(com.google.ad, com.google.h):void");
    }

    protected fl newBuilderForType(ec ecVar) {
        return a(ecVar);
    }

    public static br a(ad adVar) {
        return (br) m.a(adVar);
    }

    static Object c(br brVar) {
        return brVar.v;
    }

    public List m() {
        return this.g;
    }

    public static br b(InputStream inputStream, h hVar) {
        return (br) m.b(inputStream, hVar);
    }

    public cQ b(int i) {
        return (cQ) this.h.get(i);
    }

    static cl a(br brVar, cl clVar) {
        brVar.r = clVar;
        return clVar;
    }

    static List d(br brVar, List list) {
        brVar.h = list;
        return list;
    }

    static List a(br brVar) {
        return brVar.u;
    }

    private br(boolean z) {
        this.j = (byte) -1;
        this.t = -1;
        this.p = eV.h();
    }

    public List o() {
        return this.n;
    }

    static Object a(br brVar, Object obj) {
        brVar.v = obj;
        return obj;
    }
}
