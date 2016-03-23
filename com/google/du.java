package com.google;

import org.v;
import org.whispersystems.at;

final class du extends dV {
    private static final String z;

    static {
        char[] toCharArray = "# HO7\"".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 11;
                    break;
                case at.g /*1*/:
                    i2 = 19;
                    break;
                case at.i /*2*/:
                    i2 = 121;
                    break;
                case at.o /*3*/:
                    i2 = 127;
                    break;
                default:
                    i2 = 4;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    du(d_ d_Var) {
        super(d_Var);
    }

    protected int a(int i) {
        return i;
    }

    protected void c(StringBuilder stringBuilder, int i) {
        stringBuilder.append(z);
    }
}
