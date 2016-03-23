package com.google;

import java.util.EnumMap;
import java.util.Map;

public final class f6 {
    private final gg a;
    private fI[] b;
    private Map c;
    private final byte[] d;
    private final String e;
    private final long f;

    public void a(eD eDVar, Object obj) {
        if (this.c == null) {
            this.c = new EnumMap(eD.class);
        }
        this.c.put(eDVar, obj);
    }

    public Map b() {
        return this.c;
    }

    public f6(String str, byte[] bArr, fI[] fIVarArr, gg ggVar) {
        this(str, bArr, fIVarArr, ggVar, System.currentTimeMillis());
    }

    public byte[] a() {
        return this.d;
    }

    public String c() {
        return this.e;
    }

    public void a(fI[] fIVarArr) {
        Object obj = this.b;
        if (obj == null) {
            this.b = fIVarArr;
            if (fI.a == 0) {
                return;
            }
        }
        if (fIVarArr != null && fIVarArr.length > 0) {
            Object obj2 = new fI[(obj.length + fIVarArr.length)];
            System.arraycopy(obj, 0, obj2, 0, obj.length);
            System.arraycopy(fIVarArr, 0, obj2, obj.length, fIVarArr.length);
            this.b = obj2;
        }
    }

    public fI[] e() {
        return this.b;
    }

    public f6(String str, byte[] bArr, fI[] fIVarArr, gg ggVar, long j) {
        this.e = str;
        this.d = bArr;
        this.b = fIVarArr;
        this.a = ggVar;
        this.c = null;
        this.f = j;
    }

    public gg d() {
        return this.a;
    }

    public String toString() {
        return this.e;
    }

    public void a(Map map) {
        if (map != null) {
            if (this.c == null) {
                this.c = map;
                if (fI.a == 0) {
                    return;
                }
            }
            this.c.putAll(map);
        }
    }
}
