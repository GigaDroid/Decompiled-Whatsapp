package com.google;

import org.v;
import org.whispersystems.at;

final class dU extends dM {
    private static final String z;

    static {
        char[] toCharArray = "*r8Q".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 2;
                    break;
                case at.g /*1*/:
                    i2 = 65;
                    break;
                case at.i /*2*/:
                    i2 = 1;
                    break;
                case at.o /*3*/:
                    i2 = 98;
                    break;
                default:
                    i2 = 119;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    dU(d_ d_Var) {
        super(d_Var);
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
        a = a().a(50, 10);
        if (a / 100 == 0) {
            stringBuilder.append('0');
        }
        if (a / 10 == 0) {
            stringBuilder.append('0');
        }
        stringBuilder.append(a);
        stringBuilder.append(a().a(60, null).b());
        String stringBuilder2 = stringBuilder.toString();
        if (z) {
            aK.a = !aK.a;
        }
        return stringBuilder2;
    }
}
