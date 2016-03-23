package com.whatsapp;

import android.content.Intent;
import android.net.Uri;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;
import com.whatsapp.fieldstats.k;
import org.v;
import org.whispersystems.at;

class aqf implements OnPreferenceClickListener {
    private static final String[] z;
    final SettingsHelp a;

    static {
        String[] strArr = new String[2];
        String str = "AA,\f\u0001IKf\u0017\u0000TJ&\n@AL<\u0017\u0001N\u0001\u001e7+w";
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
                        i3 = 32;
                        break;
                    case at.g /*1*/:
                        i3 = 47;
                        break;
                    case at.i /*2*/:
                        i3 = 72;
                        break;
                    case at.o /*3*/:
                        i3 = 126;
                        break;
                    default:
                        i3 = 110;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "H[<\u000e\u001d\u001a\u0000g\t\u0019W\u0001?\u0016\u000fT\\)\u000e\u001e\u000eL'\u0013AFN9Q";
                    obj = null;
            }
        }
    }

    public boolean onPreferenceClick(Preference preference) {
        nf.a(k.FAQ);
        this.a.startActivity(new Intent(z[0], Uri.parse(z[1])));
        return true;
    }

    aqf(SettingsHelp settingsHelp) {
        this.a = settingsHelp;
    }
}
