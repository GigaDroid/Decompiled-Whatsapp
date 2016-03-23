package com.whatsapp.gdrive;

import android.support.v4.app.FragmentTransaction;
import com.whatsapp.gdrive.SettingsGoogleDrive.AuthRequestDialogFragment;
import org.v;
import org.whispersystems.at;

class bz implements Runnable {
    private static final String z;
    final SettingsGoogleDrive a;
    final AuthRequestDialogFragment b;

    static {
        char[] toCharArray = "\u0012\u000f\u0006Dp\u0001\u001f\u0003YJ\u0000\u000e-HF\u0012\u0016\u001dK".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 115;
                    break;
                case at.g /*1*/:
                    i2 = 122;
                    break;
                case at.i /*2*/:
                    i2 = 114;
                    break;
                case at.o /*3*/:
                    i2 = 44;
                    break;
                default:
                    i2 = 47;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void run() {
        if (!fn.a(this.a)) {
            FragmentTransaction beginTransaction = this.a.getSupportFragmentManager().beginTransaction();
            beginTransaction.add(this.b, z);
            beginTransaction.commitAllowingStateLoss();
        }
    }

    bz(SettingsGoogleDrive settingsGoogleDrive, AuthRequestDialogFragment authRequestDialogFragment) {
        this.a = settingsGoogleDrive;
        this.b = authRequestDialogFragment;
    }
}
