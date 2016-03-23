package org;

import org.whispersystems.at;
import org.whispersystems.curve25519.d;

public class az {
    private static final String z;

    static {
        char[] toCharArray = "4q}*".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 86;
                    break;
                case at.g /*1*/:
                    i2 = 20;
                    break;
                case at.i /*2*/:
                    i2 = 14;
                    break;
                case at.o /*3*/:
                    i2 = 94;
                    break;
                default:
                    i2 = 66;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public static byte[] a(a9 a9Var, t tVar) {
        return a(a9Var, tVar.a);
    }

    public static byte[] a(a9 a9Var, aa aaVar) {
        return d.a(z).b(a9Var.a, aaVar.a);
    }
}
