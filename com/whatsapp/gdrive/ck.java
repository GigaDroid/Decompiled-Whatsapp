package com.whatsapp.gdrive;

import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class ck implements Runnable {
    private static final String z;
    final bx a;

    static {
        char[] toCharArray = "yk\tp\u001cdi\u000e)\u0012n|\u0014r\u0010%o\bp\u001d'|\u0018u\u0000o}\t$\u0000do\u001fh\u0010*z\u0012$\u0014im\u0018w\u0006*".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 10;
                    break;
                case at.g /*1*/:
                    i2 = 14;
                    break;
                case at.i /*2*/:
                    i2 = 125;
                    break;
                case at.o /*3*/:
                    i2 = 4;
                    break;
                default:
                    i2 = 117;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    ck(bx bxVar) {
        this.a = bxVar;
    }

    public void run() {
        Log.e(z + this.a.c);
        this.a.a.a(2131231964);
        GoogleDriveService.c(0);
        SettingsGoogleDrive.n(this.a.a).setText(SettingsGoogleDrive.i(this.a.a)[SettingsGoogleDrive.f(this.a.a)]);
    }
}
