package com.whatsapp.gdrive;

import android.app.Dialog;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class bu implements Runnable {
    private static final String[] z;
    final dn a;

    static {
        String[] strArr = new String[2];
        String str = "i4RA{k}AKyg&I\\t!7P[ {>A^lg<AJak\u007fPZbc TAci}U[h|}TG h9X";
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
                        i3 = 14;
                        break;
                    case at.g /*1*/:
                        i3 = 80;
                        break;
                    case at.i /*2*/:
                        i3 = 32;
                        break;
                    case at.o /*3*/:
                        i3 = 40;
                        break;
                    default:
                        i3 = 13;
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
                    str = "i4RA{k}AKyg&I\\t!7P[ {>A^lg<AJakpNG-y1Y\byapIF~z1LD#";
                    obj = null;
            }
        }
    }

    public void run() {
        Dialog a = fn.a(GooglePlayServicesUtil.isGooglePlayServicesAvailable(this.a.b), this.a.b, 0, new c_(this), true);
        if (a != null) {
            if (!fn.a(this.a.b)) {
                Log.i(z[0]);
                a.show();
                if (!GoogleDriveService.c) {
                    return;
                }
            }
            return;
        }
        Log.e(z[1]);
    }

    bu(dn dnVar) {
        this.a = dnVar;
    }
}
