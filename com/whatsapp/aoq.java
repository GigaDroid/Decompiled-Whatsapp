package com.whatsapp;

import android.content.Intent;
import android.net.Uri;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;
import org.v;
import org.whispersystems.at;

class aoq implements OnPreferenceClickListener {
    private static final String[] z;
    final SettingsHelp a;

    static {
        String[] strArr = new String[2];
        String str = "m\u001b<9H?@g>LrA?!Zq\u001c)9K+\f'$\u0014i\n/(W*";
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
                        i3 = 5;
                        break;
                    case at.g /*1*/:
                        i3 = 111;
                        break;
                    case at.i /*2*/:
                        i3 = 72;
                        break;
                    case at.o /*3*/:
                        i3 = 73;
                        break;
                    default:
                        i3 = 59;
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
                    str = "d\u0001,;Tl\u000bf Uq\n&=\u0015d\f< TkA\u001e\u0000~R";
                    obj = null;
            }
        }
    }

    aoq(SettingsHelp settingsHelp) {
        this.a = settingsHelp;
    }

    public boolean onPreferenceClick(Preference preference) {
        this.a.startActivity(new Intent(z[1], Uri.parse(z[0])));
        return true;
    }
}
