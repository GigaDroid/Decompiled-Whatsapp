package com.whatsapp;

import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import com.whatsapp.preference.WaPrivacyPreference;
import org.v;
import org.whispersystems.at;

class aml implements OnPreferenceChangeListener {
    private static final String[] z;
    final SettingsPrivacy a;

    static {
        String[] strArr = new String[6];
        String str = "5\u0017`{)&\u001cV~<$\u0011|~";
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
                        i3 = 69;
                        break;
                    case at.g /*1*/:
                        i3 = arj.Theme_buttonStyleSmall;
                        break;
                    case at.i /*2*/:
                        i3 = 9;
                        break;
                    case at.o /*3*/:
                        i3 = 13;
                        break;
                    default:
                        i3 = 72;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "5\u0017`{)&\u001cVa)6\u0011V~- \u000b";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "5\u0017`{)&\u001cV}:*\u0003`a-\u001a\u0015ab<*";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = ")\u0004zy";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "6\u0011hy=6";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "5\u0017fk!)\u0000";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    aml(SettingsPrivacy settingsPrivacy) {
        this.a = settingsPrivacy;
    }

    public boolean onPreferenceChange(Preference preference, Object obj) {
        if (App.Q()) {
            WaPrivacyPreference waPrivacyPreference = (WaPrivacyPreference) preference;
            int findIndexOfValue = waPrivacyPreference.findIndexOfValue((String) obj);
            waPrivacyPreference.setSummary(waPrivacyPreference.getEntries()[findIndexOfValue].toString());
            waPrivacyPreference.a(true);
            waPrivacyPreference.setEnabled(false);
            String key = preference.getKey();
            String str = null;
            if (z[2].equals(key)) {
                str = z[4];
            } else if (z[3].equals(key)) {
                str = z[1];
            } else if (z[0].equals(key)) {
                str = z[5];
            }
            String a = SettingsPrivacy.a(findIndexOfValue);
            SettingsPrivacy.b().put(str, new b9(str, a));
            App.a_();
            App.b(str, a);
            SettingsPrivacy.e().removeCallbacks(SettingsPrivacy.a());
            SettingsPrivacy.e().postDelayed(SettingsPrivacy.a(), 20000);
            return true;
        }
        App.a(this.a, 2131230925, 0);
        return false;
    }
}
