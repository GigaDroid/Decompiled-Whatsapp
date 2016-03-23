package com.google;

import com.whatsapp.arj;
import java.util.Collections;
import java.util.Map;
import org.v;
import org.whispersystems.at;

public abstract class c8 extends bL implements cT {
    private static final String[] z;
    private final iI e;

    static {
        int i;
        String[] strArr = new String[4];
        char[] toCharArray = "\u001b]8%\u0002\u0019Q.*\u00144D)&\u0014}P2,\u0015}Z2=F0U)*\u000e}Y8:\u0015<S8i\u0012$D8g".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 93;
                    break;
                case at.g /*1*/:
                    i2 = 52;
                    break;
                case at.i /*2*/:
                    i2 = 93;
                    break;
                case at.o /*3*/:
                    i2 = 73;
                    break;
                default:
                    i2 = arj.Theme_checkboxStyle;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "\u0018L),\b.]2'F4G}/\t/\u0014)0\u00168\u0014\u007f".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 93;
                    break;
                case at.g /*1*/:
                    i2 = 52;
                    break;
                case at.i /*2*/:
                    i2 = 93;
                    break;
                case at.o /*3*/:
                    i2 = 73;
                    break;
                default:
                    i2 = arj.Theme_checkboxStyle;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = "\u007f\u001a".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 93;
                    break;
                case at.g /*1*/:
                    i2 = 52;
                    break;
                case at.i /*2*/:
                    i2 = 93;
                    break;
                case at.o /*3*/:
                    i2 = 73;
                    break;
                default:
                    i2 = arj.Theme_checkboxStyle;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[2] = new String(cArr).intern();
        toCharArray = "\u007f\u0014*!\u000f>\\}-\t8G}'\t)\u00140(\u0012>\\}$\u0003.G<.\u0003}@$9\u0003}\u0016".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case v.m /*0*/:
                    i2 = 93;
                    break;
                case at.g /*1*/:
                    i2 = 52;
                    break;
                case at.i /*2*/:
                    i2 = 93;
                    break;
                case at.o /*3*/:
                    i2 = 73;
                    break;
                default:
                    i2 = arj.Theme_checkboxStyle;
                    break;
            }
            cArr[length] = (char) (i2 ^ c);
        }
        strArr[3] = new String(cArr).intern();
        z = strArr;
    }

    public int m326a(e0 e0Var) {
        try {
            if (!e0Var.m()) {
                return super.a(e0Var);
            }
            a(e0Var);
            return this.e.a((dH) e0Var);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    static iI a(c8 c8Var) {
        return c8Var.e;
    }

    public Map m328a() {
        Map a = bL.a((bL) this);
        a.putAll(d());
        return Collections.unmodifiableMap(a);
    }

    public Object a(e0 e0Var, int i) {
        try {
            if (!e0Var.m()) {
                return super.a(e0Var, i);
            }
            a(e0Var);
            return this.e.a((dH) e0Var, i);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    protected int a() {
        return this.e.a();
    }

    public Object m327a(e0 e0Var) {
        if (!e0Var.m()) {
            return super.a(e0Var);
        }
        a(e0Var);
        Object c = this.e.c((dH) e0Var);
        if (c != null) {
            return c;
        }
        try {
            if (e0Var.h() == fD.MESSAGE) {
                return bb.b(e0Var.d());
            }
            return e0Var.c();
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    protected Map d() {
        return this.e.i();
    }

    protected f2 c() {
        return new f2(this, true, null);
    }

    protected f2 e() {
        return new f2(this, false, null);
    }

    protected boolean a(ad adVar, c6 c6Var, h hVar, int i) {
        return c3.a(adVar, c6Var, hVar, getDescriptorForType(), null, this.e, i);
    }

    protected c8() {
        this.e = iI.g();
    }

    protected int b() {
        return this.e.b();
    }

    public final Object a(gL gLVar) {
        d(gLVar);
        dH a = gLVar.a();
        Object c = this.e.c(a);
        if (c != null) {
            return gL.b(gLVar, c);
        }
        try {
            if (a.c()) {
                return Collections.emptyList();
            }
            try {
                if (a.h() == fD.MESSAGE) {
                    return gLVar.b();
                }
                return gL.b(gLVar, a.c());
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    protected boolean f() {
        return this.e.h();
    }

    public final int c(gL gLVar) {
        d(gLVar);
        return this.e.a(gLVar.a());
    }

    private void a(e0 e0Var) {
        try {
            if (e0Var.f() != getDescriptorForType()) {
                throw new IllegalArgumentException(z[0]);
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    protected void m329b() {
        this.e.e();
    }

    public boolean b(e0 e0Var) {
        try {
            if (!e0Var.m()) {
                return super.b(e0Var);
            }
            a(e0Var);
            return this.e.b((dH) e0Var);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    protected c8(c_ c_Var) {
        super(c_Var);
        this.e = c_.a(c_Var);
    }

    public final Object a(gL gLVar, int i) {
        d(gLVar);
        return gL.a(gLVar, this.e.a(gLVar.a(), i));
    }

    private void d(gL gLVar) {
        try {
            if (gLVar.a().f() != getDescriptorForType()) {
                throw new IllegalArgumentException(z[1] + gLVar.a().f().a() + z[3] + getDescriptorForType().a() + z[2]);
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public final boolean b(gL gLVar) {
        d(gLVar);
        return this.e.b(gLVar.a());
    }

    public boolean isInitialized() {
        try {
            if (super.isInitialized()) {
                if (f()) {
                    return true;
                }
            }
            return false;
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }
}
