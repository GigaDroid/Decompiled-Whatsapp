package com.google;

import com.whatsapp.arj;
import java.lang.reflect.Method;
import org.v;
import org.whispersystems.at;

final class hR extends hL {
    private static final String z;
    private final Method k;

    static {
        char[] toCharArray = "\nk\u0014%>\rb\u0007\u00029".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 100;
                    break;
                case at.g /*1*/:
                    i2 = 14;
                    break;
                case at.i /*2*/:
                    i2 = 99;
                    break;
                case at.o /*3*/:
                    i2 = arj.Theme_checkedTextViewStyle;
                    break;
                default:
                    i2 = 75;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void a(cJ cJVar, Object obj) {
        super.a(cJVar, a(obj));
    }

    public fl a() {
        return (fl) bL.b(this.k, null, new Object[0]);
    }

    private Object a(Object obj) {
        if (this.b.isInstance(obj)) {
            return obj;
        }
        return ((fl) bL.b(this.k, null, new Object[0])).mergeFrom((ci) obj).build();
    }

    hR(e0 e0Var, String str, Class cls, Class cls2) {
        super(e0Var, str, cls, cls2);
        this.k = bL.a(this.b, z, new Class[0]);
    }
}
