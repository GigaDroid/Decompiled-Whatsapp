package com.whatsapp.util;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.support.v4.app.NotificationCompat.Builder;
import android.support.v4.app.NotificationManagerCompat;
import android.text.format.Formatter;
import com.whatsapp.App;
import com.whatsapp.Main;
import org.v;
import org.whispersystems.at;

public class p {
    private static final String[] z;

    static {
        String[] strArr = new String[3];
        String str = "\u0016G\t";
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
                        i3 = 115;
                        break;
                    case at.g /*1*/:
                        i3 = 53;
                        break;
                    case at.i /*2*/:
                        i3 = 123;
                        break;
                    case at.o /*3*/:
                        i3 = 97;
                        break;
                    default:
                        i3 = 90;
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
                    str = "\u0016G\t\u000e(\u0001P\u000b\u000e(\u0007P\tN>\u001aF\u0010\b5\\Q\u0012\u00121\u0000E\u001a\u0002?S";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0016G\t\u000e(\u0001P\u000b\u000e(\u0007P\tN(\u0016E\u0014\u0013.\u0016G\t\u000e(";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public static void a(Context context, String str, int i) {
        Log.i(z[1]);
        Builder builder = new Builder(context);
        builder.setCategory(z[0]);
        builder.setPriority(1);
        CharSequence string = context.getString(2131231114);
        CharSequence string2 = context.getString(2131231115);
        builder.setSmallIcon(2130839687);
        builder.setTicker(string);
        builder.setContentTitle(string2);
        builder.setContentText(str);
        if (VERSION.SDK_INT >= 21) {
            builder.setPublicVersion(builder.build());
        }
        builder.setContentIntent(PendingIntent.getActivity(context, 0, new Intent(context, Main.class), 268435456));
        NotificationManagerCompat.from(context).notify(i, builder.getNotification());
    }

    public static void a(Context context, int i) {
        long ak = App.ak();
        String str = null;
        if (ak < 10485760) {
            str = Formatter.formatFileSize(context, ak);
            Log.i(z[2] + str);
        }
        if (str != null) {
            a(context, context.getString(i) + " " + context.getString(2131231118, new Object[]{str}));
            if (Log.h == 0) {
                return;
            }
        }
        a(context, context.getString(i));
    }

    public static void a(Context context) {
        a(context, context.getString(2131231122, new Object[]{Formatter.formatFileSize(context, App.ak())}));
    }

    public static void a(Context context, String str) {
        a(context, str, 2);
    }
}
