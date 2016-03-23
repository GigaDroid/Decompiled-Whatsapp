package com.google;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

public final class ca extends c8 implements bI {
    public static final int f = 999;
    public static T g;
    private static final ca j;
    private static final long serialVersionUID = 0;
    private final eV h;
    private List i;
    private int k;
    private byte l;

    public static cr j() {
        return cr.a();
    }

    public il m306newBuilderForType() {
        return f();
    }

    public static final fn c() {
        return bh.u();
    }

    public static cr a(ca caVar) {
        return j().a(caVar);
    }

    public static ca a(hx hxVar) {
        return (ca) g.a(hxVar);
    }

    public il m307toBuilder() {
        return b();
    }

    public fl toBuilder() {
        return b();
    }

    static List b(ca caVar) {
        return caVar.i;
    }

    private ca(c_ c_Var) {
        super(c_Var);
        this.l = (byte) -1;
        this.k = -1;
        this.h = c_Var.getUnknownFields();
    }

    public final eV getUnknownFields() {
        return this.h;
    }

    public cj b(int i) {
        return (cj) this.i.get(i);
    }

    protected bJ internalGetFieldAccessorTable() {
        return bh.E().a(ca.class, cr.class);
    }

    public static ca a(byte[] bArr, h hVar) {
        return (ca) g.a(bArr, hVar);
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
        while (i < this.i.size()) {
            i3 += eb.f((int) f, (fO) this.i.get(i));
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

    public static ca a(InputStream inputStream, h hVar) {
        return (ca) g.b(inputStream, hVar);
    }

    public List i() {
        return this.i;
    }

    public List a() {
        return this.i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private ca(com.google.ad r8, com.google.h r9) {
        /*
        r7 = this;
        r0 = 0;
        r1 = -1;
        r2 = 1;
        r3 = com.google.bA.b;
        r7.<init>();
        r7.l = r1;
        r7.k = r1;
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
        r1 = r7.i;	 Catch:{ fN -> 0x0088 }
        r1 = java.util.Collections.unmodifiableList(r1);	 Catch:{ fN -> 0x0088 }
        r7.i = r1;	 Catch:{ fN -> 0x0088 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.ca.<init>(com.google.ad, com.google.h):void");
    }

    public es a(int i) {
        return (es) this.i.get(i);
    }

    public int e() {
        return this.i.size();
    }

    public final boolean isInitialized() {
        boolean z = bA.b;
        byte b = this.l;
        if (b == -1) {
            int i = 0;
            while (i < e()) {
                if (b(i).isInitialized()) {
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

    private ca(boolean z) {
        this.l = (byte) -1;
        this.k = -1;
        this.h = eV.h();
    }

    private void h() {
        this.i = Collections.emptyList();
    }

    static List a(ca caVar, List list) {
        caVar.i = list;
        return list;
    }

    public static ca a(byte[] bArr) {
        return (ca) g.a(bArr);
    }

    public static ca d() {
        return j;
    }

    ca(ad adVar, h hVar, fm fmVar) {
        this(adVar, hVar);
    }

    public static ca a(hx hxVar, h hVar) {
        return (ca) g.b(hxVar, hVar);
    }

    ca(c_ c_Var, fm fmVar) {
        this(c_Var);
    }

    public cr f() {
        return j();
    }

    public fl newBuilderForType() {
        return f();
    }

    public fO m305getDefaultInstanceForType() {
        return g();
    }

    protected cr a(ec ecVar) {
        return new cr(ecVar, null);
    }

    public void writeTo(eb ebVar) {
        boolean z = bA.b;
        getSerializedSize();
        f2 e = e();
        int i = 0;
        while (i < this.i.size()) {
            ebVar.e((int) f, (fO) this.i.get(i));
            int i2 = i + 1;
            if (z) {
                break;
            }
            i = i2;
        }
        e.a(536870912, ebVar);
        getUnknownFields().writeTo(ebVar);
    }

    public cr b() {
        return a(this);
    }

    public static ca b(InputStream inputStream) {
        return (ca) g.a(inputStream);
    }

    public static ca b(InputStream inputStream, h hVar) {
        return (ca) g.a(inputStream, hVar);
    }

    public T getParserForType() {
        return g;
    }

    static {
        g = new gN();
        j = new ca(true);
        j.h();
    }

    protected Object writeReplace() {
        return super.writeReplace();
    }

    public static ca a(ad adVar, h hVar) {
        return (ca) g.a(adVar, hVar);
    }

    protected fl newBuilderForType(ec ecVar) {
        return a(ecVar);
    }

    public ca g() {
        return j;
    }

    public ci getDefaultInstanceForType() {
        return g();
    }

    public static ca a(InputStream inputStream) {
        return (ca) g.b(inputStream);
    }

    public static ca a(ad adVar) {
        return (ca) g.a(adVar);
    }
}
