package com.whatsapp.gallerypicker;

import java.util.Comparator;

class d implements Comparator {
    private d() {
    }

    d(bl blVar) {
        this();
    }

    public int a(aa aaVar, aa aaVar2) {
        if (aaVar.c != aaVar2.c) {
            return aaVar.c < aaVar2.c ? 1 : -1;
        } else {
            return aaVar.b - aaVar2.b;
        }
    }

    public int compare(Object obj, Object obj2) {
        return a((aa) obj, (aa) obj2);
    }
}
