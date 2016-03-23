package com.google;

import org.v;
import org.whispersystems.at;

public class fc extends Exception {
    private static final long serialVersionUID = 5750205775490483148L;
    private static final String[] z;
    private final String a;
    private final ci b;
    private final String c;

    static {
        String[] strArr = new String[2];
        char[] toCharArray = "\f2".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 54;
                    break;
                case at.g /*1*/:
                    i2 = 18;
                    break;
                case at.i /*2*/:
                    i2 = 19;
                    break;
                case at.o /*3*/:
                    i2 = 125;
                    break;
                default:
                    i2 = 33;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "\f2".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case v.m /*0*/:
                    i2 = 54;
                    break;
                case at.g /*1*/:
                    i2 = 18;
                    break;
                case at.i /*2*/:
                    i2 = 19;
                    break;
                case at.o /*3*/:
                    i2 = 125;
                    break;
                default:
                    i2 = 33;
                    break;
            }
            cArr[length] = (char) (i2 ^ c);
        }
        strArr[1] = new String(cArr).intern();
        z = strArr;
    }

    public String c() {
        return this.a;
    }

    fc(hh hhVar, String str, ev evVar) {
        this(hhVar, str);
    }

    fc(gj gjVar, String str, ev evVar) {
        this(gjVar, str);
    }

    fc(gj gjVar, String str, Throwable th, ev evVar) {
        this(gjVar, str, th);
    }

    private fc(gj gjVar, String str, Throwable th) {
        this(gjVar, str);
        initCause(th);
    }

    private fc(gj gjVar, String str) {
        super(gjVar.a() + z[1] + str);
        this.a = gjVar.a();
        this.b = gjVar.b();
        this.c = str;
    }

    public ci b() {
        return this.b;
    }

    public String a() {
        return this.c;
    }

    private fc(hh hhVar, String str) {
        super(hhVar.e() + z[0] + str);
        this.a = hhVar.e();
        this.b = hhVar.f();
        this.c = str;
    }
}
