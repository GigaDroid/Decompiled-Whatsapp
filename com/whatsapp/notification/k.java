package com.whatsapp.notification;

import com.whatsapp.protocol.co;
import java.util.Comparator;

class k implements Comparator {
    final c a;

    k(c cVar) {
        this.a = cVar;
    }

    public int compare(Object obj, Object obj2) {
        return a((co) obj, (co) obj2);
    }

    public int a(co coVar, co coVar2) {
        if (coVar.b == coVar2.b) {
            return 0;
        }
        if (coVar.b < coVar2.b) {
            return -1;
        }
        return 1;
    }
}
