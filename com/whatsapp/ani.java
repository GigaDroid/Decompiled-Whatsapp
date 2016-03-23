package com.whatsapp;

class ani implements Runnable {
    final amy a;

    ani(amy com_whatsapp_amy) {
        this.a = com_whatsapp_amy;
    }

    public void run() {
        Object obj = (!this.a.c.h() || this.a.c.o == this.a.b) ? null : 1;
        this.a.c.o();
        if (obj != null) {
            App.a(this.a.c.p, this.a.c.o, 2);
            if (!DialogToastActivity.f) {
                return;
            }
        }
        App.u(this.a.c.p);
    }
}
