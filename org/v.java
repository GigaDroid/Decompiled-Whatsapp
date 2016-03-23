package org;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Calendar;
import java.util.Formatter;

public class v implements Serializable {
    public static int a = 0;
    public static final int b = 1;
    public static final int d = 2;
    public static final int f = 3;
    public static final int g = 0;
    public static final int h = 2;
    public static final int i = 1;
    public static final int j = 0;
    public static final int m = 0;
    public static final int p = 2;
    public static final int s = 1;
    private static final long serialVersionUID = 9010790363003271996L;
    private static final String[] z;
    private long c;
    private String e;
    private String k;
    private final boolean[][] l;
    private String n;
    private int o;
    private Calendar q;
    private int r;
    private String t;
    private String u;

    static {
        int i;
        int i2;
        String[] strArr = new String[5];
        char[] toCharArray = "qv(i".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = m; length > i; i += s) {
            char c = cArr[i];
            switch (i % 5) {
                case m /*0*/:
                    i2 = 81;
                    break;
                case s /*1*/:
                    i2 = 83;
                    break;
                case p /*2*/:
                    i2 = 16;
                    break;
                case f /*3*/:
                    i2 = 13;
                    break;
                default:
                    i2 = 65;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[m] = new String(cArr).intern();
        toCharArray = "qv!)5\u000b".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = m; length > i; i += s) {
            char c2 = cArr[i];
            switch (i % 5) {
                case m /*0*/:
                    i2 = 81;
                    break;
                case s /*1*/:
                    i2 = 83;
                    break;
                case p /*2*/:
                    i2 = 16;
                    break;
                case f /*3*/:
                    i2 = 13;
                    break;
                default:
                    i2 = 65;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[s] = new String(cArr).intern();
        toCharArray = "qv$i".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = m; length > i; i += s) {
            c2 = cArr[i];
            switch (i % 5) {
                case m /*0*/:
                    i2 = 81;
                    break;
                case s /*1*/:
                    i2 = 83;
                    break;
                case p /*2*/:
                    i2 = 16;
                    break;
                case f /*3*/:
                    i2 = 13;
                    break;
                default:
                    i2 = 65;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[p] = new String(cArr).intern();
        toCharArray = "qv!)5\b~5<e%>=(pu't-d`wdE{tb4y\fkv!)5\u0002".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = m; length > i; i += s) {
            c2 = cArr[i];
            switch (i % 5) {
                case m /*0*/:
                    i2 = 81;
                    break;
                case s /*1*/:
                    i2 = 83;
                    break;
                case p /*2*/:
                    i2 = 16;
                    break;
                case f /*3*/:
                    i2 = 13;
                    break;
                default:
                    i2 = 65;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[f] = new String(cArr).intern();
        toCharArray = "qv=52qv=52".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = m; length2 > length; length += s) {
            c = cArr[length];
            switch (length % 5) {
                case m /*0*/:
                    i2 = 81;
                    break;
                case s /*1*/:
                    i2 = 83;
                    break;
                case p /*2*/:
                    i2 = 16;
                    break;
                case f /*3*/:
                    i2 = 13;
                    break;
                default:
                    i2 = 65;
                    break;
            }
            cArr[length] = (char) (i2 ^ c);
        }
        strArr[4] = new String(cArr).intern();
        z = strArr;
    }

    public String toString() {
        return l();
    }

    private char n() {
        switch (this.r) {
            case m /*0*/:
                return '-';
            case s /*1*/:
                return 'd';
            case p /*2*/:
                return 'l';
            default:
                return '?';
        }
    }

    public long g() {
        return this.c;
    }

    public boolean a() {
        return this.r == f;
    }

    public String f() {
        return this.u;
    }

    public void e(String str) {
        this.t = str;
    }

    public void a(int i) {
        this.r = i;
    }

    public String l() {
        return this.n;
    }

    public String d() {
        return this.k;
    }

    public boolean a(int i, int i2) {
        return this.l[i][i2];
    }

    public void a(String str) {
        this.e = str;
    }

    public String b() {
        return this.t;
    }

    public String e() {
        int i = a;
        Appendable stringBuilder = new StringBuilder();
        Formatter formatter = new Formatter(stringBuilder);
        stringBuilder.append(n());
        stringBuilder.append(b((int) m));
        stringBuilder.append(b((int) s));
        stringBuilder.append(b((int) p));
        String str = z[p];
        Object[] objArr = new Object[s];
        objArr[m] = Integer.valueOf(h());
        formatter.format(str, objArr);
        str = z[4];
        objArr = new Object[p];
        objArr[m] = c();
        objArr[s] = f();
        formatter.format(str, objArr);
        str = z[m];
        objArr = new Object[s];
        objArr[m] = Long.valueOf(g());
        formatter.format(str, objArr);
        Calendar k = k();
        if (k != null) {
            String str2 = z[f];
            Object[] objArr2 = new Object[s];
            objArr2[m] = k;
            formatter.format(str2, objArr2);
            str2 = z[s];
            objArr2 = new Object[s];
            objArr2[m] = k;
            formatter.format(str2, objArr2);
            stringBuilder.append(' ');
        }
        stringBuilder.append(' ');
        stringBuilder.append(d());
        formatter.close();
        String stringBuilder2 = stringBuilder.toString();
        if (i != 0) {
            K.b += s;
        }
        return stringBuilder2;
    }

    public void c(int i) {
        this.o = i;
    }

    public void a(Calendar calendar) {
        this.q = calendar;
    }

    public String c() {
        return this.e;
    }

    public int h() {
        return this.o;
    }

    public Calendar k() {
        return this.q;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String b(int r5) {
        /*
        r4 = this;
        r3 = 45;
        r0 = a;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = 0;
        r2 = r4.a(r5, r2);
        if (r2 == 0) goto L_0x0017;
    L_0x0010:
        r2 = 114; // 0x72 float:1.6E-43 double:5.63E-322;
        r1.append(r2);
        if (r0 == 0) goto L_0x001a;
    L_0x0017:
        r1.append(r3);
    L_0x001a:
        r2 = 1;
        r2 = r4.a(r5, r2);
        if (r2 == 0) goto L_0x0028;
    L_0x0021:
        r2 = 119; // 0x77 float:1.67E-43 double:5.9E-322;
        r1.append(r2);
        if (r0 == 0) goto L_0x002b;
    L_0x0028:
        r1.append(r3);
    L_0x002b:
        r2 = 2;
        r2 = r4.a(r5, r2);
        if (r2 == 0) goto L_0x0039;
    L_0x0032:
        r2 = 120; // 0x78 float:1.68E-43 double:5.93E-322;
        r1.append(r2);
        if (r0 == 0) goto L_0x003c;
    L_0x0039:
        r1.append(r3);
    L_0x003c:
        r0 = r1.toString();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.v.b(int):java.lang.String");
    }

    public void b(String str) {
        this.k = str;
    }

    public void a(int i, int i2, boolean z) {
        this.l[i][i2] = z;
    }

    public void c(String str) {
        this.u = str;
    }

    public void d(String str) {
        this.n = str;
    }

    public boolean m() {
        return this.r == 0;
    }

    public v() {
        int i = a;
        this.l = (boolean[][]) Array.newInstance(Boolean.TYPE, new int[]{f, f});
        this.n = null;
        this.r = f;
        this.o = m;
        this.c = -1;
        this.u = "";
        this.e = "";
        this.q = null;
        this.k = null;
        if (K.b != 0) {
            a = i + s;
        }
    }

    public boolean j() {
        return this.r == p;
    }

    public boolean i() {
        return this.r == s;
    }

    public int o() {
        return this.r;
    }

    public void a(long j) {
        this.c = j;
    }
}
