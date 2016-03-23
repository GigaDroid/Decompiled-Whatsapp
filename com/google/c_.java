package com.google;

import java.util.Collections;
import java.util.Map;
import org.v;
import org.whispersystems.at;

public abstract class c_ extends cJ implements cT {
    private static final String[] z;
    private iI e;

    static {
        String[] strArr = new String[2];
        char[] toCharArray = "\u0015\fUD_(\u0017\u001cD\n1\u0014SD\u001a%DHX_#\u0001\u001cX\t$\u0016N^\u001b%\u0001R\u0017\u001d8DOB\u001d\"\b]D\f$\u0017\u0012".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 65;
                    break;
                case at.g /*1*/:
                    i2 = 100;
                    break;
                case at.i /*2*/:
                    i2 = 60;
                    break;
                case at.o /*3*/:
                    i2 = 55;
                    break;
                default:
                    i2 = 127;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "\u0007\rY[\u001b\u0005\u0001OT\r(\u0014HX\ra\u0000SR\fa\nSC_,\u0005HT\u0017a\tYD\f \u0003Y\u0017\u000b8\u0014Y\u0019".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case v.m /*0*/:
                    i2 = 65;
                    break;
                case at.g /*1*/:
                    i2 = 100;
                    break;
                case at.i /*2*/:
                    i2 = 60;
                    break;
                case at.o /*3*/:
                    i2 = 55;
                    break;
                default:
                    i2 = 127;
                    break;
            }
            cArr[length] = (char) (i2 ^ c);
        }
        strArr[1] = new String(cArr).intern();
        z = strArr;
    }

    protected boolean d() {
        return this.e.h();
    }

    public cJ b(e0 e0Var, Object obj) {
        return a(e0Var, obj);
    }

    public c_ m333a(e0 e0Var, Object obj) {
        try {
            if (!e0Var.m()) {
                return (c_) super.b(e0Var, obj);
            }
            a(e0Var);
            a();
            this.e.b((dH) e0Var, obj);
            g();
            return this;
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    public ch m340clone() {
        return b();
    }

    public c_ b() {
        throw new UnsupportedOperationException(z[0]);
    }

    public c_ m337b(e0 e0Var, Object obj) {
        try {
            if (!e0Var.m()) {
                return (c_) super.a(e0Var, obj);
            }
            a(e0Var);
            a();
            this.e.a((dH) e0Var, obj);
            g();
            return this;
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    private iI c() {
        this.e.e();
        return this.e;
    }

    public cJ a(e0 e0Var, Object obj) {
        return b(e0Var, obj);
    }

    private void a(e0 e0Var) {
        try {
            if (e0Var.f() != getDescriptorForType()) {
                throw new IllegalArgumentException(z[1]);
            }
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    protected c_(ec ecVar) {
        super(ecVar);
        this.e = iI.d();
    }

    static iI a(c_ c_Var) {
        return c_Var.c();
    }

    protected c_() {
        this.e = iI.d();
    }

    protected final void a(c8 c8Var) {
        a();
        this.e.a(c8.a(c8Var));
        g();
    }

    private void a() {
        try {
            if (this.e.f()) {
                this.e = this.e.c();
            }
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    public Object m335a(e0 e0Var) {
        if (!e0Var.m()) {
            return super.a(e0Var);
        }
        a(e0Var);
        Object c = this.e.c((dH) e0Var);
        if (c != null) {
            return c;
        }
        try {
            return e0Var.h() == fD.MESSAGE ? bb.b(e0Var.d()) : e0Var.c();
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    public Object m341clone() {
        return b();
    }

    public Map m336a() {
        Map a = cJ.a((cJ) this);
        a.putAll(this.e.i());
        return Collections.unmodifiableMap(a);
    }

    public boolean isInitialized() {
        try {
            if (super.isInitialized()) {
                if (d()) {
                    return true;
                }
            }
            return false;
        } catch (UnsupportedOperationException e) {
            throw e;
        } catch (UnsupportedOperationException e2) {
            throw e2;
        }
    }

    public cJ m339clone() {
        return b();
    }

    public boolean b(e0 e0Var) {
        try {
            if (!e0Var.m()) {
                return super.b(e0Var);
            }
            a(e0Var);
            return this.e.b((dH) e0Var);
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    public fl m334a(e0 e0Var, Object obj) {
        return b(e0Var, obj);
    }

    public c3 clone() {
        return b();
    }

    public fl m338b(e0 e0Var, Object obj) {
        return a(e0Var, obj);
    }
}
