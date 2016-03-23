package com.whatsapp.gallerypicker;

import org.v;
import org.whispersystems.at;

public class ag {
    private static final String[] z;

    static {
        String[] strArr = new String[4];
        String str = "m~a\n#4";
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
                        i3 = 27;
                        break;
                    case at.g /*1*/:
                        i3 = 23;
                        break;
                    case at.i /*2*/:
                        i3 = 5;
                        break;
                    case at.o /*3*/:
                        i3 = 111;
                        break;
                    default:
                        i3 = 76;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "zgu\u0003%xvq\u0006#u8";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "zba\u0006#4";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "rzd\b)4";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public static boolean a(f fVar) {
        return a(fVar.d());
    }

    public static boolean d(f fVar) {
        return d(fVar.d());
    }

    public static boolean b(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith(z[0]);
    }

    public static boolean c(f fVar) {
        return b(fVar.d());
    }

    public static boolean c(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith(z[3]);
    }

    public static boolean a(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith(z[1]);
    }

    public static boolean d(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith(z[2]);
    }

    public static boolean b(f fVar) {
        return c(fVar.d());
    }
}
