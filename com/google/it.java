package com.google;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.v;
import org.whispersystems.at;

final class it {
    static final boolean a;
    private static final String[] z;
    private final Map b;
    private final Set c;
    private final Map d;
    private final Map e;

    static void b(gj gjVar) {
        String c = gjVar.c();
        if (c.length() == 0) {
            throw new fc(gjVar, z[7], null);
        }
        Object obj = 1;
        int i = 0;
        while (i < c.length()) {
            char charAt = c.charAt(i);
            if (charAt >= '\u0080') {
                obj = null;
            }
            if (!(Character.isLetter(charAt) || charAt == '_' || (Character.isDigit(charAt) && i > 0))) {
                obj = null;
            }
            i++;
        }
        if (obj == null) {
            throw new fc(gjVar, '\"' + c + z[8], null);
        }
    }

    void c(gj gjVar) {
        b(gjVar);
        String a = gjVar.a();
        int lastIndexOf = a.lastIndexOf(46);
        gj gjVar2 = (gj) this.b.put(a, gjVar);
        if (gjVar2 != null) {
            this.b.put(a, gjVar2);
            if (gjVar.d() != gjVar2.d()) {
                throw new fc(gjVar, '\"' + a + z[13] + gjVar2.d().e() + z[14], null);
            } else if (lastIndexOf == -1) {
                throw new fc(gjVar, '\"' + a + z[12], null);
            } else {
                throw new fc(gjVar, '\"' + a.substring(lastIndexOf + 1) + z[11] + a.substring(0, lastIndexOf) + z[10], null);
            }
        }
    }

    gj a(String str) {
        return a(str, g8.ALL_SYMBOLS);
    }

    static Map a(it itVar) {
        return itVar.e;
    }

    void a(e0 e0Var) {
        df dfVar = new df(e0Var.f(), e0Var.e());
        e0 e0Var2 = (e0) this.e.put(dfVar, e0Var);
        if (e0Var2 != null) {
            this.e.put(dfVar, e0Var2);
            throw new fc((gj) e0Var, z[2] + e0Var.e() + z[0] + e0Var.f().a() + z[1] + e0Var2.c() + z[3], null);
        }
    }

    it(hh[] hhVarArr) {
        this.b = new HashMap();
        this.e = new HashMap();
        this.d = new HashMap();
        this.c = new HashSet();
        int i = 0;
        while (i < hhVarArr.length) {
            try {
                this.c.add(hhVarArr[i]);
                a(hhVarArr[i]);
                i++;
            } catch (fc e) {
                throw e;
            }
        }
        for (hh hhVar : this.c) {
            try {
                a(hhVar.c(), hhVar);
            } catch (fc e2) {
                if (!a) {
                    throw new AssertionError();
                }
            } catch (fc e3) {
                throw e3;
            }
        }
    }

