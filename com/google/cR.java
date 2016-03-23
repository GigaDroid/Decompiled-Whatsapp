package com.google;

import org.v;
import org.whispersystems.at;

public abstract class cR extends ch {
    private static final String z;

    static {
        char[] toCharArray = "*1R\u000f]\u0017*\u001b\u000f\b\u000e)T\u000f\u0018\u001ayO\u0013]\u001c<\u001b\u0013\u000b\u001b+I\u0015\u0019\u001a<U\\\u001f\u0007yH\t\u001f\u001d5Z\u000f\u000e\u001b*\u0015".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 126;
                    break;
                case at.g /*1*/:
                    i2 = 89;
                    break;
                case at.i /*2*/:
                    i2 = 59;
                    break;
                case at.o /*3*/:
                    i2 = 124;
                    break;
                default:
                    i2 = 125;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    protected cR() {
    }

    public abstract cR a(cV cVVar);

    public abstract cV a();

    public cR b() {
        throw new UnsupportedOperationException(z);
    }

    public fO getDefaultInstanceForType() {
        return a();
    }

    public ch clone() {
        return b();
    }

    public Object m403clone() {
        return b();
    }
}
