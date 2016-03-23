package com.whatsapp.gdrive;

import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class f4 implements Runnable {
    private static final String z;
    final int a;
    final bf b;

    static {
        char[] toCharArray = "^<I\u0016-C>NO#I+T\u0014!\u00006_\u0011!_/X\u0010k@<Y\u000b%\u0000+X\u00110B+XO!_+R\u0010k".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 45;
                    break;
                case at.g /*1*/:
                    i2 = 89;
                    break;
                case at.i /*2*/:
                    i2 = 61;
                    break;
                case at.o /*3*/:
                    i2 = 98;
                    break;
                default:
                    i2 = 68;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    f4(bf bfVar, int i) {
        this.b = bfVar;
        this.a = i;
    }

    public void run() {
        Log.i(z + fn.a(this.a));
        SettingsGoogleDrive.a(this.b.c, this.a);
    }
}
