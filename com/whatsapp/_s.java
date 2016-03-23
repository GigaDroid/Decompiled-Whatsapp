package com.whatsapp;

import java.util.ArrayList;

class _s implements Runnable {
    final ArrayList a;
    final es b;

    public void run() {
        if (!this.b.isCancelled()) {
            ContactInfo.a(this.b.a, this.a);
        }
    }

    _s(es esVar, ArrayList arrayList) {
        this.b = esVar;
        this.a = arrayList;
    }
}