    static {
        int i;
        int i2;
        boolean z = false;
        String[] strArr = new String[15];
        char[] toCharArray = "\u0016 qqo\u00123g0j\u0007a`4k\u0010aw\"k\u001aak?.\\".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 126;
                    break;
                case at.g /*1*/:
                    i2 = 65;
                    break;
                case at.i /*2*/:
                    i2 = 2;
                    break;
                case at.o /*3*/:
                    i2 = 81;
                    break;
                default:
                    i2 = 14;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "\\a`(.\u0018(g=j^c".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 126;
                    break;
                case at.g /*1*/:
                    i2 = 65;
                    break;
                case at.i /*2*/:
                    i2 = 2;
                    break;
                case at.o /*3*/:
                    i2 = 81;
                    break;
                default:
                    i2 = 14;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = "8(g=j^/w<l\u001b3\"".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 126;
                    break;
                case at.g /*1*/:
                    i2 = 65;
                    break;
                case at.i /*2*/:
                    i2 = 2;
                    break;
                case at.o /*3*/:
                    i2 = 81;
                    break;
                default:
                    i2 = 14;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[2] = new String(cArr).intern();
        toCharArray = "\\o".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 126;
                    break;
                case at.g /*1*/:
                    i2 = 65;
                    break;
                case at.i /*2*/:
                    i2 = 2;
                    break;
                case at.o /*3*/:
                    i2 = 81;
                    break;
                default:
                    i2 = 14;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[3] = new String(cArr).intern();
        toCharArray = "\\o".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 126;
                    break;
                case at.g /*1*/:
                    i2 = 65;
                    break;
                case at.i /*2*/:
                    i2 = 2;
                    break;
                case at.o /*3*/:
                    i2 = 81;
                    break;
                default:
                    i2 = 14;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[4] = new String(cArr).intern();
        toCharArray = "\u000e a:o\u0019$+qg\u0010ad8b\u001ba ".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 126;
                    break;
                case at.g /*1*/:
                    i2 = 65;
                    break;
                case at.i /*2*/:
                    i2 = 2;
                    break;
                case at.o /*3*/:
                    i2 = 81;
                    break;
                default:
                    i2 = 14;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[5] = new String(cArr).intern();
        toCharArray = "\\ak\".\u001f-p4o\u001a8\"5k\u0018(l4j^ic\".\r.o4z\u0016(l6.\u00115j4|^5j0`^ \"".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 126;
                    break;
                case at.g /*1*/:
                    i2 = 65;
                    break;
                case at.i /*2*/:
                    i2 = 2;
                    break;
                case at.o /*3*/:
                    i2 = 81;
                    break;
                default:
                    i2 = 14;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[6] = new String(cArr).intern();
        toCharArray = "3(q\"g\u0010&\"?o\u0013$,".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 126;
                    break;
                case at.g /*1*/:
                    i2 = 65;
                    break;
                case at.i /*2*/:
                    i2 = 2;
                    break;
                case at.o /*3*/:
                    i2 = 81;
                    break;
                default:
                    i2 = 14;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[7] = new String(cArr).intern();
        toCharArray = "\\ak\".\u0010.vqo^7c=g\u001aak5k\u00105k7g\u001b3,".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 126;
                    break;
                case at.g /*1*/:
                    i2 = 65;
                    break;
                case at.i /*2*/:
                    i2 = 2;
                    break;
                case at.o /*3*/:
                    i2 = 81;
                    break;
                default:
                    i2 = 14;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[8] = new String(cArr).intern();
        toCharArray = "\\ak\".\u0010.vqj\u001b'k?k\u001ao".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 126;
                    break;
                case at.g /*1*/:
                    i2 = 65;
                    break;
                case at.i /*2*/:
                    i2 = 2;
                    break;
                case at.o /*3*/:
                    i2 = 81;
                    break;
                default:
                    i2 = 14;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[9] = new String(cArr).intern();
        toCharArray = "\\o".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 126;
                    break;
                case at.g /*1*/:
                    i2 = 65;
                    break;
                case at.i /*2*/:
                    i2 = 2;
                    break;
                case at.o /*3*/:
                    i2 = 81;
                    break;
                default:
                    i2 = 14;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[10] = new String(cArr).intern();
        toCharArray = "\\ak\".\u001f-p4o\u001a8\"5k\u0018(l4j^(lq,".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 126;
                    break;
                case at.g /*1*/:
                    i2 = 65;
                    break;
                case at.i /*2*/:
                    i2 = 2;
                    break;
                case at.o /*3*/:
                    i2 = 81;
                    break;
                default:
                    i2 = 14;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[11] = new String(cArr).intern();
        toCharArray = "\\ak\".\u001f-p4o\u001a8\"5k\u0018(l4jP".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 126;
                    break;
                case at.g /*1*/:
                    i2 = 65;
                    break;
                case at.i /*2*/:
                    i2 = 2;
                    break;
                case at.o /*3*/:
                    i2 = 81;
                    break;
                default:
                    i2 = 14;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[12] = new String(cArr).intern();
        toCharArray = "\\ak\".\u001f-p4o\u001a8\"5k\u0018(l4j^(lqh\u0017-gq,".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 126;
                    break;
                case at.g /*1*/:
                    i2 = 65;
                    break;
                case at.i /*2*/:
                    i2 = 2;
                    break;
                case at.o /*3*/:
                    i2 = 81;
                    break;
                default:
                    i2 = 14;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[13] = new String(cArr).intern();
        toCharArray = "\\o".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 126;
                    break;
                case at.g /*1*/:
                    i2 = 65;
                    break;
                case at.i /*2*/:
                    i2 = 2;
                    break;
                case at.o /*3*/:
                    i2 = 81;
                    break;
                default:
                    i2 = 14;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[14] = new String(cArr).intern();
        z = strArr;
        if (!O.class.desiredAssertionStatus()) {
            z = true;
        }
        a = z;
    }

    private void a(hh hhVar) {
        for (hh hhVar2 : hhVar.d()) {
            if (this.c.add(hhVar2)) {
                a(hhVar2);
            }
        }
    }

