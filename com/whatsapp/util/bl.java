package com.whatsapp.util;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import org.v;
import org.whispersystems.at;

final class bl {
    private static final String[] z;
    private x a;
    private boolean b;
    private final String c;
    final b6 d;
    private final long[] e;
    private long f;

    static {
        String[] strArr = new String[2];
        String str = "\u0006&$v";
        Object obj = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i2 = 0; length > i2; i2++) {
                int i3;
                char c = cArr[i2];
                switch (i2 % 5) {
                    case v.m /*0*/:
                        i3 = 40;
                        break;
                    case at.g /*1*/:
                        i3 = 82;
                        break;
                    case at.i /*2*/:
                        i3 = 73;
                        break;
                    case at.o /*3*/:
                        i3 = 6;
                        break;
                    default:
                        i3 = 20;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "]<,~dM1=cp\b8&sfF3%&xA<,<4";
                    obj = null;
            }
        }
    }

    static boolean d(bl blVar) {
        return blVar.b;
    }

    public File b(int i) {
        return new File(b6.c(this.d), this.c + "." + i + z[0]);
    }

    static long a(bl blVar, long j) {
        blVar.f = j;
        return j;
    }

    private IOException b(String[] strArr) {
        throw new IOException(z[1] + Arrays.toString(strArr));
    }

    public File a(int i) {
        return new File(b6.c(this.d), this.c + "." + i);
    }

    static x a(bl blVar, x xVar) {
        blVar.a = xVar;
        return xVar;
    }

    static boolean a(bl blVar, boolean z) {
        blVar.b = z;
        return z;
    }

    private void a(String[] strArr) {
        int i = Log.h;
        try {
            if (strArr.length != b6.e(this.d)) {
                throw b(strArr);
            }
            int i2 = 0;
            do {
                try {
                    if (i2 < strArr.length) {
                        this.e[i2] = Long.parseLong(strArr[i2]);
                        i2++;
                    } else {
                        return;
                    }
                } catch (NumberFormatException e) {
                    throw b(strArr);
                }
            } while (i == 0);
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    static x b(bl blVar) {
        return blVar.a;
    }

    static void a(bl blVar, String[] strArr) {
        blVar.a(strArr);
    }

    private bl(b6 b6Var, String str) {
        this.d = b6Var;
        this.c = str;
        this.e = new long[b6.e(b6Var)];
    }

    static String a(bl blVar) {
        return blVar.c;
    }

    static long[] e(bl blVar) {
        return blVar.e;
    }

    bl(b6 b6Var, String str, aa aaVar) {
        this(b6Var, str);
    }

    public String a() {
        int i = Log.h;
        StringBuilder stringBuilder = new StringBuilder();
        long[] jArr = this.e;
        int length = jArr.length;
        int i2 = 0;
        while (i2 < length) {
            stringBuilder.append(' ').append(jArr[i2]);
            i2++;
            if (i != 0) {
                break;
            }
        }
        return stringBuilder.toString();
    }

    static long c(bl blVar) {
        return blVar.f;
    }
}
