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

public final class Y extends bL implements bA {
    public static final int A = 7;
    public static final int C = 5;
    public static final int H = 8;
    public static final int J = 2;
    public static final int f = 6;
    public static final int j = 11;
    public static final int l = 9;
    public static T o = null;
    public static final int p = 12;
    public static final int q = 13;
    public static int r = 0;
    private static final long serialVersionUID = 0;
    public static final int t = 10;
    public static final int u = 3;
    private static final Y v;
    public static final int x = 1;
    public static final int z = 4;
    private final eV B;
    private Z D;
    private int E;
    private int F;
    private aF G;
    private hx I;
    private a8 K;
    private hx e;
    private hx g;
    private int h;
    private int i;
    private byte k;
    private boolean m;
    private hx n;
    private int s;
    private List w;
    private int y;

    public static aO I() {
        return aO.k();
    }

    public as H() {
        return this.G;
    }

    static boolean a(Y y, boolean z) {
        y.m = z;
        return z;
    }

    private void v() {
        this.s = 0;
        this.e = hx.b;
        this.g = hx.b;
        this.I = hx.b;
        this.y = 0;
        this.D = Z.a();
        this.w = Collections.emptyList();
        this.G = aF.f();
        this.K = a8.n();
        this.i = 0;
        this.E = 0;
        this.m = false;
        this.n = hx.b;
    }

    Y(cJ cJVar, bs bsVar) {
        this(cJVar);
    }

    protected fl newBuilderForType(ec ecVar) {
        return a(ecVar);
    }

    public Z k() {
        return this.D;
    }

    protected Object writeReplace() {
        return super.writeReplace();
    }

    public int h() {
        return this.i;
    }

    public static final fn a() {
        return a5.A();
    }

    public hx d() {
        return this.e;
    }

    public aF L() {
        return this.G;
    }

    public static aO a(Y y) {
        return I().a(y);
    }

    public hx o() {
        return this.I;
    }

    public boolean i() {
        return (this.F & 64) == 64;
    }

    public static Y a(ad adVar) {
        return (Y) o.a(adVar);
    }

    public boolean G() {
        return (this.F & 32) == 32;
    }

    public boolean z() {
        return (this.F & 16) == 16;
    }

    public static Y b(InputStream inputStream) {
        return (Y) o.a(inputStream);
    }

    static List b(Y y) {
        return y.w;
    }

    public Z a(int i) {
        return (Z) this.w.get(i);
    }

    static {
        o = new bK();
        v = new Y(true);
        v.v();
    }

    public boolean x() {
        return (this.F & x) == x;
    }

    public List J() {
        return this.w;
    }

