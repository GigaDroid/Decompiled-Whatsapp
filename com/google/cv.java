package com.google;

import org.v;
import org.whispersystems.at;

public abstract class cv extends cR implements fT {
    private static final String z;
    private iI a;
    private boolean b;

    static {
        char[] toCharArray = "\u007fA\u0014;|BZ];)[Y\u0012;9O\t\t'|IL]'*N[\u000f!8OL\u0013h>R\t\u000e=>HE\u001c;/NZS".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 43;
                    break;
                case at.g /*1*/:
                    i2 = 41;
                    break;
                case at.i /*2*/:
                    i2 = 125;
                    break;
                case at.o /*3*/:
                    i2 = 72;
                    break;
                default:
                    i2 = 92;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public cR m417b() {
        return a();
    }

    protected cv() {
        this.a = iI.d();
    }

    static iI a(cv cvVar) {
        return cvVar.b();
    }

    public cv a() {
        throw new UnsupportedOperationException(z);
    }

    private iI b() {
        this.a.e();
        this.b = false;
        return this.a;
    }

    public ch clone() {
        return a();
    }

    public Object m418clone() {
        return a();
    }
}
