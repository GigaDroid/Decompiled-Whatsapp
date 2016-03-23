package com.whatsapp.notification;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.App;
import com.whatsapp.util.Log;
import com.whatsapp.wn;
import org.v;
import org.whispersystems.at;

public class MessageNotificationDismissedReceiver extends BroadcastReceiver {
    private static final String[] z;

    static {
        String[] strArr = new String[4];
        String str = "oUJb\fd[S?\u001a|Jx<\ti\\B>\u001ebYB?";
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
                        i3 = 12;
                        break;
                    case at.g /*1*/:
                        i3 = 58;
                        break;
                    case at.i /*2*/:
                        i3 = 39;
                        break;
                    case at.o /*3*/:
                        i3 = 76;
                        break;
                    default:
                        i3 = 123;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "bUS%\u001deYF8\u0012cT\b(\u0012\u007fWN?\b,";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "bUS%\u001deYF8\u0012cTx$\u001a\u007fR";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "bUS%\u001deYF8\u0012cTx$\u001a\u007fR";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra(z[3]);
        App.z().getSharedPreferences(z[0], 0).edit().putString(z[1], stringExtra).commit();
        Log.i(z[2] + stringExtra);
        wn.D();
    }
}
