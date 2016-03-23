package com.whatsapp;

import com.whatsapp.protocol.co;
import java.util.Collection;
import java.util.HashMap;

class io implements Runnable {
    final ael a;
    final Collection b;

    public void run() {
        boolean z = l5.s;
        HashMap hashMap = new HashMap();
        for (co coVar : this.b) {
            hashMap.put(coVar.k.c, Integer.valueOf(ael.a(this.a, coVar, false, false)));
            if (z) {
                break;
            }
        }
        ael.g(this.a).post(new ak3(this, hashMap));
    }

    io(ael com_whatsapp_ael, Collection collection) {
        this.a = com_whatsapp_ael;
        this.b = collection;
    }
}
