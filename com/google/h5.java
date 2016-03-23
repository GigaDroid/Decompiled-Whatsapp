package com.google;

import java.util.Arrays;
import org.v;
import org.whispersystems.at;

public final class h5 {
    private static final String[] z;
    private final ae a;
    private final String b;
    private final int c;

    static {
        String[] strArr = new String[3];
        String str = "\u00134,xx\r).tx1\u0011\"b~+|\u0018";
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
                        i3 = 67;
                        break;
                    case at.g /*1*/:
                        i3 = 92;
                        break;
                    case at.i /*2*/:
                        i3 = 67;
                        break;
                    case at.o /*3*/:
                        i3 = 22;
                        break;
                    default:
                        i3 = 29;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "\u0010(\"dic5-rx;|.cn7|!s=}ac&3";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "j|";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public String toString() {
        return z[0] + a() + "," + b() + z[1] + this.b;
    }

    public int b() {
        return this.c + this.b.length();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (!(obj instanceof h5)) {
                return false;
            }
            h5 h5Var = (h5) obj;
            try {
                if (this.b.equals(h5Var.b)) {
                    if (this.c == h5Var.c) {
                        try {
                            if (this.a.equals(h5Var.a)) {
                                return true;
                            }
                        } catch (IllegalArgumentException e) {
                            throw e;
                        }
                    }
                }
                return false;
            } catch (IllegalArgumentException e2) {
                throw e2;
            } catch (IllegalArgumentException e22) {
                throw e22;
            }
        } catch (IllegalArgumentException e222) {
            throw e222;
        }
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.c), this.b, this.a});
    }

    h5(int i, String str, ae aeVar) {
        if (i < 0) {
            throw new IllegalArgumentException(z[2]);
        } else if (str == null || aeVar == null) {
            try {
                throw new NullPointerException();
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } else {
            this.c = i;
            this.b = str;
            this.a = aeVar;
        }
    }

    public int a() {
        return this.c;
    }
}
