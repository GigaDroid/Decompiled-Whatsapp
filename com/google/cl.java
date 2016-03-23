package com.google;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

public final class cl extends c8 implements bQ {
    public static final int f = 2;
    private static final cl j;
    public static final int l = 1;
    public static T n = null;
    public static final int p = 999;
    private static final long serialVersionUID = 0;
    private int g;
    private boolean h;
    private final eV i;
    private boolean k;
    private byte m;
    private int o;
    private List q;

    cl(ad adVar, h hVar, fm fmVar) {
        this(adVar, hVar);
    }

    static int a(cl clVar, int i) {
        clVar.g = i;
        return i;
    }

    public void writeTo(eb ebVar) {
        boolean z = bA.b;
        getSerializedSize();
        f2 e = e();
        if ((this.g & l) == l) {
            ebVar.a((int) l, this.k);
        }
        if ((this.g & f) == f) {
            ebVar.a((int) f, this.h);
        }
        int i = 0;
        while (i < this.q.size()) {
            ebVar.e((int) p, (fO) this.q.get(i));
            int i2 = i + l;
            if (z) {
                break;
            }
            i = i2;
        }
        e.a(536870912, ebVar);
        getUnknownFields().writeTo(ebVar);
    }

    private cl(boolean z) {
        this.m = (byte) -1;
        this.o = -1;
        this.i = eV.h();
    }

    public fO m179getDefaultInstanceForType() {
        return m();
    }

    public int k() {
        return this.q.size();
    }

    public ci getDefaultInstanceForType() {
        return m();
    }

    public static cb e() {
        return cb.f();
    }

    public il m181toBuilder() {
        return a();
    }

    public il m180newBuilderForType() {
        return j();
    }

    public final eV getUnknownFields() {
        return this.i;
    }

    static {
        n = new g7();
        j = new cl(true);
        j.g();
    }

    private cl(c_ c_Var) {
        super(c_Var);
        this.m = (byte) -1;
        this.o = -1;
        this.i = c_Var.getUnknownFields();
    }

    static boolean a(cl clVar, boolean z) {
        clVar.k = z;
        return z;
    }

    public es a(int i) {
        return (es) this.q.get(i);
    }

    protected Object writeReplace() {
        return super.writeReplace();
    }

    public static cl a(byte[] bArr, h hVar) {
        return (cl) n.a(bArr, hVar);
    }

    public static cl f() {
        return j;
    }

    public static cl a(InputStream inputStream, h hVar) {
        return (cl) n.b(inputStream, hVar);
    }

    public final boolean isInitialized() {
        boolean z = bA.b;
        byte b = this.m;
        if (b == -1) {
            int i = 0;
            while (i < k()) {
                if (b(i).isInitialized()) {
                    i += l;
                    if (z) {
                        break;
                    }
                }
                this.m = (byte) 0;
                return false;
            }
            if (f()) {
                this.m = (byte) 1;
                return true;
            }
            this.m = (byte) 0;
            return false;
        } else if (b == (byte) 1) {
            return true;
        } else {
            return false;
        }
    }

    private void g() {
        this.k = false;
        this.h = false;
        this.q = Collections.emptyList();
    }

    static boolean b(cl clVar, boolean z) {
        clVar.h = z;
        return z;
    }

    static List a(cl clVar, List list) {
        clVar.q = list;
        return list;
    }

    public cl m() {
        return j;
    }

    public cb j() {
        return e();
    }

    public boolean i() {
        return this.k;
    }

    public List d() {
        return this.q;
    }

    public boolean c() {
        return this.h;
    }

    public boolean b() {
        return (this.g & l) == l;
    }

    public static cl a(ad adVar) {
        return (cl) n.a(adVar);
    }

    protected fl newBuilderForType(ec ecVar) {
        return a(ecVar);
    }

