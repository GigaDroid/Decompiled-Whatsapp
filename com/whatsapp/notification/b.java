package com.whatsapp.notification;

import com.whatsapp.App;
import com.whatsapp.l5;

class b implements Runnable {
    final l5 a;
    final AndroidWear b;
    final String c;

    b(AndroidWear androidWear, l5 l5Var, String str) {
        this.b = androidWear;
        this.a = l5Var;
        this.c = str;
    }

    public void run() {
        App.a(this.a, this.c);
        App.a(this.a, false, true);
        App.b(false, true, true, true);
    }
}
