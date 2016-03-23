package com.whatsapp;

import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class aet implements Runnable {
    private static final String z;
    final RegisterName a;

    static {
        char[] toCharArray = "kY\u001f<7mY\n;%tYW1-xP\u00172kpR\u0011!4kS\u001f'!jOW'!tS\u000e0 p]\u0014:#".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 25;
                    break;
                case at.g /*1*/:
                    i2 = 60;
                    break;
                case at.i /*2*/:
                    i2 = 120;
                    break;
                case at.o /*3*/:
                    i2 = 85;
                    break;
                default:
                    i2 = 68;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    aet(RegisterName registerName) {
        this.a = registerName;
    }

    public void run() {
        Log.i(z);
        this.a.removeDialog(0);
    }
}
