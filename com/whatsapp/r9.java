package com.whatsapp;

import java.util.ArrayList;

class r9 implements Runnable {
    final j a;
    final ArrayList b;

    r9(j jVar, ArrayList arrayList) {
        this.a = jVar;
        this.b = arrayList;
    }

    public void run() {
        if (!this.a.isCancelled()) {
            this.a.a.a(this.b);
        }
    }
}
