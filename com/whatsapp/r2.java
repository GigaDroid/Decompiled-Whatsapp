package com.whatsapp;

import org.whispersystems.bI;

class r2 implements Runnable {
    final qm a;
    final String b;
    final String c;

    r2(qm qmVar, String str, String str2) {
        this.a = qmVar;
        this.b = str;
        this.c = str2;
    }

    public void run() {
        awc.a(App.z()).c().b(new bI(this.c, awc.e(this.b)));
    }
}
