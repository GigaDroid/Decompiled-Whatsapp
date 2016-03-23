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

public final class S extends bL implements bY {
    public static final int g = 2;
    private static final S i;
    public static T j = null;
    public static final int m = 1;
    private static final long serialVersionUID = 0;
    private final eV e;
    private Y f;
    private int h;
    private byte k;
    private List l;
    private int n;

    S(cJ cJVar, bs bsVar) {
        this(cJVar);
    }

    public Y k() {
        return this.f;
    }

    protected bJ internalGetFieldAccessorTable() {
        return a5.o().a(S.class, ap.class);
    }

    public static S a(ad adVar) {
        return (S) j.a(adVar);
    }

    static Y a(S s, Y y) {
        s.f = y;
        return y;
    }

    static boolean e() {
        return d;
    }

    public static S b(InputStream inputStream) {
        return (S) j.b(inputStream);
    }

    public bA a(int i) {
        return (bA) this.l.get(i);
    }

    public final eV getUnknownFields() {
        return this.e;
    }

    public void writeTo(eb ebVar) {
        int i = Y.r;
        getSerializedSize();
        if ((this.h & m) == m) {
            ebVar.e((int) m, this.f);
        }
        int i2 = 0;
        while (i2 < this.l.size()) {
            ebVar.e((int) g, (fO) this.l.get(i2));
            int i3 = i2 + m;
            if (i != 0) {
                break;
            }
            i2 = i3;
        }
        getUnknownFields().writeTo(ebVar);
    }

    public static S a(InputStream inputStream) {
        return (S) j.a(inputStream);
    }

    public static S a(byte[] bArr, h hVar) {
        return (S) j.a(bArr, hVar);
    }

    public static ap a(S s) {
        return a().a(s);
    }

    private S(boolean z) {
        this.k = (byte) -1;
        this.n = -1;
        this.e = eV.h();
    }

    public static S b(InputStream inputStream, h hVar) {
        return (S) j.a(inputStream, hVar);
    }

    static List b(S s) {
        return s.l;
    }

    public static S a(ad adVar, h hVar) {
        return (S) j.a(adVar, hVar);
    }

    private S(cJ cJVar) {
        super(cJVar);
        this.k = (byte) -1;
        this.n = -1;
        this.e = cJVar.getUnknownFields();
    }

    public ap i() {
        return a(this);
    }

    static int a(S s, int i) {
        s.h = i;
        return i;
    }

    public il m1149newBuilderForType() {
        return f();
    }

    public bA p() {
        return this.f;
    }

    public int getSerializedSize() {
        int i = 0;
        int i2 = Y.r;
        int i3 = this.n;
        if (i3 != -1) {
            return i3;
        }
        if ((this.h & m) == m) {
            i3 = eb.f((int) m, this.f) + 0;
        } else {
            i3 = 0;
        }
        int i4 = i3;
        while (i < this.l.size()) {
            i3 = eb.f((int) g, (fO) this.l.get(i)) + i4;
            i += m;
            if (i2 != 0) {
                break;
            }
            i4 = i3;
        }
        i3 = i4;
        i3 += getUnknownFields().getSerializedSize();
        this.n = i3;
        return i3;
    }

    protected Object writeReplace() {
        return super.writeReplace();
    }

    static {
        j = new b4();
        i = new S(true);
        i.c();
    }

    public fO m1148getDefaultInstanceForType() {
        return d();
    }

