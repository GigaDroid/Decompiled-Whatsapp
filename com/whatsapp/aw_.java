package com.whatsapp;

class aw_ implements Runnable {
    final l5 a;
    final aa9 b;
    final boolean c;

    aw_(aa9 com_whatsapp_aa9, boolean z, l5 l5Var) {
        this.b = com_whatsapp_aa9;
        this.c = z;
        this.a = l5Var;
    }

    public void run() {
        if (!this.c) {
            this.a.o();
        }
        App.u(this.a.p);
    }
}
