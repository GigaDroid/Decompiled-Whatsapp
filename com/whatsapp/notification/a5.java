package com.whatsapp.notification;

import android.support.v4.app.NotificationManagerCompat;
import com.whatsapp.App;

class a5 implements Runnable {
    final ao a;
    final String b;

    public void run() {
        NotificationManagerCompat.from(App.z()).cancel(this.b, 1);
    }

    a5(ao aoVar, String str) {
        this.a = aoVar;
        this.b = str;
    }
}
