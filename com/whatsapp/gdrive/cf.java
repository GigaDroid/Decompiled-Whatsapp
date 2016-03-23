package com.whatsapp.gdrive;

import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class cf implements OnClickListener {
    private static final String z;
    final SettingsGoogleDrive a;

    static {
        char[] toCharArray = "-E\u0015O@0G\u0012\u0016N:R\bMLqC\u0000UJ;LLYH=K\u0014K\t9O\u000e\\E;\u0000\u0005I@(EAHL,V\bXL~O\u0003QL=TARZ~N\u0014WEr\u0000\u0014UL&P\u0004X];DO".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 94;
                    break;
                case at.g /*1*/:
                    i2 = 32;
                    break;
                case at.i /*2*/:
                    i2 = 97;
                    break;
                case at.o /*3*/:
                    i2 = 59;
                    break;
                default:
                    i2 = 41;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onClick(View view) {
        if (SettingsGoogleDrive.k(this.a) != null) {
            SettingsGoogleDrive.k(this.a).u();
            SettingsGoogleDrive.e(this.a).setVisibility(8);
            if (!GoogleDriveService.c) {
                return;
            }
        }
        Log.e(z);
    }

    cf(SettingsGoogleDrive settingsGoogleDrive) {
        this.a = settingsGoogleDrive;
    }
}
