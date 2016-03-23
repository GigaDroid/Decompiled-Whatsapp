package com.whatsapp;

import android.app.Activity;
import com.whatsapp.gdrive.GoogleDriveNewUserSetupActivity;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class aig extends ai6 {
    private static final String[] z;
    final RegisterName i;

    static {
        String[] strArr = new String[3];
        String str = "\u0014\u000e:AR\u0012\u000e/F@\u000b\u000erZD\u0015\u001f2ZD\u0002\u0002<DN\u0001D9GO\u0003";
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
                        i3 = arj.Theme_checkboxStyle;
                        break;
                    case at.g /*1*/:
                        i3 = arj.Theme_seekBarStyle;
                        break;
                    case at.i /*2*/:
                        i3 = 93;
                        break;
                    case at.o /*3*/:
                        i3 = 40;
                        break;
                    default:
                        i3 = 33;
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
                    str = "\u0014\u000e:AR\u0012\u000e/F@\u000b\u000erZD\u0015\u001f2ZD\u0002\u0002<DN\u0001D.CH\u0016";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0014\u000e:AR\u0012\u000e/F@\u000b\u000erZD\u0015\u001f2ZDI\u000f4IM\t\frD@\u0013\u0005>@\f\u0001\u000f/AW\u0003F3MVK\u001e.MS";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void b() {
        Log.i(z[0]);
        Log.i(z[1]);
        if (!RegisterName.h(this.i) && GoogleDriveNewUserSetupActivity.m()) {
            GoogleDriveNewUserSetupActivity.a(System.currentTimeMillis() + 604800000);
            RegisterName.a(this.i, true);
            if (!DialogToastActivity.f) {
                return;
            }
        }
        this.i.removeDialog(arj.Theme_checkedTextViewStyle);
    }

    public void c() {
        Log.i(z[2]);
        this.i.showDialog(arj.Theme_ratingBarStyle);
    }

    public void d() {
        this.i.c(true);
    }

    aig(RegisterName registerName, Activity activity) {
        this.i = registerName;
        super(activity);
    }
}
