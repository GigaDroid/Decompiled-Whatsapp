package com.google;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import org.v;
import org.whispersystems.at;

public final class gL {
    private static final String[] z;
    private final ci a;
    private final Class b;
    private fX c;
    private final Method d;
    private final Method e;

    static {
        int i;
        int i2;
        String[] strArr = new String[4];
        char[] toCharArray = "%:p\tM1<v$X60ve\u0001b<e!D';$/M$0v(\b+1p(Z,>h\u0004F++,d".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 66;
                    break;
                case at.g /*1*/:
                    i2 = 95;
                    break;
                case at.i /*2*/:
                    i2 = 4;
                    break;
                case at.o /*3*/:
                    i2 = 77;
                    break;
                default:
                    i2 = 40;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "4>h8M\r9".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 66;
                    break;
                case at.g /*1*/:
                    i2 = 95;
                    break;
                case at.i /*2*/:
                    i2 = 4;
                    break;
                case at.o /*3*/:
                    i2 = 77;
                    break;
                default:
                    i2 = 40;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = "\u0000>`mE',w,O'\u001ba+I73p\u0004F1+e#K'\u007fb\"Zb".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 66;
                    break;
                case at.g /*1*/:
                    i2 = 95;
                    break;
                case at.i /*2*/:
                    i2 = 4;
                    break;
                case at.o /*3*/:
                    i2 = 77;
                    break;
                default:
                    i2 = 40;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[2] = new String(cArr).intern();
        toCharArray = "%:p\u001bI.*a\tM1<v$X60v".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case v.m /*0*/:
                    i2 = 66;
                    break;
                case at.g /*1*/:
                    i2 = 95;
                    break;
                case at.i /*2*/:
                    i2 = 4;
                    break;
                case at.o /*3*/:
                    i2 = 77;
                    break;
                default:
                    i2 = 40;
                    break;
            }
            cArr[length] = (char) (i2 ^ c);
        }
        strArr[3] = new String(cArr).intern();
        z = strArr;
    }

    gL(fX fXVar, Class cls, ci ciVar, er erVar) {
        this(fXVar, cls, ciVar);
    }

    public ci b() {
        return this.a;
    }

    private gL(fX fXVar, Class cls, ci ciVar) {
        if (ci.class.isAssignableFrom(cls)) {
            try {
                if (!cls.isInstance(ciVar)) {
                    throw new IllegalArgumentException(z[2] + cls.getName());
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        try {
            this.c = fXVar;
            this.b = cls;
            this.a = ciVar;
            if (ij.class.isAssignableFrom(cls)) {
                this.e = bL.a(cls, z[1], new Class[]{fG.class});
                this.d = bL.a(cls, z[3], new Class[0]);
                if (!bA.b) {
                    return;
                }
            }
            this.e = null;
            this.d = null;
        } catch (IllegalArgumentException e2) {
            throw e2;
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    static Object a(gL gLVar, Object obj) {
        return gLVar.b(obj);
    }

    private Object a(Object obj) {
        boolean z = bA.b;
        e0 a = a();
        try {
            if (!a.c()) {
                return b(obj);
            }
            if (a.h() != fD.MESSAGE && a.h() != fD.ENUM) {
                return obj;
            }
            List arrayList = new ArrayList();
            for (Object b : (List) obj) {
                arrayList.add(b(b));
                if (z) {
                    break;
                }
            }
            return arrayList;
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public e0 a() {
        try {
            if (this.c != null) {
                return this.c.a();
            }
            throw new IllegalStateException(z[0]);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    private Object b(Object obj) {
        try {
            switch (h7.a[a().h().ordinal()]) {
                case at.g /*1*/:
                    if (this.b.isInstance(obj)) {
                        return obj;
                    }
                    return this.a.newBuilderForType().mergeFrom((ci) obj).build();
                case at.i /*2*/:
                    return bL.b(this.e, null, new Object[]{(fG) obj});
                default:
                    return obj;
            }
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
        throw e2;
    }

    static Object b(gL gLVar, Object obj) {
        return gLVar.a(obj);
    }
}
