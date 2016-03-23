package com.google;

import org.v;
import org.whispersystems.at;

final class dY extends dM {
    private static final String z;

    static {
        char[] toCharArray = "\u0011\u007f'*".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 57;
                    break;
                case at.g /*1*/:
                    i2 = 76;
                    break;
                case at.i /*2*/:
                    i2 = 30;
                    break;
                case at.o /*3*/:
                    i2 = 24;
                    break;
                default:
                    i2 = 87;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public String c() {
        boolean z = dt.c;
        if (b().d() < 48) {
            throw aN.a();
        }
        StringBuilder stringBuilder = new StringBuilder();
        b(stringBuilder, 8);
        int a = a().a(48, 2);
        stringBuilder.append(z);
        stringBuilder.append(a);
        stringBuilder.append(')');
        stringBuilder.append(a().a(50, null).b());
        String stringBuilder2 = stringBuilder.toString();
        if (aK.a) {
            dt.c = !z;
        }
        return stringBuilder2;
    }

    dY(d_ d_Var) {
        super(d_Var);
    }
}
