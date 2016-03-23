package com.whatsapp;

import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class aeb implements OnPreferenceChangeListener {
    private static final String z;
    final SettingsChat a;

    static {
        char[] toCharArray = "\u007fXI\u0000\u0000bZN[\b|M\u0010\u0018\bbZH\u0015\u000ei\u0010^\u001c\bbZX\u0010F".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 12;
                    break;
                case at.g /*1*/:
                    i2 = 61;
                    break;
                case at.i /*2*/:
                    i2 = 61;
                    break;
                case at.o /*3*/:
                    i2 = 116;
                    break;
                default:
                    i2 = arj.Theme_radioButtonStyle;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public boolean onPreferenceChange(Preference preference, Object obj) {
        Log.i(z + ((String) obj));
        ListPreference listPreference = (ListPreference) preference;
        int findIndexOfValue = listPreference.findIndexOfValue((String) obj);
        preference.setSummary(listPreference.getEntries()[findIndexOfValue]);
        if (findIndexOfValue == 0) {
            obj = null;
        } else {
            String str = (String) obj;
        }
        aqu.a(obj);
        App.ab.c();
        this.a.finish();
        this.a.startActivity(this.a.getIntent());
        return true;
    }

    aeb(SettingsChat settingsChat) {
        this.a = settingsChat;
    }
}
