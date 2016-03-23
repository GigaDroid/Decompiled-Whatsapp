package com.whatsapp;

import org.v;
import org.whispersystems.at;

class t7 implements Runnable {
    private static final String z;
    final qo a;

    static {
        char[] toCharArray = "n\u0010kkSO\u00176}K^M+yO".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 46;
                    break;
                case at.g /*1*/:
                    i2 = 99;
                    break;
                case at.i /*2*/:
                    i2 = 69;
                    break;
                case at.o /*3*/:
                    i2 = 28;
                    break;
                default:
                    i2 = 59;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    t7(qo qoVar) {
        this.a = qoVar;
    }

    public void run() {
        i1.b(this.a.a).aW.remove(App.ad() + z);
    }
}
