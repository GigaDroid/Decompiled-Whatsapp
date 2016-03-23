package com.google;

import java.lang.reflect.Method;
import org.v;
import org.whispersystems.at;

final class hF extends hd {
    private static final String[] z;
    private final Method h;
    private final Method i;

    static {
        int i;
        String[] strArr = new String[3];
        char[] toCharArray = "z+%\"\u0016}\"6\u0005\u0011".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 20;
                    break;
                case at.g /*1*/:
                    i2 = 78;
                    break;
                case at.i /*2*/:
                    i2 = 82;
                    break;
                case at.o /*3*/:
                    i2 = 96;
                    break;
                default:
                    i2 = 99;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "s+&".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 20;
                    break;
                case at.g /*1*/:
                    i2 = 78;
                    break;
                case at.i /*2*/:
                    i2 = 82;
                    break;
                case at.o /*3*/:
                    i2 = 96;
                    break;
                default:
                    i2 = 99;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = "V;;\f\u0007q<".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case v.m /*0*/:
                    i2 = 20;
                    break;
                case at.g /*1*/:
                    i2 = 78;
                    break;
                case at.i /*2*/:
                    i2 = 82;
                    break;
                case at.o /*3*/:
                    i2 = 96;
                    break;
                default:
                    i2 = 99;
                    break;
            }
            cArr[length] = (char) (i2 ^ c);
        }
        strArr[2] = new String(cArr).intern();
        z = strArr;
    }

    public void b(cJ cJVar, Object obj) {
        super.b(cJVar, a(obj));
    }

    hF(e0 e0Var, String str, Class cls, Class cls2) {
        super(e0Var, str, cls, cls2);
        this.h = bL.a(this.e, z[0], new Class[0]);
        this.i = bL.a(cls2, z[1] + str + z[2], new Class[0]);
    }

    public fl a() {
        return (fl) bL.b(this.h, null, new Object[0]);
    }

    private Object a(Object obj) {
        return this.e.isInstance(obj) ? obj : ((fl) bL.b(this.h, null, new Object[0])).mergeFrom((ci) obj).buildPartial();
    }
}