    public static cl a(byte[] bArr) {
        return (cl) n.a(bArr);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private cl(com.google.ad r9, com.google.h r10) {
        /*
        r8 = this;
        r2 = 1;
        r0 = 0;
        r1 = -1;
        r7 = 4;
        r3 = com.google.bA.b;
        r8.<init>();
        r8.m = r1;
        r8.o = r1;
        r8.g();
        r4 = com.google.eV.g();
        r1 = r0;
    L_0x0015:
        if (r0 != 0) goto L_0x005d;
    L_0x0017:
        r5 = r9.z();	 Catch:{ fN -> 0x0079, IOException -> 0x009c }
        switch(r5) {
            case 0: goto L_0x0073;
            case 8: goto L_0x0027;
            case 16: goto L_0x0035;
            case 7994: goto L_0x0043;
            default: goto L_0x001e;
        };
    L_0x001e:
        r5 = r8.a(r9, r4, r10, r5);	 Catch:{ fN -> 0x0077, IOException -> 0x009c }
        if (r5 != 0) goto L_0x005b;
    L_0x0024:
        if (r3 == 0) goto L_0x00af;
    L_0x0026:
        r0 = r2;
    L_0x0027:
        r5 = r8.g;	 Catch:{ fN -> 0x0096, IOException -> 0x009c }
        r5 = r5 | 1;
        r8.g = r5;	 Catch:{ fN -> 0x0096, IOException -> 0x009c }
        r5 = r9.w();	 Catch:{ fN -> 0x0096, IOException -> 0x009c }
        r8.k = r5;	 Catch:{ fN -> 0x0096, IOException -> 0x009c }
        if (r3 == 0) goto L_0x005b;
    L_0x0035:
        r5 = r8.g;	 Catch:{ fN -> 0x0098, IOException -> 0x009c }
        r5 = r5 | 2;
        r8.g = r5;	 Catch:{ fN -> 0x0098, IOException -> 0x009c }
        r5 = r9.w();	 Catch:{ fN -> 0x0098, IOException -> 0x009c }
        r8.h = r5;	 Catch:{ fN -> 0x0098, IOException -> 0x009c }
        if (r3 == 0) goto L_0x005b;
    L_0x0043:
        r5 = r1 & 4;
        if (r5 == r7) goto L_0x0050;
    L_0x0047:
        r5 = new java.util.ArrayList;	 Catch:{ fN -> 0x0079, IOException -> 0x009c }
        r5.<init>();	 Catch:{ fN -> 0x0079, IOException -> 0x009c }
        r8.q = r5;	 Catch:{ fN -> 0x0079, IOException -> 0x009c }
        r1 = r1 | 4;
    L_0x0050:
        r5 = r8.q;	 Catch:{ fN -> 0x0079, IOException -> 0x009c }
        r6 = com.google.cj.u;	 Catch:{ fN -> 0x0079, IOException -> 0x009c }
        r6 = r9.a(r6, r10);	 Catch:{ fN -> 0x0079, IOException -> 0x009c }
        r5.add(r6);	 Catch:{ fN -> 0x0079, IOException -> 0x009c }
    L_0x005b:
        if (r3 == 0) goto L_0x0015;
    L_0x005d:
        r0 = r1 & 4;
        if (r0 != r7) goto L_0x0069;
    L_0x0061:
        r0 = r8.q;	 Catch:{ fN -> 0x00ad }
        r0 = java.util.Collections.unmodifiableList(r0);	 Catch:{ fN -> 0x00ad }
        r8.q = r0;	 Catch:{ fN -> 0x00ad }
    L_0x0069:
        r0 = r4.d();
        r8.i = r0;
        r8.b();
        return;
    L_0x0073:
        if (r3 == 0) goto L_0x00af;
    L_0x0075:
        r0 = r2;
        goto L_0x001e;
    L_0x0077:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0079, IOException -> 0x009c }
    L_0x0079:
        r0 = move-exception;
        r0 = r0.a(r8);	 Catch:{ all -> 0x007f }
        throw r0;	 Catch:{ all -> 0x007f }
    L_0x007f:
        r0 = move-exception;
        r1 = r1 & 4;
        if (r1 != r7) goto L_0x008c;
    L_0x0084:
        r1 = r8.q;	 Catch:{ fN -> 0x00ab }
        r1 = java.util.Collections.unmodifiableList(r1);	 Catch:{ fN -> 0x00ab }
        r8.q = r1;	 Catch:{ fN -> 0x00ab }
    L_0x008c:
        r1 = r4.d();
        r8.i = r1;
        r8.b();
        throw r0;
    L_0x0096:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0098, IOException -> 0x009c }
    L_0x0098:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x009a, IOException -> 0x009c }
    L_0x009a:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0079, IOException -> 0x009c }
    L_0x009c:
        r0 = move-exception;
        r2 = new com.google.fN;	 Catch:{ all -> 0x007f }
        r0 = r0.getMessage();	 Catch:{ all -> 0x007f }
        r2.<init>(r0);	 Catch:{ all -> 0x007f }
        r0 = r2.a(r8);	 Catch:{ all -> 0x007f }
        throw r0;	 Catch:{ all -> 0x007f }
    L_0x00ab:
        r0 = move-exception;
        throw r0;
    L_0x00ad:
        r0 = move-exception;
        throw r0;
    L_0x00af:
        r0 = r2;
        goto L_0x005b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.cl.<init>(com.google.ad, com.google.h):void");
    }

    public fl toBuilder() {
        return a();
    }

    cl(c_ c_Var, fm fmVar) {
        this(c_Var);
    }

    public static cl a(hx hxVar) {
        return (cl) n.a(hxVar);
    }

    public static cl b(InputStream inputStream) {
        return (cl) n.a(inputStream);
    }

    public static final fn h() {
        return bh.h();
    }

    public cj b(int i) {
        return (cj) this.q.get(i);
    }

    public static cl b(InputStream inputStream, h hVar) {
        return (cl) n.a(inputStream, hVar);
    }

    public cb a() {
        return b(this);
    }

    protected cb a(ec ecVar) {
        return new cb(ecVar, null);
    }

    public static cb b(cl clVar) {
        return e().a(clVar);
    }

    public static cl a(InputStream inputStream) {
        return (cl) n.b(inputStream);
    }

    public T getParserForType() {
        return n;
    }

    public static cl a(hx hxVar, h hVar) {
        return (cl) n.b(hxVar, hVar);
    }

    public boolean n() {
        return (this.g & f) == f;
    }

    public static cl a(ad adVar, h hVar) {
        return (cl) n.a(adVar, hVar);
    }

    protected bJ internalGetFieldAccessorTable() {
        return bh.t().a(cl.class, cb.class);
    }

    public List l() {
        return this.q;
    }

    static List a(cl clVar) {
        return clVar.q;
    }

    public int getSerializedSize() {
        int i = 0;
        boolean z = bA.b;
        int i2 = this.o;
        if (i2 != -1) {
            return i2;
        }
        if ((this.g & l) == l) {
            i2 = eb.b((int) l, this.k) + 0;
        } else {
            i2 = 0;
        }
        if ((this.g & f) == f) {
            i2 += eb.b((int) f, this.h);
        }
        int i3 = i2;
        while (i < this.q.size()) {
            i2 = eb.f((int) p, (fO) this.q.get(i)) + i3;
            i += l;
            if (z) {
                break;
            }
            i3 = i2;
        }
        i2 = i3;
        i2 = (i2 + a()) + getUnknownFields().getSerializedSize();
        this.o = i2;
        return i2;
    }

    public fl newBuilderForType() {
        return j();
    }
}
