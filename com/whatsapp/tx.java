package com.whatsapp;

import android.location.LocationManager;
import org.v;
import org.whispersystems.at;

class tx implements Runnable {
    private static final String[] z;
    final LocationPicker a;

    static {
        String[] strArr = new String[3];
        String str = "Z\u0014rtkF\u001a";
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
                        i3 = 52;
                        break;
                    case at.g /*1*/:
                        i3 = 113;
                        break;
                    case at.i /*2*/:
                        i3 = 6;
                        break;
                    case at.o /*3*/:
                        i3 = 3;
                        break;
                    default:
                        i3 = 4;
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
                    str = "X\u001eebp]\u001eh";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "S\u0001u";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    tx(LocationPicker locationPicker) {
        this.a = locationPicker;
    }

    public void run() {
        LocationPicker.b(this.a, true);
        if (LocationPicker.b(this.a) != null && LocationPicker.n(this.a) == null) {
            LocationPicker.a(this.a, LocationPicker.b(this.a), Math.max((int) LocationPicker.b(this.a).getAccuracy(), 100), null, true);
        }
        if (LocationPicker.b(this.a) == null || LocationPicker.b(this.a).getAccuracy() > 200.0f) {
            LocationManager locationManager = (LocationManager) this.a.getSystemService(z[2]);
            if (!locationManager.isProviderEnabled(z[1]) || !locationManager.isProviderEnabled(z[0])) {
                this.a.showDialog(2);
            }
        }
    }
}
