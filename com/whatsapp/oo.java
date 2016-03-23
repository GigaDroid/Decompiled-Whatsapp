package com.whatsapp;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import org.v;
import org.whispersystems.at;

class oo implements OnCheckedChangeListener {
    private static final String[] z;
    final SettingsSecurity a;

    static {
        String[] strArr = new String[2];
        String str = "YK\u0004)PCZ\u001e\u0003LEZ\u000e:KIO\u00135MD]";
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
                        i3 = 42;
                        break;
                    case at.g /*1*/:
                        i3 = 46;
                        break;
                    case at.i /*2*/:
                        i3 = arj.Theme_checkedTextViewStyle;
                        break;
                    case at.o /*3*/:
                        i3 = 92;
                        break;
                    default:
                        i3 = 34;
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
                    str = "IA\nrUBO\u0013/CZ^8,POH\u0002.GDM\u0002/";
                    obj = null;
            }
        }
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        App.z().getSharedPreferences(z[1], 0).edit().putBoolean(z[0], z).commit();
    }

    oo(SettingsSecurity settingsSecurity) {
        this.a = settingsSecurity;
    }
}
