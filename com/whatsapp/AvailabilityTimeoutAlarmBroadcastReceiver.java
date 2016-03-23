package com.whatsapp;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import android.os.SystemClock;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

final class AvailabilityTimeoutAlarmBroadcastReceiver extends BroadcastReceiver {
    private static final String[] z;

    static {
        String[] strArr = new String[7];
        String str = "B[y#oQNziq@Nhz~JGhnsF\u0004}erFD|x";
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
                        i3 = 35;
                        break;
                    case at.g /*1*/:
                        i3 = 43;
                        break;
                    case at.i /*2*/:
                        i3 = 9;
                        break;
                    case at.o /*3*/:
                        i3 = 12;
                        break;
                    default:
                        i3 = 31;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "BGh~r";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "@Dd\"hKJ}\u007f~S[";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "@Dd\"hKJ}\u007f~S['msBYd\"^uj@@^agLSKjfLCJw";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "@Dd\"hKJ}\u007f~S['msBYd\"^uj@@^agLSKjfLCJw";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "@Dd\"hKJ}\u007f~S['|zQF`\u007flJDg\"]qdHH\\bx]";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "BGh~r";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        Log.i(z[0]);
        if (App.h != 1) {
            App.h = 3;
            App.a5();
        }
    }

    AvailabilityTimeoutAlarmBroadcastReceiver() {
    }

    private Intent a() {
        return new Intent(z[4]).setPackage(z[3]);
    }

    public void c(Context context) {
        context.registerReceiver(this, new IntentFilter(z[5]), z[6], null);
    }

    void a(Context context) {
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, a(), 536870912);
        if (broadcast != null) {
            ((AlarmManager) context.getSystemService(z[2])).cancel(broadcast);
        }
    }

    void b(Context context) {
        boolean z = DialogToastActivity.f;
        long elapsedRealtime = SystemClock.elapsedRealtime() + 15000;
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, a(), 0);
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(z[1]);
        if (VERSION.SDK_INT >= 23) {
            alarmManager.setExactAndAllowWhileIdle(2, elapsedRealtime, broadcast);
            if (!z) {
                return;
            }
        }
        if (VERSION.SDK_INT >= 19) {
            alarmManager.setExact(2, elapsedRealtime, broadcast);
            if (!z) {
                return;
            }
        }
        alarmManager.set(2, elapsedRealtime, broadcast);
    }
}
