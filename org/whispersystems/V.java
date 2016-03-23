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

public final class V extends bL implements A {
    public static final int ITERATION_FIELD_NUMBER = 1;
    public static T PARSER = null;
    public static final int SEED_FIELD_NUMBER = 2;
    private static final V j;
    private static final long serialVersionUID = 0;
    private byte e;
    private int f;
    private int g;
    private final eV h;
    private hx i;
    private int k;

    public aQ l() {
        return h();
    }

    public final eV getUnknownFields() {
        return this.h;
    }

    V(ad adVar, h hVar, bs bsVar) {
        this(adVar, hVar);
    }

    public int getSerializedSize() {
        int i = this.k;
        if (i != -1) {
            return i;
        }
        i = 0;
        if ((this.g & ITERATION_FIELD_NUMBER) == ITERATION_FIELD_NUMBER) {
            i = 0 + eb.c((int) ITERATION_FIELD_NUMBER, this.f);
        }
        if ((this.g & SEED_FIELD_NUMBER) == SEED_FIELD_NUMBER) {
            i += eb.c((int) SEED_FIELD_NUMBER, this.i);
        }
        i += getUnknownFields().getSerializedSize();
        this.k = i;
        return i;
    }

    public static V a(ad adVar, h hVar) {
        return (V) PARSER.a(adVar, hVar);
    }

    static boolean a() {
        return d;
    }

    static int a(V v, int i) {
        v.f = i;
        return i;
    }

    public boolean d() {
        return (this.g & ITERATION_FIELD_NUMBER) == ITERATION_FIELD_NUMBER;
    }

    public static V b(InputStream inputStream, h hVar) {
        return (V) PARSER.b(inputStream, hVar);
    }

    public static aQ a(V v) {
        return h().a(v);
    }

    public static V a(byte[] bArr) {
        return (V) PARSER.a(bArr);
    }

    public static V a(hx hxVar, h hVar) {
        return (V) PARSER.b(hxVar, hVar);
    }

    public void writeTo(eb ebVar) {
        getSerializedSize();
        if ((this.g & ITERATION_FIELD_NUMBER) == ITERATION_FIELD_NUMBER) {
            ebVar.e((int) ITERATION_FIELD_NUMBER, this.f);
        }
        if ((this.g & SEED_FIELD_NUMBER) == SEED_FIELD_NUMBER) {
            ebVar.d((int) SEED_FIELD_NUMBER, this.i);
        }
        getUnknownFields().writeTo(ebVar);
    }

    public static V a(hx hxVar) {
        return (V) PARSER.a(hxVar);
    }

    public static V a(InputStream inputStream) {
        return (V) PARSER.b(inputStream);
    }

    protected bJ internalGetFieldAccessorTable() {
        return a5.s().a(V.class, aQ.class);
    }

    public il m1152newBuilderForType() {
        return l();
    }

    public int b() {
        return this.f;
    }

    public static V a(byte[] bArr, h hVar) {
        return (V) PARSER.a(bArr, hVar);
    }

    public il m1153toBuilder() {
        return i();
    }

    public ci getDefaultInstanceForType() {
        return k();
    }

    private void c() {
        this.f = 0;
        this.i = hx.b;
    }

    public final boolean isInitialized() {
        byte b = this.e;
        if (b == -1) {
            this.e = (byte) 1;
            return true;
        } else if (b == (byte) 1) {
            return true;
        } else {
            return false;
        }
    }

    private V(cJ cJVar) {
        super(cJVar);
        this.e = (byte) -1;
        this.k = -1;
        this.h = cJVar.getUnknownFields();
    }

    public V k() {
        return j;
    }

    public fO m1151getDefaultInstanceForType() {
        return k();
    }

    private V(boolean z) {
        this.e = (byte) -1;
        this.k = -1;
        this.h = eV.h();
    }

    public boolean g() {
        return (this.g & SEED_FIELD_NUMBER) == SEED_FIELD_NUMBER;
    }

    public static V a(ad adVar) {
        return (V) PARSER.a(adVar);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private V(com.google.ad r6, com.google.h r7) {
        /*
        r5 = this;
        r1 = 1;
        r0 = -1;
        r2 = org.whispersystems.Y.r;
        r5.<init>();
        r5.e = r0;
        r5.k = r0;
        r5.c();
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
        r4 = r5.g;	 Catch:{ fN -> 0x0062, IOException -> 0x0066 }
        r4 = r4 | 1;
        r5.g = r4;	 Catch:{ fN -> 0x0062, IOException -> 0x0066 }
        r4 = r6.t();	 Catch:{ fN -> 0x0062, IOException -> 0x0066 }
        r5.f = r4;	 Catch:{ fN -> 0x0062, IOException -> 0x0066 }
        if (r2 == 0) goto L_0x003f;
    L_0x0033:
        r4 = r5.g;	 Catch:{ fN -> 0x0064, IOException -> 0x0066 }
        r4 = r4 | 2;
        r5.g = r4;	 Catch:{ fN -> 0x0064, IOException -> 0x0066 }
        r4 = r6.q();	 Catch:{ fN -> 0x0064, IOException -> 0x0066 }
        r5.i = r4;	 Catch:{ fN -> 0x0064, IOException -> 0x0066 }
    L_0x003f:
        if (r2 == 0) goto L_0x0013;
    L_0x0041:
        r0 = r3.d();
        r5.h = r0;
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
        r5.h = r1;
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
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.V.<init>(com.google.ad, com.google.h):void");
    }

    public aQ i() {
        return a(this);
    }

    public static final fn e() {
        return a5.a();
    }

    public static V j() {
        return j;
    }

    V(cJ cJVar, bs bsVar) {
        this(cJVar);
    }

    static hx a(V v, hx hxVar) {
        v.i = hxVar;
        return hxVar;
    }

    public static aQ h() {
        return aQ.g();
    }

    public fl newBuilderForType() {
        return l();
    }

    protected aQ a(ec ecVar) {
        return new aQ(ecVar, null);
    }

    static {
        PARSER = new bD();
        j = new V(true);
        j.c();
    }

    public T getParserForType() {
        return PARSER;
    }

    protected Object writeReplace() {
        return super.writeReplace();
    }

    static int b(V v, int i) {
        v.g = i;
        return i;
    }

    public fl toBuilder() {
        return i();
    }

    protected fl newBuilderForType(ec ecVar) {
        return a(ecVar);
    }

    public hx f() {
        return this.i;
    }

    public static V b(InputStream inputStream) {
        return (V) PARSER.a(inputStream);
    }

    public static V a(InputStream inputStream, h hVar) {
        return (V) PARSER.a(inputStream, hVar);
    }
}
