package com.google;

import com.whatsapp.arj;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import org.v;
import org.whispersystems.at;

public final class eV implements fO {
    private static final eV a;
    private static final gb b;
    private static final String[] z;
    private Map c;

    eV(Map map, fC fCVar) {
        this(map);
    }

    public void a(eb ebVar) {
        boolean z = bA.b;
        for (Entry entry : this.c.entrySet()) {
            ((b7) entry.getValue()).b(((Integer) entry.getKey()).intValue(), ebVar);
            if (z) {
                return;
            }
        }
    }

    public il toBuilder() {
        return c();
    }

    public fO getDefaultInstanceForType() {
        return b();
    }

    public hx a() {
        try {
            c9 a = hx.a(getSerializedSize());
            writeTo(a.b());
            return a.a();
        } catch (Throwable e) {
            throw new RuntimeException(z[1], e);
        }
    }

    public boolean isInitialized() {
        return true;
    }

    public byte[] m123b() {
        try {
            byte[] bArr = new byte[getSerializedSize()];
            eb a = eb.a(bArr);
            writeTo(a);
            a.a();
            return bArr;
        } catch (Throwable e) {
            throw new RuntimeException(z[0], e);
        }
    }

    public void writeTo(eb ebVar) {
        boolean z = bA.b;
        for (Entry entry : this.c.entrySet()) {
            ((b7) entry.getValue()).a(((Integer) entry.getKey()).intValue(), ebVar);
            if (z) {
                return;
            }
        }
    }

    public int getSerializedSize() {
        boolean z = bA.b;
        int i = 0;
        for (Entry entry : this.c.entrySet()) {
            int b = ((b7) entry.getValue()).b(((Integer) entry.getKey()).intValue()) + i;
            if (z) {
                return b;
            }
            i = b;
        }
        return i;
    }

    public final gb e() {
        return b;
    }

    static {
        int i;
        String[] strArr = new String[2];
        char[] toCharArray = "w\r\u0019j$H\u0001\u0011j+CH\u001fleEH\tz1AH\nq7E\u0011Kw-V\r\u001c#$JH\"L\u0000\\\u000b\u000es1M\u0007\u0005#mW\u0000\u0004v)@H\u0005f3A\u001aKk$T\u0018\u000eml\n".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i2 = 0; length > i2; i2++) {
            char c = cArr[i2];
            switch (i2 % 5) {
                case v.m /*0*/:
                    i = 36;
                    break;
                case at.g /*1*/:
                    i = arj.Theme_editTextStyle;
                    break;
                case at.i /*2*/:
                    i = arj.Theme_seekBarStyle;
                    break;
                case at.o /*3*/:
                    i = 3;
                    break;
                default:
                    i = 69;
                    break;
            }
            cArr[i2] = (char) (i ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "w\r\u0019j$H\u0001\u0011j+CH\u001fleEH)z1A;\u001fq,J\u000fKw-V\r\u001c#$JH\"L\u0000\\\u000b\u000es1M\u0007\u0005#mW\u0000\u0004v)@H\u0005f3A\u001aKk$T\u0018\u000eml\n".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case v.m /*0*/:
                    i = 36;
                    break;
                case at.g /*1*/:
                    i = arj.Theme_editTextStyle;
                    break;
                case at.i /*2*/:
                    i = arj.Theme_seekBarStyle;
                    break;
                case at.o /*3*/:
                    i = 3;
                    break;
                default:
                    i = 69;
                    break;
            }
            cArr[length] = (char) (i ^ c);
        }
        strArr[1] = new String(cArr).intern();
        z = strArr;
        a = new eV(Collections.emptyMap());
        b = new gb();
    }

    public c6 c() {
        return g().a(this);
    }

    static Map a(eV eVVar) {
        return eVVar.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof eV) {
                if (this.c.equals(((eV) obj).c)) {
                    return true;
                }
            }
            return false;
        } catch (RuntimeException e) {
            throw e;
        } catch (RuntimeException e2) {
            throw e2;
        }
    }

    private eV() {
    }

    private eV(Map map) {
        this.c = map;
    }

    public static c6 b(eV eVVar) {
        return g().a(eVVar);
    }

    public Map m122a() {
        return this.c;
    }

    public c6 d() {
        return g();
    }

    public static eV h() {
        return a;
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public String toString() {
        return eS.a(this);
    }

    public il newBuilderForType() {
        return d();
    }

    public static c6 g() {
        return c6.b();
    }

    public eV b() {
        return a;
    }

    public T getParserForType() {
        return e();
    }

    public int f() {
        boolean z = bA.b;
        int i = 0;
        for (Entry entry : this.c.entrySet()) {
            int a = ((b7) entry.getValue()).a(((Integer) entry.getKey()).intValue()) + i;
            if (z) {
                return a;
            }
            i = a;
        }
        return i;
    }
}
