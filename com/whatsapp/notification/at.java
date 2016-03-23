package com.whatsapp.notification;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat.Builder;
import android.support.v4.app.NotificationManagerCompat;
import com.whatsapp.Main;
import com.whatsapp.WAAppCompatActivity;

public class at {
    private static Boolean a;

    public static void a(Context context) {
        int i = PopupNotification.p;
        CharSequence string = context.getString(2131231461);
        CharSequence string2 = context.getString(2131231460);
        Builder builder = new Builder(context);
        builder.setSmallIcon(2130839686);
        builder.setTicker(string);
        builder.setWhen(System.currentTimeMillis());
        builder.setDefaults(3);
        builder.setAutoCancel(true);
        PendingIntent activity = PendingIntent.getActivity(context, 0, new Intent(context, Main.e()), 268435456);
        builder.setContentTitle(string);
        builder.setContentText(string2);
        builder.setContentIntent(activity);
        NotificationManagerCompat.from(context).notify(9, builder.build());
        a = Boolean.TRUE;
        if (WAAppCompatActivity.c != 0) {
            PopupNotification.p = i + 1;
        }
    }

    public static void b(Context context) {
        if (!Boolean.FALSE.equals(a)) {
            a = Boolean.FALSE;
            NotificationManagerCompat.from(context).cancel(9);
        }
    }
}
