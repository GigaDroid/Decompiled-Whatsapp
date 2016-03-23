package com.whatsapp;

import android.text.TextUtils;
import org.v;
import org.whispersystems.at;

class a8 implements Runnable {
    private static final String z;
    final String a;
    final Settings b;

    static {
        char[] toCharArray = "ycf:LXd;,TI>&(P".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 57;
                    break;
                case at.g /*1*/:
                    i2 = 16;
                    break;
                case at.i /*2*/:
                    i2 = 72;
                    break;
                case at.o /*3*/:
                    i2 = 77;
                    break;
                default:
                    i2 = 36;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    a8(Settings settings, String str) {
        this.b = settings;
        this.a = str;
    }

    public void run() {
        if (TextUtils.equals(this.a, App.ad() + z)) {
            Settings.b(this.b).a(App.v);
        }
    }
}
