package com.whatsapp;

class rg implements Runnable {
    final sk a;

    public void run() {
        boolean h = this.a.b.h();
        this.a.b.o();
        if (h) {
            App.a(this.a.b.p, this.a.b.o, 2);
            if (!DialogToastActivity.f) {
                return;
            }
        }
        App.u(this.a.b.p);
    }

    rg(sk skVar) {
        this.a = skVar;
    }
}
