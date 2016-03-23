package com.whatsapp;

import android.support.v4.util.ArrayMap;
import com.whatsapp.protocol.ct;
import java.util.Map;
import java.util.Vector;

class pb implements Runnable {
    final ct a;
    final adn b;
    final Vector c;

    pb(adn com_whatsapp_adn, ct ctVar, Vector vector) {
        this.b = com_whatsapp_adn;
        this.a = ctVar;
        this.c = vector;
    }

    public void run() {
        Map arrayMap = new ArrayMap(1);
        arrayMap.put(this.a.e, this.c);
        App.as.a(arrayMap);
        App.p.M().post(new n9(this));
    }
}
