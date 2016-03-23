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

public final class Z extends bL implements bg {
    public static final int g = 2;
    public static final int h = 1;
    public static final int i = 3;
    public static T j = null;
    public static final int k = 4;
    private static final Z n;
    private static final long serialVersionUID = 0;
    private List e;
    private int f;
    private byte l;
    private final eV m;
    private hx o;
    private hx p;
    private ad q;
    private int r;

    private Z(cJ cJVar) {
        super(cJVar);
        this.l = (byte) -1;
        this.f = -1;
        this.m = cJVar.getUnknownFields();
    }

    protected ah a(ec ecVar) {
        return new ah(ecVar, null);
    }

    public int r() {
        return this.e.size();
    }

    public boolean d() {
        return (this.r & h) == h;
    }

    public fO m1287getDefaultInstanceForType() {
        return c();
    }

    public Z c() {
        return n;
    }

    public T getParserForType() {
        return j;
    }

    public static Z a(InputStream inputStream) {
        return (Z) j.b(inputStream);
    }

    public static Z a(byte[] bArr) {
        return (Z) j.a(bArr);
    }

    Z(cJ cJVar, bs bsVar) {
        this(cJVar);
    }

    static ad a(Z z, ad adVar) {
        z.q = adVar;
        return adVar;
    }

    public bV p() {
        return this.q;
    }

    public il m1288newBuilderForType() {
        return i();
    }

    public static Z a(hx hxVar) {
        return (Z) j.a(hxVar);
    }

    static {
        j = new bC();
        n = new Z(true);
        n.k();
    }

    private void k() {
        this.o = hx.b;
        this.p = hx.b;
        this.q = ad.l();
        this.e = Collections.emptyList();
    }

    public static Z a(byte[] bArr, h hVar) {
        return (Z) j.a(bArr, hVar);
    }

    public static Z a() {
        return n;
    }

    static int a(Z z, int i) {
        z.r = i;
        return i;
    }

    static List a(Z z) {
        return z.e;
    }

    public static ah n() {
        return ah.n();
    }

    public ci getDefaultInstanceForType() {
        return c();
    }

    public ad q() {
        return this.q;
    }

    public aj a(int i) {
        return (aj) this.e.get(i);
    }

    static hx a(Z z, hx hxVar) {
        z.p = hxVar;
        return hxVar;
    }

