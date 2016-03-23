package com.whatsapp.gdrive;

import com.whatsapp.arj;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class di implements Runnable {
    private static final String z;
    final bf a;
    final int b;

    static {
        char[] toCharArray = "IO\b\u001drTM\u000fD|^X\u0015\u001f~\u0017E\u001e\u001a~H\\\u0019\u001b4XK\u001f\u0002nJ\u0007\u0019\u001biUXS".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 58;
                    break;
                case at.g /*1*/:
                    i2 = 42;
                    break;
                case at.i /*2*/:
                    i2 = 124;
                    break;
                case at.o /*3*/:
                    i2 = arj.Theme_radioButtonStyle;
                    break;
                default:
                    i2 = 27;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    di(bf bfVar, int i) {
        this.a = bfVar;
        this.b = i;
    }

    public void run() {
        Log.i(z + fn.a(this.b));
        SettingsGoogleDrive.b(this.a.c, this.b);
    }
}
