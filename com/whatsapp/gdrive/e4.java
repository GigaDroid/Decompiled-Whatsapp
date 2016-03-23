package com.whatsapp.gdrive;

import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class e4 implements Runnable {
    private static final String z;
    final bf a;

    static {
        char[] toCharArray = "\u000b{_b\u0011\u0016yX;\u001f\u001clB`\u001dWmNbU\u0015{Xe\u0019\u001f{\u0004e\u0010\u0017i\u0006x\u0017\fvBx\u001f".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 120;
                    break;
                case at.g /*1*/:
                    i2 = 30;
                    break;
                case at.i /*2*/:
                    i2 = 43;
                    break;
                case at.o /*3*/:
                    i2 = 22;
                    break;
                default:
                    i2 = 120;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    e4(bf bfVar) {
        this.a = bfVar;
    }

    public void run() {
        Log.i(z);
        SettingsGoogleDrive.q(this.a.c).setVisibility(8);
        SettingsGoogleDrive.p(this.a.c).setVisibility(8);
        SettingsGoogleDrive.e(this.a.c).setVisibility(8);
        SettingsGoogleDrive.d(this.a.c).setVisibility(8);
        SettingsGoogleDrive.u(this.a.c).setVisibility(8);
    }
}
