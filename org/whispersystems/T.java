package org.whispersystems;

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

public final class T extends bL implements aX {
    public static final int f = 1;
    private static final T i;
    public static com.google.T j;
    private static final long serialVersionUID = 0;
    private List e;
    private int g;
    private final eV h;
    private byte k;

    static List b(T t) {
        return t.e;
    }

    public int l() {
        return this.e.size();
    }

    protected aH a(ec ecVar) {
        return new aH(ecVar, null);
    }

    public aH k() {
        return f();
    }

    public final eV getUnknownFields() {
        return this.h;
    }

    protected Object writeReplace() {
        return super.writeReplace();
    }

    public H b(int i) {
        return (H) this.e.get(i);
    }

    public U a(int i) {
        return (U) this.e.get(i);
    }

    protected bJ internalGetFieldAccessorTable() {
        return a5.C().a(T.class, aH.class);
    }

    public static final fn b() {
        return a5.i();
    }

    public com.google.T getParserForType() {
        return j;
    }

    private T(cJ cJVar) {
        super(cJVar);
        this.k = (byte) -1;
        this.g = -1;
        this.h = cJVar.getUnknownFields();
    }

    static {
        j = new bm();
        i = new T(true);
        i.j();
    }

    public int getSerializedSize() {
        int i = Y.r;
        int i2 = this.g;
        if (i2 != -1) {
            return i2;
        }
        int i3;
        i2 = 0;
        int i4 = 0;
        while (i2 < this.e.size()) {
            i4 += eb.f((int) f, (fO) this.e.get(i2));
            i3 = i2 + f;
            if (i != 0) {
                break;
            }
            i2 = i3;
        }
        i3 = getUnknownFields().getSerializedSize() + i4;
        this.g = i3;
        return i3;
    }

    public aH c() {
        return a(this);
    }

    public List e() {
        return this.e;
    }

    public static T a(hx hxVar) {
        return (T) j.a(hxVar);
    }

    public static T a(InputStream inputStream) {
        return (T) j.a(inputStream);
    }

    private T(boolean z) {
        this.k = (byte) -1;
        this.g = -1;
        this.h = eV.h();
    }

    public static T a(byte[] bArr) {
        return (T) j.a(bArr);
    }

    public static aH a(T t) {
        return f().a(t);
    }

    T(cJ cJVar, bs bsVar) {
        this(cJVar);
    }

    public static T b(InputStream inputStream, h hVar) {
        return (T) j.a(inputStream, hVar);
    }

    public static T a() {
        return i;
    }

    public fl toBuilder() {
        return c();
    }

    public T d() {
        return i;
    }

    public static aH f() {
        return aH.l();
    }

    static List a(T t, List list) {
        t.e = list;
        return list;
    }

    public il m1138toBuilder() {
        return c();
    }

    public ci getDefaultInstanceForType() {
        return d();
    }

    public List h() {
        return this.e;
    }

    public void writeTo(eb ebVar) {
        int i = Y.r;
        getSerializedSize();
        int i2 = 0;
        while (i2 < this.e.size()) {
            ebVar.e((int) f, (fO) this.e.get(i2));
            int i3 = i2 + f;
            if (i != 0) {
                break;
            }
            i2 = i3;
        }
        getUnknownFields().writeTo(ebVar);
    }

    private void j() {
        this.e = Collections.emptyList();
    }

    public static T b(InputStream inputStream) {
        return (T) j.b(inputStream);
    }

