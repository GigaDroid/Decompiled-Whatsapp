package com.whatsapp;

import java.util.HashMap;

class cc implements Runnable {
    final HashMap a;
    final azm b;

    public void run() {
        boolean z = l5.s;
        ael.f(this.b.a).a(this.b.b, this.b.c ? this.a : null);
        for (String str : this.a.keySet()) {
            ael.f(this.b.a).a(str);
            ael.e(this.b.a).b(str);
            if (z) {
                return;
            }
        }
    }

    cc(azm com_whatsapp_azm, HashMap hashMap) {
        this.b = com_whatsapp_azm;
        this.a = hashMap;
    }
}
