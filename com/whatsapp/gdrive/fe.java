package com.whatsapp.gdrive;

import com.whatsapp.App;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.arj;
import com.whatsapp.as8;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class fe implements as8 {
    private static final String[] z;
    final SettingsGoogleDrive a;

    static {
        String[] strArr = new String[4];
        String str = "(J\u0000;\u00005H\u0007b\u000e?]\u001d9\ftJ\f;\f)A\u0015#D([\u001b=\b<JY:\u0007:Y\u0015&\u0005:M\u0018*D+J\u0006\"\u0000(\\\u001d \u0007";
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
                        i3 = 91;
                        break;
                    case at.g /*1*/:
                        i3 = 47;
                        break;
                    case at.i /*2*/:
                        i3 = 116;
                        break;
                    case at.o /*3*/:
                        i3 = 79;
                        break;
                    default:
                        i3 = arj.Theme_radioButtonStyle;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "(J\u0000;\u00005H\u0007b\u000e?]\u001d9\ft]\u0011.\r4A\u00186D>W\u0000*\u001b5N\u0018b\u001a/@\u0006.\u000e>\u0002\u0006*\b?@\u001a#\u0010v_\u0011=\u00042\\\u0007&\u00065";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "(J\u0000;\u00005H\u0007b\u000e?]\u001d9\ftJ\f;\f)A\u0015#D([\u001b=\b<JY:\u0007:Y\u0015&\u0005:M\u0018*";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "(J\u0000;\u00005H\u0007b\u000e?]\u001d9\ft]\u0011.\r4A\u00186D>W\u0000*\u001b5N\u0018b\u001a/@\u0006.\u000e>\u0002\u0006*\b?@\u001a#\u0010";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void a() {
        Log.i(z[2]);
        c();
    }

    public void b(String str) {
        int i;
        Log.i(z[1]);
        SettingsGoogleDrive settingsGoogleDrive = this.a;
        if (App.V()) {
            i = 2131231723;
        } else {
            i = 2131231724;
        }
        settingsGoogleDrive.a(2131231479, i, new String[0]);
    }

    public void b() {
        Log.i(z[0]);
        c();
    }

    fe(SettingsGoogleDrive settingsGoogleDrive) {
        this.a = settingsGoogleDrive;
    }

    private void c() {
        RequestPermissionActivity.a(this.a, 2131231654, 2131231653);
    }

    public void a(String str) {
        Log.i(z[3]);
        this.a.showDialog(602);
    }
}
