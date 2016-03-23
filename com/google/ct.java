package com.google;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

public final class ct extends c8 implements f0 {
    public static T g = null;
    public static final int l = 2;
    private static final ct m;
    public static final int n = 999;
    private static final long serialVersionUID = 0;
    private int f;
    private boolean h;
    private List i;
    private int j;
    private final eV k;
    private byte o;

    static List a(ct ctVar, List list) {
        ctVar.i = list;
        return list;
    }

    public cf k() {
        return d();
    }

    public static cf d() {
        return cf.j();
    }

    public static ct b(InputStream inputStream) {
        return (ct) g.a(inputStream);
    }

    public il m100newBuilderForType() {
        return k();
    }

    public int getSerializedSize() {
        int i = 0;
        boolean z = bA.b;
        int i2 = this.f;
        if (i2 != -1) {
            return i2;
        }
        if ((this.j & 1) == 1) {
            i2 = eb.b((int) l, this.h) + 0;
        } else {
            i2 = 0;
        }
        int i3 = i2;
        while (i < this.i.size()) {
            i2 = eb.f((int) n, (fO) this.i.get(i)) + i3;
            i++;
            if (z) {
                break;
            }
            i3 = i2;
        }
        i2 = i3;
        i2 = (i2 + a()) + getUnknownFields().getSerializedSize();
        this.f = i2;
        return i2;
    }

    public fl newBuilderForType() {
        return k();
    }

    public int j() {
        return this.i.size();
    }

    public ct b() {
        return m;
    }

    static int a(ct ctVar, int i) {
        ctVar.j = i;
        return i;
    }

    public ci getDefaultInstanceForType() {
        return b();
    }

    public static ct a(byte[] bArr) {
        return (ct) g.a(bArr);
    }

    protected bJ internalGetFieldAccessorTable() {
        return bh.J().a(ct.class, cf.class);
    }

    public es b(int i) {
        return (es) this.i.get(i);
    }

