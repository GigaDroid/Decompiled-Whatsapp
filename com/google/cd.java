package com.google;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

public final class cd extends bL implements d1 {
    public static T e = null;
    public static final int h = 4;
    private static final cd i;
    public static final int l = 1;
    public static final int p = 3;
    public static final int s = 2;
    private static final long serialVersionUID = 0;
    private final eV f;
    private int g;
    private byte j;
    private List k;
    private int m;
    private int n;
    private Object o;
    private List q;
    private Object r;
    private int t;

    public fl newBuilderForType() {
        return p();
    }

    protected cN a(ec ecVar) {
        return new cN(ecVar, null);
    }

    cd(cJ cJVar, fm fmVar) {
        this(cJVar);
    }

    public static cd b(InputStream inputStream, h hVar) {
        return (cd) e.b(inputStream, hVar);
    }

    public final boolean isInitialized() {
        byte b = this.j;
        if (b == -1) {
            this.j = (byte) 1;
            return true;
        } else if (b == (byte) 1) {
            return true;
        } else {
            return false;
        }
    }

    private cd(boolean z) {
        this.t = -1;
        this.m = -1;
        this.j = (byte) -1;
        this.g = -1;
        this.f = eV.h();
    }

    public cN b() {
        return a(this);
    }

    public int f() {
        return this.k.size();
    }

    static {
        e = new g_();
        i = new cd(true);
        i.d();
    }

    public static cd a(byte[] bArr, h hVar) {
        return (cd) e.a(bArr, hVar);
    }

