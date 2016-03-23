package com.whatsapp.notification;

import com.whatsapp.auv;
import java.util.List;
import org.v;
import org.whispersystems.at;

final class ad extends an {
    private static final String z;

    static {
        char[] toCharArray = "B\u007fGgMU7F}U\u0011tI~M\u0011YGP@UpM`".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 49;
                    break;
                case at.g /*1*/:
                    i2 = 23;
                    break;
                case at.i /*2*/:
                    i2 = 40;
                    break;
                case at.o /*3*/:
                    i2 = 18;
                    break;
                default:
                    i2 = 33;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public List a() {
        return null;
    }

    ad(u uVar) {
        this();
    }

    private ad() {
    }

    public void a(int i) {
        auv.a(true, z);
    }
}
