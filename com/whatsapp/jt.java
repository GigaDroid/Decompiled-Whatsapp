package com.whatsapp;

import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

final class jt implements Runnable {
    private static final String z;

    static {
        char[] toCharArray = "3\u000ew\u0015\u001a=\fd_\u000f+\u0010d\u0015\u00187\u0012s[S7\fuU\u000e".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 82;
                    break;
                case at.g /*1*/:
                    i2 = 126;
                    break;
                case at.i /*2*/:
                    i2 = 7;
                    break;
                case at.o /*3*/:
                    i2 = 58;
                    break;
                default:
                    i2 = 124;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void run() {
        try {
            App.aA.onChange(true);
        } catch (Throwable e) {
            Log.c(z, e);
        }
    }

    jt() {
    }
}
