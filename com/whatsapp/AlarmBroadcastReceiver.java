package com.whatsapp;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.support.v4.content.WakefulBroadcastReceiver;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

public class AlarmBroadcastReceiver extends WakefulBroadcastReceiver {
    private static final String[] z;

    static {
        String[] strArr = new String[2];
        String str = "3~3\u000fcx-3\u0007Pm?:\u0017ke;k";
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
                        i3 = 8;
                        break;
                    case at.g /*1*/:
                        i3 = 94;
                        break;
                    case at.i /*2*/:
                        i3 = 86;
                        break;
                    case at.o /*3*/:
                        i3 = 99;
                        break;
                    default:
                        i3 = 2;
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
                    str = "I27\u0011oJ,9\u0002fk?%\u0017Pm=3\ntm,v\u0007k{.7\u0017a`78\u0004\"|1v\"ni,;0gz(?\u0000g3~?\rvm0\"^";
                    obj = null;
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        Intent intent2 = new Intent(intent).setClass(context, AlarmService.class);
        Log.i(z[1] + intent + z[0] + SystemClock.elapsedRealtime());
        WakefulBroadcastReceiver.startWakefulService(context, intent2);
    }
}
