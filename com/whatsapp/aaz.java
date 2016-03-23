package com.whatsapp;

import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

final class aaz implements Runnable {
    private static final String z;
    final fs a;
    private String b;
    private String c;

    static {
        char[] toCharArray = "HBf\u001bjVSf\u0005hJ\u001fw\u0001b]_v\u001c ".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 56;
                    break;
                case at.g /*1*/:
                    i2 = 48;
                    break;
                case at.i /*2*/:
                    i2 = 3;
                    break;
                case at.o /*3*/:
                    i2 = arj.Theme_editTextStyle;
                    break;
                default:
                    i2 = 15;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    aaz(fs fsVar, String str, String str2) {
        this.a = fsVar;
        this.b = str;
        this.c = str2;
    }

    public void run() {
        if (((x8) fs.a(this.a).get(this.b)) != null) {
            Log.i(z + this.b + " " + this.c);
            this.a.b(this.b, this.c);
            App.i(this.b);
        }
    }
}