    public static ap a() {
        return ap.e();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private S(com.google.ad r9, com.google.h r10) {
        /*
        r8 = this;
        r0 = 0;
        r1 = -1;
        r7 = 2;
        r2 = 1;
        r5 = org.whispersystems.Y.r;
        r8.<init>();
        r8.k = r1;
        r8.n = r1;
        r8.c();
        r6 = com.google.eV.g();
        r1 = r0;
    L_0x0015:
        if (r0 != 0) goto L_0x006f;
    L_0x0017:
        r3 = r9.z();	 Catch:{ fN -> 0x008b, IOException -> 0x00aa }
        switch(r3) {
            case 0: goto L_0x0085;
            case 10: goto L_0x00c6;
            case 18: goto L_0x0055;
            default: goto L_0x001e;
        };
    L_0x001e:
        r3 = r8.a(r9, r6, r10, r3);	 Catch:{ fN -> 0x0089, IOException -> 0x00aa }
        if (r3 != 0) goto L_0x006d;
    L_0x0024:
        if (r5 == 0) goto L_0x00c4;
    L_0x0026:
        r3 = r2;
    L_0x0027:
        r0 = 0;
        r4 = r8.h;	 Catch:{ fN -> 0x008b, IOException -> 0x00aa }
        r4 = r4 & 1;
        if (r4 != r2) goto L_0x00c1;
    L_0x002e:
        r0 = r8.f;	 Catch:{ fN -> 0x008b, IOException -> 0x00aa }
        r0 = r0.w();	 Catch:{ fN -> 0x008b, IOException -> 0x00aa }
        r4 = r0;
    L_0x0035:
        r0 = org.whispersystems.Y.o;	 Catch:{ fN -> 0x00a8, IOException -> 0x00aa }
        r0 = r9.a(r0, r10);	 Catch:{ fN -> 0x00a8, IOException -> 0x00aa }
        r0 = (org.whispersystems.Y) r0;	 Catch:{ fN -> 0x00a8, IOException -> 0x00aa }
        r8.f = r0;	 Catch:{ fN -> 0x00a8, IOException -> 0x00aa }
        if (r4 == 0) goto L_0x004c;
    L_0x0041:
        r0 = r8.f;	 Catch:{ fN -> 0x00a8, IOException -> 0x00aa }
        r4.a(r0);	 Catch:{ fN -> 0x00a8, IOException -> 0x00aa }
        r0 = r4.a();	 Catch:{ fN -> 0x00a8, IOException -> 0x00aa }
        r8.f = r0;	 Catch:{ fN -> 0x00a8, IOException -> 0x00aa }
    L_0x004c:
        r0 = r8.h;	 Catch:{ fN -> 0x00b9, IOException -> 0x00aa }
        r0 = r0 | 1;
        r8.h = r0;	 Catch:{ fN -> 0x00b9, IOException -> 0x00aa }
        if (r5 == 0) goto L_0x00bf;
    L_0x0054:
        r0 = r3;
    L_0x0055:
        r3 = r1 & 2;
        if (r3 == r7) goto L_0x0062;
    L_0x0059:
        r3 = new java.util.ArrayList;	 Catch:{ fN -> 0x008b, IOException -> 0x00aa }
        r3.<init>();	 Catch:{ fN -> 0x008b, IOException -> 0x00aa }
        r8.l = r3;	 Catch:{ fN -> 0x008b, IOException -> 0x00aa }
        r1 = r1 | 2;
    L_0x0062:
        r3 = r8.l;	 Catch:{ fN -> 0x008b, IOException -> 0x00aa }
        r4 = org.whispersystems.Y.o;	 Catch:{ fN -> 0x008b, IOException -> 0x00aa }
        r4 = r9.a(r4, r10);	 Catch:{ fN -> 0x008b, IOException -> 0x00aa }
        r3.add(r4);	 Catch:{ fN -> 0x008b, IOException -> 0x00aa }
    L_0x006d:
        if (r5 == 0) goto L_0x0015;
    L_0x006f:
        r0 = r1 & 2;
        if (r0 != r7) goto L_0x007b;
    L_0x0073:
        r0 = r8.l;	 Catch:{ fN -> 0x00bb }
        r0 = java.util.Collections.unmodifiableList(r0);	 Catch:{ fN -> 0x00bb }
        r8.l = r0;	 Catch:{ fN -> 0x00bb }
    L_0x007b:
        r0 = r6.d();
        r8.e = r0;
        r8.b();
        return;
    L_0x0085:
        if (r5 == 0) goto L_0x00c4;
    L_0x0087:
        r0 = r2;
        goto L_0x001e;
    L_0x0089:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x008b, IOException -> 0x00aa }
    L_0x008b:
        r0 = move-exception;
        r0 = r0.a(r8);	 Catch:{ all -> 0x0091 }
        throw r0;	 Catch:{ all -> 0x0091 }
    L_0x0091:
        r0 = move-exception;
        r1 = r1 & 2;
        if (r1 != r7) goto L_0x009e;
    L_0x0096:
        r1 = r8.l;	 Catch:{ fN -> 0x00bd }
        r1 = java.util.Collections.unmodifiableList(r1);	 Catch:{ fN -> 0x00bd }
        r8.l = r1;	 Catch:{ fN -> 0x00bd }
    L_0x009e:
        r1 = r6.d();
        r8.e = r1;
        r8.b();
        throw r0;
    L_0x00a8:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x008b, IOException -> 0x00aa }
    L_0x00aa:
        r0 = move-exception;
        r2 = new com.google.fN;	 Catch:{ all -> 0x0091 }
        r0 = r0.getMessage();	 Catch:{ all -> 0x0091 }
        r2.<init>(r0);	 Catch:{ all -> 0x0091 }
        r0 = r2.a(r8);	 Catch:{ all -> 0x0091 }
        throw r0;	 Catch:{ all -> 0x0091 }
    L_0x00b9:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x008b, IOException -> 0x00aa }
    L_0x00bb:
        r0 = move-exception;
        throw r0;
    L_0x00bd:
        r0 = move-exception;
        throw r0;
    L_0x00bf:
        r0 = r3;
        goto L_0x006d;
    L_0x00c1:
        r4 = r0;
        goto L_0x0035;
    L_0x00c4:
        r0 = r2;
        goto L_0x006d;
    L_0x00c6:
        r3 = r0;
        goto L_0x0027;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.S.<init>(com.google.ad, com.google.h):void");
    }

    public static final fn o() {
        return a5.B();
    }

    public static S a(hx hxVar) {
        return (S) j.a(hxVar);
    }

    public List m() {
        return this.l;
    }

    S(ad adVar, h hVar, bs bsVar) {
        this(adVar, hVar);
    }

    protected ap a(ec ecVar) {
        return new ap(ecVar, null);
    }

    public ap f() {
        return a();
    }

    protected fl newBuilderForType(ec ecVar) {
        return a(ecVar);
    }

    public fl toBuilder() {
        return i();
    }

    public static S a(InputStream inputStream, h hVar) {
        return (S) j.b(inputStream, hVar);
    }

    public T getParserForType() {
        return j;
    }

    static List a(S s, List list) {
        s.l = list;
        return list;
    }

    public ci getDefaultInstanceForType() {
        return d();
    }

    public static S a(hx hxVar, h hVar) {
        return (S) j.b(hxVar, hVar);
    }

    public S d() {
        return i;
    }

    private void c() {
        this.f = Y.M();
        this.l = Collections.emptyList();
    }

    public Y b(int i) {
        return (Y) this.l.get(i);
    }

    public fl newBuilderForType() {
        return f();
    }

    public int h() {
        return this.l.size();
    }

    static boolean j() {
        return d;
    }

    public boolean n() {
        return (this.h & m) == m;
    }

    public List g() {
        return this.l;
    }

    public il m1150toBuilder() {
        return i();
    }

    public static S a(byte[] bArr) {
        return (S) j.a(bArr);
    }

    public final boolean isInitialized() {
        byte b = this.k;
        if (b == -1) {
            this.k = (byte) 1;
            return true;
        } else if (b == (byte) 1) {
            return true;
        } else {
            return false;
        }
    }

    public static S l() {
        return i;
    }
}
