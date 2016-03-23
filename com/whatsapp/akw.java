package com.whatsapp;

import com.whatsapp.contact.i;
import com.whatsapp.contact.o;

class akw implements Runnable {
    final App a;
    final o b;

    akw(App app, o oVar) {
        this.a = app;
        this.b = oVar;
    }

    public void run() {
        i.b(App.z(), this.b);
    }
}
