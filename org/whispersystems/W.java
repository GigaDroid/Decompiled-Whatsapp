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

public final class W extends bL implements bf {
    public static final int ITERATION_FIELD_NUMBER = 1;
    public static T PARSER = null;
    public static final int SEED_FIELD_NUMBER = 2;
    private static final W h;
    private static final long serialVersionUID = 0;
    private int e;
    private int f;
    private hx g;
    private final eV i;
    private byte j;
    private int k;

    private W(boolean z) {
        this.j = (byte) -1;
        this.e = -1;
        this.i = eV.h();
    }

    public static aE a(W w) {
        return b().a(w);
    }

    public boolean c() {
        return (this.f & SEED_FIELD_NUMBER) == SEED_FIELD_NUMBER;
    }

    public hx f() {
        return this.g;
    }

    static {
        PARSER = new bS();
        h = new W(true);
        h.g();
    }

    public static W a(byte[] bArr) {
        return (W) PARSER.a(bArr);
    }

    public aE i() {
        return b();
    }

    public aE a() {
        return a(this);
    }

    public static W a(byte[] bArr, h hVar) {
        return (W) PARSER.a(bArr, hVar);
    }

    protected fl newBuilderForType(ec ecVar) {
        return a(ecVar);
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

    public int getSerializedSize() {
        int i = this.e;
        if (i != -1) {
            return i;
        }
        i = 0;
        if ((this.f & ITERATION_FIELD_NUMBER) == ITERATION_FIELD_NUMBER) {
            i = 0 + eb.c((int) ITERATION_FIELD_NUMBER, this.k);
        }
        if ((this.f & SEED_FIELD_NUMBER) == SEED_FIELD_NUMBER) {
            i += eb.c((int) SEED_FIELD_NUMBER, this.g);
        }
        i += getUnknownFields().getSerializedSize();
        this.e = i;
        return i;
    }

    public ci getDefaultInstanceForType() {
        return e();
    }

    public static W a(InputStream inputStream, h hVar) {
        return (W) PARSER.b(inputStream, hVar);
    }

    private W(cJ cJVar) {
        super(cJVar);
        this.j = (byte) -1;
        this.e = -1;
        this.i = cJVar.getUnknownFields();
    }

    public static W j() {
        return h;
    }

    public static W a(ad adVar, h hVar) {
        return (W) PARSER.a(adVar, hVar);
    }

    protected bJ internalGetFieldAccessorTable() {
        return a5.q().a(W.class, aE.class);
    }

    private void g() {
        this.k = 0;
        this.g = hx.b;
    }

    public il m1163toBuilder() {
        return a();
    }

    public static aE b() {
        return aE.a();
    }

    static hx a(W w, hx hxVar) {
        w.g = hxVar;
        return hxVar;
    }

    static boolean d() {
        return d;
    }

    public T getParserForType() {
        return PARSER;
    }

    public static W a(hx hxVar, h hVar) {
        return (W) PARSER.b(hxVar, hVar);
    }

    public boolean l() {
        return (this.f & ITERATION_FIELD_NUMBER) == ITERATION_FIELD_NUMBER;
    }

    public il m1161newBuilderForType() {
        return i();
    }

    public static final fn k() {
        return a5.v();
    }

    static int b(W w, int i) {
        w.k = i;
        return i;
    }

    static int a(W w, int i) {
        w.f = i;
        return i;
    }

    public static W a(hx hxVar) {
        return (W) PARSER.a(hxVar);
    }

    public static W a(InputStream inputStream) {
        return (W) PARSER.b(inputStream);
    }

    public int h() {
        return this.k;
    }

    public fl toBuilder() {
        return a();
    }

    public static W a(ad adVar) {
        return (W) PARSER.a(adVar);
    }

    public W e() {
        return h;
    }

    protected aE a(ec ecVar) {
        return new aE(ecVar, null);
    }

    W(ad adVar, h hVar, bs bsVar) {
        this(adVar, hVar);
    }

    public final eV getUnknownFields() {
        return this.i;
    }

    public static W b(InputStream inputStream, h hVar) {
        return (W) PARSER.a(inputStream, hVar);
    }

    protected Object writeReplace() {
        return super.writeReplace();
    }

    W(cJ cJVar, bs bsVar) {
        this(cJVar);
    }

    public fl newBuilderForType() {
        return i();
    }

    public static W b(InputStream inputStream) {
        return (W) PARSER.a(inputStream);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private W(com.google.ad r6, com.google.h r7) {
        /*
        r5 = this;
        r1 = 1;
        r0 = -1;
        r2 = org.whispersystems.Y.r;
        r5.<init>();
        r5.j = r0;
        r5.e = r0;
        r5.g();
        r3 = com.google.eV.g();
        r0 = 0;
    L_0x0013:
        if (r0 != 0) goto L_0x0041;
    L_0x0015:
        r4 = r6.z();	 Catch:{ fN -> 0x0051, IOException -> 0x0066 }
        switch(r4) {
            case 0: goto L_0x004b;
            case 8: goto L_0x0025;
            case 18: goto L_0x0033;
            default: goto L_0x001c;
        };
    L_0x001c:
        r4 = r5.a(r6, r3, r7, r4);	 Catch:{ fN -> 0x004f, IOException -> 0x0066 }
        if (r4 != 0) goto L_0x003f;
    L_0x0022:
        if (r2 == 0) goto L_0x0075;
    L_0x0024:
        r0 = r1;
    L_0x0025:
        r4 = r5.f;	 Catch:{ fN -> 0x0062, IOException -> 0x0066 }
        r4 = r4 | 1;
        r5.f = r4;	 Catch:{ fN -> 0x0062, IOException -> 0x0066 }
        r4 = r6.t();	 Catch:{ fN -> 0x0062, IOException -> 0x0066 }
        r5.k = r4;	 Catch:{ fN -> 0x0062, IOException -> 0x0066 }
        if (r2 == 0) goto L_0x003f;
    L_0x0033:
        r4 = r5.f;	 Catch:{ fN -> 0x0064, IOException -> 0x0066 }
        r4 = r4 | 2;
        r5.f = r4;	 Catch:{ fN -> 0x0064, IOException -> 0x0066 }
        r4 = r6.q();	 Catch:{ fN -> 0x0064, IOException -> 0x0066 }
        r5.g = r4;	 Catch:{ fN -> 0x0064, IOException -> 0x0066 }
    L_0x003f:
        if (r2 == 0) goto L_0x0013;
    L_0x0041:
        r0 = r3.d();
        r5.i = r0;
        r5.b();
        return;
    L_0x004b:
        if (r2 == 0) goto L_0x0075;
    L_0x004d:
        r0 = r1;
        goto L_0x001c;
    L_0x004f:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0051, IOException -> 0x0066 }
    L_0x0051:
        r0 = move-exception;
        r0 = r0.a(r5);	 Catch:{ all -> 0x0057 }
        throw r0;	 Catch:{ all -> 0x0057 }
    L_0x0057:
        r0 = move-exception;
        r1 = r3.d();
        r5.i = r1;
        r5.b();
        throw r0;
    L_0x0062:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0064, IOException -> 0x0066 }
    L_0x0064:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0051, IOException -> 0x0066 }
    L_0x0066:
        r0 = move-exception;
        r1 = new com.google.fN;	 Catch:{ all -> 0x0057 }
        r0 = r0.getMessage();	 Catch:{ all -> 0x0057 }
        r1.<init>(r0);	 Catch:{ all -> 0x0057 }
        r0 = r1.a(r5);	 Catch:{ all -> 0x0057 }
        throw r0;	 Catch:{ all -> 0x0057 }
    L_0x0075:
        r0 = r1;
        goto L_0x003f;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.W.<init>(com.google.ad, com.google.h):void");
    }

    public void writeTo(eb ebVar) {
        getSerializedSize();
        if ((this.f & ITERATION_FIELD_NUMBER) == ITERATION_FIELD_NUMBER) {
            ebVar.e((int) ITERATION_FIELD_NUMBER, this.k);
        }
        if ((this.f & SEED_FIELD_NUMBER) == SEED_FIELD_NUMBER) {
            ebVar.d((int) SEED_FIELD_NUMBER, this.g);
        }
        getUnknownFields().writeTo(ebVar);
    }

    public fO m1160getDefaultInstanceForType() {
        return e();
    }
}
