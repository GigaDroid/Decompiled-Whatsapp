package com.whatsapp;

import com.whatsapp.protocol.co;
import java.util.Comparator;

final class e1 implements Comparator {
    e1() {
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

    public int compare(Object obj, Object obj2) {
        return a((co) obj, (co) obj2);
    }
}
