package com.whatsapp.fieldstats;

import org.v;
import org.whispersystems.at;

public enum cz {
    ;
    
    public static final cz CALL_TOO_SHORT;
    private static final cz[] a;
    private static final String z;
    private final int b;

    static {
        char[] toCharArray = "h}^\u007f}\u007fs]lqcs@g".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 43;
                    break;
                case at.g /*1*/:
                    i2 = 60;
                    break;
                case at.i /*2*/:
                    i2 = 18;
                    break;
                case at.o /*3*/:
                    i2 = 51;
                    break;
                default:
                    i2 = 34;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
        CALL_TOO_SHORT = new cz(z, 0, 1);
        a = new cz[]{CALL_TOO_SHORT};
    }

    private cz(int i) {
        this.b = i;
    }

    public int getCode() {
        return this.b;
    }
}
