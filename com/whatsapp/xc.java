package com.whatsapp;

import android.location.Location;
import java.util.Collections;

class xc implements Runnable {
    final aox a;

    public void run() {
        this.a.j = j2.a.c(aox.a(this.a));
        aox.h(this.a);
        aox.d(this.a).notifyDataSetChanged();
        Location f = this.a.f();
        if (f != null) {
            Collections.sort(this.a.j, new aeg(this, f.getLatitude(), f.getLongitude()));
        }
        this.a.a();
    }

    xc(aox com_whatsapp_aox) {
        this.a = com_whatsapp_aox;
    }
}
