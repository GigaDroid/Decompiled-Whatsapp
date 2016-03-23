package com.whatsapp.notification;

import com.whatsapp.App;
import com.whatsapp.l5;

class w implements Runnable {
    final AndroidWear a;
    final l5 b;

    w(AndroidWear androidWear, l5 l5Var) {
        this.a = androidWear;
        this.b = l5Var;
    }

    public void run() {
        App.a(this.b, false, true);
        App.b(false, true, true, true);
    }
}
