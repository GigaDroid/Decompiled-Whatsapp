package org;

import com.whatsapp.arj;
import org.whispersystems.at;

public class p extends Exception {
    public static int a = 0;
    private static final long serialVersionUID = -2516777155928793597L;
    private static final String z;
    private final String b;
    private final int c;

    static {
        char[] toCharArray = "fK".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 92;
                    break;
                case at.g /*1*/:
                    i2 = arj.Theme_seekBarStyle;
                    break;
                case at.i /*2*/:
                    i2 = 52;
                    break;
                case at.o /*3*/:
                    i2 = 27;
                    break;
                default:
                    i2 = 17;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public p(String str, int i) {
        int i2 = a;
        this.c = i;
        this.b = str;
        if (K.b != 0) {
            a = i2 + 1;
        }
    }

    public String getMessage() {
        int i = a;
        String str = this.b + z + this.c;
        if (i != 0) {
            K.b++;
        }
        return str;
    }
}