    public final boolean isInitialized() {
        boolean z = bA.b;
        byte b = this.o;
        if (b == -1) {
            int i = 0;
            while (i < j()) {
                if (a(i).isInitialized()) {
                    i++;
                    if (z) {
                        break;
                    }
                }
                this.o = (byte) 0;
                return false;
            }
            if (f()) {
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

    public final eV getUnknownFields() {
        return this.k;
    }

    public static ct a(hx hxVar) {
        return (ct) g.a(hxVar);
    }

    public static ct a(ad adVar, h hVar) {
        return (ct) g.a(adVar, hVar);
    }

    private void e() {
        this.h = true;
        this.i = Collections.emptyList();
    }

    public List a() {
        return this.i;
    }

    public static cf a(ct ctVar) {
        return d().a(ctVar);
    }

    public T getParserForType() {
        return g;
    }

    public static ct a(byte[] bArr, h hVar) {
        return (ct) g.a(bArr, hVar);
    }

    public static ct a(InputStream inputStream) {
        return (ct) g.b(inputStream);
    }

    public fO m99getDefaultInstanceForType() {
        return b();
    }

    public static ct a(hx hxVar, h hVar) {
        return (ct) g.b(hxVar, hVar);
    }

    private ct(boolean z) {
        this.o = (byte) -1;
        this.f = -1;
        this.k = eV.h();
    }

    public cj a(int i) {
        return (cj) this.i.get(i);
    }

    public static ct a(ad adVar) {
        return (ct) g.a(adVar);
    }

    public fl toBuilder() {
        return i();
    }

    public cf i() {
        return a(this);
    }

    public static ct a(InputStream inputStream, h hVar) {
        return (ct) g.b(inputStream, hVar);
    }

    public static final fn c() {
        return bh.z();
    }

    ct(ad adVar, h hVar, fm fmVar) {
        this(adVar, hVar);
    }

    public static ct h() {
        return m;
    }

    ct(c_ c_Var, fm fmVar) {
        this(c_Var);
    }

    static {
        g = new gh();
        m = new ct(true);
        m.e();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private ct(com.google.ad r9, com.google.h r10) {
        /*
        r8 = this;
        r2 = 1;
        r0 = 0;
        r1 = -1;
        r7 = 2;
        r3 = com.google.bA.b;
        r8.<init>();
        r8.o = r1;
        r8.f = r1;
        r8.e();
        r4 = com.google.eV.g();
        r1 = r0;
    L_0x0015:
        if (r0 != 0) goto L_0x004f;
    L_0x0017:
        r5 = r9.z();	 Catch:{ fN -> 0x006b, IOException -> 0x008c }
        switch(r5) {
            case 0: goto L_0x0065;
            case 16: goto L_0x0027;
            case 7994: goto L_0x0035;
            default: goto L_0x001e;
        };
    L_0x001e:
        r5 = r8.a(r9, r4, r10, r5);	 Catch:{ fN -> 0x0069, IOException -> 0x008c }
        if (r5 != 0) goto L_0x004d;
    L_0x0024:
        if (r3 == 0) goto L_0x009f;
    L_0x0026:
        r0 = r2;
    L_0x0027:
        r5 = r8.j;	 Catch:{ fN -> 0x0088, IOException -> 0x008c }
        r5 = r5 | 1;
        r8.j = r5;	 Catch:{ fN -> 0x0088, IOException -> 0x008c }
        r5 = r9.w();	 Catch:{ fN -> 0x0088, IOException -> 0x008c }
        r8.h = r5;	 Catch:{ fN -> 0x0088, IOException -> 0x008c }
        if (r3 == 0) goto L_0x004d;
    L_0x0035:
        r5 = r1 & 2;
        if (r5 == r7) goto L_0x0042;
    L_0x0039:
        r5 = new java.util.ArrayList;	 Catch:{ fN -> 0x006b, IOException -> 0x008c }
        r5.<init>();	 Catch:{ fN -> 0x006b, IOException -> 0x008c }
        r8.i = r5;	 Catch:{ fN -> 0x006b, IOException -> 0x008c }
        r1 = r1 | 2;
    L_0x0042:
        r5 = r8.i;	 Catch:{ fN -> 0x006b, IOException -> 0x008c }
        r6 = com.google.cj.u;	 Catch:{ fN -> 0x006b, IOException -> 0x008c }
        r6 = r9.a(r6, r10);	 Catch:{ fN -> 0x006b, IOException -> 0x008c }
        r5.add(r6);	 Catch:{ fN -> 0x006b, IOException -> 0x008c }
    L_0x004d:
        if (r3 == 0) goto L_0x0015;
    L_0x004f:
        r0 = r1 & 2;
        if (r0 != r7) goto L_0x005b;
    L_0x0053:
        r0 = r8.i;	 Catch:{ fN -> 0x009d }
        r0 = java.util.Collections.unmodifiableList(r0);	 Catch:{ fN -> 0x009d }
        r8.i = r0;	 Catch:{ fN -> 0x009d }
    L_0x005b:
        r0 = r4.d();
        r8.k = r0;
        r8.b();
        return;
    L_0x0065:
        if (r3 == 0) goto L_0x009f;
    L_0x0067:
        r0 = r2;
        goto L_0x001e;
    L_0x0069:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x006b, IOException -> 0x008c }
    L_0x006b:
        r0 = move-exception;
        r0 = r0.a(r8);	 Catch:{ all -> 0x0071 }
        throw r0;	 Catch:{ all -> 0x0071 }
    L_0x0071:
        r0 = move-exception;
        r1 = r1 & 2;
        if (r1 != r7) goto L_0x007e;
    L_0x0076:
        r1 = r8.i;	 Catch:{ fN -> 0x009b }
        r1 = java.util.Collections.unmodifiableList(r1);	 Catch:{ fN -> 0x009b }
        r8.i = r1;	 Catch:{ fN -> 0x009b }
    L_0x007e:
        r1 = r4.d();
        r8.k = r1;
        r8.b();
        throw r0;
    L_0x0088:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x008a, IOException -> 0x008c }
    L_0x008a:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x006b, IOException -> 0x008c }
    L_0x008c:
        r0 = move-exception;
        r2 = new com.google.fN;	 Catch:{ all -> 0x0071 }
        r0 = r0.getMessage();	 Catch:{ all -> 0x0071 }
        r2.<init>(r0);	 Catch:{ all -> 0x0071 }
        r0 = r2.a(r8);	 Catch:{ all -> 0x0071 }
        throw r0;	 Catch:{ all -> 0x0071 }
    L_0x009b:
        r0 = move-exception;
        throw r0;
    L_0x009d:
        r0 = move-exception;
        throw r0;
    L_0x009f:
        r0 = r2;
        goto L_0x004d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ct.<init>(com.google.ad, com.google.h):void");
    }

    protected cf a(ec ecVar) {
        return new cf(ecVar, null);
    }

    private ct(c_ c_Var) {
        super(c_Var);
        this.o = (byte) -1;
        this.f = -1;
        this.k = c_Var.getUnknownFields();
    }

    public List m() {
        return this.i;
    }

    static List b(ct ctVar) {
        return ctVar.i;
    }

    static boolean a(ct ctVar, boolean z) {
        ctVar.h = z;
        return z;
    }

    protected fl newBuilderForType(ec ecVar) {
        return a(ecVar);
    }

    public boolean l() {
        return (this.j & 1) == 1;
    }

    public boolean g() {
        return this.h;
    }

    public void writeTo(eb ebVar) {
        boolean z = bA.b;
        getSerializedSize();
        f2 e = e();
        if ((this.j & 1) == 1) {
            ebVar.a((int) l, this.h);
        }
        int i = 0;
        while (i < this.i.size()) {
            ebVar.e((int) n, (fO) this.i.get(i));
            int i2 = i + 1;
            if (z) {
                break;
            }
            i = i2;
        }
        e.a(536870912, ebVar);
        getUnknownFields().writeTo(ebVar);
    }

    public static ct b(InputStream inputStream, h hVar) {
        return (ct) g.a(inputStream, hVar);
    }

    public il m101toBuilder() {
        return i();
    }

    protected Object writeReplace() {
        return super.writeReplace();
    }
}
