package com.whatsapp.gdrive;

import android.app.Dialog;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class ed implements Runnable {
    private static final String[] z;
    final bx a;

    static {
        String[] strArr = new String[2];
        String str = "LG|_rQE{\u0006|[Pa]~\u0010ExX6JLi]zVNiIwZ\rxYtRR|BuX\u000f}X~M\u000f|D6YKp";
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
                        i3 = 63;
                        break;
                    case at.g /*1*/:
                        i3 = 34;
                        break;
                    case at.i /*2*/:
                        i3 = 8;
                        break;
                    case at.o /*3*/:
                        i3 = 43;
                        break;
                    default:
                        i3 = 27;
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
                    str = "LG|_rQE{\u0006|[Pa]~\u0010ExX6JLi]zVNiIwZ\u0002fD;HCq\u000boP\u0002aEhKCdG5";
                    obj = null;
            }
        }
    }

    ed(bx bxVar) {
        this.a = bxVar;
    }

    public void run() {
        Dialog a = fn.a(GooglePlayServicesUtil.isGooglePlayServicesAvailable(this.a.a), this.a.a, 0, new ag(this), true);
        if (a != null) {
            if (!fn.a(this.a.a)) {
                Log.i(z[0]);
                this.a.b.dismissAllowingStateLoss();
                a.show();
                if (!GoogleDriveService.c) {
                    return;
                }
            }
            return;
        }
        Log.e(z[1]);
        SettingsGoogleDrive.t(this.a.a).open();
    }
}
