package com.whatsapp.util;

import android.app.Activity;
import com.whatsapp.contact.i;
import com.whatsapp.contact.o;

final class r implements Runnable {
    final Activity a;

    r(Activity activity) {
        this.a = activity;
    }

    public void run() {
        i.b(this.a, o.INTERACTIVE_DELTA);
    }
}
