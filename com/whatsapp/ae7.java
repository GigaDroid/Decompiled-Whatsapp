package com.whatsapp;

import java.util.ArrayList;

class ae7 implements Runnable {
    final es a;
    final ArrayList b;

    ae7(es esVar, ArrayList arrayList) {
        this.a = esVar;
        this.b = arrayList;
    }

    public void run() {
        if (!this.a.isCancelled()) {
            this.a.a.a(this.b);
        }
    }
}
