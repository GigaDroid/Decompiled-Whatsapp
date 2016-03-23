package com.google;

import org.v;
import org.whispersystems.at;

final class as extends aX {
    private static final String[] z;

    static {
        int i;
        String[] strArr = new String[2];
        char[] toCharArray = "sa\u000b\u0018\u0016:.9W\u00102a?\u0012\u0003429\u0012\u0016} m\u0003\u001d-$m\u0016\u0000<19\u0012\u0016b".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i2 = 0; length > i2; i2++) {
            char c = cArr[i2];
            switch (i2 % 5) {
                case v.m /*0*/:
                    i = 93;
                    break;
                case at.g /*1*/:
                    i = 65;
                    break;
                case at.i /*2*/:
                    i = 77;
                    break;
                case at.o /*3*/:
                    i = 119;
                    break;
                default:
                    i = 100;
                    break;
            }
            cArr[i2] = (char) (i ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "\u001c59\u0012\t-5(\u0013D).m\u0004\u0001/(,\u001b\r'$m\u001d\u0005+ c\u001b\u00053&c4\b<2>MD".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case v.m /*0*/:
                    i = 93;
                    break;
                case at.g /*1*/:
                    i = 65;
                    break;
                case at.i /*2*/:
                    i = 77;
                    break;
                case at.o /*3*/:
                    i = 119;
                    break;
                default:
                    i = 100;
                    break;
            }
            cArr[length] = (char) (i ^ c);
        }
        strArr[1] = new String(cArr).intern();
        z = strArr;
    }

    public void a(eE eEVar, Class cls) {
        if (cls == null) {
            try {
                eEVar.b();
                if (bG.l == 0) {
                    return;
                }
            } catch (UnsupportedOperationException e) {
                throw e;
            }
        }
        throw new UnsupportedOperationException(z[1] + cls.getName() + z[0]);
    }

    as() {
    }

    public void a(eE eEVar, Object obj) {
        a(eEVar, (Class) obj);
    }
}
