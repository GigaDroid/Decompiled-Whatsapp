package com.whatsapp;

import android.location.LocationManager;
import org.v;
import org.whispersystems.at;

class cq implements Runnable {
    private static final String[] z;
    final LocationPicker2 a;

    static {
        String[] strArr = new String[3];
        String str = "mE1";
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
                        i3 = 10;
                        break;
                    case at.g /*1*/:
                        i3 = 53;
                        break;
                    case at.i /*2*/:
                        i3 = 66;
                        break;
                    case at.o /*3*/:
                        i3 = 2;
                        break;
                    default:
                        i3 = 18;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "dP6u}x^";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "fZ!cfcZ,";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void run() {
        LocationPicker2.b(this.a, true);
        if (LocationPicker2.b(this.a) != null && LocationPicker2.r(this.a) == null) {
            LocationPicker2.a(this.a, LocationPicker2.b(this.a), Math.max((int) LocationPicker2.b(this.a).getAccuracy(), 100), null, true);
        }
        if (LocationPicker2.b(this.a) == null || LocationPicker2.b(this.a).getAccuracy() > 200.0f) {
            LocationManager locationManager = (LocationManager) this.a.getSystemService(z[1]);
            if (!locationManager.isProviderEnabled(z[0]) || !locationManager.isProviderEnabled(z[2])) {
                this.a.showDialog(2);
            }
        }
    }

    cq(LocationPicker2 locationPicker2) {
        this.a = locationPicker2;
    }
}
