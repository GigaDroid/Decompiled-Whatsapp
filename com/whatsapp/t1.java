package com.whatsapp;

import java.util.ArrayList;
import java.util.Collection;

class t1 implements Runnable {
    final anv a;

    t1(anv com_whatsapp_anv) {
        this.a = com_whatsapp_anv;
    }

    public void run() {
        if (this.a.m == null) {
            App.b((by) this.a.e);
        }
        if (this.a.h) {
            Collection arrayList = new ArrayList();
            arrayList.add(this.a.b);
            App.a(arrayList);
            if (!DialogToastActivity.f) {
                return;
            }
        }
        if (this.a.m == null) {
            App.a(null, App.z().getString(this.a.d ? 2131230844 : 2131232179));
        }
    }
}
