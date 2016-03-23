package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.whatsapp.preference.WaCheckBoxPreference;
import org.v;
import org.whispersystems.at;

class aip implements OnClickListener {
    private static final String z;
    final SettingsAccount a;

    static {
        char[] toCharArray = "2\u000e\r\u00166!\u0005;\u000f'6#\u000b\u0015#".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 66;
                    break;
                case at.g /*1*/:
                    i2 = 124;
                    break;
                case at.i /*2*/:
                    i2 = 100;
                    break;
                case at.o /*3*/:
                    i2 = 96;
                    break;
                default:
                    i2 = 87;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        WaCheckBoxPreference waCheckBoxPreference = (WaCheckBoxPreference) this.a.findPreference(z);
        if (waCheckBoxPreference != null) {
            waCheckBoxPreference.setChecked(true);
        }
    }

    aip(SettingsAccount settingsAccount) {
        this.a = settingsAccount;
    }
}
