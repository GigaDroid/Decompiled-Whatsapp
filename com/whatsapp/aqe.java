package com.whatsapp;

import com.whatsapp.util.c2;
import java.io.File;
import org.v;
import org.whispersystems.at;

class aqe implements Runnable {
    private static final String z;
    final App a;

    static {
        char[] toCharArray = "><U\u0018\t1/WR\u0007+)\nV\u0016/.PY\u00023)".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 95;
                    break;
                case at.g /*1*/:
                    i2 = 76;
                    break;
                case at.i /*2*/:
                    i2 = 37;
                    break;
                case at.o /*3*/:
                    i2 = 55;
                    break;
                default:
                    i2 = arj.Theme_checkboxStyle;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void run() {
        try {
            c2.a(3, z, new File(App.z().getPackageManager().getApplicationInfo(App.z().getPackageName(), 0).dataDir));
        } catch (Throwable e) {
            throw new Error(e);
        }
    }

    aqe(App app) {
        this.a = app;
    }
}
