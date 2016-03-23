package com.whatsapp.protocol;

import org.v;
import org.whispersystems.at;

public class br {
    private static final String z;
    public long a;
    public String b;
    public int c;
    public boolean d;

    static {
        char[] toCharArray = "Vo/\u0015sVey\u0003z]!*\u0000~Kt*".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 63;
                    break;
                case at.g /*1*/:
                    i2 = 1;
                    break;
                case at.i /*2*/:
                    i2 = 89;
                    break;
                case at.o /*3*/:
                    i2 = 116;
                    break;
                default:
                    i2 = 31;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public br(String str, boolean z, int i, long j) {
        if (str == null || !(i == 1 || i == 2 || i == 3 || i == 4)) {
            try {
                throw new IllegalArgumentException(z);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        this.b = str;
        this.c = i;
        this.a = j;
        this.d = z;
    }

    public br(String str, boolean z, int i) {
        this(str, z, i, 0);
    }

    public br(String str, int i, long j) {
        this(str, false, i, j);
    }
}
