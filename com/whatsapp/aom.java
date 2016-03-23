package com.whatsapp;

import java.util.List;

class aom implements Runnable {
    final es a;
    final List b;

    aom(es esVar, List list) {
        this.a = esVar;
        this.b = list;
    }

    public void run() {
        if (!this.a.isCancelled()) {
            ContactInfo.a(this.a.a, this.b);
        }
    }
}
