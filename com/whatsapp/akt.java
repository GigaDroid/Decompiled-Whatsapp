package com.whatsapp;

import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class akt implements Runnable {
    private static final String z;
    final String a;
    final ga b;
    final String c;

    static {
        char[] toCharArray = "PN?=GAR0?K\\O\"fEWS8=G\u001eN38GAW49\r@D%fOVR\"*EV\u0001".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 51;
                    break;
                case at.g /*1*/:
                    i2 = 33;
                    break;
                case at.i /*2*/:
                    i2 = 81;
                    break;
                case at.o /*3*/:
                    i2 = 75;
                    break;
                default:
                    i2 = 34;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    akt(ga gaVar, String str, String str2) {
        this.b = gaVar;
        this.a = str;
        this.c = str2;
    }

    public void run() {
        Log.i(z + this.a);
        ConversationsFragment.h(this.b.e).setText(this.c);
        ConversationsFragment.b(this.b.e).setText(this.a);
    }
}
