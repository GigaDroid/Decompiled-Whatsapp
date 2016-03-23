package com.whatsapp;

class a_r implements Runnable {
    final aqq a;
    final boolean b;
    final boolean c;

    a_r(aqq com_whatsapp_aqq, boolean z, boolean z2) {
        this.a = com_whatsapp_aqq;
        this.c = z;
        this.b = z2;
    }

    public void run() {
        aqq.b(this.a).runOnUiThread(new a3a(this));
    }
}
