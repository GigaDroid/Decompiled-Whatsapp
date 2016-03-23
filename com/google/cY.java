package com.google;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

public final class cY extends c8 implements bZ {
    public static final int g = 9;
    public static final int k = 3;
    public static final int l = 5;
    public static T n = null;
    public static final int p = 10;
    public static final int s = 999;
    private static final long serialVersionUID = 0;
    public static final int u = 1;
    private static final cY x;
    public static final int y = 2;
    private boolean f;
    private byte h;
    private int i;
    private boolean j;
    private boolean m;
    private List o;
    private final eV q;
    private Object r;
    private int t;
    private boolean v;
    private dp w;

    public cs s() {
        return h();
    }

    public int k() {
        return this.o.size();
    }

    protected cs a(ec ecVar) {
        return new cs(ecVar, null);
    }

    public final boolean isInitialized() {
        boolean z = bA.b;
        byte b = this.h;
        if (b == -1) {
            int i = 0;
            while (i < k()) {
                if (b(i).isInitialized()) {
                    i += u;
                    if (z) {
                        break;
                    }
                }
                this.h = (byte) 0;
                return false;
            }
            if (f()) {
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

    private void i() {
        this.w = dp.STRING;
        this.m = false;
        this.v = false;
        this.j = false;
        this.r = "";
        this.f = false;
        this.o = Collections.emptyList();
    }

    static Object a(cY cYVar, Object obj) {
        cYVar.r = obj;
        return obj;
    }

    public boolean c() {
        return (this.i & u) == u;
    }

    static boolean b(cY cYVar, boolean z) {
        cYVar.m = z;
        return z;
    }

    public boolean l() {
        return (this.i & 16) == 16;
    }

    public fl newBuilderForType() {
        return s();
    }

    public static cs h() {
        return cs.e();
    }

    static int a(cY cYVar, int i) {
        cYVar.i = i;
        return i;
    }

    public boolean o() {
        return this.m;
    }

    public boolean g() {
        return (this.i & y) == y;
    }

    public static cY a(ad adVar, h hVar) {
        return (cY) n.a(adVar, hVar);
    }

    public static cY a(ad adVar) {
        return (cY) n.a(adVar);
    }

    public static cY a(InputStream inputStream) {
        return (cY) n.b(inputStream);
    }

    public dp p() {
        return this.w;
    }

    static boolean a(cY cYVar, boolean z) {
        cYVar.f = z;
        return z;
    }

    static dp a(cY cYVar, dp dpVar) {
        cYVar.w = dpVar;
        return dpVar;
    }

    public static cY a(byte[] bArr) {
        return (cY) n.a(bArr);
    }

    public fO m400getDefaultInstanceForType() {
        return u();
    }

    public static cY a(byte[] bArr, h hVar) {
        return (cY) n.a(bArr, hVar);
    }

    public void writeTo(eb ebVar) {
        boolean z = bA.b;
        getSerializedSize();
        f2 e = e();
        if ((this.i & u) == u) {
            ebVar.f((int) u, this.w.getNumber());
        }
        if ((this.i & y) == y) {
            ebVar.a((int) y, this.m);
        }
        if ((this.i & 8) == 8) {
            ebVar.a((int) k, this.j);
        }
        if ((this.i & 4) == 4) {
            ebVar.a((int) l, this.v);
        }
        if ((this.i & 16) == 16) {
            ebVar.d((int) g, b());
        }
        if ((this.i & 32) == 32) {
            ebVar.a((int) p, this.f);
        }
        int i = 0;
        while (i < this.o.size()) {
            ebVar.e((int) s, (fO) this.o.get(i));
            int i2 = i + u;
            if (z) {
                break;
            }
            i = i2;
        }
        e.a(536870912, ebVar);
        getUnknownFields().writeTo(ebVar);
    }

    public static cY w() {
        return x;
    }

    public cY u() {
        return x;
    }

    private cY(c_ c_Var) {
        super(c_Var);
        this.h = (byte) -1;
        this.t = -1;
        this.q = c_Var.getUnknownFields();
    }

    public static cY a(hx hxVar, h hVar) {
        return (cY) n.b(hxVar, hVar);
    }

    public boolean m() {
        return (this.i & 32) == 32;
    }

    public hx b() {
        Object obj = this.r;
        if (!(obj instanceof String)) {
            return (hx) obj;
        }
        hx a = hx.a((String) obj);
        this.r = a;
        return a;
    }

    private cY(boolean z) {
        this.h = (byte) -1;
        this.t = -1;
        this.q = eV.h();
    }

    public T getParserForType() {
        return n;
    }

    public static final fn f() {
        return bh.K();
    }

    public static cY b(InputStream inputStream, h hVar) {
        return (cY) n.a(inputStream, hVar);
    }

    static boolean d(cY cYVar, boolean z) {
        cYVar.v = z;
        return z;
    }

    protected fl newBuilderForType(ec ecVar) {
        return a(ecVar);
    }

    protected bJ internalGetFieldAccessorTable() {
        return bh.o().a(cY.class, cs.class);
    }

    cY(c_ c_Var, fm fmVar) {
        this(c_Var);
    }

    public static cs a(cY cYVar) {
        return h().a(cYVar);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private cY(com.google.ad r10, com.google.h r11) {
        /*
        r9 = this;
        r0 = 0;
        r1 = -1;
        r8 = 64;
        r2 = 1;
        r3 = com.google.bA.b;
        r9.<init>();
        r9.h = r1;
        r9.t = r1;
        r9.i();
        r4 = com.google.eV.g();
        r1 = r0;
    L_0x0016:
        if (r0 != 0) goto L_0x00a2;
    L_0x0018:
        r5 = r10.z();	 Catch:{ fN -> 0x00bf, IOException -> 0x00ec }
        switch(r5) {
            case 0: goto L_0x00b8;
            case 8: goto L_0x0028;
            case 16: goto L_0x0042;
            case 24: goto L_0x0050;
            case 40: goto L_0x005e;
            case 74: goto L_0x006c;
            case 80: goto L_0x007a;
            case 7994: goto L_0x0088;
            default: goto L_0x001f;
        };
    L_0x001f:
        r5 = r9.a(r10, r4, r11, r5);	 Catch:{ fN -> 0x00bd, IOException -> 0x00ec }
        if (r5 != 0) goto L_0x00a0;
    L_0x0025:
        if (r3 == 0) goto L_0x00ff;
    L_0x0027:
        r0 = r2;
    L_0x0028:
        r5 = r10.b();	 Catch:{ fN -> 0x00bf, IOException -> 0x00ec }
        r6 = com.google.dp.valueOf(r5);	 Catch:{ fN -> 0x00bf, IOException -> 0x00ec }
        if (r6 != 0) goto L_0x0038;
    L_0x0032:
        r7 = 1;
        r4.a(r7, r5);	 Catch:{ fN -> 0x00dc, IOException -> 0x00ec }
        if (r3 == 0) goto L_0x00a0;
    L_0x0038:
        r5 = r9.i;	 Catch:{ fN -> 0x00de, IOException -> 0x00ec }
        r5 = r5 | 1;
        r9.i = r5;	 Catch:{ fN -> 0x00de, IOException -> 0x00ec }
        r9.w = r6;	 Catch:{ fN -> 0x00de, IOException -> 0x00ec }
        if (r3 == 0) goto L_0x00a0;
    L_0x0042:
        r5 = r9.i;	 Catch:{ fN -> 0x00e0, IOException -> 0x00ec }
        r5 = r5 | 2;
        r9.i = r5;	 Catch:{ fN -> 0x00e0, IOException -> 0x00ec }
        r5 = r10.w();	 Catch:{ fN -> 0x00e0, IOException -> 0x00ec }
        r9.m = r5;	 Catch:{ fN -> 0x00e0, IOException -> 0x00ec }
        if (r3 == 0) goto L_0x00a0;
    L_0x0050:
        r5 = r9.i;	 Catch:{ fN -> 0x00e2, IOException -> 0x00ec }
        r5 = r5 | 8;
        r9.i = r5;	 Catch:{ fN -> 0x00e2, IOException -> 0x00ec }
        r5 = r10.w();	 Catch:{ fN -> 0x00e2, IOException -> 0x00ec }
        r9.j = r5;	 Catch:{ fN -> 0x00e2, IOException -> 0x00ec }
        if (r3 == 0) goto L_0x00a0;
    L_0x005e:
        r5 = r9.i;	 Catch:{ fN -> 0x00e4, IOException -> 0x00ec }
        r5 = r5 | 4;
        r9.i = r5;	 Catch:{ fN -> 0x00e4, IOException -> 0x00ec }
        r5 = r10.w();	 Catch:{ fN -> 0x00e4, IOException -> 0x00ec }
        r9.v = r5;	 Catch:{ fN -> 0x00e4, IOException -> 0x00ec }
        if (r3 == 0) goto L_0x00a0;
    L_0x006c:
        r5 = r9.i;	 Catch:{ fN -> 0x00e6, IOException -> 0x00ec }
        r5 = r5 | 16;
        r9.i = r5;	 Catch:{ fN -> 0x00e6, IOException -> 0x00ec }
        r5 = r10.q();	 Catch:{ fN -> 0x00e6, IOException -> 0x00ec }
        r9.r = r5;	 Catch:{ fN -> 0x00e6, IOException -> 0x00ec }
        if (r3 == 0) goto L_0x00a0;
    L_0x007a:
        r5 = r9.i;	 Catch:{ fN -> 0x00e8, IOException -> 0x00ec }
        r5 = r5 | 32;
        r9.i = r5;	 Catch:{ fN -> 0x00e8, IOException -> 0x00ec }
        r5 = r10.w();	 Catch:{ fN -> 0x00e8, IOException -> 0x00ec }
        r9.f = r5;	 Catch:{ fN -> 0x00e8, IOException -> 0x00ec }
        if (r3 == 0) goto L_0x00a0;
    L_0x0088:
        r5 = r1 & 64;
        if (r5 == r8) goto L_0x0095;
    L_0x008c:
        r5 = new java.util.ArrayList;	 Catch:{ fN -> 0x00bf, IOException -> 0x00ec }
        r5.<init>();	 Catch:{ fN -> 0x00bf, IOException -> 0x00ec }
        r9.o = r5;	 Catch:{ fN -> 0x00bf, IOException -> 0x00ec }
        r1 = r1 | 64;
    L_0x0095:
        r5 = r9.o;	 Catch:{ fN -> 0x00bf, IOException -> 0x00ec }
        r6 = com.google.cj.u;	 Catch:{ fN -> 0x00bf, IOException -> 0x00ec }
        r6 = r10.a(r6, r11);	 Catch:{ fN -> 0x00bf, IOException -> 0x00ec }
        r5.add(r6);	 Catch:{ fN -> 0x00bf, IOException -> 0x00ec }
    L_0x00a0:
        if (r3 == 0) goto L_0x0016;
    L_0x00a2:
        r0 = r1 & 64;
        if (r0 != r8) goto L_0x00ae;
    L_0x00a6:
        r0 = r9.o;	 Catch:{ fN -> 0x00fd }
        r0 = java.util.Collections.unmodifiableList(r0);	 Catch:{ fN -> 0x00fd }
        r9.o = r0;	 Catch:{ fN -> 0x00fd }
    L_0x00ae:
        r0 = r4.d();
        r9.q = r0;
        r9.b();
        return;
    L_0x00b8:
        if (r3 == 0) goto L_0x00ff;
    L_0x00ba:
        r0 = r2;
        goto L_0x001f;
    L_0x00bd:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x00bf, IOException -> 0x00ec }
    L_0x00bf:
        r0 = move-exception;
        r0 = r0.a(r9);	 Catch:{ all -> 0x00c5 }
        throw r0;	 Catch:{ all -> 0x00c5 }
    L_0x00c5:
        r0 = move-exception;
        r1 = r1 & 64;
        if (r1 != r8) goto L_0x00d2;
    L_0x00ca:
        r1 = r9.o;	 Catch:{ fN -> 0x00fb }
        r1 = java.util.Collections.unmodifiableList(r1);	 Catch:{ fN -> 0x00fb }
        r9.o = r1;	 Catch:{ fN -> 0x00fb }
    L_0x00d2:
        r1 = r4.d();
        r9.q = r1;
        r9.b();
        throw r0;
    L_0x00dc:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x00de, IOException -> 0x00ec }
    L_0x00de:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x00e0, IOException -> 0x00ec }
    L_0x00e0:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x00e2, IOException -> 0x00ec }
    L_0x00e2:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x00e4, IOException -> 0x00ec }
    L_0x00e4:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x00e6, IOException -> 0x00ec }
    L_0x00e6:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x00e8, IOException -> 0x00ec }
    L_0x00e8:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x00ea, IOException -> 0x00ec }
    L_0x00ea:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x00bf, IOException -> 0x00ec }
    L_0x00ec:
        r0 = move-exception;
        r2 = new com.google.fN;	 Catch:{ all -> 0x00c5 }
        r0 = r0.getMessage();	 Catch:{ all -> 0x00c5 }
        r2.<init>(r0);	 Catch:{ all -> 0x00c5 }
        r0 = r2.a(r9);	 Catch:{ all -> 0x00c5 }
        throw r0;	 Catch:{ all -> 0x00c5 }
    L_0x00fb:
        r0 = move-exception;
        throw r0;
    L_0x00fd:
        r0 = move-exception;
        throw r0;
    L_0x00ff:
        r0 = r2;
        goto L_0x00a0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.cY.<init>(com.google.ad, com.google.h):void");
    }

    public boolean n() {
        return this.j;
    }

    public List v() {
        return this.o;
    }

    protected Object writeReplace() {
        return super.writeReplace();
    }

    public il m402toBuilder() {
        return j();
    }

    public boolean t() {
        return this.v;
    }

    public static cY b(InputStream inputStream) {
        return (cY) n.a(inputStream);
    }

    public es a(int i) {
        return (es) this.o.get(i);
    }

    cY(ad adVar, h hVar, fm fmVar) {
        this(adVar, hVar);
    }

    public boolean x() {
        return this.f;
    }

    public final eV getUnknownFields() {
        return this.q;
    }

    public ci getDefaultInstanceForType() {
        return u();
    }

    static {
        n = new g4();
        x = new cY(true);
        x.i();
    }

    public List r() {
        return this.o;
    }

    public cs j() {
        return a(this);
    }

    public boolean d() {
        return (this.i & 8) == 8;
    }

    public int getSerializedSize() {
        int i = 0;
        boolean z = bA.b;
        int i2 = this.t;
        if (i2 != -1) {
            return i2;
        }
        if ((this.i & u) == u) {
            i2 = eb.b((int) u, this.w.getNumber()) + 0;
        } else {
            i2 = 0;
        }
        if ((this.i & y) == y) {
            i2 += eb.b((int) y, this.m);
        }
        if ((this.i & 8) == 8) {
            i2 += eb.b((int) k, this.j);
        }
        if ((this.i & 4) == 4) {
            i2 += eb.b((int) l, this.v);
        }
        if ((this.i & 16) == 16) {
            i2 += eb.c((int) g, b());
        }
        if ((this.i & 32) == 32) {
            i2 += eb.b((int) p, this.f);
        }
        int i3 = i2;
        while (i < this.o.size()) {
            i2 = eb.f((int) s, (fO) this.o.get(i)) + i3;
            i += u;
            if (z) {
                break;
            }
            i3 = i2;
        }
        i2 = i3;
        i2 = (i2 + a()) + getUnknownFields().getSerializedSize();
        this.t = i2;
        return i2;
    }

    public il m401newBuilderForType() {
        return s();
    }

    public String q() {
        Object obj = this.r;
        if (obj instanceof String) {
            return (String) obj;
        }
        hx hxVar = (hx) obj;
        String e = hxVar.e();
        if (hxVar.d()) {
            this.r = e;
        }
        return e;
    }

    public cj b(int i) {
        return (cj) this.o.get(i);
    }

    public static cY a(InputStream inputStream, h hVar) {
        return (cY) n.b(inputStream, hVar);
    }

    public static cY a(hx hxVar) {
        return (cY) n.a(hxVar);
    }

    static List c(cY cYVar) {
        return cYVar.o;
    }

    static List a(cY cYVar, List list) {
        cYVar.o = list;
        return list;
    }

    public fl toBuilder() {
        return j();
    }

    public boolean e() {
        return (this.i & 4) == 4;
    }

    static Object b(cY cYVar) {
        return cYVar.r;
    }

    static boolean c(cY cYVar, boolean z) {
        cYVar.j = z;
        return z;
    }
}
