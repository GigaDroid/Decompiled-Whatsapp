package com.whatsapp;

import org.v;
import org.whispersystems.at;

class a2o implements Runnable {
    private static final String z;
    final adn a;
    final String b;
    final String c;

    static {
        char[] toCharArray = "cT$(/c".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 16;
                    break;
                case at.g /*1*/:
                    i2 = 32;
                    break;
                case at.i /*2*/:
                    i2 = 69;
                    break;
                case at.o /*3*/:
                    i2 = 92;
                    break;
                default:
                    i2 = 90;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void run() {
        App.as.g(this.b);
        App.c(this.c, this.b, z);
        App.p.M().post(new xy(this));
    }

    a2o(adn com_whatsapp_adn, String str, String str2) {
        this.a = com_whatsapp_adn;
        this.b = str;
        this.c = str2;
    }
}
