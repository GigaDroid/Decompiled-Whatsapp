package com.google;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

public final class cM extends c8 implements i9 {
    public static final int g = 999;
    public static T i;
    private static final cM j;
    private static final long serialVersionUID = 0;
    private List f;
    private final eV h;
    private int k;
    private byte l;

    public static cX b(cM cMVar) {
        return h().a(cMVar);
    }

    static List a(cM cMVar, List list) {
        cMVar.f = list;
        return list;
    }

    public cX f() {
        return h();
    }

    public static cM a(hx hxVar, h hVar) {
        return (cM) i.b(hxVar, hVar);
    }

    cM(ad adVar, h hVar, fm fmVar) {
        this(adVar, hVar);
    }

    protected bJ internalGetFieldAccessorTable() {
        return bh.e().a(cM.class, cX.class);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private cM(com.google.ad r8, com.google.h r9) {
        /*
        r7 = this;
        r0 = 0;
        r1 = -1;
        r2 = 1;
        r3 = com.google.bA.b;
        r7.<init>();
        r7.l = r1;
        r7.k = r1;
        r7.c();
        r4 = com.google.eV.g();
        r1 = r0;
    L_0x0014:
        if (r0 != 0) goto L_0x0040;
    L_0x0016:
        r5 = r8.z();	 Catch:{ fN -> 0x005c, IOException -> 0x0079 }
        switch(r5) {
            case 0: goto L_0x0056;
            case 7994: goto L_0x0026;
            default: goto L_0x001d;
        };
    L_0x001d:
        r5 = r7.a(r8, r4, r9, r5);	 Catch:{ fN -> 0x005a, IOException -> 0x0079 }
        if (r5 != 0) goto L_0x003e;
    L_0x0023:
        if (r3 == 0) goto L_0x008c;
    L_0x0025:
        r0 = r2;
    L_0x0026:
        r5 = r1 & 1;
        if (r5 == r2) goto L_0x0033;
    L_0x002a:
        r5 = new java.util.ArrayList;	 Catch:{ fN -> 0x005c, IOException -> 0x0079 }
        r5.<init>();	 Catch:{ fN -> 0x005c, IOException -> 0x0079 }
        r7.f = r5;	 Catch:{ fN -> 0x005c, IOException -> 0x0079 }
        r1 = r1 | 1;
    L_0x0033:
        r5 = r7.f;	 Catch:{ fN -> 0x005c, IOException -> 0x0079 }
        r6 = com.google.cj.u;	 Catch:{ fN -> 0x005c, IOException -> 0x0079 }
        r6 = r8.a(r6, r9);	 Catch:{ fN -> 0x005c, IOException -> 0x0079 }
        r5.add(r6);	 Catch:{ fN -> 0x005c, IOException -> 0x0079 }
    L_0x003e:
        if (r3 == 0) goto L_0x0014;
    L_0x0040:
        r0 = r1 & 1;
        if (r0 != r2) goto L_0x004c;
    L_0x0044:
        r0 = r7.f;	 Catch:{ fN -> 0x008a }
        r0 = java.util.Collections.unmodifiableList(r0);	 Catch:{ fN -> 0x008a }
        r7.f = r0;	 Catch:{ fN -> 0x008a }
    L_0x004c:
        r0 = r4.d();
        r7.h = r0;
        r7.b();
        return;
    L_0x0056:
        if (r3 == 0) goto L_0x008c;
    L_0x0058:
        r0 = r2;
        goto L_0x001d;
    L_0x005a:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x005c, IOException -> 0x0079 }
    L_0x005c:
        r0 = move-exception;
        r0 = r0.a(r7);	 Catch:{ all -> 0x0062 }
        throw r0;	 Catch:{ all -> 0x0062 }
    L_0x0062:
        r0 = move-exception;
        r1 = r1 & 1;
        if (r1 != r2) goto L_0x006f;
    L_0x0067:
        r1 = r7.f;	 Catch:{ fN -> 0x0088 }
        r1 = java.util.Collections.unmodifiableList(r1);	 Catch:{ fN -> 0x0088 }
        r7.f = r1;	 Catch:{ fN -> 0x0088 }
    L_0x006f:
        r1 = r4.d();
        r7.h = r1;
        r7.b();
        throw r0;
    L_0x0079:
        r0 = move-exception;
        r3 = new com.google.fN;	 Catch:{ all -> 0x0062 }
        r0 = r0.getMessage();	 Catch:{ all -> 0x0062 }
        r3.<init>(r0);	 Catch:{ all -> 0x0062 }
        r0 = r3.a(r7);	 Catch:{ all -> 0x0062 }
        throw r0;	 Catch:{ all -> 0x0062 }
    L_0x0088:
        r0 = move-exception;
        throw r0;
    L_0x008a:
        r0 = move-exception;
        throw r0;
    L_0x008c:
        r0 = r2;
        goto L_0x003e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.cM.<init>(com.google.ad, com.google.h):void");
    }

    public static cM a(ad adVar, h hVar) {
        return (cM) i.a(adVar, hVar);
    }

    public int getSerializedSize() {
        boolean z = bA.b;
        int i = this.k;
        if (i != -1) {
            return i;
        }
        int i2;
        i = 0;
        int i3 = 0;
        while (i < this.f.size()) {
            i3 += eb.f((int) g, (fO) this.f.get(i));
            i2 = i + 1;
            if (z) {
                break;
            }
            i = i2;
        }
        i2 = (a() + i3) + getUnknownFields().getSerializedSize();
        this.k = i2;
        return i2;
    }

    public ci getDefaultInstanceForType() {
        return d();
    }

    private cM(boolean z) {
        this.l = (byte) -1;
        this.k = -1;
        this.h = eV.h();
    }

    public static cM a(byte[] bArr) {
        return (cM) i.a(bArr);
    }

    public fO m281getDefaultInstanceForType() {
        return d();
    }

    static List a(cM cMVar) {
        return cMVar.f;
    }

    public static cM a(ad adVar) {
        return (cM) i.a(adVar);
    }

    public static cM k() {
        return j;
    }

    public static cM a(InputStream inputStream, h hVar) {
        return (cM) i.b(inputStream, hVar);
    }

    public List j() {
        return this.f;
    }

    private cM(c_ c_Var) {
        super(c_Var);
        this.l = (byte) -1;
        this.k = -1;
        this.h = c_Var.getUnknownFields();
    }

    protected fl newBuilderForType(ec ecVar) {
        return a(ecVar);
    }

    public T getParserForType() {
        return i;
    }

    public cj a(int i) {
        return (cj) this.f.get(i);
    }

    public static cX h() {
        return cX.e();
    }

    public cX a() {
        return b(this);
    }

    public es b(int i) {
        return (es) this.f.get(i);
    }

    public int e() {
        return this.f.size();
    }

    static {
        i = new gc();
        j = new cM(true);
        j.c();
    }

    public fl newBuilderForType() {
        return f();
    }

    public static cM a(hx hxVar) {
        return (cM) i.a(hxVar);
    }

    public cM d() {
        return j;
    }

    protected cX a(ec ecVar) {
        return new cX(ecVar, null);
    }

    public il m283toBuilder() {
        return a();
    }

    public List g() {
        return this.f;
    }

    public void writeTo(eb ebVar) {
        boolean z = bA.b;
        getSerializedSize();
        f2 e = e();
        int i = 0;
        while (i < this.f.size()) {
            ebVar.e((int) g, (fO) this.f.get(i));
            int i2 = i + 1;
            if (z) {
                break;
            }
            i = i2;
        }
        e.a(536870912, ebVar);
        getUnknownFields().writeTo(ebVar);
    }

    public static cM a(InputStream inputStream) {
        return (cM) i.b(inputStream);
    }

    public final boolean isInitialized() {
        boolean z = bA.b;
        byte b = this.l;
        if (b == -1) {
            int i = 0;
            while (i < e()) {
                if (a(i).isInitialized()) {
                    i++;
                    if (z) {
                        break;
                    }
                }
                this.l = (byte) 0;
                return false;
            }
            if (f()) {
                this.l = (byte) 1;
                return true;
            }
            this.l = (byte) 0;
            return false;
        } else if (b == (byte) 1) {
            return true;
        } else {
            return false;
        }
    }

    public il m282newBuilderForType() {
        return f();
    }

    public final eV getUnknownFields() {
        return this.h;
    }

    public static cM b(InputStream inputStream) {
        return (cM) i.a(inputStream);
    }

    private void c() {
        this.f = Collections.emptyList();
    }

    cM(c_ c_Var, fm fmVar) {
        this(c_Var);
    }

    public static cM b(InputStream inputStream, h hVar) {
        return (cM) i.a(inputStream, hVar);
    }

    public fl toBuilder() {
        return a();
    }

    protected Object writeReplace() {
        return super.writeReplace();
    }

    public static final fn i() {
        return bh.b();
    }

    public static cM a(byte[] bArr, h hVar) {
        return (cM) i.a(bArr, hVar);
    }
}
