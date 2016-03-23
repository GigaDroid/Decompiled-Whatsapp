package com.whatsapp;

import android.os.Build;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import org.v;
import org.whispersystems.at;

class ai9 implements OnPreferenceChangeListener {
    private static final String[] z;
    final SettingsJidNotificationActivity a;
    final a3b b;

    static {
        String[] strArr = new String[3];
        String str = "l~ek^Rel";
        Object obj = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i2 = 0; length > i2; i2++) {
                int i3;
                char c = cArr[i2];
                switch (i2 % 5) {
                    case v.m /*0*/:
                        i3 = 59;
                        break;
                    case at.g /*1*/:
                        i3 = 23;
                        break;
                    case at.i /*2*/:
                        i3 = 9;
                        break;
                    case at.o /*3*/:
                        i3 = 15;
                        break;
                    default:
                        i3 = 56;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "\u000b'OI\b\u000b";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u007frzfJ^";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public boolean onPreferenceChange(Preference preference, Object obj) {
        if ((Build.MODEL.contains(z[1]) || Build.MODEL.contains(z[0])) && !obj.toString().equals(z[2])) {
            this.a.a(2131231391);
        }
        ListPreference listPreference = (ListPreference) preference;
        preference.setSummary(listPreference.getEntries()[listPreference.findIndexOfValue((String) obj)].toString());
        this.b.e(SettingsJidNotificationActivity.b(this.a), obj.toString());
        return true;
    }

    ai9(SettingsJidNotificationActivity settingsJidNotificationActivity, a3b com_whatsapp_a3b) {
        this.a = settingsJidNotificationActivity;
        this.b = com_whatsapp_a3b;
    }
}
