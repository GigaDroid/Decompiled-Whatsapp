package org;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.whispersystems.at;

public class l implements Serializable, Comparable {
    protected static final long c = 2085978496000L;
    protected static final long d = -2208988800000L;
    public static boolean f = false;
    public static final String g;
    private static final long serialVersionUID = 8139806907588338737L;
    private static final String[] z;
    private final long a;
    private DateFormat b;
    private DateFormat e;

    static {
        int i;
        String[] strArr = new String[4];
        char[] toCharArray = ">\u0014\u0011](6\u001c\u0019Ql\u001fq-\bq\u0002q\u001c92\u0016<n\u0002{U\u0002\u0007\"".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 123;
                    break;
                case at.g /*1*/:
                    i2 = 81;
                    break;
                case at.i /*2*/:
                    i2 = 84;
                    break;
                case at.o /*3*/:
                    i2 = 113;
                    break;
                default:
                    i2 = 8;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        g = new String(cArr).intern();
        toCharArray = ">\u0014\u0011](6\u001c\u0019Ql\u001fq-\bq\u0002q\u001c92\u0016<n\u0002{U\u0002\u0007\"".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 123;
                    break;
                case at.g /*1*/:
                    i2 = 81;
                    break;
                case at.i /*2*/:
                    i2 = 84;
                    break;
                case at.o /*3*/:
                    i2 = 113;
                    break;
                default:
                    i2 = 8;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = ">\u0014\u0011](6\u001c\u0019Ql\u001fq-\bq\u0002q\u001c92\u0016<n\u0002{U\u0002\u0007\"(\\\u0004\u00002/".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 123;
                    break;
                case at.g /*1*/:
                    i2 = 81;
                    break;
                case at.i /*2*/:
                    i2 = 84;
                    break;
                case at.o /*3*/:
                    i2 = 113;
                    break;
                default:
                    i2 = 8;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = ".\u0005\u0017".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 123;
                    break;
                case at.g /*1*/:
                    i2 = 81;
                    break;
                case at.i /*2*/:
                    i2 = 84;
                    break;
                case at.o /*3*/:
                    i2 = 113;
                    break;
                default:
                    i2 = 8;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[2] = new String(cArr).intern();
        toCharArray = "\u0015$8\u001d".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case v.m /*0*/:
                    i2 = 123;
                    break;
                case at.g /*1*/:
                    i2 = 81;
                    break;
                case at.i /*2*/:
                    i2 = 84;
                    break;
                case at.o /*3*/:
                    i2 = 113;
                    break;
                default:
                    i2 = 8;
                    break;
            }
            cArr[length] = (char) (i2 ^ c);
        }
        strArr[3] = new String(cArr).intern();
        z = strArr;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static long d(long r10) {
        /*
        r6 = 2085978496000; // 0x1e5ae01dc00 float:-2.9526603E-11 double:1.030610312837E-311;
        r8 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r0 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1));
        if (r0 >= 0) goto L_0x0034;
    L_0x000b:
        r0 = 1;
        r4 = r0;
    L_0x000d:
        if (r4 == 0) goto L_0x001a;
    L_0x000f:
        r0 = -2208988800000; // 0xfffffdfdae01dc00 float:-2.9526603E-11 double:NaN;
        r0 = r10 - r0;
        r2 = f;
        if (r2 == 0) goto L_0x001c;
    L_0x001a:
        r0 = r10 - r6;
    L_0x001c:
        r2 = r0 / r8;
        r0 = r0 % r8;
        r6 = 4294967296; // 0x100000000 float:0.0 double:2.121995791E-314;
        r0 = r0 * r6;
        r6 = r0 / r8;
        if (r4 == 0) goto L_0x0037;
    L_0x0029:
        r0 = 2147483648; // 0x80000000 float:-0.0 double:1.0609978955E-314;
        r0 = r0 | r2;
    L_0x002f:
        r2 = 32;
        r0 = r0 << r2;
        r0 = r0 | r6;
        return r0;
    L_0x0034:
        r0 = 0;
        r4 = r0;
        goto L_0x000d;
    L_0x0037:
        r0 = r2;
        goto L_0x002f;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.l.d(long):long");
    }

    public static l b(String str) {
        return new l(a(str));
    }

    public l(String str) {
        this.a = a(str);
    }

    private static void a(StringBuilder stringBuilder, long j) {
        boolean z = f;
        String toHexString = Long.toHexString(j);
        int length = toHexString.length();
        while (length < 8) {
            stringBuilder.append('0');
            length++;
            if (z) {
                break;
            }
        }
        stringBuilder.append(toHexString);
    }

    public boolean equals(Object obj) {
        try {
            if (!(obj instanceof l)) {
                return false;
            }
            if (this.a == ((l) obj).e()) {
                return true;
            }
            return false;
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    public static String c(long j) {
        StringBuilder stringBuilder = new StringBuilder();
        a(stringBuilder, (j >>> 32) & 4294967295L);
        stringBuilder.append('.');
        a(stringBuilder, j & 4294967295L);
        return stringBuilder.toString();
    }

    public int compareTo(Object obj) {
        return a((l) obj);
    }

    public String toString() {
        return c(this.a);
    }

    public int hashCode() {
        return (int) (this.a ^ (this.a >>> 32));
    }

    public int a(l lVar) {
        long j = this.a;
        long j2 = lVar.a;
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    public long b() {
        return a(this.a);
    }

    public long h() {
        return this.a & 4294967295L;
    }

    public l(long j) {
        this.a = j;
    }

    public String d() {
        try {
            if (this.b == null) {
                this.b = new SimpleDateFormat(z[1], Locale.US);
                this.b.setTimeZone(TimeZone.getTimeZone(z[2]));
            }
            return this.b.format(f());
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static l g() {
        return b(System.currentTimeMillis());
    }

    public String c() {
        try {
            if (this.e == null) {
                this.e = new SimpleDateFormat(z[0], Locale.US);
                this.e.setTimeZone(TimeZone.getDefault());
            }
            return this.e.format(f());
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public long e() {
        return this.a;
    }

    public long a() {
        return (this.a >>> 32) & 4294967295L;
    }

    public l(Date date) {
        long j;
        if (date == null) {
            j = 0;
        } else {
            j = d(date.getTime());
        }
        this.a = j;
    }

    protected static long a(String str) {
        if (str == null) {
            try {
                throw new NumberFormatException(z[3]);
            } catch (NumberFormatException e) {
                throw e;
            }
        }
        int indexOf = str.indexOf(46);
        if (indexOf == -1) {
            try {
                if (str.length() == 0) {
                    return 0;
                }
                return Long.parseLong(str, 16) << 32;
            } catch (NumberFormatException e2) {
                throw e2;
            }
        }
        return Long.parseLong(str.substring(indexOf + 1), 16) | (Long.parseLong(str.substring(0, indexOf), 16) << 32);
    }

    public Date f() {
        return new Date(a(this.a));
    }

    public static l b(long j) {
        return new l(d(j));
    }

    public static long a(long j) {
        long j2 = (j >>> 32) & 4294967295L;
        long round = Math.round((((double) (4294967295L & j)) * 1000.0d) / 4.294967296E9d);
        if ((2147483648L & j2) == 0) {
            return ((j2 * 1000) + c) + round;
        }
        return ((j2 * 1000) + d) + round;
    }
}
