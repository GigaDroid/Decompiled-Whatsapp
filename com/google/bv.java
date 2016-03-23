package com.google;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

public final class bv extends bL implements gY {
    public static final int g = 3;
    public static final int h = 1;
    public static final int j = 2;
    public static T k;
    private static final bv n;
    private static final long serialVersionUID = 0;
    private int e;
    private List f;
    private int i;
    private Object l;
    private final eV m;
    private byte o;
    private ct p;

    public static bv a(ad adVar, h hVar) {
        return (bv) k.a(adVar, hVar);
    }

    public static bv b(InputStream inputStream) {
        return (bv) k.b(inputStream);
    }

    public String h() {
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

    public bv o() {
        return n;
    }

    public cm j() {
        return k();
    }

    private bv(boolean z) {
        this.o = (byte) -1;
        this.i = -1;
        this.m = eV.h();
    }

    public int m() {
        return this.f.size();
    }

    public il m271toBuilder() {
        return p();
    }

    static {
        k = new gy();
        n = new bv(true);
        n.g();
    }

    public List l() {
        return this.f;
    }

    protected Object writeReplace() {
        return super.writeReplace();
    }

    protected bJ internalGetFieldAccessorTable() {
        return bh.q().a(bv.class, cm.class);
    }

    bv(ad adVar, h hVar, fm fmVar) {
        this(adVar, hVar);
    }

    static Object a(bv bvVar, Object obj) {
        bvVar.l = obj;
        return obj;
    }

    public static cm b(bv bvVar) {
        return k().a(bvVar);
    }

    bv(cJ cJVar, fm fmVar) {
        this(cJVar);
    }

    public f1 b(int i) {
        return (f1) this.f.get(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private bv(com.google.ad r9, com.google.h r10) {
        /*
        r8 = this;
        r2 = 1;
        r3 = 0;
        r0 = -1;
        r7 = 2;
        r5 = com.google.bA.b;
        r8.<init>();
        r8.o = r0;
        r8.i = r0;
        r8.g();
        r6 = com.google.eV.g();
        r1 = r3;
    L_0x0015:
        if (r3 != 0) goto L_0x007f;
    L_0x0017:
        r4 = r9.z();	 Catch:{ fN -> 0x009b, IOException -> 0x00bc }
        switch(r4) {
            case 0: goto L_0x0095;
            case 10: goto L_0x00db;
            case 18: goto L_0x00d8;
            case 26: goto L_0x0051;
            default: goto L_0x001e;
        };
    L_0x001e:
        r0 = r3;
    L_0x001f:
        r3 = r8.a(r9, r6, r10, r4);	 Catch:{ fN -> 0x0099, IOException -> 0x00bc }
        if (r3 != 0) goto L_0x007d;
    L_0x0025:
        if (r5 == 0) goto L_0x00d6;
    L_0x0027:
        r0 = r2;
    L_0x0028:
        r3 = r8.e;	 Catch:{ fN -> 0x00b8, IOException -> 0x00bc }
        r3 = r3 | 1;
        r8.e = r3;	 Catch:{ fN -> 0x00b8, IOException -> 0x00bc }
        r3 = r9.q();	 Catch:{ fN -> 0x00b8, IOException -> 0x00bc }
        r8.l = r3;	 Catch:{ fN -> 0x00b8, IOException -> 0x00bc }
        if (r5 == 0) goto L_0x007d;
    L_0x0036:
        r3 = r1 & 2;
        if (r3 == r7) goto L_0x0043;
    L_0x003a:
        r3 = new java.util.ArrayList;	 Catch:{ fN -> 0x009b, IOException -> 0x00bc }
        r3.<init>();	 Catch:{ fN -> 0x009b, IOException -> 0x00bc }
        r8.f = r3;	 Catch:{ fN -> 0x009b, IOException -> 0x00bc }
        r1 = r1 | 2;
    L_0x0043:
        r3 = r8.f;	 Catch:{ fN -> 0x009b, IOException -> 0x00bc }
        r4 = com.google.bT.o;	 Catch:{ fN -> 0x009b, IOException -> 0x00bc }
        r4 = r9.a(r4, r10);	 Catch:{ fN -> 0x009b, IOException -> 0x00bc }
        r3.add(r4);	 Catch:{ fN -> 0x009b, IOException -> 0x00bc }
        if (r5 == 0) goto L_0x007d;
    L_0x0050:
        r3 = r0;
    L_0x0051:
        r0 = 0;
        r4 = r8.e;	 Catch:{ fN -> 0x009b, IOException -> 0x00bc }
        r4 = r4 & 2;
        if (r4 != r7) goto L_0x00d4;
    L_0x0058:
        r0 = r8.p;	 Catch:{ fN -> 0x009b, IOException -> 0x00bc }
        r0 = r0.i();	 Catch:{ fN -> 0x009b, IOException -> 0x00bc }
        r4 = r0;
    L_0x005f:
        r0 = com.google.ct.g;	 Catch:{ fN -> 0x00cb, IOException -> 0x00bc }
        r0 = r9.a(r0, r10);	 Catch:{ fN -> 0x00cb, IOException -> 0x00bc }
        r0 = (com.google.ct) r0;	 Catch:{ fN -> 0x00cb, IOException -> 0x00bc }
        r8.p = r0;	 Catch:{ fN -> 0x00cb, IOException -> 0x00bc }
        if (r4 == 0) goto L_0x0076;
    L_0x006b:
        r0 = r8.p;	 Catch:{ fN -> 0x00cb, IOException -> 0x00bc }
        r4.a(r0);	 Catch:{ fN -> 0x00cb, IOException -> 0x00bc }
        r0 = r4.e();	 Catch:{ fN -> 0x00cb, IOException -> 0x00bc }
        r8.p = r0;	 Catch:{ fN -> 0x00cb, IOException -> 0x00bc }
    L_0x0076:
        r0 = r8.e;	 Catch:{ fN -> 0x009b, IOException -> 0x00bc }
        r0 = r0 | 2;
        r8.e = r0;	 Catch:{ fN -> 0x009b, IOException -> 0x00bc }
        r0 = r3;
    L_0x007d:
        if (r5 == 0) goto L_0x00d1;
    L_0x007f:
        r0 = r1 & 2;
        if (r0 != r7) goto L_0x008b;
    L_0x0083:
        r0 = r8.f;	 Catch:{ fN -> 0x00cf }
        r0 = java.util.Collections.unmodifiableList(r0);	 Catch:{ fN -> 0x00cf }
        r8.f = r0;	 Catch:{ fN -> 0x00cf }
    L_0x008b:
        r0 = r6.d();
        r8.m = r0;
        r8.b();
        return;
    L_0x0095:
        if (r5 == 0) goto L_0x00d6;
    L_0x0097:
        r0 = r2;
        goto L_0x001f;
    L_0x0099:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x009b, IOException -> 0x00bc }
    L_0x009b:
        r0 = move-exception;
        r0 = r0.a(r8);	 Catch:{ all -> 0x00a1 }
        throw r0;	 Catch:{ all -> 0x00a1 }
    L_0x00a1:
        r0 = move-exception;
        r1 = r1 & 2;
        if (r1 != r7) goto L_0x00ae;
    L_0x00a6:
        r1 = r8.f;	 Catch:{ fN -> 0x00cd }
        r1 = java.util.Collections.unmodifiableList(r1);	 Catch:{ fN -> 0x00cd }
        r8.f = r1;	 Catch:{ fN -> 0x00cd }
    L_0x00ae:
        r1 = r6.d();
        r8.m = r1;
        r8.b();
        throw r0;
    L_0x00b8:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x00ba, IOException -> 0x00bc }
    L_0x00ba:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x009b, IOException -> 0x00bc }
    L_0x00bc:
        r0 = move-exception;
        r2 = new com.google.fN;	 Catch:{ all -> 0x00a1 }
        r0 = r0.getMessage();	 Catch:{ all -> 0x00a1 }
        r2.<init>(r0);	 Catch:{ all -> 0x00a1 }
        r0 = r2.a(r8);	 Catch:{ all -> 0x00a1 }
        throw r0;	 Catch:{ all -> 0x00a1 }
    L_0x00cb:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x009b, IOException -> 0x00bc }
    L_0x00cd:
        r0 = move-exception;
        throw r0;
    L_0x00cf:
        r0 = move-exception;
        throw r0;
    L_0x00d1:
        r3 = r0;
        goto L_0x0015;
    L_0x00d4:
        r4 = r0;
        goto L_0x005f;
    L_0x00d6:
        r0 = r2;
        goto L_0x007d;
    L_0x00d8:
        r0 = r3;
        goto L_0x0036;
    L_0x00db:
        r0 = r3;
        goto L_0x0028;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.bv.<init>(com.google.ad, com.google.h):void");
    }

    public void writeTo(eb ebVar) {
        boolean z = bA.b;
        getSerializedSize();
        if ((this.e & h) == h) {
            ebVar.d((int) h, b());
        }
        int i = 0;
        while (i < this.f.size()) {
            ebVar.e((int) j, (fO) this.f.get(i));
            int i2 = i + h;
            if (z) {
                break;
            }
            i = i2;
        }
        if ((this.e & j) == j) {
            ebVar.e((int) g, this.p);
        }
        getUnknownFields().writeTo(ebVar);
    }

    public fO m269getDefaultInstanceForType() {
        return o();
    }

    static ct a(bv bvVar, ct ctVar) {
        bvVar.p = ctVar;
        return ctVar;
    }

    public static bv b(InputStream inputStream, h hVar) {
        return (bv) k.a(inputStream, hVar);
    }

    public cm p() {
        return b(this);
    }

    static int a(bv bvVar, int i) {
        bvVar.e = i;
        return i;
    }

    private bv(cJ cJVar) {
        super(cJVar);
        this.o = (byte) -1;
        this.i = -1;
        this.m = cJVar.getUnknownFields();
    }

    public fl newBuilderForType() {
        return j();
    }

    public static cm k() {
        return cm.k();
    }

    public final eV getUnknownFields() {
        return this.m;
    }

    public boolean d() {
        return (this.e & h) == h;
    }

    public f0 i() {
        return this.p;
    }

    static Object a(bv bvVar) {
        return bvVar.l;
    }

    public static bv a(hx hxVar, h hVar) {
        return (bv) k.b(hxVar, hVar);
    }

    public static bv a(byte[] bArr) {
        return (bv) k.a(bArr);
    }

    public final boolean isInitialized() {
        boolean z = bA.b;
        byte b = this.o;
        if (b == -1) {
            int i = 0;
            while (i < m()) {
                if (a(i).isInitialized()) {
                    i += h;
                    if (z) {
                        break;
                    }
                }
                this.o = (byte) 0;
                return false;
            }
            if (!q() || n().isInitialized()) {
                this.o = (byte) 1;
                return true;
            }
            this.o = (byte) 0;
            return false;
        } else if (b == (byte) 1) {
            return true;
        } else {
            return false;
        }
    }

    static List c(bv bvVar) {
        return bvVar.f;
    }

    public static bv a(InputStream inputStream, h hVar) {
        return (bv) k.b(inputStream, hVar);
    }

    protected fl newBuilderForType(ec ecVar) {
        return a(ecVar);
    }

    public T getParserForType() {
        return k;
    }

    public fl toBuilder() {
        return p();
    }

    public static bv a(ad adVar) {
        return (bv) k.a(adVar);
    }

    public bT a(int i) {
        return (bT) this.f.get(i);
    }

    public il m270newBuilderForType() {
        return j();
    }

    public List f() {
        return this.f;
    }

    private void g() {
        this.l = "";
        this.f = Collections.emptyList();
        this.p = ct.h();
    }

    public static bv c() {
        return n;
    }

    public int getSerializedSize() {
        int i = 0;
        boolean z = bA.b;
        int i2 = this.i;
        if (i2 != -1) {
            return i2;
        }
        if ((this.e & h) == h) {
            i2 = eb.c((int) h, b()) + 0;
        } else {
            i2 = 0;
        }
        int i3 = i2;
        while (i < this.f.size()) {
            i2 = eb.f((int) j, (fO) this.f.get(i)) + i3;
            i += h;
            if (z) {
                break;
            }
            i3 = i2;
        }
        i2 = i3;
        if ((this.e & j) == j) {
            i2 += eb.f((int) g, this.p);
        }
        i2 += getUnknownFields().getSerializedSize();
        this.i = i2;
        return i2;
    }

    public hx b() {
        Object obj = this.l;
        if (!(obj instanceof String)) {
            return (hx) obj;
        }
        hx a = hx.a((String) obj);
        this.l = a;
        return a;
    }

    public static bv a(hx hxVar) {
        return (bv) k.a(hxVar);
    }

    public static final fn e() {
        return bh.m();
    }

    public ci getDefaultInstanceForType() {
        return o();
    }

    static List a(bv bvVar, List list) {
        bvVar.f = list;
        return list;
    }

    protected cm a(ec ecVar) {
        return new cm(ecVar, null);
    }

    public static bv a(InputStream inputStream) {
        return (bv) k.a(inputStream);
    }

    public static bv a(byte[] bArr, h hVar) {
        return (bv) k.a(bArr, hVar);
    }

    public boolean q() {
        return (this.e & j) == j;
    }

    public ct n() {
        return this.p;
    }
}
