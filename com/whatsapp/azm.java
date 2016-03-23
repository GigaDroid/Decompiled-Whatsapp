package com.whatsapp;

import com.whatsapp.protocol.co;
import java.util.Collection;
import java.util.HashMap;

class azm implements Runnable {
    final ael a;
    final Collection b;
    final boolean c;
    final boolean d;

    public void run() {
        boolean z = l5.s;
        HashMap hashMap = new HashMap();
        for (co coVar : this.b) {
            hashMap.put(coVar.k.c, Integer.valueOf(ael.a(this.a, coVar, this.d, this.c)));
            if (z) {
                break;
            }
        }
        ael.g(this.a).post(new cc(this, hashMap));
    }

    azm(ael com_whatsapp_ael, Collection collection, boolean z, boolean z2) {
        this.a = com_whatsapp_ael;
        this.b = collection;
        this.d = z;
        this.c = z2;
    }
}
