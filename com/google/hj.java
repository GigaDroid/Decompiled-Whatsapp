package com.google;

import java.lang.reflect.Method;
import org.v;
import org.whispersystems.at;

final class hj extends hd {
    private static final String[] z;
    private Method h;
    private Method i;

    static {
        String[] strArr = new String[2];
        char[] toCharArray = "79\u000b&)<)\u001a4-#?\r\u00198$3\r".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 80;
                    break;
                case at.g /*1*/:
                    i2 = 92;
                    break;
                case at.i /*2*/:
                    i2 = 127;
                    break;
                case at.o /*3*/:
                    i2 = 112;
                    break;
                default:
                    i2 = 72;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "&=\u0013\u0005-\u001f:".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case v.m /*0*/:
                    i2 = 80;
                    break;
                case at.g /*1*/:
                    i2 = 92;
                    break;
                case at.i /*2*/:
                    i2 = 127;
                    break;
                case at.o /*3*/:
                    i2 = 112;
                    break;
                default:
                    i2 = 72;
                    break;
            }
            cArr[length] = (char) (i2 ^ c);
        }
        strArr[1] = new String(cArr).intern();
        z = strArr;
    }

    hj(e0 e0Var, String str, Class cls, Class cls2) {
        super(e0Var, str, cls, cls2);
        this.i = bL.a(this.e, z[1], new Class[]{fG.class});
        this.h = bL.a(this.e, z[0], new Class[0]);
    }

    public void b(cJ cJVar, Object obj) {
        super.b(cJVar, bL.b(this.i, null, new Object[]{obj}));
    }

    public Object b(bL bLVar) {
        return bL.b(this.h, super.b(bLVar), new Object[0]);
    }

    public Object b(cJ cJVar) {
        return bL.b(this.h, super.b(cJVar), new Object[0]);
    }
}
