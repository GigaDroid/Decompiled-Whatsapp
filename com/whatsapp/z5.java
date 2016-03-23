package com.whatsapp;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.whatsapp.util.ap;
import org.v;
import org.whispersystems.at;

class z5 extends ap {
    private static final String[] z;
    final SettingsSecurity b;

    static {
        String[] strArr = new String[3];
        String str = "lv2\u0000";
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
                        i3 = 74;
                        break;
                    case at.g /*1*/:
                        i3 = 26;
                        break;
                    case at.i /*2*/:
                        i3 = 81;
                        break;
                    case at.o /*3*/:
                        i3 = 61;
                        break;
                    default:
                        i3 = 69;
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
                    str = "\"n%M6p5~J2=4&U$>i0M5dy>Pj9\u007f2H7#n(\u0002)-'";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "+t5O*#~\u007fT+>\u007f?Ik+y%T*$4\u0007t\u0000\u001d";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void a(View view) {
        App.a(this.b, new Intent(z[1], Uri.parse(z[2] + aqu.g() + z[0] + aqu.c())));
    }

    z5(SettingsSecurity settingsSecurity) {
        this.b = settingsSecurity;
    }
}