    public il m1137newBuilderForType() {
        return k();
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

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private T(com.google.ad r8, com.google.h r9) {
        /*
        r7 = this;
        r0 = 0;
        r1 = -1;
        r2 = 1;
        r3 = org.whispersystems.Y.r;
        r7.<init>();
        r7.k = r1;
        r7.g = r1;
        r7.j();
        r4 = com.google.eV.g();
        r1 = r0;
    L_0x0014:
        if (r0 != 0) goto L_0x0040;
    L_0x0016:
        r5 = r8.z();	 Catch:{ fN -> 0x005c, IOException -> 0x007b }
        switch(r5) {
            case 0: goto L_0x0056;
            case 10: goto L_0x0026;
            default: goto L_0x001d;
        };
    L_0x001d:
        r5 = r7.a(r8, r4, r9, r5);	 Catch:{ fN -> 0x005a, IOException -> 0x007b }
        if (r5 != 0) goto L_0x003e;
    L_0x0023:
        if (r3 == 0) goto L_0x008c;
    L_0x0025:
        r0 = r2;
    L_0x0026:
        r5 = r1 & 1;
        if (r5 == r2) goto L_0x0033;
    L_0x002a:
        r5 = new java.util.ArrayList;	 Catch:{ fN -> 0x005c, IOException -> 0x007b }
        r5.<init>();	 Catch:{ fN -> 0x005c, IOException -> 0x007b }
        r7.e = r5;	 Catch:{ fN -> 0x005c, IOException -> 0x007b }
        r1 = r1 | 1;
    L_0x0033:
        r5 = r7.e;	 Catch:{ fN -> 0x005c, IOException -> 0x007b }
        r6 = org.whispersystems.U.n;	 Catch:{ fN -> 0x005c, IOException -> 0x007b }
        r6 = r8.a(r6, r9);	 Catch:{ fN -> 0x005c, IOException -> 0x007b }
        r5.add(r6);	 Catch:{ fN -> 0x005c, IOException -> 0x007b }
    L_0x003e:
        if (r3 == 0) goto L_0x0014;
    L_0x0040:
        r0 = r1 & 1;
        if (r0 != r2) goto L_0x004c;
    L_0x0044:
        r0 = r7.e;	 Catch:{ fN -> 0x0079 }
        r0 = java.util.Collections.unmodifiableList(r0);	 Catch:{ fN -> 0x0079 }
        r7.e = r0;	 Catch:{ fN -> 0x0079 }
    L_0x004c:
        r0 = r4.d();
        r7.h = r0;
        r7.b();
        return;
    L_0x0056:
        if (r3 == 0) goto L_0x008c;
    L_0x0058:
        r0 = r2;
        goto L_0x001d;
    L_0x005a:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x005c, IOException -> 0x007b }
    L_0x005c:
        r0 = move-exception;
        r0 = r0.a(r7);	 Catch:{ all -> 0x0062 }
        throw r0;	 Catch:{ all -> 0x0062 }
    L_0x0062:
        r0 = move-exception;
        r1 = r1 & 1;
        if (r1 != r2) goto L_0x006f;
    L_0x0067:
        r1 = r7.e;	 Catch:{ fN -> 0x008a }
        r1 = java.util.Collections.unmodifiableList(r1);	 Catch:{ fN -> 0x008a }
        r7.e = r1;	 Catch:{ fN -> 0x008a }
    L_0x006f:
        r1 = r4.d();
        r7.h = r1;
        r7.b();
        throw r0;
    L_0x0079:
        r0 = move-exception;
        throw r0;
    L_0x007b:
        r0 = move-exception;
        r3 = new com.google.fN;	 Catch:{ all -> 0x0062 }
        r0 = r0.getMessage();	 Catch:{ all -> 0x0062 }
        r3.<init>(r0);	 Catch:{ all -> 0x0062 }
        r0 = r3.a(r7);	 Catch:{ all -> 0x0062 }
        throw r0;	 Catch:{ all -> 0x0062 }
    L_0x008a:
        r0 = move-exception;
        throw r0;
    L_0x008c:
        r0 = r2;
        goto L_0x003e;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.T.<init>(com.google.ad, com.google.h):void");
    }

    static boolean i() {
        return d;
    }

    public static T a(hx hxVar, h hVar) {
        return (T) j.b(hxVar, hVar);
    }

    protected fl newBuilderForType(ec ecVar) {
        return a(ecVar);
    }

    public fO m1136getDefaultInstanceForType() {
        return d();
    }

    static boolean g() {
        return d;
    }

    public static T a(byte[] bArr, h hVar) {
        return (T) j.a(bArr, hVar);
    }

    public fl newBuilderForType() {
        return k();
    }

    public static T a(ad adVar) {
        return (T) j.a(adVar);
    }

    T(ad adVar, h hVar, bs bsVar) {
        this(adVar, hVar);
    }

    public static T a(InputStream inputStream, h hVar) {
        return (T) j.b(inputStream, hVar);
    }

    public static T a(ad adVar, h hVar) {
        return (T) j.a(adVar, hVar);
    }
}
