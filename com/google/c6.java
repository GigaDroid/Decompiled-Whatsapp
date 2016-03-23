package com.google;

import com.whatsapp.arj;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import org.v;
import org.whispersystems.at;

public final class c6 implements il {
    private static final String[] z;
    private hp a;
    private Map b;
    private int c;

    static {
        int i;
        String[] strArr = new String[5];
        char[] toCharArray = "'Mu9H\u0014['8\u0007\t\bfv\u001e\u001cDn2H\u001bAb:\f]Fr;\n\u0018Z)".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 125;
                    break;
                case at.g /*1*/:
                    i2 = 40;
                    break;
                case at.i /*2*/:
                    i2 = 7;
                    break;
                case at.o /*3*/:
                    i2 = 86;
                    break;
                default:
                    i2 = arj.Theme_editTextStyle;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "'Mu9H\u0014['8\u0007\t\bfv\u001e\u001cDn2H\u001bAb:\f]Fr;\n\u0018Z)".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 125;
                    break;
                case at.g /*1*/:
                    i2 = 40;
                    break;
                case at.i /*2*/:
                    i2 = 7;
                    break;
                case at.o /*3*/:
                    i2 = 86;
                    break;
                default:
                    i2 = arj.Theme_editTextStyle;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = "'Mu9H\u0014['8\u0007\t\bfv\u001e\u001cDn2H\u001bAb:\f]Fr;\n\u0018Z)".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 125;
                    break;
                case at.g /*1*/:
                    i2 = 40;
                    break;
                case at.i /*2*/:
                    i2 = 7;
                    break;
                case at.o /*3*/:
                    i2 = 86;
                    break;
                default:
                    i2 = arj.Theme_editTextStyle;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[2] = new String(cArr).intern();
        toCharArray = "/Mf2\u0001\u0013O'0\u001a\u0012E'7H\u001fQs3H\u001cZu7\u0011]\\o$\r\n\bf8H4gB.\u000b\u0018Xs?\u0007\u0013\b/%\u0000\u0012]k2H\u0013Mq3\u001a]@f&\u0018\u0018F.x".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 125;
                    break;
                case at.g /*1*/:
                    i2 = 40;
                    break;
                case at.i /*2*/:
                    i2 = 7;
                    break;
                case at.o /*3*/:
                    i2 = 86;
                    break;
                default:
                    i2 = arj.Theme_editTextStyle;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[3] = new String(cArr).intern();
        toCharArray = "'Mu9H\u0014['8\u0007\t\bfv\u001e\u001cDn2H\u001bAb:\f]Fr;\n\u0018Z)".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case v.m /*0*/:
                    i2 = 125;
                    break;
                case at.g /*1*/:
                    i2 = 40;
                    break;
                case at.i /*2*/:
                    i2 = 7;
                    break;
                case at.o /*3*/:
                    i2 = 86;
                    break;
                default:
                    i2 = arj.Theme_editTextStyle;
                    break;
            }
            cArr[length] = (char) (i2 ^ c);
        }
        strArr[4] = new String(cArr).intern();
        z = strArr;
    }

    public il m182a(byte[] bArr) {
        return a(bArr);
    }

    public eV g() {
        return eV.h();
    }

    public boolean a(int i, ad adVar) {
        int a = f7.a(i);
        try {
            switch (f7.b(i)) {
                case v.m /*0*/:
                    a(a).a(adVar.y());
                    return true;
                case at.g /*1*/:
                    a(a).b(adVar.s());
                    return true;
                case at.i /*2*/:
                    a(a).a(adVar.q());
                    return true;
                case at.o /*3*/:
                    il g = eV.g();
                    adVar.a(a, g, i.a());
                    a(a).a(g.d());
                    return true;
                case at.p /*4*/:
                    return false;
                case at.m /*5*/:
                    a(a).a(adVar.c());
                    return true;
                default:
                    throw fN.b();
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
        throw e;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.c6 b(int r4, com.google.b7 r5) {
        /*
        r3 = this;
        if (r4 != 0) goto L_0x000f;
    L_0x0002:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x000d }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x000d }
        r2 = 1;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x000d }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x000d }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x000d }
    L_0x000d:
        r0 = move-exception;
        throw r0;
    L_0x000f:
        r0 = r3.b(r4);	 Catch:{ IllegalArgumentException -> 0x0024 }
        if (r0 == 0) goto L_0x0020;
    L_0x0015:
        r0 = r3.a(r4);	 Catch:{ IllegalArgumentException -> 0x0026 }
        r0.a(r5);	 Catch:{ IllegalArgumentException -> 0x0026 }
        r0 = com.google.bA.b;	 Catch:{ IllegalArgumentException -> 0x0026 }
        if (r0 == 0) goto L_0x0023;
    L_0x0020:
        r3.a(r4, r5);	 Catch:{ IllegalArgumentException -> 0x0026 }
    L_0x0023:
        return r3;
    L_0x0024:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0026 }
    L_0x0026:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.c6.b(int, com.google.b7):com.google.c6");
    }

    public fO getDefaultInstanceForType() {
        return g();
    }

    public boolean b(int i) {
        if (i == 0) {
            try {
                throw new IllegalArgumentException(z[4]);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        try {
            if (i != this.c) {
                if (!this.b.containsKey(Integer.valueOf(i))) {
                    return false;
                }
            }
            return true;
        } catch (IllegalArgumentException e2) {
            throw e2;
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    public fO buildPartial() {
        return c();
    }

    public c6 a(int i, int i2) {
        if (i == 0) {
            try {
                throw new IllegalArgumentException(z[2]);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        a(i).a((long) i2);
        return this;
    }

    private void f() {
        this.b = Collections.emptyMap();
        this.c = 0;
        this.a = null;
    }

    public c6 a(eV eVVar) {
        boolean z = bA.b;
        if (eVVar != eV.h()) {
            for (Entry entry : eV.a(eVVar).entrySet()) {
                b(((Integer) entry.getKey()).intValue(), (b7) entry.getValue());
                if (z) {
                    break;
                }
            }
        }
        return this;
    }

    public c6 a(int i, b7 b7Var) {
        if (i == 0) {
            try {
                throw new IllegalArgumentException(z[0]);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        try {
            if (this.a != null) {
                if (this.c == i) {
                    this.a = null;
                    this.c = 0;
                }
            }
            try {
                if (this.b.isEmpty()) {
                    this.b = new TreeMap();
                }
                this.b.put(Integer.valueOf(i), b7Var);
                return this;
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        } catch (IllegalArgumentException e22) {
            throw e22;
        } catch (IllegalArgumentException e222) {
            throw e222;
        }
    }

    public c6 a(ad adVar) {
        boolean z = bA.b;
        do {
            int z2 = adVar.z();
            if (z2 == 0) {
                break;
            }
            try {
                if (!a(z2, adVar) && !z) {
                    break;
                }
            } catch (IllegalArgumentException e) {
                throw e;
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        } while (!z);
        return this;
    }

    public c6 a() {
        a(0);
        return eV.g().a(new eV(this.b, null));
    }

    public Object clone() {
        return a();
    }

    public il mergeFrom(ad adVar, h hVar) {
        return a(adVar, hVar);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.eV d() {
        /*
        r3 = this;
        r2 = 0;
        r0 = 0;
        r3.a(r0);
        r0 = r3.b;
        r0 = r0.isEmpty();
        if (r0 == 0) goto L_0x0015;
    L_0x000d:
        r0 = com.google.eV.h();
        r1 = com.google.bA.b;
        if (r1 == 0) goto L_0x0020;
    L_0x0015:
        r0 = new com.google.eV;
        r1 = r3.b;
        r1 = java.util.Collections.unmodifiableMap(r1);
        r0.<init>(r1, r2);
    L_0x0020:
        r3.b = r2;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.c6.d():com.google.eV");
    }

    public c6 a(byte[] bArr) {
        try {
            ad a = ad.a(bArr);
            a(a);
            a.e(0);
            return this;
        } catch (fN e) {
            throw e;
        } catch (Throwable e2) {
            throw new RuntimeException(z[3], e2);
        }
    }

    private c6() {
    }

    public eV c() {
        return d();
    }

    public boolean isInitialized() {
        return true;
    }

    public fO build() {
        return d();
    }

    public c6 a(ad adVar, h hVar) {
        return a(adVar);
    }

    private hp a(int i) {
        try {
            if (this.a != null) {
                if (i == this.c) {
                    return this.a;
                }
                a(this.c, this.a.c());
            }
            if (i == 0) {
                return null;
            }
            b7 b7Var = (b7) this.b.get(Integer.valueOf(i));
            try {
                this.c = i;
                this.a = b7.c();
                if (b7Var != null) {
                    this.a.a(b7Var);
                }
                return this.a;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    private static c6 e() {
        c6 c6Var = new c6();
        c6Var.f();
        return c6Var;
    }

    static c6 b() {
        return e();
    }
}
