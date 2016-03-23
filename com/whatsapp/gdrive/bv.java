package com.whatsapp.gdrive;

import com.whatsapp.util.bq;
import org.v;
import org.whispersystems.at;

final class bv extends bs {
    private static final String z;

    static {
        char[] toCharArray = "b\nX#m~\u0004\u00017mb\u000bE kc\u0001".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 12;
                    break;
                case at.g /*1*/:
                    i2 = 111;
                    break;
                case at.i /*2*/:
                    i2 = 44;
                    break;
                case at.o /*3*/:
                    i2 = 84;
                    break;
                default:
                    i2 = 2;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public boolean a() {
        return GoogleDriveService.d();
    }

    public String toString() {
        return z;
    }

    bv() {
        bq.a(new be(this));
    }
}
