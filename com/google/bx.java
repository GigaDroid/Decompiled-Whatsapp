package com.google;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

public final class bx extends bL implements bD {
    public static T f = null;
    public static final int i = 1;
    public static final int l = 3;
    private static final bx m;
    public static final int p = 2;
    private static final long serialVersionUID = 0;
    private List e;
    private final eV g;
    private byte h;
    private int j;
    private int k;
    private Object n;
    private ca o;

    public final eV getUnknownFields() {
        return this.g;
    }

    static List a(bx bxVar, List list) {
        bxVar.e = list;
        return list;
    }

    public ci getDefaultInstanceForType() {
        return j();
    }

    protected fl newBuilderForType(ec ecVar) {
        return a(ecVar);
    }

    public static bx b(InputStream inputStream) {
        return (bx) f.b(inputStream);
    }

    public int p() {
        return this.e.size();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private bx(com.google.ad r9, com.google.h r10) {
        /*
        r8 = this;
        r2 = 1;
        r3 = 0;
        r0 = -1;
        r7 = 2;
        r5 = com.google.bA.b;
        r8.<init>();
        r8.h = r0;
        r8.k = r0;
        r8.c();
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
        r3 = r8.j;	 Catch:{ fN -> 0x00b8, IOException -> 0x00bc }
        r3 = r3 | 1;
        r8.j = r3;	 Catch:{ fN -> 0x00b8, IOException -> 0x00bc }
        r3 = r9.q();	 Catch:{ fN -> 0x00b8, IOException -> 0x00bc }
        r8.n = r3;	 Catch:{ fN -> 0x00b8, IOException -> 0x00bc }
        if (r5 == 0) goto L_0x007d;
    L_0x0036:
        r3 = r1 & 2;
        if (r3 == r7) goto L_0x0043;
    L_0x003a:
        r3 = new java.util.ArrayList;	 Catch:{ fN -> 0x009b, IOException -> 0x00bc }
        r3.<init>();	 Catch:{ fN -> 0x009b, IOException -> 0x00bc }
        r8.e = r3;	 Catch:{ fN -> 0x009b, IOException -> 0x00bc }
        r1 = r1 | 2;
    L_0x0043:
        r3 = r8.e;	 Catch:{ fN -> 0x009b, IOException -> 0x00bc }
        r4 = com.google.bP.r;	 Catch:{ fN -> 0x009b, IOException -> 0x00bc }
        r4 = r9.a(r4, r10);	 Catch:{ fN -> 0x009b, IOException -> 0x00bc }
        r3.add(r4);	 Catch:{ fN -> 0x009b, IOException -> 0x00bc }
        if (r5 == 0) goto L_0x007d;
    L_0x0050:
        r3 = r0;
    L_0x0051:
        r0 = 0;
        r4 = r8.j;	 Catch:{ fN -> 0x009b, IOException -> 0x00bc }
        r4 = r4 & 2;
        if (r4 != r7) goto L_0x00d4;
    L_0x0058:
        r0 = r8.o;	 Catch:{ fN -> 0x009b, IOException -> 0x00bc }
        r0 = r0.b();	 Catch:{ fN -> 0x009b, IOException -> 0x00bc }
        r4 = r0;
    L_0x005f:
        r0 = com.google.ca.g;	 Catch:{ fN -> 0x00cb, IOException -> 0x00bc }
        r0 = r9.a(r0, r10);	 Catch:{ fN -> 0x00cb, IOException -> 0x00bc }
        r0 = (com.google.ca) r0;	 Catch:{ fN -> 0x00cb, IOException -> 0x00bc }
        r8.o = r0;	 Catch:{ fN -> 0x00cb, IOException -> 0x00bc }
        if (r4 == 0) goto L_0x0076;
    L_0x006b:
        r0 = r8.o;	 Catch:{ fN -> 0x00cb, IOException -> 0x00bc }
        r4.a(r0);	 Catch:{ fN -> 0x00cb, IOException -> 0x00bc }
        r0 = r4.h();	 Catch:{ fN -> 0x00cb, IOException -> 0x00bc }
        r8.o = r0;	 Catch:{ fN -> 0x00cb, IOException -> 0x00bc }
    L_0x0076:
        r0 = r8.j;	 Catch:{ fN -> 0x009b, IOException -> 0x00bc }
        r0 = r0 | 2;
        r8.j = r0;	 Catch:{ fN -> 0x009b, IOException -> 0x00bc }
        r0 = r3;
    L_0x007d:
        if (r5 == 0) goto L_0x00d1;
    L_0x007f:
        r0 = r1 & 2;
        if (r0 != r7) goto L_0x008b;
    L_0x0083:
        r0 = r8.e;	 Catch:{ fN -> 0x00cf }
        r0 = java.util.Collections.unmodifiableList(r0);	 Catch:{ fN -> 0x00cf }
        r8.e = r0;	 Catch:{ fN -> 0x00cf }
    L_0x008b:
        r0 = r6.d();
        r8.g = r0;
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
        r1 = r8.e;	 Catch:{ fN -> 0x00cd }
        r1 = java.util.Collections.unmodifiableList(r1);	 Catch:{ fN -> 0x00cd }
        r8.e = r1;	 Catch:{ fN -> 0x00cd }
    L_0x00ae:
        r1 = r6.d();
        r8.g = r1;
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.bx.<init>(com.google.ad, com.google.h):void");
    }

    public boolean l() {
        return (this.j & p) == p;
    }

    public static bx a(hx hxVar, h hVar) {
        return (bx) f.b(hxVar, hVar);
    }

    static ca a(bx bxVar, ca caVar) {
        bxVar.o = caVar;
        return caVar;
    }

    public int getSerializedSize() {
        int i = 0;
        boolean z = bA.b;
        int i2 = this.k;
        if (i2 != -1) {
            return i2;
        }
        if ((this.j & i) == i) {
            i2 = eb.c((int) i, b()) + 0;
        } else {
            i2 = 0;
        }
        int i3 = i2;
        while (i < this.e.size()) {
            i2 = eb.f((int) p, (fO) this.e.get(i)) + i3;
            i += i;
            if (z) {
                break;
            }
            i3 = i2;
        }
        i2 = i3;
        if ((this.j & p) == p) {
            i2 += eb.f((int) l, this.o);
        }
        i2 += getUnknownFields().getSerializedSize();
        this.k = i2;
        return i2;
    }

    private bx(boolean z) {
        this.h = (byte) -1;
        this.k = -1;
        this.g = eV.h();
    }

    public static bx a(InputStream inputStream, h hVar) {
        return (bx) f.a(inputStream, hVar);
    }

    public void writeTo(eb ebVar) {
        boolean z = bA.b;
        getSerializedSize();
        if ((this.j & i) == i) {
            ebVar.d((int) i, b());
        }
        int i = 0;
        while (i < this.e.size()) {
            ebVar.e((int) p, (fO) this.e.get(i));
            int i2 = i + i;
            if (z) {
                break;
            }
            i = i2;
        }
        if ((this.j & p) == p) {
            ebVar.e((int) l, this.o);
        }
        getUnknownFields().writeTo(ebVar);
    }

    public il m111toBuilder() {
        return k();
    }

    public static bx h() {
        return m;
    }

    private void c() {
        this.n = "";
        this.e = Collections.emptyList();
        this.o = ca.d();
    }

    static Object a(bx bxVar, Object obj) {
        bxVar.n = obj;
        return obj;
    }

    protected cC a(ec ecVar) {
        return new cC(ecVar, null);
    }

    bx(ad adVar, h hVar, fm fmVar) {
        this(adVar, hVar);
    }

    public ca o() {
        return this.o;
    }

    public cC k() {
        return c(this);
    }

    public T getParserForType() {
        return f;
    }

    public static cC c(bx bxVar) {
        return n().a(bxVar);
    }

    public static bx a(ad adVar, h hVar) {
        return (bx) f.a(adVar, hVar);
    }

    public static bx b(InputStream inputStream, h hVar) {
        return (bx) f.b(inputStream, hVar);
    }

    public static bx a(byte[] bArr, h hVar) {
        return (bx) f.a(bArr, hVar);
    }

    public static bx a(byte[] bArr) {
        return (bx) f.a(bArr);
    }

    public fO m109getDefaultInstanceForType() {
        return j();
    }

    static {
        f = new gG();
        m = new bx(true);
        m.c();
    }

    public List i() {
        return this.e;
    }

    public static bx a(hx hxVar) {
        return (bx) f.a(hxVar);
    }

    public static bx a(ad adVar) {
        return (bx) f.a(adVar);
    }

    public static cC n() {
        return cC.c();
    }

    public iu a(int i) {
        return (iu) this.e.get(i);
    }

    public static bx a(InputStream inputStream) {
        return (bx) f.a(inputStream);
    }

    public bP b(int i) {
        return (bP) this.e.get(i);
    }

    public List m() {
        return this.e;
    }

    public bx j() {
        return m;
    }

    bx(cJ cJVar, fm fmVar) {
        this(cJVar);
    }

    static Object a(bx bxVar) {
        return bxVar.n;
    }

    public fl toBuilder() {
        return k();
    }

    protected bJ internalGetFieldAccessorTable() {
        return bh.B().a(bx.class, cC.class);
    }

    private bx(cJ cJVar) {
        super(cJVar);
        this.h = (byte) -1;
        this.k = -1;
        this.g = cJVar.getUnknownFields();
    }

    static int a(bx bxVar, int i) {
        bxVar.j = i;
        return i;
    }

    static List b(bx bxVar) {
        return bxVar.e;
    }

    public cC g() {
        return n();
    }

    public String f() {
        Object obj = this.n;
        if (obj instanceof String) {
            return (String) obj;
        }
        hx hxVar = (hx) obj;
        String e = hxVar.e();
        if (hxVar.d()) {
            this.n = e;
        }
        return e;
    }

    public static final fn d() {
        return bh.C();
    }

    public boolean e() {
        return (this.j & i) == i;
    }

    public il m110newBuilderForType() {
        return g();
    }

    protected Object writeReplace() {
        return super.writeReplace();
    }

    public hx b() {
        Object obj = this.n;
        if (!(obj instanceof String)) {
            return (hx) obj;
        }
        hx a = hx.a((String) obj);
        this.n = a;
        return a;
    }

    public final boolean isInitialized() {
        boolean z = bA.b;
        byte b = this.h;
        if (b == -1) {
            int i = 0;
            while (i < p()) {
                if (b(i).isInitialized()) {
                    i += i;
                    if (z) {
                        break;
                    }
                }
                this.h = (byte) 0;
                return false;
            }
            if (!l() || o().isInitialized()) {
                this.h = (byte) 1;
                return true;
            }
            this.h = (byte) 0;
            return false;
        } else if (b == (byte) 1) {
            return true;
        } else {
            return false;
        }
    }

    public fl newBuilderForType() {
        return g();
    }

    public bI q() {
        return this.o;
    }
}
