package com.whatsapp.appwidget;

import com.whatsapp.protocol.co;
import java.util.Comparator;

class d implements Comparator {
    final h a;

    public int compare(Object obj, Object obj2) {
        return a((co) obj, (co) obj2);
    }

    public int a(co coVar, co coVar2) {
        if (coVar.b == coVar2.b) {
            return 0;
        }
        if (coVar.b < coVar2.b) {
            return 1;
        }
        return -1;
    }

    d(h hVar) {
        this.a = hVar;
    }
}
