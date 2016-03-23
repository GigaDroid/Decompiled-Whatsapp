package org.whispersystems;

import com.whatsapp.arj;
import org.v;

public class aS {
    private static final String z;
    private final o a;
    private final E b;
    private final bp c;
    private final k d;
    private final e e;
    private final E f;

    static {
        char[] toCharArray = "\"n~c3\u001az~zv\u001f:".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_spinnerStyle;
                    break;
                case at.g /*1*/:
                    i2 = 27;
                    break;
                case at.i /*2*/:
                    i2 = 18;
                    break;
                case at.o /*3*/:
                    i2 = 15;
                    break;
                default:
                    i2 = 19;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public E e() {
        return this.b;
    }

    private aS(k kVar, e eVar, bp bpVar, E e, E e2, o oVar) {
        this.d = kVar;
        this.e = eVar;
        this.c = bpVar;
        this.f = e;
        this.b = e2;
        this.a = oVar;
        if (kVar == null || eVar == null || bpVar == null || e == null || e2 == null || oVar == null) {
            try {
                throw new IllegalArgumentException(z);
            } catch (IllegalArgumentException e3) {
                throw e3;
            }
        }
    }

    public k b() {
        return this.d;
    }

    aS(k kVar, e eVar, bp bpVar, E e, E e2, o oVar, aD aDVar) {
        this(kVar, eVar, bpVar, e, e2, oVar);
    }

    public E d() {
        return this.f;
    }

    public static bz c() {
        return new bz();
    }

    public o a() {
        return this.a;
    }

    public bp f() {
        return this.c;
    }

    public e g() {
        return this.e;
    }
}
