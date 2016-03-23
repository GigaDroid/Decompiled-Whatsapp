package com.google;

import java.util.Map;
import org.v;
import org.whispersystems.at;

public final class cc extends c3 {
    private static final String[] z;
    private iI a;
    private eV b;
    private final fn c;

    static {
        int i;
        int i2;
        String[] strArr = new String[3];
        char[] toCharArray = "5`i3z\u001ewt97\u0015`h'~?`2t|9k;;q4|;9z*b~tr=vh5x=v;;yxqs1?+dv1?,|k11".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 88;
                    break;
                case at.g /*1*/:
                    i2 = 5;
                    break;
                case at.i /*2*/:
                    i2 = 27;
                    break;
                case at.o /*3*/:
                    i2 = 84;
                    break;
                default:
                    i2 = 31;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "\u001el~8{\u001c`h7m1uo;mxat1lxkt ?5do7wxh~'l9b~tk!u~z".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 88;
                    break;
                case at.g /*1*/:
                    i2 = 5;
                    break;
                case at.i /*2*/:
                    i2 = 27;
                    break;
                case at.o /*3*/:
                    i2 = 84;
                    break;
                default:
                    i2 = 31;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = "6`l\u0016j1i\u007f1m\u001eji\u0012v=i\u007ftv+%t:s!%m5s1a;2p*%}=z4ahth1qstr=vh5x=%o-o=+".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case v.m /*0*/:
                    i2 = 88;
                    break;
                case at.g /*1*/:
                    i2 = 5;
                    break;
                case at.i /*2*/:
                    i2 = 27;
                    break;
                case at.o /*3*/:
                    i2 = 84;
                    break;
                default:
                    i2 = 31;
                    break;
            }
            cArr[length] = (char) (i2 ^ c);
        }
        strArr[2] = new String(cArr).intern();
        z = strArr;
    }

    private cc(fn fnVar) {
        this.c = fnVar;
        this.a = iI.g();
        this.b = eV.h();
    }

    public cc e() {
        cc ccVar = new cc(this.c);
        ccVar.a.a(this.a);
        ccVar.a(this.b);
        return ccVar;
    }

    public bb c() {
        this.a.e();
        return new bb(this.c, this.a, this.b, null);
    }

    public fn getDescriptorForType() {
        return this.c;
    }

    public fl m215mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    public c3 mergeFrom(ci ciVar) {
        return a(ciVar);
    }

    public fl m205a(eV eVVar) {
        return b(eVVar);
    }

    public fl m203a(e0 e0Var) {
        return a(e0Var);
    }

    cc(fn fnVar, gs gsVar) {
        this(fnVar);
    }

    public ci buildPartial() {
        return c();
    }

    public cc b(e0 e0Var, Object obj) {
        b(e0Var);
        a();
        this.a.a((dH) e0Var, obj);
        return this;
    }

    private void b(e0 e0Var) {
        try {
            if (e0Var.f() != this.c) {
                throw new IllegalArgumentException(z[1]);
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public bb b() {
        try {
            if (isInitialized()) {
                return c();
            }
            throw a(new bb(this.c, this.a, this.b, null));
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public c3 a(eV eVVar) {
        return a(eVVar);
    }

    public boolean isInitialized() {
        return bb.b(this.c, this.a);
    }

    public ch m212clone() {
        return e();
    }

    public fO m214getDefaultInstanceForType() {
        return d();
    }

    public boolean m209b(e0 e0Var) {
        b(e0Var);
        return this.a.b((dH) e0Var);
    }

    private void a() {
        try {
            if (this.a.f()) {
                this.a = this.a.c();
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public Map m207a() {
        return this.a.i();
    }

    public fO m210build() {
        return b();
    }

    public Object m206a(e0 e0Var) {
        b(e0Var);
        Object c = this.a.c((dH) e0Var);
        if (c != null) {
            return c;
        }
        try {
            if (e0Var.h() == fD.MESSAGE) {
                c = bb.b(e0Var.d());
                if (!bA.b) {
                    return c;
                }
            }
            return e0Var.c();
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public ci build() {
        return b();
    }

    public ci getDefaultInstanceForType() {
        return d();
    }

    public cc a(e0 e0Var) {
        try {
            b(e0Var);
            if (e0Var.h() == fD.MESSAGE) {
                return new cc(e0Var.d());
            }
            throw new IllegalArgumentException(z[2]);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public cc a(e0 e0Var, Object obj) {
        b(e0Var);
        a();
        this.a.b((dH) e0Var, obj);
        return this;
    }

    public fl m208b(e0 e0Var, Object obj) {
        return a(e0Var, obj);
    }

    public bb d() {
        return bb.b(this.c);
    }

    public cc b(eV eVVar) {
        this.b = eVVar;
        return this;
    }

    public eV getUnknownFields() {
        return this.b;
    }

    public fl m204a(e0 e0Var, Object obj) {
        return b(e0Var, obj);
    }

    public Object m213clone() {
        return e();
    }

    public cc m202a(eV eVVar) {
        this.b = eV.b(this.b).a(eVVar).d();
        return this;
    }

    public cc a(ci ciVar) {
        if (!(ciVar instanceof bb)) {
            return (cc) super.mergeFrom(ciVar);
        }
        bb bbVar = (bb) ciVar;
        try {
            if (bb.b(bbVar) != this.c) {
                throw new IllegalArgumentException(z[0]);
            }
            a();
            this.a.a(bb.c(bbVar));
            a(bb.a(bbVar));
            return this;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public fO m211buildPartial() {
        return c();
    }

    public c3 clone() {
        return e();
    }
}
