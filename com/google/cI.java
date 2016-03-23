package com.google;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

public final class cI extends c8 implements a4 {
    private static final cI f;
    public static T h = null;
    public static final int k = 999;
    private static final long serialVersionUID = 0;
    private int g;
    private List i;
    private final eV j;
    private byte l;

    public static cI a(InputStream inputStream) {
        return (cI) h.a(inputStream);
    }

    public static cI a(hx hxVar) {
        return (cI) h.a(hxVar);
    }

    private cI(c_ c_Var) {
        super(c_Var);
        this.l = (byte) -1;
        this.g = -1;
        this.j = c_Var.getUnknownFields();
    }

    public static cI a(ad adVar, h hVar) {
        return (cI) h.a(adVar, hVar);
    }

    public List g() {
        return this.i;
    }

    public static cI b(InputStream inputStream) {
        return (cI) h.b(inputStream);
    }

    public static cI a(ad adVar) {
        return (cI) h.a(adVar);
    }

    public static cL b(cI cIVar) {
        return d().a(cIVar);
    }

    public static cI b(InputStream inputStream, h hVar) {
        return (cI) h.b(inputStream, hVar);
    }

    static {
        h = new gC();
        f = new cI(true);
        f.h();
    }

    cI(ad adVar, h hVar, fm fmVar) {
        this(adVar, hVar);
    }

    public final eV getUnknownFields() {
        return this.j;
    }

    private cI(boolean z) {
        this.l = (byte) -1;
        this.g = -1;
        this.j = eV.h();
    }

    public static final fn e() {
        return bh.L();
    }

    public static cL d() {
        return cL.k();
    }

    static List a(cI cIVar, List list) {
        cIVar.i = list;
        return list;
    }

    public List f() {
        return this.i;
    }

    private void h() {
        this.i = Collections.emptyList();
    }

    public int c() {
        return this.i.size();
    }

    public cI j() {
        return f;
    }

    public cL i() {
        return d();
    }

    public static cI a(byte[] bArr) {
        return (cI) h.a(bArr);
    }

    public static cI a(byte[] bArr, h hVar) {
        return (cI) h.a(bArr, hVar);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private cI(com.google.ad r8, com.google.h r9) {
        /*
        r7 = this;
        r0 = 0;
        r1 = -1;
        r2 = 1;
        r3 = com.google.bA.b;
        r7.<init>();
        r7.l = r1;
        r7.g = r1;
        r7.h();
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
        r7.i = r5;	 Catch:{ fN -> 0x005c, IOException -> 0x0079 }
        r1 = r1 | 1;
    L_0x0033:
        r5 = r7.i;	 Catch:{ fN -> 0x005c, IOException -> 0x0079 }
        r6 = com.google.cj.u;	 Catch:{ fN -> 0x005c, IOException -> 0x0079 }
        r6 = r8.a(r6, r9);	 Catch:{ fN -> 0x005c, IOException -> 0x0079 }
        r5.add(r6);	 Catch:{ fN -> 0x005c, IOException -> 0x0079 }
    L_0x003e:
        if (r3 == 0) goto L_0x0014;
    L_0x0040:
        r0 = r1 & 1;
        if (r0 != r2) goto L_0x004c;
    L_0x0044:
        r0 = r7.i;	 Catch:{ fN -> 0x008a }
        r0 = java.util.Collections.unmodifiableList(r0);	 Catch:{ fN -> 0x008a }
        r7.i = r0;	 Catch:{ fN -> 0x008a }
    L_0x004c:
        r0 = r4.d();
        r7.j = r0;
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
        r1 = r7.i;	 Catch:{ fN -> 0x0088 }
        r1 = java.util.Collections.unmodifiableList(r1);	 Catch:{ fN -> 0x0088 }
        r7.i = r1;	 Catch:{ fN -> 0x0088 }
    L_0x006f:
        r1 = r4.d();
        r7.j = r1;
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.cI.<init>(com.google.ad, com.google.h):void");
    }

    public fO m138getDefaultInstanceForType() {
        return j();
    }

    public final boolean isInitialized() {
        boolean z = bA.b;
        byte b = this.l;
        if (b == -1) {
            int i = 0;
            while (i < c()) {
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

    protected cL a(ec ecVar) {
        return new cL(ecVar, null);
    }

    public cL l() {
        return b(this);
    }

    public es b(int i) {
        return (es) this.i.get(i);
    }

    protected bJ internalGetFieldAccessorTable() {
        return bh.i().a(cI.class, cL.class);
    }

    public T getParserForType() {
        return h;
    }

    public fl toBuilder() {
        return l();
    }

    public static cI a(hx hxVar, h hVar) {
        return (cI) h.b(hxVar, hVar);
    }

    public il m139newBuilderForType() {
        return i();
    }

    protected Object writeReplace() {
        return super.writeReplace();
    }

    public static cI a(InputStream inputStream, h hVar) {
        return (cI) h.a(inputStream, hVar);
    }

    public il m140toBuilder() {
        return l();
    }

    static List a(cI cIVar) {
        return cIVar.i;
    }

    public int getSerializedSize() {
        boolean z = bA.b;
        int i = this.g;
        if (i != -1) {
            return i;
        }
        int i2;
        i = 0;
        int i3 = 0;
        while (i < this.i.size()) {
            i3 += eb.f((int) k, (fO) this.i.get(i));
            i2 = i + 1;
            if (z) {
                break;
            }
            i = i2;
        }
        i2 = (a() + i3) + getUnknownFields().getSerializedSize();
        this.g = i2;
        return i2;
    }

    public static cI k() {
        return f;
    }

    public void writeTo(eb ebVar) {
        boolean z = bA.b;
        getSerializedSize();
        f2 e = e();
        int i = 0;
        while (i < this.i.size()) {
            ebVar.e((int) k, (fO) this.i.get(i));
            int i2 = i + 1;
            if (z) {
                break;
            }
            i = i2;
        }
        e.a(536870912, ebVar);
        getUnknownFields().writeTo(ebVar);
    }

    public ci getDefaultInstanceForType() {
        return j();
    }

    protected fl newBuilderForType(ec ecVar) {
        return a(ecVar);
    }

    public cj a(int i) {
        return (cj) this.i.get(i);
    }

    cI(c_ c_Var, fm fmVar) {
        this(c_Var);
    }

    public fl newBuilderForType() {
        return i();
    }
}
