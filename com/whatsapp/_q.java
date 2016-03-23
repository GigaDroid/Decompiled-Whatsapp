package com.whatsapp;

import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class _q implements Runnable {
    private static final String z;
    final aqq a;

    static {
        char[] toCharArray = "4md\u0001j;ee\u000f\u007f6gd\r#2zs\u0018m0mr\n#!ix\u0006c6%e\u001cm0|;\fnozs\u001bx-zsEa+{e\u0001b%%}".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 66;
                    break;
                case at.g /*1*/:
                    i2 = 8;
                    break;
                case at.i /*2*/:
                    i2 = 22;
                    break;
                case at.o /*3*/:
                    i2 = arj.Theme_editTextStyle;
                    break;
                default:
                    i2 = 12;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    _q(aqq com_whatsapp_aqq) {
        this.a = com_whatsapp_aqq;
    }

    public void run() {
        Log.i(z);
        aqq.b(this.a).runOnUiThread(new ads(this));
    }
}
