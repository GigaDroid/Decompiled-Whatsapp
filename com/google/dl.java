package com.google;

import org.v;
import org.whispersystems.at;

final class dl extends dM {
    private static final String z;

    static {
        char[] toCharArray = "\u0002A(,".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 42;
                    break;
                case at.g /*1*/:
                    i2 = 113;
                    break;
                case at.i /*2*/:
                    i2 = 25;
                    break;
                case at.o /*3*/:
                    i2 = 5;
                    break;
                default:
                    i2 = 52;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public String c() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(z);
        int length = stringBuilder.length();
        stringBuilder.append(a().a(4, 4));
        a(stringBuilder, 8, length);
        return a().a(stringBuilder, 48);
    }

    dl(d_ d_Var) {
        super(d_Var);
    }
}
