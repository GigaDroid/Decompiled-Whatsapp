package com.google;

import java.util.ArrayList;
import java.util.List;
import org.v;
import org.whispersystems.at;

final class bK {
    private static final String[] z;
    private final List a;
    private final boolean b;
    private final int c;

    static {
        String[] strArr = new String[2];
        String str = "o\u0011";
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
                        i3 = 20;
                        break;
                    case at.g /*1*/:
                        i3 = 49;
                        break;
                    case at.i /*2*/:
                        i3 = 122;
                        break;
                    case at.o /*3*/:
                        i3 = 59;
                        break;
                    default:
                        i3 = 8;
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
                    str = "4L";
                    obj = null;
            }
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof bK)) {
            return false;
        }
        bK bKVar = (bK) obj;
        if (this.a.equals(bKVar.a()) && this.b == bKVar.b) {
            return true;
        }
        return false;
    }

    boolean a(List list) {
        return this.a.equals(list);
    }

    public int hashCode() {
        return this.a.hashCode() ^ Boolean.valueOf(this.b).hashCode();
    }

    int b() {
        return this.c;
    }

    public String toString() {
        return z[0] + this.a + z[1];
    }

    bK(List list, int i, boolean z) {
        this.a = new ArrayList(list);
        this.c = i;
        this.b = z;
    }

    List a() {
        return this.a;
    }
}
