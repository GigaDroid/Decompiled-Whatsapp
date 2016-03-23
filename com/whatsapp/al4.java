package com.whatsapp;

import com.whatsapp.protocol.co;
import java.util.Comparator;

class al4 implements Comparator {
    final hy a;

    al4(hy hyVar) {
        this.a = hyVar;
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

    public int compare(Object obj, Object obj2) {
        return a((co) obj, (co) obj2);
    }
}
