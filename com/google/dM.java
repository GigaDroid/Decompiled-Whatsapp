package com.google;

import com.whatsapp.arj;
import org.v;
import org.whispersystems.at;

abstract class dM extends dt {
    private static final String z;

    static {
        char[] toCharArray = "6/B\n".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 30;
                    break;
                case at.g /*1*/:
                    i2 = 31;
                    break;
                case at.i /*2*/:
                    i2 = 115;
                    break;
                case at.o /*3*/:
                    i2 = 35;
                    break;
                default:
                    i2 = arj.Theme_radioButtonStyle;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    private static void a(StringBuilder stringBuilder, int i) {
        boolean z = dt.c;
        int i2 = 0;
        int i3 = 0;
        while (i2 < 13) {
            int charAt = stringBuilder.charAt(i2 + i) - 48;
            if ((i2 & 1) == 0) {
                charAt *= 3;
            }
            i3 += charAt;
            charAt = i2 + 1;
            if (z) {
                break;
            }
            i2 = charAt;
        }
        i3 = 10 - (i3 % 10);
        if (i3 == 10) {
            i3 = 0;
        }
        stringBuilder.append(i3);
    }

    protected final void b(StringBuilder stringBuilder, int i) {
        stringBuilder.append(z);
        int length = stringBuilder.length();
        stringBuilder.append('9');
        a(stringBuilder, i, length);
    }

    protected final void a(StringBuilder stringBuilder, int i, int i2) {
        boolean z = dt.c;
        int i3 = 0;
        while (i3 < 4) {
            int a = a().a((i3 * 10) + i, 10);
            if (a / 100 == 0) {
                stringBuilder.append('0');
            }
            if (a / 10 == 0) {
                stringBuilder.append('0');
            }
            stringBuilder.append(a);
            i3++;
            if (z) {
                break;
            }
        }
        a(stringBuilder, i2);
    }

    dM(d_ d_Var) {
        super(d_Var);
    }
}
