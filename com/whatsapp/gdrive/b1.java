package com.whatsapp.gdrive;

import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class b1 implements Runnable {
    private static final String z;
    final String a;
    final bf b;

    static {
        char[] toCharArray = "<~\r_\u0019!|\n\u0006\u0017+i\u0010]\u0015`h\u001c_]\"~\nX\u0011(~Y".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 79;
                    break;
                case at.g /*1*/:
                    i2 = 27;
                    break;
                case at.i /*2*/:
                    i2 = 121;
                    break;
                case at.o /*3*/:
                    i2 = 43;
                    break;
                default:
                    i2 = 112;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void run() {
        Log.i(z + this.a);
        SettingsGoogleDrive.u(this.b.c).setText(this.a);
    }

    b1(bf bfVar, String str) {
        this.b = bfVar;
        this.a = str;
    }
}
