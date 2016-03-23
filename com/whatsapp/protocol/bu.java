package com.whatsapp.protocol;

import com.whatsapp.arj;
import org.v;
import org.whispersystems.at;

public class bu {
    private static bq a;
    private static final String z;

    static {
        char[] toCharArray = "\u0013Qx\u0007\u00152H1\u0013\u0002/\u001e;\u0018\t;W?\u0002\u00158Zy".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 93;
                    break;
                case at.g /*1*/:
                    i2 = 62;
                    break;
                case at.i /*2*/:
                    i2 = 88;
                    break;
                case at.o /*3*/:
                    i2 = 119;
                    break;
                default:
                    i2 = arj.Theme_checkedTextViewStyle;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
        a = null;
    }

    public static bq a() {
        try {
            if (a != null) {
                return a;
            }
            throw new IllegalStateException(z);
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public static void a(bq bqVar) {
        a = bqVar;
    }
}