    public Y l() {
        return v;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private Y(com.google.ad r10, com.google.h r11) {
        /*
        r9 = this;
        r2 = 1;
        r0 = 0;
        r1 = -1;
        r5 = 0;
        r8 = 64;
        r6 = r;
        r9.<init>();
        r9.k = r1;
        r9.h = r1;
        r9.v();
        r7 = com.google.eV.g();
        r1 = r0;
    L_0x0017:
        if (r0 != 0) goto L_0x014d;
    L_0x0019:
        r3 = r10.z();	 Catch:{ fN -> 0x016a, IOException -> 0x0191 }
        switch(r3) {
            case 0: goto L_0x0163;
            case 8: goto L_0x0029;
            case 18: goto L_0x0037;
            case 26: goto L_0x0045;
            case 34: goto L_0x0053;
            case 40: goto L_0x0061;
            case 50: goto L_0x01c4;
            case 58: goto L_0x009f;
            case 66: goto L_0x00b9;
            case 74: goto L_0x01c1;
            case 80: goto L_0x0115;
            case 88: goto L_0x0123;
            case 96: goto L_0x0131;
            case 106: goto L_0x013f;
            default: goto L_0x0020;
        };
    L_0x0020:
        r3 = r9.a(r10, r7, r11, r3);	 Catch:{ fN -> 0x0168, IOException -> 0x0191 }
        if (r3 != 0) goto L_0x014b;
    L_0x0026:
        if (r6 == 0) goto L_0x01bf;
    L_0x0028:
        r0 = r2;
    L_0x0029:
        r3 = r9.F;	 Catch:{ fN -> 0x0187, IOException -> 0x0191 }
        r3 = r3 | 1;
        r9.F = r3;	 Catch:{ fN -> 0x0187, IOException -> 0x0191 }
        r3 = r10.t();	 Catch:{ fN -> 0x0187, IOException -> 0x0191 }
        r9.s = r3;	 Catch:{ fN -> 0x0187, IOException -> 0x0191 }
        if (r6 == 0) goto L_0x014b;
    L_0x0037:
        r3 = r9.F;	 Catch:{ fN -> 0x0189, IOException -> 0x0191 }
        r3 = r3 | 2;
        r9.F = r3;	 Catch:{ fN -> 0x0189, IOException -> 0x0191 }
        r3 = r10.q();	 Catch:{ fN -> 0x0189, IOException -> 0x0191 }
        r9.e = r3;	 Catch:{ fN -> 0x0189, IOException -> 0x0191 }
        if (r6 == 0) goto L_0x014b;
    L_0x0045:
        r3 = r9.F;	 Catch:{ fN -> 0x018b, IOException -> 0x0191 }
        r3 = r3 | 4;
        r9.F = r3;	 Catch:{ fN -> 0x018b, IOException -> 0x0191 }
        r3 = r10.q();	 Catch:{ fN -> 0x018b, IOException -> 0x0191 }
        r9.g = r3;	 Catch:{ fN -> 0x018b, IOException -> 0x0191 }
        if (r6 == 0) goto L_0x014b;
    L_0x0053:
        r3 = r9.F;	 Catch:{ fN -> 0x018d, IOException -> 0x0191 }
        r3 = r3 | 8;
        r9.F = r3;	 Catch:{ fN -> 0x018d, IOException -> 0x0191 }
        r3 = r10.q();	 Catch:{ fN -> 0x018d, IOException -> 0x0191 }
        r9.I = r3;	 Catch:{ fN -> 0x018d, IOException -> 0x0191 }
        if (r6 == 0) goto L_0x014b;
    L_0x0061:
        r3 = r9.F;	 Catch:{ fN -> 0x018f, IOException -> 0x0191 }
        r3 = r3 | 16;
        r9.F = r3;	 Catch:{ fN -> 0x018f, IOException -> 0x0191 }
        r3 = r10.t();	 Catch:{ fN -> 0x018f, IOException -> 0x0191 }
        r9.y = r3;	 Catch:{ fN -> 0x018f, IOException -> 0x0191 }
        if (r6 == 0) goto L_0x014b;
    L_0x006f:
        r3 = r0;
    L_0x0070:
        r0 = r9.F;	 Catch:{ fN -> 0x016a, IOException -> 0x0191 }
        r0 = r0 & 32;
        r4 = 32;
        if (r0 != r4) goto L_0x01bc;
    L_0x0078:
        r0 = r9.D;	 Catch:{ fN -> 0x016a, IOException -> 0x0191 }
        r0 = r0.m();	 Catch:{ fN -> 0x016a, IOException -> 0x0191 }
        r4 = r0;
    L_0x007f:
        r0 = org.whispersystems.Z.j;	 Catch:{ fN -> 0x01a0, IOException -> 0x0191 }
        r0 = r10.a(r0, r11);	 Catch:{ fN -> 0x01a0, IOException -> 0x0191 }
        r0 = (org.whispersystems.Z) r0;	 Catch:{ fN -> 0x01a0, IOException -> 0x0191 }
        r9.D = r0;	 Catch:{ fN -> 0x01a0, IOException -> 0x0191 }
        if (r4 == 0) goto L_0x0096;
    L_0x008b:
        r0 = r9.D;	 Catch:{ fN -> 0x01a0, IOException -> 0x0191 }
        r4.a(r0);	 Catch:{ fN -> 0x01a0, IOException -> 0x0191 }
        r0 = r4.g();	 Catch:{ fN -> 0x01a0, IOException -> 0x0191 }
        r9.D = r0;	 Catch:{ fN -> 0x01a0, IOException -> 0x0191 }
    L_0x0096:
        r0 = r9.F;	 Catch:{ fN -> 0x01a2, IOException -> 0x0191 }
        r0 = r0 | 32;
        r9.F = r0;	 Catch:{ fN -> 0x01a2, IOException -> 0x0191 }
        if (r6 == 0) goto L_0x01b4;
    L_0x009e:
        r0 = r3;
    L_0x009f:
        r3 = r1 & 64;
        if (r3 == r8) goto L_0x00ac;
    L_0x00a3:
        r3 = new java.util.ArrayList;	 Catch:{ fN -> 0x016a, IOException -> 0x0191 }
        r3.<init>();	 Catch:{ fN -> 0x016a, IOException -> 0x0191 }
        r9.w = r3;	 Catch:{ fN -> 0x016a, IOException -> 0x0191 }
        r1 = r1 | 64;
    L_0x00ac:
        r3 = r9.w;	 Catch:{ fN -> 0x016a, IOException -> 0x0191 }
        r4 = org.whispersystems.Z.j;	 Catch:{ fN -> 0x016a, IOException -> 0x0191 }
        r4 = r10.a(r4, r11);	 Catch:{ fN -> 0x016a, IOException -> 0x0191 }
        r3.add(r4);	 Catch:{ fN -> 0x016a, IOException -> 0x0191 }
        if (r6 == 0) goto L_0x014b;
    L_0x00b9:
        r3 = r0;
        r0 = r9.F;	 Catch:{ fN -> 0x016a, IOException -> 0x0191 }
        r0 = r0 & 64;
        if (r0 != r8) goto L_0x01b9;
    L_0x00c0:
        r0 = r9.G;	 Catch:{ fN -> 0x016a, IOException -> 0x0191 }
        r0 = r0.i();	 Catch:{ fN -> 0x016a, IOException -> 0x0191 }
        r4 = r0;
    L_0x00c7:
        r0 = org.whispersystems.aF.f;	 Catch:{ fN -> 0x01a4, IOException -> 0x0191 }
        r0 = r10.a(r0, r11);	 Catch:{ fN -> 0x01a4, IOException -> 0x0191 }
        r0 = (org.whispersystems.aF) r0;	 Catch:{ fN -> 0x01a4, IOException -> 0x0191 }
        r9.G = r0;	 Catch:{ fN -> 0x01a4, IOException -> 0x0191 }
        if (r4 == 0) goto L_0x00de;
    L_0x00d3:
        r0 = r9.G;	 Catch:{ fN -> 0x01a4, IOException -> 0x0191 }
        r4.a(r0);	 Catch:{ fN -> 0x01a4, IOException -> 0x0191 }
        r0 = r4.f();	 Catch:{ fN -> 0x01a4, IOException -> 0x0191 }
        r9.G = r0;	 Catch:{ fN -> 0x01a4, IOException -> 0x0191 }
    L_0x00de:
        r0 = r9.F;	 Catch:{ fN -> 0x016a, IOException -> 0x0191 }
        r0 = r0 | 64;
        r9.F = r0;	 Catch:{ fN -> 0x016a, IOException -> 0x0191 }
        if (r6 == 0) goto L_0x01b4;
    L_0x00e6:
        r0 = r9.F;	 Catch:{ fN -> 0x016a, IOException -> 0x0191 }
        r0 = r0 & 128;
        r4 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        if (r0 != r4) goto L_0x01b6;
    L_0x00ee:
        r0 = r9.K;	 Catch:{ fN -> 0x016a, IOException -> 0x0191 }
        r0 = r0.a();	 Catch:{ fN -> 0x016a, IOException -> 0x0191 }
        r4 = r0;
    L_0x00f5:
        r0 = org.whispersystems.a8.PARSER;	 Catch:{ fN -> 0x01a6, IOException -> 0x0191 }
        r0 = r10.a(r0, r11);	 Catch:{ fN -> 0x01a6, IOException -> 0x0191 }
        r0 = (org.whispersystems.a8) r0;	 Catch:{ fN -> 0x01a6, IOException -> 0x0191 }
        r9.K = r0;	 Catch:{ fN -> 0x01a6, IOException -> 0x0191 }
        if (r4 == 0) goto L_0x010c;
    L_0x0101:
        r0 = r9.K;	 Catch:{ fN -> 0x01a6, IOException -> 0x0191 }
        r4.a(r0);	 Catch:{ fN -> 0x01a6, IOException -> 0x0191 }
        r0 = r4.a();	 Catch:{ fN -> 0x01a6, IOException -> 0x0191 }
        r9.K = r0;	 Catch:{ fN -> 0x01a6, IOException -> 0x0191 }
    L_0x010c:
        r0 = r9.F;	 Catch:{ fN -> 0x01a8, IOException -> 0x0191 }
        r0 = r0 | 128;
        r9.F = r0;	 Catch:{ fN -> 0x01a8, IOException -> 0x0191 }
        if (r6 == 0) goto L_0x01b4;
    L_0x0114:
        r0 = r3;
    L_0x0115:
        r3 = r9.F;	 Catch:{ fN -> 0x01a8, IOException -> 0x0191 }
        r3 = r3 | 256;
        r9.F = r3;	 Catch:{ fN -> 0x01a8, IOException -> 0x0191 }
        r3 = r10.t();	 Catch:{ fN -> 0x01a8, IOException -> 0x0191 }
        r9.i = r3;	 Catch:{ fN -> 0x01a8, IOException -> 0x0191 }
        if (r6 == 0) goto L_0x014b;
    L_0x0123:
        r3 = r9.F;	 Catch:{ fN -> 0x01aa, IOException -> 0x0191 }
        r3 = r3 | 512;
        r9.F = r3;	 Catch:{ fN -> 0x01aa, IOException -> 0x0191 }
        r3 = r10.t();	 Catch:{ fN -> 0x01aa, IOException -> 0x0191 }
        r9.E = r3;	 Catch:{ fN -> 0x01aa, IOException -> 0x0191 }
        if (r6 == 0) goto L_0x014b;
    L_0x0131:
        r3 = r9.F;	 Catch:{ fN -> 0x01ac, IOException -> 0x0191 }
        r3 = r3 | 1024;
        r9.F = r3;	 Catch:{ fN -> 0x01ac, IOException -> 0x0191 }
        r3 = r10.w();	 Catch:{ fN -> 0x01ac, IOException -> 0x0191 }
        r9.m = r3;	 Catch:{ fN -> 0x01ac, IOException -> 0x0191 }
        if (r6 == 0) goto L_0x014b;
    L_0x013f:
        r3 = r9.F;	 Catch:{ fN -> 0x01ae, IOException -> 0x0191 }
        r3 = r3 | 2048;
        r9.F = r3;	 Catch:{ fN -> 0x01ae, IOException -> 0x0191 }
        r3 = r10.q();	 Catch:{ fN -> 0x01ae, IOException -> 0x0191 }
        r9.n = r3;	 Catch:{ fN -> 0x01ae, IOException -> 0x0191 }
    L_0x014b:
        if (r6 == 0) goto L_0x0017;
    L_0x014d:
        r0 = r1 & 64;
        if (r0 != r8) goto L_0x0159;
    L_0x0151:
        r0 = r9.w;	 Catch:{ fN -> 0x01b0 }
        r0 = java.util.Collections.unmodifiableList(r0);	 Catch:{ fN -> 0x01b0 }
        r9.w = r0;	 Catch:{ fN -> 0x01b0 }
    L_0x0159:
        r0 = r7.d();
        r9.B = r0;
        r9.b();
        return;
    L_0x0163:
        if (r6 == 0) goto L_0x01bf;
    L_0x0165:
        r0 = r2;
        goto L_0x0020;
    L_0x0168:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x016a, IOException -> 0x0191 }
    L_0x016a:
        r0 = move-exception;
        r0 = r0.a(r9);	 Catch:{ all -> 0x0170 }
        throw r0;	 Catch:{ all -> 0x0170 }
    L_0x0170:
        r0 = move-exception;
        r1 = r1 & 64;
        if (r1 != r8) goto L_0x017d;
    L_0x0175:
        r1 = r9.w;	 Catch:{ fN -> 0x01b2 }
        r1 = java.util.Collections.unmodifiableList(r1);	 Catch:{ fN -> 0x01b2 }
        r9.w = r1;	 Catch:{ fN -> 0x01b2 }
    L_0x017d:
        r1 = r7.d();
        r9.B = r1;
        r9.b();
        throw r0;
    L_0x0187:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0189, IOException -> 0x0191 }
    L_0x0189:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x018b, IOException -> 0x0191 }
    L_0x018b:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x018d, IOException -> 0x0191 }
    L_0x018d:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x018f, IOException -> 0x0191 }
    L_0x018f:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x016a, IOException -> 0x0191 }
    L_0x0191:
        r0 = move-exception;
        r2 = new com.google.fN;	 Catch:{ all -> 0x0170 }
        r0 = r0.getMessage();	 Catch:{ all -> 0x0170 }
        r2.<init>(r0);	 Catch:{ all -> 0x0170 }
        r0 = r2.a(r9);	 Catch:{ all -> 0x0170 }
        throw r0;	 Catch:{ all -> 0x0170 }
    L_0x01a0:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x016a, IOException -> 0x0191 }
    L_0x01a2:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x016a, IOException -> 0x0191 }
    L_0x01a4:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x016a, IOException -> 0x0191 }
    L_0x01a6:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x016a, IOException -> 0x0191 }
    L_0x01a8:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x01aa, IOException -> 0x0191 }
    L_0x01aa:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x01ac, IOException -> 0x0191 }
    L_0x01ac:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x01ae, IOException -> 0x0191 }
    L_0x01ae:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x016a, IOException -> 0x0191 }
    L_0x01b0:
        r0 = move-exception;
        throw r0;
    L_0x01b2:
        r0 = move-exception;
        throw r0;
    L_0x01b4:
        r0 = r3;
        goto L_0x014b;
    L_0x01b6:
        r4 = r5;
        goto L_0x00f5;
    L_0x01b9:
        r4 = r5;
        goto L_0x00c7;
    L_0x01bc:
        r4 = r5;
        goto L_0x007f;
    L_0x01bf:
        r0 = r2;
        goto L_0x014b;
    L_0x01c1:
        r3 = r0;
        goto L_0x00e6;
    L_0x01c4:
        r3 = r0;
        goto L_0x0070;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.Y.<init>(com.google.ad, com.google.h):void");
    }

    static int c(Y y, int i) {
        y.s = i;
        return i;
    }

    static aF a(Y y, aF aFVar) {
        y.G = aFVar;
        return aFVar;
    }

    public boolean s() {
        return (this.F & H) == H;
    }

    public static Y a(byte[] bArr) {
        return (Y) o.a(bArr);
    }

    private Y(cJ cJVar) {
        super(cJVar);
        this.k = (byte) -1;
        this.h = -1;
        this.B = cJVar.getUnknownFields();
    }

    static int b(Y y, int i) {
        y.i = i;
        return i;
    }

    public a8 y() {
        return this.K;
    }

    public int m() {
        return this.s;
    }

    public static Y a(ad adVar, h hVar) {
        return (Y) o.a(adVar, hVar);
    }

    public bv E() {
        return this.K;
    }

    public fO m1157getDefaultInstanceForType() {
        return l();
    }

    public static Y a(byte[] bArr, h hVar) {
        return (Y) o.a(bArr, hVar);
    }

    public boolean t() {
        return this.m;
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

    public fl toBuilder() {
        return w();
    }

    protected aO a(ec ecVar) {
        return new aO(ecVar, null);
    }

    static hx b(Y y, hx hxVar) {
        y.I = hxVar;
        return hxVar;
    }

    public static Y b(InputStream inputStream, h hVar) {
        return (Y) o.a(inputStream, hVar);
    }

    public il m1159toBuilder() {
        return w();
    }

    public int F() {
        return this.E;
    }

    public static Y a(hx hxVar, h hVar) {
        return (Y) o.b(hxVar, hVar);
    }

    private Y(boolean z) {
        this.k = (byte) -1;
        this.h = -1;
        this.B = eV.h();
    }

    public hx f() {
        return this.n;
    }

    protected bJ internalGetFieldAccessorTable() {
        return a5.c().a(Y.class, aO.class);
    }

    public int getSerializedSize() {
        int i = 0;
        int i2 = r;
        int i3 = this.h;
        if (i3 != -1) {
            return i3;
        }
        if ((this.F & x) == x) {
            i3 = eb.c((int) x, this.s) + 0;
        } else {
            i3 = 0;
        }
        if ((this.F & J) == J) {
            i3 += eb.c((int) J, this.e);
        }
        if ((this.F & z) == z) {
            i3 += eb.c((int) u, this.g);
        }
        if ((this.F & H) == H) {
            i3 += eb.c((int) z, this.I);
        }
        if ((this.F & 16) == 16) {
            i3 += eb.c((int) C, this.y);
        }
        if ((this.F & 32) == 32) {
            i3 += eb.f((int) f, this.D);
        }
        int i4 = i3;
        while (i < this.w.size()) {
            i3 = eb.f((int) A, (fO) this.w.get(i)) + i4;
            i += x;
            if (i2 != 0) {
                break;
            }
            i4 = i3;
        }
        i3 = i4;
        if ((this.F & 64) == 64) {
            i3 += eb.f((int) H, this.G);
        }
        if ((this.F & 128) == 128) {
            i3 += eb.f((int) l, this.K);
        }
        if ((this.F & 256) == 256) {
            i3 += eb.c((int) t, this.i);
        }
        if ((this.F & 512) == 512) {
            i3 += eb.c((int) j, this.E);
        }
        if ((this.F & 1024) == 1024) {
            i3 += eb.b((int) p, this.m);
        }
        if ((this.F & 2048) == 2048) {
            i3 += eb.c((int) q, this.n);
        }
        i3 += getUnknownFields().getSerializedSize();
        this.h = i3;
        return i3;
    }

    public boolean r() {
        return (this.F & J) == J;
    }

    public bg b(int i) {
        return (bg) this.w.get(i);
    }

    Y(ad adVar, h hVar, bs bsVar) {
        this(adVar, hVar);
    }

    static List a(Y y, List list) {
        y.w = list;
        return list;
    }

    static hx d(Y y, hx hxVar) {
        y.e = hxVar;
        return hxVar;
    }

    public int A() {
        return this.w.size();
    }

    public static Y a(InputStream inputStream, h hVar) {
        return (Y) o.b(inputStream, hVar);
    }

    static Z a(Y y, Z z) {
        y.D = z;
        return z;
    }

    public final eV getUnknownFields() {
        return this.B;
    }

    public aO e() {
        return I();
    }

    static boolean b() {
        return d;
    }

    static int e(Y y, int i) {
        y.y = i;
        return i;
    }

    public void writeTo(eb ebVar) {
        int i = r;
        getSerializedSize();
        if ((this.F & x) == x) {
            ebVar.e((int) x, this.s);
        }
        if ((this.F & J) == J) {
            ebVar.d((int) J, this.e);
        }
        if ((this.F & z) == z) {
            ebVar.d((int) u, this.g);
        }
        if ((this.F & H) == H) {
            ebVar.d((int) z, this.I);
        }
        if ((this.F & 16) == 16) {
            ebVar.e((int) C, this.y);
        }
        if ((this.F & 32) == 32) {
            ebVar.e((int) f, this.D);
        }
        int i2 = 0;
        while (i2 < this.w.size()) {
            ebVar.e((int) A, (fO) this.w.get(i2));
            int i3 = i2 + x;
            if (i != 0) {
                break;
            }
            i2 = i3;
        }
        if ((this.F & 64) == 64) {
            ebVar.e((int) H, this.G);
        }
        if ((this.F & 128) == 128) {
            ebVar.e((int) l, this.K);
        }
        if ((this.F & 256) == 256) {
            ebVar.e((int) t, this.i);
        }
        if ((this.F & 512) == 512) {
            ebVar.e((int) j, this.E);
        }
        if ((this.F & 1024) == 1024) {
            ebVar.a((int) p, this.m);
        }
        if ((this.F & 2048) == 2048) {
            ebVar.d((int) q, this.n);
        }
        getUnknownFields().writeTo(ebVar);
    }

    public boolean B() {
        return (this.F & 128) == 128;
    }

    public static Y a(InputStream inputStream) {
        return (Y) o.b(inputStream);
    }

    public List u() {
        return this.w;
    }

    static a8 a(Y y, a8 a8Var) {
        y.K = a8Var;
        return a8Var;
    }

    public aO w() {
        return a(this);
    }

    static int d(Y y, int i) {
        y.E = i;
        return i;
    }

    public static Y a(hx hxVar) {
        return (Y) o.a(hxVar);
    }

    public boolean q() {
        return (this.F & 1024) == 1024;
    }

    public il m1158newBuilderForType() {
        return e();
    }

    static boolean j() {
        return d;
    }

    public int D() {
        return this.y;
    }

    public boolean C() {
        return (this.F & 512) == 512;
    }

    static hx a(Y y, hx hxVar) {
        y.n = hxVar;
        return hxVar;
    }

    public ci getDefaultInstanceForType() {
        return l();
    }

    public hx K() {
        return this.g;
    }

    public boolean g() {
        return (this.F & 2048) == 2048;
    }

    public fl newBuilderForType() {
        return e();
    }

    public boolean p() {
        return (this.F & 256) == 256;
    }

    public bg n() {
        return this.D;
    }

    static hx c(Y y, hx hxVar) {
        y.g = hxVar;
        return hxVar;
    }

    static int a(Y y, int i) {
        y.F = i;
        return i;
    }

    public static Y M() {
        return v;
    }

    public boolean c() {
        return (this.F & z) == z;
    }

    public T getParserForType() {
        return o;
    }
}
