package com.whatsapp.protocol;

import org.v;
import org.whispersystems.at;

public class c3 {
    private static final String[] z;
    public final boolean a;
    public final String b;
    public final String c;

    static {
        String[] strArr = new String[3];
        String str = "\u0014jJ;OU\u0015A,\u001d";
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
                        i3 = 56;
                        break;
                    case at.g /*1*/:
                        i3 = 74;
                        break;
                    case at.i /*2*/:
                        i3 = 44;
                        break;
                    case at.o /*3*/:
                        i3 = 73;
                        break;
                    default:
                        i3 = 32;
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
                    str = "\u0014j^,MW>I\u0016JQ.\u0011";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "s/U\u0012I\\w";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public String toString() {
        return z[1] + this.b + z[0] + this.a + z[2] + this.c + "]";
    }

    public c3(String str, boolean z, String str2) {
        this.c = str;
        this.a = z;
        this.b = str2;
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        if (this.a) {
            i = 1231;
        } else {
            i = 1237;
        }
        i = ((this.b == null ? 0 : this.b.hashCode()) + ((i + 31) * 31)) * 31;
        if (this.c != null) {
            i2 = this.c.hashCode();
        }
        return i + i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        c3 c3Var = (c3) obj;
        if (this.a != c3Var.a) {
            return false;
        }
        if (this.b == null) {
            if (c3Var.b != null) {
                return false;
            }
        } else if (!this.b.equals(c3Var.b)) {
            return false;
        }
        if (this.c == null) {
            if (c3Var.c != null) {
                return false;
            }
            return true;
        } else if (this.c.equals(c3Var.c)) {
            return true;
        } else {
            return false;
        }
    }
}
