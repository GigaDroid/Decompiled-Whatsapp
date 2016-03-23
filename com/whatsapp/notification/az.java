package com.whatsapp.notification;

import android.support.v4.app.NotificationManagerCompat;
import com.whatsapp.App;

class az implements Runnable {
    final ao a;

    az(ao aoVar) {
        this.a = aoVar;
    }

    public void run() {
        NotificationManagerCompat.from(App.z()).cancel(1);
    }
}
