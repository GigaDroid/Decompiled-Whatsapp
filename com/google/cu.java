package com.google;

import org.v;
import org.whispersystems.at;

public abstract class cu extends cV implements fT {
    private static final String z;
    private final iI b;

    static {
        char[] toCharArray = ".{*j\u000f\u001fk7|A\tz,w\u000f\u0013`c\u007f@\b3\"9K\u0013u%|]\u001f}79B\u001f`0xH\u001f37`_\u001f=c9\u007f\u0016v\"jJZ~\"rJZ`6kJZg+x[Zj,l\u000f\u001ba&9A\u0015gcjZ\nc1|\\\tz-~\u000f\u001b}:9H\u001f}&kF\u0019`cmV\nvcnN\b}*wH\t=".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 122;
                    break;
                case at.g /*1*/:
                    i2 = 19;
                    break;
                case at.i /*2*/:
                    i2 = 67;
                    break;
                case at.o /*3*/:
                    i2 = 25;
                    break;
                default:
                    i2 = 47;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    private void b(fE fEVar) {
        try {
            if (fEVar.a() != getDefaultInstanceForType()) {
                throw new IllegalArgumentException(z);
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public final Object a(fE fEVar, int i) {
        b(fEVar);
        return this.b.a(fE.a(fEVar), i);
    }

    public final Object d(fE fEVar) {
        b(fEVar);
        Object c = this.b.c(fE.a(fEVar));
        if (c == null) {
            try {
                c = fE.c(fEVar);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        return c;
    }

    protected int c() {
        return this.b.b();
    }

    protected boolean e() {
        return this.b.h();
    }

    protected int b() {
        return this.b.a();
    }

    static iI a(cu cuVar) {
        return cuVar.b;
    }

    protected aD a() {
        return new aD(this, true, null);
    }

    protected boolean a(ad adVar, h hVar, int i) {
        return cV.b(this.b, getDefaultInstanceForType(), adVar, hVar, i);
    }

    protected cu() {
        this.b = iI.g();
    }

    protected void m114a() {
        this.b.e();
    }

    public final boolean c(fE fEVar) {
        b(fEVar);
        return this.b.b(fE.a(fEVar));
    }

    public final int a(fE fEVar) {
        b(fEVar);
        return this.b.a(fE.a(fEVar));
    }

    protected aD d() {
        return new aD(this, false, null);
    }

    protected cu(cv cvVar) {
        this.b = cv.a(cvVar);
    }
}
