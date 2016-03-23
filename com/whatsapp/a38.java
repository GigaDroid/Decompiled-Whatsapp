package com.whatsapp;

import android.backport.util.Base64;
import java.util.concurrent.Callable;

class a38 implements Callable {
    final aw5 a;
    final sx b;

    a38(sx sxVar, aw5 com_whatsapp_aw5) {
        this.b = sxVar;
        this.a = com_whatsapp_aw5;
    }

    public Object call() {
        return a();
    }

    public String a() {
        return Base64.encodeToString(this.a.a(), 2);
    }
}
