package com.google;

import java.util.Collections;
import java.util.Map;
import org.v;
import org.whispersystems.at;

public final class bb extends bA {
    private static final String z;
    private final fn d;
    private int e;
    private final iI f;
    private final eV g;

    static {
        char[] toCharArray = "TsL\u001b\u0015V\u007fZ\u0014\u0003{j]\u0018\u00032~F\u0012\u00022tF\u0003Q\u007f{]\u0014\u00192wL\u0004\u0002s}LW\u0005kjLY".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 18;
                    break;
                case at.g /*1*/:
                    i2 = 26;
                    break;
                case at.i /*2*/:
                    i2 = 41;
                    break;
                case at.o /*3*/:
                    i2 = 119;
                    break;
                default:
                    i2 = 113;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    static iI c(bb bbVar) {
        return bbVar.f;
    }

    private bb(fn fnVar, iI iIVar, eV eVVar) {
        this.e = -1;
        this.d = fnVar;
        this.f = iIVar;
        this.g = eVVar;
    }

    public cc a() {
        return new cc(this.d, null);
    }

    bb(fn fnVar, iI iIVar, eV eVVar, gs gsVar) {
        this(fnVar, iIVar, eVVar);
    }

    private static boolean a(fn fnVar, iI iIVar) {
        boolean z = bA.b;
        for (dH dHVar : fnVar.b()) {
            try {
                if (dHVar.n()) {
                    if (!iIVar.b(dHVar)) {
                        return false;
                    }
                }
                if (z) {
                    break;
                }
            } catch (IllegalArgumentException e) {
                throw e;
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }
        return iIVar.h();
    }

    public fl newBuilderForType() {
        return a();
    }

    public fl toBuilder() {
        return c();
    }

    public Map m187a() {
        return this.f.i();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getSerializedSize() {
        /*
        r2 = this;
        r0 = r2.e;
        r1 = -1;
        if (r0 == r1) goto L_0x0006;
    L_0x0005:
        return r0;
    L_0x0006:
        r0 = r2.d;
        r0 = r0.f();
        r0 = r0.i();
        if (r0 == 0) goto L_0x0023;
    L_0x0012:
        r0 = r2.f;
        r0 = r0.b();
        r1 = r2.g;
        r1 = r1.f();
        r0 = r0 + r1;
        r1 = com.google.bA.b;
        if (r1 == 0) goto L_0x0030;
    L_0x0023:
        r0 = r2.f;
        r0 = r0.a();
        r1 = r2.g;
        r1 = r1.getSerializedSize();
        r0 = r0 + r1;
    L_0x0030:
        r2.e = r0;
        goto L_0x0005;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.bb.getSerializedSize():int");
    }

    public static cc a(fn fnVar) {
        return new cc(fnVar, null);
    }

    public boolean isInitialized() {
        return a(this.d, this.f);
    }

    public eV getUnknownFields() {
        return this.g;
    }

    public T getParserForType() {
        return new gs(this);
    }

    public bb b() {
        return b(this.d);
    }

    public cc c() {
        return a().a((ci) this);
    }

    public il m190toBuilder() {
        return c();
    }

    public fn getDescriptorForType() {
        return this.d;
    }

    static boolean b(fn fnVar, iI iIVar) {
        return a(fnVar, iIVar);
    }

    private void a(e0 e0Var) {
        try {
            if (e0Var.f() != this.d) {
                throw new IllegalArgumentException(z);
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public Object m186a(e0 e0Var) {
        boolean z = bA.b;
        a(e0Var);
        Object c = this.f.c((dH) e0Var);
        if (c != null) {
            return c;
        }
        try {
            if (e0Var.c()) {
                c = Collections.emptyList();
                if (!z) {
                    return c;
                }
            }
            try {
                if (e0Var.h() == fD.MESSAGE) {
                    c = b(e0Var.d());
                    if (!z) {
                        return c;
                    }
                }
                return e0Var.c();
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public fO m188getDefaultInstanceForType() {
        return b();
    }

    public il m189newBuilderForType() {
        return a();
    }

    public ci getDefaultInstanceForType() {
        return b();
    }

    public boolean b(e0 e0Var) {
        a(e0Var);
        return this.f.b((dH) e0Var);
    }

    public static bb b(fn fnVar) {
        return new bb(fnVar, iI.d(), eV.h());
    }

    public void writeTo(eb ebVar) {
        try {
            if (this.d.f().i()) {
                this.f.b(ebVar);
                this.g.a(ebVar);
                if (!bA.b) {
                    return;
                }
            }
            this.f.a(ebVar);
            this.g.writeTo(ebVar);
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    static eV a(bb bbVar) {
        return bbVar.g;
    }

    static fn b(bb bbVar) {
        return bbVar.d;
    }
}
