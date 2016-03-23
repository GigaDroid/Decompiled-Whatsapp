package com.whatsapp;

import java.util.ArrayList;

class rf implements Runnable {
    final ArrayList a;
    final akk b;

    rf(akk com_whatsapp_akk, ArrayList arrayList) {
        this.b = com_whatsapp_akk;
        this.a = arrayList;
    }

    public void run() {
        if (!this.b.isCancelled()) {
            this.b.a.a(this.a);
        }
    }
}
