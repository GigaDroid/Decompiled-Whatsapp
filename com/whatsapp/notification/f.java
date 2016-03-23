package com.whatsapp.notification;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import com.whatsapp.App;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

final class f implements Runnable {
    private static final String[] z;
    private final Context a;
    private final int b;

    static {
        String[] strArr = new String[4];
        String str = "l=8h\u001df=%t\bh>\"x\u001du1$uSq7;n\fo7?r\u001ah;*o\u0015n6d}\u0013s=,i\u0013t6/";
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
                        i3 = 1;
                        break;
                    case at.g /*1*/:
                        i3 = 88;
                        break;
                    case at.i /*2*/:
                        i3 = 75;
                        break;
                    case at.o /*3*/:
                        i3 = 27;
                        break;
                    default:
                        i3 = 124;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "j=2|\t`*/";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "q7<~\u000e";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "l=8h\u001df=%t\bh>\"x\u001du1$uSq7;n\fo7?r\u001ah;*o\u0015n6dy\u001db3,i\u0013t6/";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    f(Context context, int i) {
        this.a = context;
        this.b = i;
    }

    public void run() {
        KeyguardManager keyguardManager = (KeyguardManager) this.a.getSystemService(z[2]);
        PowerManager powerManager = (PowerManager) this.a.getSystemService(z[3]);
        if (!(App.ay() && !keyguardManager.inKeyguardRestrictedInputMode() && powerManager.isScreenOn())) {
            Intent intent;
            Log.i(z[1]);
            if ((keyguardManager.inKeyguardRestrictedInputMode() || !powerManager.isScreenOn()) && (this.b == 2 || this.b == 3)) {
                if (!(PopupNotification.f == null || (PopupNotification.f instanceof PopupNotificationLocked))) {
                    PopupNotification.f.finish();
                    PopupNotification.f = null;
                }
                intent = new Intent(this.a, PopupNotificationLocked.class);
            } else if (App.ay() || this.b == 3) {
                intent = null;
            } else {
                if (PopupNotification.f != null && (PopupNotification.f instanceof PopupNotificationLocked)) {
                    PopupNotification.f.finish();
                    PopupNotification.f = null;
                }
                intent = new Intent(this.a, PopupNotification.class);
            }
            if (intent != null) {
                intent.setFlags(268697600);
                this.a.startActivity(intent);
            }
            if (PopupNotification.f != null) {
                PopupNotification.f.j();
            }
            if (PopupNotification.p == 0) {
                return;
            }
        }
        if (PopupNotification.f != null && PopupNotification.f.g()) {
            Log.i(z[0]);
            PopupNotification.f.j();
        }
    }
}
