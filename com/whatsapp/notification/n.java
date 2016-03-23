package com.whatsapp.notification;

import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class n implements Runnable {
    private static final String[] z;
    final PopupNotification a;

    static {
        String[] strArr = new String[3];
        String str = "i\u0019,_Hw\u0019(C^p\u0015=^Qv\u0018sZJv\u000e5GQm\u000ff";
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
                        i3 = 25;
                        break;
                    case at.g /*1*/:
                        i3 = 118;
                        break;
                    case at.i /*2*/:
                        i3 = 92;
                        break;
                    case at.o /*3*/:
                        i3 = 42;
                        break;
                    default:
                        i3 = 56;
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
                    str = "i\u0019,_Hw\u0019(C^p\u0015=^Qv\u0018sDW9\u0006.E@p\u001b5^A9\u00059DKv\u0004";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "9\u001b=R\u0002";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void run() {
        if (PopupNotification.t(this.a) != null) {
            PopupNotification.u(this.a).unregisterListener(PopupNotification.t(this.a));
        }
        PopupNotification.a(this.a, null);
        if (PopupNotification.d(this.a) != null) {
            Log.i(z[0] + PopupNotification.i(this.a) + z[1] + PopupNotification.d(this.a).getMaximumRange());
            if (PopupNotification.i(this.a) >= 5.0f || PopupNotification.i(this.a) == PopupNotification.d(this.a).getMaximumRange()) {
                PopupNotification.b(this.a);
                if (PopupNotification.p == 0) {
                    return;
                }
            }
            return;
        }
        Log.i(z[2]);
        PopupNotification.b(this.a);
    }

    n(PopupNotification popupNotification) {
        this.a = popupNotification;
    }
}
