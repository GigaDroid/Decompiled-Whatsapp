package com.whatsapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

final class a90 implements Runnable {
    final boolean a;
    final String b;

    public void run() {
        List arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        App.as.a((ArrayList) arrayList2);
        Collection f = App.as.f();
        f.removeAll(arrayList2);
        arrayList2.addAll(f);
        App.as.e((ArrayList) arrayList2);
        App.a(this.b, App.b(arrayList2, arrayList, true), this.a ? 8 : 2, this.a, Integer.toString(App.as.b()) + App.aK.B());
    }

    a90(String str, boolean z) {
        this.b = str;
        this.a = z;
    }
}
