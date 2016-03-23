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

public final class aj extends bL implements ak {
    public static final int CIPHERKEY_FIELD_NUMBER = 2;
    public static final int INDEX_FIELD_NUMBER = 1;
    public static final int IV_FIELD_NUMBER = 4;
    public static final int MACKEY_FIELD_NUMBER = 3;
    public static T PARSER;
    private static final aj e;
    private static final long serialVersionUID = 0;
    private int f;
    private final eV g;
    private hx h;
    private hx i;
    private byte j;
    private hx k;
    private int l;
    private int m;

    aj(cJ cJVar, bs bsVar) {
        this(cJVar);
    }

    public static ac i() {
        return ac.g();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private aj(com.google.ad r6, com.google.h r7) {
        /*
        r5 = this;
        r1 = 1;
        r0 = -1;
        r2 = org.whispersystems.Y.r;
        r5.<init>();
        r5.j = r0;
        r5.m = r0;
        r5.p();
        r3 = com.google.eV.g();
        r0 = 0;
    L_0x0013:
        if (r0 != 0) goto L_0x005d;
    L_0x0015:
        r4 = r6.z();	 Catch:{ fN -> 0x006d, IOException -> 0x0086 }
        switch(r4) {
            case 0: goto L_0x0067;
            case 8: goto L_0x0025;
            case 18: goto L_0x0033;
            case 26: goto L_0x0041;
            case 34: goto L_0x004f;
            default: goto L_0x001c;
        };
    L_0x001c:
        r4 = r5.a(r6, r3, r7, r4);	 Catch:{ fN -> 0x006b, IOException -> 0x0086 }
        if (r4 != 0) goto L_0x005b;
    L_0x0022:
        if (r2 == 0) goto L_0x0095;
    L_0x0024:
        r0 = r1;
    L_0x0025:
        r4 = r5.f;	 Catch:{ fN -> 0x007e, IOException -> 0x0086 }
        r4 = r4 | 1;
        r5.f = r4;	 Catch:{ fN -> 0x007e, IOException -> 0x0086 }
        r4 = r6.t();	 Catch:{ fN -> 0x007e, IOException -> 0x0086 }
        r5.l = r4;	 Catch:{ fN -> 0x007e, IOException -> 0x0086 }
        if (r2 == 0) goto L_0x005b;
    L_0x0033:
        r4 = r5.f;	 Catch:{ fN -> 0x0080, IOException -> 0x0086 }
        r4 = r4 | 2;
        r5.f = r4;	 Catch:{ fN -> 0x0080, IOException -> 0x0086 }
        r4 = r6.q();	 Catch:{ fN -> 0x0080, IOException -> 0x0086 }
        r5.h = r4;	 Catch:{ fN -> 0x0080, IOException -> 0x0086 }
        if (r2 == 0) goto L_0x005b;
    L_0x0041:
        r4 = r5.f;	 Catch:{ fN -> 0x0082, IOException -> 0x0086 }
        r4 = r4 | 4;
        r5.f = r4;	 Catch:{ fN -> 0x0082, IOException -> 0x0086 }
        r4 = r6.q();	 Catch:{ fN -> 0x0082, IOException -> 0x0086 }
        r5.k = r4;	 Catch:{ fN -> 0x0082, IOException -> 0x0086 }
        if (r2 == 0) goto L_0x005b;
    L_0x004f:
        r4 = r5.f;	 Catch:{ fN -> 0x0084, IOException -> 0x0086 }
        r4 = r4 | 8;
        r5.f = r4;	 Catch:{ fN -> 0x0084, IOException -> 0x0086 }
        r4 = r6.q();	 Catch:{ fN -> 0x0084, IOException -> 0x0086 }
        r5.i = r4;	 Catch:{ fN -> 0x0084, IOException -> 0x0086 }
    L_0x005b:
        if (r2 == 0) goto L_0x0013;
    L_0x005d:
        r0 = r3.d();
        r5.g = r0;
        r5.b();
        return;
    L_0x0067:
        if (r2 == 0) goto L_0x0095;
    L_0x0069:
        r0 = r1;
        goto L_0x001c;
    L_0x006b:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x006d, IOException -> 0x0086 }
    L_0x006d:
        r0 = move-exception;
        r0 = r0.a(r5);	 Catch:{ all -> 0x0073 }
        throw r0;	 Catch:{ all -> 0x0073 }
    L_0x0073:
        r0 = move-exception;
        r1 = r3.d();
        r5.g = r1;
        r5.b();
        throw r0;
    L_0x007e:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0080, IOException -> 0x0086 }
    L_0x0080:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0082, IOException -> 0x0086 }
    L_0x0082:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0084, IOException -> 0x0086 }
    L_0x0084:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x006d, IOException -> 0x0086 }
    L_0x0086:
        r0 = move-exception;
        r1 = new com.google.fN;	 Catch:{ all -> 0x0073 }
        r0 = r0.getMessage();	 Catch:{ all -> 0x0073 }
        r1.<init>(r0);	 Catch:{ all -> 0x0073 }
        r0 = r1.a(r5);	 Catch:{ all -> 0x0073 }
        throw r0;	 Catch:{ all -> 0x0073 }
    L_0x0095:
        r0 = r1;
        goto L_0x005b;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.aj.<init>(com.google.ad, com.google.h):void");
    }

    public static aj a(byte[] bArr, h hVar) {
        return (aj) PARSER.a(bArr, hVar);
    }

    public static aj a(ad adVar, h hVar) {
        return (aj) PARSER.a(adVar, hVar);
    }

    static int a(aj ajVar, int i) {
        ajVar.f = i;
        return i;
    }

    public static aj a(byte[] bArr) {
        return (aj) PARSER.a(bArr);
    }

    public il m1300newBuilderForType() {
        return a();
    }

    public ac a() {
        return i();
    }

    aj(ad adVar, h hVar, bs bsVar) {
        this(adVar, hVar);
    }

    static hx a(aj ajVar, hx hxVar) {
        ajVar.k = hxVar;
        return hxVar;
    }

    public ci getDefaultInstanceForType() {
        return n();
    }

    public boolean b() {
        return (this.f & INDEX_FIELD_NUMBER) == INDEX_FIELD_NUMBER;
    }

    public int getSerializedSize() {
        int i = this.m;
        if (i != -1) {
            return i;
        }
        i = 0;
        if ((this.f & INDEX_FIELD_NUMBER) == INDEX_FIELD_NUMBER) {
            i = 0 + eb.c((int) INDEX_FIELD_NUMBER, this.l);
        }
        if ((this.f & CIPHERKEY_FIELD_NUMBER) == CIPHERKEY_FIELD_NUMBER) {
            i += eb.c((int) CIPHERKEY_FIELD_NUMBER, this.h);
        }
        if ((this.f & IV_FIELD_NUMBER) == IV_FIELD_NUMBER) {
            i += eb.c((int) MACKEY_FIELD_NUMBER, this.k);
        }
        if ((this.f & 8) == 8) {
            i += eb.c((int) IV_FIELD_NUMBER, this.i);
        }
        i += getUnknownFields().getSerializedSize();
        this.m = i;
        return i;
    }

    private void p() {
        this.l = 0;
        this.h = hx.b;
        this.k = hx.b;
        this.i = hx.b;
    }

    public static aj b(InputStream inputStream) {
        return (aj) PARSER.a(inputStream);
    }

    static {
        PARSER = new bN();
        e = new aj(true);
        e.p();
    }

    public static aj j() {
        return e;
    }

    static hx b(aj ajVar, hx hxVar) {
        ajVar.i = hxVar;
        return hxVar;
    }

    public static aj a(ad adVar) {
        return (aj) PARSER.a(adVar);
    }

    static hx c(aj ajVar, hx hxVar) {
        ajVar.h = hxVar;
        return hxVar;
    }

    public void writeTo(eb ebVar) {
        getSerializedSize();
        if ((this.f & INDEX_FIELD_NUMBER) == INDEX_FIELD_NUMBER) {
            ebVar.e((int) INDEX_FIELD_NUMBER, this.l);
        }
        if ((this.f & CIPHERKEY_FIELD_NUMBER) == CIPHERKEY_FIELD_NUMBER) {
            ebVar.d((int) CIPHERKEY_FIELD_NUMBER, this.h);
        }
        if ((this.f & IV_FIELD_NUMBER) == IV_FIELD_NUMBER) {
            ebVar.d((int) MACKEY_FIELD_NUMBER, this.k);
        }
        if ((this.f & 8) == 8) {
            ebVar.d((int) IV_FIELD_NUMBER, this.i);
        }
        getUnknownFields().writeTo(ebVar);
    }

    public boolean m() {
        return (this.f & IV_FIELD_NUMBER) == IV_FIELD_NUMBER;
    }

    protected Object writeReplace() {
        return super.writeReplace();
    }

    public hx l() {
        return this.k;
    }

    public fl newBuilderForType() {
        return a();
    }

    private aj(cJ cJVar) {
        super(cJVar);
        this.j = (byte) -1;
        this.m = -1;
        this.g = cJVar.getUnknownFields();
    }

    public ac o() {
        return a(this);
    }

    public static aj a(hx hxVar) {
        return (aj) PARSER.a(hxVar);
    }

    static boolean g() {
        return d;
    }

    protected bJ internalGetFieldAccessorTable() {
        return a5.E().a(aj.class, ac.class);
    }

    public boolean h() {
        return (this.f & 8) == 8;
    }

    public final eV getUnknownFields() {
        return this.g;
    }

    public hx d() {
        return this.i;
    }

    public aj n() {
        return e;
    }

    public static aj a(InputStream inputStream, h hVar) {
        return (aj) PARSER.a(inputStream, hVar);
    }

    static int b(aj ajVar, int i) {
        ajVar.l = i;
        return i;
    }

    public static ac a(aj ajVar) {
        return i().a(ajVar);
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

    public boolean c() {
        return (this.f & CIPHERKEY_FIELD_NUMBER) == CIPHERKEY_FIELD_NUMBER;
    }

    public static aj a(InputStream inputStream) {
        return (aj) PARSER.b(inputStream);
    }

    public il m1301toBuilder() {
        return o();
    }

    private aj(boolean z) {
        this.j = (byte) -1;
        this.m = -1;
        this.g = eV.h();
    }

    public int k() {
        return this.l;
    }

    public T getParserForType() {
        return PARSER;
    }

    public static aj a(hx hxVar, h hVar) {
        return (aj) PARSER.b(hxVar, hVar);
    }

    public fl toBuilder() {
        return o();
    }

    public hx f() {
        return this.h;
    }

    protected ac a(ec ecVar) {
        return new ac(ecVar, null);
    }

    public static aj b(InputStream inputStream, h hVar) {
        return (aj) PARSER.b(inputStream, hVar);
    }

    public static final fn e() {
        return a5.d();
    }

    public fO m1299getDefaultInstanceForType() {
        return n();
    }
}
