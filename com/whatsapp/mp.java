package com.whatsapp;

import org.v;
import org.whispersystems.at;

class mp implements Runnable {
    private static final String z;
    final String a;
    final String b;
    final String c;
    final adn d;
    final long e;

    static {
        char[] toCharArray = "3\u0016x\f53".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 64;
                    break;
                case at.g /*1*/:
                    i2 = 98;
                    break;
                case at.i /*2*/:
                    i2 = 25;
                    break;
                case at.o /*3*/:
                    i2 = 120;
                    break;
                default:
                    i2 = 64;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    mp(adn com_whatsapp_adn, String str, long j, String str2, String str3) {
        this.d = com_whatsapp_adn;
        this.b = str;
        this.e = j;
        this.c = str2;
        this.a = str3;
    }

    public void run() {
        App.as.a(this.b, this.e, this.c);
        App.c(this.a, this.b, z);
        App.p.M().post(new a2h(this));
    }
}
