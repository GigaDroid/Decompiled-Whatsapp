package com.whatsapp;

import java.util.List;
import org.v;
import org.whispersystems.at;

public class s7 extends sc {
    private static final String[] z;
    String b;
    List c;

    static {
        String[] strArr = new String[2];
        String str = "J\u001d-\u0000r\u0001\r0\b+J";
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
                        i3 = arj.Theme_ratingBarStyle;
                        break;
                    case at.g /*1*/:
                        i3 = 126;
                        break;
                    case at.i /*2*/:
                        i3 = 69;
                        break;
                    case at.o /*3*/:
                        i3 = arj.Theme_buttonStyleSmall;
                        break;
                    default:
                        i3 = 17;
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
                    str = "\u001b\f\u001a\u0006~\u0004\n$\u0006e\u0019^&\nd\u0004\n\u007fE";
                    obj = null;
            }
        }
    }

    public String c() {
        return z[1] + this.c.size() + z[0] + this.b;
    }

    public s7(List list, String str) {
        this.c = list;
        this.b = str;
    }

    public void b() {
        App.a(this.c, this.b);
    }
}