    static boolean b() {
        return d;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private Z(com.google.ad r10, com.google.h r11) {
        /*
        r9 = this;
        r2 = 1;
        r0 = 0;
        r1 = -1;
        r8 = 8;
        r5 = org.whispersystems.Y.r;
        r9.<init>();
        r9.l = r1;
        r9.f = r1;
        r9.k();
        r6 = com.google.eV.g();
        r1 = r0;
    L_0x0016:
        if (r0 != 0) goto L_0x008e;
    L_0x0018:
        r3 = r10.z();	 Catch:{ fN -> 0x00ab, IOException -> 0x00cc }
        switch(r3) {
            case 0: goto L_0x00a4;
            case 10: goto L_0x0028;
            case 18: goto L_0x0036;
            case 26: goto L_0x00ea;
            case 34: goto L_0x0074;
            default: goto L_0x001f;
        };
    L_0x001f:
        r3 = r9.a(r10, r6, r11, r3);	 Catch:{ fN -> 0x00a9, IOException -> 0x00cc }
        if (r3 != 0) goto L_0x008c;
    L_0x0025:
        if (r5 == 0) goto L_0x00e8;
    L_0x0027:
        r0 = r2;
    L_0x0028:
        r3 = r9.r;	 Catch:{ fN -> 0x00c8, IOException -> 0x00cc }
        r3 = r3 | 1;
        r9.r = r3;	 Catch:{ fN -> 0x00c8, IOException -> 0x00cc }
        r3 = r10.q();	 Catch:{ fN -> 0x00c8, IOException -> 0x00cc }
        r9.o = r3;	 Catch:{ fN -> 0x00c8, IOException -> 0x00cc }
        if (r5 == 0) goto L_0x008c;
    L_0x0036:
        r3 = r9.r;	 Catch:{ fN -> 0x00ca, IOException -> 0x00cc }
        r3 = r3 | 2;
        r9.r = r3;	 Catch:{ fN -> 0x00ca, IOException -> 0x00cc }
        r3 = r10.q();	 Catch:{ fN -> 0x00ca, IOException -> 0x00cc }
        r9.p = r3;	 Catch:{ fN -> 0x00ca, IOException -> 0x00cc }
        if (r5 == 0) goto L_0x008c;
    L_0x0044:
        r3 = r0;
    L_0x0045:
        r0 = 0;
        r4 = r9.r;	 Catch:{ fN -> 0x00ab, IOException -> 0x00cc }
        r4 = r4 & 4;
        r7 = 4;
        if (r4 != r7) goto L_0x00e5;
    L_0x004d:
        r0 = r9.q;	 Catch:{ fN -> 0x00ab, IOException -> 0x00cc }
        r0 = r0.i();	 Catch:{ fN -> 0x00ab, IOException -> 0x00cc }
        r4 = r0;
    L_0x0054:
        r0 = org.whispersystems.ad.PARSER;	 Catch:{ fN -> 0x00db, IOException -> 0x00cc }
        r0 = r10.a(r0, r11);	 Catch:{ fN -> 0x00db, IOException -> 0x00cc }
        r0 = (org.whispersystems.ad) r0;	 Catch:{ fN -> 0x00db, IOException -> 0x00cc }
        r9.q = r0;	 Catch:{ fN -> 0x00db, IOException -> 0x00cc }
        if (r4 == 0) goto L_0x006b;
    L_0x0060:
        r0 = r9.q;	 Catch:{ fN -> 0x00db, IOException -> 0x00cc }
        r4.a(r0);	 Catch:{ fN -> 0x00db, IOException -> 0x00cc }
        r0 = r4.b();	 Catch:{ fN -> 0x00db, IOException -> 0x00cc }
        r9.q = r0;	 Catch:{ fN -> 0x00db, IOException -> 0x00cc }
    L_0x006b:
        r0 = r9.r;	 Catch:{ fN -> 0x00dd, IOException -> 0x00cc }
        r0 = r0 | 4;
        r9.r = r0;	 Catch:{ fN -> 0x00dd, IOException -> 0x00cc }
        if (r5 == 0) goto L_0x00e3;
    L_0x0073:
        r0 = r3;
    L_0x0074:
        r3 = r1 & 8;
        if (r3 == r8) goto L_0x0081;
    L_0x0078:
        r3 = new java.util.ArrayList;	 Catch:{ fN -> 0x00ab, IOException -> 0x00cc }
        r3.<init>();	 Catch:{ fN -> 0x00ab, IOException -> 0x00cc }
        r9.e = r3;	 Catch:{ fN -> 0x00ab, IOException -> 0x00cc }
        r1 = r1 | 8;
    L_0x0081:
        r3 = r9.e;	 Catch:{ fN -> 0x00ab, IOException -> 0x00cc }
        r4 = org.whispersystems.aj.PARSER;	 Catch:{ fN -> 0x00ab, IOException -> 0x00cc }
        r4 = r10.a(r4, r11);	 Catch:{ fN -> 0x00ab, IOException -> 0x00cc }
        r3.add(r4);	 Catch:{ fN -> 0x00ab, IOException -> 0x00cc }
    L_0x008c:
        if (r5 == 0) goto L_0x0016;
    L_0x008e:
        r0 = r1 & 8;
        if (r0 != r8) goto L_0x009a;
    L_0x0092:
        r0 = r9.e;	 Catch:{ fN -> 0x00df }
        r0 = java.util.Collections.unmodifiableList(r0);	 Catch:{ fN -> 0x00df }
        r9.e = r0;	 Catch:{ fN -> 0x00df }
    L_0x009a:
        r0 = r6.d();
        r9.m = r0;
        r9.b();
        return;
    L_0x00a4:
        if (r5 == 0) goto L_0x00e8;
    L_0x00a6:
        r0 = r2;
        goto L_0x001f;
    L_0x00a9:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x00ab, IOException -> 0x00cc }
    L_0x00ab:
        r0 = move-exception;
        r0 = r0.a(r9);	 Catch:{ all -> 0x00b1 }
        throw r0;	 Catch:{ all -> 0x00b1 }
    L_0x00b1:
        r0 = move-exception;
        r1 = r1 & 8;
        if (r1 != r8) goto L_0x00be;
    L_0x00b6:
        r1 = r9.e;	 Catch:{ fN -> 0x00e1 }
        r1 = java.util.Collections.unmodifiableList(r1);	 Catch:{ fN -> 0x00e1 }
        r9.e = r1;	 Catch:{ fN -> 0x00e1 }
    L_0x00be:
        r1 = r6.d();
        r9.m = r1;
        r9.b();
        throw r0;
    L_0x00c8:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x00ca, IOException -> 0x00cc }
    L_0x00ca:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x00ab, IOException -> 0x00cc }
    L_0x00cc:
        r0 = move-exception;
        r2 = new com.google.fN;	 Catch:{ all -> 0x00b1 }
        r0 = r0.getMessage();	 Catch:{ all -> 0x00b1 }
        r2.<init>(r0);	 Catch:{ all -> 0x00b1 }
        r0 = r2.a(r9);	 Catch:{ all -> 0x00b1 }
        throw r0;	 Catch:{ all -> 0x00b1 }
    L_0x00db:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x00ab, IOException -> 0x00cc }
    L_0x00dd:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x00ab, IOException -> 0x00cc }
    L_0x00df:
        r0 = move-exception;
        throw r0;
    L_0x00e1:
        r0 = move-exception;
        throw r0;
    L_0x00e3:
        r0 = r3;
        goto L_0x008c;
    L_0x00e5:
        r4 = r0;
        goto L_0x0054;
    L_0x00e8:
        r0 = r2;
        goto L_0x008c;
    L_0x00ea:
        r3 = r0;
        goto L_0x0045;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.Z.<init>(com.google.ad, com.google.h):void");
    }

    Z(ad adVar, h hVar, bs bsVar) {
        this(adVar, hVar);
    }

    public void writeTo(eb ebVar) {
        int i = Y.r;
        getSerializedSize();
        if ((this.r & h) == h) {
            ebVar.d((int) h, this.o);
        }
        if ((this.r & g) == g) {
            ebVar.d((int) g, this.p);
        }
        if ((this.r & k) == k) {
            ebVar.e((int) i, this.q);
        }
        int i2 = 0;
        while (i2 < this.e.size()) {
            ebVar.e((int) k, (fO) this.e.get(i2));
            int i3 = i2 + h;
            if (i != 0) {
                break;
            }
            i2 = i3;
        }
        getUnknownFields().writeTo(ebVar);
    }

    public static Z a(ad adVar, h hVar) {
        return (Z) j.a(adVar, hVar);
    }

    public static final fn h() {
        return a5.t();
    }

    public static Z a(hx hxVar, h hVar) {
        return (Z) j.b(hxVar, hVar);
    }

    public static Z b(InputStream inputStream) {
        return (Z) j.a(inputStream);
    }

    public List j() {
        return this.e;
    }

    protected fl newBuilderForType(ec ecVar) {
        return a(ecVar);
    }

    public boolean l() {
        return (this.r & g) == g;
    }

    static boolean g() {
        return d;
    }

    public ak b(int i) {
        return (ak) this.e.get(i);
    }

    public static Z b(InputStream inputStream, h hVar) {
        return (Z) j.a(inputStream, hVar);
    }

    public static Z a(InputStream inputStream, h hVar) {
        return (Z) j.b(inputStream, hVar);
    }

    protected bJ internalGetFieldAccessorTable() {
        return a5.f().a(Z.class, ah.class);
    }

    static hx b(Z z, hx hxVar) {
        z.o = hxVar;
        return hxVar;
    }

    public static Z a(ad adVar) {
        return (Z) j.a(adVar);
    }

    public final eV getUnknownFields() {
        return this.m;
    }

    public ah m() {
        return b(this);
    }

    public List o() {
        return this.e;
    }

    public hx e() {
        return this.p;
    }

    public ah i() {
        return n();
    }

    public int getSerializedSize() {
        int i = 0;
        int i2 = Y.r;
        int i3 = this.f;
        if (i3 != -1) {
            return i3;
        }
        if ((this.r & h) == h) {
            i3 = eb.c((int) h, this.o) + 0;
        } else {
            i3 = 0;
        }
        if ((this.r & g) == g) {
            i3 += eb.c((int) g, this.p);
        }
        if ((this.r & k) == k) {
            i3 += eb.f((int) i, this.q);
        }
        int i4 = i3;
        while (i < this.e.size()) {
            i3 = eb.f((int) k, (fO) this.e.get(i)) + i4;
            i += h;
            if (i2 != 0) {
                break;
            }
            i4 = i3;
        }
        i3 = i4;
        i3 += getUnknownFields().getSerializedSize();
        this.f = i3;
        return i3;
    }

    public final boolean isInitialized() {
        byte b = this.l;
        if (b == -1) {
            this.l = (byte) 1;
            return true;
        } else if (b == (byte) 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean s() {
        return (this.r & k) == k;
    }

    public fl toBuilder() {
        return m();
    }

    public fl newBuilderForType() {
        return i();
    }

    public static ah b(Z z) {
        return n().a(z);
    }

    public il m1289toBuilder() {
        return m();
    }

    static List a(Z z, List list) {
        z.e = list;
        return list;
    }

    protected Object writeReplace() {
        return super.writeReplace();
    }

    public hx f() {
        return this.o;
    }

    private Z(boolean z) {
        this.l = (byte) -1;
        this.f = -1;
        this.m = eV.h();
    }
}
