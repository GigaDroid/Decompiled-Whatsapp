package com.whatsapp;

import com.whatsapp.protocol.b2;
import com.whatsapp.protocol.bb;

class v9 implements Runnable {
    final String a;
    final b2 b;
    final bb c;
    final kd d;

    v9(kd kdVar, String str, b2 b2Var, bb bbVar) {
        this.d = kdVar;
        this.a = str;
        this.b = b2Var;
        this.c = bbVar;
    }

    public void run() {
        try {
            Thread.sleep(300);
            App.b(new a3u(this, this.a, this.b.a, this.b.b, 14, this.c));
        } catch (InterruptedException e) {
        }
    }
}
