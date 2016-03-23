package com.whatsapp;

import com.whatsapp.protocol.co;
import java.util.Comparator;

class ao implements Comparator {
    final ael a;

    ao(ael com_whatsapp_ael) {
        this.a = com_whatsapp_ael;
    }

    public int compare(Object obj, Object obj2) {
        return a((co) obj, (co) obj2);
    }

    public int a(co coVar, co coVar2) {
        if (coVar.b < coVar2.b) {
            return -1;
        }
        return coVar.b == coVar2.b ? 0 : 1;
    }
}
