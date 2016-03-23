package com.whatsapp.gdrive;

import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class an implements Runnable {
    private static final String z;
    final bf a;

    static {
        char[] toCharArray = "(Uw\u0005/5Wp\\!?Bj\u0007#tCf\u0005k6Up\u0002'<U,\u0002.4G.\u0013'8[v\u0001k9Ew\u0005)5".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 91;
                    break;
                case at.g /*1*/:
                    i2 = 48;
                    break;
                case at.i /*2*/:
                    i2 = 3;
                    break;
                case at.o /*3*/:
                    i2 = 113;
                    break;
                default:
                    i2 = 70;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void run() {
        Log.i(z);
        SettingsGoogleDrive.q(this.a.c).setVisibility(0);
        SettingsGoogleDrive.p(this.a.c).setVisibility(8);
        SettingsGoogleDrive.e(this.a.c).setVisibility(8);
        SettingsGoogleDrive.d(this.a.c).setVisibility(8);
        SettingsGoogleDrive.u(this.a.c).setVisibility(8);
        SettingsGoogleDrive.q(this.a.c).setOnClickListener(SettingsGoogleDrive.c(this.a.c));
        SettingsGoogleDrive.r(this.a.c);
    }

    an(bf bfVar) {
        this.a = bfVar;
    }
}
