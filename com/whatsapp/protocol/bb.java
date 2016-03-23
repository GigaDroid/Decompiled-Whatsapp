package com.whatsapp.protocol;

import com.whatsapp.arj;
import org.v;
import org.whispersystems.at;

public class bb {
    private static final String z;
    public String a;
    public String b;

    static {
        char[] toCharArray = ":\u0003BFl7G\u0003Dv:\b\f\u0007a2\t\fHvs\u0005\u0007\u0007l&\u000b\u000e".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 83;
                    break;
                case at.g /*1*/:
                    i2 = arj.Theme_checkedTextViewStyle;
                    break;
                case at.i /*2*/:
                    i2 = 98;
                    break;
                case at.o /*3*/:
                    i2 = 39;
                    break;
                default:
                    i2 = 2;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public bb(String str, String str2) {
        if (str == null || str2 == null) {
            try {
                throw new IllegalArgumentException(z);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        this.b = str;
        this.a = str2;
    }
}
