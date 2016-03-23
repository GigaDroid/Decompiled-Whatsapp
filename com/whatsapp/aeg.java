package com.whatsapp;

import com.whatsapp.protocol.cx;
import java.util.Comparator;

class aeg implements Comparator {
    final xc a;
    final double b;
    final double c;

    public int a(cx cxVar, cx cxVar2) {
        return Double.compare(((cxVar.a - this.c) * (cxVar.a - this.c)) + ((cxVar.b - this.b) * (cxVar.b - this.b)), ((cxVar2.a - this.c) * (cxVar2.a - this.c)) + ((cxVar2.b - this.b) * (cxVar2.b - this.b)));
    }

    public int compare(Object obj, Object obj2) {
        return a((cx) obj, (cx) obj2);
    }

    aeg(xc xcVar, double d, double d2) {
        this.a = xcVar;
        this.c = d;
        this.b = d2;
    }
}