    boolean d(gj gjVar) {
        return (gjVar instanceof fn) || (gjVar instanceof c1) || (gjVar instanceof ff) || (gjVar instanceof a7);
    }

    boolean a(gj gjVar) {
        return (gjVar instanceof fn) || (gjVar instanceof c1);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    com.google.gj a(java.lang.String r8, com.google.gj r9, com.google.g8 r10) {
        /*
        r7 = this;
        r6 = -1;
        r0 = ".";
        r0 = r8.startsWith(r0);
        if (r0 == 0) goto L_0x0039;
    L_0x000a:
        r0 = 1;
        r0 = r8.substring(r0);
        r0 = r7.a(r0, r10);
    L_0x0013:
        if (r0 != 0) goto L_0x008a;
    L_0x0015:
        r0 = new com.google.fc;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = 34;
        r1 = r1.append(r2);
        r1 = r1.append(r8);
        r2 = z;
        r3 = 9;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r1 = r1.toString();
        r2 = 0;
        r0.<init>(r9, r1, r2);
        throw r0;
    L_0x0039:
        r0 = 46;
        r2 = r8.indexOf(r0);
        if (r2 != r6) goto L_0x0059;
    L_0x0041:
        r0 = r8;
    L_0x0042:
        r3 = new java.lang.StringBuilder;
        r1 = r9.a();
        r3.<init>(r1);
    L_0x004b:
        r1 = ".";
        r4 = r3.lastIndexOf(r1);
        if (r4 != r6) goto L_0x005f;
    L_0x0054:
        r0 = r7.a(r8, r10);
        goto L_0x0013;
    L_0x0059:
        r0 = 0;
        r0 = r8.substring(r0, r2);
        goto L_0x0042;
    L_0x005f:
        r1 = r4 + 1;
        r3.setLength(r1);
        r3.append(r0);
        r1 = r3.toString();
        r5 = com.google.g8.AGGREGATES_ONLY;
        r1 = r7.a(r1, r5);
        if (r1 == 0) goto L_0x0086;
    L_0x0073:
        if (r2 == r6) goto L_0x008b;
    L_0x0075:
        r0 = r4 + 1;
        r3.setLength(r0);
        r3.append(r8);
        r0 = r3.toString();
        r0 = r7.a(r0, r10);
        goto L_0x0013;
    L_0x0086:
        r3.setLength(r4);
        goto L_0x004b;
    L_0x008a:
        return r0;
    L_0x008b:
        r0 = r1;
        goto L_0x0013;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.it.a(java.lang.String, com.google.gj, com.google.g8):com.google.gj");
    }

    static Map b(it itVar) {
        return itVar.d;
    }

    void a(fG fGVar) {
        df dfVar = new df(fGVar.a(), fGVar.getNumber());
        fG fGVar2 = (fG) this.d.put(dfVar, fGVar);
        if (fGVar2 != null) {
            this.d.put(dfVar, fGVar2);
        }
    }

    void a(String str, hh hhVar) {
        String str2;
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf == -1) {
            str2 = str;
        } else {
            a(str.substring(0, lastIndexOf), hhVar);
            str2 = str.substring(lastIndexOf + 1);
        }
        gj gjVar = (gj) this.b.put(str, new ff(str2, str, hhVar));
        if (gjVar != null) {
            this.b.put(str, gjVar);
            if (!(gjVar instanceof ff)) {
                throw new fc(hhVar, '\"' + str2 + z[6] + z[5] + gjVar.d().e() + z[4], null);
            }
        }
    }

    gj a(String str, g8 g8Var) {
        gj gjVar = (gj) this.b.get(str);
        if (gjVar != null) {
            if (g8Var == g8.ALL_SYMBOLS) {
                return gjVar;
            }
            if (g8Var == g8.TYPES_ONLY && a(gjVar)) {
                return gjVar;
            }
            if (g8Var == g8.AGGREGATES_ONLY && d(gjVar)) {
                return gjVar;
            }
        }
        for (hh a : this.c) {
            gjVar = (gj) hh.a(a).b.get(str);
            if (gjVar != null) {
                if (g8Var == g8.ALL_SYMBOLS) {
                    return gjVar;
                }
                if (g8Var == g8.TYPES_ONLY && a(gjVar)) {
                    return gjVar;
                }
                if (g8Var == g8.AGGREGATES_ONLY && d(gjVar)) {
                    return gjVar;
                }
            }
        }
        return null;
    }
}
