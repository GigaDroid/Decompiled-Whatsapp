package org.whispersystems;

import com.whatsapp.arj;
import org.v;

public class d {
    private static final String z;
    private final bp a;
    private final e b;
    private final e c;
    private final o d;
    private final k e;
    private final E f;

    static {
        char[] toCharArray = "( <]r\u00104<D7G".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_checkboxStyle;
                    break;
                case at.g /*1*/:
                    i2 = 85;
                    break;
                case at.i /*2*/:
                    i2 = 80;
                    break;
                case at.o /*3*/:
                    i2 = 49;
                    break;
                default:
                    i2 = 82;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public k e() {
        return this.e;
    }

    public o f() {
        return this.d;
    }

    public static ae b() {
        return new ae();
    }

    public E c() {
        return this.f;
    }

    public e d() {
        return this.b;
    }

    public bp g() {
        return this.a;
    }

    public e a() {
        return this.c;
    }

    d(k kVar, e eVar, e eVar2, o oVar, bp bpVar, E e) {
        this.e = kVar;
        this.c = eVar;
        this.b = eVar2;
        this.d = oVar;
        this.a = bpVar;
        this.f = e;
        if (kVar == null || eVar == null || eVar2 == null || oVar == null || bpVar == null || e == null) {
            try {
                throw new IllegalArgumentException(z);
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }
    }
}
