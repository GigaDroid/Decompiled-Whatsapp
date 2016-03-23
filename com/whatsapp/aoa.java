package com.whatsapp;

import android.preference.CheckBoxPreference;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class aoa implements OnPreferenceClickListener {
    private static final String z;
    final CheckBoxPreference a;
    final SettingsDataUsage b;

    static {
        char[] toCharArray = "}v\u0007\u001aNgv\u00195\u0005jm\u000f5\u0014xx\t\u000fA".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 11;
                    break;
                case at.g /*1*/:
                    i2 = 25;
                    break;
                case at.i /*2*/:
                    i2 = 110;
                    break;
                case at.o /*3*/:
                    i2 = arj.Theme_ratingBarStyle;
                    break;
                default:
                    i2 = 97;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    aoa(SettingsDataUsage settingsDataUsage, CheckBoxPreference checkBoxPreference) {
        this.b = settingsDataUsage;
        this.a = checkBoxPreference;
    }

    public boolean onPreferenceClick(Preference preference) {
        Log.i(z + this.a.isChecked());
        return true;
    }
}
