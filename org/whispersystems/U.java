package org.whispersystems;

import com.google.T;
import com.google.ad;
import com.google.bJ;
import com.google.bL;
import com.google.cJ;
import com.google.ci;
import com.google.eV;
import com.google.eb;
import com.google.ec;
import com.google.fO;
import com.google.fl;
import com.google.fn;
import com.google.h;
import com.google.hx;
import com.google.il;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

public final class U extends bL implements H {
    public static final int f = 1;
    private static final U h;
    public static final int i = 4;
    public static final int k = 3;
    public static T n = null;
    public static final int r = 2;
    private static final long serialVersionUID = 0;
    private int e;
    private V g;
    private byte j;
    private List l;
    private X m;
    private int o;
    private int p;
    private final eV q;

    protected Object writeReplace() {
        return super.writeReplace();
    }

    public ci getDefaultInstanceForType() {
        return m();
    }

    public boolean l() {
        return (this.p & f) == f;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private U(com.google.ad r10, com.google.h r11) {
        /*
        r9 = this;
        r5 = 0;
        r2 = 1;
        r0 = 0;
        r1 = -1;
        r8 = 8;
        r6 = org.whispersystems.Y.r;
        r9.<init>();
        r9.j = r1;
        r9.o = r1;
        r9.o();
        r7 = com.google.eV.g();
        r1 = r0;
    L_0x0017:
        if (r0 != 0) goto L_0x00ad;
    L_0x0019:
        r3 = r10.z();	 Catch:{ fN -> 0x00ca, IOException -> 0x00e9 }
        switch(r3) {
            case 0: goto L_0x00c3;
            case 8: goto L_0x0029;
            case 18: goto L_0x010f;
            case 26: goto L_0x010c;
            case 34: goto L_0x0093;
            default: goto L_0x0020;
        };
    L_0x0020:
        r3 = r9.a(r10, r7, r11, r3);	 Catch:{ fN -> 0x00c8, IOException -> 0x00e9 }
        if (r3 != 0) goto L_0x00ab;
    L_0x0026:
        if (r6 == 0) goto L_0x010a;
    L_0x0028:
        r0 = r2;
    L_0x0029:
        r3 = r9.p;	 Catch:{ fN -> 0x00e7, IOException -> 0x00e9 }
        r3 = r3 | 1;
        r9.p = r3;	 Catch:{ fN -> 0x00e7, IOException -> 0x00e9 }
        r3 = r10.t();	 Catch:{ fN -> 0x00e7, IOException -> 0x00e9 }
        r9.e = r3;	 Catch:{ fN -> 0x00e7, IOException -> 0x00e9 }
        if (r6 == 0) goto L_0x00ab;
    L_0x0037:
        r3 = r0;
    L_0x0038:
        r0 = r9.p;	 Catch:{ fN -> 0x00ca, IOException -> 0x00e9 }
        r0 = r0 & 2;
        r4 = 2;
        if (r0 != r4) goto L_0x0107;
    L_0x003f:
        r0 = r9.g;	 Catch:{ fN -> 0x00ca, IOException -> 0x00e9 }
        r0 = r0.i();	 Catch:{ fN -> 0x00ca, IOException -> 0x00e9 }
        r4 = r0;
    L_0x0046:
        r0 = org.whispersystems.V.PARSER;	 Catch:{ fN -> 0x00f8, IOException -> 0x00e9 }
        r0 = r10.a(r0, r11);	 Catch:{ fN -> 0x00f8, IOException -> 0x00e9 }
        r0 = (org.whispersystems.V) r0;	 Catch:{ fN -> 0x00f8, IOException -> 0x00e9 }
        r9.g = r0;	 Catch:{ fN -> 0x00f8, IOException -> 0x00e9 }
        if (r4 == 0) goto L_0x005d;
    L_0x0052:
        r0 = r9.g;	 Catch:{ fN -> 0x00f8, IOException -> 0x00e9 }
        r4.a(r0);	 Catch:{ fN -> 0x00f8, IOException -> 0x00e9 }
        r0 = r4.i();	 Catch:{ fN -> 0x00f8, IOException -> 0x00e9 }
        r9.g = r0;	 Catch:{ fN -> 0x00f8, IOException -> 0x00e9 }
    L_0x005d:
        r0 = r9.p;	 Catch:{ fN -> 0x00ca, IOException -> 0x00e9 }
        r0 = r0 | 2;
        r9.p = r0;	 Catch:{ fN -> 0x00ca, IOException -> 0x00e9 }
        if (r6 == 0) goto L_0x0102;
    L_0x0065:
        r0 = r9.p;	 Catch:{ fN -> 0x00ca, IOException -> 0x00e9 }
        r0 = r0 & 4;
        r4 = 4;
        if (r0 != r4) goto L_0x0104;
    L_0x006c:
        r0 = r9.m;	 Catch:{ fN -> 0x00ca, IOException -> 0x00e9 }
        r0 = r0.a();	 Catch:{ fN -> 0x00ca, IOException -> 0x00e9 }
        r4 = r0;
    L_0x0073:
        r0 = org.whispersystems.X.PARSER;	 Catch:{ fN -> 0x00fa, IOException -> 0x00e9 }
        r0 = r10.a(r0, r11);	 Catch:{ fN -> 0x00fa, IOException -> 0x00e9 }
        r0 = (org.whispersystems.X) r0;	 Catch:{ fN -> 0x00fa, IOException -> 0x00e9 }
        r9.m = r0;	 Catch:{ fN -> 0x00fa, IOException -> 0x00e9 }
        if (r4 == 0) goto L_0x008a;
    L_0x007f:
        r0 = r9.m;	 Catch:{ fN -> 0x00fa, IOException -> 0x00e9 }
        r4.a(r0);	 Catch:{ fN -> 0x00fa, IOException -> 0x00e9 }
        r0 = r4.a();	 Catch:{ fN -> 0x00fa, IOException -> 0x00e9 }
        r9.m = r0;	 Catch:{ fN -> 0x00fa, IOException -> 0x00e9 }
    L_0x008a:
        r0 = r9.p;	 Catch:{ fN -> 0x00fc, IOException -> 0x00e9 }
        r0 = r0 | 4;
        r9.p = r0;	 Catch:{ fN -> 0x00fc, IOException -> 0x00e9 }
        if (r6 == 0) goto L_0x0102;
    L_0x0092:
        r0 = r3;
    L_0x0093:
        r3 = r1 & 8;
        if (r3 == r8) goto L_0x00a0;
    L_0x0097:
        r3 = new java.util.ArrayList;	 Catch:{ fN -> 0x00ca, IOException -> 0x00e9 }
        r3.<init>();	 Catch:{ fN -> 0x00ca, IOException -> 0x00e9 }
        r9.l = r3;	 Catch:{ fN -> 0x00ca, IOException -> 0x00e9 }
        r1 = r1 | 8;
    L_0x00a0:
        r3 = r9.l;	 Catch:{ fN -> 0x00ca, IOException -> 0x00e9 }
        r4 = org.whispersystems.W.PARSER;	 Catch:{ fN -> 0x00ca, IOException -> 0x00e9 }
        r4 = r10.a(r4, r11);	 Catch:{ fN -> 0x00ca, IOException -> 0x00e9 }
        r3.add(r4);	 Catch:{ fN -> 0x00ca, IOException -> 0x00e9 }
    L_0x00ab:
        if (r6 == 0) goto L_0x0017;
    L_0x00ad:
        r0 = r1 & 8;
        if (r0 != r8) goto L_0x00b9;
    L_0x00b1:
        r0 = r9.l;	 Catch:{ fN -> 0x00fe }
        r0 = java.util.Collections.unmodifiableList(r0);	 Catch:{ fN -> 0x00fe }
        r9.l = r0;	 Catch:{ fN -> 0x00fe }
    L_0x00b9:
        r0 = r7.d();
        r9.q = r0;
        r9.b();
        return;
    L_0x00c3:
        if (r6 == 0) goto L_0x010a;
    L_0x00c5:
        r0 = r2;
        goto L_0x0020;
    L_0x00c8:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x00ca, IOException -> 0x00e9 }
    L_0x00ca:
        r0 = move-exception;
        r0 = r0.a(r9);	 Catch:{ all -> 0x00d0 }
        throw r0;	 Catch:{ all -> 0x00d0 }
    L_0x00d0:
        r0 = move-exception;
        r1 = r1 & 8;
        if (r1 != r8) goto L_0x00dd;
    L_0x00d5:
        r1 = r9.l;	 Catch:{ fN -> 0x0100 }
        r1 = java.util.Collections.unmodifiableList(r1);	 Catch:{ fN -> 0x0100 }
        r9.l = r1;	 Catch:{ fN -> 0x0100 }
    L_0x00dd:
        r1 = r7.d();
        r9.q = r1;
        r9.b();
        throw r0;
    L_0x00e7:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x00ca, IOException -> 0x00e9 }
    L_0x00e9:
        r0 = move-exception;
        r2 = new com.google.fN;	 Catch:{ all -> 0x00d0 }
        r0 = r0.getMessage();	 Catch:{ all -> 0x00d0 }
        r2.<init>(r0);	 Catch:{ all -> 0x00d0 }
        r0 = r2.a(r9);	 Catch:{ all -> 0x00d0 }
        throw r0;	 Catch:{ all -> 0x00d0 }
    L_0x00f8:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x00ca, IOException -> 0x00e9 }
    L_0x00fa:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x00ca, IOException -> 0x00e9 }
    L_0x00fc:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x00ca, IOException -> 0x00e9 }
    L_0x00fe:
        r0 = move-exception;
        throw r0;
    L_0x0100:
        r0 = move-exception;
        throw r0;
    L_0x0102:
        r0 = r3;
        goto L_0x00ab;
    L_0x0104:
        r4 = r5;
        goto L_0x0073;
    L_0x0107:
        r4 = r5;
        goto L_0x0046;
    L_0x010a:
        r0 = r2;
        goto L_0x00ab;
    L_0x010c:
        r3 = r0;
        goto L_0x0065;
    L_0x010f:
        r3 = r0;
        goto L_0x0038;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.U.<init>(com.google.ad, com.google.h):void");
    }

    public static U a(InputStream inputStream) {
        return (U) n.b(inputStream);
    }

    static int b(U u, int i) {
        u.p = i;
        return i;
    }

    static List b(U u) {
        return u.l;
    }

    protected a1 a(ec ecVar) {
        return new a1(ecVar, null);
    }

    public T getParserForType() {
        return n;
    }

    static V a(U u, V v) {
        u.g = v;
        return v;
    }

    public int c() {
        return this.e;
    }

    public static final fn d() {
        return a5.y();
    }

    public X n() {
        return this.m;
    }

    private U(cJ cJVar) {
        super(cJVar);
        this.j = (byte) -1;
        this.o = -1;
        this.q = cJVar.getUnknownFields();
    }

    public U m() {
        return h;
    }

    public static a1 a(U u) {
        return s().a(u);
    }

    public il m1155newBuilderForType() {
        return f();
    }

    public a1 f() {
        return s();
    }

    public static U a(hx hxVar) {
        return (U) n.a(hxVar);
    }

    public final eV getUnknownFields() {
        return this.q;
    }

    protected bJ internalGetFieldAccessorTable() {
        return a5.g().a(U.class, a1.class);
    }

    static X a(U u, X x) {
        u.m = x;
        return x;
    }

    private void o() {
        this.e = 0;
        this.g = V.j();
        this.m = X.d();
        this.l = Collections.emptyList();
    }

    private U(boolean z) {
        this.j = (byte) -1;
        this.o = -1;
        this.q = eV.h();
    }

    public static U a(byte[] bArr) {
        return (U) n.a(bArr);
    }

    public static U a(InputStream inputStream, h hVar) {
        return (U) n.b(inputStream, hVar);
    }

    public a1 e() {
        return a(this);
    }

    U(ad adVar, h hVar, bs bsVar) {
        this(adVar, hVar);
    }

    public fl toBuilder() {
        return e();
    }

    static {
        n = new bZ();
        h = new U(true);
        h.o();
    }

    static List a(U u, List list) {
        u.l = list;
        return list;
    }

    public static U a(byte[] bArr, h hVar) {
        return (U) n.a(bArr, hVar);
    }

    public boolean r() {
        return (this.p & r) == r;
    }

    public static U b(InputStream inputStream, h hVar) {
        return (U) n.a(inputStream, hVar);
    }

    public il m1156toBuilder() {
        return e();
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

    protected fl newBuilderForType(ec ecVar) {
        return a(ecVar);
    }

    public bB h() {
        return this.m;
    }

    public fO m1154getDefaultInstanceForType() {
        return m();
    }

    public static U a() {
        return h;
    }

    public static U a(ad adVar, h hVar) {
        return (U) n.a(adVar, hVar);
    }

    static int a(U u, int i) {
        u.e = i;
        return i;
    }

    public int getSerializedSize() {
        int i = 0;
        int i2 = Y.r;
        int i3 = this.o;
        if (i3 != -1) {
            return i3;
        }
        if ((this.p & f) == f) {
            i3 = eb.c((int) f, this.e) + 0;
        } else {
            i3 = 0;
        }
        if ((this.p & r) == r) {
            i3 += eb.f((int) r, this.g);
        }
        if ((this.p & i) == i) {
            i3 += eb.f((int) k, this.m);
        }
        int i4 = i3;
        while (i < this.l.size()) {
            i3 = eb.f((int) i, (fO) this.l.get(i)) + i4;
            i += f;
            if (i2 != 0) {
                break;
            }
            i4 = i3;
        }
        i3 = i4;
        i3 += getUnknownFields().getSerializedSize();
        this.o = i3;
        return i3;
    }

    public int j() {
        return this.l.size();
    }

    U(cJ cJVar, bs bsVar) {
        this(cJVar);
    }

    public V k() {
        return this.g;
    }

    public static a1 s() {
        return a1.n();
    }

    public List q() {
        return this.l;
    }

    public static U a(ad adVar) {
        return (U) n.a(adVar);
    }

    public W a(int i) {
        return (W) this.l.get(i);
    }

    public bf b(int i) {
        return (bf) this.l.get(i);
    }

    static boolean i() {
        return d;
    }

    public List t() {
        return this.l;
    }

    public A b() {
        return this.g;
    }

    public void writeTo(eb ebVar) {
        int i = Y.r;
        getSerializedSize();
        if ((this.p & f) == f) {
            ebVar.e((int) f, this.e);
        }
        if ((this.p & r) == r) {
            ebVar.e((int) r, this.g);
        }
        if ((this.p & i) == i) {
            ebVar.e((int) k, this.m);
        }
        int i2 = 0;
        while (i2 < this.l.size()) {
            ebVar.e((int) i, (fO) this.l.get(i2));
            int i3 = i2 + f;
            if (i != 0) {
                break;
            }
            i2 = i3;
        }
        getUnknownFields().writeTo(ebVar);
    }

    static boolean p() {
        return d;
    }

    public static U a(hx hxVar, h hVar) {
        return (U) n.b(hxVar, hVar);
    }

    public boolean g() {
        return (this.p & i) == i;
    }

    public static U b(InputStream inputStream) {
        return (U) n.a(inputStream);
    }

    public fl newBuilderForType() {
        return f();
    }
}
