package com.whatsapp;

import com.whatsapp.protocol.b5;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

final class wt implements b5 {
    private static final String z;
    final int a;

    static {
        char[] toCharArray = "0\u0003L]B>\u0000I\u0002R0\u0007Y]E%\u0012[\u0017\u00164\u0001N\u001dDl".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 81;
                    break;
                case at.g /*1*/:
                    i2 = 115;
                    break;
                case at.i /*2*/:
                    i2 = 60;
                    break;
                case at.o /*3*/:
                    i2 = 114;
                    break;
                default:
                    i2 = 54;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    wt(int i) {
        this.a = i;
    }

    public void a(int i) {
        Log.i(z + i + " " + this.a);
    }
}
