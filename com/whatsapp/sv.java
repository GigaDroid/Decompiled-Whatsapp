package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.whatsapp.preference.WaCheckBoxPreference;
import org.v;
import org.whispersystems.at;

class sv implements OnCancelListener {
    private static final String z;
    final SettingsAccount a;

    static {
        char[] toCharArray = "B/z*cQ$L3rF\u0002|)v".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 50;
                    break;
                case at.g /*1*/:
                    i2 = 93;
                    break;
                case at.i /*2*/:
                    i2 = 19;
                    break;
                case at.o /*3*/:
                    i2 = 92;
                    break;
                default:
                    i2 = 2;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    sv(SettingsAccount settingsAccount) {
        this.a = settingsAccount;
    }

    public void onCancel(DialogInterface dialogInterface) {
        WaCheckBoxPreference waCheckBoxPreference = (WaCheckBoxPreference) this.a.findPreference(z);
        if (waCheckBoxPreference != null) {
            waCheckBoxPreference.setChecked(true);
        }
    }
}
