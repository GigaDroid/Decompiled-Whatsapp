package com.google;

import java.io.IOException;
import org.v;
import org.whispersystems.at;

public class eH extends IOException {
    private static final long serialVersionUID = 3196188060225107702L;
    private static final String z;
    private final int a;
    private final int b;

    static {
        char[] toCharArray = "L\u0010".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 118;
                    break;
                case at.g /*1*/:
                    i2 = 48;
                    break;
                case at.i /*2*/:
                    i2 = 4;
                    break;
                case at.o /*3*/:
                    i2 = 24;
                    break;
                default:
                    i2 = 93;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public eH(String str) {
        this(-1, -1, str);
    }

    public eH(int i, int i2, String str) {
        super(Integer.toString(i) + ":" + i2 + z + str);
        this.a = i;
        this.b = i2;
    }

    public int a() {
        return this.b;
    }

    public int b() {
        return this.a;
    }
}
