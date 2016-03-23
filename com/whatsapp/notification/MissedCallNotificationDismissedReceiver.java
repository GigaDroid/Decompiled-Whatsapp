package com.whatsapp.notification;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

public class MissedCallNotificationDismissedReceiver extends BroadcastReceiver {
    private static final String z;

    static {
        char[] toCharArray = "GU\t%\u0011N_\u001b:\u0018DS\u000e?\u0012C_\u001b\"\u001dERU2\u001dYQ\u0013%\u0007\n".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 42;
                    break;
                case at.g /*1*/:
                    i2 = 60;
                    break;
                case at.i /*2*/:
                    i2 = 122;
                    break;
                case at.o /*3*/:
                    i2 = 86;
                    break;
                default:
                    i2 = 116;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onReceive(Context context, Intent intent) {
        Log.i(z);
        aw.a().b();
    }
}