    public String i() {
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

    public boolean j() {
        return (this.n & s) == s;
    }

    protected Object writeReplace() {
        return super.writeReplace();
    }

    public il m331newBuilderForType() {
        return p();
    }

    static List b(cd cdVar, List list) {
        cdVar.k = list;
        return list;
    }

    public String n() {
        Object obj = this.o;
        if (obj instanceof String) {
            return (String) obj;
        }
        hx hxVar = (hx) obj;
        String e = hxVar.e();
        if (hxVar.d()) {
            this.o = e;
        }
        return e;
    }

    public static cd a(hx hxVar, h hVar) {
        return (cd) e.b(hxVar, hVar);
    }

    public void writeTo(eb ebVar) {
        int i = 0;
        boolean z = bA.b;
        getSerializedSize();
        if (k().size() > 0) {
            ebVar.k(10);
            ebVar.k(this.t);
        }
        int i2 = 0;
        while (i2 < this.k.size()) {
            ebVar.j(((Integer) this.k.get(i2)).intValue());
            int i3 = i2 + l;
            if (z) {
                break;
            }
            i2 = i3;
        }
        if (m().size() > 0) {
            ebVar.k(18);
            ebVar.k(this.m);
        }
        while (i < this.q.size()) {
            ebVar.j(((Integer) this.q.get(i)).intValue());
            i += l;
            if (z) {
                break;
            }
        }
        if ((this.n & l) == l) {
            ebVar.d((int) p, q());
        }
        if ((this.n & s) == s) {
            ebVar.d((int) h, o());
        }
        getUnknownFields().writeTo(ebVar);
    }

    public boolean a() {
        return (this.n & l) == l;
    }

    public static cd a(hx hxVar) {
        return (cd) e.a(hxVar);
    }

    public static cd e() {
        return i;
    }

    static Object a(cd cdVar, Object obj) {
        cdVar.o = obj;
        return obj;
    }

    private cd(cJ cJVar) {
        super(cJVar);
        this.t = -1;
        this.m = -1;
        this.j = (byte) -1;
        this.g = -1;
        this.f = cJVar.getUnknownFields();
    }

    static List a(cd cdVar, List list) {
        cdVar.q = list;
        return list;
    }

    public ci getDefaultInstanceForType() {
        return g();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private cd(com.google.ad r10, com.google.h r11) {
        /*
        r9 = this;
        r0 = 0;
        r8 = 2;
        r1 = -1;
        r2 = 1;
        r3 = com.google.bA.b;
        r9.<init>();
        r9.t = r1;
        r9.m = r1;
        r9.j = r1;
        r9.g = r1;
        r9.d();
        r4 = com.google.eV.g();
        r1 = r0;
    L_0x0019:
        if (r0 != 0) goto L_0x00e9;
    L_0x001b:
        r5 = r10.z();	 Catch:{ fN -> 0x0112, IOException -> 0x013d }
        switch(r5) {
            case 0: goto L_0x010b;
            case 8: goto L_0x002b;
            case 10: goto L_0x0047;
            case 16: goto L_0x007c;
            case 18: goto L_0x0098;
            case 26: goto L_0x00cd;
            case 34: goto L_0x00db;
            default: goto L_0x0022;
        };
    L_0x0022:
        r5 = r9.a(r10, r4, r11, r5);	 Catch:{ fN -> 0x0110, IOException -> 0x013d }
        if (r5 != 0) goto L_0x00e7;
    L_0x0028:
        if (r3 == 0) goto L_0x015c;
    L_0x002a:
        r0 = r2;
    L_0x002b:
        r5 = r1 & 1;
        if (r5 == r2) goto L_0x0038;
    L_0x002f:
        r5 = new java.util.ArrayList;	 Catch:{ fN -> 0x0112, IOException -> 0x013d }
        r5.<init>();	 Catch:{ fN -> 0x0112, IOException -> 0x013d }
        r9.k = r5;	 Catch:{ fN -> 0x0112, IOException -> 0x013d }
        r1 = r1 | 1;
    L_0x0038:
        r5 = r9.k;	 Catch:{ fN -> 0x0112, IOException -> 0x013d }
        r6 = r10.i();	 Catch:{ fN -> 0x0112, IOException -> 0x013d }
        r6 = java.lang.Integer.valueOf(r6);	 Catch:{ fN -> 0x0112, IOException -> 0x013d }
        r5.add(r6);	 Catch:{ fN -> 0x0112, IOException -> 0x013d }
        if (r3 == 0) goto L_0x00e7;
    L_0x0047:
        r5 = r10.n();	 Catch:{ fN -> 0x0112, IOException -> 0x013d }
        r5 = r10.b(r5);	 Catch:{ fN -> 0x0112, IOException -> 0x013d }
        r6 = r1 & 1;
        if (r6 == r2) goto L_0x0062;
    L_0x0053:
        r6 = r10.e();	 Catch:{ fN -> 0x013b, IOException -> 0x013d }
        if (r6 <= 0) goto L_0x0062;
    L_0x0059:
        r6 = new java.util.ArrayList;	 Catch:{ fN -> 0x0112, IOException -> 0x013d }
        r6.<init>();	 Catch:{ fN -> 0x0112, IOException -> 0x013d }
        r9.k = r6;	 Catch:{ fN -> 0x0112, IOException -> 0x013d }
        r1 = r1 | 1;
    L_0x0062:
        r6 = r10.e();	 Catch:{ fN -> 0x0112, IOException -> 0x013d }
        if (r6 <= 0) goto L_0x0077;
    L_0x0068:
        r6 = r9.k;	 Catch:{ fN -> 0x0112, IOException -> 0x013d }
        r7 = r10.i();	 Catch:{ fN -> 0x0112, IOException -> 0x013d }
        r7 = java.lang.Integer.valueOf(r7);	 Catch:{ fN -> 0x0112, IOException -> 0x013d }
        r6.add(r7);	 Catch:{ fN -> 0x0112, IOException -> 0x013d }
        if (r3 == 0) goto L_0x0062;
    L_0x0077:
        r10.g(r5);	 Catch:{ fN -> 0x014c, IOException -> 0x013d }
        if (r3 == 0) goto L_0x00e7;
    L_0x007c:
        r5 = r1 & 2;
        if (r5 == r8) goto L_0x0089;
    L_0x0080:
        r5 = new java.util.ArrayList;	 Catch:{ fN -> 0x0112, IOException -> 0x013d }
        r5.<init>();	 Catch:{ fN -> 0x0112, IOException -> 0x013d }
        r9.q = r5;	 Catch:{ fN -> 0x0112, IOException -> 0x013d }
        r1 = r1 | 2;
    L_0x0089:
        r5 = r9.q;	 Catch:{ fN -> 0x0112, IOException -> 0x013d }
        r6 = r10.i();	 Catch:{ fN -> 0x0112, IOException -> 0x013d }
        r6 = java.lang.Integer.valueOf(r6);	 Catch:{ fN -> 0x0112, IOException -> 0x013d }
        r5.add(r6);	 Catch:{ fN -> 0x0112, IOException -> 0x013d }
        if (r3 == 0) goto L_0x00e7;
    L_0x0098:
        r5 = r10.n();	 Catch:{ fN -> 0x0112, IOException -> 0x013d }
        r5 = r10.b(r5);	 Catch:{ fN -> 0x0112, IOException -> 0x013d }
        r6 = r1 & 2;
        if (r6 == r8) goto L_0x00b3;
    L_0x00a4:
        r6 = r10.e();	 Catch:{ fN -> 0x014e, IOException -> 0x013d }
        if (r6 <= 0) goto L_0x00b3;
    L_0x00aa:
        r6 = new java.util.ArrayList;	 Catch:{ fN -> 0x0112, IOException -> 0x013d }
        r6.<init>();	 Catch:{ fN -> 0x0112, IOException -> 0x013d }
        r9.q = r6;	 Catch:{ fN -> 0x0112, IOException -> 0x013d }
        r1 = r1 | 2;
    L_0x00b3:
        r6 = r10.e();	 Catch:{ fN -> 0x0112, IOException -> 0x013d }
        if (r6 <= 0) goto L_0x00c8;
    L_0x00b9:
        r6 = r9.q;	 Catch:{ fN -> 0x0112, IOException -> 0x013d }
        r7 = r10.i();	 Catch:{ fN -> 0x0112, IOException -> 0x013d }
        r7 = java.lang.Integer.valueOf(r7);	 Catch:{ fN -> 0x0112, IOException -> 0x013d }
        r6.add(r7);	 Catch:{ fN -> 0x0112, IOException -> 0x013d }
        if (r3 == 0) goto L_0x00b3;
    L_0x00c8:
        r10.g(r5);	 Catch:{ fN -> 0x0150, IOException -> 0x013d }
        if (r3 == 0) goto L_0x00e7;
    L_0x00cd:
        r5 = r9.n;	 Catch:{ fN -> 0x0150, IOException -> 0x013d }
        r5 = r5 | 1;
        r9.n = r5;	 Catch:{ fN -> 0x0150, IOException -> 0x013d }
        r5 = r10.q();	 Catch:{ fN -> 0x0150, IOException -> 0x013d }
        r9.r = r5;	 Catch:{ fN -> 0x0150, IOException -> 0x013d }
        if (r3 == 0) goto L_0x00e7;
    L_0x00db:
        r5 = r9.n;	 Catch:{ fN -> 0x0152, IOException -> 0x013d }
        r5 = r5 | 2;
        r9.n = r5;	 Catch:{ fN -> 0x0152, IOException -> 0x013d }
        r5 = r10.q();	 Catch:{ fN -> 0x0152, IOException -> 0x013d }
        r9.o = r5;	 Catch:{ fN -> 0x0152, IOException -> 0x013d }
    L_0x00e7:
        if (r3 == 0) goto L_0x0019;
    L_0x00e9:
        r0 = r1 & 1;
        if (r0 != r2) goto L_0x00f5;
    L_0x00ed:
        r0 = r9.k;	 Catch:{ fN -> 0x0158 }
        r0 = java.util.Collections.unmodifiableList(r0);	 Catch:{ fN -> 0x0158 }
        r9.k = r0;	 Catch:{ fN -> 0x0158 }
    L_0x00f5:
        r0 = r1 & 2;
        if (r0 != r8) goto L_0x0101;
    L_0x00f9:
        r0 = r9.q;	 Catch:{ fN -> 0x015a }
        r0 = java.util.Collections.unmodifiableList(r0);	 Catch:{ fN -> 0x015a }
        r9.q = r0;	 Catch:{ fN -> 0x015a }
    L_0x0101:
        r0 = r4.d();
        r9.f = r0;
        r9.b();
        return;
    L_0x010b:
        if (r3 == 0) goto L_0x015c;
    L_0x010d:
        r0 = r2;
        goto L_0x0022;
    L_0x0110:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0112, IOException -> 0x013d }
    L_0x0112:
        r0 = move-exception;
        r0 = r0.a(r9);	 Catch:{ all -> 0x0118 }
        throw r0;	 Catch:{ all -> 0x0118 }
    L_0x0118:
        r0 = move-exception;
        r3 = r1 & 1;
        if (r3 != r2) goto L_0x0125;
    L_0x011d:
        r2 = r9.k;	 Catch:{ fN -> 0x0154 }
        r2 = java.util.Collections.unmodifiableList(r2);	 Catch:{ fN -> 0x0154 }
        r9.k = r2;	 Catch:{ fN -> 0x0154 }
    L_0x0125:
        r1 = r1 & 2;
        if (r1 != r8) goto L_0x0131;
    L_0x0129:
        r1 = r9.q;	 Catch:{ fN -> 0x0156 }
        r1 = java.util.Collections.unmodifiableList(r1);	 Catch:{ fN -> 0x0156 }
        r9.q = r1;	 Catch:{ fN -> 0x0156 }
    L_0x0131:
        r1 = r4.d();
        r9.f = r1;
        r9.b();
        throw r0;
    L_0x013b:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0112, IOException -> 0x013d }
    L_0x013d:
        r0 = move-exception;
        r3 = new com.google.fN;	 Catch:{ all -> 0x0118 }
        r0 = r0.getMessage();	 Catch:{ all -> 0x0118 }
        r3.<init>(r0);	 Catch:{ all -> 0x0118 }
        r0 = r3.a(r9);	 Catch:{ all -> 0x0118 }
        throw r0;	 Catch:{ all -> 0x0118 }
    L_0x014c:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0112, IOException -> 0x013d }
    L_0x014e:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0112, IOException -> 0x013d }
    L_0x0150:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0152, IOException -> 0x013d }
    L_0x0152:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0112, IOException -> 0x013d }
    L_0x0154:
        r0 = move-exception;
        throw r0;
    L_0x0156:
        r0 = move-exception;
        throw r0;
    L_0x0158:
        r0 = move-exception;
        throw r0;
    L_0x015a:
        r0 = move-exception;
        throw r0;
    L_0x015c:
        r0 = r2;
        goto L_0x00e7;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.cd.<init>(com.google.ad, com.google.h):void");
    }

    public il m332toBuilder() {
        return b();
    }

    static Object b(cd cdVar) {
        return cdVar.r;
    }

    static Object b(cd cdVar, Object obj) {
        cdVar.r = obj;
        return obj;
    }

    private void d() {
        this.k = Collections.emptyList();
        this.q = Collections.emptyList();
        this.r = "";
        this.o = "";
    }

    public fO m330getDefaultInstanceForType() {
        return g();
    }

    static Object c(cd cdVar) {
        return cdVar.o;
    }

    public static cd a(InputStream inputStream) {
        return (cd) e.b(inputStream);
    }

    public fl toBuilder() {
        return b();
    }

    public static cd b(InputStream inputStream) {
        return (cd) e.a(inputStream);
    }

    public static cd a(ad adVar) {
        return (cd) e.a(adVar);
    }

    public static cd a(ad adVar, h hVar) {
        return (cd) e.a(adVar, hVar);
    }

    public final eV getUnknownFields() {
        return this.f;
    }

    public cd g() {
        return i;
    }

    protected fl newBuilderForType(ec ecVar) {
        return a(ecVar);
    }

    public List k() {
        return this.k;
    }

    public static cd a(InputStream inputStream, h hVar) {
        return (cd) e.a(inputStream, hVar);
    }

    public int b(int i) {
        return ((Integer) this.k.get(i)).intValue();
    }

    public int a(int i) {
        return ((Integer) this.q.get(i)).intValue();
    }

    protected bJ internalGetFieldAccessorTable() {
        return bh.N().a(cd.class, cN.class);
    }

    static List d(cd cdVar) {
        return cdVar.k;
    }

    public hx q() {
        Object obj = this.r;
        if (!(obj instanceof String)) {
            return (hx) obj;
        }
        hx a = hx.a((String) obj);
        this.r = a;
        return a;
    }

    public T getParserForType() {
        return e;
    }

    public static cd a(byte[] bArr) {
        return (cd) e.a(bArr);
    }

    public List m() {
        return this.q;
    }

    public static cN c() {
        return cN.a();
    }

    public cN p() {
        return c();
    }

    public static final fn l() {
        return bh.H();
    }

    static int a(cd cdVar, int i) {
        cdVar.n = i;
        return i;
    }

    static List e(cd cdVar) {
        return cdVar.q;
    }

    public hx o() {
        Object obj = this.o;
        if (!(obj instanceof String)) {
            return (hx) obj;
        }
        hx a = hx.a((String) obj);
        this.o = a;
        return a;
    }

    public int h() {
        return this.q.size();
    }

    public int getSerializedSize() {
        int i = 0;
        boolean z = bA.b;
        int i2 = this.g;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        int i4 = 0;
        while (i3 < this.k.size()) {
            i4 += eb.d(((Integer) this.k.get(i3)).intValue());
            i2 = i3 + l;
            if (z) {
                break;
            }
            i3 = i2;
        }
        i2 = 0 + i4;
        if (k().isEmpty()) {
            i3 = i2;
        } else {
            i3 = (i2 + l) + eb.d(i4);
        }
        this.t = i4;
        i4 = 0;
        while (i < this.q.size()) {
            i2 = eb.d(((Integer) this.q.get(i)).intValue()) + i4;
            i += l;
            if (z) {
                break;
            }
            i4 = i2;
        }
        i2 = i4;
        i3 += i2;
        if (!m().isEmpty()) {
            i3 = (i3 + l) + eb.d(i2);
        }
        this.m = i2;
        if ((this.n & l) == l) {
            i3 += eb.c((int) p, q());
        }
        if ((this.n & s) == s) {
            i3 += eb.c((int) h, o());
        }
        i2 = getUnknownFields().getSerializedSize() + i3;
        this.g = i2;
        return i2;
    }

    public static cN a(cd cdVar) {
        return c().a(cdVar);
    }

    cd(ad adVar, h hVar, fm fmVar) {
        this(adVar, hVar);
    }
}
