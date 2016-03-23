package com.google;

import com.whatsapp.arj;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import java.util.Collections;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public final class e0 implements gj, Comparable, dH {
    private static final eK[] g;
    private static final String[] z;
    private c1 a;
    private fS b;
    private final hh c;
    private final fn d;
    private fn e;
    private fn f;
    private Object h;
    private b6 i;
    private final String j;
    private final int k;

    static void a(e0 e0Var, b6 b6Var) {
        e0Var.a(b6Var);
    }

    public fD h() {
        return this.b.getJavaType();
    }

    public Object c() {
        try {
            if (h() != fD.MESSAGE) {
                return this.h;
            }
            throw new UnsupportedOperationException(z[23]);
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    e0(b6 b6Var, hh hhVar, fn fnVar, int i, boolean z, ev evVar) {
        this(b6Var, hhVar, fnVar, i, z);
    }

    public ci m172b() {
        return b();
    }

    public fn m176d() {
        try {
            if (h() == fD.MESSAGE) {
                return this.f;
            }
            throw new UnsupportedOperationException(z[29]);
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    private void a(b6 b6Var) {
        this.i = b6Var;
    }

    public boolean m() {
        return this.i.c();
    }

    public int a(e0 e0Var) {
        try {
            if (e0Var.e == this.e) {
                return e() - e0Var.e();
            }
            throw new IllegalArgumentException(z[28]);
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    public int compareTo(Object obj) {
        return a((e0) obj);
    }

    public int m178e() {
        return this.i.g();
    }

    public cY k() {
        return this.i.k();
    }

    public boolean m175c() {
        try {
            return this.i.p() == cw.LABEL_REPEATED;
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    public fn f() {
        return this.e;
    }

    public eK d() {
        return g[this.b.ordinal()];
    }

    public fS g() {
        return this.b;
    }

    public d0 m173b() {
        return d().getJavaType();
    }

    public fn i() {
        try {
            if (m()) {
                return this.d;
            }
            throw new UnsupportedOperationException(z[0]);
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    public boolean o() {
        try {
            if (c()) {
                if (d().isPackable()) {
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

    public int a() {
        return this.k;
    }

    public il a(il ilVar, fO fOVar) {
        return ((fl) ilVar).mergeFrom((ci) fOVar);
    }

    static {
        int i;
        int i2;
        String[] strArr = new String[32];
        char[] toCharArray = ",$gZx\u001e%kE<X%}\t6\u00178.H6X)v]=\u0016?gF6V".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 120;
                    break;
                case at.g /*1*/:
                    i2 = 76;
                    break;
                case at.i /*2*/:
                    i2 = 14;
                    break;
                case at.o /*3*/:
                    i2 = 41;
                    break;
                default:
                    i2 = 88;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "U%`O".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 120;
                    break;
                case at.g /*1*/:
                    i2 = 76;
                    break;
                case at.i /*2*/:
                    i2 = 14;
                    break;
                case at.o /*3*/:
                    i2 = 41;
                    break;
                default:
                    i2 = 88;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = "5)}Z9\u001f)}\t;\u0019\")]x\u0010-xLx\u001c)hH-\u00148._9\u00149kZv".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 120;
                    break;
                case at.g /*1*/:
                    i2 = 76;
                    break;
                case at.i /*2*/:
                    i2 = 14;
                    break;
                case at.o /*3*/:
                    i2 = 41;
                    break;
                default:
                    i2 = 88;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[2] = new String(cArr).intern();
        toCharArray = "ZlgZx\u0016#z\t9\u0016lkG-\u0015lzP(\u001db".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 120;
                    break;
                case at.g /*1*/:
                    i2 = 76;
                    break;
                case at.i /*2*/:
                    i2 = 14;
                    break;
                case at.o /*3*/:
                    i2 = 41;
                    break;
                default:
                    i2 = 88;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[3] = new String(cArr).intern();
        toCharArray = "-\"eG7\u000f\".L6\r!.M=\u001e-{E,X:oE-\u001dv.\u000b".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 120;
                    break;
                case at.g /*1*/:
                    i2 = 76;
                    break;
                case at.i /*2*/:
                    i2 = 14;
                    break;
                case at.o /*3*/:
                    i2 = 41;
                    break;
                default:
                    i2 = 88;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[4] = new String(cArr).intern();
        toCharArray = "5)}Z9\u001f).]!\b).A9\u001cljL>\u00199b]x\u000e-b\\=V".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 120;
                    break;
                case at.g /*1*/:
                    i2 = 76;
                    break;
                case at.i /*2*/:
                    i2 = 14;
                    break;
                case at.o /*3*/:
                    i2 = 41;
                    break;
                default:
                    i2 = 88;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[5] = new String(cArr).intern();
        toCharArray = "\u0011\"h".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 120;
                    break;
                case at.g /*1*/:
                    i2 = 76;
                    break;
                case at.i /*2*/:
                    i2 = 14;
                    break;
                case at.o /*3*/:
                    i2 = 41;
                    break;
                default:
                    i2 = 88;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[6] = new String(cArr).intern();
        toCharArray = "\u0016-`".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 120;
                    break;
                case at.g /*1*/:
                    i2 = 76;
                    break;
                case at.i /*2*/:
                    i2 = 14;
                    break;
                case at.o /*3*/:
                    i2 = 41;
                    break;
                default:
                    i2 = 88;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[7] = new String(cArr).intern();
        toCharArray = ";#{E<\u0016kz\t(\u0019>}Lx\u001c)hH-\u00148._9\u00149k\u0013x".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 120;
                    break;
                case at.g /*1*/:
                    i2 = 76;
                    break;
                case at.i /*2*/:
                    i2 = 14;
                    break;
                case at.o /*3*/:
                    i2 = 41;
                    break;
                default:
                    i2 = 88;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[8] = new String(cArr).intern();
        toCharArray = "=4zL6\u000b%aG+X#h\t\u0015\u001d?}H?\u001d\u001fk]+X!{Z,X.k\t7\b8gF6\u0019 .D=\u000b?oN=\u000bb".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 120;
                    break;
                case at.g /*1*/:
                    i2 = 76;
                    break;
                case at.i /*2*/:
                    i2 = 14;
                    break;
                case at.o /*3*/:
                    i2 = 41;
                    break;
                default:
                    i2 = 88;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[9] = new String(cArr).intern();
        toCharArray = "\u0016-`".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 120;
                    break;
                case at.g /*1*/:
                    i2 = 76;
                    break;
                case at.i /*2*/:
                    i2 = 14;
                    break;
                case at.o /*3*/:
                    i2 = 41;
                    break;
                default:
                    i2 = 88;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[10] = new String(cArr).intern();
        toCharArray = "ZlgZx\u0016#z\t9X!kZ+\u0019+k\t,\u0001<k\u0007".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 120;
                    break;
                case at.g /*1*/:
                    i2 = 76;
                    break;
                case at.i /*2*/:
                    i2 = 14;
                    break;
                case at.o /*3*/:
                    i2 = 41;
                    break;
                default:
                    i2 = 88;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[11] = new String(cArr).intern();
        toCharArray = ";#{E<X\"a]x\b-|Z=X(kO9\r z\t.\u0019 {LbXn".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 120;
                    break;
                case at.g /*1*/:
                    i2 = 76;
                    break;
                case at.i /*2*/:
                    i2 = 14;
                    break;
                case at.o /*3*/:
                    i2 = 41;
                    break;
                default:
                    i2 = 88;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[12] = new String(cArr).intern();
        toCharArray = "\u0011\"h".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 120;
                    break;
                case at.g /*1*/:
                    i2 = 76;
                    break;
                case at.i /*2*/:
                    i2 = 14;
                    break;
                case at.o /*3*/:
                    i2 = 41;
                    break;
                default:
                    i2 = 88;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[13] = new String(cArr).intern();
        toCharArray = "5)}Z9\u001f)]L,\u000blmH6\u0016#z\t0\u0019:k\t>\u0011)bM+TlaG4\u0001lkQ,\u001d\"}@7\u0016? ".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 120;
                    break;
                case at.g /*1*/:
                    i2 = 76;
                    break;
                case at.i /*2*/:
                    i2 = 14;
                    break;
                case at.o /*3*/:
                    i2 = 41;
                    break;
                default:
                    i2 = 88;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[14] = new String(cArr).intern();
        toCharArray = ">%kE<X;g]0X!kZ+\u0019+k\t7\nlkG-\u0015lzP(\u001dlc@+\u000b%`Nx\f5~L\u0007\u0016-cLv".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 120;
                    break;
                case at.g /*1*/:
                    i2 = 76;
                    break;
                case at.i /*2*/:
                    i2 = 14;
                    break;
                case at.o /*3*/:
                    i2 = 41;
                    break;
                default:
                    i2 = 88;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[15] = new String(cArr).intern();
        toCharArray = "ZlgZx\u0016#z\t9X!kZ+\u0019+k\t,\u0001<k\u0007".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 120;
                    break;
                case at.g /*1*/:
                    i2 = 76;
                    break;
                case at.i /*2*/:
                    i2 = 14;
                    break;
                case at.o /*3*/:
                    i2 = 41;
                    break;
                default:
                    i2 = 88;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[16] = new String(cArr).intern();
        toCharArray = "ZljF=\u000bl`F,X(kJ4\u0019>k\t".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 120;
                    break;
                case at.g /*1*/:
                    i2 = 76;
                    break;
                case at.i /*2*/:
                    i2 = 14;
                    break;
                case at.o /*3*/:
                    i2 = 41;
                    break;
                default:
                    i2 = 88;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[17] = new String(cArr).intern();
        toCharArray = "X-}\t9\u0016lkQ,\u001d\"}@7\u0016l`\\5\u001a)|\u0007".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 120;
                    break;
                case at.g /*1*/:
                    i2 = 76;
                    break;
                case at.i /*2*/:
                    i2 = 14;
                    break;
                case at.o /*3*/:
                    i2 = 41;
                    break;
                default:
                    i2 = 88;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[18] = new String(cArr).intern();
        toCharArray = "U%`O".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 120;
                    break;
                case at.g /*1*/:
                    i2 = 76;
                    break;
                case at.i /*2*/:
                    i2 = 14;
                    break;
                case at.o /*3*/:
                    i2 = 41;
                    break;
                default:
                    i2 = 88;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[19] = new String(cArr).intern();
        toCharArray = "ZlgZx\u0016#z\t9X8wY=V".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 120;
                    break;
                case at.g /*1*/:
                    i2 = 76;
                    break;
                case at.i /*2*/:
                    i2 = 14;
                    break;
                case at.o /*3*/:
                    i2 = 41;
                    break;
                default:
                    i2 = 88;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[20] = new String(cArr).intern();
        toCharArray = ">%kE<X;g]0X<|@5\u00118g_=X8wY=X$oZx\f5~L\u0007\u0016-cLv".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 120;
                    break;
                case at.g /*1*/:
                    i2 = 76;
                    break;
                case at.i /*2*/:
                    i2 = 14;
                    break;
                case at.o /*3*/:
                    i2 = 41;
                    break;
                default:
                    i2 = 88;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[21] = new String(cArr).intern();
        toCharArray = "*)~L9\f)j\t>\u0011)bM+X/oG6\u00178.A9\u000e).M=\u001e-{E,X:oE-\u001d? ".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 120;
                    break;
                case at.g /*1*/:
                    i2 = 76;
                    break;
                case at.i /*2*/:
                    i2 = 14;
                    break;
                case at.o /*3*/:
                    i2 = 41;
                    break;
                default:
                    i2 = 88;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[22] = new String(cArr).intern();
        toCharArray = ">%kE<<)}J*\u0011<zF*V+k]\u001c\u001d*o\\4\f\u001aoE-\u001dd'\t;\u0019 bL<X#`\t9\u0016lkD:\u001d(jL<X!kZ+\u0019+k\t>\u0011)bMv".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 120;
                    break;
                case at.g /*1*/:
                    i2 = 76;
                    break;
                case at.i /*2*/:
                    i2 = 14;
                    break;
                case at.o /*3*/:
                    i2 = 41;
                    break;
                default:
                    i2 = 88;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[23] = new String(cArr).intern();
        toCharArray = ">%kE<X\"{D:\u001d>}\t5\r?z\t:\u001dl~F+\u00118g_=X%`]=\u001f)|Zv".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 120;
                    break;
                case at.g /*1*/:
                    i2 = 76;
                    break;
                case at.i /*2*/:
                    i2 = 14;
                    break;
                case at.o /*3*/:
                    i2 = 41;
                    break;
                default:
                    i2 = 88;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[24] = new String(cArr).intern();
        toCharArray = ">%kE<<)}J*\u0011<zF*(>a]7V)v]=\u0016(kLx\u0016#z\t+\u001d8.O7\nlkQ,\u001d\"}@7\u0016lh@=\u0014( ".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 120;
                    break;
                case at.g /*1*/:
                    i2 = 76;
                    break;
                case at.i /*2*/:
                    i2 = 14;
                    break;
                case at.o /*3*/:
                    i2 = 41;
                    break;
                default:
                    i2 = 88;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[25] = new String(cArr).intern();
        toCharArray = ">%kE<<)}J*\u0011<zF*(>a]7V)v]=\u0016(kLx\u000b)z\t>\u0017>.G7\u0016akQ,\u001d\"}@7\u0016lh@=\u0014( ".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 120;
                    break;
                case at.g /*1*/:
                    i2 = 76;
                    break;
                case at.i /*2*/:
                    i2 = 14;
                    break;
                case at.o /*3*/:
                    i2 = 41;
                    break;
                default:
                    i2 = 88;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[26] = new String(cArr).intern();
        toCharArray = "#<oJ3\u001d(.\u0014x\f>{L\u0005X/oGx\u0017\"bPx\u001a).Z(\u001d/gO1\u001d(.O7\nl|L(\u001d-zL<X<|@5\u00118g_=X*gL4\u001c? ".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 120;
                    break;
                case at.g /*1*/:
                    i2 = 76;
                    break;
                case at.i /*2*/:
                    i2 = 14;
                    break;
                case at.o /*3*/:
                    i2 = 41;
                    break;
                default:
                    i2 = 88;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[27] = new String(cArr).intern();
        toCharArray = ">%kE<<)}J*\u0011<zF*\u000blmH6X#`E!X.k\t;\u0017!~H*\u001d(.]7X#zA=\nlH@=\u0014(JL+\u001b>gY,\u0017>}\t>\u0017>.O1\u001d jZx\u0017*.]0\u001dl}H5\u001dlcL+\u000b-iLx\f5~Lv".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 120;
                    break;
                case at.g /*1*/:
                    i2 = 76;
                    break;
                case at.i /*2*/:
                    i2 = 14;
                    break;
                case at.o /*3*/:
                    i2 = 41;
                    break;
                default:
                    i2 = 88;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[28] = new String(cArr).intern();
        toCharArray = ",$gZx\u001e%kE<X%}\t6\u00178.F>X!kZ+\u0019+k\t,\u0001<k\u0007".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 120;
                    break;
                case at.g /*1*/:
                    i2 = 76;
                    break;
                case at.i /*2*/:
                    i2 = 14;
                    break;
                case at.o /*3*/:
                    i2 = 41;
                    break;
                default:
                    i2 = 88;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[29] = new String(cArr).intern();
        toCharArray = ",$gZx\u001e%kE<X%}\t6\u00178.F>X)`\\5X8wY=V".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 120;
                    break;
                case at.g /*1*/:
                    i2 = 76;
                    break;
                case at.i /*2*/:
                    i2 = 14;
                    break;
                case at.o /*3*/:
                    i2 = 41;
                    break;
                default:
                    i2 = 88;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[30] = new String(cArr).intern();
        toCharArray = "\u001c)}J*\u0011<zF*V<|F,\u0017lfH+X-.G=\u000fljL;\u0014-|L<X8wY=X.{]x<)}[;\u0011<zF*\u000bbdH.\u0019lyH+\u0016kz\t-\b(o]=\u001cb".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case v.m /*0*/:
                    i2 = 120;
                    break;
                case at.g /*1*/:
                    i2 = 76;
                    break;
                case at.i /*2*/:
                    i2 = 14;
                    break;
                case at.o /*3*/:
                    i2 = 41;
                    break;
                default:
                    i2 = 88;
                    break;
            }
            cArr[length] = (char) (i2 ^ c);
        }
        strArr[31] = new String(cArr).intern();
        z = strArr;
        try {
            g = eK.values();
            if (fS.values().length != iq.values().length) {
                throw new RuntimeException(z[31]);
            }
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    public c1 l() {
        try {
            if (h() == fD.ENUM) {
                return this.a;
            }
            throw new UnsupportedOperationException(z[30]);
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    public boolean j() {
        try {
            return this.i.p() == cw.LABEL_OPTIONAL;
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    public b6 b() {
        return this.i;
    }

    public String m174c() {
        return this.i.b();
    }

    static void b(e0 e0Var) {
        e0Var.e();
    }

    public boolean m171a() {
        return k().o();
    }

    private void e() {
        gj a;
        if (this.i.c()) {
            a = hh.a(this.c).a(this.i.v(), this, g8.TYPES_ONLY);
            try {
                if (a instanceof fn) {
                    try {
                        this.e = (fn) a;
                        if (!f().b(e())) {
                            throw new fc((gj) this, '\"' + f().a() + z[17] + e() + z[18], null);
                        }
                    } catch (dQ e) {
                        throw e;
                    }
                }
                throw new fc((gj) this, '\"' + this.i.v() + z[16], null);
            } catch (dQ e2) {
                throw e2;
            }
        }
        if (this.i.y()) {
            a = hh.a(this.c).a(this.i.a(), this, g8.TYPES_ONLY);
            try {
                if (!this.i.f()) {
                    if (a instanceof fn) {
                        this.b = fS.MESSAGE;
                    } else {
                        try {
                            if (a instanceof c1) {
                                this.b = fS.ENUM;
                            } else {
                                throw new fc((gj) this, '\"' + this.i.a() + z[20], null);
                            }
                        } catch (dQ e22) {
                            throw e22;
                        }
                    }
                }
                try {
                    if (h() != fD.MESSAGE) {
                        try {
                            if (h() != fD.ENUM) {
                                throw new fc((gj) this, z[21], null);
                            } else if (a instanceof c1) {
                                this.a = (c1) a;
                            } else {
                                throw new fc((gj) this, '\"' + this.i.a() + z[3], null);
                            }
                        } catch (dQ e222) {
                            throw e222;
                        } catch (dQ e2222) {
                            throw e2222;
                        }
                    } else if (a instanceof fn) {
                        try {
                            this.f = (fn) a;
                            if (this.i.n()) {
                                throw new fc((gj) this, z[2], null);
                            }
                        } catch (dQ e22222) {
                            throw e22222;
                        }
                    } else {
                        throw new fc((gj) this, '\"' + this.i.a() + z[11], null);
                    }
                } catch (dQ e222222) {
                    throw e222222;
                } catch (dQ e2222222) {
                    throw e2222222;
                }
            } catch (dQ e22222222) {
                throw e22222222;
            } catch (dQ e222222222) {
                throw e222222222;
            }
        }
        try {
            if (h() == fD.MESSAGE || h() == fD.ENUM) {
                throw new fc((gj) this, z[15], null);
            }
        } catch (dQ e2222222222) {
            throw e2222222222;
        } catch (dQ e22222222222) {
            throw e22222222222;
        }
        try {
            if (!this.i.n()) {
                try {
                    if (c()) {
                        this.h = Collections.emptyList();
                    } else {
                        try {
                            switch (ev.a[h().ordinal()]) {
                                case at.g /*1*/:
                                    this.h = this.a.a().get(0);
                                    break;
                                case at.i /*2*/:
                                    this.h = null;
                                    break;
                                default:
                                    this.h = fD.a(h());
                                    break;
                            }
                        } catch (dQ e222222222222) {
                            throw e222222222222;
                        }
                    }
                } catch (dQ e2222222222222) {
                    throw e2222222222222;
                }
            } else if (c()) {
                throw new fc((gj) this, z[22], null);
            } else {
                try {
                    switch (ev.b[g().ordinal()]) {
                        case at.g /*1*/:
                        case at.i /*2*/:
                        case at.o /*3*/:
                            this.h = Integer.valueOf(eS.e(this.i.i()));
                            break;
                        case at.p /*4*/:
                        case at.m /*5*/:
                            this.h = Integer.valueOf(eS.a(this.i.i()));
                            break;
                        case Y.f /*6*/:
                        case aF.v /*7*/:
                        case aF.u /*8*/:
                            this.h = Long.valueOf(eS.d(this.i.i()));
                            break;
                        case Y.l /*9*/:
                        case Y.t /*10*/:
                            this.h = Long.valueOf(eS.b(this.i.i()));
                            break;
                        case Y.j /*11*/:
                            if (!this.i.i().equals(z[13])) {
                                if (!this.i.i().equals(z[1])) {
                                    if (!this.i.i().equals(z[7])) {
                                        this.h = Float.valueOf(this.i.i());
                                        break;
                                    } else {
                                        this.h = Float.valueOf(Float.NaN);
                                        break;
                                    }
                                }
                                this.h = Float.valueOf(Float.NEGATIVE_INFINITY);
                                break;
                            }
                            this.h = Float.valueOf(Float.POSITIVE_INFINITY);
                            break;
                        case Y.p /*12*/:
                            if (!this.i.i().equals(z[6])) {
                                if (!this.i.i().equals(z[19])) {
                                    if (!this.i.i().equals(z[10])) {
                                        this.h = Double.valueOf(this.i.i());
                                        break;
                                    } else {
                                        this.h = Double.valueOf(Double.NaN);
                                        break;
                                    }
                                }
                                this.h = Double.valueOf(Double.NEGATIVE_INFINITY);
                                break;
                            }
                            this.h = Double.valueOf(Double.POSITIVE_INFINITY);
                            break;
                        case Y.q /*13*/:
                            this.h = Boolean.valueOf(this.i.i());
                            break;
                        case arj.Toolbar_titleMarginEnd /*14*/:
                            this.h = this.i.i();
                            break;
                        case arj.Toolbar_titleMarginTop /*15*/:
                            this.h = eS.a(this.i.i());
                            break;
                        case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                            this.h = this.a.a(this.i.i());
                            if (this.h == null) {
                                throw new fc((gj) this, z[4] + this.i.i() + '\"', null);
                            }
                            break;
                        case arj.Toolbar_maxButtonHeight /*17*/:
                        case arj.Toolbar_collapseIcon /*18*/:
                            throw new fc((gj) this, z[5], null);
                    }
                } catch (dQ e22222222222222) {
                    throw e22222222222222;
                } catch (Throwable e3) {
                    throw new fc(this, z[8] + e3.getMessage(), e3, null);
                } catch (dQ e222222222222222) {
                    throw e222222222222222;
                } catch (dQ e2222222222222222) {
                    throw e2222222222222222;
                } catch (dQ e22222222222222222) {
                    throw e22222222222222222;
                } catch (dQ e222222222222222222) {
                    throw e222222222222222222;
                } catch (dQ e2222222222222222222) {
                    throw e2222222222222222222;
                } catch (dQ e22222222222222222222) {
                    throw e22222222222222222222;
                } catch (dQ e222222222222222222222) {
                    throw e222222222222222222222;
                } catch (Throwable e32) {
                    throw new fc(this, z[12] + this.i.i() + '\"', e32, null);
                }
            }
            try {
                if (!m()) {
                    hh.a(this.c).a(this);
                }
                try {
                    if (this.e == null) {
                        return;
                    }
                    if (this.e.f().i()) {
                        try {
                            if (m()) {
                                try {
                                    if (j()) {
                                        try {
                                            if (g() == fS.MESSAGE) {
                                                return;
                                            }
                                        } catch (dQ e2222222222222222222222) {
                                            throw e2222222222222222222222;
                                        }
                                    }
                                    throw new fc((gj) this, z[9], null);
                                } catch (dQ e22222222222222222222222) {
                                    throw e22222222222222222222222;
                                }
                            } else {
                                throw new fc((gj) this, z[14], null);
                            }
                        } catch (dQ e222222222222222222222222) {
                            throw e222222222222222222222222;
                        }
                    }
                } catch (dQ e2222222222222222222222222) {
                    throw e2222222222222222222222222;
                } catch (dQ e22222222222222222222222222) {
                    throw e22222222222222222222222222;
                }
            } catch (dQ e222222222222222222222222222) {
                throw e222222222222222222222222222;
            }
        } catch (dQ e2222222222222222222222222222) {
            throw e2222222222222222222222222222;
        } catch (dQ e22222222222222222222222222222) {
            throw e22222222222222222222222222222;
        }
    }

    public String m170a() {
        return this.j;
    }

    private e0(b6 b6Var, hh hhVar, fn fnVar, int i, boolean z) {
        this.k = i;
        this.i = b6Var;
        this.j = O.b(hhVar, fnVar, b6Var.b());
        this.c = hhVar;
        if (b6Var.f()) {
            this.b = fS.valueOf(b6Var.d());
        }
        try {
            if (e() <= 0) {
                throw new fc((gj) this, z[24], null);
            }
            try {
                if (b6Var.k().o()) {
                    if (!o()) {
                        throw new fc((gj) this, z[27], null);
                    }
                }
                if (z) {
                    try {
                        if (b6Var.c()) {
                            try {
                                this.e = null;
                                if (fnVar != null) {
                                    this.d = fnVar;
                                } else {
                                    this.d = null;
                                }
                            } catch (UnsupportedOperationException e) {
                                throw e;
                            }
                        }
                        throw new fc((gj) this, z[25], null);
                    } catch (UnsupportedOperationException e2) {
                        throw e2;
                    }
                }
                try {
                    if (b6Var.c()) {
                        throw new fc((gj) this, z[26], null);
                    }
                    this.e = fnVar;
                    this.d = null;
                } catch (UnsupportedOperationException e22) {
                    throw e22;
                }
                hh.a(hhVar).c(this);
            } catch (UnsupportedOperationException e222) {
                throw e222;
            } catch (UnsupportedOperationException e2222) {
                throw e2222;
            }
        } catch (UnsupportedOperationException e22222) {
            throw e22222;
        }
    }

    public boolean n() {
        try {
            return this.i.p() == cw.LABEL_REQUIRED;
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    public hh m177d() {
        return this.c;
    }
}
