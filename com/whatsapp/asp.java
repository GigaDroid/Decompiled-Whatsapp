package com.whatsapp;

import com.whatsapp.protocol.co;

class asp implements Runnable {
    final co a;
    final tw b;

    asp(tw twVar, co coVar) {
        this.b = twVar;
        this.a = coVar;
    }

    public void run() {
        App.a(this.a, true);
    }
}
